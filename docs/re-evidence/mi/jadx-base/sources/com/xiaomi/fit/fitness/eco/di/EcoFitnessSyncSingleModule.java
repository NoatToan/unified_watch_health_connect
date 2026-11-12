package com.xiaomi.fit.fitness.eco.di;

import android.os.IBinder;
import com.xiaomi.fit.fitness.eco.device.mi.receive.FitnessReceiverHandler;
import com.xiaomi.fit.fitness.eco.manager.EcoFitnessDataSyncManager;
import com.xiaomi.fit.fitness.eco.remote.EcoFitnessSyncRemoteImpl;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/di/EcoFitnessSyncSingleModule;", "", "<init>", "()V", "bindEcoDeviceSyncer", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceSyncer;", "syncListener", "Lcom/xiaomi/fit/fitness/eco/manager/EcoFitnessDataSyncManager;", "bindEcoFitnessSyncer", "Lcom/xiaomi/fit/fitness/eco/sync/export/api/EcoFitnessSyncer;", "bindEcoDataHandler", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "DataHandler", "Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessReceiverHandler;", "bindEcoFitnessSyncRemote", "Landroid/os/IBinder;", "remote", "Lcom/xiaomi/fit/fitness/eco/remote/EcoFitnessSyncRemoteImpl;", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EcoFitnessSyncSingleModule {
    @NotNull
    public abstract EcoDataHandlerWrapper bindEcoDataHandler(@NotNull FitnessReceiverHandler DataHandler);

    @NotNull
    public abstract EcoDeviceSyncer bindEcoDeviceSyncer(@NotNull EcoFitnessDataSyncManager syncListener);

    @NotNull
    public abstract IBinder bindEcoFitnessSyncRemote(@NotNull EcoFitnessSyncRemoteImpl remote);

    @NotNull
    public abstract EcoFitnessSyncer bindEcoFitnessSyncer(@NotNull EcoFitnessDataSyncManager syncListener);
}
