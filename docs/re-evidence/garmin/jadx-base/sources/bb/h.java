package bb;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17184g;

    public h(long j8, long j14, int i14, int i15, boolean z14) {
        this.f17178a = j8;
        this.f17179b = j14;
        this.f17180c = i15 == -1 ? 1 : i15;
        this.f17182e = i14;
        this.f17184g = z14;
        if (j8 == -1) {
            this.f17181d = -1L;
            this.f17183f = C.TIME_UNSET;
        } else {
            long j15 = j8 - j14;
            this.f17181d = j15;
            this.f17183f = (Math.max(0L, j15) * 8000000) / ((long) i14);
        }
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f17183f;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        long j14 = this.f17181d;
        long j15 = this.f17179b;
        if (j14 == -1 && !this.f17184g) {
            return new g0.a(new h0(0L, j15));
        }
        int i14 = this.f17182e;
        long j16 = this.f17180c;
        long jMin = (((((long) i14) * j8) / 8000000) / j16) * j16;
        if (j14 != -1) {
            jMin = Math.min(jMin, j14 - j16);
        }
        long jMax = Math.max(jMin, 0L) + j15;
        long jMax2 = (Math.max(0L, jMax - j15) * 8000000) / ((long) i14);
        h0 h0Var = new h0(jMax2, jMax);
        if (j14 != -1 && jMax2 < j8) {
            long j17 = jMax + j16;
            if (j17 < this.f17178a) {
                return new g0.a(h0Var, new h0((Math.max(0L, j17 - j15) * 8000000) / ((long) i14), j17));
            }
        }
        return new g0.a(h0Var);
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return this.f17181d != -1 || this.f17184g;
    }

    public h(long j8, long j14, int i14, int i15) {
        this(j8, j14, i14, i15, false);
    }
}
