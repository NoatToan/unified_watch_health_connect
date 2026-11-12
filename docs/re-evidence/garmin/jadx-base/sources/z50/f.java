package z50;

import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.mh;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        e23.a<Unit> aVar3 = aVar2;
        o0 o0VarP = fb1.c.p(aVar, aVar3, mVar, -702728491);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar3) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar4 = r.S;
            r rVarB = a2.b(aVar4, a2.a(o0VarP), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = h4.k.c(rVarB, o0VarP);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar5);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarP, R.string.msg_drawing_method_description);
            r rVarF = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarF, j92.b.f97899b.f97921f);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, o0VarP), o0VarP, 0, 0, 130044);
            o0VarP = o0VarP;
            p2 p2Var = p2.f111205a;
            String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_custom);
            String strQ3 = gl1.y.Q(o0VarP, R.string.msg_custom_course_description);
            a.f202446a.getClass();
            p2Var.h(strQ2, strQ3, null, null, null, false, false, a.f202447b, null, null, aVar, o0VarP, 12582912, i15 & 14, 892);
            p2Var.h(gl1.y.Q(o0VarP, R.string.lbl_automatic), gl1.y.Q(o0VarP, R.string.msg_round_trip_description), null, null, null, false, false, a.f202448c, null, null, aVar2, o0VarP, 12582912, (i15 >> 3) & 14, 892);
            aVar3 = aVar2;
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar3, i14, 25);
        }
    }
}
