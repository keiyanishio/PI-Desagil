package br.edu.insper.desagil.loja;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void postVideo(int id, Produto produto) {
		Video video = new Video(id, produto);
		
	}
	
	public void totalAvaliacao() {
		int soma = 0;
		
	}
	

}
