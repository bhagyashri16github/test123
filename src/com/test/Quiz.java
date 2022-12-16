package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Quiz {
	public static void main(String[]args) 
	{ 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//establishing the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
			//create the object
			PreparedStatement ps=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps.setString(1,"1");
			ps.setString(2, "Number of primitive data types in Java are?");
			ps.setString(3, "6");
			ps.setString(4, "7");
			ps.setString(5, "8");
			ps.setString(6, "9");
			ps.setString(7,"8");
			int i=ps.executeUpdate();
			System.out.println("record insert:"+i);
			ps.close();
			PreparedStatement ps1=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps1.setString(1,"2");
			ps1.setString(2,"What is the size of float and double in java?");
			ps1.setString(3, "32 and 64");
			ps1.setString(4, "32 and 32");
			ps1.setString(5, "64 and 64");
			ps1.setString(6, "64 and 32");
			ps1.setString(7,"32 and 64");
			int j=ps1.executeUpdate();
			System.out.println("record insert:"+j);
			ps1.close();
			PreparedStatement ps2=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps2.setString(1,"3");
			ps2.setString(2,"Who invented Java Programming?");
			ps2.setString(3, "Guido van Rossum");
			ps2.setString(4, "James Gosling");
			ps2.setString(5, "Dennis Ritchie");
			ps2.setString(6, "Bjarne Stroustrup");
			ps2.setString(7,"James Gosling");
			int k=ps2.executeUpdate();
			System.out.println("record insert:"+k);
			ps2.close();
			PreparedStatement ps3=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps3.setString(1,"4");
			ps3.setString(2," What is the extension of java code files?");
			ps3.setString(3, ".js");
			ps3.setString(4, ".txt");
			ps3.setString(5, ".class");
			ps3.setString(6, ".java");
			ps3.setString(7,".java");
			int l=ps3.executeUpdate();
			System.out.println("record insert:"+l);
			ps3.close();
			PreparedStatement ps4=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps4.setString(1,"5");
			ps4.setString(2,"Which of the following are not Java keywords ?");
			ps4.setString(3, "double");
			ps4.setString(4, "switch");
			ps4.setString(5, "then");
			ps4.setString(6, "instanceof");
			ps4.setString(7,"then");
			int m=ps4.executeUpdate();
			System.out.println("record insert:"+m);
			ps4.close();
			PreparedStatement ps5=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps5.setString(1,"6");
			ps5.setString(2,"Which of these have highest precedence?");
			ps5.setString(3, "()");
			ps5.setString(4, "++");
			ps5.setString(5, "*");
			ps5.setString(6, ">>");
			ps5.setString(7," ()");
			int n=ps5.executeUpdate();
			System.out.println("record insert:"+n);
			ps5.close();
			PreparedStatement ps6=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps6.setString(1,"7");
			ps6.setString(2,"Which of these is returned by operator '&' ? ");
			ps6.setString(3, "Integer");
			ps6.setString(4, "Character");
			ps6.setString(5, "Boolean");
			ps6.setString(6, "Float");
			ps6.setString(7,"Character");
			int o=ps6.executeUpdate();
			System.out.println("record insert:"+o);
			ps6.close();
			PreparedStatement ps7=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps7.setString(1,"8");
			ps7.setString(2,"Data type long literals are appended by _____");
			ps7.setString(3, "Uppercase L");
			ps7.setString(4, "Lowercase L");
			ps7.setString(5, "Long");
			ps7.setString(6, "Both A and B");
			ps7.setString(7,"Both A and B");
			int p=ps7.executeUpdate();
			System.out.println("record insert:"+p);
			ps7.close();
			PreparedStatement ps8=con.prepareStatement("\n insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps8.setString(1,"9");
			ps8.setString(2,"Java language was initially called as ________");
			ps8.setString(3, "Sumatra");
			ps8.setString(4, "J++ ");
			ps8.setString(5, "Oak");
			ps8.setString(6, "Pine");
			ps8.setString(7,"Oak");
			int q=ps8.executeUpdate();
			System.out.println("record insert:"+q);
			ps8.close();
			PreparedStatement ps9=con.prepareStatement("insert into question(id,question,A,B, C, D,answer)values(?,?,?,?,?,?,?)");
			ps9.setString(1,"10");
			ps9.setString(2,"Which of these are selection statements in Java?");
			ps9.setString(3, "break");
			ps9.setString(4, "continue");
			ps9.setString(5, " for()");
		    ps9.setString(6, "if()");
			ps9.setString(7,"if()");
            int r=ps9.executeUpdate();
			System.out.println("record insert:"+r);	
			con.close();
			ps9.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
}
		
}
}

