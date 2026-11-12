package n62;

import b82.w;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import e23.l;
import gl1.y;
import h4.r;
import m52.k;
import o4.m1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.fa;
import vb.h;
import yc.z0;
import z3.f;
import zc.d;
import zc.g;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    public static final void a(String str, d<WorkoutDTO> dVar, l<? super WorkoutDTO, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1108068316);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32 || o0VarE.r(dVar)) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new ls0.h(dVar, 11, str, lVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ls0.h(dVar, 11, str, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(str, dVar, lVar, i14, 6);
        }
    }

    public static final void b(r rVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1845040626);
        int i15 = i14 | 6;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            rVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(rVar, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            b82.n.c(u62.a.a(t62.a.f162797a), y.Q(o0VarE, R.string.lbl_no_workouts), y.Q(o0VarE, R.string.msg_no_workouts), rVarC, null, o0VarE, 0, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 13);
        }
    }

    public static final void c(int i14, e23.a aVar, r rVar, m mVar) {
        r rVar2;
        o0 o0VarE = mVar.E(-608307929);
        int i15 = i14 | 6 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            rVar2 = r.S;
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(rVar2, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            s62.a.f157643a.getClass();
            b82.n.d(fa.a(t62.b.f162798a), y.Q(o0VarE, R.string.lbl_error_occurred), y.Q(o0VarE, R.string.request_error_message), rVarC, y.Q(o0VarE, R.string.lbl_try_again), aVar, null, null, o0VarE, (i15 << 12) & 458752, 192);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(rVar2, aVar, i14, 3);
        }
    }

    public static final void d(c cVar, k kVar, e23.a<Unit> aVar, l<? super WorkoutDTO, Unit> lVar, m mVar, int i14) {
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1929818879);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.k(kVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            d dVarA = g.a(cVar.f123885c, o0VarE);
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            if ((dVarA.d().f196385a instanceof z0.b) && dVarA.b() == 0) {
                z14 = true;
            }
            z02.d.a(z14, f.c(1043075844, new ll1.g(aVar, 16), o0VarE), null, null, null, f.c(-658981624, new li0.y(dVarA, kVar, zL0, lVar), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(cVar, kVar, aVar, lVar, i14, 29);
        }
    }
}
