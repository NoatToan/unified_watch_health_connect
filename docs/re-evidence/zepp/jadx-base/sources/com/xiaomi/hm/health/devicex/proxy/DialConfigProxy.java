package com.xiaomi.hm.health.devicex.proxy;

import com.huami.watchfacesstore.device.config.IDeviceConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.dial.IDialConfig;
import com.xiaomi.hm.health.watchfacestore.WatchFaceStoreModuleKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/DialConfigProxy;", "Lcom/xiaomi/hm/health/device/setting/dial/IDialConfig;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/huami/watchfacesstore/device/config/IDeviceConfig;", "getDeviceDialConfig", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DialConfigProxy implements IDialConfig {
    @Override // com.xiaomi.hm.health.device.setting.dial.IDialConfig
    @NotNull
    public IDeviceConfig getDeviceDialConfig(@NotNull HMDeviceSource source) {
        return WatchFaceStoreModuleKt.deviceConfig(source);
    }
}
