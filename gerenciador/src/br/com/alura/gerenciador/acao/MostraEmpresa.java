package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa {
	public void executa(HttpServletRequest request, HttpServletResponse response  ) throws ServletException, IOException  {
		
		System.out.println("Mostrando Empresa Funcionando");
		
		String idString = request.getParameter("id");
		Integer id = Integer.parseInt(idString);

		Empresa empresa = Banco.buscaEMpresaPelaId(id);

		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
	}
}