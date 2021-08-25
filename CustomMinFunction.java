package EXERCISE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* String[] input = sc.nextLine().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        */
        String input = sc.nextLine();
        int [] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Consumer<int[]> printMin = array -> System.out.print(Arrays.stream(array).min().orElse(0));
        printMin.accept(numbers);



    }
}
