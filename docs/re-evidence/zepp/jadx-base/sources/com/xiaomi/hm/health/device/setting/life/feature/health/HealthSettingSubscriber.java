package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.huami.device.feature.health.HealthDetect;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.impl.HealthDeviceLifeCycle;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "未实现绑定回调，请使用 HealthDeviceLifeCycle", replaceWith = @ReplaceWith(expression = HealthDeviceLifeCycle.TAG, imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/HealthSettingSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthSettingSubscriber implements BleEventSubscriber {
    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "HealthDetect-SyncSetting";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) throws InterruptedException {
        if (device instanceof HMMiLiDevice) {
            HealthDetect healthDetect = HealthDetect.INSTANCE;
            healthDetect.onDeviceConnect();
            healthDetect.getHealthConfig().adjustConfig();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
