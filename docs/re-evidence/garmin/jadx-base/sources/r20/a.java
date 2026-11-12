package r20;

import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final void a(r rVar, m mVar, int i14) {
        o0 o0Var;
        rVar.getClass();
        o0 o0VarE = mVar.E(-111291486);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarThen = x2.f(aVar, 1.0f).then(rVar);
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97916a;
            bVar2.getClass();
            l.f(u1.n.e(x2.r(aVar, f14, eVar.f97920e), am.j.d(o0VarE), m1.f128891a), o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_course_demands);
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar2.getClass();
            mh.c(strQ, l.y(aVar, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 14);
        }
    }
}
