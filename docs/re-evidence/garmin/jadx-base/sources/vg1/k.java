package vg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityTrackingSettingActivityDefault;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceActivityTrackingSettingActivityDefault f178117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f178118c;

    public /* synthetic */ k(DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault, int i14, int i15) {
        this.f178116a = i15;
        this.f178117b = deviceActivityTrackingSettingActivityDefault;
        this.f178118c = i14;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f178116a;
        int i15 = this.f178118c;
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = this.f178117b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i16 = DeviceActivityTrackingSettingActivityDefault.R0;
                deviceActivityTrackingSettingActivityDefault.getClass();
                int i17 = DeviceActivityTrackingSettingActivityDefault.g.f42612a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
                    break;
                } else if (i17 == 2) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    deviceActivityTrackingSettingActivityDefault.A.D(i15);
                    new androidx.appcompat.app.e.a(deviceActivityTrackingSettingActivityDefault).setTitle((CharSequence) null).setMessage(R.string.floors_sync_reminder).setPositiveButton(android.R.string.ok, new ty1.o(24)).show();
                    zk0.h hVar = deviceActivityTrackingSettingActivityDefault.A;
                    if (hVar != null) {
                        deviceActivityTrackingSettingActivityDefault.Y.setButtonBottomLeftLabel(Integer.toString(hVar.C()));
                    }
                    break;
                } else if (i17 == 3) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error saving user floors climbed goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
            default:
                int i18 = DeviceActivityTrackingSettingActivityDefault.R0;
                deviceActivityTrackingSettingActivityDefault.getClass();
                int i19 = DeviceActivityTrackingSettingActivityDefault.g.f42612a[g3Var.f35300a.ordinal()];
                if (i19 == 1) {
                    deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
                    break;
                } else if (i19 == 2) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    deviceActivityTrackingSettingActivityDefault.B.D(i15);
                    deviceActivityTrackingSettingActivityDefault.la();
                    break;
                } else if (i19 == 3) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error saving user intensity minutes goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
        }
    }
}
