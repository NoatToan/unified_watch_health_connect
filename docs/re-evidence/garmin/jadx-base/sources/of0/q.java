package of0;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.LocationRationaleFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationRationaleFragment f131700b;

    public /* synthetic */ q(LocationRationaleFragment locationRationaleFragment, int i14) {
        this.f131699a = i14;
        this.f131700b = locationRationaleFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f131699a;
        LocationRationaleFragment locationRationaleFragment = this.f131700b;
        switch (i14) {
            case 0:
                int i15 = LocationRationaleFragment.f34816e;
                if (!locationRationaleFragment.u6().L4()) {
                    locationRationaleFragment.f34818b.a(locationRationaleFragment.u6().f125829k, null);
                } else {
                    locationRationaleFragment.w6();
                }
                break;
            case 1:
                int i16 = LocationRationaleFragment.f34816e;
                locationRationaleFragment.y6();
                break;
            case 2:
                int i17 = LocationRationaleFragment.f34816e;
                LegalGatewayActivity.a aVar = LegalGatewayActivity.f49928n;
                androidx.fragment.app.m mVarRequireActivity = locationRationaleFragment.requireActivity();
                mVarRequireActivity.getClass();
                LegalGatewayActivity.a.b(aVar, mVarRequireActivity, 0, lc2.a.GARMIN_CONNECT_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, null, 128);
                break;
            case 3:
                int i18 = LocationRationaleFragment.f34816e;
                if (!locationRationaleFragment.u6().L4()) {
                    a2 a2Var = a2.JET_LAG;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "LocationRationaleFragment", "[navigateToApplicationDetails] navigate to application details to grant location permissions");
                    locationRationaleFragment.f34819c.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + locationRationaleFragment.requireActivity().getPackageName())), null);
                } else {
                    locationRationaleFragment.w6();
                }
                break;
            default:
                int i19 = LocationRationaleFragment.f34816e;
                a2 a2Var2 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "LocationRationaleFragment", "[showLocationPermissionNeededDialog] exit onboarding -> no location permission");
                locationRationaleFragment.u6().K4();
                break;
        }
    }
}
