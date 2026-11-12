package fh1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class q0 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f71603i;

    public q0(Context context) {
        super(context);
        this.f71603i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33872g.D("page_move_bar");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.f33872g.I("page_move_bar");
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f71603i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_screen_move_bar);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33872g.h0("page_move_bar", Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
