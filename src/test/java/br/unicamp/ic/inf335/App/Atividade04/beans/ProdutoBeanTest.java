package br.unicamp.ic.inf335.App.Atividade04.beans;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class ProdutoBeanTest {

	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	@Test
	@DisplayName("Teste de ordenação de array")
	void test() {
		produtos.add(new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo."));
		produtos.add(new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla",1100.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla",120.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla",1300.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla",9400.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla",1500.0,"Bla Bla Bla"));
	
		Collections.sort(produtos);
		
		boolean isSorted = true;
		if (produtos.size() > 1) {
			for (int i=1; i<produtos.size(); i++) {
				if (produtos.get(i - 1).getValor() > produtos.get(i).getValor()) {
					isSorted = false;
				}
			}
		}
		
		assertTrue(isSorted);
	}

}
