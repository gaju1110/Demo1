package com.casaone.converge;

public class Test {
    int x=90;
    int y=20;

    public int add(int x,int y)
    {
     return x+y;
    }
    public static void main(String[] args) {

        Test t=new Test();
       int sum= t.add(90,20);
        System.out.println(sum);
    }
}
