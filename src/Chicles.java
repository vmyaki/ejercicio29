
public class Chicles {
	//Atributos
	private String nombre; // con private aseguramos que no se pueden modificar los atributos desde main
	private int numMaximoChicles;
	private int numActualChicles;
	private int numMonedas;
	
	//Constructor pasandole 2 parametros
	public Chicles(String nombre,int maxChicles){
		this.nombre=nombre;
		this.numMaximoChicles=maxChicles;
		this.numActualChicles=maxChicles;
		this.numMonedas=0;
		
	}
	
	//M�todos
	
	//Meter moneda
	public void meterMoneda() { 
		this.numMonedas+=1; //sumamos una moneda
		this.numActualChicles-=1; //restamos un chicle
		
	}
	
	//Retirar dinero
	public void retirarDinero() {
		this.numMonedas=0; // retiramos todas la monedas, por lo tanto se queda a 0
	}
	
	//Ejecutar mantenimiento
	public void ejecutarMantenimiento() {
		int numChiclesRepuestos=0; //variable para calcular los chicles repuestos
		numChiclesRepuestos=this.numMaximoChicles-this.numActualChicles; //calculo para los chicles repuestos
		this.numActualChicles=this.numMaximoChicles; //ponemos la maquina a su capacidad m�xima de chicles
		
		System.out.println("Se ha repuesto "+numChiclesRepuestos+" chicles en la m�quina.");
		System.out.println("Se han retirado "+numMonedas+ " moneda de la m�quina" );
		
		this.retirarDinero(); //ponemos la m�quina a 0 de monedas
	}
	
	//Mostrar informacion de la maquina
	public void mostrarInfo() {
		System.out.println("Nombre de la m�quina "+this.nombre);
		System.out.println("N�mero m�ximo de chicles "+this.numMaximoChicles);
		System.out.println("Numero actual de chicles "+this.numActualChicles);
		System.out.println("N�mero de monedas "+this.numMonedas);
	}
}
