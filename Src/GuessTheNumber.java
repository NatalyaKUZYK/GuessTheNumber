
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempt = 0;
        int randomNumber = random.nextInt(11);
        String strA = "Вгадайте число від 0 до 10. В маєте 3 спроби.";
        System.out.println(strA);
        while (attempt < 3) {
            int personNumber = scanner.nextInt();
            attempt++;

            if (personNumber == randomNumber){
                System.out.println("Вітаю! Ви вгадали число.");
                break;
            }else if (attempt == 3){
                System.out.println("GAME OVER! Ви не вгадали загадане число: " + randomNumber);
               // break;
            } else {
                System.out.println("Ви не вгадали число спробуйте ще раз:" + randomNumber);
            }
        }
    }
}
