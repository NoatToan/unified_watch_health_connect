package hn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import h4.r;
import i3.e5;
import i3.mc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import km1.a0;
import km1.c0;
import l72.x0;
import o53.b0;
import org.joda.time.DateTime;
import p13.j0;
import p13.y;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.b2;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void a(i41.e eVar, p3.m mVar, int i14) {
        ?? arrayList;
        double dFloor;
        String strJ;
        List<i41.f> listB;
        o0 o0VarE = mVar.E(-658154566);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            y00.a aVar = new y00.a(new l22.a(context));
            if (eVar == null || (listB = eVar.b()) == null) {
                arrayList = j0.f134944a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listB) {
                    if (((i41.f) obj).getWeeklyAvg() != null) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(y.r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Integer weeklyAvg = ((i41.f) it.next()).getWeeklyAvg();
                    weeklyAvg.getClass();
                    arrayList.add(weeklyAvg);
                }
            }
            if (((Collection) arrayList).isEmpty()) {
                dFloor = 0.0d;
            } else {
                Iterator it3 = ((Iterable) arrayList).iterator();
                double dIntValue = 0.0d;
                while (it3.hasNext()) {
                    dIntValue += (double) ((Number) it3.next()).intValue();
                }
                dFloor = Math.floor(dIntValue / ((double) arrayList.size()));
            }
            l22.b bVar = aVar.f192984a;
            String strValueOf = dFloor > 0.0d ? String.valueOf((int) dFloor) : bVar.getString(R.string.no_value);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_ms);
            String string = bVar.getString(R.string.lbl_avg_hrv);
            if (dFloor > 0.0d) {
                o0VarE.C(-556249086);
                o0VarE.g0(false);
                strJ = strValueOf;
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -556204415, R.string.txt_empty_page_no_data, o0VarE, false);
            }
            x0 x0Var = x0.f111346a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, 1), z3.f.c(105101907, new ak0.j(context, strValueOf, string, strQ, strJ), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(eVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(a0 a0Var, DateTime dateTime, DateTime dateTime2, s sVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1VarC;
        u82.f fVar;
        p1 p1VarC2;
        sm1.a0 a0Var2;
        b0Var.getClass();
        o0 o0VarE = mVar.E(840443500);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(sVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(b0Var) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b2 b2Var = sVar != null ? sVar.f160188h : null;
            if (b2Var == null) {
                o0VarE.C(-2006751496);
                o0VarE.g0(false);
                p1VarC = null;
            } else {
                o0VarE.C(212360745);
                p1VarC = s9.c.c(b2Var, o0VarE);
                o0VarE.g0(false);
            }
            km1.f fVar2 = new km1.f(context, (p1VarC == null || (a0Var2 = (sm1.a0) p1VarC.getF182175a()) == null) ? false : a0Var2.f160098n);
            if (dateTime == null || dateTime2 == null) {
                o0VarE.C(-2006139462);
                o0VarE.g0(false);
                fVar = null;
            } else {
                o0VarE.C(-2006161007);
                u82.a aVar = sVar != null ? sVar.f160195o : null;
                if (aVar == null) {
                    o0VarE.C(-2006430305);
                    o0VarE.g0(false);
                    p1VarC2 = null;
                } else {
                    o0VarE.C(212371106);
                    p1VarC2 = aVar.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), o0VarE);
                    o0VarE.g0(false);
                }
                u82.f fVar3 = p1VarC2 != null ? (u82.f) p1VarC2.getF182175a() : null;
                o0VarE.g0(false);
                fVar = fVar3;
            }
            boolean zB = o0VarE.B(fVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = hb.a.n(fVar instanceof u82.f.b, o0VarE);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb.a.n(fVar instanceof u82.f.b, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new CustomCombinedChart(context);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            fn1.r.a(gl1.y.Q(o0VarE, R.string.tr_factor_hrv_status), fVar2.b(c0.HRV_STATUS, a0Var != null ? a0Var.getHrvAdjustment() : null), gl1.y.Q(o0VarE, R.string.tr_factor_hrv_status), e5.g(gl1.y.Q(o0VarE, R.string.lbl_daily_averages), " • ", gl1.y.Q(o0VarE, R.string.lbl_seven_days)), mcVar, b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(1524887828, new ak0.j((CustomCombinedChart) objQ2, dateTime, dateTime2, fVar, p1Var, 24), o0VarE), null, z3.f.c(-1922565406, new i(fVar, 0), o0VarE), o0Var, (57344 & i16) | 817889280 | (458752 & i16), 256);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(a0Var, dateTime, dateTime2, sVar, mcVar, b0Var, i14, 1);
        }
    }
}
