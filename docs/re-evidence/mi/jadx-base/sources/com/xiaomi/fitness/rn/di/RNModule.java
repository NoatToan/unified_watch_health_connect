package com.xiaomi.fitness.rn.di;

import com.xiaomi.fitness.device.manager.DeviceContainer;
import com.xiaomi.fitness.rn.RNDeviceContainer;
import com.xiaomi.fitness.rn.RNDeviceManagerImpl;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/rn/di/RNModule;", "", "<init>", "()V", "bindRNDeviceContainer", "Lcom/xiaomi/fitness/device/manager/DeviceContainer;", "deviceContainer", "Lcom/xiaomi/fitness/rn/RNDeviceContainer;", "bindRNDeviceManager", "Lcom/xiaomi/fitness/rn/export/RNDeviceManager;", "rnDeviceManager", "Lcom/xiaomi/fitness/rn/RNDeviceManagerImpl;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RNModule {
    @NotNull
    public abstract DeviceContainer bindRNDeviceContainer(@NotNull RNDeviceContainer deviceContainer);

    @NotNull
    public abstract RNDeviceManager bindRNDeviceManager(@NotNull RNDeviceManagerImpl rnDeviceManager);
}
