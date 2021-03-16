public class Main {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 3}, {7, 1, 2}};
        int[][] y = {{4, 5, 6}, {9, 5, 3}};
        int[][] z = new int[2][1];

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                z[i][j] = 0;

                for (int k = 0; k < 2; k++)
                {
                    z[i][j] += x[i][k] * y[k][j];
                }
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }

}