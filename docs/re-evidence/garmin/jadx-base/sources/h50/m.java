package h50;

import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f21.a0;
import gl1.y;
import h2.u;
import h4.r;
import h5.e0;
import i3.qg;
import j23.t;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<i50.i> f82074a = i53.a.a(i50.i.CREATED_BY_YOU, i50.i.FAVORITES);

    public static final void a(e23.l lVar, p3.m mVar, int i14, int i15) {
        o0 o0VarE = mVar.E(1948504649);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(lVar) ? 32 : 16);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            i53.f fVarA = i53.a.a(y.Q(o0VarE, R.string.courses_lbl_my_courses), y.Q(o0VarE, R.string.lbl_favorites));
            i53.f<i50.i> fVar = f82074a;
            int iE = t.e(i14, 0, fVar.size() - 1);
            long jB = tn.k.b(d92.b.f58623a, o0VarE);
            z3.e eVarC = z3.f.c(682188209, new as.e(iE, i17), o0VarE);
            a.f82029a.getClass();
            qg.e(iE, null, jB, 0L, eVarC, a.f82030b, z3.f.c(-796824655, new a0(fVar, iE, lVar, fVarA), o0VarE), o0VarE, 1794048, 10);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new db0.e(i14, lVar, i15);
        }
    }

    public static final void b(i50.g gVar, e23.l lVar, r rVar, p3.m mVar, int i14) {
        i50.i iVar = gVar.f91755i;
        lVar.getClass();
        o0 o0VarE = mVar.E(-158455403);
        int i15 = i14 | (o0VarE.B(gVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            int iIndexOf = f82074a.indexOf(iVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new go1.j(19);
                o0VarE.K(objQ);
            }
            h2.b bVarB = h2.o0.b(iIndexOf, (e23.a) objQ, o0VarE, 384, 2);
            p1 p1VarQ = p0.q(iVar, o0VarE);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zB = o0VarE.B(bVarB) | o0VarE.k(iIndexOf);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new k(bVarB, iIndexOf, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, numValueOf, o0VarE);
            int i16 = i15 & 112;
            boolean zB2 = o0VarE.B(bVarB) | o0VarE.B(p1VarQ) | (i16 == 32);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new l(bVarB, lVar, p1VarQ, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, bVarB, o0VarE);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            int iL = bVarB.l();
            boolean z14 = i16 == 32;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new fb0.d(lVar, 10);
                o0VarE.K(objQ4);
            }
            a((e23.l) objQ4, o0VarE, iL, 0);
            u.a(bVarB, b0Var.a(r.S, 1.0f, true), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-782665460, new ao1.f(13, gVar, lVar), o0VarE), o0VarE, 0, 24576, 16380);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(gVar, lVar, rVar, i14, 2);
        }
    }
}
