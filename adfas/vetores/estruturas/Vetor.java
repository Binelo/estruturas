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
            System.out.println("não adicionarás");
            return;
        } else {
            this.elementos[this.tamanho] = valor;
            this.tamanho++;
        }
    }

    public void mostrarElementos() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
            System.out.println(", ");
        }
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
    
}
