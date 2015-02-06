package multiplicacaomatrizes;

/**
 * Eugenio Cunha genio.py@gmail.com
 */
public class MultiplicacaoMatrizes {

    //Matriz A
    public static int a[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    //Matriz B
    public static int b[][] = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}
    };

    //Matriz resultante
    public static int r[][] = new int[3][3];

    //Metodo principal
    public static void main(String[] args) {
        for (int linha = 0; linha < a.length; linha++) {
            for (int coluna = 0; coluna < b[0].length; coluna++) {
                for (int auxiliar = 0; auxiliar < a[0].length; auxiliar++) {
                    r[linha][coluna] += a[linha][auxiliar] * b[auxiliar][coluna];
                }
                System.out.print("[" + r[linha][coluna] + "] ");
            }
            System.out.print("\n");
        }
    }
}
