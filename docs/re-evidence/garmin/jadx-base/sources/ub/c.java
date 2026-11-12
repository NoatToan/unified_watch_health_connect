package ub;

import android.util.Pair;
import bb.g0;
import bb.h0;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import fa.z;
import pb.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f169670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f169671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f169672c;

    private c(long[] jArr, long[] jArr2, long j8) {
        this.f169670a = jArr;
        this.f169671b = jArr2;
        this.f169672c = j8 == C.TIME_UNSET ? z.O(jArr2[jArr2.length - 1]) : j8;
    }

    public static c a(long j8, k kVar, long j14) {
        int[] iArr = kVar.f136820e;
        int length = iArr.length;
        int i14 = length + 1;
        long[] jArr = new long[i14];
        long[] jArr2 = new long[i14];
        jArr[0] = j8;
        long j15 = 0;
        jArr2[0] = 0;
        for (int i15 = 1; i15 <= length; i15++) {
            int i16 = i15 - 1;
            j8 += (long) (kVar.f136818c + iArr[i16]);
            j15 += (long) (kVar.f136819d + kVar.f136821f[i16]);
            jArr[i15] = j8;
            jArr2[i15] = j15;
        }
        return new c(jArr, jArr2, j14);
    }

    public static Pair<Long, Long> b(long j8, long[] jArr, long[] jArr2) {
        int iE = z.e(jArr, j8, true);
        long j14 = jArr[iE];
        long j15 = jArr2[iE];
        int i14 = iE + 1;
        if (i14 == jArr.length) {
            return Pair.create(Long.valueOf(j14), Long.valueOf(j15));
        }
        long j16 = jArr[i14];
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((j16 == j14 ? 0.0d : (j8 - j14) / (j16 - j14)) * (jArr2[i14] - j15))) + j15));
    }

    @Override // ub.e
    public final int f() {
        return BleCommunicationException.UNSPECIFIED_FAILURE;
    }

    @Override // ub.e
    public final long getDataEndPosition() {
        return -1L;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f169672c;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        Pair<Long, Long> pairB = b(z.Y(z.j(j8, 0L, this.f169672c)), this.f169671b, this.f169670a);
        return new g0.a(new h0(z.O(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // ub.e
    public final long getTimeUs(long j8) {
        return z.O(((Long) b(j8, this.f169670a, this.f169671b).second).longValue());
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }
}
