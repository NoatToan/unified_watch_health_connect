package com.xiaomi.fitness.sleep.trace.policy;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;", "", "requireNextSchedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "context", "Landroid/content/Context;", "prevSchedule", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISchedulePolicy {
    @Nullable
    TraceSchedule requireNextSchedule(@NotNull Context context, @Nullable TraceSchedule prevSchedule);
}
