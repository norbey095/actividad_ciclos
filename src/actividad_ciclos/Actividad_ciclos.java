package actividad_ciclos;
import java.util.Scanner;

public class Actividad_ciclos {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String nombre;
			float sumatoria = 0.0f;
			
			//solicitar el nombre
			System.out.println("Ingrese su nombre completo: ");
			nombre = sc.nextLine();
			
			for(int i  = 1; i <= 5; i++){
			    //solicitar calificaciones
			    System.out.println("Calificacion obtenida en la nota: " + (i));
			    float nota = sc.nextFloat();
			    
			    //sumar las notas ingresadas
			    sumatoria = sumatoria + nota;
			}
			float promedio = sumatoria / 5;
			
			System.out.println(
			        "Nombre del estudiante: " + nombre + "\n" +
			        "Promedio del estudiante: " + promedio
			);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }    
}
