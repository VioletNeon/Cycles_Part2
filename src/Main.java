public class Main {
    public static void main(String[] args) {
        int desiredAmountOfSavings = 2_459_000;
        short monthlySavings = 15_000;
        int amountOfSavings = 0;
        short countOfMonths = 0;

        while (amountOfSavings <= desiredAmountOfSavings) {
            countOfMonths++;
            amountOfSavings = amountOfSavings + monthlySavings;
        }
        System.out.println("Месяц " + countOfMonths + ", сумма накоплений равна " + amountOfSavings + " рублей");
    }
}