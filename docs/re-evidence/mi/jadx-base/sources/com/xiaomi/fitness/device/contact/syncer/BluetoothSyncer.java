package com.xiaomi.fitness.device.contact.syncer;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/BluetoothSyncer;", "Lcom/xiaomi/fitness/device/contact/syncer/BaseSyncer;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothSyncer extends BaseSyncer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothSyncer(@NotNull WearableDeviceModel deviceModel) {
        super(deviceModel);
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (DeviceModelExtKt.isWearOS(deviceModel)) {
            return;
        }
        Logger.i("BluetoothSyncer", "add time syncer");
        addSyncer(false, TimeSyncer.INSTANCE.getInstance(), 4);
    }
}
