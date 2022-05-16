/*package com.nthanniru.dao;


import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DB {


	
public static Properties loadPropertiesFile() throws Exception {
		 
		Properties prop = new Properties();
		InputStream in = new FileInputStream("JDBC");
		prop.load(in);
		in.close();
		return prop;
	}

	public static Connection getCon() {
		Connection con = null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			Properties prop = loadPropertiesFile();
			 
			String driverClass = prop.getProperty("Driver_Name");
			String url = prop.getProperty("DB_URL");
			String username = prop.getProperty("Username");
			String password = prop.getProperty("Password");
	 
			Class.forName(driverClass);
	 
			con = DriverManager.getConnection(url, username, password);
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return con;
	}
 
 
}*/
package com.nthanniru.dao;

import java.sql.*;

public class DB {

	public static Connection getCon() {
		Connection con = null;
		try {
			 Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://192.168.33.11:5432/postgres","postgres", "welcome123");
	         
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return con;
	}
}
