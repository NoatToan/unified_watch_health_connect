package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/IScheduler;", "", "onScheduling", "Ljava/util/concurrent/Future;", "Lcom/xiaomi/fitness/sleep/trace/ScheduleStatus;", "context", "Landroid/content/Context;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "onStopSchedule", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IScheduler {
    @NotNull
    Future<ScheduleStatus> onScheduling(@NotNull Context context, @Nullable TraceSchedule schedule);

    void onStopSchedule(@NotNull Context context);
}
