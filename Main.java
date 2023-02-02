import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v_opcion;
        ListaDinamica listaDinamica = new ListaDinamica();
        boolean finalizarPrograma = false;

        do {
            System.out.println("Ingresa el número de la opción que necesites");
            System.out.println(
                    "1 - Capturar datos \n2 - Ordenar lista por tamaño \n3 - Ordenar lista por tiempo \n4 - Ordenar lista por número de proceso \n5 - Mostrar lista");
            v_opcion = sc.nextInt();
            switch (v_opcion) {
                case 1:
                    System.out.println("Ingrese el número de proceso");
                    int v_numero_proceso = sc.nextInt();
                    System.out.println("Ingrese el nombre del proceso");
                    String v_nombre_proceso = sc.next();
                    System.out.println("Ingrese el tamaño del proceso");
                    int v_tamaño_proceso = sc.nextInt();
                    System.out.println("Ingrese el tiempo del proceso");
                    int v_tiempo_proceso = sc.nextInt();

                    Nodo temp = new Nodo(v_numero_proceso, v_nombre_proceso, v_tamaño_proceso, v_tiempo_proceso, null);

                    listaDinamica.agregarNodoAlFinal(temp);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    listaDinamica.mostrarListaCompleta();
                    break;
                case 6:
                    finalizarPrograma = true;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        } while (!finalizarPrograma);
        sc.close();
    }
}