package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.huami.device.feature.health.HealthDetect;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "健康监测模块存在多个设备生命周期监测类，比如：HealthDeviceLifCycle、HealthSettingSubscriber，再加上这个类，这些都是没有必要的，而且设备连接时，健康监测项的初始化和方法调用是不同线程进行的，因此存在线程安全问题现在将所有的健康监测设备生命周期类废弃，只保留HealthDeviceLifeCycle，并将相关逻辑移过去，统一管理", replaceWith = @ReplaceWith(expression = "HealthDeviceLifCycle", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/HealthInitSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthInitSubscriber implements BleEventSubscriber {
    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "HealthDetect-Init";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device instanceof HMMiLiDevice) {
            HealthDetectInitFactory.INSTANCE.initHealth();
            HealthDetect.INSTANCE.reload();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
