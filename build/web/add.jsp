<%-- 
    Document   : add
    Created on : Mar 1, 2024, 9:50:29 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP addition Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>`
         <h1 style="color:red;font-size:46px;">Hello World!</h1>
        <p>here is your output</p>
        <%
            Integer num1 = (Integer) request.getAttribute("num1");
            Integer num2 = (Integer) request.getAttribute("num2");
            Integer sum = (Integer) request.getAttribute("sum");
        
        %>
        <P>
           your first number is <span style="color: red"><b><%=num1%></b></span> <br>and your second number is <span style="color: blue"><b><%=num2%></b></span> <br>
           so the you final answer is <span style="color: palegreen"><b><%=sum%></b></span>
            
        </P>
    </body>
</html>
