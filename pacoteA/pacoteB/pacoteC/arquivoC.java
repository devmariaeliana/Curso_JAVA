package pacoteA.pacoteB.pacoteC;

import java.util.Scanner;

public class arquivoC {
   
    public String nomeMeio;

    public String nome;

    public String sobrenome;

    public String corCabelo;

    public static void main(String args[]){
        System.out.println("Hello World!");
        System.out.println("Maria Eliana");

        String escola = "CLASS";
        String idade = "27";

        String nome;
        int anoNascimento;

        System.out.printf("O \"Maria\" estuda na escola %s e tem %s anos.\n",escola,idade);
        System.out.println("O Pedro estuda na escola "+escola+" e tem "+idade+" anos.");

        try (Scanner s = new Scanner(System.in)) {
            nome = s.nextLine();

            anoNascimento = s.nextInt();
        }

        System.out.printf("O nome %s nasceu em %d.\n",nome,anoNascimento);
    }
    
}
