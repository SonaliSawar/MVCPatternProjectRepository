package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	
	
	
	public void doPost(HttpServletRequest req,  HttpServletResponse res)
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.print(i+j);
		System.out.print(i+j);
		System.out.print(i+j);
	}
	
/*	public void doGet(HttpServletRequest req,  HttpServletRequest res)
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.print(i+j);
	}*/
	
	
}
