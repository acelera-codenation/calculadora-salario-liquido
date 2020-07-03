package br.com.codenation.calculadora;

/**
 * The type INSS.
 */
public class INSS implements Tributos {

    /**
     * 1500 8%
     * Acima 1500 9%
     * Acima 4000 11%
     * @param valorBase the valor base
     * @return valor do tributo a ser calculado;
     */
    @Override
    public double saldo(double valorBase) {
        if (valorBase <= 1500) return valorBase * 0.08;
        else if (valorBase > 1500 && valorBase <= 4000) return valorBase * 0.09;
        else return valorBase * 0.11;
    }
}
