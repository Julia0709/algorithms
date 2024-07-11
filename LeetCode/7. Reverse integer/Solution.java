public class Solution {

    final int MAX = Integer.MAX_VALUE;
    final int MIN = Integer.MIN_VALUE;

    public int reverse(int x) {

        long result = 0;

        while(x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return ((result >= MIN) && (result <= MAX)) ? (int)result : 0;
    }
}
