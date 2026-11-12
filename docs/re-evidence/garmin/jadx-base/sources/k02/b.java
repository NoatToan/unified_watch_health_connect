package k02;

import b82.f0;
import c2.q;
import c2.u;
import e23.l;
import f2.r;
import f5.z0;
import h4.k;
import h4.p;
import h5.e0;
import o4.s0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, d dVar, int i14, h4.r rVar2, z3.e eVar, m mVar, int i15) {
        int i16;
        h4.r rVarB;
        rVar.getClass();
        dVar.getClass();
        o0 o0VarE = mVar.E(-801110560);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        int i17 = 0;
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Integer num = (Integer) dVar.f102109d.getF182175a();
            boolean z14 = num != null && i14 == num.intValue();
            m.a aVar = m.f135153a;
            if (z14) {
                o0VarE.C(1248901529);
                h4.r rVarB2 = p.b(h4.r.S, 1.0f);
                boolean zR = o0VarE.r(dVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new a(dVar, i17);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a(dVar, i17);
                        o0VarE.K(objQ);
                    }
                }
                rVarB = s0.a(rVarB2, (l) objQ);
                o0VarE.g0(false);
            } else {
                Integer num2 = (Integer) dVar.f102113h.getF182175a();
                if (num2 != null && i14 == num2.intValue()) {
                    o0VarE.C(1249232237);
                    h4.r rVarB3 = p.b(h4.r.S, 1.0f);
                    boolean zR2 = o0VarE.r(dVar);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        objQ2 = new a(dVar, i18);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new a(dVar, i18);
                            o0VarE.K(objQ2);
                        }
                    }
                    rVarB = s0.a(rVarB3, (l) objQ2);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1249505812);
                    o0VarE.g0(false);
                    rVarB = r.b(rVar, h4.r.S);
                }
            }
            h4.r rVarThen = rVar2.then(rVarB);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarThen, o0VarE);
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
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u.f22885a, Boolean.valueOf(z14), o0VarE, Integer.valueOf(((i16 >> 6) & 896) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, dVar, i14, rVar2, eVar, i15);
        }
    }
}
