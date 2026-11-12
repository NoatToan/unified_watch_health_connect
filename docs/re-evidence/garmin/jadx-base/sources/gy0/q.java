package gy0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/q;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80217a;

    public q(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80217a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, long j14, String str, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f80209c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f80209c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f80207a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f80209c;
        if (i15 == 0) {
            o13.r.b(objJ);
            String userDisplayName = str == null ? ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName() : str;
            pVar.f80209c = 1;
            int i16 = ey0.g0.f67173j;
            DateTime dateTimeWithTimeAtStartOfDay = new DateTime(j8, DateTimeZone.getDefault()).withTimeAtStartOfDay();
            dateTimeWithTimeAtStartOfDay.getClass();
            fz0.e eVar = new fz0.e(dateTimeWithTimeAtStartOfDay);
            fz0.e eVar2 = new fz0.e(g22.k.A(new DateTime(j14, DateTimeZone.getDefault())));
            ey0.g0 g0Var = this.f80217a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.e(g0Var, userDisplayName, eVar, eVar2, 1, 1000, true, null), pVar);
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
            ActivityListDTO activityListDTO = (ActivityListDTO) ((v2.b) v2Var).f47386a;
            String strK = androidx.room.a0.k("GetActivityListUseCase - Result Success - activityList:", activityListDTO.f29242a);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strK);
            ArrayList<ActivityListItemDTO> arrayList = activityListDTO.f29242a;
            arrayList.getClass();
            return i53.a.j(arrayList);
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
        String strF = b71.i.f("GetActivityListUseCase - Result Error:", v2Var);
        i2.f36769a.getClass();
        i2.a.e(a2Var2, strF);
        return null;
    }
}
