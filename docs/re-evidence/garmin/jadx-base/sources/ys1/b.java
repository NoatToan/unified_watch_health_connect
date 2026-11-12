package ys1;

import am.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.h7;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
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

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:64:0x0199  */
    public static final void a(r rVar, String str, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        String str2;
        int i17;
        r rVar3;
        String str3;
        int i18;
        boolean z14;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1858475513);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 != 0) {
            i17 = i16 | 48;
            str2 = str;
        } else {
            str2 = str;
            i17 = i16 | (o0VarE.B(str2) ? 32 : 16);
        }
        int i25 = i17 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i25 & 1, (i25 & 147) != 146)) {
            r rVar4 = i19 != 0 ? r.S : rVar2;
            String str4 = i24 != 0 ? null : str2;
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar4, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            m.a aVar3 = m.f135153a;
            if (str4 == null) {
                o0VarE.C(-2057462037);
                o0VarE.g0(false);
                i18 = 256;
                z14 = false;
            } else {
                o0VarE.C(-2057462036);
                r rVarC2 = uVar.c(u1.n.e(x2.f(r.S, 1.0f), j.c(d92.b.f58623a, o0VarE), m1.f128891a), h4.d.a.f81527e);
                d92.b.f58625c.getClass();
                r rVarY = l.y(rVarC2, j92.b.f97899b.f97920e);
                Object objQ = o0VarE.q();
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new yq.d(2);
                    o0VarE.K(objQ);
                }
                r rVarC3 = v.c((e23.l) objQ, rVarY, false);
                d92.b.f58624b.getClass();
                i18 = 256;
                z14 = false;
                mh.c(str4, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, (i25 >> 3) & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            boolean z15 = (i25 & 896) == i18 ? true : z14;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ya0.l(aVar, 25);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ya0.l(aVar, 25);
                    o0VarE.K(objQ2);
                }
            }
            r rVarC4 = uVar.c(r.S, h4.d.a.f81529g);
            c.f199165a.getClass();
            h7.a((e23.a) objQ2, rVarC4, false, null, null, c.f199166b, o0VarE, 1572864, 60);
            o0VarE.g0(true);
            str3 = str4;
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            str3 = str2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zr.f(rVar3, str3, aVar, i14, i15, 1);
        }
    }
}
