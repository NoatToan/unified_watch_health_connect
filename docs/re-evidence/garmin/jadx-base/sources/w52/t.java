package w52;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import kotlin.k2;
import kotlin.l2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class t {
    public static final void a(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, m52.d dVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        boolean zU0;
        boolean z15;
        boolean z16;
        String strJ;
        long jD;
        p3.o0 o0VarE = mVar.E(2030243663);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar.f97918c, 0.0f, 2);
            s sVar = new s(0);
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(h4.k.a(rVarA, k2.f91249a, sVar), 1);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (((Boolean) o0VarE.A(l2.f91259a)).booleanValue()) {
                zU0 = true;
            } else {
                o13.t tVar = k52.g.f102952a;
                zU0 = bo1.a.a().c().U0();
            }
            boolean z17 = zU0;
            h4.r rVarD = u1.w.d(aVar2, z14 && zU0, null, null, aVar, 14);
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarD, f14, eVar.f97918c);
            s2 s2VarA2 = q2.a(c0343j, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            if (j0Var.f48221g == null || !z17) {
                o0Var = o0VarE;
                z15 = true;
                o0Var.C(-1757659909);
                o0Var.g0(false);
            } else {
                o0VarE.C(-1758636285);
                if (dVar == m52.d.REST) {
                    z16 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1758346652, R.string.workout_step_type_rest, o0VarE, false);
                } else {
                    z16 = false;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1758254272, R.string.workout_step_type_recovery, o0VarE, false);
                }
                String strG = tn.k.g(gl1.y.P(R.string.lbl_workout_skip_last_step, new Object[]{strJ}, o0VarE), ":");
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97933j;
                s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
                z15 = true;
                mh.c(strG, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131070);
                String strQ = gl1.y.Q(o0VarE, p005kotlin.jvm.internal.s.g(j0Var.f48221g, Boolean.TRUE) ? R.string.lbl_on : R.string.lbl_off);
                fVar2.getClass();
                if (z14) {
                    o0VarE.C(1882961677);
                    jD = d92.b.a(o0VarE).k().a();
                } else {
                    o0VarE.C(1882962576);
                    jD = d92.b.a(o0VarE).k().d();
                }
                o0VarE.g0(z16);
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, jD, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(z16);
            }
            o0Var.g0(z15);
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(j0Var, dVar, z14, aVar, i14, 20);
        }
    }

    public static final void b(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, m52.d dVar, p3.m mVar, int i14) {
        int i15;
        v0Var.getClass();
        j0Var.getClass();
        p3.o0 o0VarE = mVar.E(223841014);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new w11.b(24);
                o0VarE.K(objQ);
            }
            int i16 = i15 >> 3;
            a(j0Var, dVar, false, (e23.a) objQ, o0VarE, com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 | 3456 | (i16 & 14) | (i16 & 112));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l0(v0Var, j0Var, dVar, i14, 25);
        }
    }

    public static final void c(x0 x0Var, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, m52.d dVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        x0Var.getClass();
        j0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(2065728432);
        if ((i14 & 48) == 0) {
            i15 = ((i14 & 64) == 0 ? o0VarE.B(j0Var) : o0VarE.r(j0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1169) != 1168)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 3;
            a(j0Var, dVar, true, aVar, o0VarE, com.garmin.android.apps.connectmobile.workouts.data.model.j0.R0 | 384 | (i16 & 14) | (i16 & 112) | (i15 & 7168));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) x0Var, (Object) j0Var, (Object) dVar, (Object) aVar, i14, 8);
        }
    }
}
