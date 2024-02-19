package matrix;

public class ProgramRun {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[] array = new int[]{1, 2, 3, 4};
        System.out.println("matrix.avgArray(array) = " + matrix.avgArray(array));

        System.out.println("=================================");

        int[][] square = {
                {1, 2, 3},
                {4, 5, 6, 10},
                {7, 8, 9}
        };

        showIsMatrixSquare(matrix, new int[1][1]);
        showIsMatrixSquare(matrix, new int[15][15]);
        showIsMatrixSquare(matrix, square);
        showIsMatrixSquare(matrix, new int[0][0]);
        showIsMatrixSquare(matrix, null);
        showIsMatrixSquare(matrix, new int[6][0]);
        showIsMatrixSquare(matrix, new int[6][14]);
    }

    public static void showIsMatrixSquare(Matrix matrix, int[][] values) {
        System.out.println(matrix.isMatrixSquare(values));
    }
}