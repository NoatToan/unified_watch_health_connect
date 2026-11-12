package bt1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static final void a(h4.r rVar, u uVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        e23.l lVar2;
        e23.l lVar3;
        uVar.getClass();
        o0 o0VarE = mVar.E(145357788);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(uVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | 3072;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b71.o(25);
                    o0VarE.K(objQ);
                }
                lVar3 = (e23.l) objQ;
            } else {
                o0VarE.e();
                lVar3 = lVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            l3.a aVar2 = l3.f23124b;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            aVar2.getClass();
            String strE1 = l3.a.E1(context, z14, true);
            Context context2 = (Context) o0VarE.A(y3Var);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new b71.o(26);
                o0VarE.K(objQ2);
            }
            String strA = oi0.c.A(context2, (e23.l) objQ2, strE1);
            String strQ = y.Q(o0VarE, R.string.lbl_distance);
            String strP = y.P(R.string.trail_filter_min_distance_metric, new Object[]{strE1}, o0VarE);
            String strP2 = y.P(R.string.trail_filter_min_distance_metric, new Object[]{strA}, o0VarE);
            String strP3 = y.P(R.string.trail_filter_max_distance_metric, new Object[]{strE1}, o0VarE);
            String strP4 = y.P(R.string.trail_filter_max_distance_metric, new Object[]{strA}, o0VarE);
            boolean z15 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new d(lVar3, uVar, i16);
                o0VarE.K(objQ3);
            }
            r.a(rVar, uVar, strQ, strP, strP2, strP3, strP4, (e23.a) objQ3, o0VarE, i15 & 126);
            lVar2 = lVar3;
        } else {
            o0VarE.e();
            lVar2 = lVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(rVar, uVar, z14, lVar2, i14, 0);
        }
    }

    public static final String b(float f14, Context context, boolean z14) {
        double d14 = f14;
        l3.f23124b.getClass();
        double d15 = d14 * (z14 ? 1000.0d : 1609.344d);
        l3.f23124b.getClass();
        return l3.a.Q(context, d15, l3.f23131i, false, z14);
    }
}
