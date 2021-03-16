public class DotProduct
{
    public static void main(String[] args)
    {
        int[][] x = {{1,2,3},{7,1,2},{4,2,1}};
        int[][] y = {{4,5,6},{9,5,3},{8,7,8}};

        int[] z = new int[x.length];

        for(int i = 0; i<z.length; i++)
        {
            for(int j = 0; j<y.length; j++)
            {
                z[i] += x[i][j] * y[j][i];
                System.out.print(z[i] + " ");
            }
            System.out.println(z[i] + " ");
            System.out.println();

        }
    }

}