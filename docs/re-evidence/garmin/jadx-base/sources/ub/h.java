package ub;

import bb.c0;
import bb.g0;
import bb.h0;
import com.google.android.exoplayer2.C;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f169707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f169708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f169709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f169710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f169711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f169712g;

    private h(long j8, int i14, long j14, int i15, long j15, long[] jArr) {
        this.f169706a = j8;
        this.f169707b = i14;
        this.f169708c = j14;
        this.f169709d = i15;
        this.f169710e = j15;
        this.f169712g = jArr;
        this.f169711f = j15 != -1 ? j8 + j15 : -1L;
    }

    public static h a(g gVar, long j8) {
        long[] jArr;
        long jA = gVar.a();
        c0.a aVar = gVar.f169700a;
        if (jA == C.TIME_UNSET) {
            return null;
        }
        long j14 = gVar.f169702c;
        return (j14 == -1 || (jArr = gVar.f169705f) == null) ? new h(j8, aVar.f17127c, jA, aVar.f17130f) : new h(j8, aVar.f17127c, jA, aVar.f17130f, j14, jArr);
    }

    @Override // ub.e
    public final int f() {
        return this.f169709d;
    }

    @Override // ub.e
    public final long getDataEndPosition() {
        return this.f169711f;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f169708c;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        double d14;
        double d15;
        boolean zIsSeekable = isSeekable();
        int i14 = this.f169707b;
        long j14 = this.f169706a;
        if (!zIsSeekable) {
            return new g0.a(new h0(0L, j14 + ((long) i14)));
        }
        long j15 = z.j(j8, 0L, this.f169708c);
        double d16 = (j15 * 100.0d) / this.f169708c;
        double dB = 0.0d;
        if (d16 <= 0.0d) {
            d14 = 256.0d;
        } else if (d16 >= 100.0d) {
            d14 = 256.0d;
            dB = 256.0d;
        } else {
            int i15 = (int) d16;
            long[] jArr = this.f169712g;
            fa.a.f(jArr);
            double d17 = jArr[i15];
            if (i15 == 99) {
                d14 = 256.0d;
                d15 = 256.0d;
            } else {
                d14 = 256.0d;
                d15 = jArr[i15 + 1];
            }
            dB = o2.c.b(d15, d17, d16 - ((double) i15), d17);
        }
        long j16 = this.f169710e;
        return new g0.a(new h0(j15, j14 + z.j(Math.round((dB / d14) * j16), i14, j16 - 1)));
    }

    @Override // ub.e
    public final long getTimeUs(long j8) {
        long j14 = j8 - this.f169706a;
        if (!isSeekable() || j14 <= this.f169707b) {
            return 0L;
        }
        long[] jArr = this.f169712g;
        fa.a.f(jArr);
        double d14 = (j14 * 256.0d) / this.f169710e;
        int iE = z.e(jArr, (long) d14, true);
        long j15 = this.f169708c;
        long j16 = (((long) iE) * j15) / 100;
        long j17 = jArr[iE];
        int i14 = iE + 1;
        long j18 = (j15 * ((long) i14)) / 100;
        long j19 = iE == 99 ? 256L : jArr[i14];
        return Math.round((j17 == j19 ? 0.0d : (d14 - j17) / (j19 - j17)) * (j18 - j16)) + j16;
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return this.f169712g != null;
    }

    private h(long j8, int i14, long j14, int i15) {
        this(j8, i14, j14, i15, -1L, null);
    }
}
