public class Matriz {

    public static double[][] leMatriz(int numLinhas,int numColunas){
        double M[][];
        return M;
    }

    public static double[][] matmul(double[][] A,double [][] B){
        double C[][];
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
    }
}