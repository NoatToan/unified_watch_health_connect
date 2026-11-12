package org.apache.commons.lang.mutable;

/* JADX INFO: loaded from: classes23.dex */
public class MutableLong extends Number implements Comparable, Mutable {
    private static final long serialVersionUID = 62986528375L;
    private long a;

    public MutableLong() {
    }

    public void add(long j) {
        this.a += j;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j = ((MutableLong) obj).a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public void decrement() {
        this.a--;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableLong) && this.a == ((MutableLong) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return new Long(this.a);
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public void increment() {
        this.a++;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.a;
    }

    public void setValue(long j) {
        this.a = j;
    }

    public void subtract(long j) {
        this.a -= j;
    }

    public Long toLong() {
        return new Long(longValue());
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public MutableLong(long j) {
        this.a = j;
    }

    public void add(Number number) {
        this.a += number.longValue();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Number) obj).longValue());
    }

    public void subtract(Number number) {
        this.a -= number.longValue();
    }

    public MutableLong(Number number) {
        this.a = number.longValue();
    }

    public MutableLong(String str) throws NumberFormatException {
        this.a = Long.parseLong(str);
    }
}
