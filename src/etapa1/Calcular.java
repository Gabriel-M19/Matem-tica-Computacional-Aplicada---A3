package etapa1;


public class Calcular {

    private int n;
    private int k;

    // Classe interna representando um participante
    private static class Participante {
        int id;
        Participante proximo;

        Participante(int id) {
            this.id = id;
            this.proximo = null;
        }
    }

    public Calcular(int n, int k) {
        setN(n);
        setK(k);
    }

    public int getN() {
        return n;
    }

    public int getK() {
        return k;
    }

    public void setN(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N inválido");
        }
        this.n = n;
    }

    public void setK(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("K inválido");
        }
        this.k = k;
    }

    // Método principal de cálculo (mantido igual ao beta)
    public int calcular() {

        // Criação da lista circular de participantes
        Participante inicio = new Participante(1);
        Participante anterior = inicio;

        for (int i = 2; i <= n; i++) {
            Participante novo = new Participante(i);
            anterior.proximo = novo;
            anterior = novo;
        }
        anterior.proximo = inicio; // fecha o círculo

        Participante atual = inicio;

        // Processo de eliminação
        while (atual.proximo != atual) {
            for (int contador = 1; contador < k - 1; contador++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            atual = atual.proximo;
        }

        return atual.id;
    }
}