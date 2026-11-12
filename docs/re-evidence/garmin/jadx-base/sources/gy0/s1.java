package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/s1;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80231a;

    public s1(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80231a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, v13.c cVar) {
        r1 r1Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f80224c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f80224c = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objJ = r1Var.f80222a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f80224c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objJ);
            r1Var.f80224c = 1;
            ey0.g0 g0Var = this.f80231a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.c0(g0Var, str, arrayList, null), r1Var);
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
            String strF = b71.i.f("SetEpicActivityDailyNotesUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            if (((v2.b) v2Var).f47387b != 204) {
            }
            return Boolean.valueOf(z14);
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("SetEpicActivityDailyNotesUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        z14 = false;
        return Boolean.valueOf(z14);
    }
}
