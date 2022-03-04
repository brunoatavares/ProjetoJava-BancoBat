package com.mycompany.projetoindividual;

import java.util.Locale;
import java.util.Scanner;

public class ServicosDaConta {

    void Deposito() {
        Scanner leitorNumerico = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual o valor do depósito:");
        Double depositoDigitado = leitorNumerico.nextDouble();

        Double Saldo = 0.00;
        Integer respostaUsuario;

        while (depositoDigitado != 0) {
            Double SaldoAtual = depositoDigitado + Saldo;
            Saldo++;
        }
        System.out.println("-".repeat(40));
        System.out.println("1 - Depósito \n2 - Saque\n3 - Saldo \n4 - Encerrar");
        System.out.println("-".repeat(40));
        respostaUsuario = leitorNumerico.nextInt();

    }

    void Saque() {
        Scanner leitorNumerico = new Scanner(System.in);
        System.out.println("Qual o valor do saque?");
        Double saqueDigitado = leitorNumerico.nextDouble();

    }

    void Saldo() {
        Scanner leitorNumerico = new Scanner(System.in);

    }

}
