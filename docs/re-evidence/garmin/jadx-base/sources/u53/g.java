package u53;

import kotlinx.coroutines.DispatchException;
import o53.g2;
import o53.l1;
import o53.l2;
import o53.y0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f168736a = new x("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f168737b = new x("REUSABLE_CLAIMED");

    public static final void a(Object obj, t13.d dVar) {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        o53.z zVar = fVar.f168732d;
        t13.d<T> dVar2 = fVar.f168733e;
        Throwable thB = o13.q.b(obj);
        Object vVar = thB == null ? obj : new o53.v(thB, false, 2, null);
        if (c(zVar, dVar2.getF129302c())) {
            fVar.f168734f = vVar;
            fVar.f129380c = 1;
            b(zVar, dVar2.getF129302c(), fVar);
            return;
        }
        g2.f129341a.getClass();
        y0 y0VarA = g2.a();
        if (y0VarA.f129423a >= 4294967296L) {
            fVar.f168734f = vVar;
            fVar.f129380c = 1;
            y0VarA.T(fVar);
            return;
        }
        y0VarA.U(true);
        try {
            l1 l1Var = (l1) dVar2.getF129302c().get(l1.f129368i0);
            if (l1Var == null || l1Var.isActive()) {
                Object obj2 = fVar.f168735g;
                t13.g f129302c = dVar2.getF129302c();
                Object objC = z.c(f129302c, obj2);
                l2<?> l2VarC = objC != z.f168776a ? o53.y.c(dVar2, f129302c, objC) : null;
                try {
                    dVar2.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (l2VarC == null || l2VarC.x0()) {
                        z.a(f129302c, objC);
                    }
                } catch (Throwable th3) {
                    if (l2VarC == null || l2VarC.x0()) {
                        z.a(f129302c, objC);
                    }
                    throw th3;
                }
            } else {
                fVar.resumeWith(o13.r.a(l1Var.Q()));
            }
            while (y0VarA.W()) {
            }
        } catch (Throwable th4) {
            try {
                fVar.g(th4);
            } finally {
                y0VarA.H(true);
            }
        }
    }

    public static final void b(o53.z zVar, t13.g gVar, Runnable runnable) {
        try {
            zVar.dispatch(gVar, runnable);
        } catch (Throwable th3) {
            throw new DispatchException(th3, zVar, gVar);
        }
    }

    public static final boolean c(o53.z zVar, t13.g gVar) throws DispatchException {
        try {
            return zVar.isDispatchNeeded(gVar);
        } catch (Throwable th3) {
            throw new DispatchException(th3, zVar, gVar);
        }
    }
}
