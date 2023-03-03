package org.ashok.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		response.getWriter().print(
				"""
				<html>\n
					<body>\n
						<h1>Hello World!</h1>\n
						<p>This is simple servlet with embedded tomcat</p>\n
					</body>\n
				</html>						
						
				"""
				);
	}

}
