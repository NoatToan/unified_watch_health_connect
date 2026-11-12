package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;

/* JADX INFO: loaded from: classes23.dex */
public final class UProgressionUtilKt {
    private static final int a(int i, int i2, int i3) {
        int iM3955uintRemainderJ1ME1BU = UnsignedKt.m3955uintRemainderJ1ME1BU(i, i3);
        int iM3955uintRemainderJ1ME1BU2 = UnsignedKt.m3955uintRemainderJ1ME1BU(i2, i3);
        int iUintCompare = UnsignedKt.uintCompare(iM3955uintRemainderJ1ME1BU, iM3955uintRemainderJ1ME1BU2);
        int iM3880constructorimpl = UInt.m3880constructorimpl(iM3955uintRemainderJ1ME1BU - iM3955uintRemainderJ1ME1BU2);
        return iUintCompare >= 0 ? iM3880constructorimpl : UInt.m3880constructorimpl(iM3880constructorimpl + i3);
    }

    private static final long b(long j, long j2, long j3) {
        long jM3957ulongRemaindereb3DHEI = UnsignedKt.m3957ulongRemaindereb3DHEI(j, j3);
        long jM3957ulongRemaindereb3DHEI2 = UnsignedKt.m3957ulongRemaindereb3DHEI(j2, j3);
        int iUlongCompare = UnsignedKt.ulongCompare(jM3957ulongRemaindereb3DHEI, jM3957ulongRemaindereb3DHEI2);
        long jM3905constructorimpl = ULong.m3905constructorimpl(jM3957ulongRemaindereb3DHEI - jM3957ulongRemaindereb3DHEI2);
        return iUlongCompare >= 0 ? jM3905constructorimpl : ULong.m3905constructorimpl(jM3905constructorimpl + j3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m4240getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return UnsignedKt.ulongCompare(j, j2) >= 0 ? j2 : ULong.m3905constructorimpl(j2 - b(j2, j, ULong.m3905constructorimpl(j3)));
        }
        if (j3 < 0) {
            return UnsignedKt.ulongCompare(j, j2) <= 0 ? j2 : ULong.m3905constructorimpl(j2 + b(j, j2, ULong.m3905constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m4241getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return UnsignedKt.uintCompare(i, i2) >= 0 ? i2 : UInt.m3880constructorimpl(i2 - a(i2, i, UInt.m3880constructorimpl(i3)));
        }
        if (i3 < 0) {
            return UnsignedKt.uintCompare(i, i2) <= 0 ? i2 : UInt.m3880constructorimpl(i2 + a(i, i2, UInt.m3880constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
