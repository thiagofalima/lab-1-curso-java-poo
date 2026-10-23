package lab.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIncrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBoootcamp(Bootcamp bootcamp){
        this.conteudosIncrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncrito.remove(conteudo.get());
        } else {
            System.err.println("Voce nao esta matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncrito() {
        return conteudosIncrito;
    }

    public void setConteudosIncrito(Set<Conteudo> conteudosIncrito) {
        this.conteudosIncrito = conteudosIncrito;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncrito, dev.conteudosIncrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncrito, conteudosConcluidos);
    }
}
