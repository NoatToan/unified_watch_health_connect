package com.xiaomi.fitness.eco.device.manager.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDevicePoint;", "", "getEcoDeviceManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "getEcoProductManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager;", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDevicePoint {
    @NotNull
    EcoDeviceManager getEcoDeviceManager();

    @NotNull
    EcoProductManager getEcoProductManager();
}
