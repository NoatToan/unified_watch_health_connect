package com.google.common.hash;

import defpackage.c6i;
import defpackage.h6i;
import defpackage.j4h;
import defpackage.lbq;
import defpackage.v27;
import defpackage.vbm;
import defpackage.yre;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
public final class BloomFilter<T> implements h6i<T>, Serializable {
    private final com.google.common.hash.a.c bits;
    private final Funnel<? super T> funnel;
    private final int numHashFunctions;
    private final c strategy;

    public static class b<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f9269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9270b;
        public final Funnel<? super T> c;
        public final c d;

        public b(BloomFilter<T> bloomFilter) {
            this.f9269a = com.google.common.hash.a.c.h(((BloomFilter) bloomFilter).bits.f9273a);
            this.f9270b = ((BloomFilter) bloomFilter).numHashFunctions;
            this.c = ((BloomFilter) bloomFilter).funnel;
            this.d = ((BloomFilter) bloomFilter).strategy;
        }

        public Object readResolve() {
            return new BloomFilter(new com.google.common.hash.a.c(this.f9269a), this.f9270b, this.c, this.d);
        }
    }

    public interface c extends Serializable {
        <T> boolean R(T t, Funnel<? super T> funnel, int i, com.google.common.hash.a.c cVar);

        <T> boolean l(T t, Funnel<? super T> funnel, int i, com.google.common.hash.a.c cVar);

        int ordinal();
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i, double d) {
        return create(funnel, i, d);
    }

    public static long optimalNumOfBits(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        return (long) (((-j) * Math.log(d)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    public static int optimalNumOfHashFunctions(long j, long j2) {
        return Math.max(1, (int) Math.round((j2 / j) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i;
        int iB;
        c6i.p(inputStream, "InputStream");
        c6i.p(funnel, "Funnel");
        int i2 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte b2 = dataInputStream.readByte();
            try {
                iB = lbq.b(dataInputStream.readByte());
                try {
                    i2 = dataInputStream.readInt();
                    com.google.common.hash.a aVar = com.google.common.hash.a.values()[b2];
                    com.google.common.hash.a.c cVar = new com.google.common.hash.a.c(yre.a(i2, 64L));
                    for (int i3 = 0; i3 < i2; i3++) {
                        cVar.f(i3, dataInputStream.readLong());
                    }
                    return new BloomFilter<>(cVar, iB, funnel, aVar);
                } catch (RuntimeException e) {
                    e = e;
                    int i4 = i2;
                    i2 = b2;
                    i = i4;
                    StringBuilder sb = new StringBuilder(134);
                    sb.append("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                    sb.append(i2);
                    sb.append(" numHashFunctions: ");
                    sb.append(iB);
                    sb.append(" dataLength: ");
                    sb.append(i);
                    throw new IOException(sb.toString(), e);
                }
            } catch (RuntimeException e2) {
                e = e2;
                iB = -1;
                i2 = b2;
                i = -1;
            }
        } catch (RuntimeException e3) {
            e = e3;
            i = -1;
            iB = -1;
        }
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // defpackage.h6i
    @Deprecated
    public boolean apply(T t) {
        return mightContain(t);
    }

    public long approximateElementCount() {
        double dB = this.bits.b();
        return v27.c(((-Math.log1p(-(this.bits.a() / dB))) * dB) / ((double) this.numHashFunctions), RoundingMode.HALF_UP);
    }

    public long bitSize() {
        return this.bits.b();
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.c(), this.numHashFunctions, this.funnel, this.strategy);
    }

    @Override // defpackage.h6i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.numHashFunctions == bloomFilter.numHashFunctions && this.funnel.equals(bloomFilter.funnel) && this.bits.equals(bloomFilter.bits) && this.strategy.equals(bloomFilter.strategy);
    }

    public double expectedFpp() {
        return Math.pow(this.bits.a() / bitSize(), this.numHashFunctions);
    }

    public int hashCode() {
        return j4h.b(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        c6i.o(bloomFilter);
        return this != bloomFilter && this.numHashFunctions == bloomFilter.numHashFunctions && bitSize() == bloomFilter.bitSize() && this.strategy.equals(bloomFilter.strategy) && this.funnel.equals(bloomFilter.funnel);
    }

    public boolean mightContain(T t) {
        return this.strategy.l(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public boolean put(T t) {
        return this.strategy.R(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        c6i.o(bloomFilter);
        c6i.e(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i = this.numHashFunctions;
        int i2 = bloomFilter.numHashFunctions;
        c6i.g(i == i2, "BloomFilters must have the same number of hash functions (%s != %s)", i, i2);
        c6i.i(bitSize() == bloomFilter.bitSize(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", bitSize(), bloomFilter.bitSize());
        c6i.k(this.strategy.equals(bloomFilter.strategy), "BloomFilters must have equal strategies (%s != %s)", this.strategy, bloomFilter.strategy);
        c6i.k(this.funnel.equals(bloomFilter.funnel), "BloomFilters must have equal funnels (%s != %s)", this.funnel, bloomFilter.funnel);
        this.bits.e(bloomFilter.bits);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(vbm.a(this.strategy.ordinal()));
        dataOutputStream.writeByte(lbq.a(this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f9273a.length());
        for (int i = 0; i < this.bits.f9273a.length(); i++) {
            dataOutputStream.writeLong(this.bits.f9273a.get(i));
        }
    }

    private BloomFilter(com.google.common.hash.a.c cVar, int i, Funnel<? super T> funnel, c cVar2) {
        c6i.f(i > 0, "numHashFunctions (%s) must be > 0", i);
        c6i.f(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.bits = (com.google.common.hash.a.c) c6i.o(cVar);
        this.numHashFunctions = i;
        this.funnel = (Funnel) c6i.o(funnel);
        this.strategy = (c) c6i.o(cVar2);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d) {
        return create(funnel, j, d, com.google.common.hash.a.f9272b);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j, double d, c cVar) {
        c6i.o(funnel);
        c6i.h(j >= 0, "Expected insertions (%s) must be >= 0", j);
        c6i.j(d > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d));
        c6i.j(d < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d));
        c6i.o(cVar);
        if (j == 0) {
            j = 1;
        }
        long jOptimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new BloomFilter<>(new com.google.common.hash.a.c(jOptimalNumOfBits), optimalNumOfHashFunctions(j, jOptimalNumOfBits), funnel, cVar);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Could not create BloomFilter of ");
            sb.append(jOptimalNumOfBits);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i) {
        return create(funnel, i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j) {
        return create(funnel, j, 0.03d);
    }
}
