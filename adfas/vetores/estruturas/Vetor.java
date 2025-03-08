// package estruturas

public class Vetor {

    private Integer[] elementos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.tamanho = 0;
        this.elementos = new Integer[capacidade];
        this.capacidade = capacidade;
    }

    public void adicionar(Integer valor) {
        if (this.tamanho == this.capacidade) {
            Integer[] temp = this.elementos;
            this.capacidade = this.capacidade * 2;
            this.elementos = new Integer[capacidade];
            for (int i = 0; i < this.tamanho; i++) {
                this.elementos[i] = temp[i];
            }
        } 
        this.elementos[this.tamanho] = valor;
        this.tamanho++;
    }

    public void mostrarElementos() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
            System.out.println(", ");
        }
        System.out.println(this.capacidade);
    }

    public void contem(Integer valor) {
        boolean achado = false;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                System.out.println("o valor " + valor + " está na lista na posição " + i);
                achado = true;
            }
        }
        if (!achado) {
            System.out.println("O valor " + valor + " não está na lista");
        }
    }

    public void remover(int posicao) {
        if (posicao > this.tamanho) {
            System.out.println("posição inválida");
            return;
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }
    public void removerValor(int valor) {
        boolean achado = false;
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                achado = true;
                for (int j = i; j < this.tamanho - 1; j++) {
                    this.elementos[j] = this.elementos[j + 1];
                }
            }
        }
        if (achado) {
            this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
        } else {
            System.out.println("nao tem esse valor");
            return;
        }
    }
    
}
