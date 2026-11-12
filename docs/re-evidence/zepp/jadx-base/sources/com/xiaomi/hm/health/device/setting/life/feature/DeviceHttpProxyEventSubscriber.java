package com.xiaomi.hm.health.device.setting.life.feature;

import com.huami.bluetooth.profile.channel.module.ProxyModule;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.esim.ProxyHttpRequestImpl;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/DeviceHttpProxyEventSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "a", "", "getName", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceHttpProxyEventSubscriber implements BleEventSubscriber {
    private final void a(HMBaseDevice device) {
        ProxyModule proxyModule;
        if (device.isConnected() && (proxyModule = (ProxyModule) device.getChannelModule(ProxyModule.class)) != null) {
            proxyModule.setHttpRequestClient(new ProxyHttpRequestImpl());
            proxyModule.start();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "DeviceHttpProxyEvent";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        a(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        ProxyModule proxyModule = (ProxyModule) device.getChannelModule(ProxyModule.class);
        if (proxyModule == null) {
            return;
        }
        proxyModule.stop();
    }
}
