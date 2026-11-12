package com.google.maps.android.geometry;

/* JADX INFO: loaded from: classes2.dex */
public class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d14, double d15, double d16, double d17) {
        this.minX = d14;
        this.minY = d16;
        this.maxX = d15;
        this.maxY = d17;
        this.midX = (d14 + d15) / 2.0d;
        this.midY = (d16 + d17) / 2.0d;
    }

    public boolean contains(Bounds bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }

    public boolean intersects(double d14, double d15, double d16, double d17) {
        return d14 < this.maxX && this.minX < d15 && d16 < this.maxY && this.minY < d17;
    }

    public boolean intersects(Bounds bounds) {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }

    public boolean contains(Point point) {
        return contains(point.f54320x, point.f54321y);
    }

    public boolean contains(double d14, double d15) {
        return this.minX <= d14 && d14 <= this.maxX && this.minY <= d15 && d15 <= this.maxY;
    }
}
