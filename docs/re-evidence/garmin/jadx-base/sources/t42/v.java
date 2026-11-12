package t42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e2.i0;
import e2.k0;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import o53.b0;
import org.joda.time.DateTime;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import q42.f0;
import q42.g0;
import q42.y;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y yVar, DateTime dateTime, DateTime dateTime2, g0 g0Var, p3.m mVar, int i14) {
        o0 o0Var;
        CustomCombinedChart customCombinedChart;
        yVar.getClass();
        o0 o0VarE = mVar.E(1040657982);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(yVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(g0Var) : o0VarE.r(g0Var) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            l42.d dVar = ((f0) s9.c.c(yVar.f142756l, o0VarE).getF182175a()).f142639e;
            k42.b bVar = k42.b.f102880a;
            l42.e eVar = g0Var.f142643a;
            l42.g weightAverageDto = eVar != null ? eVar.getWeightAverageDto() : null;
            bVar.getClass();
            List<l42.d> listK = k42.b.k(weightAverageDto);
            Context context2 = (Context) o0VarE.A(y3Var);
            ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
            for (l42.d dVar2 : listK) {
                String string = context2.getString(dVar2.f109936b);
                string.getClass();
                arrayList.add(new j0(string, null, null, false, dVar2 == dVar, 14, null));
            }
            i53.c cVarE = i53.a.e(arrayList);
            zk0.g gVar = g0Var.f142644b;
            l42.e eVar2 = g0Var.f142643a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomCombinedChart(context);
                o0VarE.K(objQ);
            }
            CustomCombinedChart customCombinedChart2 = (CustomCombinedChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                s42.g gVar2 = new s42.g(context, dateTime, dateTime2);
                s42.b bVar2 = new s42.b(customCombinedChart2, false);
                k42.b.f102880a.getClass();
                objQ2 = new sz.a(customCombinedChart2, gVar2, bVar2, k42.b.r() ? new k00.l(customCombinedChart2) : null, new k00.g(customCombinedChart2), null, 32, null);
                customCombinedChart = customCombinedChart2;
                o0VarE.K(objQ2);
            } else {
                customCombinedChart = customCombinedChart2;
            }
            sz.a aVar = (sz.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0 b0Var = (b0) objQ3;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            boolean zK = o0VarE.k(dVar.ordinal()) | o0VarE.r(b0Var) | o0VarE.r(listK) | o0VarE.B(i0VarA) | o0VarE.r(yVar);
            Object objQ4 = o0VarE.q();
            if (zK || objQ4 == c2565a) {
                u uVar = new u(b0Var, listK, dVar, i0VarA, yVar, null);
                o0VarE.K(uVar);
                objQ4 = uVar;
            }
            l0.f(dVar, listK, (e23.p) objQ4, o0VarE);
            o0Var = o0VarE;
            m92.o.a(null, null, null, null, z3.f.c(-1205742914, new oy0.b(customCombinedChart, aVar, eVar2, dVar, gVar, context, 28), o0VarE), z3.f.c(-34534243, new k(cVarE, i0VarA, yVar, listK, 1), o0VarE), null, o0Var, 221184, 79);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(yVar, dateTime, dateTime2, g0Var, i14, 24);
        }
    }
}
