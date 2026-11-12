package ub;

import bb.c0;
import com.google.android.exoplayer2.C;
import fa.r;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.a f169700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f169701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f169702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f169703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f169704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f169705f;

    private g(c0.a aVar, long j8, long j14, long[] jArr, int i14, int i15) {
        this.f169700a = new c0.a(aVar);
        this.f169701b = j8;
        this.f169702c = j14;
        this.f169705f = jArr;
        this.f169703d = i14;
        this.f169704e = i15;
    }

    public static g b(c0.a aVar, r rVar) {
        long[] jArr;
        int i14;
        int i15;
        int iG = rVar.g();
        int iY = (iG & 1) != 0 ? rVar.y() : -1;
        long jW = (iG & 2) != 0 ? rVar.w() : -1L;
        if ((iG & 4) == 4) {
            jArr = new long[100];
            for (int i16 = 0; i16 < 100; i16++) {
                jArr[i16] = rVar.u();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iG & 8) != 0) {
            rVar.H(4);
        }
        if (rVar.a() >= 24) {
            rVar.H(21);
            int iX = rVar.x();
            i15 = iX & 4095;
            i14 = (16773120 & iX) >> 12;
        } else {
            i14 = -1;
            i15 = -1;
        }
        return new g(aVar, iY, jW, jArr2, i14, i15);
    }

    public final long a() {
        long j8 = this.f169701b;
        if (j8 == -1 || j8 == 0) {
            return C.TIME_UNSET;
        }
        c0.a aVar = this.f169700a;
        return z.S(aVar.f17128d, (j8 * ((long) aVar.f17131g)) - 1);
    }
}
