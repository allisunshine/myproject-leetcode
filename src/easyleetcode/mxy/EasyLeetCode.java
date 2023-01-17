package easyleetcode.mxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class EasyLeetCode {
    public static void main(String[] args) {
        char a[] = {'a', 'b', 'c', 'd','e'};
        System.out.println(reverseString(a));
    }

    /**
     * 反转字符串
     *
     * @param s
     * @return
     */
    public static char[] reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        //法2
//        for (int i = 0, j = s.length - 1; i < s.length/2; i++, j--) {
//            temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//        }
        return s;
    }

    /**
     * 剑指offer 50
     * 找到第一个出现一次的字母
     *
     * @param s
     * @return
     */
    public static char firstUniqChar(String s) {
        char[] str = s.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
        for (char c : str) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : str) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    /**
     * 507 完美数
     * 效率低
     *
     * @param num
     * @return
     */
    public static boolean checkPerfectNumber(int num) {
        Set<Integer> set = new HashSet<>();
        if (num <= 1) {
            return false;
        }
        set.add(1);
        int i = 2;
        int all = 0;
        while (i < num) {
            if (!set.contains(i)) {
                if (num % i == 0) {
                    set.add(i);
                    set.add(num / i);
                }
            }
            i++;
        }
        for (Integer s : set) {
            all += s;
        }
        if (num == all) {
            return true;
        }
        return false;
    }

    /**
     * 507 完美数优化
     *
     * @param num
     * @return
     */
    public static boolean checkPerfectNumber2(int num) {
        if (num <= 1) return false;
        int sum = 1;
//        正因子总是成对出现
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) sum += num / i;
            }
        }
        return sum == num;
    }


}
