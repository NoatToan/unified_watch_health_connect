package com.garmin.android.apps.connectmobile.settings.devices.vivomove3;

import android.content.Intent;
import android.os.Bundle;
import b71.o;
import ch1.j6;
import ch1.u0;
import ch1.y5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.a0;
import com.garmin.android.apps.connectmobile.devices.model.x;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.settings.devices.AutoOnDisplayActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import ng1.k0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3AppearanceActivity;", "Lng1/k0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vivomove3AppearanceActivity extends k0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f43190p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f43191o = -1;

    static {
        new a(null);
    }

    @Override // ng1.p
    public final void da() {
        ArrayList arrayList;
        z zVar;
        List<y> list;
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null && (arrayList = deviceSettingsDTO.f33874h) != null && (zVar = (z) arrayList.get(0)) != null && (list = zVar.f34343c) != null) {
            d0.A(list, new o(16), true);
        }
        super.da();
    }

    @Override // ng1.k0
    public final void ea() {
        super.ea();
        y5 y5Var = new y5(this);
        ArrayList arrayList = this.f125956m;
        arrayList.add(y5Var);
        arrayList.add(new j6(this));
        arrayList.add(new u0(this));
    }

    @Override // ng1.k0
    public final void fa() {
        k0.ga(this, this.f125956m, this.f125985k, this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings");
            if (obj != null) {
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                this.f125985k = deviceSettingsDTO;
                k0.ia(this.f125956m, deviceSettingsDTO);
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        initActionBar(true, R.string.appearance_title);
        Intent intent = getIntent();
        this.f43191o = (intent == null || (extras = intent.getExtras()) == null) ? -1L : extras.getLong("GCM_deviceUnitID");
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        ArrayList arrayList;
        DeviceSettingsDTO deviceSettingsDTO;
        x xVar;
        if (obj == null) {
            return;
        }
        if (!(observable instanceof y5)) {
            if (!(observable instanceof j6)) {
                if (observable instanceof u0) {
                    AutoOnDisplayActivity.da(this, this.f125985k, (String) obj);
                    return;
                }
                return;
            }
            Vivomove3ReorderableWidgetActivity.a aVar = Vivomove3ReorderableWidgetActivity.f43205j;
            DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
            deviceSettingsDTO2.getClass();
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) Vivomove3ReorderableWidgetActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
            startActivityForResult(intent, 10);
            return;
        }
        DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
        if (deviceSettingsDTO3 != null && (arrayList = deviceSettingsDTO3.P0) != null && !arrayList.isEmpty() && (deviceSettingsDTO = this.f125985k) != null && (xVar = deviceSettingsDTO.Q0) != null) {
            Map<String, ? extends List<a0>> map = xVar.f34327a;
            map.getClass();
            if (!map.isEmpty()) {
                Vivomove3ClassicWatchFaceSettingsActivity.a aVar2 = Vivomove3ClassicWatchFaceSettingsActivity.f43192h;
                DeviceSettingsDTO deviceSettingsDTO4 = this.f125985k;
                deviceSettingsDTO4.getClass();
                long j8 = this.f43191o;
                aVar2.getClass();
                Intent intent2 = new Intent(this, (Class<?>) Vivomove3ClassicWatchFaceSettingsActivity.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO4);
                intent2.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent2.putExtra("GCM_deviceUnitID", j8);
                startActivityForResult(intent2, 10);
                return;
            }
        }
        Vivomove3SportWatchFaceSettings.a aVar3 = Vivomove3SportWatchFaceSettings.f43206g;
        DeviceSettingsDTO deviceSettingsDTO5 = this.f125985k;
        deviceSettingsDTO5.getClass();
        aVar3.getClass();
        Intent intent3 = new Intent(this, (Class<?>) Vivomove3SportWatchFaceSettings.class);
        intent3.putExtra("GCM_deviceSettings", deviceSettingsDTO5);
        intent3.putExtra("GCM_deviceSettingsTitle", (String) obj);
        startActivityForResult(intent3, 10);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3AppearanceActivity$a;", "", "<init>", "()V", "", "INVALID_UNIT_ID", "J", "", "SECONDARY_SCREEN_REQUEST_CODE", "I", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
