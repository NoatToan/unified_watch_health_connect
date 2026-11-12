package com.xiaomi.fitness.sleep.behavior.analyze.snore;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u001a\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000f\u0018\u00010\tH'J,\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH'¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SnoreReportDao;", "", "insert", "", "reports", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReport;", "([Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/SleepSnoreReport;)V", "queryByDayTime", "Landroidx/lifecycle/LiveData;", "deviceId", "", "beginOfDay", "", "queryAll", "", "queryReports", StatConstants.PARAM_START, StatConstants.PARAM_END, "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SnoreReportDao {
    @Insert(onConflict = 1)
    void insert(@NotNull SleepSnoreReport... reports);

    @Query("SELECT * FROM snore_report WHERE deleted = 0")
    @Nullable
    LiveData<List<SleepSnoreReport>> queryAll();

    @Query("SELECT * FROM snore_report WHERE timestamp = :beginOfDay AND deleted = 0 AND device_id = :deviceId")
    @Nullable
    LiveData<SleepSnoreReport> queryByDayTime(@Nullable String deviceId, long beginOfDay);

    @Query("SELECT * FROM snore_report WHERE timestamp >= :start AND timestamp <= :end AND deleted = 0 AND device_id = :deviceId")
    @Nullable
    List<SleepSnoreReport> queryReports(@Nullable String deviceId, long start, long end);
}
