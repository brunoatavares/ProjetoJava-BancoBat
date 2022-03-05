package com.mycompany.projetoindividual;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ServicosDaConta {

    // Variável global e o leitor dos campos de input
    Double SaldoAtual = 0.00;
    Scanner leitorNumerico = new Scanner(System.in);

    // Validando o método do [1] Depósito
    void Deposito() {
        Locale.setDefault(Locale.US);

        Double depositoDigitado = 1.00;

        while (depositoDigitado != 0) {
            System.out.println("Qual o valor do depósito:");
            depositoDigitado = leitorNumerico.nextDouble();
            SaldoAtual = depositoDigitado + SaldoAtual;

        }
        System.out.println("Depósito realizado com sucesso!");

    }

    // Validando o método do [2] Saque
    void Saque() {
        Locale.setDefault(Locale.US);

        System.out.println("Qual o valor do saque?");
        Double saqueDigitado = leitorNumerico.nextDouble();

        if (saqueDigitado <= SaldoAtual && saqueDigitado != 0) {
            SaldoAtual = SaldoAtual - saqueDigitado;
        } else {
            System.out.println(String.format("Saldo inválido!! \n Seu saldo é: %.2f", SaldoAtual));
        }

    }

    // Validando o método do [3] Saldo
    void Saldo() {
        System.out.printf("Seu saldo: %.2f \n", SaldoAtual);

    }

    // Validando o método do [5] Investir
    void Trade() {
        System.out.println("-".repeat(40));
        System.out.println(">> Investir nunca foi tão fácil <<");
        System.out.println("Qual o valor do investimento?");
        Double valorInvestimento = leitorNumerico.nextDouble();
        System.out.println("-".repeat(40));

        if (valorInvestimento <= SaldoAtual && SaldoAtual != 0) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 3);
            if (numeroSorteado != 1) {
                SaldoAtual = SaldoAtual - valorInvestimento;
                System.out.println(String.format("Você perdeu! \nSeu saldo atual é: %.2f \n"
                        + "Tente Novamente!", SaldoAtual));
            } else {
                SaldoAtual = SaldoAtual + valorInvestimento;
                System.out.println(String.format("Parabéns, você acertou e lucrou! \n"
                        + "Saldo Atual: %.2f \n"
                        + "Investir Novamente!", SaldoAtual));
            }
        } else {
            System.out.printf("Saldo Inválido! \nSaldo Atual: %.2f\n", SaldoAtual);
        }
    }
}
