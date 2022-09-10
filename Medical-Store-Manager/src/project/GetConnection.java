
package project;

import java.sql.*;


public class GetConnection {
   
    private Connection conn=null;
	
	public Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore","root","root");
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	finally
	{
		return conn;
	}
        
    }
}
