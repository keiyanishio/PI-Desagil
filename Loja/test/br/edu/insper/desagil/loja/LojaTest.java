package br.edu.insper.desagil.loja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


class LojaTest {
	private Usuario u;
	private Produto p;
	
	@BeforeEach
	private void setup() {
		u = new Usuario("Keiya");
		p = new Produto("mesa", 19.00);
		
	}
	

	@Test
	public void umVideo() {
		u.postVideo(new Video("1", produto));
		u.calculaMedia
	}

}
