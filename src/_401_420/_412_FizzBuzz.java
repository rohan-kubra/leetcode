package _401_420;

import java.util.ArrayList;
import java.util.List;

public class _412_FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String s = "";
            if (i%3 == 0) {
                s += "Fizz";
            } 
            if (i%5 == 0) {
                s += "Buzz";
            } 
            if (s.isEmpty()) {
                s += i;
            }
            ans.add(s);
        }
        return ans;
    }
}