package task3;

/*
3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class task3 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Имя: ");
        String name = iScanner.nextLine();

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        String timeOfDay = null;

        if (hour >= 5 && hour < 12) {
            timeOfDay = "Доброе утро";
        } else if (hour >= 12 && hour < 18) {
            timeOfDay = "Добрый день";
        } else if (hour >= 18 && hour < 23) {
            timeOfDay = "Добрый вечер";
        } else if (hour >= 23 && hour < 5) {
            timeOfDay = "Доброй ночи";
        }

        System.out.printf("%s, %s!", timeOfDay, name);
        iScanner.close();
    }
}
