package com.xiaomi.fit.device.di;

import com.xiaomi.fit.device.utils.DeviceToolImpl;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/device/di/DeviceModelModule;", "", "<init>", "()V", "bindDeviceTool", "Lcom/xiaomi/fitness/device/manager/export/DeviceTool;", "deviceToolImpl", "Lcom/xiaomi/fit/device/utils/DeviceToolImpl;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceModelModule {
    @NotNull
    public abstract DeviceTool bindDeviceTool(@NotNull DeviceToolImpl deviceToolImpl);
}
