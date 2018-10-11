<%--
  Created by IntelliJ IDEA.
  User: 威威
  Date: 2018/10/11
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>something is me springmvc</h1>
    <br>
    <hr>
 a = ${a} ---- b = ${b}

    <br>
    <hr>
    <form action="hello10" method="post">
        <input name="phone.num" value="1391111" />
        <%--<input name="phones[1].num" value="1890000" />
        <br>
        <input name="map['1'].num" value="123456" />
        <input name="map['2'].num" value="4576" />
        <input name="map['3'].num" value="4576" />--%>
        <button type="submit"> 提交</button>
    </form>
</body>
</html>
