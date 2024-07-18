import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

    //Criação de variáveis com Strings e Valores númericos:
        
        /* String nome;
        nome="Maria";
        nome="José";
        nome="João";

        //Neste caso vai aparecer na tela a última variável criada.

        System.out.println("Hello, " + nome);*/ 

        /*int a = 3;
        int b = 2;
        int soma = a + b;
        int subtração = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b; 

        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);*/

        //Na operação de divisão precisamos fazer um "Casting" para converter o tipo de dado para "float".

    //Criação de variáveis do tipo Boolean com seus operadores lógicos:

        /*Tabela verdade

        Operador "&&"" (and)
        true && true = true
        true && false = false
        false && true = false
        false && false = false

        Operador "||" (or)

        true || true = true
        true || false = true
        false || true = true
        false || false = false*/

         /*Boolean fimDeSemana = false;
         Boolean fazendoSol = false;
         Boolean vamosAPraia = fimDeSemana && fazendoSol;
         System.out.println(vamosAPraia);

    //Operador ternário atribuído a variável boolean:
    
         String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
         System.out.println(mensagem);*/


    //Estruturas condicionais

        /*int nota = -1;
        String graduacao;

        if (nota >= 70 ){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
         
        // Categoria: A = 80; B = 70; C - 60; D = 0

        if (nota >= 80) {
            graduacao = "A"; 

        }else if (nota < 80 && nota >= 70) {
            graduacao = "B"; 

        }else if (nota < 70 && nota >= 60) {
            graduacao = "C"; 

        }else if (nota < 60 && nota >= 0) {
            graduacao = "D";  

        }else {
            graduacao = ""; 

        }

        switch (graduacao) {

            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação inválida");
        }*/
        
        //Criar programação com saudação (Olá, {nome}! Hoje é {dia-da-semana}, BOM DIA!)

        String nome = "José";
        
        /*System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        String nomeOutro = "josé";
        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));*/
        
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale( "pt", "BR");

        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 8 && agora.getHour() < 12) {
            saudacao = "Bom dia";

        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa Tarde";
        }
        





    }
}
