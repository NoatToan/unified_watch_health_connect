package p3;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.browser.trusted.c f135214a = new androidx.browser.trusted.c(26);

    public static final void a(ArrayList arrayList, int i14, int i15) {
        int iH = h(i14, arrayList);
        if (iH < 0) {
            iH = -(iH + 1);
        }
        while (iH < arrayList.size() && ((w0) arrayList.get(iH)).f135366b < i15) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public static final p1 b(r53.i iVar, Object obj, t13.g gVar, m mVar, int i14, int i15) {
        if ((i15 & 2) != 0) {
            gVar = t13.h.f161748a;
        }
        t13.g gVar2 = gVar;
        x1 x1Var = n.f135158a;
        boolean zR = mVar.r(gVar2) | mVar.r(iVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new v3(gVar2, iVar, null);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new v3(gVar2, iVar, null);
                mVar.K(objQ);
            }
        }
        return p(obj, iVar, gVar2, (e23.p) objQ, mVar, ((i14 >> 3) & 14) | ((i14 << 3) & 112) | (i14 & 896));
    }

    public static final p1 c(r53.o2 o2Var, m mVar, int i14) {
        t13.h hVar = t13.h.f161748a;
        x1 x1Var = n.f135158a;
        return b(o2Var, o2Var.getValue(), hVar, mVar, (i14 & 14) | ((i14 << 3) & 896), 0);
    }

    public static final void d(s3.h hVar, ArrayList arrayList, int i14) {
        boolean zL = hVar.l(i14);
        int[] iArr = hVar.f156335b;
        if (zL) {
            arrayList.add(hVar.n(i14));
            return;
        }
        int iA = s3.k.a(i14, iArr) + i14;
        for (int i15 = i14 + 1; i15 < iA; i15 += iArr[(i15 * 5) + 3]) {
            d(hVar, arrayList, i15);
        }
    }

    public static final q3.c e() {
        z3.m<q3.c<f0>> mVar = q3.f135228b;
        q3.c<f0> cVarA = mVar.a();
        if (cVarA != null) {
            return cVarA;
        }
        q3.c<f0> cVar = new q3.c<>(new f0[0], 0);
        mVar.b(cVar);
        return cVar;
    }

    public static final d0 f(e23.a aVar) {
        z3.m<z3.g> mVar = q3.f135227a;
        return new d0(aVar, null);
    }

    public static final d0 g(p3 p3Var, e23.a aVar) {
        z3.m<z3.g> mVar = q3.f135227a;
        return new d0(aVar, p3Var);
    }

    public static final int h(int i14, List list) {
        int size = list.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            int iH = p005kotlin.jvm.internal.s.h(((w0) list.get(i16)).f135366b, i14);
            if (iH < 0) {
                i15 = i16 + 1;
            } else {
                if (iH <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final long i(m mVar) {
        x1 x1Var = n.f135158a;
        return mVar.getU();
    }

    public static final o2 j(m mVar) {
        x1 x1Var = n.f135158a;
        p2 p2VarO = mVar.o();
        if (p2VarO != null) {
            mVar.t(p2VarO);
            return p2VarO;
        }
        vb.h.z("no recompose scope found");
        return null;
    }

    public static final Object k(Object obj, Object obj2, Object obj3) {
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        if (y0Var == null) {
            return null;
        }
        Object obj4 = y0Var.f135390b;
        Object obj5 = y0Var.f135389a;
        if (p005kotlin.jvm.internal.s.g(obj5, obj2) && p005kotlin.jvm.internal.s.g(obj4, obj3)) {
            return obj;
        }
        Object objK = k(obj5, obj2, obj3);
        return objK == null ? k(obj4, obj2, obj3) : objK;
    }

    public static final void l() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final f4.u m(o13.p... pVarArr) {
        Map mapB;
        f4.u uVar = new f4.u();
        int length = pVarArr.length;
        if (length == 0) {
            mapB = p13.k0.f134949a;
            mapB.getClass();
        } else if (length != 1) {
            mapB = new LinkedHashMap(p13.t0.a(pVarArr.length));
            p13.u0.k(mapB, pVarArr);
        } else {
            mapB = p13.t0.b(pVarArr[0]);
        }
        uVar.putAll(mapB);
        return uVar;
    }

    public static c2 n(Object obj) {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        return new c2(obj, a4Var);
    }

    public static final p1 o(e23.p pVar, Object obj, m mVar) {
        x1 x1Var = n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = n(obj);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        Unit unit = Unit.INSTANCE;
        boolean zR = mVar.r(pVar);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new r3(pVar, p1Var, null);
            mVar.K(objQ2);
        }
        l0.e((e23.p) objQ2, unit, mVar);
        return p1Var;
    }

    public static final p1 p(Object obj, Object obj2, Object obj3, e23.p pVar, m mVar, int i14) {
        x1 x1Var = n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = n(obj);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        boolean zR = mVar.r(pVar);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new t3(pVar, p1Var, null);
            mVar.K(objQ2);
        }
        l0.f(obj2, obj3, (e23.p) objQ2, mVar);
        return p1Var;
    }

    public static final p1 q(Object obj, m mVar) {
        x1 x1Var = n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = n(obj);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        p1Var.setValue(obj);
        return p1Var;
    }

    public static final void r(s3.l lVar, int i14, Object obj) {
        int iH = lVar.h(i14);
        Object[] objArr = lVar.f156365c;
        Object obj2 = objArr[iH];
        m.f135153a.getClass();
        objArr[iH] = m.a.f135155b;
        if (obj == obj2) {
            return;
        }
        n.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static final r53.c2 s(e23.a aVar) {
        return new r53.c2(new w3(null, aVar, null));
    }

    public static final int t(int i14) {
        int i15 = 306783378 & i14;
        int i16 = 613566756 & i14;
        return (i14 & (-920350135)) | (i16 >> 1) | i15 | ((i15 << 1) & i16);
    }
}
