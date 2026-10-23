package lab.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<String> conteudosIncrito = new LinkedHashSet<>();
    private Set<String> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverBoootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getConteudosIncrito() {
        return conteudosIncrito;
    }

    public void setConteudosIncrito(Set<String> conteudosIncrito) {
        this.conteudosIncrito = conteudosIncrito;
    }

    public Set<String> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<String> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncrito, dev.conteudosIncrito) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncrito, conteudosConcluido);
    }
}
