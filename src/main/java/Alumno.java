
public class Alumno {
	
	//atributos
	private int cod_alumno;
	private String nombre;
	private double nota_trabajo=0;
	private double nota_practica=0;
	private double nota_examen=0;
	private double notaFinal=0;
	
	//constructores
	public Alumno(int cod_alumno)
	{
		this.cod_alumno=cod_alumno;
	}
	
	public Alumno(int cod_alumno, String nombre)
	{
		this.cod_alumno=cod_alumno;
		this.nombre=nombre;
	}
	
	public Alumno(int cod_alumno, String nombre, double nota_trabajo, double nota_practica, double nota_examen)
	{
		this.cod_alumno=cod_alumno;
		this.nombre=nombre;
		this.nota_trabajo=nota_trabajo;
		this.nota_practica=nota_practica;
		this.nota_examen=nota_examen;
		
	}
	
	//get y set
	public int getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota_trabajo() {
		return nota_trabajo;
	}

	public void setNota_trabajo(double nota_trabajo) {
		this.nota_trabajo = nota_trabajo;
	}

	public double getNota_practica() {
		return nota_practica;
	}

	public void setNota_practica(double nota_practica) {
		this.nota_practica = nota_practica;
	}

	public double getNota_examen() {
		return nota_examen;
	}

	public void setNota_examen(double nota_examen) {
		this.nota_examen = nota_examen;
	}
	
	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	//metodos:

	public boolean aprobado() {
		boolean todasAprobadas=false;
		
		if(this.nota_trabajo>=5 && this.nota_practica>=5 && this.nota_examen>=5)
		{
			todasAprobadas=true;
			System.out.println("Todas aprobadas");
		}
		else
		{
			todasAprobadas=false;
			System.out.println("Alguna suspendida");
		}
		
		
		return todasAprobadas;
	}

	public double notaFinal() {
		double notaFinal;
		
		notaFinal=(this.nota_practica*0.3+this.nota_examen*0.6+this.nota_trabajo*0.1);
		
		return notaFinal;
	}
	
	
	
	


	public String toStringAlumnos(StringBuilder sb)
	{
		
	    sb.append("Datos del alumno:").append(System.getProperty("line.separator")); 
	    sb.append("Codigo Alumno: "+ this.cod_alumno).append(System.getProperty("line.separator"));
	    sb.append("Nombre: "+ this.nombre).append(System.getProperty("line.separator")); 
	    sb.append("Nota trabajo: "+ this.nota_trabajo).append(System.getProperty("line.separator"));
	    sb.append("Nota practica: "+ this.nota_practica + " m").append(System.getProperty("line.separator"));
	    sb.append("Nota Examen: "+ this.nota_examen + " Kg").append(System.getProperty("line.separator"));
		return sb.toString();
		
	}

	
	
	
	
}
