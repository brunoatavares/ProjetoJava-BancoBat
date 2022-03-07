package com.mycompany.projetoindividual;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Validando leitores 
        Scanner leitorNumerico = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        // Mensagem Inicial
        System.out.println("-".repeat(73));
        System.out.println("Simplifique a sua vida, faça parte do Banco Bat - Desenvolvido para você!\n"
                + "          $$  Soluções simples, seguras e 100% digitais.  $$");
        System.out.println("-".repeat(73));

        // Valores corretos
        Integer agenciaCorreta = 1175;
        String contaCorreta = "05397-2";
        Integer senhaCorreta = 1234;

        // Captação 
        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorString.nextLine();
        System.out.println("Agência:");
        Integer agenciaDigitada = leitorNumerico.nextInt();
        System.out.println("Conta:");
        String contaDigitada = leitorNumerico.nextLine();
        leitorString.nextLine();

        // Validações dos campos inseridos pelo usuário
        while (!agenciaCorreta.equals(agenciaDigitada) && !contaCorreta.equals(contaDigitada)) {

            System.out.println("Agência e/ou Conta inválida! \n"
                    + "Confira os valores no verso do seu cartão.\n\n");
            System.out.println("Digite seu nome:");
            nomeDigitado = leitorString.nextLine();
            System.out.println("Agência:");
            agenciaDigitada = leitorNumerico.nextInt();
            System.out.println("Conta:");
            contaDigitada = leitorNumerico.nextLine();
            leitorString.nextLine();
        }
        // Mensagem OK
        System.out.println("Logado com Sucesso!");

        Integer respostaUsuario = 0;
        ServicosDaConta deposito = new ServicosDaConta();

        // Menu 
        while (respostaUsuario != 4) {
            System.out.println("-".repeat(73));
            System.out.println(String.format("Seja Bem Vindo, %s! \n"
                    + "[1] - Depósito \n[2] - Saque\n[3] - Saldo \n[4] - Encerrar\n"
                    + "[5] - Investir", nomeDigitado));
            System.out.println("-".repeat(73));
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
                // Validando o comando [4] Encerrar/Sair
                case 4:
                    System.out.println("-".repeat(40));
                    System.out.println("Muito obrigado por utilizar nossos serviços!! \n"
                            + "Banco Bat, desenvolvido para você!");
                    System.out.println("-".repeat(40));
                    respostaUsuario = 4;
                    break;
                case 5:
                    deposito.Trade();
                    break;
                default:
                    System.out.println("Opção inválida! \nTente Novamente!");

            }
        }
    }
}
