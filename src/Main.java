import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] seasons = {"summer", "fall", "winter", "spring"};
        int[] seasonalCosts = new int[4];

        for (int i = 0; i <= 3; i++) {
            System.out.println("What is your monthly maintenance cost for " + seasons[i] + "?");
            seasonalCosts[i] = scanner.nextInt();
        }

        System.out.println("Your yearly maintenance cost is $" + (seasonalCosts[0] + seasonalCosts[1] + seasonalCosts[2] + seasonalCosts[3]));
    }
}