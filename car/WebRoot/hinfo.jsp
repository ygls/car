<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312" %>
<%@ include file="iframe/head.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<LINK href="images/default.css" type=text/css rel=stylesheet>
<LINK href="images/css.css" type=text/css rel=stylesheet>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<STYLE type=text/css>
.ycbt {
	BORDER-RIGHT: #fff 1px solid; BORDER-TOP: #fff 1px solid; PADDING-LEFT: 1.8em; BACKGROUND-COLOR: #EAF2EF; BORDER-LEFT: #fff 1px solid; PADDING-TOP: 7px; BORDER-BOTTOM: #fff 1px solid; HEIGHT: 20px
}
.xsbt {
	BORDER-RIGHT: #fff 1px solid; BORDER-TOP: #fff 1px solid; PADDING-LEFT: 1.8em; BACKGROUND-IMAGE: url(images/head1.gif); BORDER-LEFT: #fff 1px solid; PADDING-TOP: 7px; BORDER-BOTTOM: #fff 1px solid; HEIGHT: 20px
}
.xsnr {
	DISPLAY: block
}
.ycnr {
	DISPLAY: none
}
</STYLE>
<SCRIPT type=text/javascript>
function tb_xs(t,m,n){
for(var i=1;i<=m;i++){
if (i != n){
document.getElementById("tb"+t+ "_bt" + i).className= "ycbt";
document.getElementById("tb"+t+ "_nr" + i).className= "ycnr";}
else{
document.getElementById("tb"+t+ "_bt" + i).className= "xsbt";
document.getElementById("tb"+t+ "_nr" + i).className= "xsnr";}}}
</SCRIPT>
<SCRIPT language=JavaScript>
<!--//���γ������
function killErr(){
	return true;
}
window.onerror=killErr;
//-->
</SCRIPT>
<SCRIPT language=JavaScript>
<!--//��������һ������С����
function autoTable(div){
	fs=document.getElementById(div).getElementsByTagName("TABLE");
	for(var i=0;i<fs.length;i++){
		fs[i].style.width='49.5%';
		if(i%2==1){
			if (document.all) {
				fs[i].style.styleFloat="right";
			}else{
				fs[i].style.cssFloat="right;";
			}
		}else{
			if (document.all) {
				fs[i].style.styleFloat="left";
			}else{
				fs[i].style.cssFloat="left;";
			}
		}
	}
}
//-->
</SCRIPT>
<SCRIPT language=JavaScript src="images/inc.js"></SCRIPT>
<SCRIPT language=JavaScript src="images/default.js"></SCRIPT>
<SCRIPT language=JavaScript src="images/swfobject.js"></SCRIPT>
<META content="MSHTML 6.00.2900.3268" name=GENERATOR>
</HEAD>
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
<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=0>
<SCRIPT language=JavaScript>
<!--//Ŀ����Ϊ������񷽱�
document.write('<div class="wrap">');
//-->
</SCRIPT>
     <TABLE class=dragTable cellSpacing=0 cellPadding=0 width="100%" border=0>
		<TBODY>
        <TR>
          <TD class=head colspan="2">
			<SPAN class=TAG>���ֳ���Ϣ</SPAN> 
			
		  </TD>
		</TR>
		<TR>
		<TD  class=middle align="left" >
               <TABLE class=xsnr id=tb1_nr1  cellSpacing=0 cellPadding=0 width="100%" border=0>
                    <TBODY>
                    <%
                    String id=request.getParameter("id");
                    if(id==null)id=(String)request.getAttribute("id");
                    List hotlist=tb.getOneTrave(Integer.parseInt(id));
                    if(!hotlist.isEmpty()){
                    int aaa=Integer.parseInt(hotlist.get(13).toString());
                    int bbb=Integer.parseInt(hotlist.get(14).toString());
                    int ccc=Integer.parseInt(hotlist.get(15).toString());
                    int sum=aaa+bbb+ccc;
                    float shu1 = (float)aaa/sum*100; 
                    float shu2 = (float)bbb/sum*100; 
                    float shu3 = (float)ccc/sum*100; 
         			%>
        <TR>
          <TD width=40% align=center>
		  <IMG height=150 src="<%=basePath+hotlist.get(3).toString()%>" width=180 onload=makesmallpic(this,180,150); border=0>
		   </TD>
		  <TD align=left><br>
		  ��Ϣ���⣺<%=hotlist.get(1).toString()%>  &nbsp;&nbsp;&nbsp;�������ࣺ<%=hotlist.get(2).toString()%><br>
		  �����̣�<%=hotlist.get(4).toString()%>  &nbsp;&nbsp;&nbsp;�¾ɳ̶ȣ�<%=hotlist.get(5).toString()%><br>
		  ��Ա�۸�<%=hotlist.get(6).toString()%>  Ԫ&nbsp;VIP�۸�<%=hotlist.get(7).toString()%>  Ԫ &nbsp;&nbsp;&nbsp;
		  ������֣�<%=hotlist.get(11).toString()%> &nbsp;&nbsp;&nbsp;ʣ��������<%=Integer.parseInt( hotlist.get(12).toString())-tb.getLast(hotlist.get(0).toString()) %><br>
		  ����ʱ�䣺<%=hotlist.get(9).toString()%>  &nbsp;&nbsp;&nbsp;�Ƽ����ͣ�<%=hotlist.get(10).toString()%><br>
		  <a href="<%=basePath%>prepinfo.jsp?id=<%=id%>&title=<%=hotlist.get(1).toString()%>&sl=<%=Integer.parseInt( hotlist.get(12).toString())-tb.getLast(hotlist.get(0).toString())%>">���빺�ﳵ</a> ���������û�е�¼�����ȵ�¼�ٽ���Ԥ����������
		  <br>
		  <form name=dp method="post" action="<%=basePath%>ComServlet?method=dp&sid=<%=id%>">
		  <input type=radio name=dp value="aaa" checked> �� <%=aaa %>Ʊ <%=new java.text.DecimalFormat("#.0").format(shu1)%>%
		  <input type=radio name=dp value="bbb"> һ�� <%=bbb %>Ʊ <%=new java.text.DecimalFormat("#.0").format(shu2)%>% 
		  <input type=radio name=dp value="ccc"> �� <%=ccc %>Ʊ <%=new java.text.DecimalFormat("#.0").format(shu3)%>%
		  <input type=submit name=dp value="�ύ����"> 
		  </form>
		   
		  </TD>
		</TR>
		<TR>
          <TD align=center colspan=2><%=hotlist.get(8).toString() %>
		  </TD>
		</TR>
		<%}%>
		
				</TBODY>
			</TABLE>			
			</TD>
		</TR>
        </TBODY>
	  </TABLE>


<SCRIPT language=JavaScript>
<!--//Ŀ����Ϊ������񷽱�
document.write('</div>');
//-->
</SCRIPT>
<SCRIPT language=JavaScript>
<!--
clickEdit.init();
//-->
</SCRIPT>
</BODY>
</HTML>

<%@ include file="iframe/foot.jsp"%>