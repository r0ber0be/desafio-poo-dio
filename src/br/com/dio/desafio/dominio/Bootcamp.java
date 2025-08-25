package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp extends ProgramaEducacional {
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        if (!super.equals(o)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(dataInicial, bootcamp.dataInicial) &&
               Objects.equals(dataFinal, bootcamp.dataFinal) &&
               Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataInicial, dataFinal, devsInscritos);
    }
}
