package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out=response.getWriter();  
	        out.println("<h1>Update Employee</h1>");  
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	          out.println("<link rel='stylesheet' href='css/bootstrap.css'>");
	        Emp e=EmpDao.getEmployeeById(id);  
	          
	        out.print("<form action='EditServlet2' method='post'>");  
	        out.print("<table class='table'>");  
	        out.print("<tr><td></td><td><input class='form-control' type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input  class='form-control' type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input  class='form-control' type='text' name='name' value='"+e.getCountry()+"'/></td></tr>");  
	        out.print("<tr><td>Password:</td><td><input  class='form-control' type='password' name='password' value='"+e.getPassword()+"'/>  </td></tr>");  
	        out.print("<tr><td>Email:</td><td><input  class='form-control' type='text' name='email' value='"+e.getEmail()+"'/></td></tr>");  
	        out.print("<tr><td>Country:</td><td>");  
//	        out.print("<div class=\"dropdown\">\r\n" + 
//	        		"    <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Dropdown Example\r\n" + 
//	        		"    <span class=\"caret\"></span></button>\r\n" + 
//	        		"    <ul class=\"dropdown-menu\">\r\n" + 
//	        		"      <li><a href=\"#\">HTML</a></li>\r\n" + 
//	        		"      <li><a href=\"#\">CSS</a></li>\r\n" + 
//	        		"      <li><a href=\"#\">JavaScript</a></li>\r\n" + 
//	        		"    </ul>\r\n" + 
//	        		"  </div>");
	        out.print("<select name='country' style='width:150px'>");  
	        out.print("<option>India</option>");  
	        out.print("<option>USA</option>");  
	        out.print("<option>UK</option>");  
	        out.print("<option>Other</option>");  
	        out.print("</select>");  
	        out.print("</td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' class='btn btn-info' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
	        out.close();  
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}

}
