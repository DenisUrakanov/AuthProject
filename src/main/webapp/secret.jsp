<%--
  Created by IntelliJ IDEA.
  User: s_user05
  Date: 07.08.2018
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Secret Info</title>
</head>
<body>

    <%
        response.getWriter().print("Welcome " + session.getAttribute("user"));
    %>
    For only auth users.
    <br>
<form method="get" action="logout">
    <input type="submit" value="logout">
</form>
</body>
</html>
