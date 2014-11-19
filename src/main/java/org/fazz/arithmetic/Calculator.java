package org.fazz.arithmetic;

public class Calculator {

    public int sum(int... integers) {
        int total = 0;
        for (int integer : integers) {
            total += integer;
        }
        return total;
    }
}
