package s00;

import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;

/* JADX INFO: loaded from: classes7.dex */
public class e extends j {
    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        try {
            String string = bundle.getString("primary-device-id");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                long j8 = Long.parseLong(string);
                if (hk0.p.k(j8)) {
                    yr1.e.e(null, j8, "ActivityTrackerPNH");
                    return;
                }
                i2.d("ActivityTrackerPNH", "Received push notification to sync device, but it is not connected: " + string);
                GCMSettingManager.I(j8, true);
            } catch (NumberFormatException unused) {
                i2.i("ActivityTrackerPNH", "Invalid device id passed as primary activity tracker: " + string);
            }
        } catch (Exception e4) {
            i2.g(e4, "ActivityTrackerPNH");
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.SYNC_PRIMARY_ACTIVITY_TRACKER};
    }
}
