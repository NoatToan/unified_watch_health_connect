package com.garmin.android.apps.connectmobile.settings.devices.vivomove3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.g3;
import ch1.k2;
import ch1.m0;
import ch1.n6;
import ch1.p0;
import ch1.s2;
import ch1.s4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameWidgetActivity;
import fb2.e;
import fb2.g;
import fb2.r;
import java.util.ArrayList;
import java.util.Observable;
import ng1.k0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3GeneralSettingsActivity;", "Lng1/k0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Vivomove3GeneralSettingsActivity extends k0 {
    static {
        new a(null);
    }

    @Override // ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new p0(this));
        arrayList.add(new n6(this));
        arrayList.add(new g3(this));
        arrayList.add(new s4(this));
        arrayList.add(new m0(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // ng1.k0
    public final void ha() {
        if (this.f125985k == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        ArrayList<e> arrayList = this.f125956m;
        for (e eVar : arrayList) {
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            deviceSettingsDTO.getClass();
            if (eVar.h(deviceSettingsDTO) && !(eVar instanceof r)) {
                linearLayout.addView(g.a(this));
            }
            linearLayout.addView(eVar.a());
        }
        linearLayout.addView(g.a(this));
        k0.ga(this, arrayList, this.f125985k, this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings");
            if (obj != null) {
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                k0.ia(this.f125956m, deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.lbl_general);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof p0) {
            DeviceNameWidgetActivity.a aVar = DeviceNameWidgetActivity.f42633g;
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            aVar.getClass();
            DeviceNameWidgetActivity.a.a(this, deviceSettingsDTO, 10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivomove3/Vivomove3GeneralSettingsActivity$a;", "", "<init>", "()V", "", "SECONDARY_SCREEN_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
