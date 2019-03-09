import java.util.Scanner;

public class Asignatura {
	//atributos
	private int cod_Asignatura;
	private String nombre;
	private int numero=0;
	private Alumno alumnos [] =new Alumno[20]; //array 20 posiciones de alumno
	
	//constructores
		public Asignatura(int cod_Asignatura, String nombre)
		{
			this.cod_Asignatura=cod_Asignatura;
			this.nombre=nombre;
		}

		public int getCod_Asignatura() {
			return cod_Asignatura;
		}

		public void setCod_Asignatura(int cod_Asignatura) {
			this.cod_Asignatura = cod_Asignatura;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Alumno[] getAlumnos() {
			return alumnos;
		}

		public void setAlumnos(Alumno[] alumnos) {
			this.alumnos = alumnos;
		}
		
		//métodos:(en clase FuncionesExamenAlba)
		
		
		
		
	
}
