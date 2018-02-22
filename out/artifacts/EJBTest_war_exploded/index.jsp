<%--
  Created by IntelliJ IDEA.
  User: flori
  Date: 21.02.2018
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="POST">
    <input type="text" name="eins" placeholder="eins" value="${eins}"/>
    <input type="text" name="zwei" placeholder="zwei" value="${zwei}"/>
    <button type="submit">Abschicken</button>
  </form>
  <p>${sum}</p>
  </body>
</html>
