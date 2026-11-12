package o63;

import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    public static final k63.e a(k63.e eVar, p63.e eVar2) {
        k63.e eVarA;
        i63.c cVarB;
        eVar.getClass();
        eVar2.getClass();
        if (!p005kotlin.jvm.internal.s.g(eVar.getF103234b(), k63.l.a.f103251a)) {
            return eVar.getF116965m() ? a(eVar.h(0), eVar2) : eVar;
        }
        k23.d dVarZ = ge1.b.z(eVar);
        k63.e f158591b = null;
        if (dVarZ != null && (cVarB = eVar2.b(dVarZ, j0.f134944a)) != null) {
            f158591b = cVarB.getF158591b();
        }
        return (f158591b == null || (eVarA = a(f158591b, eVar2)) == null) ? eVar : eVarA;
    }

    public static final g0 b(k63.e eVar, n63.b bVar) {
        bVar.getClass();
        eVar.getClass();
        k63.l f103234b = eVar.getF103234b();
        if (f103234b instanceof k63.c) {
            return g0.POLY_OBJ;
        }
        if (p005kotlin.jvm.internal.s.g(f103234b, k63.m.b.f103254a)) {
            return g0.LIST;
        }
        if (!p005kotlin.jvm.internal.s.g(f103234b, k63.m.c.f103255a)) {
            return g0.OBJ;
        }
        k63.e eVarA = a(eVar.h(0), bVar.f123894b);
        k63.l f103234b2 = eVarA.getF103234b();
        if ((f103234b2 instanceof k63.d) || p005kotlin.jvm.internal.s.g(f103234b2, k63.l.b.f103252a)) {
            return g0.MAP;
        }
        if (bVar.f123893a.f123922d) {
            return g0.LIST;
        }
        throw gg.b.f(eVarA);
    }
}
