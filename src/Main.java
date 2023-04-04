import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "abc", "bcd", "bcd", "e"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.printf("%d ", num);
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задание 2");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.printf("%d ", num);
                prevNum = num;
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        System.out.println("Задание 4");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }


}