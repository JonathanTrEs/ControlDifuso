
public class Valvula {

	final static private int MAX = 100;
	final static private int MIN = -25;
	
	public double abierto(double entrada) {
		double resultado = 0;
		if(entrada >= 0 && entrada <= 50)
			resultado = entrada/50;
		else if(entrada >= 50)
			resultado = 1;
		else
			resultado = 0;
		return resultado;
	}
	
	public double cerrado(double entrada) {
		double resultado = 0;
		if(entrada >= -25 && entrada <= 0)
			resultado = (25 + entrada)/25;
		else if(entrada >= 0 && entrada <= 25)
			resultado = (25 - entrada)/25;
		else
			resultado = 0;
		return resultado;
	}
}
