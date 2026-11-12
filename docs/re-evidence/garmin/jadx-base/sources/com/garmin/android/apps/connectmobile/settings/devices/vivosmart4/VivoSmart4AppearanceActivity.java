package com.garmin.android.apps.connectmobile.settings.devices.vivosmart4;

import android.content.Intent;
import android.os.Bundle;
import ch1.j6;
import ch1.u0;
import ch1.y5;
import ci1.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.settings.devices.AutoOnDisplayActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsOrientationWatchFaces;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceCustomWidgetActivity;
import fb2.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import ng1.k0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4AppearanceActivity;", "Lng1/k0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VivoSmart4AppearanceActivity extends k0 {
    static {
        new a(null);
    }

    @Override // ng1.p
    public final void da() {
        ja();
        super.da();
    }

    @Override // ng1.k0
    public final void ea() {
        super.ea();
        j6 j6Var = new j6(this);
        ArrayList arrayList = this.f125956m;
        arrayList.add(j6Var);
        arrayList.add(new d(this));
        arrayList.add(new ch1.k0(this));
        arrayList.add(new y5(this));
        arrayList.add(new u0(this));
    }

    @Override // ng1.k0
    public final void fa() {
        boolean zG;
        for (e eVar : this.f125956m) {
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            if (deviceSettingsDTO != null) {
                ArrayList arrayList = deviceSettingsDTO.f33874h;
                z zVar = arrayList != null ? (z) arrayList.get(0) : null;
                if (!(eVar instanceof d) || zVar == null) {
                    zG = eVar.g(this, deviceSettingsDTO);
                } else {
                    List<y> list = zVar.f34343c;
                    if (list != null) {
                        y yVar = new y();
                        yVar.f34329b = -1;
                        yVar.f34330c = true;
                        list.add(0, yVar);
                    }
                    zG = ((d) eVar).g(this, zVar);
                }
                eVar.m(zG);
                eVar.addObserver(this);
                eVar.l(true);
            }
        }
    }

    public final void ja() {
        ArrayList arrayList;
        ArrayList arrayList2;
        z zVar;
        ArrayList arrayList3;
        z zVar2;
        List<y> list;
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO == null || (arrayList3 = deviceSettingsDTO.f33874h) == null || (zVar2 = (z) arrayList3.get(0)) == null || (list = zVar2.f34343c) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((y) obj).f34329b != -1) {
                    arrayList.add(obj);
                }
            }
        }
        DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
        if (deviceSettingsDTO2 == null || (arrayList2 = deviceSettingsDTO2.f33874h) == null || (zVar = (z) arrayList2.get(0)) == null) {
            return;
        }
        zVar.f34343c = arrayList != null ? new ArrayList(arrayList) : null;
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
                ArrayList<e> arrayList = this.f125956m;
                arrayList.getClass();
                boolean zK = false;
                for (e eVar : arrayList) {
                    if (eVar instanceof d) {
                        ArrayList arrayList2 = deviceSettingsDTO.f33874h;
                        z zVar = arrayList2 != null ? (z) arrayList2.get(0) : null;
                        if (zVar != null) {
                            zK = ((d) eVar).k(zVar);
                        }
                    } else {
                        zK = eVar.k(deviceSettingsDTO);
                    }
                    eVar.m(zK);
                }
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.appearance_title);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        Boolean boolValueOf;
        if (obj != null) {
            if (observable != null && observable.getClass() == u0.class) {
                AutoOnDisplayActivity.da(this, this.f125985k, (String) obj);
                return;
            }
            if (!(observable instanceof j6)) {
                if (observable instanceof ch1.k0) {
                    DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                    deviceSettingsDTO.getClass();
                    Intent intent = new Intent(this, (Class<?>) DeviceCustomWidgetActivity.class);
                    intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                    startActivityForResult(intent, 10);
                    return;
                }
                if (observable instanceof y5) {
                    DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                    deviceSettingsDTO2.getClass();
                    DeviceSettingsOrientationWatchFaces.ca(this, deviceSettingsDTO2, (String) obj, zb0.u0.T1);
                    return;
                }
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
            if (deviceSettingsDTO3 != null) {
                boolValueOf = Boolean.valueOf(deviceSettingsDTO3.H() != null);
            } else {
                boolValueOf = null;
            }
            boolValueOf.getClass();
            if (boolValueOf.booleanValue()) {
                ja();
                DeviceSettingsDTO deviceSettingsDTO4 = this.f125985k;
                deviceSettingsDTO4.getClass();
                Intent intent2 = new Intent(this, (Class<?>) ReOrderableWidgetActivity.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO4);
                startActivityForResult(intent2, 10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4AppearanceActivity$a;", "", "<init>", "()V", "", "SECONDARY_SCREEN_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
