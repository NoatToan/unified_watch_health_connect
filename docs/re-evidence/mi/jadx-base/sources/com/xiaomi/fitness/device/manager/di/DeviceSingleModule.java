package com.xiaomi.fitness.device.manager.di;

import android.os.IBinder;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.TempManagerImpl;
import com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl;
import com.xiaomi.fitness.device.manager.WearableProductManagerImpl;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtilImpl;
import com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0014\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H'J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH'J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H'¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/device/manager/di/DeviceSingleModule;", "", "<init>", "()V", "bindProductManager", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "productManager", "Lcom/xiaomi/fitness/device/manager/WearableProductManagerImpl;", "bindProductManagerInternal", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "bindProductManagerRemote", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/device/manager/remote/ProductManagerRemoteImpl;", "bindWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "deviceManager", "Lcom/xiaomi/fitness/device/manager/WearableDeviceManagerImpl;", "bindDeviceManagerWrapper", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "bindDeviceManager", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "bindDeviceManagerInternal", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "bindTempManagerImpl", "Lcom/xiaomi/fitness/device/manager/export/TempManager;", "tempManagerImpl", "Lcom/xiaomi/fitness/device/manager/TempManagerImpl;", "bindDeviceManagerBinder", "Landroid/os/IBinder;", "binder", "bindProductManagerBinder", "bindBluetoothPermissionDialogUtil", "Lcom/xiaomi/fitness/device/manager/export/BluetoothPermissionTool;", "bluetoothPermissionUtilImpl", "Lcom/xiaomi/fitness/device/manager/utils/BluetoothPermissionUtilImpl;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceSingleModule {
    @NotNull
    public abstract BluetoothPermissionTool bindBluetoothPermissionDialogUtil(@NotNull BluetoothPermissionUtilImpl bluetoothPermissionUtilImpl);

    @NotNull
    public abstract DeviceManager<?> bindDeviceManager(@NotNull WearableDeviceManagerImpl deviceManager);

    @NotNull
    public abstract IBinder bindDeviceManagerBinder(@NotNull DeviceManagerRemoteImpl binder);

    @NotNull
    public abstract DeviceManagerInternalRemote bindDeviceManagerInternal(@NotNull DeviceManagerRemoteImpl deviceManager);

    @NotNull
    public abstract WearableDeviceManagerWrapper bindDeviceManagerWrapper(@NotNull WearableDeviceManagerImpl deviceManager);

    @NotNull
    public abstract WearableProductManager bindProductManager(@NotNull WearableProductManagerImpl productManager);

    @NotNull
    public abstract IBinder bindProductManagerBinder(@NotNull ProductManagerRemoteImpl binder);

    @NotNull
    public abstract ProductManagerInternal bindProductManagerInternal(@NotNull WearableProductManagerImpl productManager);

    @NotNull
    public abstract ProductManagerRemoteInternal bindProductManagerRemote(@NotNull ProductManagerRemoteImpl productManager);

    @NotNull
    public abstract TempManager bindTempManagerImpl(@NotNull TempManagerImpl tempManagerImpl);

    @NotNull
    public abstract WearableDeviceManager bindWearableDeviceManager(@NotNull WearableDeviceManagerImpl deviceManager);
}
