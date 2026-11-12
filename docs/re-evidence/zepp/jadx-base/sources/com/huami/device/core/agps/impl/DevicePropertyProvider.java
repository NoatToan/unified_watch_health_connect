package com.huami.device.core.agps.impl;

import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/device/core/agps/impl/DevicePropertyProvider;", "Lcom/huami/device/core/agps/impl/AgpsAnalytics$DeviceProperty;", "", "getBattery", "", "getFv", "getSource", "", "isConnect", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class DevicePropertyProvider implements AgpsAnalytics.DeviceProperty {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HMBaseDevice device;

    public DevicePropertyProvider(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    @Override // com.huami.device.core.agps.impl.AgpsAnalytics.DeviceProperty
    public int getBattery() {
        BatteryInfo batteryInfo = this.device.getBatteryInfo();
        if (batteryInfo != null) {
            return batteryInfo.getLevel();
        }
        return -1;
    }

    @Override // com.huami.device.core.agps.impl.AgpsAnalytics.DeviceProperty
    @Nullable
    public String getFv() {
        String gpsVersionStr;
        DeviceInfo deviceInfo = this.device.getDeviceInfo();
        return (deviceInfo == null || (gpsVersionStr = deviceInfo.getGpsVersionStr()) == null) ? EcgData.DEFAULT_DIGIT_VALUE : gpsVersionStr;
    }

    @Override // com.huami.device.core.agps.impl.AgpsAnalytics.DeviceProperty
    public int getSource() {
        HMDeviceSource deviceSource = this.device.getDeviceSource();
        if (deviceSource != null) {
            return deviceSource.getValue();
        }
        return -1;
    }

    @Override // com.huami.device.core.agps.impl.AgpsAnalytics.DeviceProperty
    public boolean isConnect() {
        try {
            return this.device.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }
}
