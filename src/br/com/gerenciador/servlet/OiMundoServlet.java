package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; //declarar novo caminho
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; //requerimento		
import javax.servlet.http.HttpServletResponse; //resposta 

@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet  { 
	
	
	
	@Override //sobreescrição
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter out = resp.getWriter(); 
		out.println("<html>");
		out.println("<body>"); 
		out.println("Thiago é lindo"); 
		out.println("</body>"); 
		out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado");
	}

}
