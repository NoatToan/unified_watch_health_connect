package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.math.DoubleMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class BloomFilter<T> implements Predicate<T>, Serializable {
    private final g.c a;
    private final int b;
    private final Funnel<? super T> c;
    private final c d;

    public static class b<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] a;
        public final int b;
        public final Funnel<? super T> c;
        public final c d;

        public b(BloomFilter<T> bloomFilter) {
            this.a = g.c.g(((BloomFilter) bloomFilter).a.a);
            this.b = ((BloomFilter) bloomFilter).b;
            this.c = ((BloomFilter) bloomFilter).c;
            this.d = ((BloomFilter) bloomFilter).d;
        }

        public Object readResolve() {
            return new BloomFilter(new g.c(this.a), this.b, this.c, this.d);
        }
    }

    public interface c extends Serializable {
        <T> boolean d(T t, Funnel<? super T> funnel, int i, g.c cVar);

        <T> boolean l(T t, Funnel<? super T> funnel, int i, g.c cVar);

        int ordinal();
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i, double d) {
        return create(funnel, i, d);
    }

    @VisibleForTesting
    public static <T> BloomFilter<T> g(Funnel<? super T> funnel, long j, double d, c cVar) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(j >= 0, "Expected insertions (%s) must be >= 0", j);
        Preconditions.checkArgument(d > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        Preconditions.checkArgument(d < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        Preconditions.checkNotNull(cVar);
        if (j == 0) {
            j = 1;
        }
        long jH = h(j, d);
        try {
            return new BloomFilter<>(new g.c(jH), i(j, jH), funnel, cVar);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + jH + " bits", e);
        }
    }

    @VisibleForTesting
    public static long h(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    @VisibleForTesting
    public static int i(long j, long j2) {
        return Math.max(1, (int) Math.round((j2 / j) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i;
        int i2;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        byte b2 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b3 = dataInputStream.readByte();
            try {
                i2 = UnsignedBytes.toInt(dataInputStream.readByte());
                try {
                    int i3 = dataInputStream.readInt();
                    try {
                        g gVar = g.values()[b3];
                        long[] jArr = new long[i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            jArr[i4] = dataInputStream.readLong();
                        }
                        return new BloomFilter<>(new g.c(jArr), i2, funnel, gVar);
                    } catch (RuntimeException e) {
                        e = e;
                        b2 = b3;
                        i = i3;
                        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + ((int) b2) + " numHashFunctions: " + i2 + " dataLength: " + i, e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    b2 = b3;
                    i = -1;
                    throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + ((int) b2) + " numHashFunctions: " + i2 + " dataLength: " + i, e);
                }
            } catch (RuntimeException e3) {
                e = e3;
                i2 = -1;
            }
        } catch (RuntimeException e4) {
            e = e4;
            i = -1;
            i2 = -1;
        }
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double dB = this.a.b();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.a.a() / dB))) * dB) / ((double) this.b), RoundingMode.HALF_UP);
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.a.c(), this.b, this.c, this.d);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.b == bloomFilter.b && this.c.equals(bloomFilter.c) && this.a.equals(bloomFilter.a) && this.d.equals(bloomFilter.d);
    }

    public double expectedFpp() {
        return Math.pow(this.a.a() / f(), this.b);
    }

    @VisibleForTesting
    public long f() {
        return this.a.b();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), this.c, this.d, this.a);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.b == bloomFilter.b && f() == bloomFilter.f() && this.d.equals(bloomFilter.d) && this.c.equals(bloomFilter.c);
    }

    public boolean mightContain(T t) {
        return this.d.d(t, this.c, this.b, this.a);
    }

    @CanIgnoreReturnValue
    public boolean put(T t) {
        return this.d.l(t, this.c, this.b, this.a);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i = this.b;
        int i2 = bloomFilter.b;
        Preconditions.checkArgument(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        Preconditions.checkArgument(f() == bloomFilter.f(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", f(), bloomFilter.f());
        Preconditions.checkArgument(this.d.equals(bloomFilter.d), "BloomFilters must have equal strategies (%s != %s)", this.d, bloomFilter.d);
        Preconditions.checkArgument(this.c.equals(bloomFilter.c), "BloomFilters must have equal funnels (%s != %s)", this.c, bloomFilter.c);
        this.a.e(bloomFilter.a);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.d.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.b));
        dataOutputStream.writeInt(this.a.a.length());
        for (int i = 0; i < this.a.a.length(); i++) {
            dataOutputStream.writeLong(this.a.a.get(i));
        }
    }

    private BloomFilter(g.c cVar, int i, Funnel<? super T> funnel, c cVar2) {
        Preconditions.checkArgument(i > 0, "numHashFunctions (%s) must be > 0", i);
        Preconditions.checkArgument(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.a = (g.c) Preconditions.checkNotNull(cVar);
        this.b = i;
        this.c = (Funnel) Preconditions.checkNotNull(funnel);
        this.d = (c) Preconditions.checkNotNull(cVar2);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d) {
        return g(funnel, j, d, g.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i) {
        return create(funnel, i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j) {
        return create(funnel, j, 0.03d);
    }
}
