public class Main {
    public static void main(String[] args) {
        // Task-1
        int desiredAmountOfSavings = 2_459_000;
        short monthlySavings = 15_000;
        int amountOfSavings = 0;
        short countOfMonths = 0;

        while (amountOfSavings <= desiredAmountOfSavings) {
            countOfMonths++;
            amountOfSavings = amountOfSavings + monthlySavings;
        }
        System.out.println("\n" + "Месяц " + countOfMonths + ", сумма накоплений равна " + amountOfSavings + " рублей" + "\n");

        // Task-2
        byte startNumber = 1;
        byte endNumber = 10;

        while (startNumber <= endNumber) {
            System.out.print(startNumber + " ");
            startNumber++;
        }

        System.out.println();

        for (byte i = endNumber; i > 0; i-- ) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }
}