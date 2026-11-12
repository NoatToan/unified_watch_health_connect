package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/extensions/EcoDevicePoint;", "", "getEcoDeviceManagerWrapper", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "getEcoDeviceManagerRemote", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "getEcoProductManagerInternal", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal;", "getEcoProductManagerRemoteInternal", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDevicePoint {
    @NotNull
    EcoDeviceManagerRemoteImpl getEcoDeviceManagerRemote();

    @NotNull
    EcoDeviceManagerWrapper getEcoDeviceManagerWrapper();

    @NotNull
    EcoProductManagerInternal getEcoProductManagerInternal();

    @NotNull
    EcoProductManagerRemoteInternal getEcoProductManagerRemoteInternal();
}
