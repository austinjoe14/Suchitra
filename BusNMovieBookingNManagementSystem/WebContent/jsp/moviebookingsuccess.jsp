<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="moviebookingandmanagementsystem">
<h3 id="idformoviebookingsuccessemsg">Your booking is successful..Your reservation number is  <%=request.getAttribute("resevationid")%></h3>
<jsp:include page="moviebooking.jsp"></jsp:include>
</body>
</html>