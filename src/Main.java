public class Main {
    public static void main(String[] args) {
        /* Задача 1 */
        System.out.println("Задача 1");
        int i = 2343000;
        byte b = -12;
        short s = 32000;
        long l = 9000000000L;
        float f = 0.55566688F;
        double d = 0.0000000023;

        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        /* Задача 2 */
        System.out.println("Задача 2");
        float f2 = 27.12f;
        long i2 = 987678965549L;
        float f21 = 2.786f;
        short s2 = 569;
        short s21 = -159;
        short s22 = 27897;
        byte b2 = 67;

        /* Задача 3 */
        System.out.println("Задача 3");
        int atLudmilaPupils = 23;
        int atAnnaPupils = 27;
        int atKaterinePupils = 30;
        int paperTotal = 480;
        int paperPerPupil = paperTotal/(atLudmilaPupils + atAnnaPupils + atKaterinePupils);

        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");

        /* Задача 4 */
        System.out.println("Задача 4");
        int bottleMakingMachine = 16;
        int bottleMakingMachineTime = 2;
        int bottleMakingMachinePerformancePerMinute = bottleMakingMachine / bottleMakingMachineTime;

        int minutesInADay = 24 * 60;

        System.out.println("За 20 минут машина произвела " + (bottleMakingMachinePerformancePerMinute * 20) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (bottleMakingMachinePerformancePerMinute * minutesInADay) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (bottleMakingMachinePerformancePerMinute * minutesInADay * 3) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (bottleMakingMachinePerformancePerMinute * minutesInADay * 30)  + " штук бутылок");

        /*Задача 5*/
        System.out.println("Задача 5");
        int schoolRenovation = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int classes = schoolRenovation / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = classes * whiteCansPerClass;
        int totalBrownCans = classes * brownCansPerClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        /*Задача 6*/

        System.out.println("Задача 6");
        int weightBanana = 80,  weightMilk = 105,   weightIceCream = 100,   weightEgg = 70;
        int bananas = 5,        milk = 2 ,          iceCream = 2 ,          eggs = 4;

        int totalWeightBreakfast = bananas * weightBanana + weightMilk * milk + weightIceCream * iceCream + weightEgg * eggs;

        System.out.println("Завтрак спортсмена - " + totalWeightBreakfast + " грамм");
        System.out.println("Завтрак спортсмена - " + (1.0 * totalWeightBreakfast / 1000 ) + " килограмм");

        /*Задача 7*/
        System.out.println("Задача 7");

        int needToLoseWeight = 7 * 1000;
        int loseWeightPerDay = 250;
        int howManyDaysLoseWeight = needToLoseWeight/ loseWeightPerDay;
        System.out.println("Если спортсмен будет терять каждый день по " + loseWeightPerDay + " грамм то потратит " + howManyDaysLoseWeight + " дней");
        loseWeightPerDay = 500;
        howManyDaysLoseWeight = needToLoseWeight/ loseWeightPerDay;
        System.out.println("Если спортсмен будет терять каждый день по " + loseWeightPerDay + " грамм то потратит " + howManyDaysLoseWeight + " дней");

        /* Задача 8*/
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryMashaAfterPromotion = salaryMasha * 10 / 100 + salaryMasha;
        int salaryDenisAfterPromotion = salaryDenis * 10 / 100 + salaryDenis;
        int salaryKristinaAfterPromotion = salaryKristina * 10 / 100 + salaryKristina;


        System.out.println("Маша теперь получает " + salaryMashaAfterPromotion + " рублей. " +
                                            "Годовой доход вырос на " + (salaryMashaAfterPromotion - salaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfterPromotion + " рублей. " +
                                            "Годовой доход вырос на " + (salaryDenisAfterPromotion - salaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterPromotion + " рублей. " +
                                            "Годовой доход вырос на " + (salaryKristinaAfterPromotion - salaryKristina) + " рублей");
    }
}