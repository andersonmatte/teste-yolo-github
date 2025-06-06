public class Piramide {
    public static void piramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Quantidade de traços laterais: n - i
            int traços = n - i;
            // Quantidade de hashes na linha: 2*i - 1 (número ímpar)
            int hashes = 2 * i - 1;

            // imprimir traços à esquerda
            for (int j = 0; j < traços; j++) {
                System.out.print("-");
            }
            // imprimir hashes
            for (int j = 0; j < hashes; j++) {
                System.out.print("#");
            }
            // imprimir traços à direita
            for (int j = 0; j < traços; j++) {
                System.out.print("-");
            }

            // pular linha
            System.out.println();
        }
    }

    public static void main(String[] args) {
        piramide(4);
    }
}
