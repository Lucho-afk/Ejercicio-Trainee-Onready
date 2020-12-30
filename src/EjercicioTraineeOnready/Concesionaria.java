package EjercicioTraineeOnready;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Concesionaria {
	
	private ArrayList<Vehiculos> lista;

	public Concesionaria(ArrayList<Vehiculos> lista) {
		this.lista = lista;
	}

	public ArrayList<Vehiculos> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Vehiculos> lista) {
		this.lista = lista;
	}
	
	public Vehiculos masCaro() {
		Vehiculos aux=this.lista.get(0);
		for (Vehiculos i: this.lista) {
			if(i.getPrecio()> aux.getPrecio()) {
				aux=i;
			}
		}
		return aux;
	}
	public Vehiculos masBarato() {
		Vehiculos aux=this.lista.get(0);
		for (Vehiculos i: this.lista) {
			if(i.getPrecio()< aux.getPrecio()) {
				aux=i;
			}
		}
		return aux;
	}
	public Vehiculos controlarLetra(char l) {
		Vehiculos aux=null;
		for (Vehiculos i: this.lista) {
			for(int j=0; j<i.getModelo().length(); j++) {
				if(i.getModelo().charAt(j)==l) {
					aux=i;
				}
			}
		}
		return aux;
	}
	
	public void ordenar(){
	        int i, j;
	        Vehiculos aux= null;
	        for (i = 0; i < this.lista.size() - 1; i++) {
	            for (j = 0; j < this.lista.size() - i - 1; j++) {
	                if (this.lista.get(j + 1).getPrecio() > this.lista.get(j).getPrecio()) {
	                    aux = this.lista.get(j + 1);
	                    this.lista.set(j + 1,this.lista.get(j));
	                    this.lista.set(j, aux);
	                }
	            }
	        }
	}
	public void mostrar() {
		
		
	}
	public void mostrarVehiculos() {
		DecimalFormat unidadDeMil = new DecimalFormat("###,###.00");
		for(Vehiculos i: this.lista) {
			if(i.getCilindrada()==null) {
				System.out.println("Marca: "+i.getMarca()+" // Modelo: "+i.getModelo()+" // Puertas: "+i.getPuerta()+" // precio: $ "+unidadDeMil.format(i.getPrecio()));
			}else {
				System.out.println("Marca: "+i.getMarca()+" // Modelo: "+i.getModelo()+" // Cilindrada:"+i.getCilindrada()+" // precio: $ "+unidadDeMil.format(i.getPrecio()));
				
			}
		}
	}
	
}
