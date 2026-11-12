package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
class f extends e {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int J(byte b, byte b2) {
        int i = b / b2;
        return ((b ^ b2) >= 0 || b2 * i == b) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int K(byte b, int i) {
        int i2 = b / i;
        return ((b ^ i) >= 0 || i * i2 == b) ? i2 : i2 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int L(byte b, short s) {
        int i = b / s;
        return ((b ^ s) >= 0 || s * i == b) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int M(int i, byte b) {
        int i2 = i / b;
        return ((i ^ b) >= 0 || b * i2 == i) ? i2 : i2 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int N(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int O(int i, short s) {
        int i2 = i / s;
        return ((i ^ s) >= 0 || s * i2 == i) ? i2 : i2 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int P(short s, byte b) {
        int i = s / b;
        return ((s ^ b) >= 0 || b * i == s) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int Q(short s, int i) {
        int i2 = s / i;
        return ((s ^ i) >= 0 || i * i2 == s) ? i2 : i2 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int R(short s, short s2) {
        int i = s / s2;
        return ((s ^ s2) >= 0 || s2 * i == s) ? i : i - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long S(byte b, long j) {
        long j2 = b;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long T(int i, long j) {
        long j2 = i;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long U(long j, byte b) {
        long j2 = b;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long V(long j, int i) {
        long j2 = i;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long W(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long X(long j, short s) {
        long j2 = s;
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long Y(short s, long j) {
        long j2 = s;
        long j3 = j2 / j;
        return ((j2 ^ j) >= 0 || j * j3 == j2) ? j3 : j3 - 1;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte Z(byte b, byte b2) {
        int i = b % b2;
        return (byte) (i + (b2 & (((i ^ b2) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte a0(int i, byte b) {
        int i2 = i % b;
        return (byte) (i2 + (b & (((i2 ^ b) & ((-i2) | i2)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte b0(long j, byte b) {
        long j2 = b;
        long j3 = j % j2;
        return (byte) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte c0(short s, byte b) {
        int i = s % b;
        return (byte) (i + (b & (((i ^ b) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double d0(double d, double d2) {
        double d3 = d % d2;
        if (d3 == 0.0d) {
            return d3;
        }
        return !(Math.signum(d3) == Math.signum(d2)) ? d3 + d2 : d3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double e0(double d, float f) {
        double d2 = f;
        double d3 = d % d2;
        if (d3 == 0.0d) {
            return d3;
        }
        return !(Math.signum(d3) == Math.signum(d2)) ? d3 + d2 : d3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double f0(float f, double d) {
        double d2 = ((double) f) % d;
        if (d2 == 0.0d) {
            return d2;
        }
        return !(Math.signum(d2) == Math.signum(d)) ? d2 + d : d2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final float g0(float f, float f2) {
        float f3 = f % f2;
        if (f3 == 0.0f) {
            return f3;
        }
        return !(Math.signum(f3) == Math.signum(f2)) ? f3 + f2 : f3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int h0(byte b, int i) {
        int i2 = b % i;
        return i2 + (i & (((i2 ^ i) & ((-i2) | i2)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int i0(int i, int i2) {
        int i3 = i % i2;
        return i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int j0(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        return (int) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int k0(short s, int i) {
        int i2 = s % i;
        return i2 + (i & (((i2 ^ i) & ((-i2) | i2)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long l0(byte b, long j) {
        long j2 = ((long) b) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long m0(int i, long j) {
        long j2 = ((long) i) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long n0(long j, long j2) {
        long j3 = j % j2;
        return j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long o0(short s, long j) {
        long j2 = ((long) s) % j;
        return j2 + (j & (((j2 ^ j) & ((-j2) | j2)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short p0(byte b, short s) {
        int i = b % s;
        return (short) (i + (s & (((i ^ s) & ((-i) | i)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short q0(int i, short s) {
        int i2 = i % s;
        return (short) (i2 + (s & (((i2 ^ s) & ((-i2) | i2)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short r0(long j, short s) {
        long j2 = s;
        long j3 = j % j2;
        return (short) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short s0(short s, short s2) {
        int i = s % s2;
        return (short) (i + (s2 & (((i ^ s2) & ((-i) | i)) >> 31)));
    }
}
