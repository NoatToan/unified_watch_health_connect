package com.google.common.util.concurrent;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public AtomicDouble(double d14) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d14));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        set(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(get());
    }

    @CanIgnoreReturnValue
    public final double addAndGet(double d14) {
        long j8;
        double dLongBitsToDouble;
        do {
            j8 = this.value.get();
            dLongBitsToDouble = Double.longBitsToDouble(j8) + d14;
        } while (!this.value.compareAndSet(j8, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean compareAndSet(double d14, double d15) {
        return this.value.compareAndSet(Double.doubleToRawLongBits(d14), Double.doubleToRawLongBits(d15));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(double d14) {
        long j8;
        double dLongBitsToDouble;
        do {
            j8 = this.value.get();
            dLongBitsToDouble = Double.longBitsToDouble(j8);
        } while (!this.value.compareAndSet(j8, Double.doubleToRawLongBits(dLongBitsToDouble + d14)));
        return dLongBitsToDouble;
    }

    public final double getAndSet(double d14) {
        return Double.longBitsToDouble(this.value.getAndSet(Double.doubleToRawLongBits(d14)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    public final void lazySet(double d14) {
        this.value.lazySet(Double.doubleToRawLongBits(d14));
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    public final void set(double d14) {
        this.value.set(Double.doubleToRawLongBits(d14));
    }

    public String toString() {
        return Double.toString(get());
    }

    public final boolean weakCompareAndSet(double d14, double d15) {
        return this.value.weakCompareAndSet(Double.doubleToRawLongBits(d14), Double.doubleToRawLongBits(d15));
    }

    public AtomicDouble() {
        this(0.0d);
    }
}
