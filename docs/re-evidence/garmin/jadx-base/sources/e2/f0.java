package e2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {
    static /* synthetic */ void b(f0 f0Var, Object obj, e23.q qVar, int i14) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        f0Var.c(obj, qVar);
    }

    static /* synthetic */ void e(f0 f0Var, Object obj, z3.e eVar, int i14) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        f0Var.k(obj, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void f(f0 f0Var, int i14, e23.l lVar, e23.r rVar, int i15) {
        if ((i15 & 2) != 0) {
            lVar = null;
        }
        f0Var.a(i14, lVar, e0.f62416a, rVar);
    }

    default void a(int i14, e23.l<? super Integer, ? extends Object> lVar, e23.l<? super Integer, ? extends Object> lVar2, e23.r<? super d, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void c(Object obj, e23.q qVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void k(Object obj, z3.e eVar) {
        c(obj, new z3.e(1691919627, true, new aa2.k(eVar, 2)));
    }
}
