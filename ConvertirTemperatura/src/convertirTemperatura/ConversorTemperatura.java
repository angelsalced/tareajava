package convertirTemperatura;

public class ConversorTemperatura {
	
	private double grados;
	private double conversion;

	public double celsiusAFahrenheit() {
		return conversion = (grados * 9/5) + 32;
	}
	
	public double fahrenheitACelsius() {	
		return conversion = (grados - 32) * 5/9;
	}
	
	public void ingresarGrados(double grados) {
		this.grados = grados;
	}
		
	public double obtenerConversion() {
		return conversion;
	}
	
}
