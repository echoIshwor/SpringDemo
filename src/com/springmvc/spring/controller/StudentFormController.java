package com.springmvc.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentFormController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		return new ModelAndView("AdmissionForm");
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> map) {
		// @RequestParam(value ="studentName", defaultValue="Mr. Ishwor") String
		// name
		String studentName = map.get("studentName");
		String studentHobby = map.get("studentHobby");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "your name :" + studentName + " and you have a hobby: " + studentHobby);
		modelAndView.setViewName("AdmissionSuccess");
		return modelAndView;
	}

	@RequestMapping(value = "/studentAdmissionForm.html", method = RequestMethod.GET)
	public ModelAndView getStudentAdmissionForm() {
		return new ModelAndView("StudentAdmissionForm");
	}

	/*
	 * using @RequestParam.
	 * 
	 * @RequestMapping(value = "/submitStudentAdmissionForm.html", method =
	 * RequestMethod.POST) public ModelAndView submitStudentAdmissionForm(
	 * 
	 * @RequestParam(value = "studName", defaultValue = "MR.Student") String
	 * StudentName,
	 * 
	 * @RequestParam(value = "studHobby", defaultValue = "Guitar") String
	 * StudentHobby) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView(); //
	 * modelAndView.addObject("HeaderMessage", "Welcome to engineering World.");
	 * modelAndView.addObject("name", StudentName);
	 * modelAndView.addObject("hobby", StudentHobby);
	 * modelAndView.setViewName("StudentAdmissionSuccess"); return modelAndView;
	 * }
	 */

	// using @ModelAttribute.
	@RequestMapping(value = "/submitStudentAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitStudentAdmissionForm(@ModelAttribute("student1") Student student) {

		ModelAndView modelAndView = new ModelAndView();
		// modelAndView.addObject("HeaderMessage", "Welcome to engineering
		// World.");
		modelAndView.setViewName("StudentAdmissionSuccess");
		return modelAndView;
	}

	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("HeaderMessage", "Welcome To Engineering World");
	}

}
