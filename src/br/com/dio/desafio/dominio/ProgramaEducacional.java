package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public abstract class ProgramaEducacional {
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramaEducacional that = (ProgramaEducacional) o;
        return Objects.equals(nome, that.nome) &&
               Objects.equals(descricao, that.descricao) &&
               Objects.equals(conteudos, that.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, conteudos);
    }
}
