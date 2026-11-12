package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
abstract class g implements BloomFilter.c {
    private static final /* synthetic */ g[] $VALUES;
    public static final g MURMUR128_MITZ_32;
    public static final g MURMUR128_MITZ_64;

    public static enum a extends g {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean d(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            long jAsLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!cVar.d(((long) i5) % jB)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean l(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            long jAsLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) jAsLong;
            int i3 = (int) (jAsLong >>> 32);
            boolean zF = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                zF |= cVar.f(((long) i5) % jB);
            }
            return zF;
        }
    }

    public static final class c {
        private static final int c = 6;
        public final AtomicLongArray a;
        private final m b;

        public c(long j) {
            this(new long[Ints.checkedCast(LongMath.divide(j, 64L, RoundingMode.CEILING))]);
        }

        public static long[] g(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        public long a() {
            return this.b.a();
        }

        public long b() {
            return ((long) this.a.length()) * 64;
        }

        public c c() {
            return new c(g(this.a));
        }

        public boolean d(long j) {
            return ((1 << ((int) j)) & this.a.get((int) (j >>> 6))) != 0;
        }

        public void e(c cVar) {
            long j;
            long j2;
            boolean z;
            Preconditions.checkArgument(this.a.length() == cVar.a.length(), "BitArrays must be of equal length (%s != %s)", this.a.length(), cVar.a.length());
            for (int i = 0; i < this.a.length(); i++) {
                long j3 = cVar.a.get(i);
                while (true) {
                    j = this.a.get(i);
                    j2 = j | j3;
                    if (j != j2) {
                        if (this.a.compareAndSet(i, j, j2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    this.b.add(Long.bitCount(j2) - Long.bitCount(j));
                }
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(g(this.a), g(((c) obj).a));
            }
            return false;
        }

        public boolean f(long j) {
            long j2;
            long j3;
            if (d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.a.compareAndSet(i, j2, j3));
            this.b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(g(this.a));
        }

        public c(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.a = new AtomicLongArray(jArr);
            this.b = n.a();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.b.add(jBitCount);
        }
    }

    static {
        a aVar = new a("MURMUR128_MITZ_32", 0);
        MURMUR128_MITZ_32 = aVar;
        g gVar = new g("MURMUR128_MITZ_64", 1) { // from class: com.google.common.hash.g.b
            {
                a aVar2 = null;
            }

            private long a(byte[] bArr) {
                return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
            }

            private long b(byte[] bArr) {
                return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
            }

            @Override // com.google.common.hash.BloomFilter.c
            public <T> boolean d(T t, Funnel<? super T> funnel, int i, c cVar) {
                long jB = cVar.b();
                byte[] bArrE = Hashing.murmur3_128().hashObject(t, funnel).e();
                long jA = a(bArrE);
                long jB2 = b(bArrE);
                for (int i2 = 0; i2 < i; i2++) {
                    if (!cVar.d((Long.MAX_VALUE & jA) % jB)) {
                        return false;
                    }
                    jA += jB2;
                }
                return true;
            }

            @Override // com.google.common.hash.BloomFilter.c
            public <T> boolean l(T t, Funnel<? super T> funnel, int i, c cVar) {
                long jB = cVar.b();
                byte[] bArrE = Hashing.murmur3_128().hashObject(t, funnel).e();
                long jA = a(bArrE);
                long jB2 = b(bArrE);
                boolean zF = false;
                for (int i2 = 0; i2 < i; i2++) {
                    zF |= cVar.f((Long.MAX_VALUE & jA) % jB);
                    jA += jB2;
                }
                return zF;
            }
        };
        MURMUR128_MITZ_64 = gVar;
        $VALUES = new g[]{aVar, gVar};
    }

    private g(String str, int i) {
        super(str, i);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public /* synthetic */ g(String str, int i, a aVar) {
        this(str, i);
    }
}
