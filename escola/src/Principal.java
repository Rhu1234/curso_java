import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "walace";
        aluno1.idade = 23;
        aluno1.nota= 10;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Rhuandro";
        aluno2.idade = 34;
        aluno2.nota= 10;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "fernando";
        aluno3.idade = 30;
        aluno3.nota= 10;

        Aluno aluno4 = new Aluno();
        aluno4.nome = "claudia";
        aluno4.idade = 28;
        aluno4.nota= 10;
        Aluno aluno5 = new Aluno();
        aluno5.nome = "daniel";
        aluno5.idade = 19;
        aluno5.nota= 10;

        Aluno aluno6 = new Aluno();
        aluno6.nome = "Robson";
        aluno6.idade = 37;
        aluno6.nota= 10;

        Professor professor = new Professor();
        professor.nome ="Meteus";
        professor.idade = 24;
        professor.disciplina ="Programação Orientada a Objetos";

        Disciplina disciplina = new Disciplina();
        disciplina.nome ="Programação Orientada a Objetos";
        disciplina.alunos[0]= aluno1;
        disciplina.alunos[1]= aluno1;
        disciplina.alunos[2]= aluno1;
        disciplina.alunos[3]= aluno1;
        disciplina.alunos[4]= aluno1;
        disciplina.alunos[5]= aluno1;

        disciplina.professor = professor;

    }

}


