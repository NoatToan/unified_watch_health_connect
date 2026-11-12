package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class i0 implements lj0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceUserSettingsActivity f125943a;

    public i0(DeviceUserSettingsActivity deviceUserSettingsActivity) {
        this.f125943a = deviceUserSettingsActivity;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device registration details from GC ["), "].", a2Var, "DeviceUserSettingsActivity");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125943a;
        if (bVar != bVar2) {
            Toast.makeText(deviceUserSettingsActivity, R.string.txt_error_occurred, 0).show();
        }
        int i14 = DeviceUserSettingsActivity.f42010c1;
        deviceUserSettingsActivity.ca();
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject((String) aVar.f112977a);
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("fetchDeviceRegistrationDetails.onResultsSucceeded: "), a2.SETTINGS, "DeviceUserSettingsActivity");
            jSONObject = null;
        }
        DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125943a;
        if (jSONObject != null) {
            deviceUserSettingsActivity.f42021i = jSONObject.optBoolean("handednessCapable");
            deviceUserSettingsActivity.f42022j = jSONObject.optBoolean("intensityMinutesGoalCapable") || jSONObject.optBoolean("moderateIntensityMinutesGoalCapable");
            deviceUserSettingsActivity.f42023k = jSONObject.optBoolean("floorsClimbedGoalCapable");
            deviceUserSettingsActivity.f42025l = jSONObject.optBoolean("powerZonesCapable");
            deviceUserSettingsActivity.f42026m = jSONObject.optBoolean("sleepTimeCapable");
            deviceUserSettingsActivity.Z = jSONObject.optBoolean("xcSkiPowerZonesCapable");
        }
        if (!deviceUserSettingsActivity.f42025l) {
            deviceUserSettingsActivity.A.setVisibility(8);
        }
        if (!deviceUserSettingsActivity.Z) {
            deviceUserSettingsActivity.showProgressOverlay();
            uk1.j jVarN = uk1.j.N();
            DeviceUserSettingsActivity.g gVar = deviceUserSettingsActivity.f42012a1;
            jVarN.getClass();
            gVar.getClass();
            deviceUserSettingsActivity.T = com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.b(jVarN), gVar);
        }
        if (deviceUserSettingsActivity.f42022j || deviceUserSettingsActivity.f42023k) {
            deviceUserSettingsActivity.f42028o++;
            xk0.g gVar2 = deviceUserSettingsActivity.X;
            gVar2.getClass();
            xy2.b.K(gVar2, new xk0.d(gVar2, new fz0.c(DateTime.now(), null, 2, null).toString(), null)).f(deviceUserSettingsActivity, new g0(deviceUserSettingsActivity, 1));
        }
        deviceUserSettingsActivity.ca();
    }
}
