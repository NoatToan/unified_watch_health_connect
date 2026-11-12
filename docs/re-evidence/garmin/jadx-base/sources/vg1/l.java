package vg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityTrackingSettingActivityDefault;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l implements lj0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceActivityTrackingSettingActivityDefault f178134a;

    public l(DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault) {
        this.f178134a = deviceActivityTrackingSettingActivityDefault;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device registration details from GC ["), "].", a2Var, "DeviceActivityTrackingSettingActivityDefault");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = this.f178134a;
        if (bVar != bVar2) {
            Toast.makeText(deviceActivityTrackingSettingActivityDefault, R.string.txt_error_occurred, 0).show();
        }
        int i14 = DeviceActivityTrackingSettingActivityDefault.R0;
        deviceActivityTrackingSettingActivityDefault.ka();
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject((String) aVar.f112977a);
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("fetchDeviceRegistrationDetails.onResultsSucceeded: "), a2.SETTINGS, "DeviceActivityTrackingSettingActivityDefault");
            jSONObject = null;
        }
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = this.f178134a;
        if (jSONObject != null) {
            deviceActivityTrackingSettingActivityDefault.C = jSONObject.optBoolean("handednessCapable");
            deviceActivityTrackingSettingActivityDefault.D = jSONObject.optBoolean("intensityMinutesGoalCapable") || jSONObject.optBoolean("moderateIntensityMinutesGoalCapable");
            deviceActivityTrackingSettingActivityDefault.E = jSONObject.optBoolean("floorsClimbedGoalCapable");
        }
        if (deviceActivityTrackingSettingActivityDefault.D || deviceActivityTrackingSettingActivityDefault.E) {
            deviceActivityTrackingSettingActivityDefault.I++;
            xk0.g gVar = deviceActivityTrackingSettingActivityDefault.I0;
            gVar.getClass();
            xy2.b.K(gVar, new xk0.d(gVar, new fz0.c(DateTime.now(), null, 2, null).toString(), null)).f(deviceActivityTrackingSettingActivityDefault, new j(deviceActivityTrackingSettingActivityDefault, 1));
        }
        deviceActivityTrackingSettingActivityDefault.ka();
    }
}
