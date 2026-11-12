package org.apache.commons.lang.mutable;

import org.apache.commons.lang.math.NumberUtils;

/* JADX INFO: loaded from: classes23.dex */
public class MutableDouble extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 1587163916;
    private double a;

    public MutableDouble() {
    }

    public void add(double d) {
        this.a += d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return NumberUtils.compare(this.a, ((MutableDouble) obj).a);
    }

    public void decrement() {
        this.a -= 1.0d;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableDouble) && Double.doubleToLongBits(((MutableDouble) obj).a) == Double.doubleToLongBits(this.a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Double(this.a);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public void increment() {
        this.a += 1.0d;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.a;
    }

    public boolean isInfinite() {
        return Double.isInfinite(this.a);
    }

    public boolean isNaN() {
        return Double.isNaN(this.a);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.a;
    }

    public void setValue(double d) {
        this.a = d;
    }

    public void subtract(double d) {
        this.a -= d;
    }

    public Double toDouble() {
        return new Double(doubleValue());
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public MutableDouble(double d) {
        this.a = d;
    }

    public void add(Number number) {
        this.a += number.doubleValue();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).doubleValue());
    }

    public void subtract(Number number) {
        this.a -= number.doubleValue();
    }

    public MutableDouble(Number number) {
        this.a = number.doubleValue();
    }

    public MutableDouble(String str) throws NumberFormatException {
        this.a = Double.parseDouble(str);
    }
}
