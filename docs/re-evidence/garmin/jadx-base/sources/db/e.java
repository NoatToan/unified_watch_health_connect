package db;

import bb.g0;
import bb.h0;
import bb.l0;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f58942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f58947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f58950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f58951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f58952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f58953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f58954m;

    public e(int i14, int i15, long j8, int i16, l0 l0Var) {
        boolean z14 = true;
        if (i15 != 1 && i15 != 2) {
            z14 = false;
        }
        fa.a.a(z14);
        this.f58945d = j8;
        this.f58946e = i16;
        this.f58942a = l0Var;
        int i17 = (((i14 % 10) + 48) << 8) | ((i14 / 10) + 48);
        this.f58943b = (i15 == 2 ? 1667497984 : 1651965952) | i17;
        this.f58944c = i15 == 2 ? i17 | 1650720768 : -1;
        this.f58952k = -1L;
        this.f58953l = new long[512];
        this.f58954m = new int[512];
    }

    public final h0 a(int i14) {
        return new h0(((this.f58945d * ((long) 1)) / ((long) this.f58946e)) * ((long) this.f58954m[i14]), this.f58953l[i14]);
    }

    public final g0.a b(long j8) {
        if (this.f58951j == 0) {
            return new g0.a(new h0(0L, this.f58952k));
        }
        int i14 = (int) (j8 / ((this.f58945d * ((long) 1)) / ((long) this.f58946e)));
        int iD = z.d(this.f58954m, i14, true, true);
        if (this.f58954m[iD] == i14) {
            return new g0.a(a(iD));
        }
        h0 h0VarA = a(iD);
        int i15 = iD + 1;
        return i15 < this.f58953l.length ? new g0.a(h0VarA, a(i15)) : new g0.a(h0VarA);
    }
}
