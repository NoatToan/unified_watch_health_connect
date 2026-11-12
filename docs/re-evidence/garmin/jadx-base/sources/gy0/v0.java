package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/v0;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80245a;

    public v0(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80245a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, v13.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i14 = u0Var.f80240c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u0Var.f80240c = i14 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objJ = u0Var.f80238a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u0Var.f80240c;
        if (i15 == 0) {
            o13.r.b(objJ);
            u0Var.f80240c = 1;
            ey0.g0 g0Var = this.f80245a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.t(g0Var, str, null), u0Var);
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
            String strF = b71.i.f("GetMultiDayActivityElevationDataUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            v2.b bVar = (v2.b) v2Var;
            if (bVar.f47387b == 200) {
                return (cy0.m) bVar.f47386a;
            }
            return null;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetMultiDayActivityElevationDataUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
