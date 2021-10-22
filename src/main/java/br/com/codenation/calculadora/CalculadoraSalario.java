package br.com.codenation.calculadora;


public class CalculadoraSalario {

//    public static void main(String[] args) {
//     double salarioLiquido = calcularInss();
//     double salarioFinal = CalculadoraSalario.calcularSalarioLiquido(salarioLiquido);
//     System.out.println("salário líquido final de R$ " + salarioFinal);
//    }

	public long calcularSalarioLiquido(double salarioBase) {
        double salarioComDescontoINSS = calcularInss(salarioBase);
        if (salarioBase < 1039.00) {
            return (long) 0.0;            
        }
        if (salarioComDescontoINSS <= 3000.00) {
            return Math.round(salarioComDescontoINSS);    
        } else if (salarioComDescontoINSS > 6000.00) {
            return Math.round(salarioComDescontoINSS * 0.85);    
        } else {
            return Math.round(salarioComDescontoINSS * 0.925);
        }
	}
        	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
        if (salarioBase <= 1500.00) {
            return (salarioBase * 0.92);    
        } else if (salarioBase > 4000.00) {
            return (salarioBase * 0.89);    
        } else {
            return (salarioBase * 0.91);
       	}
    }
}

/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/
