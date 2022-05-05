package br.unicamp.ic.inf335.App.Atividade04.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	
	@Test
	@DisplayName("Teste de valor com desconto")
	void test() {
		ArrayList<URL> urls = new ArrayList<URL>();
		ProdutoBean prod = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1000.0,"Poucos riscos, estado de novo.");
		try {
			urls.add(new URL("http://www.google.com.br"));
		} catch (MalformedURLException e) {
			assertTrue(false);
		}
		AnuncioBean anuncio = new AnuncioBean(prod, urls, 0.5);
		
		assertTrue(anuncio.getValor() == 500.0);
	}

}



