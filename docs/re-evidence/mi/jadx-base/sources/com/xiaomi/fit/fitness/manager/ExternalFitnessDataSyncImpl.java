package com.xiaomi.fit.fitness.manager;

import com.amap.api.maps.model.MyLocationStyle;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
import com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.FitnessDeviceSyncPbApi;
import defpackage.iw9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/manager/ExternalFitnessDataSyncImpl;", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "pbApi", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "<init>", "(Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;)V", "syncManager", "Lcom/xiaomi/fit/fitness/device/mi/FitnessDeviceSyncManager;", "syncLocalData", "", "did", "", "syncTheData", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "data", "", "syncWithDevice", "callback", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;", "dataIds", "addSyncResultListener", "Companion", "SyncCallbackInternal", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExternalFitnessDataSyncImpl implements ExternalFitnessSyncManager {

    @NotNull
    private static final String TAG = "ExternalFitnessDataSyncImpl";

    @NotNull
    private final FitnessDeviceSyncManager syncManager;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/manager/ExternalFitnessDataSyncImpl$SyncCallbackInternal;", "Liw9$a;", "", "did", "", "type", "", "onSyncSuccess", "(Ljava/lang/String;I)V", MyLocationStyle.ERROR_INFO, "onSyncError", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;", "callBack", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;", "<init>", "(Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;)V", "fitness-sync_release"}, k = 1, mv = {2, 0, 0})
    public static final class SyncCallbackInternal extends iw9.a {

        @Nullable
        private final ExternalFitnessSyncCallback callBack;

        public SyncCallbackInternal(@Nullable ExternalFitnessSyncCallback externalFitnessSyncCallback) {
            this.callBack = externalFitnessSyncCallback;
        }

        @Override // defpackage.iw9
        public void onSyncError(@NotNull String did, int type, @Nullable String errorInfo) {
            Intrinsics.checkNotNullParameter(did, "did");
            FitnessLogUtils.i(ExternalFitnessDataSyncImpl.TAG, "onSyncError(" + did + ")-" + errorInfo);
            ExternalFitnessSyncCallback externalFitnessSyncCallback = this.callBack;
            if (externalFitnessSyncCallback != null) {
                externalFitnessSyncCallback.onSyncError(did, type, errorInfo);
            }
        }

        @Override // defpackage.iw9
        public void onSyncSuccess(@NotNull String did, int type) {
            Intrinsics.checkNotNullParameter(did, "did");
            FitnessLogUtils.i(ExternalFitnessDataSyncImpl.TAG, "onSyncSuccess(" + did + ")");
            ExternalFitnessSyncCallback externalFitnessSyncCallback = this.callBack;
            if (externalFitnessSyncCallback != null) {
                externalFitnessSyncCallback.onSyncSuccess(did, type);
            }
        }
    }

    public ExternalFitnessDataSyncImpl(@NotNull FitnessDeviceSyncPbApi pbApi) {
        Intrinsics.checkNotNullParameter(pbApi, "pbApi");
        this.syncManager = new FitnessDeviceSyncManager(pbApi);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager
    public void addSyncResultListener(@NotNull String did, @Nullable ExternalFitnessSyncCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(TAG, "addSyncResultListener(" + did + ")");
        this.syncManager.addSyncResultListener(did, new SyncCallbackInternal(callback));
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager
    public void syncLocalData(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(TAG, "syncLocalData(" + did + ")");
        this.syncManager.syncLocalData$fitness_sync_release(did);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager
    public void syncTheData(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        FitnessLogUtils.i(TAG, "syncTheData(" + did + ")");
        this.syncManager.syncTheData(did, dataId, data);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager
    public void syncWithDevice(@NotNull String did, @Nullable ExternalFitnessSyncCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(TAG, "syncWithDevice(" + did + ")");
        FitnessDataSyncBaseImpl.syncWithDevice$default(this.syncManager, did, new SyncCallbackInternal(callback), null, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager
    public void syncWithDevice(@NotNull String did, @NotNull byte[] dataIds, @Nullable ExternalFitnessSyncCallback callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        FitnessLogUtils.i(TAG, "syncWithDevice(" + did + ")-dataIds");
        this.syncManager.syncWithDevice(did, dataIds, new SyncCallbackInternal(callback));
    }
}
