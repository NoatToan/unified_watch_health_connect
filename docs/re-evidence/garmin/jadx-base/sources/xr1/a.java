package xr1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import di0.h;
import gl1.y;
import h4.r;
import l72.x0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import tn.k;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(Integer num, m mVar, int i14) {
        o0 o0VarE = mVar.E(1704486948);
        int i15 = (o0VarE.B(num) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            qr1.a aVar = new qr1.a((Context) o0VarE.A(y3Var));
            String strQ = y.Q(o0VarE, R.string.no_value);
            if (num != null && num.intValue() > 0) {
                int iIntValue = num.intValue();
                l3.f23124b.getClass();
                strQ = l3.f23131i.format(iIntValue);
                if (strQ == null) {
                    strQ = aVar.f146893b;
                }
            }
            String strQ2 = y.Q(o0VarE, R.string.lbl_avg_stress_level);
            String str = strQ + StringUtils.SPACE + strQ2 + StringSubstitutor.DEFAULT_VAR_END;
            context.getClass();
            String strA = oi0.c.A(context, new qc.c(26), str);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", strA);
            b92.a aVarB = c0235a.b();
            x0 x0Var = x0.f111346a;
            r rVarE = u1.n.e(r.S, k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            x0Var.e(l.y(rVarE, j92.b.f97899b.f97920e), f.c(-288839363, new h(aVarB, strQ, strQ2), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.f(num, i14, 4);
        }
    }
}
