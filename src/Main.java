public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        int[] monthlyPayments = new int[5];
        monthlyPayments[0] = 7;
        monthlyPayments[1] = 2;
        monthlyPayments[2] = 16;
        monthlyPayments[3] = 19;
        monthlyPayments[4] = 13;
        int sum = 0;
        for (int i: monthlyPayments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task # 2");

        int[] weeklyExpenses = {50, 100, 200, 150, 300};
        int maxExpenses = 0;
        int minExpenses = Integer.MAX_VALUE;
        for (int max : weeklyExpenses) {
            if (max > maxExpenses) {
                maxExpenses = max;
            }
            for (int min : weeklyExpenses) {
                if (min < minExpenses) {
                    minExpenses = min;
                }
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей.Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");

        System.out.println("Task # 3");

        int averageCost = sum / monthlyPayments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей.");

        System.out.println("Task # 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
