import java.util.Scanner;

public class Bonus_maestro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salario = 0;
		double bonus = 0; 
		double salario_minimo = 172.87;
		double puntos = 0;
		
		System.out.println("Ingrese los puntos optenidos: ");
		puntos = entrada.nextDouble();
		
		System.out.println("De cuanto es tu salario: ");
		salario = entrada.nextDouble();
		
		if (puntos >0 && puntos < 100) {
			bonus = (salario + salario_minimo);
			System.out.println("1");
				
		} else if (puntos >= 101 && puntos <= 150) {
			bonus = ((2 * salario_minimo) + salario); 
			System.out.println("2");
				
		} else {
			bonus = ((3 * salario_minimo) + salario); 
			System.out.println("3");
			
		} // fin del if else
		
		System.out.println("Los puntos optenidos fueron: " + puntos);
		System.out.println("Tu bonus es de: " + bonus);

	}

}
