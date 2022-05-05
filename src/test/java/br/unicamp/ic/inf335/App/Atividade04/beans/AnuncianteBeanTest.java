package br.unicamp.ic.inf335.App.Atividade04.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class AnuncianteBeanTest {

	@Test
	@DisplayName("Teste de inserção de anuncio em anunciante")
	void test() {
		ArrayList<AnuncioBean> anuncioArray = new ArrayList<AnuncioBean>();
		ArrayList<URL> urls = new ArrayList<URL>();
		ProdutoBean prod = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1000.0,"Poucos riscos, estado de novo.");
		try {
			urls.add(new URL("http://www.google.com.br"));
		} catch (MalformedURLException e) {
			assertTrue(false);
		}
		AnuncioBean anuncio = new AnuncioBean(prod, urls, 0.5);
		
		AnuncianteBean anunciante = new AnuncianteBean();
		anunciante.setNome("Teste");
		anunciante.setCPF("999.999.999-99");
		anunciante.addAnuncio(anuncio);
		
		assertTrue(anunciante.getAnuncios().size() > 0);
	}
	

	@Test
	@DisplayName("Teste de remoção de anuncio em anunciante")
	void test2() {
		ArrayList<AnuncioBean> anuncioArray = new ArrayList<AnuncioBean>();
		ArrayList<URL> urls = new ArrayList<URL>();
		ProdutoBean prod = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1000.0,"Poucos riscos, estado de novo.");
		try {
			urls.add(new URL("http://www.google.com.br"));
		} catch (MalformedURLException e) {
			assertTrue(false);
		}
		AnuncioBean anuncio = new AnuncioBean(prod, urls, 0.5);
		anuncioArray.add(anuncio);
		
		AnuncianteBean anunciante = new AnuncianteBean("Teste", "999.999.999-99", anuncioArray);
		
		anunciante.removeAnuncio(0);
		
		assertTrue(anunciante.getAnuncios().size() == 0);
	}
	
	@Test
	@DisplayName("Teste de Calcular o valor medio de anuncios de um anuciante")
	void test3() {
		ArrayList<AnuncioBean> anuncioArray = new ArrayList<AnuncioBean>();
		ArrayList<URL> urls = new ArrayList<URL>();
		ProdutoBean prod1 = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",2000.0,"Poucos riscos, estado de novo.");
		ProdutoBean prod2 = new ProdutoBean("CD00002","Celular Galaxy S20", "128 Gb, Branco, com Carregador",3500.0,"Poucos riscos, estado de novo.");
		
		try {
			urls.add(new URL("http://www.google.com.br"));
		} catch (MalformedURLException e) {
			assertTrue(false);
		}
		AnuncioBean anuncio1 = new AnuncioBean(prod1, urls, 0.5);
		AnuncioBean anuncio2 = new AnuncioBean(prod2, urls, 0.5);
		
		anuncioArray.add(anuncio1);
		anuncioArray.add(anuncio2);
		
		AnuncianteBean anunciante = new AnuncianteBean("Teste", "999.999.999-99", anuncioArray);
		
		assertTrue(anunciante.valorMedioAnuncios() == 1375.00);
	}
}


