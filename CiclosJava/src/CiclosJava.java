import java.util.Scanner;

public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ciclo for
		 * for (variable de inicializacion; condicion de stop; variable++){
		 * codigo
		 * }
		 */
		
		/*
		 * Crear un metodo que reciba por parametro un número y nos muestre 
		 * la  tabla de multiplicar de ese número * Ejemplo: 
		 *  1 X 1 = 1 * 1 X 2 = 2 * 1 X 3 = 3 * ... * 1 X 10 = 10 
		 */
//		Scanner leerNumero = new Scanner(System.in);
//		System.out.println("Ingresa un numero: ");
//		int numero = leerNumero.nextInt();
		
//		Sumas(numero);
		
//		TablaMultiplicar(numero);
		
		/*
		 * Ciclo while
		 * 
		 * while (condicion){
		 * codigo
		 * codigo
		 * }
		 */
		
		System.out.println("¡Comienza el ciclo!");
		
		dowhile();
//		while1();
		

		
	}
	
	public static void while1() {

		System.out.println("WHILE");
		boolean numeros = true;
		int contadorCiclo = 0;
		Scanner leerNumero = new Scanner(System.in);
		
		while(numeros) {
			
			System.out.println("Ingresa el primer numero: ");
			float numero1 = leerNumero.nextFloat();
			
			System.out.println("Ingresa el segundo numero: ");
			float numero2 = leerNumero.nextFloat();
			
			if(numero1 == numero2) {
				numeros = false;
			} else {
				contadorCiclo++;
				System.out.println(contadorCiclo + " iteración del ciclo");
			}
			
		}
		
		System.out.println("¡Termina el ciclo!");
		System.out.println("Numero de iteraciones: " + contadorCiclo);
		leerNumero.close();
		
	}
	
	public static void dowhile() {
		System.out.println("DO WHILE");
		boolean numeros = true;
		int contadorCiclo = 0;
		Scanner leerNumero = new Scanner(System.in);
		
		do {
			
			
			System.out.println("Ingresa el primer numero: ");
			float numero1 = leerNumero.nextFloat();
			
			System.out.println("Ingresa el segundo numero: ");
			float numero2 = leerNumero.nextFloat();
			
			
			
			if(numero1 == numero2) {
				numeros = false;
			} else {
				contadorCiclo++;
				System.out.println(contadorCiclo + " iteración del ciclo");
			}
		}while(numeros);

		System.out.println("¡Termina el ciclo!");
		System.out.println("Numero de iteraciones: " + contadorCiclo);
		leerNumero.close();//Cerramos el scanner para que no lea mas datos
	}
	
	
	public static void Sumas(int numero) {
		
		int resultadoPares = 0;
		int resultadoImpares = 0;
		
	for (int i = 1; i <= numero; i++) {
		float parImpar = i % 2;
		if (parImpar == 0) {
				resultadoPares += i;
				
			}else {
				resultadoImpares += i;
			}
			
		}
		System.out.println("La suma de los pares: "+ resultadoPares);
		System.out.println("La suma de los impares: "+ resultadoImpares);
	}
	
	public static void TablaMultiplicar(int numero) {
		
		for(int i = 1; i <= 10; i++) {
			int resultado = numero * i;
		System.out.println(numero + " x " + i + " = " + resultado); 
		}
		
		}

	}


	
