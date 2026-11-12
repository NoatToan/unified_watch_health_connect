package com.xiaomi.hm.health.di.koin.female;

import com.huami.femalehealth.logiclib.device.DeviceStatus;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/female/FemaleDeviceStatus;", "Lcom/huami/femalehealth/logiclib/device/DeviceStatus;", "", "hasActiveDevice", "isConnected", "supportFemaleHealth", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleDeviceStatus implements DeviceStatus {
    @Override // com.huami.femalehealth.logiclib.device.DeviceStatus
    public boolean hasActiveDevice() {
        return !HMDeviceManager.getActiveDevices().isEmpty();
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceStatus
    public boolean isConnected() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device == null) {
            return false;
        }
        return device.isConnected();
    }

    @Override // com.huami.femalehealth.logiclib.device.DeviceStatus
    public boolean supportFemaleHealth() {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice();
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) {
            return false;
        }
        return deviceFeature.hasSw(5);
    }
}
