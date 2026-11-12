package com.xiaomi.hm.health.device.setting.life;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.databases.model.Device;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.annotations.Experimental;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceVisibility;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Experimental
public interface DeviceLifeCycle extends DeviceVisibility {
    void onBoundedDeviceConnected(@NotNull HMBaseDevice device);

    void onBoundedDeviceDisconnect(@NotNull String deviceId);

    void onDeviceBind(@NotNull HMBaseDevice device);

    void onDeviceStatusChange(@Nullable Device device, int status);

    void onDeviceUnBind(@NotNull HMBaseDevice device);
}
