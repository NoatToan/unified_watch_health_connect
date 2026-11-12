package ox;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import gs1.l;
import kotlin.t1;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    public static final void a(a0 a0Var, l lVar, m mVar, int i14) {
        int i15;
        Integer bodyBatteryLowestValue;
        Integer bodyBatteryHighestValue;
        a0Var.getClass();
        o0 o0VarE = mVar.E(1803826322);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int iIntValue = -1;
            int iIntValue2 = (lVar == null || (bodyBatteryHighestValue = lVar.getBodyBatteryHighestValue()) == null) ? -1 : bodyBatteryHighestValue.intValue();
            if (lVar != null && (bodyBatteryLowestValue = lVar.getBodyBatteryLowestValue()) != null) {
                iIntValue = bodyBatteryLowestValue.intValue();
            }
            y3 y3Var = t1.f91490h;
            v.a(y3Var.c(new g6.d(((g6.c) o0VarE.A(y3Var)).getF75991a(), 1.0f)), z3.f.c(98981842, new ba2.f(a0Var, iIntValue2, iIntValue, context), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(a0Var, lVar, i14, 0);
        }
    }
}
