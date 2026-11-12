package w52;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static final void a(com.garmin.android.apps.connectmobile.workouts.presentation.edit.j jVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-495930194);
        int i15 = i14 & 1;
        int i16 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            c(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(jVar, i14, i16);
        }
    }

    public static final void b(v0 v0Var, p3.m mVar, int i14) {
        v0Var.getClass();
        p3.o0 o0VarE = mVar.E(2138691124);
        int i15 = i14 & 1;
        int i16 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            c(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(v0Var, i14, i16);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        p3.o0 o0Var;
        int i15;
        p3.o0 o0VarE = mVar.E(1112220627);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_implicit_consent_workout);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            o0Var = o0VarE;
            i15 = 1;
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            i15 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, i15);
        }
    }
}
