package com.company;
import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {

    private BigInteger value;
    private int n;
    private static ArrayList<BigInteger> cache =new  ArrayList<>();



    public Fibonacci(int n) {
        this.n = n;
        cache.add(new BigInteger("0"));
        cache.add(new BigInteger("1"));
    }

        public BigInteger iteration()
    {
        int i;
        if (cache.size()>=this.n) {
            return cache.get(this.n-1);
        }
            for (i = cache.size() ; i <=n; ++i) {
                cache.add(cache.get(i-2).add(cache.get(i-1)));
                System.out.println(cache.get(i-1));
            }
        return value=cache.get(i-1);
        }

    int getN()
    {
        return this.n;
    }

    BigInteger getValue(){
        return value=iteration();
    }

    @Override
    public String toString() {
        if(cache.size()>= n) {
            value = cache.get(n);
        }
        return "Fibonacci{" +
                "iterations = " + n +
                ", value = " + value+
                '}';
    }
    public boolean equals(Object other)
    {
        if(other instanceof Fibonacci && ((Fibonacci) other).n == this.n){
            return true;
        }
        else{
            return false;
        }
    }
}
