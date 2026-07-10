package com.casaone.converge;

public class Test {
    int x=10;
    int y=20;

    public int add(int x,int y)
    {
     return x+y;
    }
    public static void main(String[] args) {

        Test t=new Test();
       int sum= t.add(10,20);
        System.out.println(sum);
    }
}
