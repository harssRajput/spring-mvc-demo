<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

	First Name: <form:input path="firstName"/>
	<br><br>
	
	Second Name: <form:input path="lastName"/>
	<br><br>
	
	<input type="submit" value="Submit"/>

</form:form>

</body>
</html>