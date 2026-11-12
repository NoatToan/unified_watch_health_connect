package com.xiaomi.fitness.devicesettings;

import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.CapabilityManagerExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingHelper;
import defpackage.bc0;
import defpackage.p90;
import defpackage.s7r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingHelperImpl;", "Lcom/xiaomi/fitness/devicesettings/export/DeviceSettingHelper;", "<init>", "()V", "TAG", "", "updateCapabilities", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingHelperImpl implements DeviceSettingHelper {

    @NotNull
    private final String TAG = "DeviceSettingHelperImpl";

    @Override // com.xiaomi.fitness.devicesettings.export.DeviceSettingHelper
    public void updateCapabilities() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean z = false;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            z = true;
        }
        Logger.i(this.TAG, "update capability device connect " + z);
        if (z) {
            s7r s7rVar = new s7r();
            s7rVar.e = 1;
            s7rVar.f = 31;
            p90 p90Var = new p90();
            bc0 bc0Var = new bc0();
            bc0Var.c = CapabilityManagerExtKt.getInstance(CapabilityManager.INSTANCE).getCapabilitiesInt();
            p90Var.I(bc0Var);
            s7rVar.M(p90Var);
            Logger.i(this.TAG, "packet " + s7rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
        }
    }
}
