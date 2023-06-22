package task1;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Arrays;
import java.util.OptionalInt;

public class task1 {

    static int[] numbers = {10, 20, 30, 40};

    public static void main(String[] args) {

        OptionalInt maxNum = Arrays.stream(numbers).max();
        OptionalInt minNum = Arrays.stream(numbers).min();
        System.out.print("Min: ");
        System.out.println(minNum.getAsInt());
        System.out.print("Max: ");
        System.out.println(maxNum.getAsInt());

        int minElement = getMinElement(numbers);
        int maxElement = getMaxElement(numbers);

        System.out.print("Min: ");
        System.out.println(minElement);
        System.out.print("Max: ");
        System.out.println(maxElement);
    }

    public static int getMinElement(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    public static int getMaxElement(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
