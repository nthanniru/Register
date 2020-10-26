package com.nthanniru.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nthanniru.dao.DB;

@WebServlet("/Register")
public class Register extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fn = request.getParameter("First_Name");
		String ln = request.getParameter("Last_Name");
		String g = request.getParameter("Gender");
		String e = request.getParameter("Email");
		String p = request.getParameter("Password");
		String ph = request.getParameter("Phone_Number");
		String c = request.getParameter("Country");
		String a = request.getParameter("Address");
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("insert into register_user values(?,?,?,?,?,?,?,?)");
			ps.setString(1, fn);
			ps.setString(2, ln);
			ps.setString(3, g);
			ps.setString(4, e);
			ps.setString(5, p);
			ps.setString(6, ph);
			ps.setString(7, c);
			ps.setString(8, a);

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered with us, we will get back to you soon... \n"
						+ "mean while,if you have any queries please recah out us on naresht.info@gmail.com");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}

}
