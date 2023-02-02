public class ListaDinamica {
    Nodo nodo_inicio;

    ListaDinamica() {
        nodo_inicio = null;
    }

    public void agregarNodoAlFinal(Nodo p_nodo) {
        if (nodo_inicio == null) {
            nodo_inicio = p_nodo;
        } else {
            Nodo aux = nodo_inicio;
            while (aux.nodo_siguiente != null) {
                aux = aux.nodo_siguiente;
            }
            aux.nodo_siguiente = p_nodo;
        }

    }

    public void mostrarListaCompleta() {
        if (nodo_inicio == null) {
            System.out.println("Lista vacía");
        } else {
            Nodo aux = nodo_inicio;
            while (aux.nodo_siguiente != null) {
                aux.mostrar();
                aux = aux.nodo_siguiente;
            }
            aux.mostrar();
        }
    }
}
