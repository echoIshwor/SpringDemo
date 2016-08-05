package com.springmvc.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView display() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello world!!");
		return model;
	}

	@RequestMapping(value = "/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> map) {
		ModelAndView modelAndView = new ModelAndView();

		String countryName = map.get("countryName");
		String userName = map.get("userName");
		modelAndView.addObject("msg", "hello " + userName + ". You are from " + countryName);
		modelAndView.setViewName("HelloPage");

		return modelAndView;
	}
}
