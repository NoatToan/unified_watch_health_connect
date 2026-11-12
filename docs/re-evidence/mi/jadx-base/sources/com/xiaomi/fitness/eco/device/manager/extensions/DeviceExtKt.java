package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toEcoDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "toEcoDevice", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDevice;", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceExtKt {
    @NotNull
    public static final EcoDevice toEcoDevice(@NotNull WearableDevice wearableDevice) {
        Intrinsics.checkNotNullParameter(wearableDevice, "<this>");
        return new EcoDevice(wearableDevice.getDid(), wearableDevice.getProductId(), wearableDevice.getModel(), wearableDevice.getName(), wearableDevice.getExtraValues(), wearableDevice.getIdentifier(), wearableDevice.getAlias(), wearableDevice.getStatus(), wearableDevice.getDetail(), 0, false, null, null, null, 15872, null);
    }

    @NotNull
    public static final EcoDeviceInfo toEcoDeviceInfo(@NotNull WearableDeviceInfo wearableDeviceInfo) {
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "<this>");
        EcoDeviceInfo ecoDeviceInfo = new EcoDeviceInfo();
        WearableDevice wearableDevice = (WearableDevice) wearableDeviceInfo.device;
        ecoDeviceInfo.device = wearableDevice != null ? toEcoDevice(wearableDevice) : null;
        ecoDeviceInfo.setFirmwareVersion(wearableDeviceInfo.getFirmwareVersion());
        ecoDeviceInfo.setProduct(wearableDeviceInfo.getProduct());
        ecoDeviceInfo.setBleName(wearableDeviceInfo.getBleName());
        ecoDeviceInfo.setBatteryInfo(wearableDeviceInfo.getBatteryInfo());
        ecoDeviceInfo.setOob(wearableDeviceInfo.getOob());
        ecoDeviceInfo.setPrivateUUID(wearableDeviceInfo.getPrivateUUID());
        return ecoDeviceInfo;
    }
}
