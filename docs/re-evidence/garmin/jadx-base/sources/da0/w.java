package da0;

import ca0.j1;
import java.util.List;
import o4.m1;
import o4.r1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    public static final void a(h4.r rVar, List list, e23.l lVar, e23.l lVar2, r1 r1Var, e23.q qVar, p3.m mVar, int i14) {
        r1 r1Var2;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1241600257);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = 2048;
        int i17 = i15 | (o0VarE.r(lVar2) ? 2048 : 1024) | 24576 | (o0VarE.r(qVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            m1.a aVar = m1.f128891a;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-2058348459);
            for (Object obj : list) {
                boolean zBooleanValue = ((Boolean) lVar.invoke(obj)).booleanValue();
                String str = (String) qVar.invoke(obj, o0VarE, Integer.valueOf((i17 >> 12) & 112));
                boolean zR = ((i17 & 7168) == i16) | o0VarE.r(obj);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new j1(26, lVar2, obj);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j1(26, lVar2, obj);
                        o0VarE.K(objQ);
                    }
                }
                u.a(null, zBooleanValue, str, null, aVar, (e23.a) objQ, o0VarE, 24576, 9);
                i17 = i17;
                i16 = i16;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            r1Var2 = aVar;
        } else {
            o0VarE.e();
            r1Var2 = r1Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0(rVar, list, lVar, lVar2, r1Var2, qVar, i14);
        }
    }
}
