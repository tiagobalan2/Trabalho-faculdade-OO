package atividades;


import java.util.Scanner;

public class Professor extends Pessoa{

    private String areaDeEnsino;
    private String alunoDuvida;

    public Professor() {

    }

    public Professor(String areaDeEnsino) {
        this.areaDeEnsino = areaDeEnsino;
    }

    public Professor(String nome, int idade, String sexo, float altura, float peso, String areaDeEnsino) {
        super(nome, idade, sexo, altura, peso);
        this.areaDeEnsino = areaDeEnsino;
    }

    public String getAreaDeEnsino() {
        return areaDeEnsino;
    }

    public void setAreaDeEnsino(String áreaDeEnsino) {
        this.areaDeEnsino = áreaDeEnsino;
    }


    public void exibirProfessor() {
        System.out.println("O professor cujo nome é " + this.getNome() + " tem " + this.getIdade() + " anos, é do sexo " + this.getSexo() + ", tem " + this.getAltura() + " de altura, pesa " + this.getPeso() + " kg e sua area de ensino é " + this.areaDeEnsino);
    }
    public void fazerChamada() {
        System.out.println("O professor está fazendo a chamada. ATENÇÃO!!!");
    }

    public void tirarDuvida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual aluno esta com dúvida? ");
        alunoDuvida = scanner.next();
        System.out.println("O professor esta tirando uma duvida do aluno " + alunoDuvida);
    }

}

