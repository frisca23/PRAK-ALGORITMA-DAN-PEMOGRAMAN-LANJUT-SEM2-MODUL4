import java.util.Scanner;
public class PerkalianMatriks {
    public static void main(String[] args) {
        int b = 3;
        int d = 3;
        System.out.println("Masukan Nilai Matrix:");
        int[][] matrix1 = new int[b][d];
        int[][] matrix2 = new int[b][d];
        int[][] result = new int[b][d];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                matrix1[i][j] = input();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                matrix2[i][j] = input();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                result[i][j] = 0;
                for (int k = 0; k < d; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}