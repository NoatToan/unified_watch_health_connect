package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends s.f {
    @Override // c63.s.f
    default void j() {
        v(new e63.e(new s0(2000, false, 2, null)));
    }

    @Override // c63.s.f
    default void o(r0 r0Var) {
        r0Var.getClass();
        v(new e63.e(new k1(r0Var, false, 2, null)));
    }

    @Override // c63.s.f
    default void r(r0 r0Var) {
        r0Var.getClass();
        v(new e63.e(new n0(r0Var)));
    }

    @Override // c63.s.f
    default void t(p0 p0Var) {
        p0Var.getClass();
        v(new e63.e(new o0(p0Var)));
    }

    void v(e63.e eVar);
}
