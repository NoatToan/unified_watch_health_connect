package com.xiaomi.hm.health.di.koin.imp;

import com.huami.account.bean.AuthDevice;
import com.huami.account.bean.AuthDeviceSource;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/account/bean/AuthDevice;", "toAuthDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/huami/account/bean/AuthDeviceSource;", "toAuthDeviceSource", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AccountDeviceTokenImplKt {
    @Nullable
    public static final AuthDevice toAuthDevice(@NotNull HMBaseDevice hMBaseDevice) {
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        AuthDeviceSource authDeviceSource = new AuthDeviceSource(hMBaseDevice.getDeviceSource().getValue(), hMBaseDevice.getDeviceType().getValue());
        String serialNumber = deviceInfo.getSerialNumber();
        String deviceID = deviceInfo.getDeviceID();
        if (deviceID == null) {
            deviceID = "";
        }
        return new AuthDevice(authDeviceSource, serialNumber, deviceID);
    }

    @NotNull
    public static final AuthDeviceSource toAuthDeviceSource(@NotNull HMDeviceSource hMDeviceSource) {
        return new AuthDeviceSource(hMDeviceSource.getValue(), hMDeviceSource.getType().getValue());
    }
}
