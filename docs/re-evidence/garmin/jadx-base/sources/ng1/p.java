package ng1;

import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f125974l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d80.f f125975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f125976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sd2.f f125977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f125978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f125979e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zb0.u0 f125980f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f125981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f125982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f125983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONObject f125984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DeviceSettingsDTO f125985k;

    public final boolean ca() {
        d80.f fVar = this.f125975a;
        return (fVar == null || fVar.c()) ? false : true;
    }

    public void da() {
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        String strA = null;
        if (deviceSettingsDTO != null && this.f125984j != null) {
            strA = c22.n0.a(deviceSettingsDTO.Y1(), this.f125984j, null);
        }
        i2.a(a2.SETTINGS, "BaseDeviceSettings", "Settings JSON delta = " + strA);
        DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
        if (deviceSettingsDTO2 == null || !c22.n0.b(deviceSettingsDTO2.Y1(), this.f125984j)) {
            finish();
            return;
        }
        if (!hb2.i.a(this)) {
            if (km2.a.d(this.f125976b, km2.a.b())) {
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
                finish();
                return;
            }
            return;
        }
        if (strA.contains("metricsFileTrueupEnabled")) {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.devices_settings_device_settings).setMessage(R.string.settings_saved_message).setCancelable(false).setPositiveButton(R.string.lbl_ok, new hg1.g(18, this, strA)).show();
            return;
        }
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f125976b;
        o oVar = new o(this);
        eVarN.getClass();
        this.f125975a = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, strA, oVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            long j8 = extras.getLong("GCM_deviceUnitID", -1L);
            this.f125976b = j8;
            if (j8 <= 0) {
                i2.f(a2.SETTINGS, "BaseDeviceSettings", "Invalid device unit ID while entering device settings!");
                finish();
                return;
            }
            rd2.j jVar = rd2.f.a().f152045a;
            long j14 = this.f125976b;
            jVar.getClass();
            sd2.f fVarI = rd2.j.i(j14, null);
            this.f125977c = fVarI;
            if (fVarI == null) {
                i2.f(a2.SETTINGS, "BaseDeviceSettings", am.j.i(this.f125976b, ", finishing.", new StringBuilder("Could not get database record from unit ID ")));
                finish();
                return;
            }
            a2 a2Var = a2.SETTINGS;
            i2.a(a2Var, "BaseDeviceSettings", "measurementUnitSettingCapable for " + this.f125977c.getProductDisplayName() + ": " + this.f125977c.X0());
            String string = extras.getString("GCM_deviceProductNbr");
            this.f125978d = string;
            if (string == null) {
                i2.f36769a.getClass();
                i2.a.f(a2Var, "BaseDeviceSettings", "Invalid device product number while entering device settings!");
                finish();
                return;
            }
            this.f125979e = getIntent().getStringExtra("GCM_currentFirmwareVersion");
            this.f125980f = (zb0.u0) zb0.u0.f203782n6.get(this.f125978d);
            this.f125981g = extras.getString("GCM_deviceDisplayName", "");
            this.f125982h = extras.getString("GCM_deviceName", "");
            this.f125983i = extras.getString("GCM_extra_device_image_url", "");
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            this.f125985k = deviceSettingsDTO;
            if (deviceSettingsDTO != null) {
                this.f125984j = deviceSettingsDTO.Y1();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        d80.f fVar = this.f125975a;
        if (fVar != null) {
            fVar.f58259c = null;
        }
    }

    public void update(Observable observable, Object obj) {
    }
}
