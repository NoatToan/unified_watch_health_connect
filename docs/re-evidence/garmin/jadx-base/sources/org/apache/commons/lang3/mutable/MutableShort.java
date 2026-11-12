package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.NumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MutableShort extends Number implements Comparable<MutableShort>, Mutable<Number> {
    private static final long serialVersionUID = -2135791679;
    private short value;

    public MutableShort(Number number) {
        this.value = number.shortValue();
    }

    public void add(Number number) {
        this.value = (short) (number.shortValue() + this.value);
    }

    public short addAndGet(Number number) {
        short sShortValue = (short) (number.shortValue() + this.value);
        this.value = sShortValue;
        return sShortValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableShort mutableShort) {
        return NumberUtils.compare(this.value, mutableShort.value);
    }

    public void decrement() {
        this.value = (short) (this.value - 1);
    }

    public short decrementAndGet() {
        short s8 = (short) (this.value - 1);
        this.value = s8;
        return s8;
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

    public short getAndAdd(Number number) {
        short s8 = this.value;
        this.value = (short) (number.shortValue() + s8);
        return s8;
    }

    public short getAndDecrement() {
        short s8 = this.value;
        this.value = (short) (s8 - 1);
        return s8;
    }

    public short getAndIncrement() {
        short s8 = this.value;
        this.value = (short) (s8 + 1);
        return s8;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public Number getValue2() {
        return Short.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value = (short) (this.value + 1);
    }

    public short incrementAndGet() {
        short s8 = (short) (this.value + 1);
        this.value = s8;
        return s8;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.shortValue();
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.value;
    }

    public void subtract(Number number) {
        this.value = (short) (this.value - number.shortValue());
    }

    public Short toShort() {
        return Short.valueOf(shortValue());
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public void setValue(short s8) {
        this.value = s8;
    }

    public MutableShort(short s8) {
        this.value = s8;
    }

    public void add(short s8) {
        this.value = (short) (this.value + s8);
    }

    public short addAndGet(short s8) {
        short s14 = (short) (this.value + s8);
        this.value = s14;
        return s14;
    }

    public short getAndAdd(short s8) {
        short s14 = this.value;
        this.value = (short) (s8 + s14);
        return s14;
    }

    public void subtract(short s8) {
        this.value = (short) (this.value - s8);
    }

    public MutableShort() {
    }

    public MutableShort(String str) {
        this.value = Short.parseShort(str);
    }
}
