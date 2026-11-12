package no0;

import ak0.g;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d92.b;
import h4.r;
import l72.x0;
import o4.m1;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tn.k;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(Integer num, Integer num2, String str, String str2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1223631515);
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.B(num2) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            mo0.a aVar = new mo0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strJ = aVar.f119872e.j();
            String strA = aVar.a(num != null ? num.intValue() : Double.NaN);
            String strA2 = aVar.a(num2 != null ? num2.intValue() : Double.NaN);
            o0Var = o0VarE;
            x0.f111346a.e(u1.n.e(r.S, k.b(b.f58623a, o0VarE), m1.f128891a), f.c(-885221598, new g(strA, str, strJ, aVar, num, strA2, str2, num2, 5), o0VarE), o0Var, (x0.f111348c << 6) | 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a(str, i14, str2, num, num2);
        }
    }
}
