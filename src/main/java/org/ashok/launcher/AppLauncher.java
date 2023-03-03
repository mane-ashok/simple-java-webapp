package org.ashok.launcher;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.ashok.controller.SimpleServlet;

/**
 * This is your main class which bootstraps tomcat and registers your servlet with "/*" mapping
 * Steps -
 * 1. Run this class as Java application
 * 2. open the browser and hit the URL - http://localhost:8080/
 * 3. You should see the response 
 * @author Ashok Mane
 *
 */

public class AppLauncher {

	public static void main(String[] args) throws LifecycleException {
		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		tomcat.getConnector();
		
		Context ctx = tomcat.addContext("", null);
		Wrapper servlet = Tomcat.addServlet(ctx, "SimpleServlet", new SimpleServlet());
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/*");
		
		tomcat.start();
		
	}
	
}
