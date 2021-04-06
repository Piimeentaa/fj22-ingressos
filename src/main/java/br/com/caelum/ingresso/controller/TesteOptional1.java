package br.com.caelum.ingresso.controller;

import java.math.BigDecimal;
import java.time.Duration;

import br.com.caelum.ingresso.model.Filme;

public class TesteOptional1 {

	public static void main(String[] args) {
		Filme f = getFilme(2);
		
		String nome;
		if (f != null) {
			nome = f.getNome();
		}else {
			nome = "Não preenchido";
		}
		
		System.out.println("O nome é: " + nome);
	}
	
	public static Filme getFilme(Integer id) {
		if(id == 1) {
			return new Filme("Rambo", Duration.ofMinutes(100), "Ação", new BigDecimal("10.00"));
		} else {
			return null;
		}
	}
}


