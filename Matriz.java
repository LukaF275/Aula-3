import java.util.Scanner;

public class Matriz {

    //Atributos
    int numLinhas;
    int numColunas;
    double [][]entradas;//Valores na matriz

    //Contrutor
    public Matriz(int l, int c){
        numLinhas = l;
        numColunas = c;
        entradas = new double[numLinhas][numColunas];

    }

    //Métodos
    public void leMatriz(){
        Scanner sc  = new Scanner(System.in);
        for(int n = 0; n < numLinhas; n++ ){
            for(int m = 0; m < numColunas; m++){
                entradas[n][m] = sc.nextInt();
            }
        }
    }

    public void exibeMatriz(){

        for(int n = 0; n < numLinhas; n++ ){
            for(int m = 0; m < numColunas; m++){
                System.out.print(entradas[n][m] + " ");;
            }
            System.out.println("");
        }

    }

    public Matriz multiplica(Matriz B) {

        if (this.numColunas != B.numLinhas) {
            System.out.println("Multiplicação de matrizes inválida: colunas de A != linhas de B.");
            return null;
        }

        Matriz C = new Matriz(this.numLinhas, B.numColunas);

        for (int i = 0; i < this.numLinhas; i++) {
            for (int j = 0; j < B.numColunas; j++) {
                for (int k = 0; k < this.numColunas; k++) {
                    C.entradas[i][j] += this.entradas[i][k] * B.entradas[k][j];
                }
            }
        }
        return C;
    }
    

    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println("Use java Matriz numLinhasA numColunasA numLinhasB numColunasB");
            return;
        }

        int numLinhasA = Integer.parseInt(args[0]);
        int numColunasA = Integer.parseInt(args[1]);
        int numLinhasB = Integer.parseInt(args[2]);
        int numColunasB = Integer.parseInt(args[3]);

        Matriz A = new Matriz(numLinhasA, numColunasA);
        A.leMatriz();
        A.exibeMatriz();

        Matriz B = new Matriz(numLinhasB, numColunasB);
        B.leMatriz();
        B.exibeMatriz();

        Matriz C = A.multiplica(B);
        C.exibeMatriz();
        
    }



}
