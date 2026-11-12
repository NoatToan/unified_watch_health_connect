package ku1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(r rVar, p3.m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        o0 o0VarE = mVar.E(629018674);
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            r.a aVar = r.S;
            x1 x1Var = p3.n.f135158a;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(rVarE, eVar.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarC2 = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar.f97918c, 5);
            String strQ = gl1.y.Q(o0VarE, R.string.badges_lbl_congratulations);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            bVar.getClass();
            r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            String strQ2 = gl1.y.Q(o0VarE, R.string.training_plan_completed_message);
            fVar.getClass();
            mh.c(strQ2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 11);
        }
    }
}
