package testDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.*; 

public class DatabaseConnectivity {

	public static void main(String[] args) {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sakila","root","root");  
			//here sakila is database name, root is username and password  
			
			Statement stmt=con.createStatement();  
			
			ResultSet rs=stmt.executeQuery("select * from actor");  
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			
			con.close();  
			
			}catch(Exception e){ System.out.println(e);}
		

	}
	

}
