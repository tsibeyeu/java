import java.util.*;
public class Exercise1 {
    public int isSquare(int n) {
        int i;
        for (i = 0; i <= n; i++) {
            if (i * i == n)
                return 1;
            break;
        }
        return 0;
    }
    public static int checkConcatenatedSum(int n, int catlen)
    {
        int isConcatenatedSum = 1;
        int sum = 0, tempn = n;
        do
        {
            int lastdigit = tempn % 10;
            int tempsum = 0;
            int tens = 1;
            for (int i = 1; i <= catlen; i++)
            {

                tempsum += (tens * lastdigit);
                tens *= 10;
            }

            tempn = tempn / 10;
            sum += tempsum;
        } while (tempn >= 1);

        if (sum != n) isConcatenatedSum = 0;
        return isConcatenatedSum;
    }
    public static int isLegalNumber(int[] a, int bases)
    {
        int isLegalNumber = 1;

        for (int i = 0; i < a.length ; i++)
        {
            if (a[i] >= bases)
                isLegalNumber = 0;

        }
        return isLegalNumber;
    }

}
class Movie{
    String title;
    String studio;
    String rating;
    Movie(String T,String S,String R){
        this.title=T;
        this.studio=S;
        this.rating=R;
    }
    Movie(String T,String S){
        this.title=T;
        this.studio=S;
        this.rating="PG";
    }
    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int j= 0;
        for (int i = 0; i < mov.length; i++)
            if (mov[i].rating.equals("PG")) {
                pgMov[j] = mov[i];
                j++;
            }
        return pgMov;
    }
    Movie mov = new Movie("Avater","Mabric production","PG-10");
}
class Outerclass {
    int height;

    void outerClassMethod() {
        System.out.println("This is an outer class method");
    }

    void commonToBoth() {
        System.out.println("Common method for both outer and inner class");
    }

    class InnerClass {
        void commonToBoth() {
            System.out.println("Common method for the nested class");
        }

        public void innerClassMethod() {
            System.out.println("Inner class method");
            this.commonToBoth();
            Outerclass.this.commonToBoth();
        }
    }
}
class SecondLargestElement{
    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }}
class SumOfMatrices {
    public static void main(String args[])
    {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Input elements of first matrix");
        for (  c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array1[c][d] = in.nextInt();

        System.out.println("Input the elements of second matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array2[c][d] = in.nextInt();

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                sum[c][d] = array1[c][d] + array2[c][d];

        System.out.println("Sum of the matrices:-");

        for ( c = 0 ; c < m ; c++ )
        {
            for ( d = 0 ; d < n ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}
class Display {
    static void main(String[] args) {
        Outerclass instanceO = new Outerclass();
        instanceO.commonToBoth();
        instanceO.outerClassMethod();
        Outerclass.InnerClass instancei = instanceO.new InnerClass();
        instancei.commonToBoth();
        instancei.innerClassMethod();
        //To find a common integer between the following arrays
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {

                    System.out.println("Common element is : "+(array1[i]));
                }
            }
        }


    }

}





