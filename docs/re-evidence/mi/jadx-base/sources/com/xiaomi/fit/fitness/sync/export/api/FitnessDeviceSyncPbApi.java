package com.xiaomi.fit.fitness.sync.export.api;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH&J)\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\rH&J,\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/sync/export/api/FitnessDeviceSyncPbApi;", "", "confirmFitnessId", "", "did", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "callback", "Lkotlin/Function1;", "", "getTodayFitnessIds", "isBgAutoSync", "Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/xiaomi/fit/fitness/sync/export/api/OnGetFitnessIdsCallback;)V", "getHistoryFitnessIds", "requestFitnessIds", "dataIds", "", "syncWearSportStatus", "fitness-sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessDeviceSyncPbApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getTodayFitnessIds$default(FitnessDeviceSyncPbApi fitnessDeviceSyncPbApi, String str, Boolean bool, OnGetFitnessIdsCallback onGetFitnessIdsCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTodayFitnessIds");
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            fitnessDeviceSyncPbApi.getTodayFitnessIds(str, bool, onGetFitnessIdsCallback);
        }
    }

    void confirmFitnessId(@NotNull String did, @NotNull FitnessDataId dataId, @NotNull Function1<? super Boolean, Unit> callback);

    void getHistoryFitnessIds(@NotNull String did, @NotNull OnGetFitnessIdsCallback callback);

    void getTodayFitnessIds(@NotNull String did, @Nullable Boolean isBgAutoSync, @NotNull OnGetFitnessIdsCallback callback);

    void requestFitnessIds(@NotNull String did, @NotNull byte[] dataIds, @NotNull Function1<? super Boolean, Unit> callback);

    void syncWearSportStatus();
}
