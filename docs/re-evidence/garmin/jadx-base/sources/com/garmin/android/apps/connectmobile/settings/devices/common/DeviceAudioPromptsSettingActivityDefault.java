package com.garmin.android.apps.connectmobile.settings.devices.common;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import ch1.a1;
import ch1.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import d53.w;
import dh1.j;
import dh1.l;
import dh1.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import org.greenrobot.eventbus.ThreadMode;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import vg1.f0;
import vg1.k0;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceAudioPromptsSettingActivityDefault;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class DeviceAudioPromptsSettingActivityDefault extends f0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f42613k = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f42614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f42615j = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/common/DeviceAudioPromptsSettingActivityDefault$b", "Lku/b;", "Lku/a;", "textSpokenEvent", "", "textSpoken", "(Lku/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ku.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f42616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f42617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f42618c;

        public b() {
        }

        @Override // ku.b
        @l73.k(threadMode = ThreadMode.MAIN)
        public void textSpoken(ku.a textSpokenEvent) {
            textSpokenEvent.getClass();
            String str = textSpokenEvent.f106535a;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 147440860) {
                    if (iHashCode != 1245291027) {
                        if (iHashCode == 1331988336 && str.equals("TestAlertVolumeOperation.lap")) {
                            this.f42616a = true;
                        }
                    } else if (str.equals("TestAlertVolumeOperation.heart.rate")) {
                        this.f42618c = true;
                    }
                } else if (str.equals("TestAlertVolumeOperation.speed")) {
                    this.f42617b = true;
                }
                if (this.f42616a && this.f42617b && this.f42618c) {
                    this.f42616a = false;
                    this.f42617b = false;
                    this.f42618c = false;
                    k kVar = DeviceAudioPromptsSettingActivityDefault.this.f42614i;
                    kVar.getClass();
                    kVar.f27395e = false;
                    kVar.k(kVar.f70344b);
                }
            }
        }
    }

    public static final void pa(f0 f0Var, long j8, String str, DeviceSettingsDTO deviceSettingsDTO) {
        f42613k.getClass();
        Intent intent = new Intent(f0Var, (Class<?>) DeviceAudioPromptsSettingActivityDefault.class);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceProductNbr", str);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        f0Var.startActivityForResult(intent, 1001);
    }

    @Override // vg1.f0
    public void da() {
        this.f42614i = new k(this);
        ca(new j(this), 0);
        ca(new a1(this), 2);
        ca(new r(this), 0);
        ca(new l(this), 0);
        ca(new dh1.e(this), 0);
        dh1.c cVar = new dh1.c(this);
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        deviceSettingsDTOE.getClass();
        if (deviceSettingsDTOE.A1 != null) {
            ca(new a1(this), 2);
            ca(cVar, 0);
            na(false);
        } else {
            na(true);
        }
        if (oa()) {
            ca(new a1(this), 2);
            ca(this.f42614i, 2);
        }
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
        String string = getString(R.string.device_settings_audio_prompts);
        string.getClass();
        return string;
    }

    public final void na(boolean z14) {
        List<String> list;
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        if (deviceSettingsDTOE == null || (list = deviceSettingsDTOE.f33909z) == null || list.isEmpty()) {
            return;
        }
        dh1.b bVar = new dh1.b(this);
        List<zb0.a> listA0 = deviceSettingsDTOE.A0();
        listA0.getClass();
        bVar.f59627e = new ArrayList(listA0);
        if (z14) {
            ca(new a1(this), 2);
        }
        ca(bVar, 0);
    }

    public final boolean oa() {
        String str = u0.M2.f203854a;
        str.getClass();
        String strI = this.f178102a.i();
        strI.getClass();
        if (!w.z(str, strI, false)) {
            String str2 = u0.Y2.f203854a;
            str2.getClass();
            String strI2 = this.f178102a.i();
            strI2.getClass();
            if (!w.z(str2, strI2, false)) {
                String str3 = u0.f203852z4.f203854a;
                str3.getClass();
                String strI3 = this.f178102a.i();
                strI3.getClass();
                if (!w.z(str3, strI3, false)) {
                    String str4 = u0.B4.f203854a;
                    str4.getClass();
                    String strI4 = this.f178102a.i();
                    strI4.getClass();
                    if (!w.z(str4, strI4, false)) {
                        String str5 = u0.A4.f203854a;
                        str5.getClass();
                        String strI5 = this.f178102a.i();
                        strI5.getClass();
                        if (!w.z(str5, strI5, false)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if ((i14 == 100 || i14 == 200 || i14 == 300) && intent != null) {
            ma((DeviceSettingsDTO) a2.c(intent.getExtras(), "GCM_deviceSettings"));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f42615j);
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f42615j);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (observable instanceof l) {
            long deviceUnitId = this.f178102a.getDeviceUnitId();
            String strI = this.f178102a.i();
            DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
            Intent intent = new Intent(this, (Class<?>) DevicePaceSpeedAlertsActivityDefault.class);
            intent.putExtra("GCM_deviceUnitID", deviceUnitId);
            intent.putExtra("GCM_deviceProductNbr", strI);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTOE);
            startActivityForResult(intent, 100);
            return;
        }
        if (observable instanceof r) {
            DevicePowerAlertsActivityDefault.a aVar = DevicePowerAlertsActivityDefault.f42715l;
            long deviceUnitId2 = this.f178102a.getDeviceUnitId();
            String strI2 = this.f178102a.i();
            strI2.getClass();
            DeviceSettingsDTO deviceSettingsDTOE2 = this.f178102a.e();
            deviceSettingsDTOE2.getClass();
            aVar.getClass();
            Intent intent2 = new Intent(this, (Class<?>) DevicePowerAlertsActivityDefault.class);
            intent2.putExtra("GCM_deviceUnitID", deviceUnitId2);
            intent2.putExtra("GCM_deviceProductNbr", strI2);
            intent2.putExtra("GCM_deviceSettings", deviceSettingsDTOE2);
            startActivityForResult(intent2, 300);
            return;
        }
        if (observable instanceof dh1.e) {
            DeviceHeartRateAlertsActivityDefault.a aVar2 = DeviceHeartRateAlertsActivityDefault.f42626l;
            long deviceUnitId3 = this.f178102a.getDeviceUnitId();
            String strI3 = this.f178102a.i();
            DeviceSettingsDTO deviceSettingsDTOE3 = this.f178102a.e();
            aVar2.getClass();
            Intent intent3 = new Intent(this, (Class<?>) DeviceHeartRateAlertsActivityDefault.class);
            intent3.putExtra("GCM_deviceUnitID", deviceUnitId3);
            intent3.putExtra("GCM_deviceProductNbr", strI3);
            intent3.putExtra("GCM_deviceSettings", deviceSettingsDTOE3);
            startActivityForResult(intent3, 200);
            return;
        }
        if (observable instanceof dh1.b) {
            DeviceSettingsDTO deviceSettingsDTOE4 = this.f178102a.e();
            if (deviceSettingsDTOE4 == null || deviceSettingsDTOE4.f33910z1 == null) {
                return;
            }
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).b(this.f178102a.getDeviceUnitId(), deviceSettingsDTOE4.F());
            return;
        }
        if (observable instanceof k) {
            k kVar = this.f42614i;
            kVar.getClass();
            kVar.f27395e = true;
            kVar.k(kVar.f70344b);
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).g(this.f178102a.getDeviceUnitId());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceAudioPromptsSettingActivityDefault$a;", "", "<init>", "()V", "", "PACE_SPEED_ALERTS_REQUEST_CODE", "I", "HEART_RATE_REQUEST_CODE", "POWER_ALERTS_REQUEST_CODE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
