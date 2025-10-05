package javalb;

import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {

    }
}
public class Matrix
{
    public int Arr[][];
    public Matrix(int irow, int icol)
    {
        Arr = new int[irow][icol];
    }

    public void accept()
    {
        int i=0,j=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        for(i=0;i<Arr.length;i++) //outer,row
        {
            for(j=0;j<Arr[i].length;j++)//inner col,
            {
                Arr[i][j] = scanner.nextInt();
            }
        }
    }

    public void display()
    {
        int i=0,j=0;
        System.out.println("Matrix elements are:");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}

public class MyMatrix extends Matrix {

    public MyMatrix(int irow, int icol) {
        super(irow, icol);
    }

    //logic
}