package examen;

public class ArregloLongitudes {
	private double longitud[];
	private int indice;

	public ArregloLongitudes() {
		longitud = new double[10];
		indice = 0;
	}

	public int tama�o() {
		return indice;
	}

	public double obtener(int p) {
		return longitud[p];
	}

	public void adicionar(double lon) {
		if (indice == tama�o())
			ampliarArreglo();
		longitud[indice] = lon;
		indice++;
	}

	private void ampliarArreglo() {
		double aux[] = longitud;
		longitud = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			longitud[i] = aux[i];
	}
	
	public int posicionPrimeraLongitudMayor120() {
		for(int i=0;i<indice;i++) {
			if(longitud[i] > 120) {
				return i;	
			}
		}
		return -1;
	}
	
	public double sumarLongitudes() {
		double suma = 0;
		for(int i=0;i<indice;i++) {
			suma += longitud[i];
		}
		return suma;
    }
	
	//Como pidi� que retorne true o false , puse los metodos reemplazar y incrementar en boolean.
	
	public boolean reemplazarLongitudMayor120() {
	    int pos = posicionPrimeraLongitudMayor120();
	    if (pos != -1) {
	        longitud[pos] = sumarLongitudes();
	        return true;
	    }else {
	    	return false;
	    }
	}
	
	public boolean incrementarLongitudMayor120() {
		int pos = posicionPrimeraLongitudMayor120();
		if(pos != -1) {
			longitud[pos] += 0.25 * longitud[0];
			return true;
		}else {
			return false;	
		}
	}
	
	public void intercambiarLongitudes() {
		int pos = posicionPrimeraLongitudMayor120();
		if(pos != -1) {
			double posTemporal = longitud[pos];	
			longitud[pos] = longitud[indice - 1];
			longitud[indice - 1] = posTemporal;
		}
	}
	//No coloque nada en la clase Problema_2.java como pidi�.
}
