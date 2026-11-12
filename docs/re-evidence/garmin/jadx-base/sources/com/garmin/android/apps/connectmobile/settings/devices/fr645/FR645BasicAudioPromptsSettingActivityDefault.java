package com.garmin.android.apps.connectmobile.settings.devices.fr645;

import am.a2;
import android.content.Intent;
import android.os.Bundle;
import ch1.a1;
import ch1.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsConfigActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import dh1.c;
import dh1.f;
import dh1.j;
import dh1.l;
import dh1.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import o13.e;
import org.apache.commons.lang3.BooleanUtils;
import org.greenrobot.eventbus.ThreadMode;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.x;
import vg1.f0;
import vg1.k0;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645BasicAudioPromptsSettingActivityDefault;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR645BasicAudioPromptsSettingActivityDefault extends f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f43002n = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f43003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f43004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f43005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f43006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f43007m = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/fr645/FR645BasicAudioPromptsSettingActivityDefault$b", "Lku/b;", "Lku/a;", "textSpokenEvent", "", "textSpoken", "(Lku/a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ku.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f43008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f43009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f43010c;

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
                            this.f43008a = true;
                        }
                    } else if (str.equals("TestAlertVolumeOperation.heart.rate")) {
                        this.f43010c = true;
                    }
                } else if (str.equals("TestAlertVolumeOperation.speed")) {
                    this.f43009b = true;
                }
                if (this.f43008a && this.f43009b && this.f43010c) {
                    this.f43008a = false;
                    this.f43009b = false;
                    this.f43010c = false;
                    k kVar = FR645BasicAudioPromptsSettingActivityDefault.this.f43003i;
                    kVar.getClass();
                    kVar.f27395e = false;
                    kVar.k(kVar.f70344b);
                }
            }
        }
    }

    @Override // vg1.f0
    public final void da() {
        this.f43004j = new j(this);
        this.f43005k = new m(this);
        this.f43006l = new f(this);
        this.f43003i = new k(this);
        ca(this.f43004j, 0);
        ca(this.f43005k, 0);
        ca(this.f43006l, 0);
        oa();
        c cVar = new c(this);
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        deviceSettingsDTOE.getClass();
        if (deviceSettingsDTOE.A1 != null) {
            ca(new a1(this), 2);
            ca(cVar, 0);
            na(false);
        } else {
            na(true);
        }
        ca(new a1(this), 2);
        ca(this.f43003i, 2);
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
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        if (deviceSettingsDTOE != null) {
            List<String> list = deviceSettingsDTOE.f33909z;
            if ((list == null || list.isEmpty()) && deviceSettingsDTOE.f33910z1 == null) {
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
    }

    public final void oa() {
        d0 d0Var = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
        f fVar = this.f43006l;
        fVar.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) fVar.a();
        m mVar = this.f43005k;
        mVar.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) mVar.a();
        long deviceUnitId = this.f178102a.getDeviceUnitId();
        lu.a aVar = lu.a.HEART_RATE;
        if (d0Var.F(deviceUnitId, aVar)) {
            String strV = d0Var.v(x.k(getString(d0Var.e(this.f178102a.getDeviceUnitId()).f114933a), d0Var.f(this.f178102a.getDeviceUnitId(), aVar)));
            gCMComplexTwoLineButton.getClass();
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(strV);
        } else {
            gCMComplexTwoLineButton.getClass();
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_off));
        }
        long deviceUnitId2 = this.f178102a.getDeviceUnitId();
        lu.a aVar2 = lu.a.PACE_SPEED;
        if (d0Var.F(deviceUnitId2, aVar2)) {
            String strV2 = d0Var.v(x.k(getString(d0Var.d(this.f178102a.getDeviceUnitId()).f114941a), d0Var.f(this.f178102a.getDeviceUnitId(), aVar2)));
            gCMComplexTwoLineButton2.getClass();
            gCMComplexTwoLineButton2.setButtonBottomLeftLabel(strV2);
        } else {
            gCMComplexTwoLineButton2.getClass();
            gCMComplexTwoLineButton2.setButtonBottomLeftLabel(getString(R.string.lbl_off));
        }
        DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
        if (deviceSettingsDTOE != null) {
            deviceSettingsDTOE.f33886m1 = Boolean.valueOf(d0Var.F(this.f178102a.getDeviceUnitId(), lu.a.LAP));
            deviceSettingsDTOE.f33888n1 = Boolean.valueOf(d0Var.F(this.f178102a.getDeviceUnitId(), aVar2));
            deviceSettingsDTOE.f33890o1 = d0Var.d(this.f178102a.getDeviceUnitId()).f114943c;
            deviceSettingsDTOE.V1(d0Var.h(this.f178102a.getDeviceUnitId(), aVar2));
            deviceSettingsDTOE.f33896r1 = Boolean.valueOf(d0Var.F(this.f178102a.getDeviceUnitId(), aVar));
            deviceSettingsDTOE.f33897s1 = d0Var.e(this.f178102a.getDeviceUnitId()).f114934b;
            deviceSettingsDTOE.M1(d0Var.h(this.f178102a.getDeviceUnitId(), aVar));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if ((i14 == 100 || i14 == 200) && intent != null) {
            ma((DeviceSettingsDTO) a2.c(intent.getExtras(), "GCM_deviceSettings"));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        oa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f43007m);
    }

    @Override // vg1.f0, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f43007m);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        obj.getClass();
        if (observable instanceof l) {
            Intent intent = new Intent(this, (Class<?>) AudioPromptsConfigActivity.class);
            intent.putExtra("GCM_deviceUnitID", this.f178102a.getDeviceUnitId());
            intent.putExtra("extra.type.enum.name", "PACE_SPEED");
            startActivity(intent);
            return;
        }
        if (observable instanceof j) {
            d0 d0Var = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
            long deviceUnitId = this.f178102a.getDeviceUnitId();
            DeviceSettingsDTO deviceSettingsDTOE = this.f178102a.e();
            deviceSettingsDTOE.getClass();
            Boolean bool = deviceSettingsDTOE.f33886m1;
            d0Var.L(deviceUnitId, BooleanUtils.toBoolean(Boolean.valueOf(bool != null ? bool.booleanValue() : false)), lu.a.LAP);
            return;
        }
        if (observable instanceof dh1.e) {
            Intent intent2 = new Intent(this, (Class<?>) AudioPromptsConfigActivity.class);
            intent2.putExtra("GCM_deviceUnitID", this.f178102a.getDeviceUnitId());
            intent2.putExtra("extra.type.enum.name", "HEART_RATE");
            startActivity(intent2);
            return;
        }
        if (observable instanceof dh1.b) {
            DeviceSettingsDTO deviceSettingsDTOE2 = this.f178102a.e();
            if (deviceSettingsDTOE2 == null || deviceSettingsDTOE2.f33910z1 == null) {
                return;
            }
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).b(this.f178102a.getDeviceUnitId(), deviceSettingsDTOE2.F());
            return;
        }
        if (observable instanceof k) {
            k kVar = this.f43003i;
            kVar.getClass();
            kVar.f27395e = true;
            kVar.k(kVar.f70344b);
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).g(this.f178102a.getDeviceUnitId());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645BasicAudioPromptsSettingActivityDefault$a;", "", "<init>", "()V", "", "PACE_SPEED_ALERTS_REQUEST_CODE", "I", "HEART_RATE_REQUEST_CODE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
