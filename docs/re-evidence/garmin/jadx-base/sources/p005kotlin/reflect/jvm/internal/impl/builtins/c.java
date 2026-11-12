package p005kotlin.reflect.jvm.internal.impl.builtins;

import b43.i;
import d43.g;
import d43.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.t0;
import p13.u0;
import p13.x;
import p13.y;
import p43.n0;
import p43.q0;
import p43.t1;
import p43.v;
import p43.v0;
import p43.v1;
import t23.e;
import u23.h;
import u23.k;
import x33.d;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(n0 n0Var) {
        n0Var.getClass();
        u23.c cVarZ = n0Var.getAnnotations().z(f.a.f105892r);
        if (cVarZ == null) {
            return 0;
        }
        g gVar = (g) u0.c(f.f105853e, cVarZ.b());
        gVar.getClass();
        return ((Number) ((n) gVar).f57481a).intValue();
    }

    public static final v0 b(d dVar, h hVar, n0 n0Var, List list, ArrayList arrayList, n0 n0Var2, boolean z14) {
        e eVarK;
        h hVarA;
        h hVarA2;
        hVar.getClass();
        list.getClass();
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (n0Var != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n0 n0Var3 = (n0) it.next();
            n0Var3.getClass();
            arrayList3.add(new v1(n0Var3));
        }
        arrayList2.addAll(arrayList3);
        v1 v1Var = n0Var != null ? new v1(n0Var) : null;
        if (v1Var != null) {
            arrayList2.add(v1Var);
        }
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            n0 n0Var4 = (n0) obj;
            n0Var4.getClass();
            arrayList2.add(new v1(n0Var4));
            i14 = i15;
        }
        arrayList2.add(new v1(n0Var2));
        int size = list.size() + arrayList.size() + (n0Var != null ? 1 : 0);
        if (z14) {
            eVarK = dVar.w(size);
        } else {
            f fVar = f.f105849a;
            eVarK = dVar.k("Function" + size);
        }
        e eVar = eVarK;
        eVar.getClass();
        if (n0Var != null) {
            x33.c cVar = f.a.f105891q;
            if (hVar.I3(cVar)) {
                hVarA2 = hVar;
            } else {
                h.a aVar = h.f168226x0;
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                ArrayList arrayListB0 = h0.B0(hVar, new k(dVar, cVar, k0Var, false, 8, null));
                aVar.getClass();
                hVarA2 = h.a.a(arrayListB0);
            }
            hVarA = hVarA2;
        } else {
            hVarA = hVar;
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            hVarA.getClass();
            x33.c cVar2 = f.a.f105892r;
            if (!hVarA.I3(cVar2)) {
                h.a aVar2 = h.f168226x0;
                ArrayList arrayListB1 = h0.B0(hVarA, new k(dVar, cVar2, t0.b(new p(f.f105853e, new n(size2))), false, 8, null));
                aVar2.getClass();
                hVarA = h.a.a(arrayListB1);
            }
        }
        hVarA.getClass();
        return q0.d(v.f135927a.a(hVarA), eVar, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f c(n0 n0Var) {
        String str;
        u23.c cVarZ = n0Var.getAnnotations().z(f.a.f105893s);
        if (cVarZ != null) {
            Object objJ0 = h0.J0(cVarZ.b().values());
            d43.x xVar = objJ0 instanceof d43.x ? (d43.x) objJ0 : null;
            if (xVar != null && (str = (String) xVar.f57481a) != null) {
                if (!f.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return f.e(str);
                }
            }
        }
        return null;
    }

    public static final List<n0> d(n0 n0Var) {
        n0Var.getClass();
        h(n0Var);
        int iA = a(n0Var);
        if (iA == 0) {
            return j0.f134944a;
        }
        List<t1> listSubList = n0Var.D0().subList(0, iA);
        ArrayList arrayList = new ArrayList(y.r(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((t1) it.next()).getType());
        }
        return arrayList;
    }

    public static final r23.f e(d dVar) {
        if (!dVar.d() || dVar.c()) {
            return null;
        }
        r23.g.f149963c.getClass();
        r23.g gVar = r23.g.f149964d;
        x33.c cVarB = dVar.i().b();
        String strB = dVar.g().b();
        strB.getClass();
        gVar.getClass();
        r23.g.b bVarA = gVar.a(strB, cVarB);
        if (bVarA != null) {
            return bVarA.f149967a;
        }
        return null;
    }

    public static final n0 f(n0 n0Var) {
        n0Var.getClass();
        h(n0Var);
        if (n0Var.getAnnotations().z(f.a.f105891q) == null) {
            return null;
        }
        return n0Var.D0().get(a(n0Var)).getType();
    }

    public static final List<t1> g(n0 n0Var) {
        n0Var.getClass();
        h(n0Var);
        List<t1> listD0 = n0Var.D0();
        return listD0.subList(((!h(n0Var) || n0Var.getAnnotations().z(f.a.f105891q) == null) ? 0 : 1) + a(n0Var), listD0.size() - 1);
    }

    public static final boolean h(n0 n0Var) {
        r23.f fVarE;
        n0Var.getClass();
        t23.h hVarT = n0Var.F0().t();
        if (hVarT == null) {
            return false;
        }
        if ((hVarT instanceof e) && d.K(hVarT)) {
            int i14 = f43.e.f68881a;
            d dVarF = i.f(hVarT);
            dVarF.getClass();
            fVarE = e(dVarF);
        } else {
            fVarE = null;
        }
        return s.g(fVarE, r23.f.a.f149959c) || s.g(fVarE, r23.f.d.f149962c);
    }

    public static final boolean i(n0 n0Var) {
        n0Var.getClass();
        t23.h hVarT = n0Var.F0().t();
        r23.f fVarE = null;
        if (hVarT != null && (hVarT instanceof e) && d.K(hVarT)) {
            int i14 = f43.e.f68881a;
            d dVarF = i.f(hVarT);
            dVarF.getClass();
            fVarE = e(dVarF);
        }
        return s.g(fVarE, r23.f.d.f149962c);
    }
}
