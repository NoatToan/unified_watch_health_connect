package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.widget.ImageView;
import ch1.s5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class VivomoveHRDeviceSettingsWatchFaces extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f42310e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42311a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f42312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceSettingsDTO f42313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s5 f42314d;

    static {
        HashMap map = new HashMap();
        f42310e = map;
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_1, 2131232160);
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_2, 2131232162);
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_3, 2131232164);
        map.put(DeviceSettingsDTO.q.ANALOG_GENERIC_4, 2131232166);
    }

    @Override // android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42311a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42314d = null;
        getIntent().putExtra("GCM_deviceSettings", this.f42313c);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_watch_faces);
        ((ImageView) findViewById(R.id.image_device_frame)).setImageResource(2131232168);
        this.f42312b = (ImageView) findViewById(R.id.image_watchface_current_view);
        if (getIntent().getExtras() != null) {
            this.f42313c = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42313c;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "VivomoveHRDeviceSettingsWatchFaces", "Invalid device settings object while entering device watch face settings !");
            finish();
            return;
        }
        DeviceSettingsDTO.q qVarI0 = deviceSettingsDTO.i0();
        if (qVarI0 != null && this.f42313c.J0().contains(qVarI0)) {
            this.f42312b.setImageResource(((Integer) f42310e.get(qVarI0)).intValue());
        }
        initActionBar(true, getString(R.string.device_setting_glanceable_widget));
        this.f42314d = new s5(this);
        ArrayList<fb2.e> arrayList = this.f42311a;
        arrayList.clear();
        arrayList.add(this.f42314d);
        for (fb2.e eVar : arrayList) {
            i2.k(a2.SETTINGS, "VivomoveHRDeviceSettingsWatchFaces", "Initializing: " + eVar.toString());
            boolean zG = eVar.g(this, this.f42313c);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "VivomoveHRDeviceSettingsWatchFaces", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            DeviceSettingsDTO.q qVar = (DeviceSettingsDTO.q) obj;
            HashMap map = f42310e;
            if (map.containsKey(qVar)) {
                this.f42312b.setImageResource(((Integer) map.get(qVar)).intValue());
            }
            this.f42314d.A(this, this.f42313c);
            this.f42314d.m(true);
        }
    }
}
