package Entities;

public class MeiaIngresso extends Ingresso{
    public MeiaIngresso(double valorIngresso, String nomeDoFilme) {
        super(valorIngresso, nomeDoFilme);
    }

    @Override
    public String dubladoOuLegendado() {
        return super.dubladoOuLegendado();
    }

    @Override
    public double valorFinal() {
        return super.valorFinal() / 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

