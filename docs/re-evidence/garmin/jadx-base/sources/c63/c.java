package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface c extends g, s.a {
    @Override // c63.s.a
    default void c(r0 r0Var) {
        r0Var.getClass();
        f(new e63.e(new x(r0Var)));
    }

    void f(e63.o<? super k> oVar);

    @Override // c63.s.a
    default void h(r0 r0Var) {
        r0Var.getClass();
        f(new e63.e(new u(r0Var)));
    }

    @Override // c63.s.a
    default void k(r<b63.o> rVar) {
        rVar.getClass();
        if (rVar instanceof f0) {
            f(((f0) rVar).f24970a);
        }
    }

    @Override // c63.s.a
    default void l(w wVar) {
        wVar.getClass();
        f(new e63.e(new v(wVar)));
    }

    @Override // c63.g
    default void v(e63.e eVar) {
        f(eVar);
    }
}
