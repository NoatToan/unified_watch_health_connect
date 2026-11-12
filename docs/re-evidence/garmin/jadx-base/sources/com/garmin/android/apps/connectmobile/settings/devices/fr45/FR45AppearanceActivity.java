package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.e;
import ch1.j6;
import ch1.y5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceAppearanceSettingActivityDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import l80.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45AppearanceActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceAppearanceSettingActivityDefault;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45AppearanceActivity extends DeviceAppearanceSettingActivityDefault {
    @Override // ng1.p
    public final void da() {
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
        if (deviceSettingsDTO2 != null && (arrayList2 = deviceSettingsDTO2.f33874h) != null && (zVar = (z) arrayList2.get(0)) != null) {
            zVar.f34343c = arrayList != null ? new ArrayList(arrayList) : null;
        }
        super.da();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceAppearanceSettingActivityDefault, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y5(this));
        arrayList.add(new j6(this));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceAppearanceSettingActivityDefault, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (!(observable instanceof y5)) {
                if (observable instanceof j6) {
                    FR45ReOrderableWidgetActivity.a aVar = FR45ReOrderableWidgetActivity.f42994j;
                    DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                    deviceSettingsDTO.getClass();
                    aVar.getClass();
                    Intent intent = new Intent(this, (Class<?>) FR45ReOrderableWidgetActivity.class);
                    intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                    startActivityForResult(intent, 10);
                    return;
                }
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
            Long lValueOf = deviceSettingsDTO2 != null ? Long.valueOf(deviceSettingsDTO2.f33860a) : null;
            b bVar = (b) KoinJavaComponent.get$default(b.class, null, null, 6, null);
            DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
            deviceSettingsDTO3.getClass();
            boolean zA = bVar.a(deviceSettingsDTO3.f33860a);
            if (!zA) {
                e.a aVar2 = new e.a(this);
                aVar2.setTitle(R.string.connect_iq_device_not_connected_title);
                aVar2.setMessage(R.string.connect_iq_device_not_connected_msg);
                aVar2.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                e eVarCreate = aVar2.create();
                eVarCreate.getClass();
                eVarCreate.show();
            }
            if (!zA || lValueOf == null) {
                return;
            }
            ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).E(this, lValueOf.longValue());
        }
    }
}
