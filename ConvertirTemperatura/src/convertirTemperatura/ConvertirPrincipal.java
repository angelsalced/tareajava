package convertirTemperatura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertirPrincipal {
	
	public static void main(String[] args)  {
		
		double grados = 0;
		int i=1;
		
		Scanner scanner = new Scanner(System.in);
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		
	
		while(i==1) {
		
			System.out.print("\n 1- Convertir de Celsius a Farenheit. \n 2- Convertir de Farenheit a Celsius.");
			System.out.println("\n\nIngrese digito de accion a realizar:");
			int metodo = scanner.nextInt();
	
			while(true) {
				try {System.out.println("\n\nIngrese grados a convertir:");
					grados = scanner.nextDouble();
					break;
				}	catch (InputMismatchException e) {
					System.out.println("\n\nVERIFIQUE EL USO DE COMA PARA LOS DECIMALES");
					scanner.next();}
				}
			
			
			conversorTemperatura.ingresarGrados(grados);		
		
			
			switch(metodo) {
				case 1:
					conversorTemperatura.celsiusAFahrenheit();
		
					double conversion = conversorTemperatura.obtenerConversion();
					System.out.println("\n\n" + grados + " grados Celsius es equivalente a " + conversion + " grados Farenheit");
					
					break;
					
				case 2: 		
					conversorTemperatura.fahrenheitACelsius();
					
					double conversion2 = conversorTemperatura.obtenerConversion();
					System.out.println("\n\n" + grados + " grados Farenheit es equivalente a " + conversion2 + " grados Celsius");
					
					break;
				}
			
			System.out.println("\n\nDeseas realizar otra conversion? \n1-Si.  \n2-No.");
			i=scanner.nextInt();
			}
		
		scanner.close();
		
		} }

