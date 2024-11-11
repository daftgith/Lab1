import static java.lang.Math.*;
public class Laba1 {
    public static void main(String[] args) {
        int[] p1 = new int[13];
        double[] x= new double[18];
        double[][] p = new double[13][18];


        for(int i=15, j=0; i>2; i--, j++) p1[j] = i;

        for(int i=0; i<18; i++) x[i]= Math.random()*15 - 10.0;


        for(int i=0; i<13; i++){
            for (int j=0; j<18; j++){
                p[i][j]= f(p1[i], x[j]);
            }
        }
        printMass(p);

    }


    public static double f(long p, double x) {
        if (p == 8)
            return(Math.pow((2/x) - (1/3f), Math.cos(Math.pow(x, x/2))));
        if (p==3 || p==6 || p==10 || p==12 || p==14 || p==15)
            return(Math.asin(1/Math.pow(Math.E, Math.abs(Math.atan(Math.cos(x))))));
        else
            return(Math.atan(Math.atan(Math.pow(Math.pow(Math.E, Math.cbrt((-Math.PI/2)+Math.abs(x))), 2))));

    }

    public static void printMass(double[][] mass) {
        for(int i=0; i<mass.length; i++){
            for(int j=0; j<mass[0].length; j++){
                System.out.printf("%.2f  ",mass[i][j]);


            }
            System.out.println("");

        }
    }
}




