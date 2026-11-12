package com.xiaomi.fit.fitness.eco.device.mi;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager;
import com.xiaomi.fit.fitness.eco.device.mi.send.FitnessEcoPbImpl;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback;
import com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncManager;
import com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import defpackage.pt7;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\bR\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager;", "", "", "sid", "Lpt7;", "callback", "", "syncWithDevice", "(Ljava/lang/String;Lpt7;)V", "", "dataIds", "(Ljava/lang/String;[BLpt7;)V", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "data", "syncTheData", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[B)V", "syncLocalData", "(Ljava/lang/String;)V", "did", "addSyncResultListener", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "syncManager$delegate", "Lkotlin/Lazy;", "getSyncManager", "()Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "syncManager", "<init>", "()V", "Companion", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0})
public final class FitnessDeviceSyncManager {

    @NotNull
    private static final String TAG = "FitnessDeviceSyncManager";

    /* JADX INFO: renamed from: syncManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDeviceSyncManager.syncManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<FitnessDeviceSyncManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDeviceSyncManager.instance_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager;", "getInstance", "()Lcom/xiaomi/fit/fitness/eco/device/mi/FitnessDeviceSyncManager;", "instance$delegate", "Lkotlin/Lazy;", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDeviceSyncManager getInstance() {
            return (FitnessDeviceSyncManager) FitnessDeviceSyncManager.instance$delegate.getValue();
        }
    }

    private FitnessDeviceSyncManager() {
    }

    private final ExternalFitnessSyncManager getSyncManager() {
        return (ExternalFitnessSyncManager) this.syncManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDeviceSyncManager instance_delegate$lambda$1() {
        return new FitnessDeviceSyncManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalFitnessSyncManager syncManager_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessExternalSyncer.INSTANCE).getSyncManager(FitnessEcoPbImpl.INSTANCE.getInstance());
    }

    public static /* synthetic */ void syncWithDevice$default(FitnessDeviceSyncManager fitnessDeviceSyncManager, String str, pt7 pt7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            pt7Var = null;
        }
        fitnessDeviceSyncManager.syncWithDevice(str, pt7Var);
    }

    public final void addSyncResultListener(@NotNull String did, @Nullable final pt7 callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        FitnessLogUtils.i(TAG, "addSyncResultListener");
        getSyncManager().addSyncResultListener(did, new ExternalFitnessSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager.addSyncResultListener.1
            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncError(String did2, int type, String errorInfo) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncError(did=" + did2 + ",error=" + errorInfo + ")");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncError(did2, type, errorInfo);
                }
            }

            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncSuccess(String did2, int type) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncSuccess(did=" + did2 + ")");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncSuccess(did2, type);
                }
            }
        });
    }

    public final void syncLocalData(@NotNull String sid) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        getSyncManager().syncLocalData(sid);
    }

    public final void syncTheData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        getSyncManager().syncTheData(sid, dataId, data);
    }

    public final void syncWithDevice(@NotNull String sid, @Nullable final pt7 callback) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        getSyncManager().syncWithDevice(sid, new ExternalFitnessSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager.syncWithDevice.1
            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncError(String did, int type, String errorInfo) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncError(did=" + did + ",error=" + errorInfo + ")");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncError(did, type, errorInfo);
                }
            }

            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncSuccess(String did, int type) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncSuccess(did=" + did + ")");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncSuccess(did, type);
                }
            }
        });
    }

    public final void syncWithDevice(@NotNull String sid, @NotNull byte[] dataIds, @Nullable final pt7 callback) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataIds, "dataIds");
        getSyncManager().syncWithDevice(sid, dataIds, new ExternalFitnessSyncCallback() { // from class: com.xiaomi.fit.fitness.eco.device.mi.FitnessDeviceSyncManager.syncWithDevice.2
            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncError(String did, int type, String errorInfo) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncError(did=" + did + ",error=" + errorInfo + ")-dataIds");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncError(did, type, errorInfo);
                }
            }

            @Override // com.xiaomi.fit.fitness.sync.export.api.ExternalFitnessSyncCallback
            public void onSyncSuccess(String did, int type) throws RemoteException {
                FitnessLogUtils.i(FitnessDeviceSyncManager.TAG, "onSyncSuccess(did=" + did + ")-dataIds");
                pt7 pt7Var = callback;
                if (pt7Var != null) {
                    pt7Var.onSyncSuccess(did, type);
                }
            }
        });
    }
}
