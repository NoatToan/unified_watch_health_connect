package com.huami.phone_call.sms;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/phone_call/sms/DeviceCenter;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceCenter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static HMBaseDevice getDevice(@NotNull DeviceCenter deviceCenter) {
            return deviceCenter.getDevice(HMDeviceType.MILI);
        }
    }

    @Nullable
    HMBaseDevice getDevice();

    @Nullable
    HMBaseDevice getDevice(@NotNull HMDeviceType type);
}
