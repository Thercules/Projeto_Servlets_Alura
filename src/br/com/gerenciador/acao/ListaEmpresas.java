package br.com.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("listando empresa");
		
		Banco banco = new Banco(); 
		List<Empresa> lista = banco.getEmpresas();  //lista java.util
		
		request.setAttribute("empresas", lista); 
		
		return "forward:listaEmpresas.jsp"; 
	}
	

}
