package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception
    {
        //TODO: Importar a classe Scanner

        System.out.println("Hello world!");
        Scanner numeroConta = new Scanner(System.in);
        String numero;

        Scanner codigoAgencia = new Scanner(System.in);
        String agencia;

        Scanner nomeCliente = new Scanner(System.in);
        String nome;

        Scanner saldoConta = new Scanner(System.in);
        double saldo;

        System.out.print("Cliente: ");
        nome = nomeCliente.nextLine();

        System.out.print("Agência: ");
        agencia = codigoAgencia.nextLine();

        System.out.print("Número da Conta: ");
        numero = numeroConta.nextLine();

        System.out.print("Saldo - R$: ");
        saldo = Float.parseFloat(saldoConta.nextLine());

        System.out.println("Olá " + nome.toUpperCase() + " obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia.toUpperCase());
        System.out.println("Conta: " + numero);
        System.out.println("Saldo - R$: " + saldo);

    }
}


