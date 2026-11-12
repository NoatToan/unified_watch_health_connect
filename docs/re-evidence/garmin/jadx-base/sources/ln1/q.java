package ln1;

import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import o53.b0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final void a(km1.c cVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        cVar.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(-850167847);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
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
            kn1.e.a(R.string.sleep_lbl_rem, mcVar, b0Var, z3.f.c(228805690, new f(cVar, 17), o0VarE), z3.f.c(1483587707, new f(cVar, 18), o0VarE), o0VarE, (i15 & 112) | 27648 | (i15 & 896), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(cVar, mcVar, b0Var, i14, 5);
        }
    }
}
