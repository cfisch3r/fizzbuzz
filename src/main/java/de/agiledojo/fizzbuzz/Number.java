package de.agiledojo.fizzbuzz;

class Number {

    Number(int number) {
        this.number = number;
    }

    private int number;

    boolean hasDivisor(int i) {
        return this.number % i == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}