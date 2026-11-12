package com.xiaomi.hm.health.di.koin.module.device.settings;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.phone_call.sms.DeviceCenter;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/module/device/settings/PhoneCallReplyDeviceCenter;", "Lcom/huami/phone_call/sms/DeviceCenter;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceApi", "<init>", "(Lcom/huami/devicex/manager/DeviceManagerApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyDeviceCenter implements DeviceCenter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceManagerApi deviceApi;

    public PhoneCallReplyDeviceCenter(@NotNull DeviceManagerApi deviceManagerApi) {
        this.deviceApi = deviceManagerApi;
    }

    @Override // com.huami.phone_call.sms.DeviceCenter
    @Nullable
    public HMBaseDevice getDevice() {
        return DeviceCenter.DefaultImpls.getDevice(this);
    }

    @Override // com.huami.phone_call.sms.DeviceCenter
    @Nullable
    public HMBaseDevice getDevice(@NotNull HMDeviceType type) {
        return this.deviceApi.getDevice(type);
    }
}
