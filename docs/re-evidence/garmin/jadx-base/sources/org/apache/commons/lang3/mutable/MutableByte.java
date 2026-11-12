package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.NumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MutableByte extends Number implements Comparable<MutableByte>, Mutable<Number> {
    private static final long serialVersionUID = -1585823265;
    private byte value;

    public MutableByte(Number number) {
        this.value = number.byteValue();
    }

    public void add(Number number) {
        this.value = (byte) (number.byteValue() + this.value);
    }

    public byte addAndGet(Number number) {
        byte bByteValue = (byte) (number.byteValue() + this.value);
        this.value = bByteValue;
        return bByteValue;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableByte mutableByte) {
        return NumberUtils.compare(this.value, mutableByte.value);
    }

    public void decrement() {
        this.value = (byte) (this.value - 1);
    }

    public byte decrementAndGet() {
        byte b14 = (byte) (this.value - 1);
        this.value = b14;
        return b14;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableByte) && this.value == ((MutableByte) obj).byteValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public byte getAndAdd(Number number) {
        byte b14 = this.value;
        this.value = (byte) (number.byteValue() + b14);
        return b14;
    }

    public byte getAndDecrement() {
        byte b14 = this.value;
        this.value = (byte) (b14 - 1);
        return b14;
    }

    public byte getAndIncrement() {
        byte b14 = this.value;
        this.value = (byte) (b14 + 1);
        return b14;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public Number getValue2() {
        return Byte.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value = (byte) (this.value + 1);
    }

    public byte incrementAndGet() {
        byte b14 = (byte) (this.value + 1);
        this.value = b14;
        return b14;
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
        this.value = number.byteValue();
    }

    public void subtract(Number number) {
        this.value = (byte) (this.value - number.byteValue());
    }

    public Byte toByte() {
        return Byte.valueOf(byteValue());
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public void setValue(byte b14) {
        this.value = b14;
    }

    public MutableByte(byte b14) {
        this.value = b14;
    }

    public void add(byte b14) {
        this.value = (byte) (this.value + b14);
    }

    public byte addAndGet(byte b14) {
        byte b15 = (byte) (this.value + b14);
        this.value = b15;
        return b15;
    }

    public byte getAndAdd(byte b14) {
        byte b15 = this.value;
        this.value = (byte) (b14 + b15);
        return b15;
    }

    public void subtract(byte b14) {
        this.value = (byte) (this.value - b14);
    }

    public MutableByte() {
    }

    public MutableByte(String str) {
        this.value = Byte.parseByte(str);
    }
}
