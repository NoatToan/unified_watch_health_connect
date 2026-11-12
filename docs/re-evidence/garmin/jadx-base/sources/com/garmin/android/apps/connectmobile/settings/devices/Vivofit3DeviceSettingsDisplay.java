package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch1.d5;
import ch1.e5;
import ch1.o5;
import ch1.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit3DeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o5 f42270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42271b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceSettingsDTO f42272c;

    @Override // android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42271b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42270a = null;
        getIntent().putExtra("GCM_deviceSettings", this.f42272c);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 20 || i14 == 21) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42271b) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f42272c = deviceSettingsDTO;
                    getIntent().putExtra("GCM_deviceSettings", this.f42272c);
                    setResult(-1, getIntent());
                }
                i2.a(a2.SETTINGS, "Vivofit3DeviceSettingsDisplay", "onActivityResult: mDeviceSettingsDTO=" + this.f42272c);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivofit3_display);
        if (getIntent().getExtras() != null) {
            this.f42272c = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_display);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42272c == null) {
            i2.f(a2.SETTINGS, "Vivofit3DeviceSettingsDisplay", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        this.f42270a = new o5(this);
        ArrayList<fb2.e> arrayList = this.f42271b;
        arrayList.clear();
        arrayList.add(new e5(this));
        arrayList.add(new d5(this));
        arrayList.add(new t3(this));
        arrayList.add(this.f42270a);
        for (fb2.e eVar : arrayList) {
            i2.k(a2.SETTINGS, "Vivofit3DeviceSettingsDisplay", "Initializing: " + eVar.toString());
            boolean zG = eVar.g(this, this.f42272c);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivofit3DeviceSettingsDisplay", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof e5) {
                DeviceSettingsDTO deviceSettingsDTO = this.f42272c;
                o.c[] cVarArr = Vivofit3DeviceSettingsScreensDefault.f42273e;
                Intent intent = new Intent(this, (Class<?>) Vivofit3DeviceSettingsScreensDefault.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 20);
            }
            if (observable instanceof d5) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f42272c;
                o.c[] cVarArr2 = Vivofit3DeviceSettingsScreensDuringActivity.f42278d;
                Intent intent2 = new Intent(this, (Class<?>) Vivofit3DeviceSettingsScreensDuringActivity.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent2.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent2, 21);
            }
            if ((observable instanceof t3) && (obj instanceof DeviceSettingsDTO.n)) {
                DeviceSettingsDTO.n nVar = (DeviceSettingsDTO.n) obj;
                DeviceSettingsDTO.n nVar2 = DeviceSettingsDTO.n.SINGLE_SCREEN;
                o5 o5Var = this.f42270a;
                if (nVar != nVar2) {
                    o5Var.m(false);
                } else {
                    o5Var.k(this.f42272c);
                    this.f42270a.m(true);
                }
            }
        }
    }
}
