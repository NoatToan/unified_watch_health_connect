package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class URandomKt {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m4242checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (!(UnsignedKt.uintCompare(i2, i) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m3879boximpl(i), UInt.m3879boximpl(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m4243checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (!(UnsignedKt.ulongCompare(j2, j) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m3904boximpl(j), ULong.m3904boximpl(j2)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] nextUBytes(@NotNull Random random, int i) {
        return UByteArray.m3863constructorimpl(random.nextBytes(i));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m4244nextUBytesEVgfTAA(@NotNull Random random, @NotNull byte[] bArr) {
        random.nextBytes(bArr);
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m4245nextUBytesWvrt4B4(@NotNull Random random, @NotNull byte[] bArr, int i, int i2) {
        random.nextBytes(bArr, i, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m4246nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m3869getSizeimpl(bArr);
        }
        return m4245nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random) {
        return UInt.m3880constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m4247nextUInta8DCA5k(@NotNull Random random, int i, int i2) {
        m4242checkUIntRangeBoundsJ1ME1BU(i, i2);
        return UInt.m3880constructorimpl(random.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m4248nextUIntqCasIEU(@NotNull Random random, int i) {
        return m4247nextUInta8DCA5k(random, 0, i);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random) {
        return ULong.m3905constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m4249nextULongV1Xi4fY(@NotNull Random random, long j) {
        return m4250nextULongjmpaWc(random, 0L, j);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m4250nextULongjmpaWc(@NotNull Random random, long j, long j2) {
        m4243checkULongRangeBoundseb3DHEI(j, j2);
        return ULong.m3905constructorimpl(random.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(@NotNull Random random, @NotNull UIntRange uIntRange) {
        if (uIntRange.isEmpty()) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot get random in empty range: ", uIntRange));
        }
        if (UnsignedKt.uintCompare(uIntRange.m4252getLastpVg5ArA(), -1) < 0) {
            return m4247nextUInta8DCA5k(random, uIntRange.m4251getFirstpVg5ArA(), UInt.m3880constructorimpl(uIntRange.m4252getLastpVg5ArA() + 1));
        }
        return UnsignedKt.uintCompare(uIntRange.m4251getFirstpVg5ArA(), 0) > 0 ? UInt.m3880constructorimpl(m4247nextUInta8DCA5k(random, UInt.m3880constructorimpl(uIntRange.m4251getFirstpVg5ArA() - 1), uIntRange.m4252getLastpVg5ArA()) + 1) : nextUInt(random);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(@NotNull Random random, @NotNull ULongRange uLongRange) {
        if (uLongRange.isEmpty()) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot get random in empty range: ", uLongRange));
        }
        if (UnsignedKt.ulongCompare(uLongRange.m4258getLastsVKNKU(), -1L) < 0) {
            return m4250nextULongjmpaWc(random, uLongRange.m4257getFirstsVKNKU(), ULong.m3905constructorimpl(uLongRange.m4258getLastsVKNKU() + ULong.m3905constructorimpl(((long) 1) & 4294967295L)));
        }
        if (UnsignedKt.ulongCompare(uLongRange.m4257getFirstsVKNKU(), 0L) <= 0) {
            return nextULong(random);
        }
        long j = ((long) 1) & 4294967295L;
        return ULong.m3905constructorimpl(m4250nextULongjmpaWc(random, ULong.m3905constructorimpl(uLongRange.m4257getFirstsVKNKU() - ULong.m3905constructorimpl(j)), uLongRange.m4258getLastsVKNKU()) + ULong.m3905constructorimpl(j));
    }
}
