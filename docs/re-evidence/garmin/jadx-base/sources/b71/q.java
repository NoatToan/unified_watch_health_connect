package b71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import lc.u0;
import org.joda.time.DateTime;
import p13.c0;
import p13.w;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    public static final void a(DateTime dateTime, DateTime dateTime2, Integer num, List list, o82.g gVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        byte b14;
        String strL;
        gVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1440124360);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(num) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i16 = 1;
            i53.c cVarE = i53.a.e(w.c(new j0(y.Q(o0VarE, R.string.chronic_load_title), null, null, false, z14, 14, null)));
            l22.a aVar = new l22.a(context);
            pi0.e eVar = new pi0.e(context);
            ArrayList arrayList = new ArrayList();
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                com.garmin.android.apps.connectmobile.performance.model.c cVar = (com.garmin.android.apps.connectmobile.performance.model.c) it.next();
                double dI = cVar.I();
                Double D = cVar.D();
                double dDoubleValue = D != null ? D.doubleValue() : Double.NaN;
                double d14 = cVar.B;
                int i17 = i16;
                boolean z15 = cVar.f39959r;
                double d15 = !z15 ? cVar.f39965z : cVar.f39946e;
                double d16 = !z15 ? cVar.f39964y : cVar.f39945d;
                DateTime dateTimeC = cVar.C();
                double d17 = d16;
                String strA = eVar.a(cVar.C(), qi0.a.NUMERIC_YEAR_MONTH_DAY);
                a61.e eVar2 = a61.e.f1563a;
                double dI2 = cVar.I();
                eVar2.getClass();
                String strC = a61.e.c(aVar, dI2);
                Double D2 = cVar.D();
                String strC2 = a61.e.c(aVar, D2 != null ? D2.doubleValue() : Double.NaN);
                boolean z16 = cVar.f39957p;
                String str = cVar.f39961v;
                String str2 = str == null ? "" : str;
                String str3 = cVar.f39962w;
                arrayList.add(new a71.d(dI, dDoubleValue, d14, d15, d17, dateTimeC, strA, strC, strC2, z16, str2, str3 == null ? "" : str3, !cVar.f39959r, a61.e.d(aVar, cVar.I(), cVar.G(), cVar.f39957p)));
                i16 = i17;
            }
            if (arrayList.size() > i16) {
                c0.u(arrayList, new p());
            }
            a71.e eVar3 = new a71.e(arrayList, "", "", null, "", "", "", "", true, false, true, z14, null, new o(i16), false, null, false);
            if (num == null) {
                o0VarE.C(-315828529);
                b14 = 0;
                o0VarE.g0(false);
                strL = null;
            } else {
                b14 = 0;
                strL = u0.l(o0VarE, -315828528, num, o0VarE, false);
            }
            o0Var = o0VarE;
            m92.o.a(null, strL, null, null, z3.f.c(-1665386824, new a51.l(dateTime, dateTime2, gVar, eVar3, 15), o0VarE), z3.f.c(-370967977, new m(cVarE, lVar, b14, b14), o0VarE), null, o0Var, 221184, 77);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(dateTime, dateTime2, num, list, gVar, z14, lVar, i14);
        }
    }
}
