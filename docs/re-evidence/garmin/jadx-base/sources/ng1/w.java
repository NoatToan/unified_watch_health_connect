package ng1;

import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettings f126018b;

    public /* synthetic */ w(DeviceSettings deviceSettings, int i14) {
        this.f126017a = i14;
        this.f126018b = deviceSettings;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        int i14 = this.f126017a;
        DeviceSettings deviceSettings = this.f126018b;
        switch (i14) {
            case 0:
                int i15 = DeviceSettings.f41956z;
                rd2.h hVarD = rd2.h.d();
                long j8 = deviceSettings.f41957m;
                hVarD.getClass();
                rd2.h.g(j8, 3, z14);
                break;
            case 1:
                int i16 = DeviceSettings.f41956z;
                deviceSettings.ia(1, Boolean.valueOf(z14));
                rd2.h hVarD2 = rd2.h.d();
                long j14 = deviceSettings.f41957m;
                hVarD2.getClass();
                rd2.h.g(j14, 1, z14);
                break;
            case 2:
                int i17 = DeviceSettings.f41956z;
                deviceSettings.ia(2, Boolean.valueOf(z14));
                rd2.h hVarD3 = rd2.h.d();
                long j15 = deviceSettings.f41957m;
                hVarD3.getClass();
                rd2.h.g(j15, 2, z14);
                deviceSettings.f41964v.setEnabled(z14);
                break;
            default:
                int i18 = DeviceSettings.f41956z;
                DeviceSettingsDTO deviceSettingsDTO = deviceSettings.f125985k;
                deviceSettingsDTO.f33873g1 = Boolean.valueOf(z14);
                deviceSettingsDTO.S1("metricsFileTrueupEnabled");
                break;
        }
    }
}
