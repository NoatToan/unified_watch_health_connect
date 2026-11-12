package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;

/* JADX INFO: loaded from: classes4.dex */
public final class u6g implements drl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f35463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f35464b;
    public final long c;

    public u6g(long[] jArr, long[] jArr2, long j) {
        this.f35463a = jArr;
        this.f35464b = jArr2;
        this.c = j == -9223372036854775807L ? g83.c(jArr2[jArr2.length - 1]) : j;
    }

    public static u6g a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.c + mlltFrame.e[i3]);
            j3 += (long) (mlltFrame.d + mlltFrame.f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new u6g(jArr, jArr2, j2);
    }

    public static Pair<Long, Long> b(long j, long[] jArr, long[] jArr2) {
        int i = wlq.i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override // defpackage.drl
    public long c(long j) {
        return g83.c(((Long) b(j, this.f35463a, this.f35464b).second).longValue());
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        Pair<Long, Long> pairB = b(g83.d(wlq.s(j, 0L, this.c)), this.f35464b, this.f35463a);
        return new arl.a(new crl(g83.c(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.drl
    public long h() {
        return -1L;
    }

    @Override // defpackage.arl
    public long i() {
        return this.c;
    }
}
