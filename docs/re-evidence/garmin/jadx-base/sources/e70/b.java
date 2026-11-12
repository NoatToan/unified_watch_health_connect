package e70;

import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import e23.l;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.f;
import l72.y2;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final void a(int i14, int i15, long j8, r rVar, m mVar) {
        o0 o0Var;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1889221351);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            float f14 = i14 / 100.0f;
            r.a aVar = r.S;
            r rVarThen = x2.f(aVar, 1.0f).then(rVar);
            d.f81522a.getClass();
            g.b bVar = d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            y2 y2Var = y2.f111386a;
            r rVarA = u2Var.a(x2.f(aVar, 1.0f), 0.9f, true);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new dv0.n(29);
                o0VarE.K(objQ);
            }
            y2Var.a(f14, 0.0f, 0, (i16 << 6) & 7168, 116, j8, 0L, v.b(rVarA, (l) objQ), o0VarE);
            r rVarA2 = u2Var.a(x2.f(aVar, 1.0f), 0.1f, true);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a(0);
                o0VarE.K(objQ2);
            }
            r rVarB = v.b(rVarA2, (l) objQ2);
            String strValueOf = String.valueOf(i14);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57758h;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strValueOf, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq.x2(i14, j8, rVar, i15);
        }
    }
}
