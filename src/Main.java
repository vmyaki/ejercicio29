
public class Main {

	public static void main(String[] args) {
		//
		Chicles maquina1=new Chicles ("01-Planta-Parking",5); //creamos maquina pasandole los 2 parametros
		
		//Mostramos informacion antes de operar
		System.out.println("Informaci�n de la m�quina antes de operar:");
		maquina1.mostrarInfo();
		System.out.println("*******************");
		
		//Metemos una moneda y mostramos informaci�n despues de ejecutar el m�todo
		System.out.println("Informaci�n de la m�quina despu�s de meter una moneda:");
		maquina1.meterMoneda();
		maquina1.mostrarInfo();
		System.out.println("*******************");

		
		//Retiramos dinero y mostramos informaci�nn despu�s de ejecutar el m�todo
		System.out.println("Informaci�n de la m�quina despu�s de retirar todas las monedas:");
		maquina1.retirarDinero();
		maquina1.mostrarInfo();
		System.out.println("*******************");

		
		//Ejecutamos mantenimiento y mostramos informaci�n
		System.out.println("Ejecutamos mantenimiento:");
		maquina1.ejecutarMantenimiento();
		maquina1.mostrarInfo();

	
	
	
	
	}

}
