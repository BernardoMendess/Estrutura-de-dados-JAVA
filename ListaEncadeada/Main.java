package ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionarInicio(3);
        lista.adicionarInicio(2);
        lista.adicionarInicio(1);
        lista.adicionarFim(4);
        lista.adicionarFim(5);
        imprimir(lista);
        lista.remover(2);
        lista.remover(4);
        imprimir(lista);
        System.out.println(lista.buscar(4));
        System.out.println(lista.buscar(1));

    }

    public static void imprimir(ListaEncadeada lista){
        for(No no = lista.getPrimeiro(); no != null; no = no.getProximo()){
            if(no.getProximo() != null){
                System.out.print(no.getValor() + " -> ");
            } else {
                System.out.print(no.getValor());
            }
        }
        System.out.print("\n");
    }
}
