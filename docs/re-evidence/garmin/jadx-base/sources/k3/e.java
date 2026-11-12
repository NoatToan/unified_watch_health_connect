package k3;

import c2.n0;
import c2.n3;
import c2.q;
import c2.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.p;
import f5.g0;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import s1.j1;
import s1.l;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f102509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1<Float> f102510b;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f102509a = 16;
        n0 n0Var = n3.f22788a;
        new n0(0, 0, 0, 0);
        f102510b = l.c(4, 0.9f, 700.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    public static final void a(z3.e eVar, String str, f fVar, p pVar, h4.d.b bVar, p pVar2, m mVar, int i14) {
        int i15;
        f fVar2;
        p pVar3;
        h4.d.b bVar2;
        p pVar4;
        h4.d.b bVar3;
        o0 o0VarE = mVar.E(-262937133);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            fVar2 = fVar;
            i15 |= o0VarE.B(fVar2) ? 256 : 128;
        } else {
            fVar2 = fVar;
        }
        int i16 = i15 | 27648;
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                a.f102486a.getClass();
                pVar4 = a.f102487b;
                b.f102495a.getClass();
                bVar3 = b.f102496b;
            } else {
                o0VarE.e();
                pVar4 = pVar;
                bVar3 = bVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            h4.d.b bVar4 = bVar3;
            p pVar5 = pVar4;
            x3 x3VarB = s1.f.b(fVar2.a() == h.Hidden ? 0.0f : 1.0f, f102510b, null, o0VarE, 48, 28);
            boolean zB = ((i16 & 112) == 32) | o0VarE.B(x3VarB) | ((57344 & i16) == 16384);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new d(str, x3VarB, bVar4);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(str, x3VarB, bVar4);
                    o0VarE.K(objQ);
                }
            }
            z0 z0Var = (z0) objQ;
            r.a aVar = r.S;
            int iP = o0VarE.P();
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar5);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            b4.c(fVar3, rVarC, o0VarE);
            r rVarE = g0.e(aVar, "navigationSuite");
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            int i17 = i16;
            z0 z0VarD = q.d(gVar, false);
            int iP2 = o0VarE.P();
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                v.h.A(iP2, o0VarE, iP2, bVar5);
            }
            b4.c(fVar3, rVarC2, o0VarE);
            u uVar = u.f22885a;
            b71.i.n(i17 & 14, eVar, o0VarE, true);
            r rVarE2 = g0.e(aVar, "primaryActionContent");
            z0 z0VarD2 = q.d(gVar, false);
            int iP3 = o0VarE.P();
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = k.c(rVarE2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                v.h.A(iP3, o0VarE, iP3, bVar5);
            }
            b4.c(fVar3, rVarC3, o0VarE);
            e5.q((i17 >> 9) & 14, pVar5, o0VarE, true);
            r rVarE3 = g0.e(aVar, FirebaseAnalytics.Param.CONTENT);
            z0 z0VarD3 = q.d(gVar, false);
            int iP4 = o0VarE.P();
            i2 i2VarA3 = o0VarE.a0();
            r rVarC4 = k.c(rVarE3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD3, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iP4))) {
                v.h.A(iP4, o0VarE, iP4, bVar5);
            }
            b4.c(fVar3, rVarC4, o0VarE);
            e5.r((i17 >> 15) & 14, pVar2, o0VarE, true, true);
            pVar3 = pVar5;
            bVar2 = bVar4;
        } else {
            o0VarE.e();
            pVar3 = pVar;
            bVar2 = bVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.g0((Object) eVar, str, (Object) fVar, (Object) pVar3, (Object) bVar2, (Object) pVar2, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    public static final void b(z3.e eVar, String str, f fVar, p pVar, m mVar, int i14) {
        f fVar2;
        int i15;
        f fVar3;
        o0 o0VarE = mVar.E(-67066668);
        int i16 = i14 | (o0VarE.B(str != null ? i.a(str) : null) ? 32 : 16) | 128;
        byte b14 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                h hVar = h.Visible;
                x1 x1Var = n.f135158a;
                Object[] objArr = new Object[0];
                g.f102511c.getClass();
                k11.c cVar = new k11.c(b14, 12);
                jy0.b bVar = new jy0.b(15);
                d4.l lVar = d4.m.f57455a;
                d4.l lVar2 = new d4.l(cVar, bVar);
                boolean zK = o0VarE.k(hVar.ordinal());
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new jx0.e(hVar, 6);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new jx0.e(hVar, 6);
                        o0VarE.K(objQ);
                    }
                }
                i15 = i16 & (-897);
                fVar3 = (f) d4.a.c(objArr, lVar2, (e23.a) objQ, o0VarE, 0);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                fVar3 = fVar;
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            a(eVar, str, fVar3, null, null, pVar, o0VarE, (i15 & 1022) | 196608);
            fVar2 = fVar3;
        } else {
            o0VarE.e();
            fVar2 = fVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c((Object) eVar, str, (Object) fVar2, (o13.h) pVar, i14, 8);
        }
    }

    public static final float c(x3 x3Var) {
        return ((Number) x3Var.getF182175a()).floatValue();
    }
}
