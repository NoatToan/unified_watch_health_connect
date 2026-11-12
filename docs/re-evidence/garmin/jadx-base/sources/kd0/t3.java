package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkd0/t3;", "Lg/a;", "", "Lwi1/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t3 extends g.a<Long, wi1.e> {
    @Override // g.a
    public final Intent a(Context context, Long l14) {
        long jLongValue = l14.longValue();
        context.getClass();
        LTESubscriptionManagerActivity.f43457e.getClass();
        Intent intent = new Intent(context, (Class<?>) LTESubscriptionManagerActivity.class);
        intent.putExtra("GCM_deviceUnitID", jLongValue);
        intent.putExtra("NAVIGATION_FROM_SAFETY_FEATURES", false);
        intent.putExtra("NAVIGATION_FROM_SAFETY_WIZARD_FLOW", true);
        return intent;
    }

    @Override // g.a
    public final wi1.e c(int i14, Intent intent) {
        Bundle extras;
        Bundle extras2;
        boolean z14 = false;
        boolean z15 = (intent == null || (extras2 = intent.getExtras()) == null || !extras2.getBoolean("LTE_DEVICE_ACTIVATED")) ? false : true;
        if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("LTE_DEVICE_ASSISTANCE_PLUS_SUPPORTED")) {
            z14 = true;
        }
        return new wi1.e(z15, z14);
    }
}
