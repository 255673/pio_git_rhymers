package edu.kis.vh.nursery;

/**
 *Klasa reprezentująca domyślną wyliczankę
 */
public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaje nową wartość do wyliczanki.
     *
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     * Zwraca ostatnią wartość z wyliczanki bez jej usuwania.
     *
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnią wartość z wyliczanki.
     *
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}