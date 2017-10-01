
public class Error {

	final static private int MAX = 15;
	final static private int MIN = -15;
	
	public Error(){
		
	}
	
	public double negativo(double entrada){
		double resultado;
		if(entrada >= -15 && entrada <= -10)
			resultado = 1;
		else if(entrada >= -10 && entrada <= 0)
			resultado = -entrada / 10;
		else
			resultado = 0;
		return resultado;		
	}
	
	public double cero(double entrada) {
		double resultado;
		if(entrada >= -5 && entrada <= 0)
			resultado = (5 + entrada)/5;
		else if(entrada >= 0 && entrada <= 5)
			resultado = (5-entrada)/5;
		else
			resultado = 0;
		return resultado;
	}
	
	public double positivo(double entrada) {
		double resultado;
		if(entrada >= 0 && entrada <= 10)
			resultado = entrada/10;
		else if(entrada >= 10 && entrada <= 15)
			resultado = 1;
		else
			resultado = 0;
		return resultado;
	}
}
