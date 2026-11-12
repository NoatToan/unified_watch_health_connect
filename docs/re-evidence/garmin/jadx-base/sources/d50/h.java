package d50;

import c2.q;
import c2.u;
import c2.x2;
import c42.c0;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.w;
import v62.c6;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e50.c cVar, e23.l<? super e50.a, Unit> lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-1440639410);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            s62.a.f157643a.getClass();
            u4.d dVarA = c6.a(t62.b.f162798a);
            String strQ = y.Q(o0VarE, R.string.lbl_settings);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new cw1.k(p1Var, 16);
                o0VarE.K(objQ2);
            }
            i7.b(dVarA, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), hb.a.e(o0VarE), o0VarE, 0, 0);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            long jG = d92.b.a(o0VarE).c().g();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new cw1.k(p1Var, 17);
                o0VarE.K(objQ3);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(-227361853, new a42.a(15, lVar, cVar, p1Var), o0VarE), o0VarE, 48, 48, 1916);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(cVar, lVar, i14, 27);
        }
    }
}
