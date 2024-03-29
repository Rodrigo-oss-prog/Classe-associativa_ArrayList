package ArrayList_associacaoClasses;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Disciplina {
    private String sigla;
    private String nomeDisciplina;
    private int cargaHoraria;

    private List<Matricula> matriculas = new ArrayList<>();


    public Disciplina(String sigla, String nomeDisciplina, int cargaHoraria) {
        this.sigla = sigla;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public void adicionarMatricula(Matricula...m){
        Collections.addAll(matriculas,m);

    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
