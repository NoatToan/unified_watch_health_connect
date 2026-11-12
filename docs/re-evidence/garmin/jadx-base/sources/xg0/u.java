package xg0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static final void a(boolean z14, e23.a<Unit> aVar, wg0.a aVar2, o oVar, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        oVar.getClass();
        o0 o0VarE = mVar.E(14636052);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.B(oVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            i3.u.a(z14, aVar, null, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-1260681137, new s(0, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), aVar, aVar2, oVar), o0VarE), o0VarE, i15 & 126, 48, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(i14, 0, aVar, aVar2, oVar, z14);
        }
    }
}
