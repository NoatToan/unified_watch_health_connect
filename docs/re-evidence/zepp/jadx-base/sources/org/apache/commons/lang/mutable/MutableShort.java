package org.apache.commons.lang.mutable;

/* JADX INFO: loaded from: classes23.dex */
public class MutableShort extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = -2135791679;
    private short a;

    public MutableShort() {
    }

    public void add(short s) {
        this.a = (short) (this.a + s);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        short s = ((MutableShort) obj).a;
        short s2 = this.a;
        if (s2 < s) {
            return -1;
        }
        return s2 == s ? 0 : 1;
    }

    public void decrement() {
        this.a = (short) (this.a - 1);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableShort) && this.a == ((MutableShort) obj).shortValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Short(this.a);
    }

    public int hashCode() {
        return this.a;
    }

    public void increment() {
        this.a = (short) (this.a + 1);
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.a;
    }

    public void setValue(short s) {
        this.a = s;
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.a;
    }

    public void subtract(short s) {
        this.a = (short) (this.a - s);
    }

    public Short toShort() {
        return new Short(shortValue());
    }

    public String toString() {
        return String.valueOf((int) this.a);
    }

    public MutableShort(short s) {
        this.a = s;
    }

    public void add(Number number) {
        this.a = (short) (this.a + number.shortValue());
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).shortValue());
    }

    public void subtract(Number number) {
        this.a = (short) (this.a - number.shortValue());
    }

    public MutableShort(Number number) {
        this.a = number.shortValue();
    }

    public MutableShort(String str) throws NumberFormatException {
        this.a = Short.parseShort(str);
    }
}
