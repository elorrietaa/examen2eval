import java.util.Scanner;

public class MainExamenAlba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionesExamenAlba funciones = new FuncionesExamenAlba();
		LeerDatos leerDatos = new LeerDatos();
		Scanner reader = new Scanner(System.in);
		
			
		 //declaración e inicialización de variables:
	
		int codigoIntroducido=0;
		int posicionArrayAlumno;
		int cod_Asignatura;
		int posicion;
		String nombre;
		boolean continuar=false;
		boolean estaLleno=false;
		boolean existe=false;
		System.out.println("-------------------------------1.Introduzca asignaturas---------------");
		cod_Asignatura = leerDatos.RecogerOpcionInt(reader, 0, 21, "Introduzca código asignatura");
		nombre=leerDatos.IntroducirTexto(reader, "Introduzca su nombre:");
		Asignatura asignatura1 = new Asignatura(cod_Asignatura, nombre);
		System.out.println("-------------------------------2. Matricular Alumno---------------");
		Alumno alumno1 = new Alumno(1);
		Alumno alumno2 = new Alumno(2);
		Alumno alumno3 = new Alumno(3, "Alba");
		Alumno alumno4 = new Alumno(4, "Juan");
		Alumno alumno5 = new Alumno(5, "Ana", 10, 5, 3);
		Alumno alumno6 = new Alumno(6, "Luis", 10, 5, 3);
	
		
		Alumno alumnos []= {alumno1, alumno2, alumno3, alumno4, alumno5, alumno6};
	
		codigoIntroducido = leerDatos.RecogerOpcionInt(reader, 1, 100,"Introduzca código del alumno:");
		posicionArrayAlumno=funciones.buscarAlumno(alumnos, codigoIntroducido);
		
				
				
	/*
		while(continuar)
		{
			if(!estaLleno) {
				funciones.anadirAlumno(reader,leerDatos, alumnos);
				estaLleno=false;
			}
			if(estaLleno==true) {
				System.out.println("Lo sentimos, esa clase esta llena.");
			}
		}
		
		*/
		System.out.println("-------------------------------3. ordenar alumno desc---------------");
		funciones.ordenar(alumnos);
		
		System.out.println("-------------------------------4. sacar numero alumnos y lista---------------");
		System.out.println("El número de alumnos matriculados es:"+ alumnos.length);
		funciones.listarAlumnos(alumnos);
		System.out.println("-------------------------------5. borrar alumno---------------");
		
		
		posicion = leerDatos.RecogerOpcionInt(reader, 0, 21, "Introduzca posición que desea borrar:");
		funciones.borrar(alumnos, posicion);
		
		
		System.out.println("-------------------------------6. sacar numero alumnos y lista---------------");
		System.out.println("El número de alumnos matriculados es:"+ alumnos.length);
		funciones.listarAlumnos(alumnos);
	
	}

}
