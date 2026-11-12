package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import ch1.a1;
import ch1.n2;
import ch1.p1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.Observable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vg1.f0;
import vg1.k0;
import vv.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/HighHeartRateSettings;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HighHeartRateSettings extends f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f42785l = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ch1.e f42786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ch1.e f42787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42788k;

    @Override // vg1.f0
    public final void da() {
        this.f42786i = new ch1.e(this, ch1.e.b.HIGH_THRESHOLD);
        this.f42787j = new ch1.e(this, ch1.e.b.LOW_THRESHOLD);
        ca(new p1(this), 0);
        ch1.e eVar = this.f42786i;
        if (eVar == null) {
            s.m("highAlertThresholdField");
            throw null;
        }
        ca(eVar, 0);
        ca(new h(this, R.string.device_settings_high_heart_rate_help1), 2);
        ca(new a1(this), 2);
        ca(new n2(this), 0);
        ch1.e eVar2 = this.f42787j;
        if (eVar2 == null) {
            s.m("lowAlertThresholdField");
            throw null;
        }
        ca(eVar2, 0);
        ca(new h(this, R.string.device_settings_low_hr_footer_msg), 2);
    }

    @Override // vg1.f0
    public final int ea() {
        return this.f42788k ? 32 : 2;
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.device_settings_abnormal_heart_rate_alerts);
        string.getClass();
        return string;
    }

    @Override // vg1.f0
    public final void ja() {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        super.ja();
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        if (deviceSettingsDTOE == null || (hVar = deviceSettingsDTOE.f33885m) == null) {
            return;
        }
        ch1.e eVar = this.f42786i;
        if (eVar == null) {
            s.m("highAlertThresholdField");
            throw null;
        }
        eVar.m(hVar.getHighHrAlertEnabled());
        ch1.e eVar2 = this.f42787j;
        if (eVar2 != null) {
            eVar2.m(hVar.getLowHrAlertEnabled());
        } else {
            s.m("lowAlertThresholdField");
            throw null;
        }
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42788k = extras.getBoolean("GCM_saveAsExit", false);
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        if (obj instanceof Boolean) {
            if (observable instanceof p1) {
                ch1.e eVar = this.f42786i;
                if (eVar != null) {
                    eVar.m(((Boolean) obj).booleanValue());
                    return;
                } else {
                    s.m("highAlertThresholdField");
                    throw null;
                }
            }
            if (observable instanceof n2) {
                ch1.e eVar2 = this.f42787j;
                if (eVar2 != null) {
                    eVar2.m(((Boolean) obj).booleanValue());
                } else {
                    s.m("lowAlertThresholdField");
                    throw null;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/HighHeartRateSettings$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
