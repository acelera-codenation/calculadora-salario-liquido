package br.com.codenation.calculadora;

/**
 * The type Calculadora salario.
 */
public class CalculadoraSalario {

    private final double SALARIO_MINIMO = 1039;
    private final Tributos inss = new INSS();
    private final Tributos irrf = new IRRF();

    /**
     * Calcular salario liquido long.
     *
     * @param salarioBase the salario base
     * @return the long
     */
    public long calcularSalarioLiquido(double salarioBase) {
        //Use o Math.round apenas no final do método para arredondar o valor final.
        //Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-

        if (salarioBase < SALARIO_MINIMO) return 0;

        salarioBase -= inss.saldo(salarioBase);
        salarioBase -= irrf.saldo(salarioBase);
        return Math.round(salarioBase);
    }
}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/