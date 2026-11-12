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
import org.joda.time.Days;
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
public final class h {
    public static final void a(List<ny.c> list, DateTime dateTime, DateTime dateTime2, sy.a aVar, m mVar, int i14) {
        o0 o0Var;
        float fG;
        float fG2;
        Float fValueOf;
        float fG3;
        list.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1840095592);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            ny.a.C2460a c2460a = ny.a.f128281b;
            ny.a aVar2 = ny.a.ACTIVE_CALORIES;
            c2460a.getClass();
            long jA = ny.a.C2460a.a(aVar2, o0VarE);
            long jA2 = ny.a.C2460a.a(ny.a.RESTING_CALORIES, o0VarE);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            int i16 = 0;
            while (true) {
                if (!it.hasNext()) {
                    ArrayList arrayListC = c02.a.c(dateTime, dateTime2);
                    String strQ = y.Q(o0VarE, R.string.lbl_daily_totals);
                    if (s.g(Days.daysBetween(dateTime, dateTime2).plus(1), Days.SEVEN)) {
                        o0VarE.C(1621473855);
                        fG = b0.g(a.f192600a, o0VarE);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1621538242);
                        fG = b0.g(a.f192601b, o0VarE);
                        o0VarE.g0(false);
                    }
                    ny.a.C2460a c2460a2 = ny.a.f128281b;
                    ny.a aVar3 = ny.a.RESTING_CALORIES;
                    c2460a2.getClass();
                    long jA3 = ny.a.C2460a.a(aVar3, o0VarE);
                    i53.c cVarE = i53.a.e(arrayList);
                    r rVarF = x2.f(x2.h(r.S, a.f192602c), 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
                    float days = Days.daysBetween(dateTime, dateTime2).getDays() + 1;
                    s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
                    d92.b.f58624b.getClass();
                    n92.d dVar = new n92.d(arrayListC, s0Var, d92.c.f(j92.f.f97935l, o0VarE), null, null, 24, null);
                    d02.c cVar = new d02.c();
                    ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((l0) it3.next()).f117398a);
                    }
                    Iterator it4 = arrayList2.iterator();
                    if (it4.hasNext()) {
                        h0 h0Var = (h0) it4.next();
                        if (h0Var instanceof h0.e) {
                            fG2 = i0.e((h0.e) h0Var);
                        } else {
                            fG2 = h0Var instanceof h0.d ? i0.g((h0.d) h0Var) : 0.0f;
                        }
                        while (it4.hasNext()) {
                            h0 h0Var2 = (h0) it4.next();
                            if (h0Var2 instanceof h0.e) {
                                fG3 = i0.e((h0.e) h0Var2);
                            } else {
                                fG3 = h0Var2 instanceof h0.d ? i0.g((h0.d) h0Var2) : 0.0f;
                            }
                            fG2 = Math.max(fG2, fG3);
                        }
                        fValueOf = Float.valueOf(fG2);
                    } else {
                        fValueOf = null;
                    }
                    int iFloatValue = fValueOf != null ? (int) fValueOf.floatValue() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
                    n92.h hVar = new n92.h(cVar, Float.valueOf(iFloatValue < 100 ? c02.a.b(iFloatValue, 10) : c02.a.b(iFloatValue, 100)), 5);
                    s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (o) o0VarE.A(t1.f91496n), 0, 8, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    n92.a aVar4 = new n92.a(hVar, null, new n92.g(sn.a.c(o0VarE), s0Var2, d92.c.f(j92.f.f97935l, o0VarE), null, 8, null), dVar, 2, null);
                    String lowerCase = y.Q(o0VarE, R.string.lbl_calories).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String strP = y.P(R.string.common_no_certain_data, new Object[]{lowerCase}, o0VarE);
                    Float fValueOf2 = Float.valueOf(days);
                    e.f192617a.getClass();
                    o0Var = o0VarE;
                    m92.d.a(rVarA, strQ, fG, jA3, 0.0f, cVarE, fValueOf2, strP, aVar4, e.f192619c, z3.f.c(-1757168834, new vv0.e(27, aVar, list), o0VarE), o0Var, 0, 54, SyslogConstants.LOG_LOCAL2);
                    x1 x1Var2 = n.f135158a;
                    break;
                }
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                ny.c cVar2 = (ny.c) next;
                ny.c.b values = cVar2.getValues();
                Integer totalCalories = values != null ? values.getTotalCalories() : null;
                ny.c.b values2 = cVar2.getValues();
                Integer restingCalories = values2 != null ? values2.getRestingCalories() : null;
                if (totalCalories != null) {
                    arrayList.add(new l0(new h0.e.c(new h0.e.a(i16, totalCalories.intValue()), jA, null, 4, null), true, false, 4, null));
                }
                if (restingCalories != null) {
                    arrayList.add(new l0(new h0.e.c(new h0.e.a(i16, restingCalories.intValue()), jA2, null, 4, null), totalCalories != null && totalCalories.intValue() == restingCalories.intValue(), false, 4, null));
                }
                i16 = i17;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(list, dateTime, dateTime2, aVar, i14, 1);
        }
    }
}
