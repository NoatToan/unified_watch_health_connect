package cn.hutool.core.lang.mutable;

import defpackage.s2h;

/* JADX INFO: loaded from: classes.dex */
public class MutableLong extends Number implements Comparable<MutableLong> {
    private static final long serialVersionUID = 1;
    private long value;

    public MutableLong() {
    }

    public MutableLong add(long j) {
        this.value += j;
        return this;
    }

    public MutableLong decrement() {
        this.value--;
        return this;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableLong) && this.value == ((MutableLong) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    public MutableLong increment() {
        this.value++;
        return this;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public MutableLong subtract(long j) {
        this.value -= j;
        return this;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableLong(long j) {
        this.value = j;
    }

    public MutableLong add(Number number) {
        this.value += number.longValue();
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableLong mutableLong) {
        return s2h.d(this.value, mutableLong.value);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Long m72get() {
        return Long.valueOf(this.value);
    }

    public void set(long j) {
        this.value = j;
    }

    public MutableLong subtract(Number number) {
        this.value -= number.longValue();
        return this;
    }

    public void set(Number number) {
        this.value = number.longValue();
    }

    public MutableLong(Number number) {
        this(number.longValue());
    }

    public MutableLong(String str) throws NumberFormatException {
        this.value = Long.parseLong(str);
    }
}
