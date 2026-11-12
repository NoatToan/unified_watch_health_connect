package a3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f0 implements o4.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f654a;

    public f0(g0 g0Var) {
        this.f654a = g0Var;
    }

    @Override // o4.j0
    public final long a() {
        g0 g0Var = this.f654a;
        long jA = g0Var.f669f.a();
        if (jA != 16) {
            return jA;
        }
        c1 c1Var = (c1) h5.i.a(g0Var, e1.f643a);
        if (c1Var != null) {
            long j8 = c1Var.f631a;
            if (j8 != 16) {
                return j8;
            }
        }
        d1 d1Var = d1.f636a;
        long j14 = ((o4.d0) h5.i.a(g0Var, x.f872a)).f128833a;
        boolean zC = ((t) h5.i.a(g0Var, u.f849a)).c();
        d1Var.getClass();
        float fI = o4.f0.i(j14);
        if (zC || fI >= 0.5d) {
            return j14;
        }
        o4.d0.f128823b.getClass();
        return o4.d0.f128826e;
    }
}
