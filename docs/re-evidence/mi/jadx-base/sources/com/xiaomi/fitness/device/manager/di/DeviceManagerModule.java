package com.xiaomi.fitness.device.manager.di;

import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceManagerImpl;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.ProductManagerImpl;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00052\u0006\u0010\t\u001a\u00020\nH'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/di/DeviceManagerModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "deviceManager", "Lcom/xiaomi/fitness/device/manager/DeviceManagerImpl;", "bindProductManager", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "productManager", "Lcom/xiaomi/fitness/device/manager/ProductManagerImpl;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceManagerModule {
    @NotNull
    public abstract DeviceManager<DeviceModel<DeviceInfo<Device>>> bindDeviceManager(@NotNull DeviceManagerImpl deviceManager);

    @NotNull
    public abstract ProductManager<Product> bindProductManager(@NotNull ProductManagerImpl productManager);
}
