<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML >
<html>
<head>
<title>显示页面</title>
</head>
<body>
    <%
      Map attributes=(Map)request.getAttribute("attributes");
     %>
    <table border="1" >
        <tr>
            <td>用户名:</td>
            <td><%=attributes.get("cn")%></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><%=attributes.get("displayName")%></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><%=attributes.get("mobile")%></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><%=attributes.get("email")%></td>
        </tr>
        <tr>
            <td>公司:</td>
            <td><%=attributes.get("company")%></td>
        </tr>
    </table>
    
    <a href="logout" >退出登录</a>
</body>
</html>
