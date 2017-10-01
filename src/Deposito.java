
public class Deposito {
	
	final static int ALTURA = 20;
	final static double ENTRADA = 0.4;
	final static double SALIDA = 0.1;
	final static double ITERACIONES = 5*3600;
	
	private Error error;
	private Valvula valvula;
	
	public Deposito(){
		error = new Error();
		valvula = new Valvula();
	}
	
	public void programa(){
		int tiempo = 0;
		double altura = 19;
		double volumen = 1900;
		double porcentajeError =  ALTURA - altura;
		double porcentajeApertura = 0;
		
		double errorNegativo = 0;
		double errorCero = 0;
		double errorPositivo = 0;
		
		double numerador = 0;
		double denominador = 0;
		
		double aux = 0;
		
		
		
		for(int i = 0; i < ITERACIONES; i++) {
			errorNegativo = error.negativo(porcentajeError);
			errorCero = error.cero(porcentajeError);
			errorPositivo = error.positivo(porcentajeError);
			
			for(int j = -25; j < 100; j += 125 / 9) {
				
				aux = maximo(minimo(valvula.cerrado(j), errorNegativo),
						minimo(valvula.cerrado(j), errorCero),
						minimo(valvula.abierto(j), errorPositivo));
				numerador += aux*j;
				denominador += aux;
			}
			porcentajeApertura = numerador /denominador;
			volumen = volumen - SALIDA + (ENTRADA*(porcentajeApertura/100));
			altura = volumen/100;
			porcentajeError = ALTURA - altura;
			System.out.println("hola que hace " + porcentajeApertura + " " +altura);
		}
	}
	public double minimo(double a, double b) {
		double resultado = 0;
		if(a <= b)
			resultado = a;
		else
			resultado = b;
		return resultado;
	}
	
	public double maximo(double a, double b, double c){
		double resultado = 0;
		if(a <= b)
			if(b <= c)
				resultado = c;
			else
				resultado = b;
		else
			if(a <= c)
				resultado = c;
			else
				resultado = a;		
		return resultado;
	}
}
