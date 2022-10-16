import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //prompt the user 
        System.out.println("Greetings, Adamya .... do you pick R, P or S?");
        System.out.println("1 for Rock, 2 for Paper, 3 for scissors ");
        Scanner keyboard = new Scanner(System.in);
        int playerChoice = keyboard.nextInt();

        // enemy choose rock
        switch(playerChoice) {
            case 1:
            System.out.println("Issa tie :)");
            break;
            case 2:
            System.out.println("Congrats ... You win!");
            break;
            case 3:
            System.out.println("Homework needed gg");
            break;
            

        }

        
    }
}
