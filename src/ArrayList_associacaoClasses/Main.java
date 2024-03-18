package ArrayList_associacaoClasses;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Usando ArrayList<>");

        Aluno a1 = new Aluno("José", "SC3012867");
        Aluno a2 = new Aluno("Maria", "SC3012869");
        Aluno a3 = new Aluno("Manuela", "SC3012888");

        Disciplina d1 = new Disciplina("POOS3", "Programação Orientada a Objetos", 80);
        Disciplina d2 = new Disciplina("DOOS4", "Desenvolvimento Orientado a Objetos", 80);
        Disciplina d3 = new Disciplina("PWS3", "Programação WEB 3", 80);

        Matricula m1 = new Matricula(a1, d1,10, 100, "2024.1");
        Matricula m2 = new Matricula(a2, d2, 8, 80, "2024.1");
        Matricula m3 = new Matricula(a3, d2, 9, 80, "2024.1");
        Matricula m4 = new Matricula(a2, d1, 8, 80, "2024.1");
        Matricula m5 = new Matricula(a3, d3, 9, 80, "2024.1");

        // Lis.of retorna um lista imutável
        a1.setMatriculas(List.of(m1,m2));
        a2.setMatriculas(List.of(m2,m3));


        // utilizando ométodo para acionar matrículas
        d1.adicionarMatricula(m1,m2);
        d2.adicionarMatricula(m2,m3);
        d3.adicionarMatricula(m3,m4,m5);


        for (Matricula m : a1.getMatriculas()){
            System.out.println("Aluno: " + m.getAluno().getNome());
            System.out.println("Matriculado na disciplina: " + m.getDisciplina().getNomeDisciplina());
        }

        for(Matricula m : d1.getMatriculas()){
            System.out.println("Nome:" + m.getAluno().getNome());
            System.out.println("Nota: " + m.getNota());

        }




    }
}