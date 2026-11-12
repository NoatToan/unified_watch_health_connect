package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/c2;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80124a;

    public c2(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80124a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j8, long j14, v13.c cVar) {
        b2 b2Var;
        if (cVar instanceof b2) {
            b2Var = (b2) cVar;
            int i14 = b2Var.f80115c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b2Var.f80115c = i14 - Integer.MIN_VALUE;
            } else {
                b2Var = new b2(this, cVar);
            }
        } else {
            b2Var = new b2(this, cVar);
        }
        Object objJ = b2Var.f80113a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b2Var.f80115c;
        if (i15 == 0) {
            o13.r.b(objJ);
            b2Var.f80115c = 1;
            String strB = c22.j0.b(new DateTime(j8, DateTimeZone.getDefault()), "yyyy-MM-dd", null);
            if (strB == null) {
                strB = "";
            }
            String strB2 = c22.j0.b(new DateTime(j14, DateTimeZone.getDefault()), "yyyy-MM-dd", null);
            String str = strB2 != null ? strB2 : "";
            ey0.g0 g0Var = this.f80124a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.f0(g0Var, strB, str, null), b2Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF = b71.i.f("validateDateRange - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return c.C1605c.f80119a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        Integer num = aVar2.f47384b;
        if (num == null || num.intValue() != 409) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strF2 = b71.i.f("validateDateRange - Result Error:", v2Var);
            i2.f36769a.getClass();
            i2.a.e(a2Var2, strF2);
            return new c.b(aVar2.f47383a, num);
        }
        try {
            cy0.e eVarB = ((cy0.h) GsonUtil.f47253b.fromJson(((v2.a) v2Var).f47385c, cy0.h.class)).b();
            if (eVarB == null) {
                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
                i2.f36769a.getClass();
                i2.a.e(a2Var3, "validateDateRange - Result Error-Conflict: dateRangeCode is Null");
                return new c.b(((v2.a) v2Var).f47383a, ((v2.a) v2Var).f47384b);
            }
            i2.f36769a.getClass();
            i2.a.o(com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY, "validateDateRange - Result Error-Conflict:" + v2Var);
            return new c.a(eVarB);
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strN = fb1.c.n("validateDateRange - Result Error-Conflict: ErrorBody is wrong. ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.e(a2Var4, strN);
            return new c.b(e4, num);
        }
    }
}
