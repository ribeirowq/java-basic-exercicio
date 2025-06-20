package Entities;

import java.util.Random;
import java.util.Scanner;

public class Ingresso {
    private static Scanner sc = new Scanner(System.in);

    private double valorIngresso;
    private String nomeDoFilme;


    public Ingresso() {
    }

    public Ingresso(double valorIngresso, String nomeDoFilme) {
        this.valorIngresso = valorIngresso;
        this.nomeDoFilme = nomeDoFilme;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String dubladoOuLegendado(){
        String[] escolhas = {" (Dublado) ", " (Legendado) "};
        String dubladoOuLegendado = escolhas[new Random().nextInt(escolhas.length)];

        return dubladoOuLegendado;
    }

    public double valorFinal(){
        return valorIngresso;
    }

    @Override
    public String toString() {
        return "Filme: " + nomeDoFilme + dubladoOuLegendado() +
        "\nValor unitário: R$ " + String.format("%.2f", valorIngresso);

    }
}
