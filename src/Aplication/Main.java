package Aplication;

import Entities.FamiliaIngresso;
import Entities.Ingresso;
import Entities.MeiaIngresso;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do filme dejesado");
        String nomeDoFilme = sc.nextLine();
        System.out.println("Digite o valor ingresso:");
        double valor = sc.nextDouble();
        sc.nextLine();

        int escolha;

        do {
            System.out.println("--- MENU ---");
            System.out.println("#1 - Ingresso comum");
            System.out.println("#2 - Ingresso meia");
            System.out.println("#3 - Ingresso familia");
            System.out.println("#0 - exit");
            System.out.print("Digite a opção: ");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1 -> {
                    var comum = new Ingresso(valor, nomeDoFilme);

                    System.out.println(comum);
                    System.out.println("Total a pagar: ");
                    System.out.println(comum.valorFinal());
                }
                case 2 -> {
                    var meia = new MeiaIngresso(valor, nomeDoFilme);

                    System.out.println(meia);
                    System.out.println("Total a pagar: ");
                    System.out.println(meia.valorFinal());
                }
                case 3 -> {
                    System.out.println("Serão quantas pessoas? ");
                    int pessoas = sc.nextInt();
                    sc.nextLine();

                    var familia = new FamiliaIngresso(valor, nomeDoFilme, pessoas);

                    System.out.println(familia);
                    System.out.println("Total a pagar: " + String.format("%.2f",familia.valorFinal()));
                }
                case 0 -> System.out.println("Fim do programa");
                default -> System.out.println("Operação invalida!");
            }

        } while (escolha != 0);

        System.out.println("OPERAÇÃO FINALIZADA!");

        sc.close();
    }
}