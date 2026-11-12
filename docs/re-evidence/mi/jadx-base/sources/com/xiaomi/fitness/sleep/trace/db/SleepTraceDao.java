package com.xiaomi.fitness.sleep.trace.db;

import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.actions.SearchIntents;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH'J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H'J!\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000f\"\u00020\u0004H'¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH'¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceDao;", "", SearchIntents.EXTRA_QUERY, "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "version", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "category", "getLast", "insert", "", "logs", "", "([Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;)V", "delete", "beforeTime", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SleepTraceDao {
    @Query("DELETE FROM sleep_trace_log WHERE timestamp < :beforeTime")
    void delete(long beforeTime);

    @Query("SELECT * FROM sleep_trace_log WHERE version = :version AND category = :category ORDER BY timestamp DESC LIMIT 1")
    @Nullable
    SleepTraceLog getLast(int version, int category);

    @Insert(onConflict = 1)
    void insert(@NotNull SleepTraceLog... logs);

    @Query("SELECT * FROM sleep_trace_log WHERE version = :version AND category = :category AND timestamp BETWEEN :start AND :end ORDER BY timestamp")
    @NotNull
    List<SleepTraceLog> query(int version, int category, long start, long end);

    @Query("SELECT * FROM sleep_trace_log WHERE version = :version AND timestamp BETWEEN :start AND :end ORDER BY timestamp")
    @NotNull
    List<SleepTraceLog> query(int version, long start, long end);
}
