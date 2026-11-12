package kj2;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.l;
import u1.w;
import u1.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public static final void a(String str, Integer num, e23.a aVar, m mVar, int i14) {
        o0 o0VarL = vb.h.l(1236297356, aVar, str, mVar);
        int i15 = i14 | (o0VarL.B(str) ? 4 : 2) | (o0VarL.B(num) ? 32 : 16) | (o0VarL.r(aVar) ? 256 : 128);
        if (o0VarL.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            l.f136032b.getClass();
            Object objQ = o0VarL.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = kg.f.b(o0VarL);
            }
            r rVarE = u1.n.e(w.a(rVarF, (a2.j) objQ, null, true, "", l.a(0), aVar), am.j.c(d92.b.f58623a, o0VarL), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = c2.l.B(rVarE, f14, f15, f15, f15);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarL, 0);
            int iHashCode = Long.hashCode(o0VarL.U);
            i2 i2VarA0 = o0VarL.a0();
            r rVarC = h4.k.c(rVarB, o0VarL);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarL.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarL.z();
            if (o0VarL.T) {
                o0VarL.M(aVar3);
            } else {
                o0VarL.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarL.T || !s.g(o0VarL.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarL);
            u2 u2Var = u2.f22900a;
            r rVarY = x2.y(aVar2, null, 3);
            j92.f.f97924a.getClass();
            mh.c(str, rVarY, hb.a.e(o0VarL), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarL, (i15 & 14) | 48, 0, 131064);
            o0VarL = o0VarL;
            c2.l.f(u2Var.a(aVar2, 1.0f, true), o0VarL);
            if (num == null) {
                o0VarL.C(-1436802073);
                o0VarL.g0(false);
            } else {
                o0VarL.C(-1436802072);
                int iIntValue = num.intValue();
                bVar.getClass();
                y0.a(n5.c.a(iIntValue, o0VarL, 0), "", x2.y(x2.q(aVar2, j92.b.f97901d.f97903b), null, 3), null, null, 0.0f, null, o0VarL, 48, 120);
                o0VarL.g0(false);
            }
            o0VarL.g0(true);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(str, num, aVar, i14, 12);
        }
    }
}
