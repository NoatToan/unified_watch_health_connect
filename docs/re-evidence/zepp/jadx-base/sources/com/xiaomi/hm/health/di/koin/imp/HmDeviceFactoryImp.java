package com.xiaomi.hm.health.di.koin.imp;

import com.huami.member_card.koin.inject.HmDeviceFactory;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/HmDeviceFactoryImp;", "Lcom/huami/member_card/koin/inject/HmDeviceFactory;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmDeviceFactoryImp implements HmDeviceFactory {
    @Override // com.huami.member_card.koin.inject.HmDeviceFactory
    @Nullable
    public HMBaseDevice getDevice() {
        return HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
    }
}
