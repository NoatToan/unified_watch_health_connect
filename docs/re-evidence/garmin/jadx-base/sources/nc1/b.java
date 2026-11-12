package nc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import l72.x0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(double d14, m mVar, int i14) {
        String string;
        o0 o0VarE = mVar.E(-76962265);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new gc1.a(context);
                o0VarE.K(objQ);
            }
            gc1.a aVar = (gc1.a) objQ;
            if (d14 > 0.0d) {
                aVar.getClass();
                string = String.valueOf((int) d14);
            } else {
                string = aVar.f76926b.getString(R.string.no_value_card);
            }
            String str = string;
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(l.y(aVar2, j92.b.f97899b.f97920e), f.c(137976174, new a(str, aVar, d14, 0), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k82.b(i14, 1, d14);
        }
    }
}
