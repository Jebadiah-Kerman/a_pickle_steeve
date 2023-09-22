import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("It's time to play family feud!"  + '\n');
        System.out.print(";;;;;;;;;:,     .,,,,,:::;;;;;iiiiiiiiiiiiiiiifLLLLt;fLLLLt;tLLLLt1t11111111fLLLLf1i;;;tCLLLL1;iii;;"  + '\n' );
        System.out.println("What does HT stand for?");
       
        String answer = scan.nextLine();

        if (answer.equals("Holy Trinity"))
        System.out.println("Correct!");
        
    }
}
