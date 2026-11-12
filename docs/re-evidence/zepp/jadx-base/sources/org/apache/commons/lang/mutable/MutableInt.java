package org.apache.commons.lang.mutable;

/* JADX INFO: loaded from: classes23.dex */
public class MutableInt extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 512176391864L;
    private int a;

    public MutableInt() {
    }

    public void add(int i) {
        this.a += i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = ((MutableInt) obj).a;
        int i2 = this.a;
        if (i2 < i) {
            return -1;
        }
        return i2 == i ? 0 : 1;
    }

    public void decrement() {
        this.a--;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableInt) && this.a == ((MutableInt) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Integer(this.a);
    }

    public int hashCode() {
        return this.a;
    }

    public void increment() {
        this.a++;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.a;
    }

    public void setValue(int i) {
        this.a = i;
    }

    public void subtract(int i) {
        this.a -= i;
    }

    public Integer toInteger() {
        return new Integer(intValue());
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public MutableInt(int i) {
        this.a = i;
    }

    public void add(Number number) {
        this.a += number.intValue();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    public void subtract(Number number) {
        this.a -= number.intValue();
    }

    public MutableInt(Number number) {
        this.a = number.intValue();
    }

    public MutableInt(String str) throws NumberFormatException {
        this.a = Integer.parseInt(str);
    }
}
