package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i;
        int primeNumber = 1;
        int count;
        while (primeNumber <= printToInclusive) {
            count = 0;
            i = 2;
            while (i <= primeNumber / 2) {
                if (primeNumber % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && primeNumber != 1) {
                System.out.println(primeNumber);
            }
            primeNumber++;
        }
    }
}
