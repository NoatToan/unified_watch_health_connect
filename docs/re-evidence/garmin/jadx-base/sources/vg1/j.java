package vg1;

import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityTrackingSettingActivityDefault;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceActivityTrackingSettingActivityDefault f178113b;

    public /* synthetic */ j(DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault, int i14) {
        this.f178112a = i14;
        this.f178113b = deviceActivityTrackingSettingActivityDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f178112a;
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = this.f178113b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = DeviceActivityTrackingSettingActivityDefault.R0;
                int i16 = DeviceActivityTrackingSettingActivityDefault.g.f42612a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
                    break;
                } else if (i16 == 2) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    deviceActivityTrackingSettingActivityDefault.f42603y = (zk0.c) g3Var.f35301b;
                    deviceActivityTrackingSettingActivityDefault.ka();
                    break;
                } else if (i16 == 3) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error saving user floors climbed goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                    deviceActivityTrackingSettingActivityDefault.ka();
                    break;
                }
                break;
            case 1:
                int i17 = DeviceActivityTrackingSettingActivityDefault.R0;
                deviceActivityTrackingSettingActivityDefault.getClass();
                int i18 = DeviceActivityTrackingSettingActivityDefault.g.f42612a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
                    break;
                } else if (i18 == 2) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    List<zk0.h> list = (List) g3Var.f35301b;
                    if (list != null && !list.isEmpty()) {
                        for (zk0.h hVar : list) {
                            if (!TextUtils.isEmpty(hVar.goalType) && hVar.goalType.equals("FLOORS_CLIMBED")) {
                                deviceActivityTrackingSettingActivityDefault.A = hVar;
                            } else if (!TextUtils.isEmpty(hVar.goalType) && hVar.goalType.equals("INTENSITY_MINUTES")) {
                                deviceActivityTrackingSettingActivityDefault.B = hVar;
                            }
                        }
                    }
                    deviceActivityTrackingSettingActivityDefault.ka();
                    break;
                } else if (i18 == 3) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error fetching user wellness goals from GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                    deviceActivityTrackingSettingActivityDefault.ka();
                    break;
                }
                break;
            default:
                int i19 = DeviceActivityTrackingSettingActivityDefault.R0;
                deviceActivityTrackingSettingActivityDefault.getClass();
                int i24 = DeviceActivityTrackingSettingActivityDefault.g.f42612a[g3Var.f35300a.ordinal()];
                if (i24 == 1) {
                    deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
                    break;
                } else if (i24 == 2) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    deviceActivityTrackingSettingActivityDefault.f42603y = (zk0.c) g3Var.f35301b;
                    new androidx.appcompat.app.e.a(deviceActivityTrackingSettingActivityDefault).setTitle((CharSequence) null).setMessage(R.string.steps_sync_reminder).setPositiveButton(android.R.string.ok, new ty1.o(24)).show();
                    deviceActivityTrackingSettingActivityDefault.ma();
                    break;
                } else if (i24 == 3) {
                    deviceActivityTrackingSettingActivityDefault.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault", "Error saving user floors climbed goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
        }
    }
}
