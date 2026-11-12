package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/n2;", "Lh5/c0;", "Lh4/r$c;", "Lc2/h2;", "paddingValues", "<init>", "(Lc2/h2;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n2 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2 f22787a;

    public n2(h2 h2Var) {
        this.f22787a = h2Var;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        float fB = this.f22787a.b(b1Var.getF68887b());
        float f22737b = this.f22787a.getF22737b();
        float fC = this.f22787a.c(b1Var.getF68887b());
        float f22739d = this.f22787a.getF22739d();
        float f14 = 0;
        if (!((g6.f.b(f22739d, f14) >= 0) & (g6.f.b(fB, f14) >= 0) & (g6.f.b(f22737b, f14) >= 0) & (g6.f.b(fC, f14) >= 0))) {
            d2.a.a("Padding must be non-negative");
        }
        int iF0 = b1Var.f0(fB);
        int iF1 = b1Var.f0(fC) + iF0;
        int iF2 = b1Var.f0(f22737b);
        int iF3 = b1Var.f0(f22739d) + iF2;
        f5.v1 v1VarQ = y0Var.Q(g6.b.i(-iF1, -iF3, j8));
        return f5.b1.h0(b1Var, g6.b.g(v1VarQ.f69144a + iF1, j8), g6.b.f(v1VarQ.f69145b + iF3, j8), new a3.q0(v1VarQ, iF0, iF2, 2));
    }
}
