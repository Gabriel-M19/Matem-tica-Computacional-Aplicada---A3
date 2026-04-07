package etapa1;

public class Calcular {
    private int n;
    private int k;

    public Calcular(int n, int k) {
        setK(k);
        setN(n);
    }

    public int getN() {
        return n;
    }

    public int getK() {
        return k;
    }

    public void setN(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N Inválido!");
        }
        this.n = n;
    }

    public void setK(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("K Inválido!");
        }
        this.k = k;
    }

    public int calcular() {
        int sobrevivente = 0;

        for (int i = 1; i <= n; i++) {
            sobrevivente = (sobrevivente + k) % i;
        }

        return sobrevivente + 1;
    }
}