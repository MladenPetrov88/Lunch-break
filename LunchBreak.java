import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String serial = scan.nextLine();
        int serialLength = Integer.parseInt(scan.nextLine());
        int restTime = Integer.parseInt(scan.nextLine());

        double timeToEat = restTime / 8.0;
        double timeToRest = restTime / 4.0;

        double timeLeft = restTime - timeToEat - timeToRest;

        if (timeLeft >= serialLength) {
            double freeTime = Math.ceil(timeLeft - serialLength);
            System.out.println(String.format("You have enough time to watch %s and left with %.0f minutes free time.",
                    serial, freeTime));
        } else {
            double timeNeed = Math.ceil(serialLength - timeLeft);
            System.out.println(String.format("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serial, timeNeed));
        }
    }
}
