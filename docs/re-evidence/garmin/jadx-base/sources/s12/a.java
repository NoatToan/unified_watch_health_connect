package s12;

import android.annotation.SuppressLint;
import h4.r;
import li0.d0;
import li0.z;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import rx1.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(d0 d0Var, li0.f fVar, @SuppressLint({"ModifierParameter"}) r rVar, p3.m mVar, int i14) {
        int i15;
        fVar.getClass();
        o0 o0VarE = mVar.E(476279025);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(false) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            v.a(z.f112889a.c(new f()), z3.f.c(-1057786447, new u(d0Var, 1, fVar, rVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.b(d0Var, fVar, rVar, i14, 3);
        }
    }
}
