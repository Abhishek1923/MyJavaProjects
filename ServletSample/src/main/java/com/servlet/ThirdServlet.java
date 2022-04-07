package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("Servlet using HttpServlet.");
		System.out.println("This is doGet method.");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>This is Get method of ThirdServlet</h1>");
	}
}
