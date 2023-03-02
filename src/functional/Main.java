package functional;

import functional.interfaces.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(compareNumbers((num1, num2) -> Math.max((int)num1, (int)num2), 2, 4));
    }

    public static int compareNumbers(Comparator comparator, int num1, int num2){
        return comparator.compare(num1, num2);
    }
}
