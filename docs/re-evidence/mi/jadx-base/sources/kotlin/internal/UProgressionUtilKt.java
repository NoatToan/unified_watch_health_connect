package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: loaded from: classes2.dex */
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m2105differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i, i3);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i2, i3);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iM981constructorimpl = UInt.m981constructorimpl(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iM981constructorimpl : UInt.m981constructorimpl(iM981constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m2106differenceModulosambcqE(long j, long j2, long j3) {
        long jRemainderUnsigned = Long.remainderUnsigned(j, j3);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j2, j3);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jM1060constructorimpl = ULong.m1060constructorimpl(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jM1060constructorimpl : ULong.m1060constructorimpl(jM1060constructorimpl + j3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m2107getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compareUnsigned(j, j2) >= 0 ? j2 : ULong.m1060constructorimpl(j2 - m2106differenceModulosambcqE(j2, j, ULong.m1060constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compareUnsigned(j, j2) <= 0 ? j2 : ULong.m1060constructorimpl(j2 + m2106differenceModulosambcqE(j, j2, ULong.m1060constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m2108getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compareUnsigned(i, i2) >= 0 ? i2 : UInt.m981constructorimpl(i2 - m2105differenceModuloWZ9TVnA(i2, i, UInt.m981constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compareUnsigned(i, i2) <= 0 ? i2 : UInt.m981constructorimpl(i2 + m2105differenceModuloWZ9TVnA(i, i2, UInt.m981constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
