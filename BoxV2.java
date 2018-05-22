package com.company;

public class BoxV2 {
    private double w,h,d;
    public BoxV2(double w,double h,double d)
    {
        this.w = w;
        this.h = d;
        this.d = h;
    }
    public double volume()
    {
        return w+d+h;
    }
}

