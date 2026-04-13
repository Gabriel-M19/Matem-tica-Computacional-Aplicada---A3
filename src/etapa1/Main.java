package etapa1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de cálculo do problema de Josephus");
        System.out.println("Digite 'Sair' para encerrar.\n ");

        while (true) {
            try {
                System.out.print("Informe N: ");
                String entradaN = sc.nextLine().trim();

                if (entradaN.equalsIgnoreCase("Sair")) {
                    System.out.println("Encerrando programa.");
                    break;
                }

                System.out.print("Informe K: ");
                String entradaK = sc.nextLine().trim();

                if (entradaK.equalsIgnoreCase("Sair")) {
                    System.out.println("Encerrando programa.");
                    break;
                }

                int n = Integer.parseInt(entradaN);
                int k = Integer.parseInt(entradaK);

                Calcular calculadora = new Calcular(n, k);
                int resultado = calculadora.calcular();

                System.out.println("Sobrevivente: " + resultado + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Erro: entradas devem ser valores inteiros.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + "\n");
            }
        }

        sc.close();
    }
}
