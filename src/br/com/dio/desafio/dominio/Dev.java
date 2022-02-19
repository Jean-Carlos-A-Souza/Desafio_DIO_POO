package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIncristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncristos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscristos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo =  this.conteudosIncristos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluido.add(conteudo.get());
            this.conteudosIncristos.remove(conteudo.get());
        } else{
            System.err.println("Voce não esta matriculado em nenhum Conteudo");
        }

    }

    public double calcularTotalXp(){
        return this.conteudosConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncristos() {
        return conteudosIncristos;
    }

    public void setConteudosIncristos(Set<Conteudo> conteudosIncristos) {
        this.conteudosIncristos = conteudosIncristos;
    }

    public Set<Conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncristos, dev.conteudosIncristos) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncristos, conteudosConcluido);
    }
}
