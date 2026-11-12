package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes3.dex */
public class MutableFloat extends Number implements Comparable<MutableFloat>, Mutable<Number> {
    private static final long serialVersionUID = 5787169186L;
    private float value;

    public MutableFloat(Number number) {
        this.value = number.floatValue();
    }

    public void add(Number number) {
        this.value = number.floatValue() + this.value;
    }

    public float addAndGet(Number number) {
        float fFloatValue = number.floatValue() + this.value;
        this.value = fFloatValue;
        return fFloatValue;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableFloat mutableFloat) {
        return Float.compare(this.value, mutableFloat.value);
    }

    public void decrement() {
        this.value -= 1.0f;
    }

    public float decrementAndGet() {
        float f14 = this.value - 1.0f;
        this.value = f14;
        return f14;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableFloat) && Float.floatToIntBits(((MutableFloat) obj).value) == Float.floatToIntBits(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public float getAndAdd(Number number) {
        float f14 = this.value;
        this.value = number.floatValue() + f14;
        return f14;
    }

    public float getAndDecrement() {
        float f14 = this.value;
        this.value = f14 - 1.0f;
        return f14;
    }

    public float getAndIncrement() {
        float f14 = this.value;
        this.value = 1.0f + f14;
        return f14;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Number getValue2() {
        return Float.valueOf(this.value);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public void increment() {
        this.value += 1.0f;
    }

    public float incrementAndGet() {
        float f14 = this.value + 1.0f;
        this.value = f14;
        return f14;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    public boolean isInfinite() {
        return Float.isInfinite(this.value);
    }

    public boolean isNaN() {
        return Float.isNaN(this.value);
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.value;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(Number number) {
        this.value = number.floatValue();
    }

    public void subtract(Number number) {
        this.value -= number.floatValue();
    }

    public Float toFloat() {
        return Float.valueOf(floatValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(float f14) {
        this.value = f14;
    }

    public MutableFloat(float f14) {
        this.value = f14;
    }

    public void add(float f14) {
        this.value += f14;
    }

    public float addAndGet(float f14) {
        float f15 = this.value + f14;
        this.value = f15;
        return f15;
    }

    public float getAndAdd(float f14) {
        float f15 = this.value;
        this.value = f14 + f15;
        return f15;
    }

    public void subtract(float f14) {
        this.value -= f14;
    }

    public MutableFloat() {
    }

    public MutableFloat(String str) {
        this.value = Float.parseFloat(str);
    }
}
