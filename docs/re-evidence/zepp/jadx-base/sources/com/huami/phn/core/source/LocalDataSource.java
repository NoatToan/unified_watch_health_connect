package com.huami.phn.core.source;

import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.model.PHNProjectRecord;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH&J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u000eJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0016\u001a\u00020\bH&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J\b\u0010\u001c\u001a\u00020\u001bH&J\u0016\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u001dH&J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0003H&¨\u0006 "}, d2 = {"Lcom/huami/phn/core/source/LocalDataSource;", "", "", "Lcom/huami/phn/core/model/PHNProjectRecord;", "records", "", "saveProjectFromWeb", "saveOrUpdateProject", "", "timestamp", "queryProject", "", "count", "lastTimestamp", "(ILjava/lang/Long;)Ljava/util/List;", "queryUnSyncedProject", "Lcom/huami/phn/core/model/PHNDailyAnalysisResult;", "entities", "saveDailyResultFromWeb", "saveDailyResult", "queryDailyResult", "queryUnSyncedDailyResult", "projectId", "queryDailyResultByPlanId", "(ILjava/lang/Long;J)Ljava/util/List;", "queryOldestDailyResultByPlanId", "queryOldestDailyResult", "", "clearDBData", "Lkotlinx/coroutines/flow/Flow;", "queryLatestProjectAsFlow", "queryOldestProject", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface LocalDataSource {
    void clearDBData();

    @NotNull
    List<PHNDailyAnalysisResult> queryDailyResult(int count, @Nullable Long lastTimestamp);

    @NotNull
    List<PHNDailyAnalysisResult> queryDailyResultByPlanId(int count, @Nullable Long lastTimestamp, long projectId);

    @NotNull
    Flow<List<PHNProjectRecord>> queryLatestProjectAsFlow();

    @NotNull
    List<PHNDailyAnalysisResult> queryOldestDailyResult();

    @NotNull
    List<PHNDailyAnalysisResult> queryOldestDailyResultByPlanId(long projectId);

    @Nullable
    PHNProjectRecord queryOldestProject();

    @Nullable
    PHNProjectRecord queryProject(long timestamp);

    @NotNull
    List<PHNProjectRecord> queryProject(int count, @Nullable Long lastTimestamp);

    @NotNull
    List<PHNDailyAnalysisResult> queryUnSyncedDailyResult();

    @NotNull
    List<PHNProjectRecord> queryUnSyncedProject();

    boolean saveDailyResult(@NotNull List<PHNDailyAnalysisResult> entities);

    boolean saveDailyResultFromWeb(@NotNull List<PHNDailyAnalysisResult> entities);

    boolean saveOrUpdateProject(@NotNull List<PHNProjectRecord> records);

    boolean saveProjectFromWeb(@NotNull List<PHNProjectRecord> records);
}
