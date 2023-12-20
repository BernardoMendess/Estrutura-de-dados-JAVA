package ListaEncadeada;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int tamanho = 0;

    public ListaEncadeada(){
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(int valor){
        No novo = new No(valor, null);
        if(primeiro != null){
            novo.setProximo(primeiro);
        } else {
            ultimo = novo;
        }
        primeiro = novo;
        tamanho++;
    }

    public void adicionarFim(int valor){
        No novo = new No(valor, null);
        if(ultimo != null){
            ultimo.setProximo(novo);
            ultimo = novo;
        } else {
            primeiro = novo;
            ultimo = novo;
        }
        tamanho++;
    }

    public void remover(int valor){
        if(primeiro != null){
            if(primeiro.getValor() == valor){
                primeiro = primeiro.getProximo();
            } else {
                for(No no = this.primeiro; no.getProximo() != null; no = no.getProximo()){
                    if(no.getProximo().getValor() == valor){
                        no.setProximo(no.getProximo().getProximo());
                        tamanho--;
                        break;
                    }
                }
            }
        }
    }

    public boolean buscar(int valor){
        for(No no = this.primeiro; no != null; no = no.getProximo()){
            if(no.getValor() == valor){
                return true;
            }
        }
        return false;
    }
}
