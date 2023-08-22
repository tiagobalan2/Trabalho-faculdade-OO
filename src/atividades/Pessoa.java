package atividades;

import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private float altura;
    private float peso;
    private float imc;
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String sexo, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void ExibirInformações() {
        System.out.println(getNome() + " tem " + getIdade() + " anos, é do sexo " + getSexo() + ", tem " + getAltura() + " de altura e pesa " + getPeso() + " kg");
    }

    public void fazerAniversário() {

        this.idade += 1;
        System.out.println(this.nome + " fez aniversário, agora tem " + getIdade() + " anos");

    }

    public void crescerAltura() {

        this.altura += 0.01;
        System.out.println(this.nome + " cresceu em altura, agora tem " + getAltura() + " de altura");
    }

    public void engordar(){

        this.peso += 1;
        System.out.println(this.nome + " engordou, agora tem " + getPeso() + " kg");
    }

    public void emagracer() {

        this.peso = this.peso - 1;
        System.out.println(this.nome + " emagreceu, agora tem " + getPeso() + " kg");
    }

    public void calcularIMC(){

        imc = peso/ (altura*altura);
        System.out.println("O IMC da pessoa " + this.nome + " é " + imc);
    }



}
