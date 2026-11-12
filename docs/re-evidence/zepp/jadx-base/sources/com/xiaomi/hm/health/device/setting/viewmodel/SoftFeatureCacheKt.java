package com.xiaomi.hm.health.device.setting.viewmodel;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", Constants.JSON_FEATURE, "", "get", "(Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCache;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/xiaomi/hm/health/device/setting/SoftFeature;)Ljava/lang/Boolean;", "value", "", "cache", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class SoftFeatureCacheKt {
    public static final void cache(@NotNull SoftFeatureCache softFeatureCache, @Nullable HMBaseDevice hMBaseDevice, @NotNull SoftFeature softFeature, boolean z) {
        if (hMBaseDevice == null) {
            return;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        String deviceID = deviceInfo == null ? null : deviceInfo.getDeviceID();
        if (deviceID == null) {
            return;
        }
        softFeatureCache.cache(deviceID, softFeature, z);
    }

    @Nullable
    public static final Boolean get(@NotNull SoftFeatureCache softFeatureCache, @Nullable HMBaseDevice hMBaseDevice, @NotNull SoftFeature softFeature) {
        if (hMBaseDevice == null) {
            return Boolean.FALSE;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        String deviceID = deviceInfo == null ? null : deviceInfo.getDeviceID();
        return deviceID == null ? Boolean.FALSE : softFeatureCache.get(deviceID, softFeature);
    }
}
