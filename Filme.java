import java.util.Scanner;
import java.lang.System;

public class Filme {
  private String nomeFilme;
  private int duracao; // Minutos
  private Categoria categoriaFilme;
  // private String sinopse;
  // private Avaliacao avaliacaoFilme;

  public Filme(String nomeFilme, int duracao, Categoria categoriaFilme) {
    this.nomeFilme = nomeFilme;
    this.duracao = duracao;
    this.categoriaFilme = categoriaFilme;

  }

  public String getNomeFilme() {
    return this.nomeFilme;
  }

  public int getDuracao() {
    return this.duracao;
  }

  public Categoria getCategoria() {
    return this.categoriaFilme;
  }

  public static void main(String[] args) throws Exception {
    Filme filme = new Filme("Senhor dos Aneis", 155, Categoria.Acao);

    System.out.println(filme.getNomeFilme());
    System.out.println(filme.getDuracao());
    System.out.println(filme.getCategoria().getCategoriaFilme());

  }
}