package fh1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class f0 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f71590i;

    public f0(Context context) {
        super(context);
        this.f71590i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33863b1.f185491i.D("page_time");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.f33863b1.f185491i.e0().booleanValue();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f71590i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.lbl_time);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33863b1.f185491i.x0(Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
