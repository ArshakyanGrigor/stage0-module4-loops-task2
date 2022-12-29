package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int number = 0;
        while (printTillInclusive >= 0) {
            System.out.println(number);
            number += 2;
            printTillInclusive -= 2;
        }
    }
}
