package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/k1;", "Lc2/h1;", "Lh5/c0;", "Lc2/k3;", "insets", "<init>", "(Lc2/k3;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class k1 extends h1 implements h5.c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k3 f22725c;

    public k1(k3 k3Var) {
        this.f22725c = k3Var;
    }

    @Override // c2.h1
    public final k3 U1(k3 k3Var) {
        k3 k3Var2 = this.f22725c;
        n0 n0Var = n3.f22788a;
        return new c3(k3Var, k3Var2);
    }

    @Override // c2.h1
    public final void V1() {
        super.V1();
        h5.k.g(this).T();
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iB = this.f22675b.b(b1Var, b1Var.getF68887b()) - this.f22674a.b(b1Var, b1Var.getF68887b());
        int iA = this.f22675b.a(b1Var) - this.f22674a.a(b1Var);
        int iD = (this.f22675b.d(b1Var, b1Var.getF68887b()) - this.f22674a.d(b1Var, b1Var.getF68887b())) + iB;
        int iC = (this.f22675b.c(b1Var) - this.f22674a.c(b1Var)) + iA;
        f5.v1 v1VarQ = y0Var.Q(g6.b.i(-iD, -iC, j8));
        return f5.b1.h0(b1Var, g6.b.g(v1VarQ.f69144a + iD, j8), g6.b.f(v1VarQ.f69145b + iC, j8), new a3.q0(v1VarQ, iB, iA, 1));
    }
}
