package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DevicePoint;", "", "getProductManager", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getDeviceManager", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DevicePoint {
    @NotNull
    DeviceManager<DeviceModel<DeviceInfo<Device>>> getDeviceManager();

    @NotNull
    ProductManager<Product> getProductManager();
}
