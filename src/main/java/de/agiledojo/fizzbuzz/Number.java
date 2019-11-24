package de.agiledojo.fizzbuzz;

class Number {

    private int number;

    Number(int number) {
        this.number = number;
    }

    boolean hasDivisor(int i) {
        return this.number % i == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}