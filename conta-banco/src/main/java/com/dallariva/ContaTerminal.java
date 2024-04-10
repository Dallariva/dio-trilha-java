package com.dallariva;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o seu nome!");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o número da Agência! ");
    String agencia = scanner.nextLine();

    System.out.println("Por favor, digite o número da Conta! ");
    int numero = scanner.nextInt();

    System.out.println("Por favor, digite o seu saldo!");
    double saldo = scanner.nextDouble();

    DecimalFormat df = new DecimalFormat("###,###.00");
    String saldoCliente = df.format(saldo);

    String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(
        String.valueOf(numero)).concat(" e seu saldo $").concat(saldoCliente).concat(" já está disponível para saque.");

    System.out.println(mensagem);
  }
}