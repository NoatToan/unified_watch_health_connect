package tp1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import g6.f;
import gl1.y;
import m92.o;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import sg2.g;
import xp1.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f165939a;

    static {
        f.a aVar = f.f75994b;
        f165939a = 380;
    }

    public static final void a(b bVar, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(1584904787);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new sp1.a(customLineChart);
                o0VarE.K(objQ2);
            }
            sp1.a aVar = (sp1.a) objQ2;
            String strQ = y.Q(o0VarE, R.string.msg_no_data_available);
            o.a(null, null, null, bVar == null ? strQ : null, z3.f.c(-1350040109, new g(lVar, customLineChart, aVar, bVar, strQ, 14), o0VarE), null, null, o0VarE, 24576, 103);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(bVar, lVar, i14, 17);
        }
    }
}
