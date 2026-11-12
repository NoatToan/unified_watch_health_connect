package c50;

import ak0.w;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g02.p1;
import g02.t;
import gl1.y;
import h2.u;
import h4.k;
import h4.r;
import h5.e0;
import p005kotlin.Unit;
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

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    public static final void a(e50.h hVar, e50.e eVar, l<? super e50.a, Unit> lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(803494434);
        int i15 = i14 | (o0VarE.B(hVar) ? 4 : 2) | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            i53.f fVarA = i53.a.a(new p1(y.Q(o0VarE, R.string.lbl_overview), null, null, 6, null), new p1(y.Q(o0VarE, R.string.lbl_details), null, null, 6, null));
            boolean zR = o0VarE.r(fVarA);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new w(fVarA, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w(fVarA, 1);
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
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            t.a(bVarB, (o53.b0) objQ2, fVarA, null, o0VarE, 0, 8);
            u.a(bVarB, x2.d(aVar2, 1.0f), null, null, 0, 0.0f, h4.d.a.f81533k, null, false, null, null, null, null, z3.f.c(-607607207, new aa2.r(5, lVar, hVar, eVar), o0VarE), o0VarE, 1572912, 24576, 16316);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(hVar, eVar, lVar, i14, 28);
        }
    }
}
