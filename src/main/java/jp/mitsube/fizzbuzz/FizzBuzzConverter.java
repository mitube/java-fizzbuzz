package jp.mitsube.fizzbuzz;

/**
 * FizzBuzzのコンバートクラス.
 */
public class FizzBuzzConverter {

    /**
     * コンバート.
     * @param num
     * @return
     */
    public String convert(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return Integer.valueOf(num).toString();
    }
}
