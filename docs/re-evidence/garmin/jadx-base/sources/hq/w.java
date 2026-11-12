package hq;

import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class w {
    public static final void a(h4.r rVar, List list, List list2, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-78789470);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(list2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ha0.b(29);
                o0VarE.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(list) | o0VarE.r(list2);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ad0.f(list, list2, z14, 9);
                o0VarE.K(objQ2);
            }
            p002j6.c.b(lVar, rVar, (e23.l) objQ2, o0VarE, ((i15 << 3) & 112) | 6, 0);
            if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
                o0VarE.C(-1653824517);
                h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81528f);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_muscles_targeted);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1653558010);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(rVar, list, list2, z14, i14, 17);
        }
    }
}
