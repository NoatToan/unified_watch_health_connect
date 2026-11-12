package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import defpackage.aox;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, e eVar) {
            long jA = eVar.a();
            long jAsLong = Hashing.a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            boolean zC = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                zC |= eVar.c(((long) i5) % jA);
            }
            return zC;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, e eVar) {
            long jA = eVar.a();
            long jAsLong = Hashing.a().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!eVar.d(((long) i5) % jA)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t, Funnel<? super T> funnel, int i, e eVar) {
            long jA = eVar.a();
            byte[] bytesInternal = Hashing.a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean zC = false;
            for (int i2 = 0; i2 < i; i2++) {
                zC |= eVar.c((Long.MAX_VALUE & jLowerEight) % jA);
                jLowerEight += jUpperEight;
            }
            return zC;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t, Funnel<? super T> funnel, int i, e eVar) {
            long jA = eVar.a();
            byte[] bytesInternal = Hashing.a().hashObject(t, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i2 = 0; i2 < i; i2++) {
                if (!eVar.d((Long.MAX_VALUE & jLowerEight) % jA)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        private long lowerEight(byte[] bArr) {
            return Longs.b(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.b(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }
    };

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LongAddable f4571a;
        final AtomicLongArray d;

        e(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.d = new AtomicLongArray(jArr);
            this.f4571a = aox.a();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f4571a.add(jBitCount);
        }

        boolean c(long j) {
            long j2;
            long j3;
            if (d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            int i2 = (int) j;
            do {
                j2 = this.d.get(i);
                j3 = j2 | (1 << i2);
                if (j2 == j3) {
                    return false;
                }
            } while (!this.d.compareAndSet(i, j2, j3));
            this.f4571a.increment();
            return true;
        }

        boolean d(long j) {
            return ((1 << ((int) j)) & this.d.get((int) (j >>> 6))) != 0;
        }

        public static long[] a(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        long a() {
            return ((long) this.d.length()) * 64;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof e) {
                return Arrays.equals(a(this.d), a(((e) obj).d));
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(a(this.d));
        }
    }
}
