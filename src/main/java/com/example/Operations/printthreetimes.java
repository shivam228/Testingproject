package com.example.Operations;

public class printthreetimes {
    public int print(int n)
    {
        int sum = 0;
        while(n>0)
        {
            System.out.println("Inner loop started ");
            int n2 = 3;
            while(n2>0)
            {
                System.out.println(n+" ");
                n2--;
                sum = sum+n;
            }

            System.out.println("Inner loop ended ");
            n--;
        }

        System.out.println("outer loop ended ");
        return sum;
    }
}
