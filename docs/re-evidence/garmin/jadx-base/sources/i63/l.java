package i63;

import d62.n;
import java.util.ArrayList;
import java.util.List;
import k23.p;
import k23.r;
import m63.k1;
import m63.v1;
import o13.q;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l {
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5 A[RETURN] */
    public static final c<Object> a(p63.e eVar, p pVar, boolean z14) {
        c<? extends Object> cVarA;
        c<Object> cVarB;
        e eVar2;
        k23.d<Object> dVarF = k1.f(pVar);
        boolean f16114d = pVar.getF16114d();
        List<r> listH = pVar.h();
        ArrayList arrayList = new ArrayList(y.r(listH, 10));
        for (r rVar : listH) {
            rVar.getClass();
            p pVar2 = rVar.f102464b;
            if (pVar2 == null) {
                vb.h.y(pVar2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(pVar2);
        }
        if (arrayList.isEmpty()) {
            if (!dh.b.u(dVarF).isInterface() || eVar.b(dVarF, j0.f134944a) == null) {
                v1<? extends Object> v1Var = j.f91895a;
                if (f16114d) {
                    cVarA = j.f91896b.a(dVarF);
                } else {
                    cVarA = j.f91895a.a(dVarF);
                    if (cVarA == null) {
                        cVarA = null;
                    }
                }
            } else {
                cVarA = null;
            }
        } else if (eVar.getF136257f()) {
            cVarA = null;
        } else {
            v1<? extends Object> v1Var2 = j.f91895a;
            Object objA = !f16114d ? j.f91897c.a(dVarF, arrayList) : j.f91898d.a(dVarF, arrayList);
            int i14 = q.f128596b;
            if (objA instanceof q.b) {
                objA = null;
            }
            cVarA = (c) objA;
        }
        if (cVarA != null) {
            return cVarA;
        }
        if (arrayList.isEmpty()) {
            cVarB = gl1.y.L(dVarF);
            if (cVarB == null && (cVarB = eVar.b(dVarF, j0.f134944a)) == null) {
                if (dh.b.u(dVarF).isInterface()) {
                    eVar2 = new e(dVarF);
                    cVarB = eVar2;
                } else {
                    cVarB = null;
                }
            }
            if (cVarB != null) {
                if (f16114d) {
                    return j63.a.d(cVarB);
                }
                return cVarB;
            }
        } else {
            ArrayList arrayListN = gl1.y.N(eVar, arrayList, z14);
            if (arrayListN != null) {
                c<Object> cVarF = gl1.y.F(dVarF, arrayListN, new n(1, arrayList));
                if (cVarF == null) {
                    cVarB = eVar.b(dVarF, arrayListN);
                    if (cVarB == null) {
                        if (dh.b.u(dVarF).isInterface()) {
                            eVar2 = new e(dVarF);
                            cVarB = eVar2;
                        } else {
                            cVarB = null;
                        }
                    }
                } else {
                    cVarB = cVarF;
                }
                if (cVarB != null) {
                    if (f16114d) {
                        return j63.a.d(cVarB);
                    }
                    return cVarB;
                }
            }
        }
        return null;
    }
}
