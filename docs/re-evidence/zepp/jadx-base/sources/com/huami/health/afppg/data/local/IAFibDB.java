package com.huami.health.afppg.data.local;

import com.huami.health.afppg.data.local.bean.AFibData;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u001e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¨\u0006\u0016"}, d2 = {"Lcom/huami/health/afppg/data/local/IAFibDB;", "", "", "userId", "", "clearData", "", "source", "", "timestamp", "deleteData", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "getUnsyncedData", "fromTimestamp", "toTimestamp", "getAFData", "data", "insertNewData", "updateSyncedState", "Lkotlinx/coroutines/flow/Flow;", "getAFDataFLow", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface IAFibDB {
    void clearData(@NotNull String userId);

    void clearData(@NotNull String userId, int source);

    void deleteData(@NotNull String userId, long timestamp);

    void deleteData(@NotNull String userId, @NotNull List<Long> timestamp);

    @NotNull
    List<AFibData> getAFData(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp);

    @NotNull
    Flow<List<AFibData>> getAFDataFLow(@NotNull String userId, @NotNull String fromTimestamp, @NotNull String toTimestamp);

    @NotNull
    List<AFibData> getUnsyncedData(@NotNull String userId, long timestamp);

    void insertNewData(@NotNull String userId, @NotNull List<AFibData> data);

    void updateSyncedState(@NotNull String userId, @NotNull List<Long> timestamp);
}
