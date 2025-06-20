package Entities;

public class FamiliaIngresso extends Ingresso {
    private int pessoas;

    public FamiliaIngresso(double valorIngresso, String nomeDoFilme, int pessoas) {
        super(valorIngresso, nomeDoFilme);
        this.pessoas = pessoas;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String dubladoOuLegendado() {
        return super.dubladoOuLegendado();
    }

    @Override
    public double valorFinal() {
        double valorFinal = 0.0;
        if (pessoas > 3) {
           valorFinal = super.getValorIngresso() * pessoas * 0.95;
        }
        else {
            valorFinal = getValorIngresso() * pessoas;
        }
        return valorFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
