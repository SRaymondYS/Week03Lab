<%-- 
    Document   : editnote
    Created on : Sep 20, 2019, 2:14:18 PM
    Author     : 794471
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>   
        <h2>Edit Note</h2> 
        <form action="note" method="post">
            Title: <input type="text" name="editTitle" value="${note.title}">
            <br>
            Content: <textarea rows="6" name="editContent" >${note.content}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
