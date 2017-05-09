


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWord
 */
public class HelloWorld extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public void init() throws ServletException
	{
		// Do required initialization
		message = "Hello World ";
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
	{
		// Set response content type
		response.setContentType("text/html");

		
		 Map params = request.getParameterMap();
		    Iterator i = params.keySet().iterator();
		    while ( i.hasNext() )
		      {
		        String key = (String) i.next();
		        System.out.println(key);
		        String value = ((String[]) params.get( key ))[ 0 ];
		        System.out.println(value);
		      }
		    
		System.out.println(params.toString());
		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message +"</h1>");
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
	{
		// Set response content type
		response.setContentType("text/html");

		String horas = request.getAttribute("horas").toString();
		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + horas + "</h1>");
	}

	public void destroy()
	{
		// do nothing.
	}
}
