package ng1;

import android.widget.LinearLayout;
import android.widget.Toast;
import ch1.v2;
import ch1.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;

/* JADX INFO: loaded from: classes10.dex */
public class a0 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivityTracking f125907a;

    public a0(DeviceSettingsActivityTracking deviceSettingsActivityTracking) {
        this.f125907a = deviceSettingsActivityTracking;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "DeviceSettingsActivityTracking");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceSettingsActivityTracking deviceSettingsActivityTracking = this.f125907a;
        if (bVar != bVar2) {
            Toast.makeText(deviceSettingsActivityTracking, R.string.txt_error_occurred, 0).show();
        }
        deviceSettingsActivityTracking.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceSettingsActivityTracking deviceSettingsActivityTracking = this.f125907a;
        deviceSettingsActivityTracking.f41975e = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
            return;
        }
        deviceSettingsActivityTracking.hideProgressOverlay();
        deviceSettingsActivityTracking.f41971a = new ch1.a(deviceSettingsActivityTracking);
        ch1.k1 k1Var = new ch1.k1(deviceSettingsActivityTracking);
        deviceSettingsActivityTracking.f41981k = k1Var;
        boolean zG = k1Var.g(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41983m);
        ch1.k1 k1Var2 = deviceSettingsActivityTracking.f41981k;
        if (zG) {
            k1Var2.m(true);
        } else {
            k1Var2.m(false);
        }
        v2 v2Var = new v2(deviceSettingsActivityTracking);
        deviceSettingsActivityTracking.f41982l = v2Var;
        boolean zG2 = v2Var.g(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41983m);
        v2 v2Var2 = deviceSettingsActivityTracking.f41982l;
        if (zG2) {
            v2Var2.m(true);
        } else {
            v2Var2.m(false);
        }
        LinearLayout linearLayout = (LinearLayout) deviceSettingsActivityTracking.findViewById(R.id.page_content);
        boolean zG3 = deviceSettingsActivityTracking.f41971a.g(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41983m);
        ch1.a aVar2 = deviceSettingsActivityTracking.f41971a;
        if (!zG3) {
            aVar2.m(false);
            x2 x2Var = deviceSettingsActivityTracking.f41972b;
            if (x2Var != null) {
                x2Var.m(false);
                return;
            }
            return;
        }
        aVar2.addObserver(deviceSettingsActivityTracking);
        deviceSettingsActivityTracking.f41971a.m(true);
        com.garmin.android.apps.connectmobile.devices.model.k kVar = deviceSettingsActivityTracking.f41983m.T0;
        if (kVar != null) {
            if (kVar.f34191b != null) {
                ig1.h1 h1Var = new ig1.h1(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41974d, deviceSettingsActivityTracking.f41975e, deviceSettingsActivityTracking.f41984n, deviceSettingsActivityTracking, deviceSettingsActivityTracking);
                deviceSettingsActivityTracking.f41973c = h1Var;
                h1Var.g(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41983m);
                linearLayout.addView(deviceSettingsActivityTracking.f41973c.f93305d);
                return;
            }
            x2 x2Var2 = new x2(deviceSettingsActivityTracking);
            deviceSettingsActivityTracking.f41972b = x2Var2;
            boolean zG4 = x2Var2.g(deviceSettingsActivityTracking, deviceSettingsActivityTracking.f41983m);
            deviceSettingsActivityTracking.f41972b.addObserver(deviceSettingsActivityTracking);
            deviceSettingsActivityTracking.f41972b.m(zG4);
            x2 x2Var3 = deviceSettingsActivityTracking.f41972b;
            DeviceSettingsDTO deviceSettingsDTO = deviceSettingsActivityTracking.f41983m;
            x2Var3.getClass();
            if (deviceSettingsDTO != null) {
                deviceSettingsDTO.j1();
            } else {
                vb.h.s("Model is required");
            }
        }
    }
}
