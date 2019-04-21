package jp.mitsube.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        final FizzBuzzConverter converter = new FizzBuzzConverter();
        for (int i = 1; i <= 100; i++) {
            System.out.println(converter.convert(i));
        }
    }
}
