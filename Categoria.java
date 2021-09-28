public enum Categoria {
  Terror("Terror"), Acao("Ação"), Aventura("Aventura"), Romance("Romance"), Suspense("Suspense");

  private String categoriaFilme;

  private Categoria(String categoriaFilme) {
    this.categoriaFilme = categoriaFilme;
  }

  public String getCategoriaFilme(){
    return this.categoriaFilme;
  }