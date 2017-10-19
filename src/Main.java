
public class Main {

	public static void main(String[] args) {
		//
		Chicles maquina1=new Chicles ("01-Planta-Parking",5); //creamos maquina pasandole los 2 parametros
		
		//Mostramos informacion antes de operar
		System.out.println("Información de la máquina antes de operar:");
		maquina1.mostrarInfo();
		System.out.println("*******************");
		
		//Metemos una moneda y mostramos información despues de ejecutar el método
		System.out.println("Información de la máquina después de meter una moneda:");
		maquina1.meterMoneda();
		maquina1.mostrarInfo();
		System.out.println("*******************");

		
		//Retiramos dinero y mostramos informaciónn después de ejecutar el método
		System.out.println("Información de la máquina después de retirar todas las monedas:");
		maquina1.retirarDinero();
		maquina1.mostrarInfo();
		System.out.println("*******************");

		
		//Ejecutamos mantenimiento y mostramos información
		System.out.println("Ejecutamos mantenimiento:");
		maquina1.ejecutarMantenimiento();
		maquina1.mostrarInfo();

	
	
	
	
	}

}
