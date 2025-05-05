import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println(moltiplica(5,6));
        String risultatoConcatena = concatena("Chiara", 26);
        System.out.println(risultatoConcatena);

        String[] parole = {"Chiara","Francesco","Rosa","Eli","Angela","Giuseppe"};
        System.out.println(Arrays.toString(parole));

        parole = inserisciInArray(parole,"Romeo");

        System.out.println(Arrays.toString(parole));
    }
    public static int moltiplica (int a, int b){
        return  a*b;
    }
    public static String concatena(String c, int d){
        return c+d;
    }

    public static String[] inserisciInArray(String[] array, String parolaDaAggiungere){
        array[5]=array[4];
        array[4]=array[3];
        array[3] = parolaDaAggiungere;
    return array;
}}
