package ku1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.LinkedHashMap;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(o oVar, LinkedHashMap linkedHashMap, p3.m mVar, int i14) {
        oVar.getClass();
        o0 o0VarE = mVar.E(-435165133);
        int i15 = i14 | (o0VarE.r(linkedHashMap) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            String strB = g22.n.b(gl1.y.Q(o0VarE, R.string.lbl_completed_activities));
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strB, c2.l.y(aVar, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (linkedHashMap.isEmpty()) {
                o0VarE.C(1348461419);
                r rVarF2 = x2.f(aVar, 1.0f);
                u4.d dVarA = oVar.a();
                bVar2.getClass();
                float f14 = j92.b.f97901d.f97907f;
                bVar2.getClass();
                cv1.b.a(rVarF2, dVarA, f14, eVar.f97920e, 0, 0, o0VarE, 6, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1348768567);
                o0VarE.C(-372132284);
                for (String str : linkedHashMap.keySet()) {
                    r rVarF3 = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    cv1.m.a(c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97917b, 7), str, z3.f.c(1673177745, new k41.e(20, str, (Object) linkedHashMap), o0VarE), o0VarE, 384);
                }
                o0VarE.g0(false);
                r rVarF4 = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(rVarF4, j92.b.f97899b.f97920e), o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            linkedHashMap = linkedHashMap;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(oVar, linkedHashMap, i14, 21);
        }
    }
}
