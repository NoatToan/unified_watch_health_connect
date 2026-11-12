package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/v;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {
    public v(ey0.g0 g0Var) {
        g0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f80237c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f80237c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objJ = uVar.f80235a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f80237c;
        if (i15 == 0) {
            o13.r.b(objJ);
            uVar.f80237c = 1;
            d60.b bVarG = lc.u0.g(d60.b.f57806c);
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarG, new d60.j(bVarG, j8, null), uVar);
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
            String strF = b71.i.f("GetCourseDetailsUseCase - Result Success:", v2Var);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
            return (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF2 = b71.i.f("GetCourseDetailsUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF2);
        return null;
    }
}
