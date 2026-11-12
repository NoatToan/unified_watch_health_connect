package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc2/g0;", "Lh5/x0;", "Lc2/h0;", "Lc2/k3;", "insets", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "Lkotlin/Function2;", "Lg6/c;", "", "heightCalc", "<init>", "(Lc2/k3;Le23/l;Le23/p;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class g0 extends h5.x0<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f22657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.p<k3, g6.c, Integer> f22659c;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(k3 k3Var, e23.l<? super kotlin.m2, Unit> lVar, e23.p<? super k3, ? super g6.c, Integer> pVar) {
        this.f22657a = k3Var;
        this.f22658b = lVar;
        this.f22659c = pVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new h0(this.f22657a, this.f22659c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f22657a, g0Var.f22657a) && this.f22659c == g0Var.f22659c;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22659c.hashCode() + (this.f22657a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22658b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        h0 h0Var = (h0) cVar;
        k3 k3Var = h0Var.f22671c;
        k3 k3Var2 = this.f22657a;
        boolean zG = p005kotlin.jvm.internal.s.g(k3Var, k3Var2);
        e23.p<k3, g6.c, Integer> pVar = this.f22659c;
        if (zG && pVar == h0Var.f22672d) {
            return;
        }
        h0Var.f22671c = k3Var2;
        h0Var.f22672d = pVar;
        k3 k3Var3 = h0Var.f22674a;
        n0 n0Var = n3.f22788a;
        h0Var.f22673e = new j0(k3Var2, k3Var3);
        h5.k.g(h0Var).T();
    }
}
