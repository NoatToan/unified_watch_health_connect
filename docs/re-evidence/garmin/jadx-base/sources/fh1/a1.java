package fh1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a1 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f71584i;

    public a1(Context context) {
        super(context);
        this.f71584i = View.generateViewId();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        com.garmin.android.apps.connectmobile.devices.model.y yVarZ = z(deviceSettingsDTO);
        return yVarZ != null && yVarZ.f34330c;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        return z(deviceSettingsDTO) != null;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71595i() {
        return this.f71584i;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        com.garmin.android.apps.connectmobile.devices.model.y yVarZ = z(deviceSettingsDTO);
        if (yVarZ != null) {
            yVarZ.f34330c = z14;
        }
    }

    public abstract com.garmin.android.apps.connectmobile.devices.model.y z(DeviceSettingsDTO deviceSettingsDTO);
}
