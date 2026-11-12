package xe1;

import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import l72.x0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(float f14, float f15, m mVar, int i14) {
        o0 o0VarE = mVar.E(-911910614);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14 | (o0VarE.k(R.string.avg_running_economy) ? 32 : 16) | (o0VarE.i(f15) ? 256 : 128) | (o0VarE.k(R.string.best_running_economy) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            x0 x0Var = x0.f111346a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f16 = eVar.f97918c;
            bVar.getClass();
            float f17 = eVar.f97920e;
            bVar.getClass();
            float f18 = eVar.f97921f;
            bVar.getClass();
            x0Var.e(l.B(rVarF, f16, f18, f17, eVar.f97918c), z3.f.c(1314694019, new g02.e(f14, f15, 3), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m72.a(f14, f15, i14);
        }
    }
}
