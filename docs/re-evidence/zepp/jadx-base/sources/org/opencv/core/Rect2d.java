package org.opencv.core;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes23.dex */
public class Rect2d {
    public double height;
    public double width;
    public double x;
    public double y;

    public Rect2d(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public double area() {
        return this.width * this.height;
    }

    public Point br() {
        return new Point(this.x + this.width, this.y + this.height);
    }

    public boolean contains(Point point) {
        double d = this.x;
        double d2 = point.x;
        if (d <= d2 && d2 < d + this.width) {
            double d3 = this.y;
            double d4 = point.y;
            if (d3 <= d4 && d4 < d3 + this.height) {
                return true;
            }
        }
        return false;
    }

    public boolean empty() {
        return this.width <= 0.0d || this.height <= 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect2d)) {
            return false;
        }
        Rect2d rect2d = (Rect2d) obj;
        return this.x == rect2d.x && this.y == rect2d.y && this.width == rect2d.width && this.height == rect2d.height;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.height);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.width);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.x);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.y);
        return (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.y = dArr.length > 1 ? dArr[1] : 0.0d;
            this.width = dArr.length > 2 ? dArr[2] : 0.0d;
            this.height = dArr.length > 3 ? dArr[3] : 0.0d;
            return;
        }
        this.x = 0.0d;
        this.y = 0.0d;
        this.width = 0.0d;
        this.height = 0.0d;
    }

    public Size size() {
        return new Size(this.width, this.height);
    }

    public Point tl() {
        return new Point(this.x, this.y);
    }

    public String toString() {
        return "{" + this.x + ", " + this.y + ", " + this.width + "x" + this.height + i.d;
    }

    public Rect2d clone() {
        return new Rect2d(this.x, this.y, this.width, this.height);
    }

    public Rect2d() {
        this(0.0d, 0.0d, 0.0d, 0.0d);
    }

    public Rect2d(Point point, Point point2) {
        double d = point.x;
        double d2 = point2.x;
        double d3 = d < d2 ? d : d2;
        this.x = d3;
        double d4 = point.y;
        double d5 = point2.y;
        double d6 = d4 < d5 ? d4 : d5;
        this.y = d6;
        this.width = (d <= d2 ? d2 : d) - d3;
        this.height = (d4 <= d5 ? d5 : d4) - d6;
    }

    public Rect2d(Point point, Size size) {
        this(point.x, point.y, size.width, size.height);
    }

    public Rect2d(double[] dArr) {
        set(dArr);
    }
}
