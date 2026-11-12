package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes3.dex */
public class MutableDouble extends Number implements Comparable<MutableDouble>, Mutable<Number> {
    private static final long serialVersionUID = 1587163916;
    private double value;

    public MutableDouble(Number number) {
        this.value = number.doubleValue();
    }

    public void add(Number number) {
        this.value = number.doubleValue() + this.value;
    }

    public double addAndGet(Number number) {
        double dDoubleValue = number.doubleValue() + this.value;
        this.value = dDoubleValue;
        return dDoubleValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableDouble mutableDouble) {
        return Double.compare(this.value, mutableDouble.value);
    }

    public void decrement() {
        this.value -= 1.0d;
    }

    public double decrementAndGet() {
        double d14 = this.value - 1.0d;
        this.value = d14;
        return d14;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableDouble) && Double.doubleToLongBits(((MutableDouble) obj).value) == Double.doubleToLongBits(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.value;
    }

    public double getAndAdd(Number number) {
        double d14 = this.value;
        this.value = number.doubleValue() + d14;
        return d14;
    }

    public double getAndDecrement() {
        double d14 = this.value;
        this.value = d14 - 1.0d;
        return d14;
    }

    public double getAndIncrement() {
        double d14 = this.value;
        this.value = 1.0d + d14;
        return d14;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public Number getValue2() {
        return Double.valueOf(this.value);
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public void increment() {
        this.value += 1.0d;
    }

    public double incrementAndGet() {
        double d14 = this.value + 1.0d;
        this.value = d14;
        return d14;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    public boolean isInfinite() {
        return Double.isInfinite(this.value);
    }

    public boolean isNaN() {
        return Double.isNaN(this.value);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.doubleValue();
    }

    public void subtract(Number number) {
        this.value -= number.doubleValue();
    }

    public Double toDouble() {
        return Double.valueOf(doubleValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(double d14) {
        this.value = d14;
    }

    public MutableDouble(double d14) {
        this.value = d14;
    }

    public void add(double d14) {
        this.value += d14;
    }

    public double addAndGet(double d14) {
        double d15 = this.value + d14;
        this.value = d15;
        return d15;
    }

    public double getAndAdd(double d14) {
        double d15 = this.value;
        this.value = d14 + d15;
        return d15;
    }

    public void subtract(double d14) {
        this.value -= d14;
    }

    public MutableDouble() {
    }

    public MutableDouble(String str) {
        this.value = Double.parseDouble(str);
    }
}
