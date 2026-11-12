package rn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import l72.x0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(mm1.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1590998150);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            b10.d dVar = new b10.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            if (aVar != null) {
                o0VarE.C(-1832997386);
                x0.f111346a.e(null, z3.f.c(-879252206, new o72.b(27, aVar, dVar), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 1);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1832007556);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.n(aVar, i14, 1);
        }
    }
}
