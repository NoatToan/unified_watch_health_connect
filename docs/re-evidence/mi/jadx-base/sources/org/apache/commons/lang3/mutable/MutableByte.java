package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes3.dex */
public class MutableByte extends Number implements Comparable<MutableByte> {
    private static final long serialVersionUID = -1585823265;
    private byte value;

    public MutableByte() {
    }

    public void add(byte b2) {
        this.value = (byte) (this.value + b2);
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.value;
    }

    public void decrement() {
        this.value = (byte) (this.value - 1);
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

    public void increment() {
        this.value = (byte) (this.value + 1);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void subtract(byte b2) {
        this.value = (byte) (this.value - b2);
    }

    public Byte toByte() {
        return Byte.valueOf(byteValue());
    }

    public String toString() {
        return String.valueOf((int) this.value);
    }

    public MutableByte(byte b2) {
        this.value = b2;
    }

    public void add(Number number) {
        this.value = (byte) (this.value + number.byteValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableByte mutableByte) {
        byte b2 = mutableByte.value;
        byte b3 = this.value;
        if (b3 < b2) {
            return -1;
        }
        return b3 == b2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Byte m2660getValue() {
        return Byte.valueOf(this.value);
    }

    public void setValue(byte b2) {
        this.value = b2;
    }

    public void subtract(Number number) {
        this.value = (byte) (this.value - number.byteValue());
    }

    public void setValue(Number number) {
        this.value = number.byteValue();
    }

    public MutableByte(Number number) {
        this.value = number.byteValue();
    }

    public MutableByte(String str) throws NumberFormatException {
        this.value = Byte.parseByte(str);
    }
}
