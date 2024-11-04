/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        Lectura lecturaTeclado = new Lectura();

        // Encabezado del examen
        System.out.println("===========================================");
        System.out.println("Examen Programado - Fundamentos de Informática");
        System.out.println("Carrera: Ingeniería en Sistemas de Información");
        System.out.println("Universidad Nacional - Campus Coto");
        System.out.println("===========================================");

        Matriz matriz1 = new Matriz(3, 3); // Primer objeto de tipo Matriz
        Matriz matriz2 = new Matriz(3, 3); // Segundo 4objeto de tipo Matriz

        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("0. Indicaciones del Examen");
            System.out.println("1. Imprimir matrices");
            System.out.println("2. Sumar matrices");
            System.out.println("3. Transponer matriz 1");
            System.out.println("4. Calcular determinante de matriz 1");
            System.out.println("5. Tabla de Puntos por Ejercicio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(lecturaTeclado.leerTecladoBufferedReader());

            switch (opcion) {
                case 0:
                    mostrarIndicaciones();
                    break;

                case 1:
                    System.out.println("\nMatriz 1:");
                    matriz1.imprimirMatriz();
                    System.out.println("\nMatriz 2:");
                    matriz2.imprimirMatriz();
                    break;

                case 2:
                    Matriz suma = matriz1.sumaMatrices(matriz2);
                    if (suma != null) {
                        System.out.println("\nResultado de la suma de las matrices:");
                        suma.imprimirMatriz();
                    } else {
                        System.out.println("No se pudo realizar la suma. Las matrices deben ser del mismo tamaño.");
                    }
                    break;

                case 3:
                    System.out.println("\nMatriz 1 antes de transponer:");
                    matriz1.imprimirMatriz();
                    matriz1.transponer();
                    System.out.println("Matriz 1 después de transponer:");
                    matriz1.imprimirMatriz();
                    break;

                case 4:
                    int determinante = matriz1.determinante();
                    System.out.println("Determinante de la matriz 1: " + determinante);
                    break;

                case 5:
                    mostrarTablaPuntos();
                    break;

                case 6:

                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 0 al 6.");
                    break;
            }
        } while (opcion != 6);

    }

    // Método para mostrar las indicaciones del examen
    public static void mostrarIndicaciones() {
        System.out.println("\n--- Indicaciones del Examen ---");
        System.out.println("1. Completar los métodos de la clase Matriz según las instrucciones.");
        System.out.println("2. Cada método implementado debe realizar correctamente la operación descrita.");
        System.out.println("3. El examen tiene una duración de dos horas.");
        System.out.println("4. Asegúrese de verificar los resultados de cada operación en el menú.");
        System.out.println("5. No se permite el uso de bibliotecas externas para manipulación de matrices.");
        System.out.println();

        // Instrucciones detalladas para el cálculo del determinante
        System.out.println("=== Instrucciones para el cálculo del determinante ===");
        System.out.println("El determinante solo se puede calcular para matrices cuadradas (2x2 o 3x3).\n");

        System.out.println("Para una matriz 2x2, use la siguiente fórmula:");
        System.out.println("\tdeterminante = (a * d) - (b * c)");
        System.out.println("Donde la matriz tiene la forma:");
        System.out.println("\t| a  b |");
        System.out.println("\t| c  d |\n");

        System.out.println("Ejemplo:");
        System.out.println("Para la matriz:");
        System.out.println("\t| 3  8 |");
        System.out.println("\t| 4  6 |");
        System.out.println("El determinante sería:");
        System.out.println("\t(3 * 6) - (8 * 4) = -14\n");

        System.out.println("Para una matriz 3x3, use la siguiente fórmula con cofactores:");
        System.out.println("\tdeterminante = a(ei - fh) - b(di - fg) + c(dh - eg)");
        System.out.println("Donde la matriz tiene la forma:");
        System.out.println("\t| a  b  c |");
        System.out.println("\t| d  e  f |");
        System.out.println("\t| g  h  i |\n");

        System.out.println("Ejemplo:");
        System.out.println("Para la matriz:");
        System.out.println("\t| 1  2  3 |");
        System.out.println("\t| 0  4  5 |");
        System.out.println("\t| 1  0  6 |");
        System.out.println("El determinante sería:");
        System.out.println("\t1(4 * 6 - 5 * 0) - 2(0 * 6 - 5 * 1) + 3(0 * 0 - 4 * 1) = 22\n");

        // Instrucciones detalladas para la transposición de matrices
        System.out.println("=== Instrucciones para la transposición de matrices ===");
        System.out.println("La transposición de una matriz consiste en intercambiar sus filas por columnas.\n");
        System.out.println("Para una matriz de tamaño n x m, su transpuesta será de tamaño m x n.\n");

        System.out.println("Ejemplo:");
        System.out.println("Si la matriz original es:");
        System.out.println("\t| 1  2  3 |");
        System.out.println("\t| 4  5  6 |");
        System.out.println("Su transpuesta será:");
        System.out.println("\t| 1  4 |");
        System.out.println("\t| 2  5 |");
        System.out.println("\t| 3  6 |\n");

        System.out.println("6. Complete cada método con la lógica indicada y verifique los resultados utilizando el menú del programa.");
        System.out.println();
    }

// Método para mostrar la tabla de puntos
    public static void mostrarTablaPuntos() {
        System.out.println("\n--- Tabla de Puntos por Ejercicio ---");
        System.out.println("Ejercicio\t\t\t| Puntos");
        System.out.println("--------------------------\t| ------");

        // Implementación de clases
        System.out.println("Implementación de clases\t| 20");
        System.out.println("\tDebe crear correctamente la clase Matriz, con atributos privados para la matriz y\n"
                + "\ttamaño, y debe incluir constructores adecuados y los métodos indicados.");

        // Uso adecuado de constructores
        System.out.println("Uso adecuado de constructores\t| 10");
        System.out.println("\tEl constructor de la clase debe permitir inicializar matrices con tamaño definido\n"
                + "\ty aleatorizar los valores, así como inicializar con una matriz preexistente.");

        // Operaciones con matrices
        System.out.println("Operaciones con matrices\t| 30");
        System.out.println("\tImplementar métodos para realizar operaciones de suma, transposición e impresión\n"
                + "\tde matrices, siguiendo las especificaciones dadas y verificando su funcionalidad.");

        // Cálculo del determinante
        System.out.println("Cálculo del determinante\t| 20");
        System.out.println("\tImplementar correctamente el método para calcular el determinante de matrices 2x2\n"
                + "\to 3x3, devolviendo el valor exacto o mostrando mensajes para otros tamaños.");

        // Código limpio y estructurado
        System.out.println("Código limpio y estructurado\t| 20");
        System.out.println("\tEl código debe estar organizado, con nombres de variables significativos, y\n"
                + "\tcomentarios explicativos que faciliten la lectura y comprensión del código.");

        System.out.println("------------------------------------");
        System.out.println("Total\t\t\t\t| 100");
        System.out.println();
    }

}
