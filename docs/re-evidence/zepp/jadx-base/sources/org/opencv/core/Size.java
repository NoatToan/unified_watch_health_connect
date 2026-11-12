package org.opencv.core;

/* JADX INFO: loaded from: classes23.dex */
public class Size {
    public double height;
    public double width;

    public Size(double d, double d2) {
        this.width = d;
        this.height = d2;
    }

    public double area() {
        return this.width * this.height;
    }

    public boolean empty() {
        return this.width <= 0.0d || this.height <= 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.height);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.width);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.width = dArr.length > 0 ? dArr[0] : 0.0d;
            this.height = dArr.length > 1 ? dArr[1] : 0.0d;
        } else {
            this.width = 0.0d;
            this.height = 0.0d;
        }
    }

    public String toString() {
        return ((int) this.width) + "x" + ((int) this.height);
    }

    public Size clone() {
        return new Size(this.width, this.height);
    }

    public Size() {
        this(0.0d, 0.0d);
    }

    public Size(Point point) {
        this.width = point.x;
        this.height = point.y;
    }

    public Size(double[] dArr) {
        set(dArr);
    }
}
