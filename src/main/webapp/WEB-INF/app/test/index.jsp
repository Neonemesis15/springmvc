<%-- 
    Document   : index
    Created on : 06/09/2014, 12:02:50 PM
    Author     : SABADO-MANHANA
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
    </head>
    <body>
        <h1>${titulo}</h1>
        <p>${contenido}</p>
        <p>${programa.descripcion}</p>
        <c:forEach var="i" items="${nombres}">
            <c:out value="${i}"/><p>
        </c:forEach>
    </body>
</html>
