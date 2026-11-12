package n40;

import c2.b0;
import c2.x2;
import c2.z;
import c22.x0;
import e23.p;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import mz1.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(List<? extends fn0.c> list, e23.l<? super List<? extends fn0.c>, Unit> lVar, p3.m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2946684);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d0(14);
                o0VarE.K(objQ);
            }
            List list2 = (List) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            o0VarE.C(-1463187204);
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.d.T(((fn0.c) it.next()).f72174b, o0VarE, 0));
            }
            o0VarE.g0(false);
            boolean zB = o0VarE.B(list) | o0VarE.B(arrayList);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == p3.m.a.f135155b) {
                ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                int i16 = 0;
                for (Object obj : list2) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    arrayList2.add(new j0((String) arrayList.get(i16), null, null, false, list.contains((fn0.c) obj), 14, null));
                    i16 = i17;
                }
                objQ2 = i53.a.j(arrayList2);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new f82.e();
                o0VarE.K(objQ3);
            }
            f82.e eVar = (f82.e) objQ3;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA = c2.l.A(rVarE, eVar2.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.f23445hc);
            d92.b.f58624b.getClass();
            mh.c(strW, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            bVar.getClass();
            r rVarA2 = c2.l.A(aVar, 0.0f, eVar2.f97917b, 1);
            boolean zR = o0VarE.r(list2) | ((i15 & 112) == 32);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new c42.e0(list2, lVar, 9);
                o0VarE.K(objQ4);
            }
            e82.a.a(fVar, rVarA2, eVar, (p) objQ4, o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e0(lVar, i14, 10, list);
        }
    }
}
