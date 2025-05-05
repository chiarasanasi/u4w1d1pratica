import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println(treParole());;
    }
    public static String treParole(){
        Scanner scanner = new Scanner(System.in);
        String[] parole = new String[3];

        System.out.print("Inserisci la prima parola: ");
        parole[0] = scanner.nextLine();

        System.out.print("Inserisci la seconda parola: ");
        parole[1] = scanner.nextLine();

        System.out.print("Inserisci la terza parola: ");
        parole[2] = scanner.nextLine();

String primeTre = parole[0]+parole[1]+parole[2];
String primeTreAlContrario= parole[2]+parole[1]+parole[0];
        scanner.close();
return primeTre + "   "+ primeTreAlContrario;
    }


}
