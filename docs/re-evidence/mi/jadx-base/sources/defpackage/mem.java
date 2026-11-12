package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes4.dex */
public final class mem extends v {
    public static final Object o = new Object();
    public static final m p = new m.c().h("SinglePeriodTimeline").m(Uri.EMPTY).a();
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26081k;
    public final Object l;
    public final m m;
    public final m.f n;

    public mem(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, m mVar, m.f fVar) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = z;
        this.f26081k = z2;
        this.l = obj;
        this.m = (m) rk1.e(mVar);
        this.n = fVar;
    }

    @Override // com.google.android.exoplayer2.v
    public int b(Object obj) {
        return o.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.v
    public v.b g(int i, v.b bVar, boolean z) {
        rk1.c(i, 0, 1);
        return bVar.n(null, z ? o : null, 0, this.f, -this.h);
    }

    @Override // com.google.android.exoplayer2.v
    public int i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.v
    public Object m(int i) {
        rk1.c(i, 0, 1);
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[PHI: r1
      0x002a: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0013, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.v
    public v.c o(int i, v.c cVar, long j) {
        long j2;
        rk1.c(i, 0, 1);
        long j3 = this.i;
        boolean z = this.f26081k;
        if (!z || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return cVar.g(v.c.f8448r, this.m, this.l, this.c, this.d, this.e, this.j, z, this.n, j2, this.g, 0, 0, this.h);
    }

    @Override // com.google.android.exoplayer2.v
    public int p() {
        return 1;
    }

    public mem(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, m mVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj, mVar, z3 ? mVar.c : null);
    }

    public mem(long j, boolean z, boolean z2, boolean z3, Object obj, m mVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mVar);
    }
}
