package g43;

import i33.j;
import i43.l;
import k33.h;
import l33.e0;
import o33.f;
import o33.y;
import p13.h0;
import p13.w;
import z23.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f75850a;

    public b(h hVar, j jVar) {
        hVar.getClass();
        jVar.getClass();
        this.f75850a = hVar;
    }

    public final t23.e a(f fVar) {
        e0 e0Var;
        x33.c cVarC = fVar.c();
        if (cVarC != null && y.SOURCE == null) {
            return null;
        }
        t tVarK = fVar.k();
        if (tVarK != null) {
            t23.e eVarA = a(tVarK);
            l lVarB0 = eVarA != null ? eVarA.b0() : null;
            t23.h hVarF = lVarB0 != null ? lVarB0.f(fVar.getName(), b33.b.FROM_JAVA_LOADER) : null;
            if (hVarF instanceof t23.e) {
                return (t23.e) hVarF;
            }
        } else if (cVarC != null && (e0Var = (e0) h0.d0(w.c(this.f75850a.d(cVarC.b())))) != null) {
            l33.h0 h0Var = e0Var.f109730j.f109724d;
            h0Var.getClass();
            return h0Var.v(fVar.getName(), fVar);
        }
        return null;
    }
}
