<%@ page language="java" import="java.util.*"  contentType="text/html;charset=gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="tb" scope="page" class="com.bean.HzpBean" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dir=sn.getDir();
%>
<HTML><HEAD><TITLE>��̨������</TITLE>
<LINK href="<%=basePath %><%=dir %>/images/Admin_Style.css" type=text/css rel=stylesheet>
<LINK href="<%=basePath %><%=dir %>/images/style.css" type=text/css rel=stylesheet>
<SCRIPT language=JavaScript src="<%=basePath %><%=dir %>/images/Common.js"></SCRIPT>
<STYLE type=text/css>
BODY {
	MARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff
}
.STYLE1 {color: #ECE9D8}
</STYLE>
</HEAD>
<script type="text/javascript">
function f1()
{
 	if(document.form1.num.value=="")
 	{
 		alert("����д����������");
 		document.form1.num.focus();
 		return false;
 	}
 	if(isNaN(document.form1.num.value))
 	{
 		alert("����ֻ��Ϊ���֣�");
 		document.form1.num.focus();
 		return false;
 	}
 	
 form1.submit();
}
</script>
<%
String message = (String)request.getAttribute("message");
	if(message == null){
		message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message");
%>
<%
	String member=(String)session.getAttribute("member");
	if(member==null){
		response.sendRedirect(path+"/error.jsp");
	}
	else{
		String id=request.getParameter("id").trim();
		String num=request.getParameter("num").trim();
		String sid=request.getParameter("sid").trim();String snum=request.getParameter("snum").trim();
%>
<BODY><br><br><br><br><br>
<TABLE  cellSpacing=0 cellPadding=0 width="100%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top >
<form action="<%=basePath %>HzpAction.do?method=upprep&id=<%=id%>&sid=<%=sid%>&snum=<%=snum%>" method="post" name="form1" >
         <TABLE   cellSpacing=0 cellPadding=0 width="100%" border=0>
         <TBODY>
        <TR>
          <TD width=40% align=right>�����ţ�</TD><TD align=left><%=id %></TD>
		</TR>
		<TR>
          <TD  align=right>Ԥ��������</TD><TD align=left><input type=text name=num size=30  value=<%=num %>></TD>
		</TR>
		
		<TR>
          <TD  align=center colspan=2><input type=button onclick="f1()" value="�޸�����"></TD>
		</TR>
				</TBODY>
			</TABLE>
			</form>		
	</td>
	</tr>
  </TBODY>
</TABLE>
</BODY>
<%} %>
</HTML>
