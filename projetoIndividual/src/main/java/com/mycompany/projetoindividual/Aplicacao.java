package com.mycompany.projetoindividual;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner leitorNumerico = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        // Valores corretos
        Integer agenciaCorreta = 1175;
        String contaCorreta = "05397";
        Integer senhaCorreta = 1234;
        Boolean logado = false;

        // Mensagem Inicial
        System.out.println("-".repeat(40));
        System.out.println("  Banco Bat - Desenvolvido para você!");
        System.out.println("-".repeat(40));

        // Captação 
        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorString.nextLine();
        System.out.println("Agência:");
        Integer agenciaDigitada = leitorNumerico.nextInt();
        System.out.println("Conta:");
        Integer contaDigitada = leitorNumerico.nextInt();

        // Validações dos campos inseridos pelo usuário
        while (!agenciaCorreta.equals(agenciaDigitada) && !contaCorreta.equals(contaDigitada)) {

            System.out.println("Agência e/ou Conta inválida! \n"
                    + "Confira os valores no verso do seu cartão.\n\n");
            System.out.println("Digite seu nome:");
            nomeDigitado = leitorString.nextLine();
            System.out.println("Agência:");
            agenciaDigitada = leitorNumerico.nextInt();
            System.out.println("Conta:");
            contaDigitada = leitorNumerico.nextInt();

        }
        System.out.println("Logado com Sucesso!");

        Integer respostaUsuario = 0;
        ServicosDaConta deposito = new ServicosDaConta();

        while (respostaUsuario != 4) {
            System.out.println("-".repeat(40));
            System.out.println(String.format("Seja Bem Vindo, %s! \n"
                    + "1 - Saldo \n2 - Saque\n3 - Depósito\n4 - Encerrar", nomeDigitado));
            System.out.println("-".repeat(40));
            respostaUsuario = leitorNumerico.nextInt();

            switch (respostaUsuario) {
                case 1:
                    deposito.Deposito();
                    break;
                case 2:
                    deposito.Saque();
                    break;
                case 3:
                    deposito.Saldo();
                    break;
                case 4:
                    System.out.println("-".repeat(40));
                    System.out.println("Muito obrigado por utilizar nossos serviços!! \n"
                            + "Banco Bat, feito para você!");
                    System.out.println("-".repeat(40));
                    respostaUsuario = 4;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
