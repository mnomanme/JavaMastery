package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[2] = 33;
        String array = Arrays.toString(numbers);
        System.out.println(array);

        // new
        int[] prices = {49, 23, 45, 90};
        System.out.println(prices.length);
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
