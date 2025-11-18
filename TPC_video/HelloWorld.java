import java.util.Date;
import java.awt.*;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //int age = 30, temperature = 20;
        //age + 35;

        //System.out.println(age);
            
        System.out.println("Hello World");

        /*int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge); */


        /*byte age = 30;
        int viewsCount = 123_456_789;
        long viewsCount2 = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;*/

        byte age = 30;
        Date now = new Date();
        now.getTime();

        System.out.println(now);
        /*
        byte x = 1;
        byte y = x;

        x = 2;
        System.out.println(y);
        */

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);


        /*String message = " Hello World" + "!!" ;
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*")); // retorna uma nova String

        System.out.println(message.toLowerCase());

        System.out.println(message.toUpperCase());

        System.out.println(message.trim());

        System.out.println(message); */

        // c:\windows\...

        String menssage = "Hello \"Mosh\"";
        String menssage2 = "c:\\windows\\...";

        String menssage3 = "c:\twindows\\..."; // \t da tab

        System.out.println(menssage);
        System.out.println(menssage2);
        System.out.println(menssage3);

        /*
        // Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3;


        System.out.println(Arrays.toString(numbers)); */

        //int [] numbers = {2, 3, 5, 1, 4};
        //Arrays.sort(numbers);

        //System.out.println(Arrays.toString(numbers));
        // Matriz 2D de inteiros (2 linhas x 3 colunas)
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        // Imprime a matriz usando Arrays.deepToString para visualizar arrays multidimensionais
        System.out.println(Arrays.deepToString(numbers));

        // Arredonda 1.1 para o inteiro mais próximo (Math.round retorna long para double, por isso faz-se cast)
        int result1 = (int) Math.round(1.1);
        System.out.println(result1);

        // Math.ceil retorna o menor inteiro maior ou igual a 1.1 -> 2.0, então convertemos para int
        int result2 = (int) Math.ceil(1.1);
        System.out.println(result2);

        // Math.max retorna o maior entre dois valores
        int result3 = Math.max(1, 2);
        System.out.println(result3);

        // Math.min retorna o menor entre dois valores
        int result4 = Math.min(1, 2);
        System.out.println(result4);

        // Math.random() gera um double no intervalo [0.0, 1.0).
        // Multiplicando por 100 obtemos um valor entre 0.0 (inclusivo) e 100.0 (exclusivo)
        double randomResult = Math.random() * 100;
        System.out.println(randomResult);

        //double result = Math.round(Math.random() * 100);
        //System.out.println(result);

       int result = (int) (Math.random() * 100);
        System.out.println(result);

        int temp = 30;
            if (temp > 30)
                System.out.println("It's a hot day");
            else
                System.out.println("It's not a hot day");
            

        // if..else
       /*int temp = 32;
         if(temp > 30) {
             System.out.println("It's a hot day");
         } else if (temp > 20) {
             System.out.println("It's a nice day");
         } else {
             System.out.println("It's cold");
         }
       */
        // loop for: itera de 0 a 4 e imprime cada valor
        for (int i = 0; i < 5; i++) {
           System.out.println("Hello World " + i); // imprime "Hello World 0" ... "Hello World 4"
        }

        // inicializa i com 0
        int i = 0;
        // while com condição (i > 0): como i == 0, este loop nunca será executado.
         // se a intenção for decrementar, deveria inicializar i com um valor > 0 (ex.: int i = 5;)
        while (i > 0) {
           System.out.println("Hello World " + i);
            i--;
        }

        // loop para ler input do utilizador até digitar "quit"
        String input = "";
        // ATENÇÃO: o objeto 'scanner' NÃO foi declarado/instanciado no código.
        // É necessário criar um Scanner antes de o usar, por exemplo:
        // Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
        System.out.println("Input: ");
        // Scanner scanner = new Scanner(System.in); // instanciar aqui (ou antes do loop)
        // input = scanner.next().toLowerCase();    // next() lê a palavra seguinte; toLowerCase() normaliza
        // System.out.println(input);
        }

        do {
            System.out.println("Input: ");
            //input = scanner.next().toLowerCase();    // next() lê a palavra seguinte; toLowerCase() normaliza
            System.out.println(input);
        } while (!input.equals("quit"));

    }
}