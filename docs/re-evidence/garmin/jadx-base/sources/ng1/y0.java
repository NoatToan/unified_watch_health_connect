package ng1;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class y0 extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f126026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zb0.u0 f126027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f126028c;

    public final void ca(fb2.e eVar) {
        if (this.f126026a.L0()) {
            eVar.m(true);
            if (this.f126026a.e1()) {
                eVar.l(true);
            } else {
                eVar.l(false);
                this.f126026a.f33885m.F(Boolean.FALSE);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f126026a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            this.f126026a = (DeviceSettingsDTO) intent.getExtras().getParcelable("GCM_deviceSettings");
            this.f126027b = (zb0.u0) intent.getSerializableExtra("GCM_deviceEnumValue");
            this.f126028c = intent.getStringExtra("GCM_deviceName");
        }
        if (this.f126026a == null) {
            i2.f(a2.SETTINGS, "NotificationandAlertsBaseClass", "Invalid device settings object while entering device settings notifications and alerts screen!");
            finish();
        }
    }

    public void update(Observable observable, Object obj) {
    }
}
