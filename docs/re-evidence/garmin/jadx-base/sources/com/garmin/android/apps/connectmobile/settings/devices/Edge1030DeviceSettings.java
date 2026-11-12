package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.widget.LinearLayout;
import ch1.a6;
import ch1.b6;
import ch1.g3;
import ch1.h6;
import ch1.n;
import ch1.q4;
import ch1.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Observable;
import ng1.k0;

/* JADX INFO: loaded from: classes10.dex */
public class Edge1030DeviceSettings extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b6 f42056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a6 f42057p;

    @Override // ng1.k0
    public final void ea() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        this.f42056o = new b6(this, this.f125976b);
        this.f42057p = new a6(this, this.f125976b);
        if (km2.a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal())) {
            arrayList.add(new h6(this, this.f125976b));
        }
        arrayList.add(new v(this, this.f125976b));
        arrayList.add(this.f42056o);
        arrayList.add(this.f42057p);
        arrayList.add(new n(this, this.f125976b, true));
        arrayList.add(new g3(this));
        arrayList.add(new q4(this));
    }

    @Override // ng1.k0
    public final void fa() {
        for (fb2.e eVar : this.f125956m) {
            i2.k(a2.SETTINGS, "Edge1030DeviceSettings", "Initializing: " + eVar.toString());
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            eVar.m(deviceSettingsDTO != null && eVar.g(this, deviceSettingsDTO));
            eVar.addObserver(this);
            eVar.l(true);
            if (eVar instanceof a6) {
                eVar.l(this.f42056o.q(null));
            }
        }
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar : this.f125956m) {
            linearLayout.addView(eVar.a());
            if ((eVar instanceof a6) || (eVar instanceof h6)) {
                linearLayout.addView(fb2.g.a(this));
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    public final void ja(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO != null) {
            ArrayList<fb2.e> arrayList = this.f125956m;
            if (arrayList.size() > 0) {
                for (fb2.e eVar : arrayList) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                ja(deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
            i2.a(a2.SETTINGS, "Edge1030DeviceSettings", "onActivityResult: mDeviceSettingsDTO=" + this.f125985k);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ja(this.f125985k);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Edge1030DeviceSettings", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof n) {
                long j8 = this.f125976b;
                String str = this.f125978d;
                AudioPromptsSettingsActivity.f30263h.getClass();
                Intent intent = new Intent(this, (Class<?>) AudioPromptsSettingsActivity.class);
                intent.putExtra("GCM_deviceUnitID", j8);
                intent.putExtra("GCM_deviceProductNbr", str);
                startActivity(intent);
                return;
            }
            if ((observable instanceof b6) && (obj instanceof Boolean)) {
                this.f42057p.l(((Boolean) obj).booleanValue());
            } else {
                if (observable instanceof q4) {
                    TimeDateSystemDeviceSettings.da(this, this.f125985k, (String) obj);
                    return;
                }
                if (observable instanceof h6) {
                    GCMWiFiNetworksActivity.f43245f.g(this, this.f125976b, this.f125978d, this.f125981g, this.f125983i);
                }
            }
        }
    }
}
