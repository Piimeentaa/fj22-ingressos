package br.com.caelum.ingresso.model;

import java.math.BigDecimal;


public class DescontoParaEstudantes implements Desconto {
	@Override
	public String getDescricao() {
	return "Desconto Estudante";
	
	}
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
	return precoOriginal.divide(new BigDecimal("2.0"));

	}
}
