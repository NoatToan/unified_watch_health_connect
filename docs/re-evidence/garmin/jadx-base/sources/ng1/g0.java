package ng1;

import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceUserSettingsActivity f125935b;

    public /* synthetic */ g0(DeviceUserSettingsActivity deviceUserSettingsActivity, int i14) {
        this.f125934a = i14;
        this.f125935b = deviceUserSettingsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f125934a;
        DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125935b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = DeviceUserSettingsActivity.f42010c1;
                int i16 = DeviceUserSettingsActivity.h.f42046a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    deviceUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i16 == 2) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    deviceUserSettingsActivity.f42017e = (zk0.c) g3Var.f35301b;
                    deviceUserSettingsActivity.ca();
                    break;
                } else if (i16 == 3) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error fetching user steps goal from GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    deviceUserSettingsActivity.ca();
                    break;
                }
                break;
            case 1:
                int i17 = DeviceUserSettingsActivity.f42010c1;
                deviceUserSettingsActivity.getClass();
                int i18 = DeviceUserSettingsActivity.h.f42046a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    deviceUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i18 == 2) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    List<zk0.h> list = (List) g3Var.f35301b;
                    if (list != null && !list.isEmpty()) {
                        for (zk0.h hVar : list) {
                            if (!TextUtils.isEmpty(hVar.goalType) && hVar.goalType.equals("FLOORS_CLIMBED")) {
                                deviceUserSettingsActivity.f42019g = hVar;
                            } else if (!TextUtils.isEmpty(hVar.goalType) && hVar.goalType.equals("INTENSITY_MINUTES")) {
                                deviceUserSettingsActivity.f42020h = hVar;
                            }
                        }
                    }
                    deviceUserSettingsActivity.ca();
                    break;
                } else if (i18 == 3) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error fetching user wellness goals from GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    deviceUserSettingsActivity.ca();
                    break;
                }
                break;
            default:
                int i19 = DeviceUserSettingsActivity.f42010c1;
                deviceUserSettingsActivity.getClass();
                int i24 = DeviceUserSettingsActivity.h.f42046a[g3Var.f35300a.ordinal()];
                if (i24 == 1) {
                    deviceUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i24 == 2) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    deviceUserSettingsActivity.f42017e = (zk0.c) g3Var.f35301b;
                    new androidx.appcompat.app.e.a(deviceUserSettingsActivity).setTitle((CharSequence) null).setMessage(R.string.steps_sync_reminder).setPositiveButton(android.R.string.ok, new mt0.y(8)).show();
                    deviceUserSettingsActivity.ja();
                    break;
                } else if (i24 == 3) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error saving user floors climbed goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
        }
    }
}
