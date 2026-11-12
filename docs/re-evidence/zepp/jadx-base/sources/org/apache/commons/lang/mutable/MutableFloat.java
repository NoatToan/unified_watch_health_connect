package org.apache.commons.lang.mutable;

import org.apache.commons.lang.math.NumberUtils;

/* JADX INFO: loaded from: classes23.dex */
public class MutableFloat extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 5787169186L;
    private float a;

    public MutableFloat() {
    }

    public void add(float f) {
        this.a += f;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return NumberUtils.compare(this.a, ((MutableFloat) obj).a);
    }

    public void decrement() {
        this.a -= 1.0f;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableFloat) && Float.floatToIntBits(((MutableFloat) obj).a) == Float.floatToIntBits(this.a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Float(this.a);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public void increment() {
        this.a += 1.0f;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.a;
    }

    public boolean isInfinite() {
        return Float.isInfinite(this.a);
    }

    public boolean isNaN() {
        return Float.isNaN(this.a);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.a;
    }

    public void setValue(float f) {
        this.a = f;
    }

    public void subtract(float f) {
        this.a -= f;
    }

    public Float toFloat() {
        return new Float(floatValue());
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public MutableFloat(float f) {
        this.a = f;
    }

    public void add(Number number) {
        this.a += number.floatValue();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).floatValue());
    }

    public void subtract(Number number) {
        this.a -= number.floatValue();
    }

    public MutableFloat(Number number) {
        this.a = number.floatValue();
    }

    public MutableFloat(String str) throws NumberFormatException {
        this.a = Float.parseFloat(str);
    }
}
