import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myCompetitionResult;

        final int NUM = 5;

        String word = "finished ";

        myCompetitionResult = word + NUM;

        System.out.println(myCompetitionResult);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя  ");
        String name = in.next();

        System.out.println("Привет " + name + " !");
    }
}