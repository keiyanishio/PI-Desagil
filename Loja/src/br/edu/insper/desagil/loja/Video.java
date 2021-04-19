package br.edu.insper.desagil.loja;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto, Map<Usuario, Integer> avaliacoes) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return id;
	}


	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, int nota) {
		if (!this.avaliacoes.containsKey(usuario)){
			if (nota<=5 && nota>=1) {
				this.avaliacoes.put(usuario, nota);
			}
		}
	}
	
	public double mediaAvaliacoes() {
		double media = 0.0;
		for (int ponto:this.avaliacoes.values()) {
			media+=ponto;	
		}
		int tamanho = this.avaliacoes.size();
		double medias = media/tamanho;
		double total = Math.round(medias);
		int nota_media = (int) total;
		return nota_media;
	}
	
	
	
	
	

}
