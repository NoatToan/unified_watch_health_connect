package n40;

import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.u;
import l72.p2;
import mz1.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static final void a(com.garmin.android.apps.connectmobile.courses.model.c cVar, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.c, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(680621886);
        int i16 = (o0VarE.k(cVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_climb_surface);
            String strQ2 = y.Q(o0VarE, cVar.f32838b);
            z3.e eVarC = z3.f.c(-687258773, new b(cVar, lVar), o0VarE);
            o0Var = o0VarE;
            i15 = 1;
            p2Var.h(strQ, strQ2, null, null, null, false, false, null, eVarC, null, null, o0Var, 100663296, 0, 1788);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(cVar, lVar, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.garmin.android.apps.connectmobile.courses.model.c cVar, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.c, Unit> lVar, p3.m mVar, int i14) {
        char c14;
        o0 o0VarE = mVar.E(332828018);
        int i15 = (o0VarE.k(cVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d0(13);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            b3.b.a aVar3 = b3.b.a.f15503a;
            u4.d dVarA = d3.c.a();
            String strQ = y.Q(o0VarE, R.string.lbl_more);
            long jD = ds.e0.d(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
            boolean zB = o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n02.c(p1Var, 1);
                o0VarE.K(objQ2);
            }
            i7.b(dVarA, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), jD, o0VarE, 0, 0);
            Object[] objArr2 = {cVar};
            boolean z14 = (i15 & 14) == 4;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new mh1.i(cVar, 21);
                o0VarE.K(objQ3);
            }
            n1 n1Var = (n1) d4.a.e(objArr2, (e23.a) objQ3, o0VarE, 0);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                c14 = 2;
                objQ4 = new n02.c(p1Var, 2);
                o0VarE.K(objQ4);
            } else {
                c14 = 2;
            }
            u.a(zBooleanValue, (e23.a) objQ4, u1.n.e(aVar, v.h.t(o0VarE), m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(636018509, new gw1.e(n1Var, 27, lVar, p1Var), o0VarE), o0VarE, 0, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(cVar, lVar, i14, 2);
        }
    }
}
