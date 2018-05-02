package com.bean;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.util.Constant;
import com.util.DBO;

public class HzpBean {

	private String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	private List list;
	private ResultSet rs = null;
	
	//////////////////////////////////////////////////// ����
	public int addType(String title){
		String sql = "insert into type (title,addtime) values ('"+title+"','"+date+"')";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs=dbo.executeQuery("select * from type where title ='"+title+"'");
			if(rs.next())return Constant.SAME_NAME;
			else{
				int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	public List getType(){
		String sql = "select * from type order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	 
	public int delType(String id){
		String sql="delete from type where id='"+id+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	//add ------------------------------------------------------ ��Ϣ
	/*
	 * String title = "";	
		String type="��ѡ��";
		String co="";
		String time="";
		String price="";
		String vipprice="";
	 */
	public int addTrave(String title,String type,String url,String co,String time,String price,String vipprice,String content,String flag,String num,String sl){
		String sql = "insert into sale (title,type,url,co,time,price,vipprice,content,addtime,flag,num,sl) " +
				"values ('"+title+"','"+type+"','"+url+"','"+co+"','"+time+"','"+price+"','"+vipprice+"','"+content+"','"+date+"','"+flag+"','"+num+"','"+sl+"')";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	
	//update 
	public int updateTrave(String id,String title,String type,String url,String co,String time,String price,String vipprice,String content,String flag,String num,String sl){
		String sql = "update sale set title = '"+title+"',type='"+type+"',url='"+url+"'," +
				"co='"+co+"',time='"+time+"',price='"+price+"',vipprice='"+vipprice+"',content='"+content+"',flag='"+flag+"',num='"+num+"',sl='"+sl+"' where id = '"+id+"' ";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	} 
	public int delTrave(String id){
		String sql="delete from sale where id='"+id+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	public int hotTrave(String id){
		String sql="update sale set flag='��������' where id='"+id+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	public int nohotTrave(String id){
		String sql="update sale set flag='�³�����' where id='"+id+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int i = dbo.executeUpdate(sql);
			if(i == 1){
				return Constant.SUCCESS;
			}
			else{
				return Constant.SYSTEM_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	public List getOneTrave(int id){
		String sql = "select * from sale where id = '"+id+"'";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
				list.add(rs.getString(4));
				list.add(rs.getString(5));
				list.add(rs.getString(6));
				list.add(rs.getString(7));
				list.add(rs.getString(8));
				list.add(rs.getString(9));
				list.add(rs.getString(10));
				list.add(rs.getString(11));
				list.add(rs.getString(12));
				list.add(rs.getString(13));
				list.add(rs.getString(14));
				list.add(rs.getString(15));
				list.add(rs.getString(16));
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public List getAllPTrave(){
		String sql = "select * from sale order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public List getAllPTrave(String sql){
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public List getAllHotTrave(){
		String sql = "select * from sale where flag='��������' order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	
	 
	public List get10PTrave(){
		String sql = "select top 5 * from sale order by id desc  ";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public List get10HotTrave(){
		String sql = "select top 5  * from sale where flag='��������' order by id desc  ";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	////////////////////////////////////////////////////////////////////////////////��Ա����
	public int addNum(String member,int num){
		String sql="insert into num(member,num) values('"+member+"','"+num+"')";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs=dbo.executeQuery("select * from num where member='"+member+"'");
			if(rs.next()){
				int i = dbo.executeUpdate("update num set num=num+'"+num+"' where member='"+member+"'");
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
			else{
				int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}

	public int getNum(String member){
		String sql="select num from num where  member='"+member+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			if(rs.next()){
				return rs.getInt(1);
			}
			else { 
				return 0;
			}
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			dbo.close();
		}
	}
	/////////////////////////////////////////////////////////////////////////////���ﳵ 
	/////��ѯ�۳� ����
	public int getLast(String sid){
		String sql="select sum(num) from prep where sid='"+sid+"' and  flag='���ύ����'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			dbo.close();
		}
	}
	public int getSum(String sid){
		String sql="select sl from sale where id='"+sid+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			dbo.close();
		}
	}
	public int addPrep(String sid,int num,String member){
		String sql = "insert into prep (sid,num,member,flag) values ('"+sid+"','"+num+"','"+member+"','δ�ύ����')";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs=dbo.executeQuery("select * from prep where sid='"+sid+"' and member='"+member+"' and flag='δ�ύ����'");
			if(rs.next()){
				int j=dbo.executeUpdate("update prep set num=num+'"+num+"' where sid='"+sid+"' and member='"+member+"' and flag='δ�ύ����'");
				if(j == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
			else{
				int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	
	//���Ĺ������� 
	public int updatePrep(String id,String num,String sid,String snum){
		String sql = "update prep set num='"+num+"' where id = '"+id+"' ";
		DBO dbo = new DBO();
		dbo.open();
		try{
			int last=this.getLast(sid);
			int sum=this.getSum(sid);
			int upnum=Integer.parseInt(num);//System.out.println(sum+"===="+last+"===="+upnum);
			if((sum-last)>upnum){
				int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
			}
			else{
				return Constant.DEFAULT_ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	} 
	public int memberdelPrep(String id){//ɾ�����ﳵ��Ϣ
		String sql="delete from prep where id='"+id+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			 	int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
		 
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	
	////////////////////////////////////////////////////ĳ��Ա ���й��ﳵ��Ϣ δ�ύ����
	public List getMemberPrep(String member){
		String sql = "select sale.id,sale.title,sale.price,sale.vipprice,prep.*,sale.sl from sale,prep where sale.id=prep.sid and prep.member='"+member+"' and prep.flag='δ�ύ����' order by prep.id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();//id 0
				list2.add(rs.getString(1));//title 0
				list2.add(rs.getString(2));//price 1
				list2.add(rs.getString(3));//vipprice 2
				list2.add(rs.getString(4));//prep id 3
				list2.add(rs.getString(5));//sid 4
				list2.add(rs.getString(6));//num 5
				list2.add(rs.getString(7));//member 6
				list2.add(rs.getString(8));//flag 7
				list2.add(rs.getString(9));//flag 7
				list2.add(rs.getString(10));
				list.add(list2);
			}//System.out.println(list);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	/////////////////////////////////////////////////////////��Ա�ύ����
	public int scdDan(int id[],String member){
		DBO dbo = new DBO();
		dbo.open();
		String d=this.date;
		String dnum=String .valueOf(System.currentTimeMillis());
		try{
			for(int i = 0;i<id.length;i++){
				String sql="select id from prep where id='"+id[i]+"'"; 
				rs=dbo.executeQuery(sql);
				rs.next();
				String pid=rs.getString(1);
				dbo.executeUpdate("update prep set flag='���ύ����',dnum='"+dnum+"' where id='"+pid+"'");
				//dbo.executeUpdate("delete from  news  where  id = '"+id[i]+"'");				
			}
			dbo.executeUpdate("insert into post(dnum,addtime,flag,member,th) values('"+dnum+"','"+d+"','δ����','"+member+"','δ')");
			return Constant.SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	////////////////////////////////////////////////////ĳ��Ա ������Ϣ ���ݴ��ݲ��� �ѷ��� δ����
	public List getPost(String member,String flag){
		String sql = "select * from post where member='"+member+"' and flag='"+flag+"' order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	 ////////////////////////////////////////////////////��Աɾ������
	public int mdelPost(String pid){ 
		String sql="delete from post where id='"+pid+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			 	int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
		 
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	///////////////////////////////////////////////////////////��ѯĳ������ϸ������Ϣ
	 
	public List getPostInfo(String dnum,String member){
		String sql="select sale.id,sale.title,sale.price,sale.vipprice,prep.id,prep.num from sale,prep,post" +
				" where sale.id=prep.sid and prep.dnum=post.dnum and post.dnum='"+dnum+"' and prep.member='"+member+"' order by prep.id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));//0 sale.id
				list2.add(rs.getString(2));//1 sale.title
				list2.add(rs.getString(3));//2 sale.price
				list2.add(rs.getString(4));//3 sale.vipprice
				list2.add(rs.getString(5));//4 prep.id
				list2.add(rs.getString(6));//5 prep.num
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	//////////////////////////////////////////////////////////////////����Ա�鿴���� ������ϸ ���� ɾ������ 
	public List getPost(String flag){//����Ա�鿴����
		String sql = "select * from post where flag='"+flag+"' order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public String getMember(String dnum){
		String sql = "select member from post where dnum='"+dnum+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			rs.next();
			return rs.getString(1);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			dbo.close();
		}
	}
	///////////////////////////////////////////////////////����Ա�鿴������ϸ
	public List getPostInfo(String dnum){
		String sql="select sale.id,sale.title,sale.price,sale.vipprice,prep.id,prep.num from sale,prep,post" +
				" where sale.id=prep.sid and prep.dnum=post.dnum and post.dnum='"+dnum+"'  order by prep.id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));//0 sale.id
				list2.add(rs.getString(2));//1 sale.title
				list2.add(rs.getString(3));//2 sale.price
				list2.add(rs.getString(4));//3 sale.vipprice
				list2.add(rs.getString(5));//4 prep.id
				list2.add(rs.getString(6));//5 prep.num
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	//////////////////////////////////////////////����Ա����
	public int sendB(String dnum,String member){
		String sql="update post set flag='�ѷ���' where dnum='"+dnum+"'";
		String sql2="select sale.num,prep.num from sale,prep where prep.dnum='"+dnum+"' and prep.sid=sale.id order by prep.id desc";
		DBO dbo = new DBO();
		dbo.open();
		try{
			rs=dbo.executeQuery(sql2);
			int jifen=0;
			while(rs.next()){
				System.out.println(rs.getString(1)+"======"+rs.getString(2));
				int a=Integer.parseInt(rs.getString(1));
				int b=Integer.parseInt(rs.getString(2));
				jifen+=a*b;
			}
			this.addNum(member, jifen);System.out.println("ִ�е���===============");
			int i=dbo.executeUpdate(sql);
			if(i==1)return Constant.SUCCESS;
			else return Constant.SYSTEM_ERROR;
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	////////////////////////////////////////////////����Աɾ���Ѿ������Ķ���
	public int adelPost(String dnum){ 
		String sql="delete from post where dnum='"+dnum+"'";
		DBO dbo = new DBO();
		dbo.open();
		try{
			 	int i = dbo.executeUpdate(sql);
				if(i == 1){
					return Constant.SUCCESS;
				}
				else{
					return Constant.SYSTEM_ERROR;
				}
		 
		}catch(Exception e){
			e.printStackTrace();
			return Constant.SYSTEM_ERROR;
		}finally{
			dbo.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public List getFENLEI(){
		String sql = "select title from type  order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				
				list.add(rs.getString(1));
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	public List get1FENLEI(){
		String sql = "select top 10 title from type  order by id desc ";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				
				list.add(rs.getString(1));
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
	
	
	
	
	
	public List getAllHotTrave(String type){
		String sql = "select * from sale where type='"+type+"'  order by id desc";
		DBO dbo = new DBO();
		list = new ArrayList();
		dbo.open();
		try{
			rs = dbo.executeQuery(sql);
			while(rs.next()){
				List list2=new ArrayList();
				list2.add(rs.getString(1));
				list2.add(rs.getString(2));
				list2.add(rs.getString(3));
				list2.add(rs.getString(4));
				list2.add(rs.getString(5));
				list2.add(rs.getString(6));
				list2.add(rs.getString(7));
				list2.add(rs.getString(8));
				list2.add(rs.getString(9));
				list2.add(rs.getString(10));
				list2.add(rs.getString(11));
				list2.add(rs.getString(12));
				list2.add(rs.getString(13));
				list.add(list2);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}finally{
			dbo.close();
		}
	}
}
