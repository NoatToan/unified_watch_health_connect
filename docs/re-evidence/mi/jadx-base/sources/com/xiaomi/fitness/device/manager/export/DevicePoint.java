package com.xiaomi.fitness.device.manager.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/DevicePoint;", "", "getWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "getDeviceTool", "Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "getWearableProductManager", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "getBluetoothPermissionDialogUtil", "Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DevicePoint {
    @NotNull
    BluetoothPermissionTool getBluetoothPermissionDialogUtil();

    @NotNull
    DeviceTool getDeviceTool();

    @NotNull
    WearableDeviceManager getWearableDeviceManager();

    @NotNull
    WearableProductManager getWearableProductManager();
}
