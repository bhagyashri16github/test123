package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Retrivedata
{  
	//insert the student result into database
	public static void InsertStudentResult(String stdName,int Marks,String Result) throws SQLException, ClassNotFoundException 
	{
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		//create the object
		PreparedStatement b1=con.prepareStatement("insert into student(studentname,marks,result)values(?,?,?)");
		b1.setString(1,stdName);
		b1.setInt(2,Marks );
		b1.setString(3, Result);
		int z=b1.executeUpdate();
		System.out.println(+z+ " Record Inserted");
		b1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	//method for get the all student result data into code
	public static void getAllStusentResult()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		PreparedStatement ps=con.prepareStatement("select * from student order by marks desc");//sorting the data with respect to marks in desending order
		ResultSet bm=ps.executeQuery();
		System.out.println("*****************************All Student Result*****************************");
		while(bm.next())
		{
			System.out.println("Student Name->> " +bm.getString(1));
			System.out.println("Marks->> " +bm.getString(2));
			System.out.println("Result->> " +bm.getString(3));
			System.out.println("............................................................................");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//method for the get the result (class a,class b,class c,class d)
		public static String getresult(int marks) 
		{
			String resultStatment;
			if(marks<=10 && marks>=8)
		    	resultStatment="class A"; 
		     else if(marks<=8 && marks>=6)
		    	 resultStatment="class B";
		     else   if(marks==5)
		    	 resultStatment="class C";
		     else
		     {
		    	 resultStatment="class D";
		    	 System.out.println("You are Fail...");
		     }
			return resultStatment;
		}
public static void main(String[]args) throws SQLException, ClassNotFoundException
{
	int correct=0;
	String currentresult;
	String currentanswer;
	int currentoption=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("");
	System.out.println("***************************************Welcome to Quiz****************************************");
	System.out.println("Enter Student Name:");
	String name1=sc.next();
	Class.forName("com.mysql.jdbc.Driver");
	//establishing the connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
	//create the object
	PreparedStatement ps=con.prepareStatement("select * from question ORDER by rand()");
	ResultSet qs=ps.executeQuery();
	while(qs.next())//one by one line execution for question set
	{
		//System.out.println("id:"+qs.getInt(1));
		System.out.println("Question:\n"+qs.getString(2));
		System.out.println("	Option A: "+qs.getString(3));
		System.out.println("	Option B: "+qs.getString(4));
		System.out.println("	Option C: "+qs.getString(5));
		System.out.println("	Option D: "+qs.getString(6));
		//System.out.println("answer:"+qs.getString(7));
		
		System.out.println("Choose Option:");
		currentanswer=sc.next();
		
		if(currentanswer.equals("A")||currentanswer.equals("a")) currentoption=3;// column index save
//		else if(currentanswer.equals("B")||currentanswer.equals("b")) currentoption=4;
		else if(currentanswer.equals("C")||currentanswer.equals("c")) currentoption=5;
		else if(currentanswer.equals("D")||currentanswer.equals("d")) currentoption=6;

		if(qs.getString(currentoption).equals(qs.getString(7)))
		{ //passing the current option as a index of column for compassion of answer and option
			correct ++;
			System.out.println("Your Answer is correct>>");
			System.out.println("-----------------------------------------------------------------------");
		}
		else 
		{
	
			System.out.println("Your Answer is wrong>>");		
			System.out.println("-----------------------------------------------------------------------");
		}
	}
	System.out.println("Your Score is "+correct +" out of 10");//score print
	
	currentresult=Retrivedata.getresult(correct);//storing the grade of the student in variable current result
	
	Retrivedata.InsertStudentResult(name1, correct,currentresult);//inserting the student record with marks and result

	Retrivedata.getAllStusentResult();//display all the result
	con.close();
	ps.close();
	qs.close();
	sc.close();
	
}

}
