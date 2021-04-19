package br.edu.insper.desagil.loja;

import java.util.ArrayList;
import java.util.List;

public abstract class Vendedor extends Usuario{
	private List<Produto> produtos;

	public Vendedor(String nome, List<Video> videos) {
		super(nome);
		this.produtos = new ArrayList<>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	
	public void cadastraProduto(String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		this.produtos.add(produto);
		
	}


	

}
