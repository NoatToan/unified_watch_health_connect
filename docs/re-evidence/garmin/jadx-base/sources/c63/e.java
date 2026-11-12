package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends s.e {
    void M(e63.o<? super c1> oVar);

    @Override // c63.s.e
    default void a(d1 d1Var) {
        d1Var.getClass();
        M(d1Var.f24961a);
    }

    @Override // c63.s.e
    default void g(r0 r0Var) {
        r0Var.getClass();
        M(new e63.y(new e63.e(new i1(r0Var)), true));
    }

    @Override // c63.s.e
    default void u(r0 r0Var) {
        r0Var.getClass();
        M(new e63.e(new h1(r0Var)));
    }

    @Override // c63.s.e
    default void w(r0 r0Var) {
        r0Var.getClass();
        M(new e63.e(new g1(r0Var)));
    }
}
