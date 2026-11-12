package ku1;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    public static final void a(r rVar, String str, String str2, String str3, String str4, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str3, mVar, -1390746562);
        p3.c<?> cVar = o0VarK.f135177b;
        int i15 = i14 | (o0VarK.B(rVar) ? 4 : 2) | (o0VarK.B(str) ? 32 : 16) | (o0VarK.B(str2) ? 256 : 128) | (o0VarK.B(str3) ? 2048 : 1024) | (o0VarK.B(str4) ? 16384 : 8192);
        if (o0VarK.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = h4.k.c(rVarF, o0VarK);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            b0 b0Var = b0.f22601a;
            r.a aVar2 = r.S;
            r rVarF2 = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarC2 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar2.f97917b, 7);
            boolean z14 = ((i15 & 57344) == 16384) | ((i15 & 896) == 256) | ((i15 & 112) == 32);
            Object objQ = o0VarK.q();
            if (z14) {
                objQ = new dx0.c(str4, str2, str, 1);
                o0VarK.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new dx0.c(str4, str2, str, 1);
                    o0VarK.K(objQ);
                }
            }
            r rVarB = v.b(rVarC2, (e23.l) objQ);
            s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarK, 6);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            r rVarC3 = h4.k.c(rVarB, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarK);
            u2 u2Var = u2.f22900a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarK), o0VarK, (i15 >> 3) & 14, 0, 131070);
            bVar2.getClass();
            c2.l.f(x2.u(aVar2, eVar2.f97918c), o0VarK);
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), o0VarK), o0VarK, (i15 >> 6) & 14, 0, 131070);
            o0VarK.g0(true);
            fVar2.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarK), o0VarK, (i15 >> 9) & 14, 0, 131070);
            o0Var = o0VarK;
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(rVar, str, str2, str3, str4, i14, 13);
        }
    }
}
