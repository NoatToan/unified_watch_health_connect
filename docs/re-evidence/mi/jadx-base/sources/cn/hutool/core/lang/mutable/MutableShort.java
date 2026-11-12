package cn.hutool.core.lang.mutable;

import defpackage.s2h;

/* JADX INFO: loaded from: classes.dex */
public class MutableShort extends Number implements Comparable<MutableShort> {
    private static final long serialVersionUID = 1;
    private short value;

    public MutableShort() {
    }

    public MutableShort add(short s) {
        this.value = (short) (this.value + s);
        return this;
    }

    public MutableShort decrement() {
        this.value = (short) (this.value - 1);
        return this;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableShort) && this.value == ((MutableShort) obj).shortValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public MutableShort increment() {
        this.value = (short) (this.value + 1);
        return this;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.value;
    }

    public MutableShort subtract(short s) {
        this.value = (short) (this.value - s);
        return this;
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public MutableShort(short s) {
        this.value = s;
    }

    public MutableShort add(Number number) {
        this.value = (short) (this.value + number.shortValue());
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableShort mutableShort) {
        return s2h.e(this.value, mutableShort.value);
    }

    public Short get() {
        return Short.valueOf(this.value);
    }

    public void set(short s) {
        this.value = s;
    }

    public MutableShort subtract(Number number) {
        this.value = (short) (this.value - number.shortValue());
        return this;
    }

    public void set(Number number) {
        this.value = number.shortValue();
    }

    public MutableShort(Number number) {
        this(number.shortValue());
    }

    public MutableShort(String str) throws NumberFormatException {
        this.value = Short.parseShort(str);
    }
}
