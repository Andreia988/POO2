
package minhabiblioteca;


public class Capitulo {
    private String nome;
    private int pagina;
    private Livro livro;

    public Capitulo(String nome, int pagina, Livro livro) {
        this.nome = nome;
        this.pagina = pagina;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
   
}
