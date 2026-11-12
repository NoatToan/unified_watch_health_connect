package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t7, funnel).asLong();
            int i15 = (int) jAsLong;
            int i16 = (int) (jAsLong >>> 32);
            for (int i17 = 1; i17 <= i14; i17++) {
                int i18 = (i17 * i16) + i15;
                if (i18 < 0) {
                    i18 = ~i18;
                }
                if (!lockFreeBitArray.get(((long) i18) % jBitSize)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            long jAsLong = Hashing.murmur3_128().hashObject(t7, funnel).asLong();
            int i15 = (int) jAsLong;
            int i16 = (int) (jAsLong >>> 32);
            boolean z14 = false;
            for (int i17 = 1; i17 <= i14; i17++) {
                int i18 = (i17 * i16) + i15;
                if (i18 < 0) {
                    i18 = ~i18;
                }
                z14 |= lockFreeBitArray.set(((long) i18) % jBitSize);
            }
            return z14;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t7, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            for (int i15 = 0; i15 < i14; i15++) {
                if (!lockFreeBitArray.get((Long.MAX_VALUE & jLowerEight) % jBitSize)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t7, Funnel<? super T> funnel, int i14, LockFreeBitArray lockFreeBitArray) {
            long jBitSize = lockFreeBitArray.bitSize();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t7, funnel).getBytesInternal();
            long jLowerEight = lowerEight(bytesInternal);
            long jUpperEight = upperEight(bytesInternal);
            boolean z14 = false;
            for (int i15 = 0; i15 < i14; i15++) {
                z14 |= lockFreeBitArray.set((Long.MAX_VALUE & jLowerEight) % jBitSize);
                jLowerEight += jUpperEight;
            }
            return z14;
        }
    };

    public static final class LockFreeBitArray {
        private static final int LONG_ADDRESSABLE_BITS = 6;
        private final LongAddable bitCount;
        final AtomicLongArray data;

        public LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.data = new AtomicLongArray(jArr);
            this.bitCount = LongAddables.create();
            long jBitCount = 0;
            for (long j8 : jArr) {
                jBitCount += (long) Long.bitCount(j8);
            }
            this.bitCount.add(jBitCount);
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i14 = 0; i14 < length; i14++) {
                jArr[i14] = atomicLongArray.get(i14);
            }
            return jArr;
        }

        public long bitCount() {
            return this.bitCount.sum();
        }

        public long bitSize() {
            return ((long) this.data.length()) * 64;
        }

        public LockFreeBitArray copy() {
            return new LockFreeBitArray(toPlainArray(this.data));
        }

        public int dataLength() {
            return this.data.length();
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.data), toPlainArray(((LockFreeBitArray) obj).data));
            }
            return false;
        }

        public boolean get(long j8) {
            return ((1 << ((int) j8)) & this.data.get((int) (j8 >>> 6))) != 0;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.data));
        }

        public void putAll(LockFreeBitArray lockFreeBitArray) {
            Preconditions.checkArgument(this.data.length() == lockFreeBitArray.data.length(), "BitArrays must be of equal length (%s != %s)", this.data.length(), lockFreeBitArray.data.length());
            for (int i14 = 0; i14 < this.data.length(); i14++) {
                putData(i14, lockFreeBitArray.data.get(i14));
            }
        }

        public void putData(int i14, long j8) {
            while (true) {
                long j14 = this.data.get(i14);
                long j15 = j14 | j8;
                if (j14 == j15) {
                    return;
                }
                int i15 = i14;
                if (this.data.compareAndSet(i15, j14, j15)) {
                    this.bitCount.add(Long.bitCount(j15) - Long.bitCount(j14));
                    return;
                }
                i14 = i15;
            }
        }

        public boolean set(long j8) {
            long j14;
            long j15;
            if (get(j8)) {
                return false;
            }
            int i14 = (int) (j8 >>> 6);
            long j16 = 1 << ((int) j8);
            do {
                j14 = this.data.get(i14);
                j15 = j14 | j16;
                if (j14 == j15) {
                    return false;
                }
            } while (!this.data.compareAndSet(i14, j14, j15));
            this.bitCount.increment();
            return true;
        }

        public LockFreeBitArray(long j8) {
            Preconditions.checkArgument(j8 > 0, "data length is zero!");
            this.data = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j8, 64L, RoundingMode.CEILING)));
            this.bitCount = LongAddables.create();
        }
    }
}
