package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.NumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public MutableLong(Number number) {
        this.value = number.longValue();
    }

    public void add(Number number) {
        this.value = number.longValue() + this.value;
    }

    public long addAndGet(Number number) {
        long jLongValue = number.longValue() + this.value;
        this.value = jLongValue;
        return jLongValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableLong mutableLong) {
        return NumberUtils.compare(this.value, mutableLong.value);
    }

    public void decrement() {
        this.value--;
    }

    public long decrementAndGet() {
        long j8 = this.value - 1;
        this.value = j8;
        return j8;
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

    public long getAndAdd(Number number) {
        long j8 = this.value;
        this.value = number.longValue() + j8;
        return j8;
    }

    public long getAndDecrement() {
        long j8 = this.value;
        this.value = j8 - 1;
        return j8;
    }

    public long getAndIncrement() {
        long j8 = this.value;
        this.value = 1 + j8;
        return j8;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public Number getValue2() {
        return Long.valueOf(this.value);
    }

    public int hashCode() {
        long j8 = this.value;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public void increment() {
        this.value++;
    }

    public long incrementAndGet() {
        long j8 = this.value + 1;
        this.value = j8;
        return j8;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.longValue();
    }

    public void subtract(Number number) {
        this.value -= number.longValue();
    }

    public Long toLong() {
        return Long.valueOf(longValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(long j8) {
        this.value = j8;
    }

    public MutableLong(long j8) {
        this.value = j8;
    }

    public void add(long j8) {
        this.value += j8;
    }

    public long addAndGet(long j8) {
        long j14 = this.value + j8;
        this.value = j14;
        return j14;
    }

    public long getAndAdd(long j8) {
        long j14 = this.value;
        this.value = j8 + j14;
        return j14;
    }

    public void subtract(long j8) {
        this.value -= j8;
    }

    public MutableLong() {
    }

    public MutableLong(String str) {
        this.value = Long.parseLong(str);
    }
}
