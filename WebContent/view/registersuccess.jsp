<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Success</title>
</head>
<body>
<h1>${customer.name} registered successfully.</h1>
	<ul>
		<li>Id: ${customer.id}</li>
		<li>Password: ${customer.password}</li>
		<li>Gender: ${customer.gender}</li>
		<li>Name: ${customer.name}</li>
		<li>Email: ${customer.email}</li>
	</ul>

</body>
</html>