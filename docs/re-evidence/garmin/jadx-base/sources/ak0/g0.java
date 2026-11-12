package ak0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import l72.u0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 {
    public static final void a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.c cVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-416612061);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarD, j92.b.f97899b.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h4.r rVarB = c2.b0.f22601a.b(c2.l.D(aVar2), h4.d.a.f81538p);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new a81.m(24);
                o0VarE.K(objQ);
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarB, false);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_close);
            boolean z14 = (i15 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a03.e(cVar, 11);
                o0VarE.K(objQ2);
            }
            u0.a(rVarC2, null, strQ, null, (e23.a) objQ2, o0VarE, 0, 10);
            h4.r rVarX = x2.x(aVar2, h4.d.a.f81533k, 2);
            u4.d.b bVar2 = u4.d.f168373k;
            b82.n.c(n5.e.b(R.drawable.gcplus_logo, o0VarE, 6), gl1.y.Q(o0VarE, R.string.lbl_gc_plus_not_supported), gl1.y.Q(o0VarE, R.string.msg_gc_plus_not_supported), rVarX, null, o0VarE, 3072, 16);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a61.d(cVar, i14, 2);
        }
    }
}
