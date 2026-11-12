package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d) {
        if (Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        return d <= 2.147483647E9d ? UInt.m981constructorimpl((int) d) : UInt.m981constructorimpl(UInt.m981constructorimpl((int) (d - ((double) Integer.MAX_VALUE))) + UInt.m981constructorimpl(Integer.MAX_VALUE));
    }

    @PublishedApi
    public static final long doubleToULong(double d) {
        if (Double.isNaN(d) || d <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d < 9.223372036854776E18d ? ULong.m1060constructorimpl((long) d) : ULong.m1060constructorimpl(ULong.m1060constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f) {
        return doubleToUInt(f);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f) {
        return doubleToULong(f);
    }

    @PublishedApi
    public static final int uintCompare(int i, int i2) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m1237uintDivideJ1ME1BU(int i, int i2) {
        return UInt.m981constructorimpl((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m1238uintRemainderJ1ME1BU(int i, int i2) {
        return UInt.m981constructorimpl((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i) {
        return (float) uintToDouble(i);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i) {
        return ((long) i) & 4294967295L;
    }

    @InlineOnly
    private static final String uintToString(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i) {
        return ULong.m1060constructorimpl(((long) i) & 4294967295L);
    }

    @PublishedApi
    public static final int ulongCompare(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m1239ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? ULong.m1060constructorimpl(0L) : ULong.m1060constructorimpl(1L);
        }
        if (j >= 0) {
            return ULong.m1060constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return ULong.m1060constructorimpl(j3 + ((long) (Long.compareUnsigned(ULong.m1060constructorimpl(j - (j3 * j2)), ULong.m1060constructorimpl(j2)) < 0 ? 0 : 1)));
    }

    @PublishedApi
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m1240ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j : ULong.m1060constructorimpl(j - j2);
        }
        if (j >= 0) {
            return ULong.m1060constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compareUnsigned(ULong.m1060constructorimpl(j3), ULong.m1060constructorimpl(j2)) < 0) {
            j2 = 0;
        }
        return ULong.m1060constructorimpl(j3 - j2);
    }

    @PublishedApi
    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j) {
        return (float) ulongToDouble(j);
    }

    @InlineOnly
    private static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    @InlineOnly
    private static final String uintToString(int i, int i2) {
        return ulongToString(((long) i) & 4294967295L, i2);
    }

    @NotNull
    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt__CharJVMKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
