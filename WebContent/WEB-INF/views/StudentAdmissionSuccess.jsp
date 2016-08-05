<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission success</title>
</head>
<body>
	<h1>${HeaderMessage}</h1>
	<p>College has successfully processed your Form.Congratulations!!</p>
	<p>Details submitted by you:</p>

	<!-- Using- @Requestparam -->
	<%-- <p>Name:${name}</p>
	<p>Hobby:${hobby}</p> --%>

	<!-- Using- @ModelAttribute -->
	<p>Student's Name: ${student1.studentName}</p>
	<p>Student's Hobby: ${student1.studentHobby}</p>

</body>
</html>