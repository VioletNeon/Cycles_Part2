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

        // Task-3
        byte natality = 17;
        byte mortality = 8;
        byte billingPeriod = 10;
        short yearCount = 2024;
        int population = 12_000_000;

        for (byte i = 1; i <= billingPeriod; i++) {
            short populationPerThousand = (short) (population / 1000);
            int natalityPerPopulation = populationPerThousand * natality;
            int mortalityPerPopulation = populationPerThousand * mortality;

            yearCount++;
            population = population + (natalityPerPopulation - mortalityPerPopulation);

            System.out.println("Год " + yearCount +  ", численность населения составляет " + population);
        }
    }
}