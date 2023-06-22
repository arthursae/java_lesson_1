package task2;

/*
2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
*/
public class task2 {
    public static void main(String[] args) {

        int rows = 5, columns = 5;

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }

                System.out.print("\t");
                System.out.print(matrix[i][j]);
                if (j == columns - 1) {
                    System.out.print("\n");
                }
            }
        }
    }
}
