package z30;

import ak0.w;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import g02.p1;
import g02.t;
import gl1.y;
import h2.u;
import h4.k;
import h4.r;
import h5.e0;
import i53.f;
import n50.d;
import n50.g;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v.h;
import w52.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    public static final void a(p pVar, g gVar, l lVar, d dVar, l lVar2, m mVar, int i14) {
        d dVar2;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1387459445);
        int i15 = (o0VarE.B(gVar) ? 32 : 16) | i14 | (o0VarE.r(lVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            dVar2 = dVar;
            i15 |= o0VarE.B(dVar2) ? 2048 : 1024;
        } else {
            dVar2 = dVar;
        }
        int i16 = i15 | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            f fVarA = i53.a.a(new p1(y.Q(o0VarE, R.string.lbl_overview), null, null, 6, null), new p1(y.Q(o0VarE, R.string.lbl_details), null, null, 6, null));
            boolean zR = o0VarE.r(fVarA);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new w(fVarA, 7);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w(fVarA, 7);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(0, (e23.a) objQ, o0VarE, 6, 2);
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            pVar.invoke(o0VarE, 6);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            t.a(bVarB, (o53.b0) objQ2, fVarA, null, o0VarE, 0, 8);
            u.a(bVarB, x2.d(aVar2, 1.0f), null, null, 0, 0.0f, h4.d.a.f81533k, null, false, null, null, null, null, z3.f.c(315513758, new qw.b(gVar, lVar, dVar2, lVar2, 17), o0VarE), o0VarE, 1572912, 24576, 16316);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(pVar, gVar, lVar, dVar, lVar2, i14, 11);
        }
    }
}
