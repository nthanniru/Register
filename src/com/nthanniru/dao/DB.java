package com.nthanniru.dao;

import java.sql.*;

public class DB {

	public static Connection getCon() {
		Connection con = null;
		try {
			/*  If you are using oracle database Load the oracle JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "postgres", "postgres");
			*/
			
			// If you are using PostgreSQL database Load the PostgreSQL JDBC driver
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://192.168.56.14:5432/postgres", "postgres", "postgres");

		} catch (Exception ex) {
			System.out.println(ex);
		}
		return con;
	}
}
