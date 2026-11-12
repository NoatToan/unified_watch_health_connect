package ls0;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TripSetupActivity f114772b;

    public /* synthetic */ w(TripSetupActivity tripSetupActivity, int i14) {
        this.f114771a = i14;
        this.f114772b = tripSetupActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f114771a;
        TripSetupActivity tripSetupActivity = this.f114772b;
        switch (i14) {
            case 0:
                TripSetupActivity.a aVar = TripSetupActivity.f37081g;
                a2 a2Var = a2.JET_LAG;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "TripSetupActivity", "[navigateToApplicationDetails] navigate to application details to grant location permissions");
                tripSetupActivity.f37085d.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + tripSetupActivity.getPackageName())), null);
                break;
            case 1:
                TripSetupActivity.a aVar2 = TripSetupActivity.f37081g;
                tripSetupActivity.ca().A4();
                break;
            case 2:
                TripSetupActivity.a aVar3 = TripSetupActivity.f37081g;
                a2 a2Var2 = a2.JET_LAG;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "TripSetupActivity", "[navigateToLocationSettings] navigate to location settings");
                tripSetupActivity.f37086e.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
                break;
            default:
                TripSetupActivity.a aVar4 = TripSetupActivity.f37081g;
                tripSetupActivity.ca().A4();
                break;
        }
    }
}
