package com.xiaomi.hm.health.device.setting;

import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FreeTaskApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/FreeTaskImpl;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FreeTaskApi;", "", "clearLocationKey", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FreeTaskImpl implements FreeTaskApi {
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FreeTaskApi
    public void clearLocationKey() {
        HMDeviceFreeTask.DeviceConfig deviceConfig = HMDeviceFreeTask.getDeviceConfig();
        deviceConfig.lastLocationKey = null;
        HMDeviceFreeTask.saveDeviceConfig(deviceConfig);
    }
}
