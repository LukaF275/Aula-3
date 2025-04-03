import java.util.Scanner;

public class MatrizInicial{

    public static double[][] leMatriz(int numLinhas,int numColunas){
        double [][]M = new double[numLinhas][numColunas];
        Scanner sc  = new Scanner(System.in);
        for(int n = 0; n < numLinhas; n++ ){
            for(int m = 0; m < numColunas; m++){
                M[n][m] = sc.nextInt();
            }
        }
        return M;
    }

    public static void exibeMatriz(double [][] A){
        int numLinhas = A.length;
        int numColunas = A[0].length;

        for(int n = 0; n < numLinhas; n++ ){
            for(int m = 0; m < numColunas; m++){
                System.out.print(A[n][m] + " ");;
            }
            System.out.println("");
        }

    }

    public static double[][] matmul(double[][] A, double[][] B) {
        int numLinhasA = A.length;
        int numColunasA = A[0].length;
        int numLinhasB = B.length;
        int numColunasB = B[0].length;

    
        double[][] C = new double[numLinhasA][numColunasB];
    
        for (int i = 0; i < numLinhasA; i++) {
            for (int j = 0; j < numColunasB; j++) {
                for (int k = 0; k < numColunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    

    public static void main(String[] args) {
        // Le da linha de comando as dimensões das matrizes A e B

        if (args.length < 4) {
            System.out.println("Use java Matriz numLinhasA numColunasA numLinhasB numColunasB");
            return;
        }

        int numLinhasA = Integer.parseInt(args[0]);
        int numColunasA = Integer.parseInt(args[1]);
        int numLinhasB = Integer.parseInt(args[2]);
        int numColunasB = Integer.parseInt(args[3]);

        System.out.println("Digite as entradas de A: ");
        double A[][] = leMatriz(numLinhasA, numColunasA);

        System.out.println("Digite as entradas de B: ");
        double B[][] = leMatriz(numLinhasB, numColunasB);

        System.out.println("Matriz A:");
        exibeMatriz(A);

        System.out.println("Matriz B:");
        exibeMatriz(B);

        System.out.println("A * B:");
        exibeMatriz(matmul(A, B));
    }
}