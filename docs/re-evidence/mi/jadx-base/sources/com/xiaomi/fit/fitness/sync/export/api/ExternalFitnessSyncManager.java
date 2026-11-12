package com.xiaomi.fit.fitness.sync.export.api;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager;", "", "syncLocalData", "", "did", "", "syncTheData", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "data", "", "syncWithDevice", "callback", "Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncCallback;", "dataIds", "addSyncResultListener", "Companion", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExternalFitnessSyncManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/ExternalFitnessSyncManager$Companion;", "", "<init>", "()V", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void syncWithDevice$default(ExternalFitnessSyncManager externalFitnessSyncManager, String str, ExternalFitnessSyncCallback externalFitnessSyncCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncWithDevice");
            }
            if ((i & 2) != 0) {
                externalFitnessSyncCallback = null;
            }
            externalFitnessSyncManager.syncWithDevice(str, externalFitnessSyncCallback);
        }
    }

    void addSyncResultListener(@NotNull String did, @Nullable ExternalFitnessSyncCallback callback);

    void syncLocalData(@NotNull String did);

    void syncTheData(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull byte[] data);

    void syncWithDevice(@NotNull String did, @Nullable ExternalFitnessSyncCallback callback);

    void syncWithDevice(@NotNull String did, @NotNull byte[] dataIds, @Nullable ExternalFitnessSyncCallback callback);
}
