package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.v2;
import org.json.JSONArray;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj31/h0;", "Lj31/z0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements z0 {
    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        i0 i0Var;
        Object bVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f96893d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f96893d = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objC = i0Var.f96891b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f96893d;
        if (i15 == 0) {
            o13.r.b(objC);
            wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
            i0Var.f96890a = j8;
            i0Var.f96893d = 1;
            objC = aVarA.C(new wk1.c(aVarA, null), i0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = i0Var.f96890a;
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            try {
                int i16 = o13.q.f128596b;
                if (new JSONArray(((v2.b) v2Var).f47386a).length() > 0) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "HeartRateZonesFeatureHandler", "refreshOnboardingState for device id " + j8 + " completed");
                    ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.HEART_RATE_ZONES_CONFIGURED);
                } else {
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "HeartRateZonesFeatureHandler", "refreshOnboardingState for device id " + j8 + " not completed");
                }
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i17 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                i2.f36769a.getClass();
                i2.a.f(a2.ONBOARDING, "HeartRateZonesFeatureHandler", "refreshOnboardingState for device id " + j8 + " failed " + thB);
            }
            o13.q.a(bVar);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var = a2.ONBOARDING;
            String strN = wr.g.n("refreshOnboardingState for device id ", j8, " failed ", ((v2.a) v2Var).f47383a);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "HeartRateZonesFeatureHandler", strN);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        HRZonesConfigActivity.f44028j.getClass();
        HRZonesConfigActivity.a.a(context, j8, str2, 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/h0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
