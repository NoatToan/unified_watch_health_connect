package com.xiaomi.hm.health.device.setting;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceCenter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static HMBaseDevice getDevice(@NotNull DeviceCenter deviceCenter) {
            return deviceCenter.getDevice(HMDeviceType.MILI);
        }

        @NotNull
        public static HMDeviceSource getDeviceSource(@NotNull DeviceCenter deviceCenter) {
            return deviceCenter.getDeviceSource(HMDeviceType.MILI);
        }
    }

    @Nullable
    HMBaseDevice getDevice();

    @Nullable
    HMBaseDevice getDevice(@NotNull HMDeviceType type);

    @NotNull
    HMDeviceSource getDeviceSource();

    @NotNull
    HMDeviceSource getDeviceSource(@NotNull HMDeviceType type);
}
