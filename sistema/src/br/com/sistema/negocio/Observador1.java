package br.com.sistema.negocio;

import java.util.List;
import br.com.sistema.negocio.Produto;
import br.com.sistema.negocio.Estoque;

public class Observador1 implements IObserver{

	private Estoque estoque;
	
	public void update(int i) {
		 List<Produto> comEstoqueBaixo = estoque.getProdutosQuantidadeBaixa();
		    if (comEstoqueBaixo.size() > 0) {
		        for (Produto produto : comEstoqueBaixo) {
		        	System.out.println("Observador1: Estoque atualizado do produto com Id - " + produto.getId() + ", Produto - " + produto.getNome() + 
		        			", Quantidade - " + produto.getQuantidade() + ", Valor - " + produto.getValor() + ", Quantidade minima - " + produto.getQuantidadeMinima());
		        }
		    }
	}

}