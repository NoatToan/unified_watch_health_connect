package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f135809a = new d();

    private d() {
    }

    public static boolean a(t43.p pVar, t43.i iVar, t43.i iVar2) {
        if (pVar.g(iVar) == pVar.g(iVar2) && pVar.r(iVar) == pVar.r(iVar2) && pVar.B0(iVar) == pVar.B0(iVar2) && pVar.P(pVar.F0(iVar), pVar.F0(iVar2))) {
            if (pVar.z0(iVar, iVar2)) {
                return true;
            }
            int iG = pVar.g(iVar);
            for (int i14 = 0; i14 < iG; i14++) {
                t43.l lVarH = pVar.h(iVar, i14);
                t43.l lVarH2 = pVar.h(iVar2, i14);
                if (pVar.H(lVarH) == pVar.H(lVarH2)) {
                    if (!pVar.H(lVarH)) {
                        if (pVar.n(lVarH) == pVar.n(lVarH2)) {
                            t43.h hVarP = pVar.p(lVarH);
                            hVarP.getClass();
                            t43.h hVarP2 = pVar.p(lVarH2);
                            hVarP2.getClass();
                            if (!c(pVar, hVarP, hVarP2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(t43.p pVar, t43.h hVar, t43.h hVar2) {
        pVar.getClass();
        hVar.getClass();
        hVar2.getClass();
        return c(pVar, hVar, hVar2);
    }

    public static boolean c(t43.p pVar, t43.h hVar, t43.h hVar2) {
        if (hVar == hVar2) {
            return true;
        }
        t43.i iVarT0 = pVar.t0(hVar);
        t43.i iVarT1 = pVar.t0(hVar2);
        if (iVarT0 != null && iVarT1 != null) {
            return a(pVar, iVarT0, iVarT1);
        }
        t43.f fVarY0 = pVar.y0(hVar);
        t43.f fVarY1 = pVar.y0(hVar2);
        return fVarY0 != null && fVarY1 != null && a(pVar, pVar.b(fVarY0), pVar.b(fVarY1)) && a(pVar, pVar.a(fVarY0), pVar.a(fVarY1));
    }
}
