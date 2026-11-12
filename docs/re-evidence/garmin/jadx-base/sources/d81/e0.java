package d81;

import b82.g1;
import b82.k1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g81.l0;
import i3.e5;
import m92.p0;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    public static final void a(l0 l0Var, u4.d dVar, int i14, p0 p0Var, e23.l lVar, e23.a aVar, p3.m mVar, int i15) {
        int i16;
        boolean z14;
        Object b0Var;
        h2.b bVar;
        boolean z15;
        lVar.getClass();
        o0 o0VarE = mVar.E(600465373);
        int i17 = i15 | (o0VarE.r(l0Var) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.r(p0Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var2 = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(i14, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new d4.h(5);
                o0VarE.K(objQ3);
            }
            h2.b bVarB = h2.o0.b(i14, (e23.a) objQ3, o0VarE, ((i17 >> 6) & 14) | 384, 2);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var3 = c2.b0.f22601a;
            if (l0Var != null) {
                o0VarE.C(279427769);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarX = x2.x(x2.j(c2.l.y(aVar2, j92.b.f97899b.f97920e), 32, 0.0f, 2), null, 3);
                i53.f fVarA = i53.a.a(new g1(gl1.y.Q(o0VarE, R.string.lbl_time), null, null, null, 14, null), new g1(gl1.y.Q(o0VarE, R.string.lbl_distance), null, null, null, 14, null));
                int intValue = n1Var.getIntValue();
                boolean zR = ((i17 & 57344) == 16384) | o0VarE.r(b0Var2) | o0VarE.B(bVarB);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    bVar = bVarB;
                    z15 = true;
                    b0Var = new b0(lVar, b0Var2, bVar, n1Var, 0);
                    o0VarE.K(b0Var);
                } else {
                    bVar = bVarB;
                    b0Var = objQ4;
                    z15 = true;
                }
                k1.a(fVarA, intValue, rVarX, null, 0.0f, (e23.l) b0Var, o0VarE, 3072, 16);
                boolean z16 = z15;
                h2.b bVar3 = bVar;
                h2.u.a(bVar3, x2.f(aVar2, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-1387958801, new a42.d0((Object) l0Var, (Object) dVar, (Object) p0Var, aVar, 14), o0VarE), o0VarE, 100663344, 24576, 16124);
                o0VarE = o0VarE;
                Integer numValueOf = Integer.valueOf(i14);
                boolean zB = o0VarE.B(bVar3) | ((i17 & 896) == 256 ? z16 : false);
                Object objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    i16 = i14;
                    objQ5 = new d0(bVar3, i16, n1Var, null);
                    o0VarE.K(objQ5);
                } else {
                    i16 = i14;
                }
                p3.l0.e((e23.p) objQ5, numValueOf, o0VarE);
                o0VarE.g0(false);
                z14 = z16;
            } else {
                i16 = i14;
                z14 = true;
                o0VarE.C(281550866);
                h0.a(x2.f(aVar2, 1.0f), dVar, o0VarE, (i17 & 112) | 6);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            i16 = i14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(l0Var, dVar, i16, p0Var, lVar, aVar, i15, 8);
        }
    }
}
