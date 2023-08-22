package atividades;

public class Aluno extends Pessoa{
    private long matricula;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int mediaFinal;

    public Aluno() {

    }
    public Aluno(String nome, int idade, String sexo, float altura, float peso, long matricula, int nota1, int nota2, int nota3, int nota4) {
        super(nome, idade, sexo, altura, peso);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    //metodo exibição de aluno
    public void exibirAluno() {
        System.out.println("O aluno cujo nome é " + getNome() + " tem " + getIdade() + " anos, é do sexo " + getSexo() + ", tem " + getAltura() + " de altura, pesa " + getPeso() + " kg, seu numero de matricula é " + this.matricula + " e tem as notas " + nota1 + " " + nota2 + " " + nota3 + " " + nota4);
    }

    //metodo de calcular médias
    public void calcularMediaNotas() {
        mediaFinal = (nota1 + nota2 + nota3+ nota4) / 4;
        System.out.println("A média de notas do aluno " + getNome() + " é: " + mediaFinal);
    }

    public void alunoAprovado() {
        if (mediaFinal >= 70) {
            System.out.println("O aluno está aprovado");
        } else if (mediaFinal >=50 && mediaFinal <=69) {
            System.out.println("O aluno está de recuperação");
        } else{
            System.out.println("O aluno está reprovado");
        }
    }



}
