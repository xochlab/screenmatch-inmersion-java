import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetivo: Crear un Streaming de Peliculas
        System.out.println("Bienvenidos a la Inmersión en Java");

        // 1ro. definir las variables, estas son primitivas (int,double,boolean):
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        //aquí se ocupará String (clase) como variable:
        String nombre = "Matrix";
        System.out.println("Pelicula: " + nombre);
        double mediaEvaluacionUsuario = 0;
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}