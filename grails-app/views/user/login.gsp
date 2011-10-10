

<%@ page import="org.scheduledoc.User" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
        <title>Login</title>
    </head>
    <body>
        <div class="body">
            <h1>Login</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${userInstance}">
            <div class="errors">
                <g:renderErrors bean="${userInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="authenticate" >
                <div class="dialog">
                    				<div>
                                    <label for="login"><g:message code="user.login.label" default="Login" /></label>
                                    </div>
                                    <div>
                                    <g:textField name="login" value="${userInstance?.login}" />
                                    </div>
                                    <div>
                                    <label for="password"><g:message code="user.password.label" default="Password" /></label>
                                    </div>
                                    <div>
                                    <g:passwordField name="password" value="${userInstance?.password}" />
                    </div>
                         
            <input type="submit" value="Login" />
                                    </div>
               
            </g:form>
        </div>
    </body>
</html>
