package com.xiaomi.hm.health.device.setting.life;

import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/DeviceVisibility;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceVisibility {
    void disable(@NotNull HMBaseDevice device);

    void enable(@NotNull HMBaseDevice device);
}
