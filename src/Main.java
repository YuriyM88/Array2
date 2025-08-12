import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] money = new int [5];
        money[0] = 9_000;
        money[1] = 17_000;
        money[2] = 5_000;
        money[3] = 38_000;
        money[4] = 25_000;

        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");

        int [] money1 = {15_000, 25_000, 12_000, 17_000, 4_000};
        int max = money1[0];
        int min = money1[0];

        for (int i = 0; i < money1.length; i++) {
            if (money1[i] < min) {
                min = money1[i];
            }
            if (money1[i] > max) {
                max = money1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задача 3");

        int [] money2 = {7_000, 20_000, 31_000, 14_000, 9_000};
        double sum1 = 0;
        double average = 0;

        for (int i =0; i < money2.length; i++) {
            sum1 += money2[i];
        }
        average = sum1 / money2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp = '0';
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.print(reverseFullName);
    }
}