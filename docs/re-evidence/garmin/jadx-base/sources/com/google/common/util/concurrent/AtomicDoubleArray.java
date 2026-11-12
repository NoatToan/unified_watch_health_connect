package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLongArray longs;

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i14 = 0; i14 < length; i14++) {
            jArr[i14] = Double.doubleToRawLongBits(dArr[i14]);
        }
        this.longs = new AtomicLongArray(jArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i14 = objectInputStream.readInt();
        ImmutableLongArray.Builder builder = ImmutableLongArray.builder();
        for (int i15 = 0; i15 < i14; i15++) {
            builder.add(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.longs = new AtomicLongArray(builder.build().toArray());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int length = length();
        objectOutputStream.writeInt(length);
        for (int i14 = 0; i14 < length; i14++) {
            objectOutputStream.writeDouble(get(i14));
        }
    }

    @CanIgnoreReturnValue
    public double addAndGet(int i14, double d14) {
        while (true) {
            long j8 = this.longs.get(i14);
            double dLongBitsToDouble = Double.longBitsToDouble(j8) + d14;
            int i15 = i14;
            if (this.longs.compareAndSet(i15, j8, Double.doubleToRawLongBits(dLongBitsToDouble))) {
                return dLongBitsToDouble;
            }
            i14 = i15;
        }
    }

    public final boolean compareAndSet(int i14, double d14, double d15) {
        return this.longs.compareAndSet(i14, Double.doubleToRawLongBits(d14), Double.doubleToRawLongBits(d15));
    }

    public final double get(int i14) {
        return Double.longBitsToDouble(this.longs.get(i14));
    }

    @CanIgnoreReturnValue
    public final double getAndAdd(int i14, double d14) {
        while (true) {
            long j8 = this.longs.get(i14);
            double dLongBitsToDouble = Double.longBitsToDouble(j8);
            int i15 = i14;
            if (this.longs.compareAndSet(i15, j8, Double.doubleToRawLongBits(dLongBitsToDouble + d14))) {
                return dLongBitsToDouble;
            }
            i14 = i15;
        }
    }

    public final double getAndSet(int i14, double d14) {
        return Double.longBitsToDouble(this.longs.getAndSet(i14, Double.doubleToRawLongBits(d14)));
    }

    public final void lazySet(int i14, double d14) {
        this.longs.lazySet(i14, Double.doubleToRawLongBits(d14));
    }

    public final int length() {
        return this.longs.length();
    }

    public final void set(int i14, double d14) {
        this.longs.set(i14, Double.doubleToRawLongBits(d14));
    }

    public String toString() {
        int length = length();
        int i14 = length - 1;
        if (i14 == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb3 = new StringBuilder(length * 19);
        sb3.append('[');
        int i15 = 0;
        while (true) {
            sb3.append(Double.longBitsToDouble(this.longs.get(i15)));
            if (i15 == i14) {
                sb3.append(']');
                return sb3.toString();
            }
            sb3.append(", ");
            i15++;
        }
    }

    public final boolean weakCompareAndSet(int i14, double d14, double d15) {
        return this.longs.weakCompareAndSet(i14, Double.doubleToRawLongBits(d14), Double.doubleToRawLongBits(d15));
    }

    public AtomicDoubleArray(int i14) {
        this.longs = new AtomicLongArray(i14);
    }
}
