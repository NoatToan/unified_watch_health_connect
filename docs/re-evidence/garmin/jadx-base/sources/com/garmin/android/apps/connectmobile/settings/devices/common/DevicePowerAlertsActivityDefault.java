package com.garmin.android.apps.connectmobile.settings.devices.common;

import ch1.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import dh1.p;
import dh1.q;
import dh1.s;
import fb2.k;
import java.util.Observable;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DevicePowerAlertsActivityDefault;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevicePowerAlertsActivityDefault extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f42715l = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f42716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a1 f42717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f42718k;

    @Override // vg1.f0
    public final void da() {
        this.f42716i = new q(this);
        this.f42717j = new a1(this);
        this.f42718k = new p(this);
        ca(new s(this), 0);
        ca(new k(this), 2);
        ca(this.f42716i, 0);
        ca(this.f42717j, 2);
        ca(this.f42718k, 0);
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
        String string = getString(R.string.audio_prompts_power_alert_title);
        string.getClass();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.f0
    public final void ja() {
        super.ja();
        q qVar = this.f42716i;
        qVar.getClass();
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) qVar.f70344b;
        if (deviceSettingsDTO != null) {
            qVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO.o0())));
        }
        a1 a1Var = this.f42717j;
        a1Var.getClass();
        q qVar2 = this.f42716i;
        qVar2.getClass();
        a1Var.m(qVar2.j());
        p pVar = this.f42718k;
        pVar.getClass();
        DeviceSettingsDTO deviceSettingsDTO2 = (DeviceSettingsDTO) pVar.f70344b;
        if (deviceSettingsDTO2 != null) {
            pVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO2.o0())));
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == null || obj == null || !(observable instanceof s)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        q qVar = this.f42716i;
        qVar.getClass();
        qVar.m(zBooleanValue);
        a1 a1Var = this.f42717j;
        a1Var.getClass();
        a1Var.m(zBooleanValue);
        p pVar = this.f42718k;
        pVar.getClass();
        pVar.m(zBooleanValue);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DevicePowerAlertsActivityDefault$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
