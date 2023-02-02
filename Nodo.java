public class Nodo {
    // Atributos
    int a_numero_proceso;
    String a_nombre_proceso;
    int a_tamaño_proceso;
    int a_tiempo_proceso;
    Nodo nodo_siguiente;

    // Constructor
    Nodo(
            // Parametros
            int p_numero_proceso,
            String p_nombre_proceso,
            int p_tamaño_proceso,
            int p_tiempo_proceso,
            Nodo p_nodo_siguiente) {
        a_numero_proceso = p_numero_proceso;
        a_nombre_proceso = p_nombre_proceso;
        a_tamaño_proceso = p_tamaño_proceso;
        a_tiempo_proceso = p_tiempo_proceso;
        nodo_siguiente = p_nodo_siguiente;
    }

    public void mostrar() {
        System.out.println("-----------");
        System.out.println("Número de proceso: " + a_numero_proceso);
        System.out.println("Nombre de proceso: " + a_nombre_proceso);
        System.out.println("Tamaño de proceso: " + a_tamaño_proceso);
        System.out.println("Tiempo de proceso: " + a_tiempo_proceso);
        System.out.println("-----------");
    }
}
