package br.com.pontoeletronico;

import java.time.LocalDateTime;

import br.com.pontoeletronico.RegistroPonto.TipoRegistro;

public class Main {

	private static final TipoRegistro TipoRegistro = null;

	public static void main(String[] args) {
		
		RegistroPonto registro = new RegistroPonto();
		registro.setDataHora(LocalDateTime.now());
		registro.setTipo(TipoRegistro);
		
		
		System.out.println(registro);
		
		
		
		
		
		
		
		

	}

}
