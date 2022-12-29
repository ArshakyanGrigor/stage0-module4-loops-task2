package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
            return;
        }
        System.out.println(0);
        if (multiplyByAndToInclusive >= 0) {
            while (multiplyByAndToInclusive * multiplyByAndToInclusive >= number) {
                number += multiplyByAndToInclusive;
                if (number <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
                    System.out.println(number);
                }
            }
        } else {
            int minusNumber = multiplyByAndToInclusive * -1;
            minusNumber = minusNumber * multiplyByAndToInclusive;
            while (minusNumber <= number) {
                number += multiplyByAndToInclusive;
                if (number >= minusNumber) {
                    System.out.println(number);
                }
            }
        }
    }
}
