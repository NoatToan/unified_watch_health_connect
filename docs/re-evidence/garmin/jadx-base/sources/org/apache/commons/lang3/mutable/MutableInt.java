package org.apache.commons.lang3.mutable;

import org.apache.commons.lang3.math.NumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MutableInt extends Number implements Comparable<MutableInt>, Mutable<Number> {
    private static final long serialVersionUID = 512176391864L;
    private int value;

    public MutableInt(Number number) {
        this.value = number.intValue();
    }

    public void add(Number number) {
        this.value = number.intValue() + this.value;
    }

    public int addAndGet(Number number) {
        int iIntValue = number.intValue() + this.value;
        this.value = iIntValue;
        return iIntValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableInt mutableInt) {
        return NumberUtils.compare(this.value, mutableInt.value);
    }

    public void decrement() {
        this.value--;
    }

    public int decrementAndGet() {
        int i14 = this.value - 1;
        this.value = i14;
        return i14;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableInt) && this.value == ((MutableInt) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int getAndAdd(Number number) {
        int i14 = this.value;
        this.value = number.intValue() + i14;
        return i14;
    }

    public int getAndDecrement() {
        int i14 = this.value;
        this.value = i14 - 1;
        return i14;
    }

    public int getAndIncrement() {
        int i14 = this.value;
        this.value = i14 + 1;
        return i14;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public Number getValue2() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }

    public int incrementAndGet() {
        int i14 = this.value + 1;
        this.value = i14;
        return i14;
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
        this.value = number.intValue();
    }

    public void subtract(Number number) {
        this.value -= number.intValue();
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(int i14) {
        this.value = i14;
    }

    public MutableInt(int i14) {
        this.value = i14;
    }

    public void add(int i14) {
        this.value += i14;
    }

    public int addAndGet(int i14) {
        int i15 = this.value + i14;
        this.value = i15;
        return i15;
    }

    public int getAndAdd(int i14) {
        int i15 = this.value;
        this.value = i14 + i15;
        return i15;
    }

    public void subtract(int i14) {
        this.value -= i14;
    }

    public MutableInt() {
    }

    public MutableInt(String str) {
        this.value = Integer.parseInt(str);
    }
}
