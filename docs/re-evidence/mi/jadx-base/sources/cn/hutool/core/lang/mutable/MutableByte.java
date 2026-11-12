package cn.hutool.core.lang.mutable;

import defpackage.s2h;

/* JADX INFO: loaded from: classes.dex */
public class MutableByte extends Number implements Comparable<MutableByte> {
    private static final long serialVersionUID = 1;
    private byte value;

    public MutableByte() {
    }

    public MutableByte add(byte b2) {
        this.value = (byte) (this.value + b2);
        return this;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.value;
    }

    public MutableByte decrement() {
        this.value = (byte) (this.value - 1);
        return this;
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

    public int hashCode() {
        return this.value;
    }

    public MutableByte increment() {
        this.value = (byte) (this.value + 1);
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

    public MutableByte subtract(byte b2) {
        this.value = (byte) (this.value - b2);
        return this;
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public MutableByte(byte b2) {
        this.value = b2;
    }

    public MutableByte add(Number number) {
        this.value = (byte) (this.value + number.byteValue());
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableByte mutableByte) {
        return s2h.a(this.value, mutableByte.value);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Byte m68get() {
        return Byte.valueOf(this.value);
    }

    public void set(byte b2) {
        this.value = b2;
    }

    public MutableByte subtract(Number number) {
        this.value = (byte) (this.value - number.byteValue());
        return this;
    }

    public void set(Number number) {
        this.value = number.byteValue();
    }

    public MutableByte(Number number) {
        this(number.byteValue());
    }

    public MutableByte(String str) throws NumberFormatException {
        this.value = Byte.parseByte(str);
    }
}
