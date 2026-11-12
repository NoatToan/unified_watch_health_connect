package yr;

import c2.x2;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(nr.g.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(194046983);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarY = x2.y(u1.n.e(aVar2, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), null, 3);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarY, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String str = aVar.f127042a;
            if (str == null) {
                str = "";
            }
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            long jB = d92.b.a(o0VarE).k().b();
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97918c;
            bVar.getClass();
            mh.c(str, c2.l.C(aVar2, eVar.f97920e, f14, 0.0f, f15, 4), jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0Var = o0VarE;
            List<nr.i0> list = aVar.f127043b;
            if (list == null) {
                o0Var.C(-373232294);
                o0Var.g0(false);
            } else {
                o0Var.C(-373232293);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    b((nr.i0) it.next(), o0Var, 0);
                }
                o0Var.g0(false);
            }
            o0Var.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(aVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    public static final void b(nr.i0 i0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1791671617);
        int i15 = (o0VarE.B(i0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(1149248103, new xn.t(i0Var, 10), o0VarE);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(i0Var, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(i0Var, 0);
                    o0VarE.K(objQ);
                }
            }
            p2Var.f(null, eVarC, null, false, false, null, (e23.a) objQ, o0VarE, 48, 61);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(i0Var, i14, 0);
        }
    }
}
