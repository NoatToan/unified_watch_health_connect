package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m2080maxOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) >= 0 ? s : s2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m2081maxOfJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) >= 0 ? i : i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m2082maxOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255) >= 0 ? b2 : b3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m2083maxOfMd2H83M(int i, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(other);
        for (int i2 = 0; i2 < iM1042getSizeimpl; i2++) {
            i = m2081maxOfJ1ME1BU(i, UIntArray.m1041getpVg5ArA(other, i2));
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m2084maxOfR03FKyM(long j, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(other);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            j = m2089maxOfeb3DHEI(j, ULongArray.m1120getsVKNKU(other, i));
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m2085maxOfVKSA0NQ(short s, short s2, short s3) {
        return m2080maxOf5PvTz6A(s, m2080maxOf5PvTz6A(s2, s3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m2086maxOfWZ9TVnA(int i, int i2, int i3) {
        return m2081maxOfJ1ME1BU(i, m2081maxOfJ1ME1BU(i2, i3));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2087maxOfWr6uiD8(byte b2, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(other);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            b2 = m2082maxOfKr8caGY(b2, UByteArray.m962getw2LRezQ(other, i));
        }
        return b2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m2088maxOfb33U2AM(byte b2, byte b3, byte b4) {
        return m2082maxOfKr8caGY(b2, m2082maxOfKr8caGY(b3, b4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m2089maxOfeb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) >= 0 ? j : j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m2090maxOfsambcqE(long j, long j2, long j3) {
        return m2089maxOfeb3DHEI(j, m2089maxOfeb3DHEI(j2, j3));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m2091maxOft1qELG4(short s, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(other);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            s = m2080maxOf5PvTz6A(s, UShortArray.m1225getMh2AYeg(other, i));
        }
        return s;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m2092minOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) <= 0 ? s : s2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m2093minOfJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) <= 0 ? i : i2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m2094minOfKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, b3 & 255) <= 0 ? b2 : b3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m2095minOfMd2H83M(int i, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1042getSizeimpl = UIntArray.m1042getSizeimpl(other);
        for (int i2 = 0; i2 < iM1042getSizeimpl; i2++) {
            i = m2093minOfJ1ME1BU(i, UIntArray.m1041getpVg5ArA(other, i2));
        }
        return i;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m2096minOfR03FKyM(long j, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1121getSizeimpl = ULongArray.m1121getSizeimpl(other);
        for (int i = 0; i < iM1121getSizeimpl; i++) {
            j = m2101minOfeb3DHEI(j, ULongArray.m1120getsVKNKU(other, i));
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m2097minOfVKSA0NQ(short s, short s2, short s3) {
        return m2092minOf5PvTz6A(s, m2092minOf5PvTz6A(s2, s3));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m2098minOfWZ9TVnA(int i, int i2, int i3) {
        return m2093minOfJ1ME1BU(i, m2093minOfJ1ME1BU(i2, i3));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2099minOfWr6uiD8(byte b2, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM963getSizeimpl = UByteArray.m963getSizeimpl(other);
        for (int i = 0; i < iM963getSizeimpl; i++) {
            b2 = m2094minOfKr8caGY(b2, UByteArray.m962getw2LRezQ(other, i));
        }
        return b2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m2100minOfb33U2AM(byte b2, byte b3, byte b4) {
        return m2094minOfKr8caGY(b2, m2094minOfKr8caGY(b3, b4));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m2101minOfeb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) <= 0 ? j : j2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m2102minOfsambcqE(long j, long j2, long j3) {
        return m2101minOfeb3DHEI(j, m2101minOfeb3DHEI(j2, j3));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m2103minOft1qELG4(short s, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM1226getSizeimpl = UShortArray.m1226getSizeimpl(other);
        for (int i = 0; i < iM1226getSizeimpl; i++) {
            s = m2092minOf5PvTz6A(s, UShortArray.m1225getMh2AYeg(other, i));
        }
        return s;
    }
}
