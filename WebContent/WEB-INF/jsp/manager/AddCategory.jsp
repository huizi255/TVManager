<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	$("#addCategoryForm").off();
	  $("#addCategoryForm").on("submit",function(){
		 $("#addCategoryForm").ajaxSubmit(function(){
			 $("#addCategoryForm input").not(":submit").val("");
			 alert("添加成功")
		 });
		 return false;
	  });
 });
</script>
<h1>添加栏目</h1>
<hr>
<form action="AddCategory.action" method="post" id="addCategoryForm">
       栏目名称：<input type="text" name="name"><br>
       栏目编号：<input type="text" name="code"><br>
       <input type="submit" value="添加"/>
</form>