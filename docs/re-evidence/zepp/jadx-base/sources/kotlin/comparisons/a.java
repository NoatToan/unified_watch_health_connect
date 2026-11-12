package kotlin.comparisons;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class a extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte A(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte B(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double C(double d, double d2) {
        return Math.min(d, d2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double D(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float E(float f, float f2) {
        return Math.min(f, f2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float F(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int G(int i, int i2) {
        return Math.min(i, i2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int H(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long I(long j, long j2) {
        return Math.min(j, j2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long J(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short K(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short L(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T t, @NotNull T t2) {
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte o(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte p(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double q(double d, double d2) {
        return Math.max(d, d2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double r(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float s(float f, float f2) {
        return Math.max(f, f2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float t(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int u(int i, int i2) {
        return Math.max(i, i2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int v(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long w(long j, long j2) {
        return Math.max(j, j2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long x(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short y(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short z(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        return (T) ComparisonsKt.maxOf(t, ComparisonsKt.maxOf(t2, t3));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        return (T) minOf(t, minOf(t2, t3));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T t, @NotNull T... tArr) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t2 = tArr[i];
            i++;
            t = (T) ComparisonsKt.maxOf(t, t2);
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T t, @NotNull T... tArr) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t2 = tArr[i];
            i++;
            t = (T) minOf(t, t2);
        }
        return t;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b, @NotNull byte... bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b, @NotNull byte... bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s, @NotNull short... sArr) {
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            short s2 = sArr[i];
            i++;
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s, @NotNull short... sArr) {
        int length = sArr.length;
        int i = 0;
        while (i < length) {
            short s2 = sArr[i];
            i++;
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i, @NotNull int... iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            i = Math.max(i, i3);
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i, @NotNull int... iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            i2++;
            i = Math.min(i, i3);
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j, @NotNull long... jArr) {
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j2 = jArr[i];
            i++;
            j = Math.max(j, j2);
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j, @NotNull long... jArr) {
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j2 = jArr[i];
            i++;
            j = Math.min(j, j2);
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    public static float maxOf(float f, @NotNull float... fArr) {
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f2 = fArr[i];
            i++;
            f = Math.max(f, f2);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static float minOf(float f, @NotNull float... fArr) {
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f2 = fArr[i];
            i++;
            f = Math.min(f, f2);
        }
        return f;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d, @NotNull double... dArr) {
        int length = dArr.length;
        int i = 0;
        while (i < length) {
            double d2 = dArr[i];
            i++;
            d = Math.max(d, d2);
        }
        return d;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d, @NotNull double... dArr) {
        int length = dArr.length;
        int i = 0;
        while (i < length) {
            double d2 = dArr[i];
            i++;
            d = Math.min(d, d2);
        }
        return d;
    }
}
