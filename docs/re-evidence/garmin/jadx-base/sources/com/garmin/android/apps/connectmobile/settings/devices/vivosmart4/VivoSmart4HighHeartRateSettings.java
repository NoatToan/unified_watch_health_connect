package com.garmin.android.apps.connectmobile.settings.devices.vivosmart4;

import android.content.Intent;
import android.os.Bundle;
import ch1.h;
import ch1.q1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.HighHeartRateSettings;
import fb2.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4HighHeartRateSettings;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VivoSmart4HighHeartRateSettings extends c implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43225d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f43226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43227b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f43228c;

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f43226a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_settings_high_heart_alert);
        initActionBar(true, R.string.device_settings_abnormal_heart_rate);
        Boolean boolValueOf = null;
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.f43226a = (DeviceSettingsDTO) (extras != null ? extras.get("GCM_deviceSettings") : null);
        }
        if (this.f43226a == null) {
            finish();
            return;
        }
        this.f43228c = new h(this);
        ArrayList<e> arrayList = this.f43227b;
        arrayList.clear();
        arrayList.add(new q1(this));
        h hVar2 = this.f43228c;
        if (hVar2 == null) {
            s.m("alertThresholdField");
            throw null;
        }
        arrayList.add(hVar2);
        for (e eVar : arrayList) {
            DeviceSettingsDTO deviceSettingsDTO = this.f43226a;
            deviceSettingsDTO.getClass();
            boolean zG = eVar.g(this, deviceSettingsDTO);
            eVar.addObserver(this);
            eVar.m(zG);
        }
        DeviceSettingsDTO deviceSettingsDTO2 = this.f43226a;
        com.garmin.android.apps.connectmobile.devices.model.h hVar3 = deviceSettingsDTO2 != null ? deviceSettingsDTO2.f33885m : null;
        h hVar4 = this.f43228c;
        if (hVar3 == null) {
            if (hVar4 != null) {
                hVar4.l(false);
                return;
            } else {
                s.m("alertThresholdField");
                throw null;
            }
        }
        if (hVar4 == null) {
            s.m("alertThresholdField");
            throw null;
        }
        if (deviceSettingsDTO2 != null && (hVar = deviceSettingsDTO2.f33885m) != null) {
            boolValueOf = Boolean.valueOf(hVar.getHighHrAlertEnabled());
        }
        boolValueOf.getClass();
        hVar4.l(boolValueOf.booleanValue());
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f43227b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if ((observable instanceof q1) && (obj instanceof Boolean)) {
            h hVar = this.f43228c;
            if (hVar != null) {
                hVar.l(((Boolean) obj).booleanValue());
            } else {
                s.m("alertThresholdField");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4HighHeartRateSettings$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(c cVar, boolean z14, DeviceSettingsDTO deviceSettingsDTO, long j8, String str) {
            deviceSettingsDTO.getClass();
            str.getClass();
            if (!z14) {
                Intent intent = new Intent(cVar, (Class<?>) VivoSmart4HighHeartRateSettings.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                cVar.startActivityForResult(intent, 10);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_deviceSettings", deviceSettingsDTO);
            bundle.putLong("GCM_deviceUnitID", j8);
            bundle.putString("GCM_deviceProductNbr", str);
            HighHeartRateSettings.f42785l.getClass();
            Intent intent2 = new Intent(cVar, (Class<?>) HighHeartRateSettings.class);
            intent2.putExtras(bundle);
            cVar.startActivityForResult(intent2, 10);
        }

        private a() {
        }
    }
}
