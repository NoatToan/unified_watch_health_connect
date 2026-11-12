package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import gl1.y;
import java.util.ArrayList;
import java.util.List;
import m92.o;
import org.joda.time.LocalDate;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jq1.d dVar, LocalDate localDate, LocalDate localDate2, o82.g gVar, p3.m mVar, int i14) {
        LocalDate localDate3;
        LocalDate localDate4;
        o82.g gVar2;
        ArrayList arrayList;
        List<jq1.e> list;
        gVar.getClass();
        o0 o0VarE = mVar.E(-722591264);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            localDate3 = localDate;
            i15 |= o0VarE.r(localDate3) ? 32 : 16;
        } else {
            localDate3 = localDate;
        }
        if ((i14 & 384) == 0) {
            localDate4 = localDate2;
            i15 |= o0VarE.r(localDate4) ? 256 : 128;
        } else {
            localDate4 = localDate2;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (dVar == null || (list = dVar.f99993a) == null) {
                arrayList = null;
            } else {
                List<Long> list2 = pq1.i.f139597a;
                ArrayList arrayList2 = new ArrayList();
                for (jq1.e eVar : list) {
                    String str = eVar.f99995a;
                    LocalDate localDateV = str != null ? g22.k.v(str, "yyyy-MM-dd") : null;
                    jq1.e.d dVar2 = eVar.f99996b;
                    arrayList2.add(new wq1.a(localDateV, dVar2 != null ? dVar2.f99998a : null, dVar2 != null ? dVar2.f100000c : null));
                }
                arrayList = arrayList2;
            }
            wq1.b bVar = new wq1.b(localDate3, localDate4, arrayList, null, 8, null);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(new CustomBarChart(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new rz.a((CustomBarChart) p1Var.getF182175a(), new uq1.a(context, new pq1.d(context), new pi0.e(context), bVar.f186625a, bVar.f186626b), new uq1.b((CustomBarChart) p1Var.getF182175a(), bVar.f186625a, bVar.f186626b), new uq1.e((CustomBarChart) p1Var.getF182175a()), null, null, 48, null));
                o0VarE.K(objQ2);
            }
            gVar2 = gVar;
            o.a(null, y.Q(o0VarE, R.string.lbl_daily_totals), null, null, z3.f.c(446293600, new w21.d((Object) bVar, (Object) y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.lbl_steps)}, o0VarE), (Object) p1Var, objQ2, 27), o0VarE), null, z3.f.c(-408245858, new xm0.h(6, dVar, gVar2), o0VarE), o0VarE, 1597440, 45);
            x1 x1Var2 = n.f135158a;
        } else {
            gVar2 = gVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(dVar, localDate, localDate2, gVar2, i14, 24);
        }
    }
}
