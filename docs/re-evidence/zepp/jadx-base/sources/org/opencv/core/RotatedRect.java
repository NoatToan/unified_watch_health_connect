package org.opencv.core;

/* JADX INFO: loaded from: classes23.dex */
public class RotatedRect {
    public double angle;
    public Point center;
    public Size size;

    public RotatedRect() {
        this.center = new Point();
        this.size = new Size();
        this.angle = 0.0d;
    }

    public Rect boundingRect() {
        Point[] pointArr = new Point[4];
        points(pointArr);
        Rect rect = new Rect((int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].x, pointArr[1].x), pointArr[2].x), pointArr[3].x)), (int) Math.floor(Math.min(Math.min(Math.min(pointArr[0].y, pointArr[1].y), pointArr[2].y), pointArr[3].y)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].x, pointArr[1].x), pointArr[2].x), pointArr[3].x)), (int) Math.ceil(Math.max(Math.max(Math.max(pointArr[0].y, pointArr[1].y), pointArr[2].y), pointArr[3].y)));
        rect.width -= rect.x - 1;
        rect.height -= rect.y - 1;
        return rect;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotatedRect)) {
            return false;
        }
        RotatedRect rotatedRect = (RotatedRect) obj;
        return this.center.equals(rotatedRect.center) && this.size.equals(rotatedRect.size) && this.angle == rotatedRect.angle;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.center.x);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.center.y);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.size.width);
        int i2 = (i * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.size.height);
        int i3 = (i2 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.angle);
        return (i3 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
    }

    public void points(Point[] pointArr) {
        double d = (this.angle * 3.141592653589793d) / 180.0d;
        double dCos = Math.cos(d) * 0.5d;
        double dSin = Math.sin(d) * 0.5d;
        Point point = this.center;
        double d2 = point.x;
        Size size = this.size;
        double d3 = size.height;
        double d4 = size.width;
        pointArr[0] = new Point((d2 - (dSin * d3)) - (dCos * d4), (point.y + (d3 * dCos)) - (d4 * dSin));
        Point point2 = this.center;
        double d5 = point2.x;
        Size size2 = this.size;
        double d6 = size2.height;
        double d7 = size2.width;
        pointArr[1] = new Point((d5 + (dSin * d6)) - (dCos * d7), (point2.y - (dCos * d6)) - (dSin * d7));
        Point point3 = this.center;
        pointArr[2] = new Point((point3.x * 2.0d) - pointArr[0].x, (point3.y * 2.0d) - pointArr[0].y);
        Point point4 = this.center;
        pointArr[3] = new Point((point4.x * 2.0d) - pointArr[1].x, (point4.y * 2.0d) - pointArr[1].y);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            Point point = this.center;
            point.x = dArr.length > 0 ? dArr[0] : 0.0d;
            point.y = dArr.length > 1 ? dArr[1] : 0.0d;
            Size size = this.size;
            size.width = dArr.length > 2 ? dArr[2] : 0.0d;
            size.height = dArr.length > 3 ? dArr[3] : 0.0d;
            this.angle = dArr.length > 4 ? dArr[4] : 0.0d;
            return;
        }
        Point point2 = this.center;
        point2.x = 0.0d;
        point2.y = 0.0d;
        Size size2 = this.size;
        size2.width = 0.0d;
        size2.height = 0.0d;
        this.angle = 0.0d;
    }

    public String toString() {
        return "{ " + this.center + " " + this.size + " * " + this.angle + " }";
    }

    public RotatedRect clone() {
        return new RotatedRect(this.center, this.size, this.angle);
    }

    public RotatedRect(Point point, Size size, double d) {
        this.center = point.clone();
        this.size = size.clone();
        this.angle = d;
    }

    public RotatedRect(double[] dArr) {
        this();
        set(dArr);
    }
}
