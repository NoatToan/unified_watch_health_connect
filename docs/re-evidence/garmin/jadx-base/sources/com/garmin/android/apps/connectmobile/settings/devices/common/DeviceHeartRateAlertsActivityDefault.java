package com.garmin.android.apps.connectmobile.settings.devices.common;

import ch1.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import dh1.g;
import dh1.h;
import fb2.k;
import java.util.Observable;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceHeartRateAlertsActivityDefault;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceHeartRateAlertsActivityDefault extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f42626l = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f42627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a1 f42628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f42629k;

    @Override // vg1.f0
    public final void da() {
        this.f42627i = new h(this);
        this.f42628j = new a1(this);
        this.f42629k = new g(this);
        ca(new dh1.d(this), 0);
        ca(new k(this), 2);
        ca(this.f42627i, 0);
        ca(this.f42628j, 2);
        ca(this.f42629k, 0);
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
        String string = getString(R.string.hr_alerts_setting_title);
        string.getClass();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.f0
    public final void ja() {
        super.ja();
        h hVar = this.f42627i;
        hVar.getClass();
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) hVar.f70344b;
        if (deviceSettingsDTO != null) {
            hVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO.k0())));
        }
        a1 a1Var = this.f42628j;
        a1Var.getClass();
        h hVar2 = this.f42627i;
        hVar2.getClass();
        a1Var.m(hVar2.j());
        g gVar = this.f42629k;
        gVar.getClass();
        DeviceSettingsDTO deviceSettingsDTO2 = (DeviceSettingsDTO) gVar.f70344b;
        if (deviceSettingsDTO2 != null) {
            gVar.m(BooleanUtils.toBoolean(Boolean.valueOf(deviceSettingsDTO2.k0())));
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (observable instanceof dh1.d) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            h hVar = this.f42627i;
            hVar.getClass();
            hVar.m(zBooleanValue);
            a1 a1Var = this.f42628j;
            a1Var.getClass();
            a1Var.m(zBooleanValue);
            g gVar = this.f42629k;
            gVar.getClass();
            gVar.m(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceHeartRateAlertsActivityDefault$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
