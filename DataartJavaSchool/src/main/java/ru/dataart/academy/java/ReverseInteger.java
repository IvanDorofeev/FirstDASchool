package ru.dataart.academy.java;
import java.util.Scanner;
public class ReverseInteger {
    public int reverse(int inputNumber) {
        int z=0, b=0;
        for(int i=10;(i/10)<=((inputNumber>0)?inputNumber:(-inputNumber));){
            if(((inputNumber%i)/(i/10))!=0)
                z=1;
            if(z==1){
                b*=10;
                b+=((inputNumber%i)/(i/10)>0)?((inputNumber%i)/(i/10)):(-((inputNumber%i)/(i/10)));
            }
            i*=10;
        }
        b=(inputNumber>0)?b:(-b);
        return b;
    }
}

