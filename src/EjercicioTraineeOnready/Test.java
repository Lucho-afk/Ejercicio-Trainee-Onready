package EjercicioTraineeOnready;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Vehiculos> lista= new ArrayList<Vehiculos>();
		
		Vehiculos ve1= new Vehiculos("Peugot","206",4,200000d);
		Vehiculos ve2= new Vehiculos("Honda","Titan","125cc",60000.d);
		Vehiculos ve3= new Vehiculos("Peugot","208",5,250000d);
		Vehiculos ve4= new Vehiculos("Yamaha","YBR","160cc",80500.50d);
		DecimalFormat unidadDeMil = new DecimalFormat("###,###.00");
		
		lista.add(ve1);lista.add(ve2);lista.add(ve3);lista.add(ve4);
		Concesionaria co1= new Concesionaria(lista);
		
		
		co1.mostrarVehiculos();
		System.out.println("=============================");
		System.out.println("Vehiculo mas caro:"+co1.masCaro().getMarca()+" "+co1.masCaro().getModelo());
		System.out.println("Vehiculo mas barato:"+co1.masBarato().getMarca()+" "+co1.masBarato().getModelo());
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y':"+co1.controlarLetra('Y').getMarca()+" "+co1.controlarLetra('Y').getModelo()+" $"+unidadDeMil.format(co1.controlarLetra('Y').getPrecio()));
		
		
		co1.ordenar();
		System.out.println("=============================");
		System.out.println("vehiculos ordenados por precio de mayor a menor");
		for(Vehiculos i: co1.getLista()) {
			System.out.println(i.getMarca()+" "+i.getModelo());
		}
	}

}
