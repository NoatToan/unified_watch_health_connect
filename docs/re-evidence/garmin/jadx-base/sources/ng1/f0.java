package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceUserSettingsActivity f125930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125931c;

    public /* synthetic */ f0(DeviceUserSettingsActivity deviceUserSettingsActivity, int i14, int i15) {
        this.f125929a = i15;
        this.f125930b = deviceUserSettingsActivity;
        this.f125931c = i14;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f125929a;
        int i15 = this.f125931c;
        DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125930b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i16 = DeviceUserSettingsActivity.f42010c1;
                int i17 = DeviceUserSettingsActivity.h.f42046a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    deviceUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i17 == 2) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    deviceUserSettingsActivity.f42020h.D(i15);
                    zk0.h hVar = deviceUserSettingsActivity.f42020h;
                    if (hVar != null) {
                        deviceUserSettingsActivity.F.setButtonBottomLeftLabel(Integer.toString(hVar.C()));
                    }
                    break;
                } else if (i17 == 3) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error saving user intensity minutes goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
            default:
                int i18 = DeviceUserSettingsActivity.f42010c1;
                deviceUserSettingsActivity.getClass();
                int i19 = DeviceUserSettingsActivity.h.f42046a[g3Var.f35300a.ordinal()];
                if (i19 == 1) {
                    deviceUserSettingsActivity.showProgressOverlay();
                    break;
                } else if (i19 == 2) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    deviceUserSettingsActivity.f42019g.D(i15);
                    new androidx.appcompat.app.e.a(deviceUserSettingsActivity).setTitle((CharSequence) null).setMessage(R.string.floors_sync_reminder).setPositiveButton(android.R.string.ok, new mt0.y(8)).show();
                    zk0.h hVar2 = deviceUserSettingsActivity.f42019g;
                    if (hVar2 != null) {
                        deviceUserSettingsActivity.E.setButtonBottomLeftLabel(Integer.toString(hVar2.C()));
                    }
                    break;
                } else if (i19 == 3) {
                    deviceUserSettingsActivity.hideProgressOverlay();
                    i2.f(a2.SETTINGS, "DeviceUserSettingsActivity", "Error saving user floors climbed goal to GC [" + g3Var.f35302c + "].");
                    Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
        }
    }
}
