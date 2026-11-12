package t23;

import java.util.List;
import p43.a2;
import p43.w1;

/* JADX INFO: loaded from: classes3.dex */
public interface v extends b {

    public interface a<D extends v> {
        a<D> a(a0 a0Var);

        a<D> b();

        D build();

        a<D> c(x33.f fVar);

        a d();

        a e(d dVar);

        a<D> f(r rVar);

        a g(t23.a.InterfaceC3056a interfaceC3056a);

        a<D> h();

        a<D> i(u23.h hVar);

        a<D> j(List<d1> list);

        a<D> k(w1 w1Var);

        a<D> l(List<j1> list);

        a<D> m();

        a<D> n(l lVar);

        a<D> o(p43.n0 n0Var);

        a<D> p(u0 u0Var);

        a<D> q(b.a aVar);

        a<D> r();
    }

    boolean C();

    boolean C0();

    boolean W();

    @Override // t23.b, t23.a, t23.l
    v a();

    v b(a2 a2Var);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    a<? extends v> j0();

    v y0();
}
