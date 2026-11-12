package vg1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.common.f f178148b;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.settings.devices.common.f fVar, int i14) {
        this.f178147a = i14;
        this.f178148b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f178147a;
        com.garmin.android.apps.connectmobile.settings.devices.common.f fVar = this.f178148b;
        switch (i14) {
            case 0:
                g22.e.i(fVar, zb0.n0.e(fVar.f42832i));
                break;
            case 1:
                Context contextRequireContext = fVar.requireContext();
                long j8 = fVar.f42832i;
                int i15 = FindMyWatchActivity.f42782c;
                Intent intent = new Intent(contextRequireContext, (Class<?>) FindMyWatchActivity.class);
                intent.putExtra("GCM_deviceUnitID", j8);
                contextRequireContext.startActivity(intent);
                break;
            default:
                if (fVar.getContext() != null && fVar.f42836l != null) {
                    Bundle bundleD = b71.i.d("FinishSetupNavigationFrom", (fVar.getArguments() == null || !fVar.getArguments().getBoolean("GCM_openedFromOnboarding", false)) ? "My Day Device Icon" : "Welcome Modal");
                    ht.a.f85464a.getClass();
                    ht.a.a(bundleD, "OnboardingFinishSetupClicked");
                    Context context = fVar.getContext();
                    long unitID = fVar.f42836l.getUnitID();
                    DeviceOnboardingActivity.f39726b.getClass();
                    fVar.startActivity(DeviceOnboardingActivity.a.a(context, unitID));
                    break;
                }
                break;
        }
    }
}
