package l23;

import am.j;
import b53.l;
import b53.v;
import ds.e0;
import java.util.ArrayList;
import java.util.List;
import k23.q;
import k23.r;
import k23.s;
import lc.u0;
import n23.f2;
import n23.p4;
import n23.t3;
import p13.j0;
import p13.x;
import p13.y;
import p43.c1;
import p43.g2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.u1;
import p43.v1;
import t23.d1;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final void a(int i14, int i15) {
        if (i14 == i15) {
            return;
        }
        h.s(j.g(i14, i15, "Class declares ", " type parameters, but ", " were provided."));
    }

    public static final b53.a b(k23.e eVar, List list, boolean z14, List list2) {
        eVar.getClass();
        list.getClass();
        list2.getClass();
        return d(eVar, list, z14, list2, null);
    }

    public static b53.a c(k23.e eVar, ArrayList arrayList, int i14) {
        List list = arrayList;
        if ((i14 & 1) != 0) {
            list = j0.f134944a;
        }
        return b(eVar, list, false, j0.f134944a);
    }

    public static final b53.a d(k23.e eVar, List list, boolean z14, List list2, k23.d dVar) {
        t23.h hVarU;
        u1 c1Var;
        eVar.getClass();
        list.getClass();
        list2.getClass();
        if (!p4.f122570a) {
            k23.d dVar2 = eVar instanceof k23.d ? (k23.d) eVar : null;
            List<q> listA = dVar2 != null ? b53.f.a(dVar2) : null;
            if (listA == null) {
                listA = j0.f134944a;
            }
            a(listA.size(), list.size());
            return new v(eVar, list, z14, list2, null, false, false, false, dVar, null, 512, null);
        }
        if (eVar instanceof f2) {
            hVarU = ((f2) eVar).U();
        } else {
            if (!(eVar instanceof t3)) {
                StringBuilder sb3 = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb3.append(eVar);
                kg.f.t(sb3, " (", eVar.getClass());
                return null;
            }
            t3 t3Var = (t3) eVar;
            d1 d1Var = t3Var.f122627e;
            if (d1Var == null) {
                e0.t(t3Var, "Descriptor-less type parameter: ");
                return null;
            }
            hVarU = d1Var;
        }
        a(hVarU.h().getParameters().size(), list.size());
        m1 m1VarH = hVarU.h();
        m1VarH.getClass();
        List<d1> parameters = m1VarH.getParameters();
        parameters.getClass();
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            r rVar = (r) obj;
            l lVar = (l) rVar.f102464b;
            n0 n0Var = lVar != null ? lVar.f16127b : null;
            s sVar = rVar.f102463a;
            int i16 = sVar == null ? -1 : a.f109163a[sVar.ordinal()];
            if (i16 == -1) {
                d1 d1Var2 = parameters.get(i14);
                d1Var2.getClass();
                c1Var = new c1(d1Var2);
            } else if (i16 == 1) {
                g2 g2Var = g2.INVARIANT;
                n0Var.getClass();
                c1Var = new v1(g2Var, n0Var);
            } else if (i16 == 2) {
                g2 g2Var2 = g2.IN_VARIANCE;
                n0Var.getClass();
                c1Var = new v1(g2Var2, n0Var);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return null;
                }
                g2 g2Var3 = g2.OUT_VARIANCE;
                n0Var.getClass();
                c1Var = new v1(g2Var3, n0Var);
            }
            arrayList.add(c1Var);
            i14 = i15;
        }
        return new l(q0.e(k1Var, m1VarH, arrayList, z14, null), null, 2, null);
    }
}
