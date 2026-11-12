package kotlin.comparisons;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class f {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short a(short s, short s2, short s3) {
        return m4224maxOf5PvTz6A(s, m4224maxOf5PvTz6A(s2, s3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int b(int i, int i2, int i3) {
        return m4225maxOfJ1ME1BU(i, m4225maxOfJ1ME1BU(i2, i3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte c(byte b, byte b2, byte b3) {
        return m4226maxOfKr8caGY(b, m4226maxOfKr8caGY(b2, b3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long d(long j, long j2, long j3) {
        return m4230maxOfeb3DHEI(j, m4230maxOfeb3DHEI(j2, j3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final short e(short s, short s2, short s3) {
        return m4232minOf5PvTz6A(s, m4232minOf5PvTz6A(s2, s3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int f(int i, int i2, int i3) {
        return m4233minOfJ1ME1BU(i, m4233minOfJ1ME1BU(i2, i3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte g(byte b, byte b2, byte b3) {
        return m4234minOfKr8caGY(b, m4234minOfKr8caGY(b2, b3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long h(long j, long j2, long j3) {
        return m4238minOfeb3DHEI(j, m4238minOfeb3DHEI(j2, j3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m4224maxOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) >= 0 ? s : s2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m4225maxOfJ1ME1BU(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2) >= 0 ? i : i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m4226maxOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m4227maxOfMd2H83M(int i, @NotNull int... iArr) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            i = m4225maxOfJ1ME1BU(i, itM3897iteratorimpl.next().m3885unboximpl());
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m4228maxOfR03FKyM(long j, @NotNull long... jArr) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            j = m4230maxOfeb3DHEI(j, itM3922iteratorimpl.next().m3910unboximpl());
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m4229maxOfWr6uiD8(byte b, @NotNull byte... bArr) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            b = m4226maxOfKr8caGY(b, itM3872iteratorimpl.next().m3860unboximpl());
        }
        return b;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m4230maxOfeb3DHEI(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2) >= 0 ? j : j2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m4231maxOft1qELG4(short s, @NotNull short... sArr) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            s = m4224maxOf5PvTz6A(s, itM3947iteratorimpl.next().m3935unboximpl());
        }
        return s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m4232minOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) <= 0 ? s : s2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m4233minOfJ1ME1BU(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2) <= 0 ? i : i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m4234minOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m4235minOfMd2H83M(int i, @NotNull int... iArr) {
        Iterator<UInt> itM3897iteratorimpl = UIntArray.m3897iteratorimpl(iArr);
        while (itM3897iteratorimpl.hasNext()) {
            i = m4233minOfJ1ME1BU(i, itM3897iteratorimpl.next().m3885unboximpl());
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m4236minOfR03FKyM(long j, @NotNull long... jArr) {
        Iterator<ULong> itM3922iteratorimpl = ULongArray.m3922iteratorimpl(jArr);
        while (itM3922iteratorimpl.hasNext()) {
            j = m4238minOfeb3DHEI(j, itM3922iteratorimpl.next().m3910unboximpl());
        }
        return j;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m4237minOfWr6uiD8(byte b, @NotNull byte... bArr) {
        Iterator<UByte> itM3872iteratorimpl = UByteArray.m3872iteratorimpl(bArr);
        while (itM3872iteratorimpl.hasNext()) {
            b = m4234minOfKr8caGY(b, itM3872iteratorimpl.next().m3860unboximpl());
        }
        return b;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m4238minOfeb3DHEI(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2) <= 0 ? j : j2;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m4239minOft1qELG4(short s, @NotNull short... sArr) {
        Iterator<UShort> itM3947iteratorimpl = UShortArray.m3947iteratorimpl(sArr);
        while (itM3947iteratorimpl.hasNext()) {
            s = m4232minOf5PvTz6A(s, itM3947iteratorimpl.next().m3935unboximpl());
        }
        return s;
    }
}
