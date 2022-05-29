package filehandling;
class StudentDataTable
{
	int studentid;
	String studentname;
	int classid;
	int staffid;
	StudentDataTable(int studentid,String studentname,int classid,int staffid)
	{
		this.studentid=studentid;
		this.studentname=studentname;
		this.classid=classid;
		this.staffid=staffid;
	}
	public int getstudentid()
	{
		return studentid;
	}
	public String getstudentname()
	{
		return studentname;
	}
	public int getclassid()
	{
		return classid;
	}
	public int getstaffid()
	{
		return staffid;
	}
	
}
class StaffIdTable
 {
	 String staffname;
	 int staffid;
	 StudentDataTable t;
	 StaffIdTable(String staffname,int staffid,StudentDataTable t)
	 {
	 this.staffname=staffname;
	 this.staffid=staffid;
	 this.t=t;
 }
 }
 class ClassIdTable
 {
String classname;
int classid;
StaffIdTable f;
ClassIdTable(String classname,int classid,StaffIdTable f)
{
	this.classname=classname;
	this.classid=classid;
	this.f=f;
}
}


import java.sql.Student_Data,StaffName_Table,ClassName_Table; 
class ClassIdTableDriver
{
public static void main(String[] args)
{
System.out.println("join 3 SQL tables using Natural join");
Connection con= null;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc :mysql ://:localhost:3306");
try
{
Statement st = con.createStatement();
ResultSet res = st.executeQuery(
SELECT * FROM"
+"Student_Data"
+"NATURAL JOIN"
+"StaffName_Table"
+"NATURAL JOIN"
+"ClassName_Table");

System.out.println("StudentName"
+   "ClassName"
+   "StaffName");

while (res.next())
{
String classname = res.getString("Class Name");
String staffname = res.getString("Staff Name");
String studentname = res.getString("Student Name");
System.out.print(%10s%10s%10s\n", classname,staffname,studentname);
}
con.close();
}
catch (SQLException s)
{
System.out.println("SQL statement is not executed!");
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
	


