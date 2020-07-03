package br.com.codenation.calculadora;

public class IRRF implements Tributos {


    /**
     * 3000 1
     * Acima 3000 7.5
     * Acimar 6000 15%
     *
     * @param valorBase the valor base
     * @return valor do tributo a ser cobrado
     */
    @Override
    public double saldo(double valorBase) {
        if (valorBase <= 3000) return 0;
        else if (valorBase > 3000 && valorBase <= 6000) return valorBase * 0.075;
        else return valorBase * 0.15;
    }
}
