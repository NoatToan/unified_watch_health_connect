package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;

/* JADX INFO: loaded from: classes10.dex */
public class h1 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VivosmartDeviceSettingsOrientation f125940a;

    public h1(VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation) {
        this.f125940a = vivosmartDeviceSettingsOrientation;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "VVSSettingsOrientation");
        lj0.b bVar2 = lj0.b.f112951e;
        VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = this.f125940a;
        if (bVar != bVar2) {
            Toast.makeText(vivosmartDeviceSettingsOrientation, R.string.txt_error_occurred, 0).show();
        }
        vivosmartDeviceSettingsOrientation.hideProgressOverlay();
        vivosmartDeviceSettingsOrientation.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = this.f125940a;
        if (obj == null) {
            a(lj0.b.f112956j);
        } else {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
            vivosmartDeviceSettingsOrientation.f42384l = deviceSettingsDTO;
            vivosmartDeviceSettingsOrientation.f42373a.setButtonBottomLeftLabel(vivosmartDeviceSettingsOrientation.getString(deviceSettingsDTO.e0().f34073b));
            vivosmartDeviceSettingsOrientation.da();
            vivosmartDeviceSettingsOrientation.ea();
            vivosmartDeviceSettingsOrientation.fa();
            com.garmin.android.apps.connectmobile.devices.model.o oVar = vivosmartDeviceSettingsOrientation.f42384l.f33872g;
            if (oVar != null && vivosmartDeviceSettingsOrientation.f42383k) {
                if (oVar.D("page_music")) {
                    vivosmartDeviceSettingsOrientation.f42384l.f33872g.o0(Boolean.TRUE);
                    vivosmartDeviceSettingsOrientation.f42389q = true;
                }
                if (vivosmartDeviceSettingsOrientation.f42384l.f33872g.D("page_notifications")) {
                    vivosmartDeviceSettingsOrientation.f42384l.f33872g.p0(Boolean.TRUE);
                    vivosmartDeviceSettingsOrientation.f42389q = true;
                }
                if (vivosmartDeviceSettingsOrientation.f42384l.f33872g.D("page_weather")) {
                    vivosmartDeviceSettingsOrientation.f42384l.f33872g.h0("page_weather", Boolean.TRUE);
                    vivosmartDeviceSettingsOrientation.f42389q = true;
                }
            }
        }
        vivosmartDeviceSettingsOrientation.hideProgressOverlay();
    }
}
