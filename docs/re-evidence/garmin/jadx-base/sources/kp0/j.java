package kp0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import kd0.j5;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp0/j;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lip0/a;", "apiService", "<init>", "(Lip0/a;)V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f106007c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip0.a f106008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f106009b;

    public j(ip0.a aVar) {
        aVar.getClass();
        this.f106008a = aVar;
        this.f106009b = m.b(new j5(13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(DateTime dateTime, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f105985c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f105985c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f105983a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f105985c;
        if (i15 == 0) {
            r.b(objJ);
            c cVar2 = new c(this, dateTime, null);
            bVar.f105985c = 1;
            objJ = f0.J(this, cVar2, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            jp0.b bVar2 = (jp0.b) ((v2.b) v2Var).f47386a;
            Double valueInML = bVar2.getValueInML();
            bVar2.r(valueInML != null ? new Double(jp0.c.o(valueInML.doubleValue(), "valueInML", c())) : null);
            Double goalInML = bVar2.getGoalInML();
            bVar2.m(goalInML != null ? new Double(jp0.c.o(goalInML.doubleValue(), "goalInML", c())) : null);
            Double activityIntakeInML = bVar2.getActivityIntakeInML();
            bVar2.k(activityIntakeInML != null ? new Double(jp0.c.o(activityIntakeInML.doubleValue(), "activityIntakeInML", c())) : null);
            Double sweatLossInML = bVar2.getSweatLossInML();
            bVar2.q(sweatLossInML != null ? new Double(jp0.c.o(sweatLossInML.doubleValue(), "sweatLossInML", c())) : null);
            op0.c cVarG = bVar2.g();
            l.f68084a.getClass();
            l.a.a().T2(cVarG.i());
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f105991c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f105991c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f105989a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f105991c;
        if (i15 == 0) {
            r.b(objJ);
            e eVar = new e(this, null);
            dVar.f105991c = 1;
            objJ = f0.J(this, eVar, dVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            op0.c cVarG = ((jp0.b) bVar.f47386a).g();
            f(cVarG);
            return new v2.b(cVarG, bVar.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
        }
        u0.r();
        return null;
    }

    public final Logger c() {
        return (Logger) this.f106009b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(op0.c cVar, v13.c cVar2) {
        h hVar;
        if (cVar2 instanceof h) {
            hVar = (h) cVar2;
            int i14 = hVar.f106003c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f106003c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar2);
            }
        } else {
            hVar = new h(this, cVar2);
        }
        Object objJ = hVar.f106001a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f106003c;
        if (i15 == 0) {
            r.b(objJ);
            c().debug("SaveHydrationSettings: Round baseGoalInML value before post");
            Double baseGoalInML = cVar.getBaseGoalInML();
            cVar.m(baseGoalInML != null ? new Double(jp0.c.o(baseGoalInML.doubleValue(), "HydrationSettingsDTO.baseGoalInML", c())) : null);
            i iVar = new i(this, cVar, null);
            hVar.f106003c = 1;
            objJ = f0.J(this, iVar, hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            op0.c cVarG = ((jp0.b) bVar.f47386a).g();
            f(cVarG);
            return new v2.b(cVarG, bVar.f47387b, null, null, 12, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
        }
        u0.r();
        return null;
    }

    public final void f(op0.c cVar) {
        c().debug("HydrationSettings: Round baseGoalInML value after post");
        Double baseGoalInML = cVar.getBaseGoalInML();
        cVar.m(baseGoalInML != null ? Double.valueOf(jp0.c.o(baseGoalInML.doubleValue(), "HydrationSettingsDTO.baseGoalInML", c())) : null);
        l.f68084a.getClass();
        l.a.a().T2(cVar.i());
    }
}
