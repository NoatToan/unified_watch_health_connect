package kotlin.random;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
public abstract class Random {

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private static final Random a = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public static final class Default extends Random implements Serializable {

        public static final class a implements Serializable {

            @NotNull
            public static final a a = new a();
            private static final long serialVersionUID = 0;

            private a() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return a.a;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i) {
            return Random.a.nextBits(i);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.a.nextBoolean();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr) {
            return Random.a.nextBytes(bArr);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.a.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.a.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.a.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.a.nextLong();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int i) {
            return Random.a.nextBytes(i);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d) {
            return Random.a.nextDouble(d);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i) {
            return Random.a.nextInt(i);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j) {
            return Random.a.nextLong(j);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
            return Random.a.nextBytes(bArr, i, i2);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d, double d2) {
            return Random.a.nextDouble(d, d2);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i, int i2) {
            return Random.a.nextInt(i, i2);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j, long j2) {
            return Random.a.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return random.nextBytes(bArr, i, i2);
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0018  */
    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
        boolean z;
        if (!(i >= 0 && i <= bArr.length)) {
            z = false;
        } else if (i2 >= 0 && i2 <= bArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + '.').toString());
        }
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        int i3 = (i2 - i) / 4;
        int i4 = 0;
        while (i4 < i3) {
            i4++;
            int iNextInt = nextInt();
            bArr[i] = (byte) iNextInt;
            bArr[i + 1] = (byte) (iNextInt >>> 8);
            bArr[i + 2] = (byte) (iNextInt >>> 16);
            bArr[i + 3] = (byte) (iNextInt >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int iNextBits = nextBits(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (iNextBits >>> (i6 * 8));
        }
        return bArr;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    public double nextDouble(double d, double d2) {
        double dNextDouble;
        RandomKt.checkRangeBounds(d, d2);
        double d3 = d2 - d;
        if (Double.isInfinite(d3)) {
            if ((Double.isInfinite(d) || Double.isNaN(d)) ? false : true) {
                if ((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true) {
                    double d4 = 2;
                    double dNextDouble2 = nextDouble() * ((d2 / d4) - (d / d4));
                    dNextDouble = d + dNextDouble2 + dNextDouble2;
                } else {
                    dNextDouble = d + (nextDouble() * d3);
                }
            } else {
                dNextDouble = d + (nextDouble() * d3);
            }
        } else {
            dNextDouble = d + (nextDouble() * d3);
        }
        return dNextDouble >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int i, int i2) {
        int iNextInt;
        int i3;
        int iNextBits;
        int iNextInt2;
        boolean z;
        RandomKt.checkRangeBounds(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iNextBits = nextBits(RandomKt.fastLog2(i4));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i3 = iNextInt % i4;
                } while ((iNextInt - i3) + (i4 - 1) < 0);
                iNextBits = i3;
            }
            return i + iNextBits;
        }
        do {
            iNextInt2 = nextInt();
            z = false;
            if (i <= iNextInt2 && iNextInt2 < i2) {
                z = true;
            }
        } while (!z);
        return iNextInt2;
    }

    public long nextLong(long j, long j2) {
        long jNextLong;
        boolean z;
        long jNextLong2;
        long j3;
        long jNextBits;
        int iNextInt;
        RandomKt.checkRangeBounds(j, j2);
        long j4 = j2 - j;
        if (j4 <= 0) {
            do {
                jNextLong = nextLong();
                z = false;
                if (j <= jNextLong && jNextLong < j2) {
                    z = true;
                }
            } while (!z);
            return jNextLong;
        }
        if (((-j4) & j4) == j4) {
            int i = (int) j4;
            int i2 = (int) (j4 >>> 32);
            if (i != 0) {
                iNextInt = nextBits(RandomKt.fastLog2(i));
            } else if (i2 == 1) {
                iNextInt = nextInt();
            } else {
                jNextBits = (((long) nextBits(RandomKt.fastLog2(i2))) << 32) + (((long) nextInt()) & 4294967295L);
            }
            jNextBits = ((long) iNextInt) & 4294967295L;
        } else {
            do {
                jNextLong2 = nextLong() >>> 1;
                j3 = jNextLong2 % j4;
            } while ((jNextLong2 - j3) + (j4 - 1) < 0);
            jNextBits = j3;
        }
        return j + jNextBits;
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        return nextBytes(bArr, 0, bArr.length);
    }

    @NotNull
    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
