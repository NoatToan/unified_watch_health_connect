package com.garmin.android.apps.connectmobile.settings.devices.common;

import ch1.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import dh1.k;
import dh1.n;
import dh1.o;
import java.util.Observable;
import org.apache.commons.lang3.BooleanUtils;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePaceSpeedAlertsActivityDefault extends f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f42640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a1 f42641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f42642k;

    @Override // vg1.f0
    public final void da() {
        this.f42640i = new o(this);
        this.f42641j = new a1(this);
        this.f42642k = new n(this);
        ca(new k(this), 0);
        ca(new fb2.k(this), 2);
        ca(this.f42640i, 0);
        ca(this.f42641j, 2);
        ca(this.f42642k, 0);
    }

    @Override // vg1.f0
    public final int ea() {
        return 2;
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        return getString(R.string.audio_prompts_pace_speed_alerts_title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.f0
    public final void ja() {
        super.ja();
        o oVar = this.f42640i;
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) oVar.f70344b;
        if (deviceSettingsDTO != null) {
            oVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO.x0())));
        }
        this.f42641j.m(this.f42640i.j());
        n nVar = this.f42642k;
        DeviceSettingsDTO deviceSettingsDTO2 = (DeviceSettingsDTO) nVar.f70344b;
        if (deviceSettingsDTO2 != null) {
            nVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO2.x0())));
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == null || obj == null || !(observable instanceof k)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f42640i.m(zBooleanValue);
        this.f42641j.m(zBooleanValue);
        this.f42642k.m(zBooleanValue);
    }
}
