package _161_180;

public class OJ_172_FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
        int count = 0;
        while (n > 4) {
            count += n/5;
            n /= 5;
        }
        return count;
    }
}