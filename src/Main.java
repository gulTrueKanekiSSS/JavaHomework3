//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task1
        byte myBirthday = 18;
        System.out.println("Значение переменной myBirthday с типом byte равно " + myBirthday);

        short ourYear = 2024;
        System.out.println("Значение переменной ourYear с типом short равно " + ourYear);

        int twoBillion = 2000000;
        System.out.println("Значение переменной twoBillion с типом int равно " + twoBillion);

        long veryBigNumber = 35267987667548944L;
        System.out.println("Значение переменной veryBigNumber с типом long равно " + veryBigNumber);

        float fox = 7.46362f;
        System.out.println("Значение переменной fox с типом float равно " + fox);

        double wolf = 8.4536278673298765438;
        System.out.println("Значение переменной wolf с типом double равно " + wolf);

        //task2
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;

        //task3
        byte allPupils = 23 + 27 + 30;
        short papers = 480;
        int paper_to_pupil = papers / allPupils;

        System.out.println("На каждого ученика рассчитано " + paper_to_pupil + " листов бумаги");

        //task4
        byte performanceBottlePerMinute = 16 / 2;

        int bottlesInTwentyMinutes = 20 * performanceBottlePerMinute;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");

        int bottlesInDay = 24 * 60 * performanceBottlePerMinute;
        System.out.println("За день машина произвела " + bottlesInDay + " штук бутылок");

        int bottlesInThreeDays = 3 * bottlesInDay;
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDays + " штук бутылок");

        int bottlesInMonth = bottlesInDay * 30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");

        //task5
        byte classes = 120 / (2 + 4);

        int brownJars = classes * 4;
        int whiteJars = classes * 2;

        System.out.println("В школе, где " + classes +  " классов, нужно " + whiteJars + " банок белой краски и " + brownJars + " банок коричневой краски");
        //task 6
        int weightInGrams = (5 * 80) + (2 * 105) + (2 * 100) + (4 * 70);
        var weightInKillograms = weightInGrams / 1000;

        System.out.println(weightInGrams);
        System.out.println(weightInKillograms);

        //task7
        byte needToResetKg = 7;
        short shortestWeightToResetGram = 250;
        short biggestWeightToResetGram = 500;
        short needToResetGram = 7 * 1000;

        int daysToResetWithShortestWeight = needToResetGram / shortestWeightToResetGram;
        int daysToResetWithBiggestWeight = needToResetGram / biggestWeightToResetGram;

        System.out.println(needToResetGram);
        System.out.println(daysToResetWithBiggestWeight);
        System.out.println(daysToResetWithShortestWeight);

        //task8
        int marysSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;

        int increaseMarysSalary = marysSalary / 10;
        int increaseDenisSalary = denisSalary / 10;
        int increaseKrisSalary = krisSalary / 10;

        int upperMarysSalary = marysSalary + increaseMarysSalary;
        int upperDenisSalary = denisSalary + increaseDenisSalary;
        int upperKrisSalary = krisSalary + increaseKrisSalary;



        System.out.println("Маша теперь получает " + upperMarysSalary + " рублей. Годовой доход вырос на " + increaseMarysSalary + " рублей");
        System.out.println("Денис теперь получает " + upperDenisSalary + " рублей. Годовой доход вырос на " + increaseDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + upperKrisSalary + " рублей. Годовой доход вырос на " + increaseKrisSalary + " рублей");

    }
}
