import matrix.Matrix;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void testAvgArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(3.5, matrix.avgArray(array));
    }

    @Test
    void testAvgArrayParamNull() {
        assertEquals(0, matrix.avgArray(null));
    }

    @Test
    void testIsMatrixSquareParamNull() {
        assertFalse(matrix.isMatrixSquare(null));
    }

    @Test
    void testIsMatrixSquareLengthZero() {
        assertFalse(matrix.isMatrixSquare(new int[0][0]));
    }

    @Test
    void testMatrixNotSquare() {
        assertFalse(matrix.isMatrixSquare(new int[2][4]));
        assertFalse(matrix.isMatrixSquare(new int[2][1]));
    }

    @Test
    void testIsMatrixSquare() {
        assertTrue(matrix.isMatrixSquare(new int[1][1]));
        assertTrue(matrix.isMatrixSquare(new int[3][3]));
    }

    @Test
    void testMatrixNotSquareWithValuesDifferentLength() {
        int[][] matrixWithValues = new int[][]{
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3}
        };
        assertFalse(matrix.isMatrixSquare(matrixWithValues));
    }
}