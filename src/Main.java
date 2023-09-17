public class Main {
    public static void main(String[] args) {

      byte orange = 19;
      short bagOfOrange = 27272;
      int smallBoxOfOranges = 123456789;
      long largeBoxOfOranges = 485926485926485L;
      float machineWithOranges = 5.7f;
      double orangeWarehouse = 7.6543212;
      System.out.printf(" Значение переменной orange с типом byte равно " + orange);
      System.out.printf(" Значение переменной bagOfOrange с типом short равно " + bagOfOrange);
      System.out.printf(" Значение переменной smallBoxOfOrange с типом int равно " + smallBoxOfOranges);
      System.out.printf(" Значение переменной largeBoxOfOrange с типом long равно " + largeBoxOfOranges);
      System.out.printf(" Значение переменной machineWithOranges с типом float равно " + machineWithOranges);
      System.out.printf(" Значение переменной orangeWarehouse с типом double равно" + orangeWarehouse);



      double d1 = 27.12;
      long l1 = 987_678_965_549L;
      double d2 = 2.786;
      short s1 = 569;
      short s2 = -159;
      short s3 = 27897;
      byte b1 = 67;



      byte class01 = 23;
      byte class02 = 27;
      byte class03 = 30;
      short paper = 480;
      int sheetsOfPaper = 480 / (class01 + class02 + class03);
      System.out.printf("На каждого ученика рассчитано %d листов бумаги", sheetsOfPaper);



      byte machineSpeedForMin = 16 / 2;
      int machineSpeed20 = machineSpeedForMin * 20;
      int machineSpeedDay = machineSpeedForMin * 24 * 60;
      int machineSpeedThreeDays = machineSpeedDay * 3;
      int machineSpeedMonth = machineSpeedDay *31;
      System.out.printf("За %s машина произвела %d штук бутылок \n", "20 минут", machineSpeed20);
      System.out.printf("За %s машина произвела %d штук бутылок \n", "1 день", machineSpeedDay);
      System.out.printf("За %s машина произвела %d штук бутылок \n", "3 дня", machineSpeedThreeDays);
      System.out.printf("За %s машина произвела %d штук бутылок \n", "1 месяц", machineSpeedMonth);



      int cansOfPaint = 128;
      int whitePaint = 2;
      int braunPaint = 4;
      int classrooms = cansOfPaint / (whitePaint + braunPaint);
      int whitePaints = classrooms * whitePaint;
      System.out.printf(" В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски \n", classrooms, whitePaints, classrooms * braunPaint);


        // Добавил double для корректного подсчета и перевода в кг. т.к. получается не целое число.

      double gramsInOneKg = 1000;
      int weightBanana = 80;
      int weightMilk = 105;
      int weightEgg = 70;
      int weightIceCream = 100;
      int bananaAmount = 5;
      int milkAmount = 2;
      int iceCreamAmount = 2;
      int eggAmount = 4;
      int result = (weightBanana * bananaAmount) + (weightMilk * milkAmount) + (weightEgg * eggAmount) + (weightIceCream * iceCreamAmount);
      double resultInOneKg = result / gramsInOneKg;
      System.out.println(" Полезного завтрака получается " + resultInOneKg + " кг :) ");


      short needToLoseKg = 7;
      short gramsInKg = 1000;
      int needToLoseGrams = needToLoseKg * gramsInKg;
      int minGramsPerOneDay = 250;
      int maxGramsPerOneDay = 500;
      int minDays = needToLoseGrams / maxGramsPerOneDay;
      int maxDays = needToLoseGrams / minGramsPerOneDay;
      int averageDays = (minDays + maxDays) / 2;
      System.out.println(" Количество дней тренировок, при потере 500 грамм в день составит " +minDays);
      System.out.println(" Количество дней тренировок, при потере 250 грамм в день составит " +maxDays);
      System.out.println(" Среднее количество дней для достижения результата " +averageDays);



      int salaryMariya = 67760;
      int salaryDenis = 83690;
      int salaryKristina = 76230;
      int percent = 10;
      float newSalaryMultiplier = 1 + (percent / 100f);
      int newSalaryMariya = (int) (salaryMariya * newSalaryMultiplier);
      int differTotalSalaryMasha = (newSalaryMariya - salaryMariya) * 12;
      int newSalaryDenis = (int) (salaryDenis * newSalaryMultiplier);
      int differTotalSalaryDenis = (newSalaryDenis - salaryDenis) *12;
      int newSalaryKristina = (int) (salaryKristina * newSalaryMultiplier);
      int differTotalSalaryKristina = (newSalaryKristina - salaryKristina) * 12;
      System.out.println(" Теперь Маша получает " + newSalaryMariya + "." + " Годовой доход вырос на " + differTotalSalaryMasha + " руб." );
      System.out.println(" Теперь Денис получает " + newSalaryDenis + "." + " Годовой доход возрос на " + differTotalSalaryDenis + " руб.");
      System.out.println(" Теперь Кристина получает " + newSalaryKristina + "." + " Годовой доход возрос на " + differTotalSalaryKristina + " руб.");











    }
}