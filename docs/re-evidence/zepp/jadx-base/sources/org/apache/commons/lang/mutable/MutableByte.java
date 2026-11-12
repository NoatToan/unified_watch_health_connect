package org.apache.commons.lang.mutable;

/* JADX INFO: loaded from: classes23.dex */
public class MutableByte extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = -1585823265;
    private byte a;

    public MutableByte() {
    }

    public void add(byte b) {
        this.a = (byte) (this.a + b);
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        byte b = ((MutableByte) obj).a;
        byte b2 = this.a;
        if (b2 < b) {
            return -1;
        }
        return b2 == b ? 0 : 1;
    }

    public void decrement() {
        this.a = (byte) (this.a - 1);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableByte) && this.a == ((MutableByte) obj).byteValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Byte(this.a);
    }

    public int hashCode() {
        return this.a;
    }

    public void increment() {
        this.a = (byte) (this.a + 1);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.a;
    }

    public void setValue(byte b) {
        this.a = b;
    }

    public void subtract(byte b) {
        this.a = (byte) (this.a - b);
    }

    public Byte toByte() {
        return new Byte(byteValue());
    }

    public String toString() {
        return String.valueOf((int) this.a);
    }

    public MutableByte(byte b) {
        this.a = b;
    }

    public void add(Number number) {
        this.a = (byte) (this.a + number.byteValue());
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).byteValue());
    }

    public void subtract(Number number) {
        this.a = (byte) (this.a - number.byteValue());
    }

    public MutableByte(Number number) {
        this.a = number.byteValue();
    }

    public MutableByte(String str) throws NumberFormatException {
        this.a = Byte.parseByte(str);
    }
}
