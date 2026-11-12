package t21;

import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-51025784);
        int i15 = (o0VarE.k(2131232847) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            t4.d dVarA = n5.c.a(2131232847, o0VarE, i15 & 14);
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            h4.r.a aVar2 = h4.r.S;
            u1.y0.a(dVarA, null, x2.d(aVar2, 1.0f), null, c1427a, 0.0f, null, o0VarE, 25008, 104);
            c2.q.a(u1.n.d(uVar.d(aVar2), o4.w.a.i(o4.w.f129023a, p13.x.k(o4.d0.a(o4.d0.c(0.0f, o4.f0.d(4284900966L), 14)), o4.d0.a(o4.d0.c(0.6f, o4.f0.d(4278190080L), 14)), o4.d0.a(o4.d0.c(0.6f, o4.f0.d(4278190080L), 14))), 0.0f, 14), null, 6), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 21);
        }
    }

    public static final void b(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        p3.o0 o0VarE = mVar.E(1371772882);
        int i19 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.k(2131232847) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i19 & 1, (i19 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                i15 = -281214178;
                i16 = R.string.lbl_update_complete;
            } else {
                i15 = -281212560;
                i16 = R.string.safety_features_wizard_setup_complete;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            if (z14) {
                i17 = -281209147;
                i18 = R.string.msg_nutrition_plan_updated;
            } else {
                i17 = -281207320;
                i18 = R.string.msg_nutrition_setup_completed;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new f(11);
                o0VarE.K(objQ);
            }
            c.w.a(54, 0, (e23.a) objQ, o0VarE, true);
            j.f161905a.getClass();
            z3.e eVar = j.f161906b;
            g6.f.a aVar2 = g6.f.f75994b;
            z02.d.a(false, eVar, null, null, n3.b(0.0f, 0.0f, 0.0f, 0, 7), z3.f.c(118360923, new af1.a(strJ, strJ2, aVar), o0VarE), o0VarE, 196656, 13);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e(i14, 20, aVar, z14);
        }
    }
}
