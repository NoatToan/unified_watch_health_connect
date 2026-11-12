package com.xiaomi.hm.health.device.feature.sync;

import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public /* synthetic */ class SyncCenterManager$mockApi$2 extends FunctionReferenceImpl implements Function4<HMDeviceType, Integer, Integer, HMBaseDevice, Unit> {
    public SyncCenterManager$mockApi$2(SyncCenterManager syncCenterManager) {
        super(4, syncCenterManager, SyncCenterManager.class, "dispatchProgress", "dispatchProgress(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;IILcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(HMDeviceType hMDeviceType, Integer num, Integer num2, HMBaseDevice hMBaseDevice) {
        invoke(hMDeviceType, num.intValue(), num2.intValue(), hMBaseDevice);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HMDeviceType hMDeviceType, int i, int i2, @NotNull HMBaseDevice hMBaseDevice) {
        ((SyncCenterManager) this.receiver).dispatchProgress(hMDeviceType, i, i2, hMBaseDevice);
    }
}
