package xy;

import c2.x2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import g6.o;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.t1;
import m92.h0;
import m92.i0;
import m92.l0;
import org.joda.time.DateTime;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.s0;
import w02.b0;
import w5.q;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public static final void a(List<ny.e> list, DateTime dateTime, DateTime dateTime2, sy.a aVar, pi0.e eVar, m mVar, int i14) {
        o0 o0Var;
        Float fValueOf;
        Float f14;
        list.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(538557644);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(eVar) ? 16384 : 8192);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            ny.a.C2460a c2460a = ny.a.f128281b;
            ny.a aVar2 = ny.a.ACTIVE_CALORIES;
            c2460a.getClass();
            long jA = ny.a.C2460a.a(aVar2, o0VarE);
            long jA2 = ny.a.C2460a.a(ny.a.RESTING_CALORIES, o0VarE);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                ny.e.b values = ((ny.e) obj).getValues();
                if ((values != null ? values.getDataDaysCount() : null) == null || values.getDataDaysCount().intValue() <= 0) {
                    jA2 = jA2;
                } else {
                    float fIntValue = values.getDataDaysCount().intValue();
                    Integer totalCalories = values.getTotalCalories();
                    Float fValueOf2 = totalCalories != null ? Float.valueOf(totalCalories.intValue() / fIntValue) : null;
                    Integer restingCalories = values.getRestingCalories();
                    Float fValueOf3 = restingCalories != null ? Float.valueOf(restingCalories.intValue() / fIntValue) : null;
                    if (fValueOf2 != null) {
                        f14 = fValueOf3;
                        arrayList.add(new l0(new h0.e.c(new h0.e.a(i16, fValueOf2.floatValue()), jA, null, 4, null), true, false, 4, null));
                    } else {
                        f14 = fValueOf3;
                    }
                    if (f14 != null) {
                        arrayList.add(new l0(new h0.e.c(new h0.e.a(i16, f14.floatValue()), jA2, null, 4, null), s.f(fValueOf2, f14), false, 4, null));
                    }
                }
                i16 = i17;
                jA2 = jA2;
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern.getClass();
            List<String> listE = c02.a.e(dateTime, dateTime2, dateTimeFormatterForPattern);
            String strQ = y.Q(o0VarE, R.string.lbl_daily_averages);
            float fG = b0.g(a.f192601b, o0VarE);
            ny.a.C2460a c2460a2 = ny.a.f128281b;
            ny.a aVar3 = ny.a.RESTING_CALORIES;
            c2460a2.getClass();
            long jA3 = ny.a.C2460a.a(aVar3, o0VarE);
            i53.c cVarE = i53.a.e(arrayList);
            float weeks = Weeks.weeksBetween(dateTime, dateTime2).getWeeks() + 1;
            r rVarF = x2.f(x2.h(r.S, a.f192602c), 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58624b.getClass();
            n92.l lVar = new n92.l(listE, s0Var, d92.c.f(j92.f.f97935l, o0VarE));
            d02.c cVar = new d02.c();
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((l0) it.next()).f117398a);
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                h0 h0Var = (h0) it3.next();
                float fE = h0Var instanceof h0.e ? i0.e((h0.e) h0Var) : h0Var instanceof h0.d ? i0.g((h0.d) h0Var) : 0.0f;
                while (it3.hasNext()) {
                    h0 h0Var2 = (h0) it3.next();
                    fE = Math.max(fE, h0Var2 instanceof h0.e ? i0.e((h0.e) h0Var2) : h0Var2 instanceof h0.d ? i0.g((h0.d) h0Var2) : 0.0f);
                }
                fValueOf = Float.valueOf(fE);
            } else {
                fValueOf = null;
            }
            int iFloatValue = fValueOf != null ? (int) fValueOf.floatValue() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
            n92.h hVar = new n92.h(cVar, Float.valueOf(iFloatValue < 100 ? c02.a.b(iFloatValue, 10) : c02.a.b(iFloatValue, 100)), 5);
            s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            n92.a aVar4 = new n92.a(hVar, null, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(j92.f.f97935l, o0VarE), null, 8, null), lVar, 2, null);
            String lowerCase = y.Q(o0VarE, R.string.lbl_calories).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String strP = y.P(R.string.common_no_certain_data, new Object[]{lowerCase}, o0VarE);
            Float fValueOf4 = Float.valueOf(weeks);
            g.f192621a.getClass();
            o0Var = o0VarE;
            m92.d.a(rVarA, strQ, fG, jA3, 0.0f, cVarE, fValueOf4, strP, aVar4, g.f192623c, z3.f.c(1577382454, new vd0.s0(aVar, 13, list, eVar), o0VarE), o0Var, 0, 54, SyslogConstants.LOG_LOCAL2);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(list, dateTime, dateTime2, aVar, eVar, i14, 6);
        }
    }
}
