package ng1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lng1/e;", "Ld80/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlarmsSettingsActivity f125923a;

    public e(AlarmsSettingsActivity alarmsSettingsActivity) {
        this.f125923a = alarmsSettingsActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        bVar.getClass();
        String str = "Error fetching device settings from GC [" + bVar.f112957a.name() + "].";
        aVar.getClass();
        i2.a.f(a2Var, "AlarmsSettingsActivity", str);
        boolean zA = bVar.a();
        AlarmsSettingsActivity.a aVar2 = AlarmsSettingsActivity.f41854n;
        AlarmsSettingsActivity alarmsSettingsActivity = this.f125923a;
        alarmsSettingsActivity.displayFailedMessage(zA);
        alarmsSettingsActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        aVar.getClass();
        if (obj == null) {
            a(lj0.b.f112956j);
        }
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        AlarmsSettingsActivity alarmsSettingsActivity = this.f125923a;
        alarmsSettingsActivity.f41858d = deviceSettingsDTO;
        if (deviceSettingsDTO != null) {
            List<com.garmin.android.apps.connectmobile.devices.model.i> listD = deviceSettingsDTO.D();
            if (listD != null) {
                alarmsSettingsActivity.f41859e = new ArrayList<>(listD.size());
                for (com.garmin.android.apps.connectmobile.devices.model.i iVar : listD) {
                    if (iVar != null) {
                        ArrayList<com.garmin.android.apps.connectmobile.devices.model.i> arrayList = alarmsSettingsActivity.f41859e;
                        arrayList.getClass();
                        arrayList.add(new com.garmin.android.apps.connectmobile.devices.model.i(iVar));
                    }
                }
            }
            alarmsSettingsActivity.ca();
            ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).s(alarmsSettingsActivity.f41857c);
        }
        alarmsSettingsActivity.hideProgressOverlay();
    }
}
