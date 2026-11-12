package com.xiaomi.fitness.device.manager.ui.bind;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindHuamiViewModel;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindViewModel;", "<init>", "()V", "onBoundSuccess", "", "did", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindHuamiViewModel extends BindViewModel {
    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindViewModel
    public void onBoundSuccess(@Nullable String did) {
        super.onBoundSuccess(did);
        if (did == null || did.length() == 0) {
            return;
        }
        DeviceModelExtKt.logi("BindHuamiViewModel did = " + did);
        DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).setHuamiDeviceAlarmSyncSrc(did, 1);
        DevicePreference.INSTANCE.setDeviceBindTime(did);
    }
}
