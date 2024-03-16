<%-- 
    Document   : profile
    Created on : Mar 16, 2024, 6:05:57 PM
    Author     : ASUS
--%>

<%@page import="com.tech.blog.entities.User"%>
<%@page errorPage="error_page.jsp" %>
<%
    User user=(User)session.getAttribute("currentUser"); 
if(user==null){
     response.sendRedirect("Login.jsp"); 
     
    } 


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile</title>
    </head>
    <body>
        <%=user.getName() %>
        <br>
        <%=user.getEmail() %> 
        <br>
        <%=user.getAbout()%>
        
    </body>
</html>
