package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_12 = 12;
    public static final int TOTAL_MINUS_1 = -1;
    public static final int NUMBER_11 = 11;
    private final int[] numbers = new int[NUMBERS_12];

    public int total = TOTAL_MINUS_1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_MINUS_1;
    }

    public boolean isFull() {
        return total == NUMBER_11;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_MINUS_1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_MINUS_1;
        return numbers[total--];
    }

}
