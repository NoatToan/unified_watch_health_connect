package r43;

import p13.a1;
import p13.j0;
import p43.a2;
import p43.w1;
import t23.a0;
import t23.q;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends w23.m {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(x33.f fVar) {
        fVar.getClass();
        l.f150388a.getClass();
        e eVar = l.f150389b;
        a0 a0Var = a0.OPEN;
        t23.f fVar2 = t23.f.CLASS;
        j0 j0Var = j0.f134944a;
        y0.a aVar = y0.f162076a;
        super(eVar, fVar, a0Var, fVar2, j0Var, aVar, false, o43.e.f129095e);
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        if (c3153a == null) {
            w23.k.y(5);
            throw null;
        }
        if (aVar == null) {
            w23.k.y(6);
            throw null;
        }
        w23.k kVar = new w23.k(this, null, c3153a, true, t23.b.a.DECLARATION, aVar);
        kVar.P0(j0Var, q.f162050e);
        h hVar = h.SCOPE_FOR_ERROR_CLASS;
        String str = kVar.getName().f188605a;
        str.getClass();
        g gVarB = l.b(hVar, str, "");
        k kVar2 = k.f150383x;
        kVar.f181725g = new i(l.d(kVar2, new String[0]), gVarB, kVar2, null, false, new String[0], 24, null);
        E0(gVarB, a1.b(kVar), kVar);
    }

    @Override // w23.b
    /* JADX INFO: renamed from: D0 */
    public final t23.e b(a2 a2Var) {
        a2Var.getClass();
        return this;
    }

    @Override // w23.b, t23.a1
    public final t23.m b(a2 a2Var) {
        a2Var.getClass();
        return this;
    }

    @Override // w23.m
    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }

    @Override // w23.b, w23.e0
    public final i43.l y(w1 w1Var, q43.f fVar) {
        fVar.getClass();
        h hVar = h.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f188605a;
        str.getClass();
        return l.b(hVar, str, w1Var.toString());
    }
}
