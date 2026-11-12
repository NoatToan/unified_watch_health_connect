package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.onboarding.education.OnboardingEducationalActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/i;", "Lj31/z0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements z0 {
    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        ds.e0.p(context, str, str2);
        OnboardingEducationalActivity.a aVar = OnboardingEducationalActivity.f39689c;
        zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str2);
        com.garmin.android.apps.connectmobile.onboarding.education.a.c cVar = com.garmin.android.apps.connectmobile.onboarding.education.a.c.BIKE_ALARM;
        aVar.getClass();
        cVar.getClass();
        Intent intent = new Intent(context, (Class<?>) OnboardingEducationalActivity.class);
        intent.putExtra("onboardingEducationType", cVar.name());
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_isOnboardingEducationalFeature", true);
        if (u0Var != null) {
            intent.putExtra("GCM_deviceEnumValue", u0Var);
        }
        context.startActivity(intent);
    }
}
