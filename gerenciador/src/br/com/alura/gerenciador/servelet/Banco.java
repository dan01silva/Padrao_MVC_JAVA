package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa1);
		System.out.println("Cadastro Alura Realizado");
		lista.add(empresa2);
		System.out.println("Cadastro Caelum Realizado");

	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		if (lista != null) {
			return lista;
		}
		return null;
	}
}
