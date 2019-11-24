package de.agiledojo.fizzbuzz;

public class FizzBuzz {

    public String nextTurn(int number) {
        return nextTurn(new Number(number));
    }

    private String nextTurn(Number number) {
        if (number.hasDivisor( 3) && number.hasDivisor(5))
            return "fizzbuzz";
        if (number.hasDivisor(3))
            return "fizz";
        if (number.hasDivisor(5))
            return "buzz";
        return number.toString();
    }

}
