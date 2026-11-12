package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.WearDataEcoDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEcoDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt {
    @NotNull
    public static final EcoDeviceModel toEcoDeviceModel(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return new WearDataEcoDeviceModel(wearableDeviceModel.getDeviceStatus(), wearableDeviceModel.getIsDeviceConnected(), wearableDeviceModel.getDid(), DeviceExtKt.toEcoDeviceInfo(wearableDeviceModel.getDeviceInfo()), wearableDeviceModel.getIsCurrent(), wearableDeviceModel.getAlias(), wearableDeviceModel.getProduct(), wearableDeviceModel.getIsConnectActive());
    }
}
