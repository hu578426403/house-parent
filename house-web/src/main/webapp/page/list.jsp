<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2019/11/1
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="../static/jquery-1.8.3.js"></script>
    <script>
        $(function () {
            $.post(
                "getAllHouse.do",
                null,
                function (data) {
                    var str = "";
                    $.each(data,function (i, e) {
                        str += "<tr><td>"+e.id+"</td><td>"+e.title+"</td><td>"+e.description+"</td><td>"+e.price+"</td><td>"+e.pubdate+"</td><td>"+e.floorage+"</td><td>"+e.contact+"</td><td><img src='http://localhost:81/"+e.path+"' alt='' height='100px' width='130px'></td><td><a href='javascript:toDel(this.innerHtml)'>删除</a> | <a href='javascript:toDel("+e.id+")'>修改</a></td></tr>"
                    })
                    /*放到tbody中*/
                    $("tbody").append($(str));
                },"json"
            )
        })
    </script>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <caption><h2>房屋信息</h2></caption>
        <thead>
            <tr>
                <td>编号</td>
                <td>标题</td>
                <td>描述</td>
                <td>价格</td>
                <td>日期</td>
                <td>面积</td>
                <td>联系电话</td>
                <td>图片</td>
                <td>操作</td>
            </tr>
        </thead>
        <tbody></tbody>
    </table>
</body>
<script>
    /*删除*/
    function toDel(obj) {
        if (window.confirm("您确定要删除吗？")) {
            /*$.post(
                "delHouseById.do",
                {"id":id},
                function (data) {
                    if (data.result == 1) {
                        alert("删除成功");
                        //移除该行
                        alert(obj)
                    } else {
                        alert("删除失败");
                    }
                },"json"
            )*/
            alert()
        }
    }
</script>
</html>
