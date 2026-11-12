package com.garmin.android.apps.connectmobile.settings.devices.lumen;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.e;
import ch1.a1;
import ch1.i6;
import ch1.u0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.LumenAutoOnDisplayActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.ReOrderableWidgetActivity;
import da2.d;
import java.util.Observable;
import la2.c;
import la2.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.f0;
import vg1.k0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/lumen/LumenAppearanceActivity;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LumenAppearanceActivity extends f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f43126j = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/lumen/LumenAppearanceActivity$b", "Lla2/a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            LumenAppearanceActivity lumenAppearanceActivity = LumenAppearanceActivity.this;
            e.a aVar = new e.a(lumenAppearanceActivity);
            aVar.setTitle(R.string.connect_iq_device_has_disconnected_title);
            aVar.setMessage(R.string.connect_iq_device_has_disconnected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, new sa2.b(lumenAppearanceActivity, 2));
            e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
    }

    static {
        new a(null);
    }

    @Override // vg1.f0
    public final void da() {
        ca(new i6(this, R.string.connect_iq_widgets), 0);
        ca(new a1(this), 2);
        ca(new u0(this), 0);
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.appearance_title);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        if (i14 == 10 && i15 == -1) {
            Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings");
            obj.getClass();
            ma((DeviceSettingsDTO) obj);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f43125i) {
            d.b().f58886a.i(this.f43126j);
            this.f43125i = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f43125i) {
            return;
        }
        d.b().f58886a.b(this.f43126j);
        this.f43125i = true;
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTOE;
        observable.getClass();
        if (obj != null) {
            if (!(observable instanceof i6)) {
                if (!(observable instanceof u0) || (deviceSettingsDTOE = this.f178102a.e()) == null) {
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) LumenAutoOnDisplayActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTOE);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
                return;
            }
            boolean zA = ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f178102a.getDeviceUnitId());
            if (!zA) {
                e.a aVar = new e.a(this);
                aVar.setTitle(R.string.connect_iq_device_not_connected_title);
                aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
                aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                e eVarCreate = aVar.create();
                eVarCreate.getClass();
                eVarCreate.show();
            }
            if (zA) {
                DeviceSettingsDTO deviceSettingsDTOE2 = this.f178102a.e();
                Intent intent2 = new Intent(this, (Class<?>) ReOrderableWidgetActivity.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTOE2);
                startActivityForResult(intent2, 10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/lumen/LumenAppearanceActivity$a;", "", "<init>", "()V", "", "SECONDARY_SCREEN_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
