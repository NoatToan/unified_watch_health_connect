package ng1;

import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForerunnerDeviceSettings f126024b;

    public /* synthetic */ x0(ForerunnerDeviceSettings forerunnerDeviceSettings, int i14) {
        this.f126023a = i14;
        this.f126024b = forerunnerDeviceSettings;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        int i14 = this.f126023a;
        ForerunnerDeviceSettings forerunnerDeviceSettings = this.f126024b;
        switch (i14) {
            case 0:
                int i15 = ForerunnerDeviceSettings.F;
                forerunnerDeviceSettings.f125985k.f33885m.F(Boolean.valueOf(z14));
                break;
            default:
                int i16 = ForerunnerDeviceSettings.F;
                DeviceSettingsDTO deviceSettingsDTO = forerunnerDeviceSettings.f125985k;
                deviceSettingsDTO.f33873g1 = Boolean.valueOf(z14);
                deviceSettingsDTO.S1("metricsFileTrueupEnabled");
                break;
        }
    }
}
