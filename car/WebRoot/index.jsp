<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312" %>
<%@ include file="iframe/head.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<LINK href="images/default.css" type=text/css rel=stylesheet>
<LINK href="images/css.css" type=text/css rel=stylesheet>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
 
 
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
<TABLE class=MainTable cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>
  <TR>

     <TD class=Side vAlign=top align=left width="25%" height=200>
<!--*******************************������Ѷ��ʼ*******************************-->
 <TABLE  class=dragTable cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
 <TBODY>
        <TR>
          <TD class=head id=tb1_bt1   width="100%" height="30">
            <SPAN class=TAG>���ֳ�����</SPAN>
		  </TD>
		 
		</TR>
        <TR>
		<TD class=middle  align="left" colspan="2">
<!--*******************************������Ѷ**********************************-->
               <TABLE class=xsnr id=tb1_nr1  cellSpacing=0 cellPadding=0 width="100%" border=0>
                    <TBODY>
                    
                    <%List f1list=tb.get1FENLEI();
                    if(!f1list.isEmpty()){
					for(int alln1=0;alln1<f1list.size();alln1++){
			%>
					<TR>
                      <TD align="left">
					  <a href="<%=basePath %>finfo.jsp?id=<%=f1list.get(alln1).toString()%>"><%=f1list.get(alln1).toString()%></A>
					  </TD>
					  </TR>
					  <%}} %>
					
				</TBODY>
			</TABLE>			
			</TD>
		</TR>
		</TBODY>
	</TABLE>
<!--*******************************������Ѷ����*******************************-->
	</TD>
	<TD class=Side vAlign=top align=left width="50%" height=200>
<!--*******************************������Ѷ��ʼ*******************************-->
 <TABLE  class=dragTable cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
 <TBODY>
        <TR>
                      <TD align="center"><img src="<%=basePath%>images/s.jpg" width=470 height=238 border=0></TD>
					</TR>
		</TBODY>
	</TABLE>
<!--*******************************������Ѷ����*******************************-->
	</TD>
     <TD class=Side vAlign=top align=right width="25%">
<!--*******************************�������濪ʼ*******************************-->
      <TABLE width="100%" height="240" border=0 cellPadding=0 cellSpacing=0 class=dragTable>
	  <TBODY>
        <TR>
          <TD class=head>
            <SPAN class=TAG>
            <P>��վ����</P>
            </SPAN>
		  </TD>
		</TR>
        <TR>
          <TD class=middle align=left>
        <MARQUEE onmouseover=if(document.all!=null){this.stop()} onmouseout=if(document.all!=null){this.start()} scrollAmount=1 scrollDelay=1 direction=up height=180>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <%if(!affList.isEmpty()){
					for(int aff=0;aff<affList.size();aff++){
						List affList2=(List)affList.get(aff);
			%>
			<TR>
                <TD width="100%">
				<%=affList2.get(1).toString() %>---<%=affList2.get(2).toString() %><BR>
				</TD>
			  </TR>
			<%
					}
				}
			  %>
     
			  </TBODY>
			 </TABLE>
			 </MARQUEE>
		  </TD>
		</TR>
	</TBODY>
<!--*******************************�����������*******************************-->
	</TABLE>
</TD>
   </TR>
  </TBODY>
</TABLE>
<!--*******************************���¿�ʼ*******************************-->
<TABLE class=MainTable style="MARGIN-TOP: 0px" cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>
  <TR>
    <TD class=Main vAlign=top height=100>
      <TABLE class=dragTable cellSpacing=0 cellPadding=0 width="100%" border=0>
	  <TBODY>
        <TR>
          <TD class=head>
            <SPAN class=TAG>���¶��ֳ�</SPAN> 
            
		  </TD>
		</TR>
        <TR>
          <TD class=middle>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <TR>
              <%
              	List resList=tb.get10PTrave();
              	if(!resList.isEmpty()){
              		for(int res=0;res<resList.size();res++)
              		{
              			List resList2=(List)resList.get(res);
              %>
              <TD width="14%">
                  <DIV >
                  <P class=img>
				  <a href="<%=basePath %>hinfo.jsp?id=<%=resList2.get(0).toString()%>"><IMG height=150 src="<%=basePath+resList2.get(3).toString()%>" width=180 onload=makesmallpic(this,180,150); border=0></A>
				  </P>
                  <P class=title style="TEXT-ALIGN: center">
				  <a href="<%=basePath %>hinfo.jsp?id=<%=resList2.get(0).toString()%>"><%=resList2.get(1).toString()%></a>
				  </P>
				  </DIV>
				</TD>
              <%
              		}
              	}
               %>
              
			</TR>
		</TBODY>
	</TABLE>
	</TD>
	</TR>
   </TBODY>
   </TABLE>
   </TD>
  </TR>
  </TBODY>
</TABLE>

<!--*******************************�ȵ㿪ʼ*******************************-->
<TABLE class=MainTable style="MARGIN-TOP: 0px" cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TBODY>
  <TR>
    <TD class=Main vAlign=top height=100>
      <TABLE class=dragTable cellSpacing=0 cellPadding=0 width="100%" border=0>
	  <TBODY>
        <TR>
          <TD class=head>
            <SPAN class=TAG>���Ŷ��ֳ�</SPAN> 
            
		  </TD>
		</TR>
        <TR>
          <TD class=middle>
            <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
              <TBODY>
              <TR>
              <%
              	List resList22=tb.get10HotTrave();
              	if(!resList22.isEmpty()){
              		for(int res=0;res<resList22.size();res++)
              		{
              			List resList2=(List)resList22.get(res);
              %>
               <TD width="14%">
                  <DIV >
                  <P class=img>
				  <a href="<%=basePath %>hinfo.jsp?id=<%=resList2.get(0).toString()%>"><IMG height=150 src="<%=basePath+resList2.get(3).toString()%>" width=180 onload=makesmallpic(this,180,150); border=0></A>
				  </P>
                  <P class=title style="TEXT-ALIGN: center">
				  <a href="<%=basePath %>hinfo.jsp?id=<%=resList2.get(0).toString()%>"><%=resList2.get(1).toString()%></a>
				  </P>
				  </DIV>
				</TD>
              <%
              		}
              	}
               %>
              
			</TR>
		</TBODY>
	</TABLE>
	</TD>
	</TR>
   </TBODY>
   </TABLE>
   </TD>
  </TR>
  </TBODY>
</TABLE>

<!--*******************************��Ϣ��Ŀ��ͨ����濪ʼAF01*******************************-->

 
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