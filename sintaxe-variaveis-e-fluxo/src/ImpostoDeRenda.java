
public class ImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			salario = salario - (salario * 0.075 + 142);
			//O IR é de 7,5% e pode ser deduzido R$ 142,00
			

		}else if (salario >= 2800.01 && salario <= 3751.0) {
			salario = salario - (salario * 0.15 ) + 350;
			//"O IR é de 15% e pode deduzir R$ 350,00"
			

		}else if (salario >= 3751.01 && salario <= 4664.00) {
			salario = salario - (salario * 0.225) + 636;
			//"O IR é de 22,5% e pode deduzir R$ 636,00"
		}

		System.out.println("Seu salário com IR deduzido é: " + salario);
		
	}

}
