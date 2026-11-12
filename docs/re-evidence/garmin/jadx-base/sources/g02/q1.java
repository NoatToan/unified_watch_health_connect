package g02;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 {
    public static final s5.x0 a(s5.x0 x0Var, float f14, p3.m mVar) {
        x0Var.getClass();
        mVar.C(-616584741);
        p3.x1 x1Var = p3.n.f135158a;
        Resources resources = ((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b)).getResources();
        long jH = o53.f0.H(g6.q.d(x0Var.f157322a.fontSize), 4294967296L);
        float f15 = resources.getDisplayMetrics().scaledDensity;
        o53.f0.n(jH);
        float fD = g6.q.d(o53.f0.H(g6.q.d(jH) / f15, 1095216660480L & jH));
        if (resources.getConfiguration().fontScale <= f14) {
            mVar.f();
            return x0Var;
        }
        float f16 = fD * f14 * resources.getDisplayMetrics().density;
        g6.r.f76022b.getClass();
        s5.x0 x0VarA = s5.x0.a(x0Var, 0L, o53.f0.H(f16, g6.r.f76023c), null, null, 0L, null, null, 0, 0L, null, null, 16777213);
        mVar.f();
        return x0VarA;
    }
}
