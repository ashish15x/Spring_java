package com.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller


public class JdbcController {
	
	@RequestMapping("/login")
	public String display() {
		return "viewpage";
		
	public static void main(String[] args) {
	
		Statement stmt=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection established successfully");
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		createTable();
	    
		try {
			int status=stmt.executeUpdate("insert into loginform(username,passwrord)" + "values('ashish','ashish')");
			if(status>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	static void createTable() throws SQLException {
		Statement stmt=null;
		Connection con=null;
	
        String sql = "CREATE TABLE IF NOT EXISTS loginform " +
                     " username VARCHAR(255), " +
                     " password VARCHAR(255)) ";

        if (con != null) { // Check connection before initializing stmt
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(sql);
        } else {
            System.out.println("Connection failed.");
        }
    }
}

