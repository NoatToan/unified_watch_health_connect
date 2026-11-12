package gy0;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/g;", "", "Ley0/g0;", "repository", "<init>", "(Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey0.g0 f80160a;

    public g(ey0.g0 g0Var) {
        g0Var.getClass();
        this.f80160a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(g gVar, String str, cy0.o oVar, v13.c cVar) {
        d dVar;
        gVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f80128d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f80128d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(gVar, cVar);
            }
        } else {
            dVar = new d(gVar, cVar);
        }
        Object objB = dVar.f80126b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f80128d;
        if (i15 == 0) {
            o13.r.b(objB);
            String uuid = oVar.getMediaUuid().getUuid();
            dVar.f80125a = oVar;
            dVar.f80128d = 1;
            objB = gVar.b(str, uuid, dVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = dVar.f80125a;
            o13.r.b(objB);
        }
        return ((Boolean) objB).booleanValue() ? new h.b(oVar) : new h.a(oVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f80135c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f80135c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f80133a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f80135c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objJ);
            eVar.f80135c = 1;
            ey0.g0 g0Var = this.f80160a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(g0Var, new ey0.c(g0Var, str, str2, null), eVar);
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
