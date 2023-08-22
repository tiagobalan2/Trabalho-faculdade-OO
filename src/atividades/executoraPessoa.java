package atividades;

import java.util.Scanner;

public class executoraPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolhaObjeto;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Criar aluno");
            System.out.println("3 - Criar professor");
            System.out.println("4 - Sair");
            escolhaObjeto = scanner.nextInt();

            switch (escolhaObjeto) {
                case 1:
                    criarPessoa();
                    break;
                case 2:
                    criarAluno();
                    break;
                case 3:
                    criarProfessor();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (escolhaObjeto != 4);

    }

    public static void criarPessoa() {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o genero da pessoa: ");
        String sexo = scanner.nextLine();
        pessoa.setSexo(sexo);
        System.out.print("Digite a altura da pessoa: ");
        float altura = scanner.nextFloat();
        pessoa.setAltura(altura);
        System.out.print("Digite o peso da pessoa: ");
        float peso = scanner.nextFloat();
        pessoa.setPeso(peso);

        //Pessoa pessoa = new Pessoa(nome, idade, sexo, altura, peso);
        System.out.println("Pessoa criada");

        int escolhaMetodo;

        do {
            System.out.println("Escolha uma opção para essa pessoa");
            System.out.println("1 - Escolha essa opção se deseja exibir as informações dessa pessoa");
            System.out.println("2 - Escolha essa opção se essa pessoa esta fazendo aniversário");
            System.out.println("3 - Escolha essa opção se essa pessoa cresceu na altura");
            System.out.println("4 - Escolha essa opção se essa pessoa engordou");
            System.out.println("5 - Escolha essa opção se essa pessoa emagreceu");
            System.out.println("6 - Escolha essa opção se deseja calcular o IMC dessa pessoa");
            System.out.println("7 - Escolha essa opção se deseja voltar");
            escolhaMetodo = scanner.nextInt();

            switch (escolhaMetodo) {
                case 1:
                    pessoa.ExibirInformações();
                    break;
                case 2:
                    pessoa.fazerAniversário();
                    break;
                case 3:
                    pessoa.crescerAltura();
                    break;
                case 4:
                    pessoa.engordar();
                    break;
                case 5:
                    pessoa.emagracer();
                    break;
                case 6:
                    pessoa.calcularIMC();
                    break;
                case 7:
                    System.out.println("Voltando ao menu principal");
                    break;
            }
        } while (escolhaMetodo != 7);
    }



    public static void criarAluno() {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        aluno.setNome(nome);
        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        aluno.setIdade(idade);
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o gênero do aluno: ");
        String sexo = scanner.nextLine();
        aluno.setSexo(sexo);
        System.out.print("Digite a altura do aluno: ");
        float altura = scanner.nextFloat();
        aluno.setAltura(altura);
        System.out.print("Digite o peso do aluno: ");
        float peso = scanner.nextFloat();
        aluno.setPeso(peso);

        System.out.println("Dgite a matricula do aluno: ");
        long matricula = scanner.nextLong();
        aluno.setMatricula(matricula);
        System.out.println("Digite a primeira nota do aluno: ");
        int nota1 = scanner.nextInt();
        aluno.setNota1(nota1);
        System.out.println("Digite a segunda nota do aluno: ");
        int nota2 = scanner.nextInt();
        aluno.setNota2(nota2);
        System.out.println("Digite a terceira nota do aluno: ");
        int nota3 = scanner.nextInt();
        aluno.setNota3(nota3);
        System.out.println("Digite a quarte nota do aluno: ");
        int nota4 = scanner.nextInt();
        aluno.setNota4(nota4);

        //Aluno aluno= new Aluno(nome, idade, sexo, altura, peso, matricula, nota1, nota2, nota3, nota4);
        System.out.println("Aluno criado");

        int escolhaMetodo;

        do {
            System.out.println("Escolha uma opção para esse aluno");
            System.out.println("1 - Escolha essa opção se deseja exbir as informações desse aluno");
            System.out.println("2 - Escolha essa opção se esse aluno esta fazendo aniversário");
            System.out.println("3 - Escolha essa opção se esse aluno cresceu na altura");
            System.out.println("4 - Escolha essa opção se esse aluno engordou");
            System.out.println("5 - Escolha essa opção se esse aluno emagreceu");
            System.out.println("6 - Escolha essa opção se deseja calcular o IMC desse aluno");
            System.out.println("7 - Escolha essa opção se deseja calcular a media/notafinal desse aluno");
            System.out.println("8 - Escolha essa opção se deseja visualizar se o aluno está aprovado, de recuperação ou reprovado");
            System.out.println("9 - Escolha essa opção se deseja voltar");
            escolhaMetodo = scanner.nextInt();

            switch (escolhaMetodo) {
                case 1:
                    aluno.exibirAluno();
                    break;
                case 2:
                    aluno.fazerAniversário();
                    break;
                case 3:
                    aluno.crescerAltura();
                    break;
                case 4:
                    aluno.engordar();
                    break;
                case 5:
                    aluno.emagracer();
                    break;
                case 6:
                    aluno.calcularIMC();
                    break;
                case 7:
                    aluno.calcularMediaNotas();
                    break;
                case 8:
                    aluno.alunoAprovado();
                    break;
                case 9:
                    System.out.println("Voltando ao menu principal");
                    break;
            }
        } while (escolhaMetodo != 9);
    }

    public static void criarProfessor() {
        Scanner scanner = new Scanner(System.in);

        Professor professor = new Professor();

        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        professor.setNome(nome);
        System.out.print("Digite a idade do professor: ");
        int idade = scanner.nextInt();
        professor.setIdade(idade);
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o gênero do professor: ");
        String sexo = scanner.nextLine();
        professor.setSexo(sexo);
        System.out.print("Digite a altura do professor: ");
        float altura = scanner.nextFloat();
        professor.setAltura(altura);
        System.out.print("Digite o peso do professor: ");
        float peso = scanner.nextFloat();
        professor.setPeso(peso);
        scanner.nextLine();
        System.out.println("Digite a área de ensino do professor: ");
        String areaDeEnsino = scanner.nextLine();
        professor.setAreaDeEnsino(areaDeEnsino);

        // Professor professor = new Professor(nome, idade, sexo, altura, peso, areaDeEnsino);
        System.out.println("Professor criado");



        int escolhaMetodo;

        do {
            System.out.println("Escolha uma opção para esse professor");
            System.out.println("1 - Escolha essa opção se deseja exbir as informações desse professor");
            System.out.println("2 - Escolha essa opção se esse professor esta fazendo aniversário");
            System.out.println("3 - Escolha essa opção se esse professor cresceu na altura");
            System.out.println("4 - Escolha essa opção se esse professor engordou");
            System.out.println("5 - Escolha essa opção se esse professor emagreceu");
            System.out.println("6 - Escolha essa opção se deseja calcular o IMC desse professor");
            System.out.println("7 - Escolha essa opção se o professor esta fazendo chamada");
            System.out.println("8 - Escolha essa opçao se o professor esta tirando duvida de um aluno");
            System.out.println("9 - Escolha essa opção se deseja voltar");
            escolhaMetodo = scanner.nextInt();

            switch (escolhaMetodo) {
                case 1:
                    professor.ExibirInformações();
                    break;
                case 2:
                    professor.fazerAniversário();
                    break;
                case 3:
                    professor.crescerAltura();
                    break;
                case 4:
                    professor.engordar();
                    break;
                case 5:
                    professor.emagracer();
                    break;
                case 6:
                    professor.calcularIMC();
                    break;
                case 7:
                    professor.fazerChamada();
                    break;
                case 8:
                    professor.tirarDuvida();
                    break;
                case 9:
                    System.out.println("Voltando ao menu");
                    break;
            }
        } while (escolhaMetodo != 9);
    }




}

