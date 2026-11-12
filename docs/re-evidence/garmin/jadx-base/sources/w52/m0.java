package w52;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {
    public static final void a(c62.y0 y0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1559918330);
        int i15 = i14 & 1;
        int i16 = 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(y0Var, i14, i16);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1646775067);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97919d);
            String strQ = gl1.y.Q(o0VarE, R.string.workout_compatible_device_track_version);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 5);
        }
    }
}
