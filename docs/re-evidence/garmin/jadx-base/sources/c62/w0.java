package c62;

import c2.x2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import i3.ve;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc62/w0;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/e;", "Lc62/t;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements r52.b<com.garmin.android.apps.connectmobile.workouts.presentation.details.e, t> {
    public final void b(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-2102914562);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.f0 f0Var = l72.f0.f110999a;
            z3.e eVarC = z3.f.c(-1230775289, new an1.i(z14, 8), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.do_workout);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f0Var.e(eVarC, strQ, c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), false, aVar, o0VarE, ((i15 << 9) & 57344) | 6, 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(this, z14, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    @Override // r52.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(t tVar, com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        tVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-83448775);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            q13.b bVarB = p13.w.b();
            boolean zB = s3.b();
            com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g = eVar.getF48583g();
            f48583g.getClass();
            boolean z15 = (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) || (f48583g instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c);
            boolean z16 = eVar.getF48577a().f48044e != m52.k.A;
            WorkoutDetailsDTO f48577a = eVar.getF48577a();
            if (g22.n.d(f48577a.K0)) {
                Integer num = f48577a.L0;
                if (num == null || num.intValue() < 0) {
                    num = null;
                }
                if (num == null || f48577a.M() == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            boolean zI = eVar.getF48577a().I();
            boolean z17 = z14 || zI || eVar.getF48577a().D() || eVar.getF48577a().G();
            boolean z18 = z15 && (zI || (z14 && p13.x.k(m52.k.f116756p, m52.k.f116757q, m52.k.f116759t).contains(eVar.getF48577a().f48044e)));
            if (eVar.l().f24690a && eVar.l().f24691b == -1) {
                bVarB.add(new a.b(!z15, new u0(tVar)));
            }
            boolean zA = eVar.getF48583g().a();
            boolean zB2 = eVar.getF48583g().b();
            com.garmin.android.apps.connectmobile.workouts.data.model.y f48583g2 = eVar.getF48583g();
            f48583g2.getClass();
            boolean z19 = !(f48583g2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.a) ? !(f48583g2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.y.c) || ((com.garmin.android.apps.connectmobile.workouts.data.model.y.c) f48583g2).f48355a.isEmpty() : ((com.garmin.android.apps.connectmobile.workouts.data.model.y.a) f48583g2).f48350a.isEmpty();
            boolean z24 = !zB && (zA || zB2);
            if (!z17) {
                z18 = z15 && z16;
            }
            if (z24 && z18 && z19) {
                bVarB.add(new a.C0355a(!zA, new v0(tVar)));
            }
            q13.b bVarA = p13.w.a(bVarB);
            if (bVarA.isEmpty()) {
                o0VarE.C(764299785);
                o0VarE.g0(false);
            } else {
                o0VarE.C(763771235);
                g6.f.a aVar = g6.f.f75994b;
                ve.a(c2.l.s(x2.f(h4.r.S, 1.0f)), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 8, null, z3.f.c(-1163710993, new c42.c0(3, bVarA, this), o0VarE), o0VarE, 12779520, 90);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(this, tVar, eVar, i14, 12);
        }
    }

    public final void d(a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(467504133);
        int i15 = 4;
        int i16 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.B(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (aVar instanceof a.b) {
                o0VarE.C(-1700090375);
                a.b bVar = (a.b) aVar;
                e(bVar.f24654a, bVar.f24655b, o0VarE, (i16 << 3) & 896);
                o0VarE.g0(false);
            } else {
                if (!(aVar instanceof a.C0355a)) {
                    throw kg.f.h(o0VarE, -1700092108, false);
                }
                o0VarE.C(-1700085081);
                a.C0355a c0355a = (a.C0355a) aVar;
                b(c0355a.f24652a, c0355a.f24653b, o0VarE, (i16 << 3) & 896);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.c0(this, aVar, i14, i15);
        }
    }

    public final void e(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(59847077);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(492939851);
                o0Var = o0VarE;
                l72.f0.f110999a.d(((i15 << 9) & 57344) | 384, 9, aVar, x2.f(h4.r.S, 1.0f), gl1.y.Q(o0Var, R.string.btn_save_msn_workout), o0Var, null, false);
                o0Var.g0(false);
            } else {
                o0VarE.C(493154185);
                l72.f0.f110999a.i(gl1.y.Q(o0VarE, R.string.btn_save_msn_workout), x2.f(h4.r.S, 1.0f), false, aVar, o0VarE, ((i15 << 6) & 7168) | 48, 4);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(this, z14, aVar, i14, 1);
        }
    }
}
