import java.util.Scanner;

public class DoubleVector {
    private double[] vector = null;
    public DoubleVector(double[] vector){
        this.vector = vector;
    }
    //Сумою двох векторів є вектор, координати якого дорівнюють сумі відповідних координат доданків.
    public double[] sum (DoubleVector anotherVector){
        double[] s = new  double[10];
         for ( int i = 0; i < vector.length; i++ ){
             s[i] = vector[i] + anotherVector.vector[i];
        }
        return s;
    }
    public static double[] sum (DoubleVector a, DoubleVector b){
        return a.sum(b);
    }
    //Щоб відняти від вектора а вектор b, потрібно відповідно додати до а вектор, протилежний b.
    //Якщо вутор а = (6;8;-3), а вектор b = (2;0;-5) то (6;8;-3)+(-2;0;5)=(4;8;2).
    public static double[] sub (DoubleVector a, DoubleVector b){
        return a.sub(b);
    }

    public double[] sub (DoubleVector anotherVector){
        double[] s = new  double[10];
        for ( int i = 0; i < vector.length; i++ ){
            s[i] = vector[i] + (-1*anotherVector.vector[i]);
        }
        return s;
    }
    public static void print (double[] s,int n){
        System.out.print("{");
        for(int i = 0; i < n; i++) {
            System.out.print(s[i]);
            if(i!=n-1){
                System.out.print(";");
            }
        }
        System.out.println("}");
    }
    public static void array_entry (double[] p){

        for(int i = 0; i < p.length; i++) {

            System.out.print("enter "+(i+1)+"coordinate =");
            Scanner l = new Scanner(System.in);
            String str2 = l.next();
            p[i] = Integer.parseInt(str2);
        }
    }
    public static void main(String[] args){
        //Два варіанта операцій
        //Є можливістЬ самому ввести данні
        System.out.println("enter 1 If you want to see prepared examples, enter 2 If you want to enter vector coordinates yourself");
        Scanner sk = new Scanner(System.in);
        String st = sk.next();
        int h = Integer.parseInt(st);
        double[] a = {1, 2, 3, 4};
        double[] b = {2, 2, 2, 2};
        if(h==2)
        {
            System.out.println("enter the size of the vector");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int t = Integer.parseInt(str);

             a = new  double[t];
            array_entry(a);
            System.out.print("a =");
            print(a,a.length);

            b = new  double[t];
            array_entry(b);
            System.out.print("b =");
            print(b,b.length);

        }

        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);

        System.out.println("Sum");
        double[] s = v1.sum(v2);
        System.out.print("v1+v2=");
        print(s,a.length);
        double[] s2 = DoubleVector.sum(v1, v2);
        System.out.print("v1+v2=");
        print(s2,a.length);


        System.out.println("Sub");
        double[] r = v1.sub(v2);
        System.out.print("v1-v2=");
        print(r,a.length);
        double[] r2 = DoubleVector.sub(v1, v2);
        System.out.print("v1-v2=");
        print(r2,a.length);


    }
}