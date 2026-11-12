package o53;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    public static final u53.d a(t13.g gVar) {
        if (gVar.get(l1.f129368i0) == null) {
            gVar = gVar.plus(g8.i.c());
        }
        return new u53.d(gVar);
    }

    public static final u53.d b() {
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        return new u53.d(t13.g.a.C3052a.d(u53.o.f168762a, e2VarH));
    }

    public static final void c(b0 b0Var, CancellationException cancellationException) {
        l1 l1Var = (l1) b0Var.getF183565a().get(l1.f129368i0);
        if (l1Var != null) {
            l1Var.c(cancellationException);
        } else {
            ds.e0.t(b0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void d(b0 b0Var, String str) {
        c(b0Var, gl1.d.a(str, null));
    }

    public static final <R> Object e(e23.p<? super b0, ? super t13.d<? super R>, ? extends Object> pVar, t13.d<? super R> dVar) {
        u53.t tVar = new u53.t(dVar.getF129302c(), dVar);
        Object objV = oi0.c.V(tVar, true, tVar, pVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objV;
    }

    public static final void f(b0 b0Var) {
        g8.i.v(b0Var.getF183565a());
    }

    public static final boolean g(b0 b0Var) {
        l1 l1Var = (l1) b0Var.getF183565a().get(l1.f129368i0);
        if (l1Var != null) {
            return l1Var.isActive();
        }
        return true;
    }

    public static final u53.d h(b0 b0Var, t13.g gVar) {
        return new u53.d(b0Var.getF183565a().plus(gVar));
    }
}
