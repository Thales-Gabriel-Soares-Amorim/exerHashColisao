package hashColisao;

public class EstruturaHashTable implements EstruturaDeDados{
    private Integer tabela[];
    

    public EstruturaHashTable() {
        //esse número pode ser alterado
        tabela = new Integer[1000];
    }

    public int EscolherIndice (int chave){
        return chave % 1000;
    }

    public int Colisao (int chave){ //caso ocorra colisão, novo lugar
        int posicaoPorao = chave % 100; //lugar no porão

        return (posicaoPorao +1000); // para fiacar no porão
    }
    @Override
    public boolean insert(int chave) {
    
        // numero que quero inserir
           int numero = EscolherIndice(chave);
           //ifs verificam
           if (tabela[numero] != null){ 
            return false;
           }
            tabela[numero] = chave; //inserção
            return true;
           }

    @Override
    public boolean delete(int chave) {
        int numero = EscolherIndice(chave);
        if (tabela[numero] != null){
            tabela[numero] = null; //o numero foise
            return true;

        }
        return false; // não havia numero para apagar
        
    }
    @Override
    public int search(int chave) {
        int numero = EscolherIndice(chave);
        if (tabela[numero] != null &&  tabela[numero] == chave){
            return numero; //encontrou
        } return -1;
    }
}