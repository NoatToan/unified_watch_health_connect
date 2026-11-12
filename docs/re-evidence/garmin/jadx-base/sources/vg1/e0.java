package vg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e0 implements lj0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceUserSettingActivityDefault f178098a;

    public e0(DeviceUserSettingActivityDefault deviceUserSettingActivityDefault) {
        this.f178098a = deviceUserSettingActivityDefault;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device registration details from GC ["), "].", a2Var, "DeviceUserSettingActivityDefault");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = this.f178098a;
        if (bVar != bVar2) {
            Toast.makeText(deviceUserSettingActivityDefault, R.string.txt_error_occurred, 0).show();
        }
        DeviceUserSettingActivityDefault.ca(deviceUserSettingActivityDefault);
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject((String) aVar.f112977a);
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("fetchDeviceRegistrationDetails.onResultsSucceeded: "), a2.SETTINGS, "DeviceUserSettingActivityDefault");
            jSONObject = null;
        }
        DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = this.f178098a;
        if (jSONObject != null) {
            deviceUserSettingActivityDefault.f42752f = jSONObject.optBoolean("handednessCapable");
            deviceUserSettingActivityDefault.f42753g = jSONObject.optBoolean("powerZonesCapable");
            deviceUserSettingActivityDefault.f42754h = jSONObject.optBoolean("sleepTimeCapable");
            deviceUserSettingActivityDefault.f42755i = jSONObject.optBoolean("xcSkiPowerZonesCapable");
        }
        if (!deviceUserSettingActivityDefault.f42753g) {
            deviceUserSettingActivityDefault.f42769x.setVisibility(8);
        }
        if (!deviceUserSettingActivityDefault.f42755i) {
            deviceUserSettingActivityDefault.showProgressOverlay();
            uk1.j jVarN = uk1.j.N();
            DeviceUserSettingActivityDefault.a aVar2 = deviceUserSettingActivityDefault.J0;
            jVarN.getClass();
            aVar2.getClass();
            deviceUserSettingActivityDefault.A = com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.b(jVarN), aVar2);
        }
        DeviceUserSettingActivityDefault.ca(deviceUserSettingActivityDefault);
    }
}
