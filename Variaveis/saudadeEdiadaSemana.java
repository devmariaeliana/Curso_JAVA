package Variaveis;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
//import java.util.Scanner;

public class saudadeEdiadaSemana {
    
    public static void main(String[] args) {

        //Scanner s = new Scanner (System.in);

        //String nome = s.nextLine();

        String nome = "Iago Ferreira";

        LocalDate hoje = LocalDate.now();

        Locale brasil = new Locale( "pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        
        LocalDateTime agora = LocalDateTime.now();

        String saudacao = "a";

        if (agora.getHour() >= 1 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        }     

        if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa Tarde!";

        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
                saudacao = "Boa Noite!";

        }
            System.out.printf("Olá, "+nome+"! "+saudacao+" Hoje é "+hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        }

    }
