package it.partec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // imposto il contenuto della risposta
		PrintWriter out = response.getWriter(); // per inviare dati al client di tipo testo
		out.print("<html><head><title>");
		out.print(getServletContext().getInitParameter("hello")); // leggo parametro dalla configurazione di una servlet
		out.println("</title></head>");
		out.print("<body>");
		out.print(getServletContext().getInitParameter("hello"));
		out.println("</body></html>");
		out.close();
	}
}
