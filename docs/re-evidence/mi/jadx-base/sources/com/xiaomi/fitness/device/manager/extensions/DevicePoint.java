package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/extensions/DevicePoint;", "", "getDeviceManagerWrapper", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "getDeviceManagerRemote", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "getProductManagerInternal", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "getProductManagerRemoteInternal", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DevicePoint {
    @NotNull
    DeviceManagerRemoteImpl getDeviceManagerRemote();

    @NotNull
    WearableDeviceManagerWrapper getDeviceManagerWrapper();

    @NotNull
    ProductManagerInternal getProductManagerInternal();

    @NotNull
    ProductManagerRemoteInternal getProductManagerRemoteInternal();
}
