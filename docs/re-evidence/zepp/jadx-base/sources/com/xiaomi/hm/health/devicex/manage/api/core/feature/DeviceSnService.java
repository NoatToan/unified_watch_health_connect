package com.xiaomi.hm.health.devicex.manage.api.core.feature;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "getSn", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "sn", "", "updateSn", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceSnService {
    @Nullable
    String getSn(@NotNull HMBaseDevice device);

    @Nullable
    String getSn(@NotNull HMDeviceType type);

    void updateSn(@NotNull HMBaseDevice device, @NotNull String sn);

    void updateSn(@NotNull HMDeviceType type, @NotNull String sn);
}
