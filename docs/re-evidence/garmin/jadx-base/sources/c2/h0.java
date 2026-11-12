package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/h0;", "Lc2/h1;", "Lh5/c0;", "Lc2/k3;", "insets", "Lkotlin/Function2;", "Lg6/c;", "", "heightCalc", "<init>", "(Lc2/k3;Le23/p;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 extends h1 implements h5.c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k3 f22671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.p<? super k3, ? super g6.c, Integer> f22672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k3 f22673e = n3.f22788a;

    public h0(k3 k3Var, e23.p<? super k3, ? super g6.c, Integer> pVar) {
        this.f22671c = k3Var;
        this.f22672d = pVar;
    }

    @Override // c2.h1
    public final k3 U1(k3 k3Var) {
        return k3Var;
    }

    @Override // c2.h1
    public final void V1() {
        k3 k3Var = this.f22671c;
        k3 k3Var2 = this.f22674a;
        n0 n0Var = n3.f22788a;
        this.f22673e = new j0(k3Var, k3Var2);
        super.V1();
        h5.k.g(this).T();
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        int iIntValue = this.f22672d.invoke(this.f22673e, b1Var).intValue();
        if (iIntValue == 0) {
            return f5.b1.h0(b1Var, 0, 0, new bt1.s(25));
        }
        f5.v1 v1VarQ = y0Var.Q(g6.a.c(0, 0, iIntValue, iIntValue, 3, j8));
        return f5.b1.h0(b1Var, v1VarQ.f69144a, iIntValue, new a03.k0(v1VarQ, 3));
    }
}
