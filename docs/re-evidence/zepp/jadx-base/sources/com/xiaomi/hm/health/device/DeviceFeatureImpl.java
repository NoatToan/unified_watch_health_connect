package com.xiaomi.hm.health.device;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.IDeviceFeature;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/DeviceFeatureImpl;", "Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "hasFeatureGPS", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeatureImpl implements IDeviceFeature {
    @Override // com.xiaomi.hm.health.bt.device.IDeviceFeature
    public boolean hasFeatureGPS(@NotNull HMDeviceSource source) {
        return ConfigHelperKt.hasFeature(source, Feature.SUPPORT_GPS);
    }
}
