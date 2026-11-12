package com.xiaomi.fitness.eco.device.manager.di;

import android.os.IBinder;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerImpl;
import com.xiaomi.fitness.eco.device.manager.EcoProductManagerImpl;
import com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManager;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerInternalRemote;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0018H'J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0018H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/di/EcoDeviceSingleModule;", "", "<init>", "()V", "bindEcoDeviceManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "deviceManager", "Lcom/xiaomi/fitness/eco/device/manager/EcoDeviceManagerImpl;", "bindEcoDeviceManagerWrapper", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "bindEcoDeviceManagerInternal", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "bindEcoDeviceManagerBinder", "Landroid/os/IBinder;", "binder", "bindEcoProductManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoProductManager;", "productManager", "Lcom/xiaomi/fitness/eco/device/manager/EcoProductManagerImpl;", "bindEcoProductManagerInternal", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal;", "bindEcoProductManagerRemote", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoProductManagerRemoteImpl;", "bindEcoProductManagerBinder", "bindOtherDeviceLoaderManager", "Lcom/xiaomi/fitness/eco/device/manager/export/OtherDeviceLoaderManager;", "otherDeviceLoaderManager", "Lcom/xiaomi/fitness/eco/device/manager/OtherDeviceLoaderManagerImpl;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EcoDeviceSingleModule {
    @NotNull
    public abstract EcoDeviceManager bindEcoDeviceManager(@NotNull EcoDeviceManagerImpl deviceManager);

    @NotNull
    public abstract IBinder bindEcoDeviceManagerBinder(@NotNull EcoDeviceManagerRemoteImpl binder);

    @NotNull
    public abstract EcoDeviceManagerInternalRemote bindEcoDeviceManagerInternal(@NotNull EcoDeviceManagerRemoteImpl deviceManager);

    @NotNull
    public abstract EcoDeviceManagerWrapper bindEcoDeviceManagerWrapper(@NotNull EcoDeviceManagerImpl deviceManager);

    @NotNull
    public abstract EcoProductManager bindEcoProductManager(@NotNull EcoProductManagerImpl productManager);

    @NotNull
    public abstract IBinder bindEcoProductManagerBinder(@NotNull EcoProductManagerRemoteImpl binder);

    @NotNull
    public abstract EcoProductManagerInternal bindEcoProductManagerInternal(@NotNull EcoProductManagerImpl productManager);

    @NotNull
    public abstract EcoProductManagerRemoteInternal bindEcoProductManagerRemote(@NotNull EcoProductManagerRemoteImpl productManager);

    @NotNull
    public abstract OtherDeviceLoaderManager bindOtherDeviceLoaderManager(@NotNull OtherDeviceLoaderManagerImpl otherDeviceLoaderManager);
}
