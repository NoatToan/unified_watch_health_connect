package com.xiaomi.hm.health.device.setting.life.feature.earbud;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/earbud/EarbudSyncDataSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "event", "onEvent", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudSyncDataSubscriber implements BleEventSubscriber {
    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "EarbudSyncDataSubscriber";
    }

    public final void onEvent(@NotNull HMDeviceSyncDataEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        if (deviceType == HMDeviceType.EARBUD) {
            Progress progress = event.getProgress();
            if ((progress != null && progress.getPercent() == 100) && HMFwOnlineManager.shouldCheckFwAuto(deviceType)) {
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(deviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(DeviceXFunctionsKt.getContext(), deviceType, false);
                } else {
                    HMFwUpgradeManager.getInstance().checkFwUpgrade(DeviceXFunctionsKt.getContext(), deviceType, false);
                }
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device.getDeviceType() == HMDeviceType.EARBUD) {
            EventBus.getDefault().register(this);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        if (device.getDeviceType() == HMDeviceType.EARBUD) {
            EventBus.getDefault().unregister(this);
        }
    }
}
