package ru.dataart.academy.java;
import java.util.Scanner;
public class LongestSubstring {
    public int getLengthOfLongestSubstring(String checkString) {
        int [] c=new int[26];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        int k=1,k1=0;
        for (int i = 0; i < checkString.length(); i++) {
            if (c[checkString.charAt(i) - 97] == 0) {
                c[checkString.charAt(i) - 97] = k;
                k++;
            }
            else {
                if (k - 1 > k1) {
                    k1 = k - 1;
                }
                k -= c[checkString.charAt(i) - 97] - 1;
                for (int j = 0; j < c.length; j++) {
                    c[j] = (c[j] < k) ? 0 : (c[j] - k);
                }
                c[checkString.charAt(i) - 97] = k;
            }
        }
        if (k - 1 > k1) {
            k1 = k - 1;
        }
        return k1;
    }
}