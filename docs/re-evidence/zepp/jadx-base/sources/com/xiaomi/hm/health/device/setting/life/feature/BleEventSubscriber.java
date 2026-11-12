package com.xiaomi.hm.health.device.setting.life.feature;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface BleEventSubscriber {
    @NotNull
    String getName();

    void register(@NotNull HMBaseDevice device);

    void unregister(@NotNull HMBaseDevice device);
}
