public class Esercizio3 {
    public static void main(String[] args) {
        System.out.println(perimetroDelRettangolo(2.20f,2.5f));
        System.out.println(pariDispari(4));
        System.out.println(pariDispari(5));
        System.out.println("Area di un triangolo"+areaTriangolo(20d,22.3d,4.514d) );
    }
    public static float perimetroDelRettangolo(float lato1, float lato2){
        return (lato1*2)+(lato2*2);
    }
    public static int pariDispari(int num1){
        if(num1 % 2== 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static double areaTriangolo(double a, double b, double c){
        double s;
        s = (a+b+c)/2;
        return Math.sqrt( s*(s-a)*(s-b)*(s-c));
    }
}

