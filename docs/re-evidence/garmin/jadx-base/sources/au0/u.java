package au0;

import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import i3.e5;
import java.io.Serializable;
import java.util.ArrayList;
import lc.u0;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau0/u;", "Ltf2/i;", "Ll52/y;", "workoutService", "<init>", "(Ll52/y;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements tf2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.y f12993a;

    static {
        new a(null);
    }

    public u(l52.y yVar) {
        yVar.getClass();
        this.f12993a = yVar;
    }

    public static boolean c(String str) {
        h0.f12930a.getClass();
        x0 x0VarA = h0.a.a(str);
        i2.f36769a.getClass();
        i2.a.b(a2.SUBSCRIPTIONS, "LiveActivityPowerDataProviderImpl", "fetchPowerData - activityType:" + x0VarA);
        return z0.h(x0VarA) == x0.f4312o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tf2.i
    public final Serializable a(String str, v13.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f12996c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f12996c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objY = vVar.f12994a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f12996c;
        if (i15 == 0) {
            o13.r.b(objY);
            if (!c(str)) {
                return null;
            }
            vVar.f12996c = 1;
            objY = this.f12993a.Y(vVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strN = fb1.c.n("getPowerCurveData Error - response:", ((v2.a) v2Var).f47385c);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LiveActivityPowerDataProviderImpl", strN);
            return null;
        }
        a2 a2Var2 = a2.SUBSCRIPTIONS;
        T t7 = ((v2.b) v2Var).f47386a;
        String strF = e5.f(t7, "getPowerCurveData Success - response:");
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "LiveActivityPowerDataProviderImpl", strF);
        Iterable<com.garmin.android.apps.connectmobile.workouts.data.model.v> iterable = (Iterable) t7;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        for (com.garmin.android.apps.connectmobile.workouts.data.model.v vVar2 : iterable) {
            arrayList.add(new o13.p(new Integer(vVar2.getDuration()), new Integer(vVar2.getPower())));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // tf2.i
    public final Object b(String str, v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f12999c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f12999c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objC = wVar.f12997a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f12999c;
        if (i15 == 0) {
            o13.r.b(objC);
            if (!c(str)) {
                return null;
            }
            wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
            wVar.f12999c = 1;
            objC = aVarA.C(new wk1.f(aVarA, "CYCLING", null), wVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strF = b71.i.f("getPowerFtp Success - response:", v2Var);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LiveActivityPowerDataProviderImpl", strF);
            PowerZonesDTO powerZonesDTO = new PowerZonesDTO();
            String str2 = (String) ((v2.b) v2Var).f47386a;
            powerZonesDTO.k(str2 != null ? new JSONObject(str2) : null);
            return new Integer(powerZonesDTO.f43987b);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        a2 a2Var2 = a2.SUBSCRIPTIONS;
        String strN = fb1.c.n("getPowerFtp Error - response:", ((v2.a) v2Var).f47385c);
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "LiveActivityPowerDataProviderImpl", strN);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau0/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
