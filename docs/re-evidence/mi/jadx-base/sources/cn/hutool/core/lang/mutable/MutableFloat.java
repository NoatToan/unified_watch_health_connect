package cn.hutool.core.lang.mutable;

import defpackage.s2h;

/* JADX INFO: loaded from: classes.dex */
public class MutableFloat extends Number implements Comparable<MutableFloat> {
    private static final long serialVersionUID = 1;
    private float value;

    public MutableFloat() {
    }

    public MutableFloat add(float f) {
        this.value += f;
        return this;
    }

    public MutableFloat decrement() {
        this.value -= 1.0f;
        return this;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableFloat) && Float.floatToIntBits(((MutableFloat) obj).value) == Float.floatToIntBits(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public MutableFloat increment() {
        this.value += 1.0f;
        return this;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    public MutableFloat subtract(float f) {
        this.value -= f;
        return this;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableFloat(float f) {
        this.value = f;
    }

    public MutableFloat add(Number number) {
        this.value += number.floatValue();
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableFloat mutableFloat) {
        return s2h.b(this.value, mutableFloat.value);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Float m70get() {
        return Float.valueOf(this.value);
    }

    public void set(float f) {
        this.value = f;
    }

    public MutableFloat subtract(Number number) {
        this.value -= number.floatValue();
        return this;
    }

    public void set(Number number) {
        this.value = number.floatValue();
    }

    public MutableFloat(Number number) {
        this(number.floatValue());
    }

    public MutableFloat(String str) throws NumberFormatException {
        this.value = Float.parseFloat(str);
    }
}
