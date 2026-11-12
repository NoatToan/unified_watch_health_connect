package ox;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import as.q;
import c2.a0;
import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import gs1.l;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z72.k;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    public static final void a(a0 a0Var, l lVar, m mVar, int i14) {
        int i15;
        Integer bodyBatteryMostRecentValue;
        a0Var.getClass();
        o0 o0VarE = mVar.E(1520765000);
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
            int iIntValue = (lVar == null || (bodyBatteryMostRecentValue = lVar.getBodyBatteryMostRecentValue()) == null) ? -1 : bodyBatteryMostRecentValue.intValue();
            f02.e.f67730a.getClass();
            long jC = f02.e.c(o0VarE);
            r.a aVar = r.S;
            float f14 = SyslogConstants.LOG_LOCAL6;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarQ = x2.q(aVar, f14);
            h4.d.f81522a.getClass();
            r rVarB = a0Var.b(rVarQ, h4.d.a.f81537o);
            i53.f fVarA = i53.a.a(new z72.l(0.25f, jC, null), new z72.l(0.25f, jC, null), new z72.l(0.25f, jC, null), new z72.l(0.25f, jC, null));
            f02.c.f67726a.getClass();
            gl.c.f77766a.getClass();
            k.b(iIntValue / 100.0f, 0.0f, 3.0f, 102236160, SyslogConstants.LOG_LOCAL6, gl.c.a(o0VarE).b(), z3.f.c(2143681550, new q(context, lVar, iIntValue, 5), o0VarE), rVarB, fVarA, o0VarE, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(a0Var, lVar, i14, 1);
        }
    }
}
