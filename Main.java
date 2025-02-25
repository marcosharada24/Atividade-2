public class TransposicaoMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas: ");
        int linhas = scan.nextInt();
        
        System.out.print("Digite o número de colunas: ");
        int colunas = scan.nextInt();
        
        int[][] matriz = new int[linhas][colunas];
        int[][] matrizTransposta = new int[colunas][linhas];
        
        System.out.println("Insira os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        // Transpor a matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        
        // Exibir a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
      
    }
}

