package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
public class FirstServlet implements Servlet {
	 ServletConfig conf;

	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating object...");
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("servicing....");
		//set content type of response
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Hello</h1>");
		out.println("<h1>Date:"+new Date().toString()+"</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("going to destroy...");
		
	}
	

	@Override
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		
		return "created by AK";
	}


}
