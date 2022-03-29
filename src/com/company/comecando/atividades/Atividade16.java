package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o tamanho,em metros quadrados, da área desejada:  ");
        double TamanhoEmMetrosQuadrados = scanner.nextDouble();
        int QuantidadeDeLitrosPorMetros = 3;
        int QuantidadeDeLataporTinta = 18;
        int PreçoDaLata = 80;
        double CoberturaDaTinta = TamanhoEmMetrosQuadrados / QuantidadeDeLitrosPorMetros;
        double QuantidadeDeLata = CoberturaDaTinta / QuantidadeDeLataporTinta;
        double PreçoTotal = QuantidadeDeLata * PreçoDaLata;
        double QuantidadeDeLataArrendodado = Math.ceil(QuantidadeDeLata);
        System.out.println("A quantidade de latas é: " + QuantidadeDeLataArrendodado);
        System.out.print("O preço total é: " + PreçoTotal);
        scanner.close();
    }
}
