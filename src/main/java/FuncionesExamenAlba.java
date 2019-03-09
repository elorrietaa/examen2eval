import java.util.Scanner;

public class FuncionesExamenAlba {

	public boolean estaLleno(int numero) {
		boolean siEstaLleno=false;
		
		if(numero>20)
		{
			siEstaLleno=true; 
			System.out.println("La clase esta llena.");
		}
		else
		{
			siEstaLleno=false;
		}
		
		return siEstaLleno;
	}
//???????????	
/*	public void addAlumno(Alumno alumnos, int numero) {
		if (numero<alumnos.length) {
			alumnos[numero]=alumnos;
			numero++;
			
		}
		else {
			System.out.println("El alumno no puede matricularse");
		}
	}
*/	
	
// no pasa el array alumno por parámetro?? entonces como lo encuentro=
	public int buscarAlumno(Alumno[] alumnos, int codigoIntroducido) { //buscar el alumno por codigo
		int posicionArrayAlumno=-1;
		for(int i=0;i<alumnos.length;i++)
		{
			if(alumnos[i].getCod_alumno()==codigoIntroducido)
			{
				System.out.println("Alumno encontrado.");							
				posicionArrayAlumno=i;
			}
		}
		return posicionArrayAlumno;
	}
	
	
	
	public void ordenar(Alumno [] alumnos) {
		        for(int i=alumnos.length; i>0;i--) {
		            for(int j=0;j<i-1;j++) {
		            	
		                if (alumnos[j].getNotaFinal()>alumnos[j+1].getNotaFinal()) {
		                    double aux;
		                    aux=alumnos[j+1].getNotaFinal();
		                    double dinero=alumnos[j].getNotaFinal();
		                    alumnos[j+1].setNotaFinal(dinero);
		                    alumnos[j].setNotaFinal(aux);
		                }
		            }
		        }
		        System.out.println("--------------------------------------------");
		        System.out.println("La nota final de todos los alumnos ORDENADA EN DESCENDENTE ES:");
		        for(int i=0;i<alumnos.length; i++) {
		        	System.out.println(alumnos[i].getNotaFinal());
		        }
		        System.out.println("--------------------------------------------");
		    }

	 public void borrar(Alumno [] alumnos, int posicion) {
	    	//para quitar la posición 2
	    	Alumno[] alumnosEliminarPos = new Alumno [alumnos.length-1];
	    	
	    	for(int i=0;i<alumnos.length-1;i++) {
	    		if(posicion>i)
	    		{
	    			alumnosEliminarPos [i] = alumnos[i];
	    		}
	    		if(i==posicion)
	    		{
	    			alumnosEliminarPos[i] = alumnos[i+1];
	    		}
	    		else {
	    			alumnosEliminarPos [i] = alumnos[i+1];
	    		}
	    		
	    }
	    	
	    	
	    	for(int i=0;i<alumnosEliminarPos.length;i++) {
	    		System.out.println("Eliminada la posicion:"+alumnosEliminarPos [i]);
	    	}
	    	
	    	
	    }
	/* 
	public void borrarAinhoa(int posicion) {
		for(int pos=posicion;pos<alumnos.length-1;pos++) {
			if(alumnos[f]!null) {
				System.out.println();
			}
		}
	}
*/
	 
	
	
	public void listarAlumnos(Alumno [] alumnos) {
		System.out.println("Los datos de los alumnos registrados son:");
		System.out.println("Nombre:");
		System.out.println("--------------------------------------------");
		for(int i=0;i<alumnos.length;i++) {
			System.out.println(alumnos[i].getNombre());
		}
		System.out.println("--------------------------------------------");
	}
	
	
}
