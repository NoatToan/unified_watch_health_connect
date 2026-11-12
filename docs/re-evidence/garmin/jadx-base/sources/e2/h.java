package e2;

import b82.r0;
import g2.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le2/h;", "Lg2/f;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements g2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f62427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f62428b;

    @Override // g2.f
    public final boolean a() {
        return !o().e().isEmpty();
    }

    @Override // g2.f
    public final int b(int i14) {
        return o().e().get(i14).getF62575q();
    }

    @Override // g2.f
    public final int c() {
        return z1.g.b(o());
    }

    @Override // g2.f
    public final int d() {
        return o().getF62554n();
    }

    @Override // g2.f
    public final List<z0.b> e(int i14, e23.p<? super Integer, ? super Integer, Unit> pVar) {
        c0 c0Var = this.f62428b;
        if (c0Var != null) {
            return p13.w.c(c0Var.a(i14, new r0(pVar, 1)));
        }
        p005kotlin.jvm.internal.s.m("prefetchScope");
        throw null;
    }

    @Override // g2.f
    public final int f(int i14) {
        return o().e().get(i14).getF62559a();
    }

    @Override // g2.f
    public final int g(int i14) {
        return i14;
    }

    @Override // g2.f
    public final g6.c getDensity() {
        v vVarO = o();
        x xVar = vVarO instanceof x ? (x) vVarO : null;
        if (xVar != null) {
            return xVar.f62549i;
        }
        return null;
    }

    @Override // g2.f
    public final int h() {
        int iB = o().b() + ((n) p13.h0.b0(o().e())).getF62574p();
        if (iB > 0) {
            iB = 0;
        }
        return Math.abs(iB);
    }

    @Override // g2.f
    public final int i() {
        n nVar = (n) p13.h0.m0(o().e());
        return Math.abs((o().getF62558r() + (nVar.getF62575q() + nVar.getF62574p())) - o().getF62553m());
    }

    @Override // g2.f
    public final Object j(int i14) {
        return o().e().get(i14).getF62570l();
    }

    @Override // g2.f
    public final int k() {
        if (d() == 0) {
            return -1;
        }
        return d() - 1;
    }

    @Override // g2.f
    public final int l() {
        return ((n) p13.h0.b0(o().e())).getF62559a();
    }

    @Override // g2.f
    public final int m() {
        return o().e().size();
    }

    @Override // g2.f
    public final int n() {
        return ((n) p13.h0.m0(o().e())).getF62559a();
    }

    public final v o() {
        v vVar = this.f62427a;
        if (vVar != null) {
            return vVar;
        }
        p005kotlin.jvm.internal.s.m("layoutInfo");
        throw null;
    }
}
