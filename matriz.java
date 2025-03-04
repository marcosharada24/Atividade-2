public class SomaMatrizes {

    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] resultado = new int[3][3];

        // Realizar a soma das matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibir o resultado
        System.out.println("Resultado da soma das matrizes: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();  // Quebra de linha após cada linha da matriz
        }
    }
}