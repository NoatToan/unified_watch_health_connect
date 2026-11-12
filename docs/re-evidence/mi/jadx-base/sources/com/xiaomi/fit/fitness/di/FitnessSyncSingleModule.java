package com.xiaomi.fit.fitness.di;

import android.os.IBinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.device.hm.PaiGoalDataHelper;
import com.xiaomi.fit.fitness.device.mi.receive.FitnessReceiverHandler;
import com.xiaomi.fit.fitness.manager.ExternalFitnessDataSyncImpl;
import com.xiaomi.fit.fitness.manager.FitnessDataSyncManager;
import com.xiaomi.fit.fitness.remote.FitnessSyncRemoteImpl;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH'¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/di/FitnessSyncSingleModule;", "", "<init>", "()V", "bindDeviceSyncer", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncer;", "syncListener", "Lcom/xiaomi/fit/fitness/manager/FitnessDataSyncManager;", "bindFitnessSyncer", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "bindExternalFitnessSyncer", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessExternalSyncer;", "bindDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "DataHandler", "Lcom/xiaomi/fit/fitness/device/mi/receive/FitnessReceiverHandler;", "bindFitnessSyncRemote", "Landroid/os/IBinder;", "remote", "Lcom/xiaomi/fit/fitness/remote/FitnessSyncRemoteImpl;", "bindPaiGoal", "Lcom/xiaomi/fit/fitness/sync/export/api/PaiDataInterface;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fit/fitness/device/hm/PaiGoalDataHelper;", "bindEcoFitnessSyncApi", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "syncImpl", "Lcom/xiaomi/fit/fitness/manager/ExternalFitnessDataSyncImpl;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FitnessSyncSingleModule {
    @NotNull
    public abstract DataHandlerWrapper bindDataHandler(@NotNull FitnessReceiverHandler DataHandler);

    @NotNull
    public abstract DeviceSyncer bindDeviceSyncer(@NotNull FitnessDataSyncManager syncListener);

    @NotNull
    public abstract ExternalFitnessSyncManager bindEcoFitnessSyncApi(@NotNull ExternalFitnessDataSyncImpl syncImpl);

    @NotNull
    public abstract FitnessExternalSyncer bindExternalFitnessSyncer(@NotNull FitnessDataSyncManager syncListener);

    @NotNull
    public abstract IBinder bindFitnessSyncRemote(@NotNull FitnessSyncRemoteImpl remote);

    @NotNull
    public abstract FitnessSyncer bindFitnessSyncer(@NotNull FitnessDataSyncManager syncListener);

    @NotNull
    public abstract PaiDataInterface bindPaiGoal(@NotNull PaiGoalDataHelper listener);
}
