package vz1;

import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import o53.b0;
import p3.o0;
import p3.p2;
import p3.x1;
import t21.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(oz1.b bVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        b0Var.getClass();
        o0 o0VarE = mVar.E(1134577466);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(mcVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(b0Var) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            i.a(R.string.recent_dives, mcVar, b0Var, null, null, z3.f.c(1105036855, new vy0.e(bVar, 1), o0VarE), o0VarE, (i15 & 112) | 224256 | (i15 & 896));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(bVar, mcVar, b0Var, i14, 22);
        }
    }
}
