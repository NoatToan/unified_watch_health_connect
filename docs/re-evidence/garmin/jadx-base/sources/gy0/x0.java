package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/x0;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80275a;

    public x0(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80275a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, ArrayList arrayList, String str2, boolean z14, v13.c cVar) {
        w0 w0Var;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f80266c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f80266c = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objJ = w0Var.f80264a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f80266c;
        if (i15 == 0) {
            o13.r.b(objJ);
            String userDisplayName = str2 == null ? ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName() : str2;
            w0Var.f80266c = 1;
            ey0.g0 g0Var = this.f80275a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.v(g0Var, str, userDisplayName, z14, arrayList, null), w0Var);
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
            String strF = b71.i.f("GetMultiDayActivityLifetimeStatsUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetMultiDayActivityLifetimeStatsUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
