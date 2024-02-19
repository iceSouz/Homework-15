package matrix;

import java.util.Arrays;

public class Matrix {
    public double avgArray(int[] array) {
        if (array == null) {
            return 0;
        }

        return Arrays.stream(array).average().getAsDouble();
    }

    public boolean isMatrixSquare(int[][] matrix) {
        if (matrix == null) {
            return false;
        }

        if (matrix.length == 0) {
            return false;
        }

        return Arrays.stream(matrix).allMatch(row -> row.length == matrix.length);
    }
}
