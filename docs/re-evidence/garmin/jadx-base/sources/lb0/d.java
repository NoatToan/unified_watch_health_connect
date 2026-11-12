package lb0;

import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import j21.p;
import k2.h;
import l72.t;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import v62.e1;
import wz1.i;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    public static final void a(String str, boolean z14, String str2, e23.a aVar, h hVar, m mVar, int i14) {
        long jB;
        long jA;
        aVar.getClass();
        o0 o0VarE = mVar.E(1546405040);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.B(hVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarF = x2.f(i.e(aVar2, !str.equals("not_set"), new p(str, 8), o0VarE, 6), 1.0f);
            if (z14) {
                o0VarE.C(36573688);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(36574872);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            r rVarE = u1.n.e(rVarF, jB, hVar);
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new t(aVar, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = l.y(rVarD, eVar.f97920e);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 6) & 14, 0, 131070);
            o0VarE = o0VarE;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            bVar.getClass();
            r rVarC2 = u2Var.c(l.C(aVar2, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), h4.d.a.f81534l);
            if (z14) {
                o0VarE.C(-981783750);
                jA = d92.b.a(o0VarE).f().a();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-981783169);
                o0VarE.g0(false);
                d0.f128823b.getClass();
                jA = d0.f128831j;
            }
            i7.b(dVarA, null, rVarC2, jA, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(str, z14, str2, aVar, hVar, i14);
        }
    }
}
