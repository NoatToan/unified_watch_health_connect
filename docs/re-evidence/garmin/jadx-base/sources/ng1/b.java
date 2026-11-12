package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityTrackingPulseOXSetting f125910b;

    public /* synthetic */ b(ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting, int i14) {
        this.f125909a = i14;
        this.f125910b = activityTrackingPulseOXSetting;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f125909a) {
            case 0:
                ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting = this.f125910b;
                activityTrackingPulseOXSetting.hideProgressOverlay();
                Toast.makeText(activityTrackingPulseOXSetting, activityTrackingPulseOXSetting.getString(R.string.device_settings_cant_set_aatd), 0).show();
                activityTrackingPulseOXSetting.f41797k = false;
                activityTrackingPulseOXSetting.ca();
                break;
            default:
                this.f125910b.hideProgressOverlay();
                break;
        }
    }
}
