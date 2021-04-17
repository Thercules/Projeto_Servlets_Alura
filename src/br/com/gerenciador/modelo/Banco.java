package br.com.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>(); 
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1; 
	
	
	static {
		Empresa empresa = new Empresa(); 
		empresa.setId(chaveSequencial++);
		empresa.setNome("ThiagoLTDA");
		Empresa empresa2 = new Empresa(); 
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Thiago"); 
		lista.add(empresa); 
		lista.add(empresa2);
		
		Usuario u1 = new Usuario(); 
		u1.setLogin("Thiago");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario(); 
		u2.setLogin("Esposa");
		u2.setSenha("12345");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return lista; 
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				lista.remove(empresa);
			}
		}
		
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : lista) { 
			if(empresa.getId() == id) {
				return empresa; 
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario u: listaUsuarios) {
			if(u.igual(login, senha)) {
				return u; 
			}
		}
		return null;
	}
	
}
