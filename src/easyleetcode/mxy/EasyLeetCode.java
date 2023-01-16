package easyleetcode.mxy;

import java.util.HashMap;

public class EasyLeetCode {
    public static void main(String[] args) {
        String s = "jkjkklml";
        System.out.println(firstUniqChar(s));
    }

    /**
     * 剑指offer 50
     * 找到第一个出现一次的字母
     * @param s
     * @return
     */
    public static char firstUniqChar(String s) {
        char[] str = s.toCharArray();
        HashMap<Character,Boolean> map = new HashMap<Character,Boolean>();
        for(char c : str){
            map.put(c,!map.containsKey(c));
        }
        for(char c : str){
            if(map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
