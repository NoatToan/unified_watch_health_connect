package vg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceRunOptionSettingActivityDefault;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class o implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceRunOptionSettingActivityDefault f178143a;

    public o(DeviceRunOptionSettingActivityDefault deviceRunOptionSettingActivityDefault) {
        this.f178143a = deviceRunOptionSettingActivityDefault;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "DeviceRunOptionSettingActivityDefault");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceRunOptionSettingActivityDefault deviceRunOptionSettingActivityDefault = this.f178143a;
        if (bVar != bVar2) {
            Toast.makeText(deviceRunOptionSettingActivityDefault, R.string.txt_error_occurred, 0).show();
        }
        deviceRunOptionSettingActivityDefault.hideProgressOverlay();
        deviceRunOptionSettingActivityDefault.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        DeviceRunOptionSettingActivityDefault deviceRunOptionSettingActivityDefault = this.f178143a;
        long j8 = deviceRunOptionSettingActivityDefault.f42719a;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(deviceRunOptionSettingActivityDefault, deviceRunOptionSettingActivityDefault.f42719a, "DeviceRunOptionSettingActivityDefault");
        }
        Toast.makeText(deviceRunOptionSettingActivityDefault, deviceRunOptionSettingActivityDefault.getText(R.string.msg_settings_saved_successfully), 0).show();
        deviceRunOptionSettingActivityDefault.hideProgressOverlay();
        deviceRunOptionSettingActivityDefault.finish();
    }
}
