package com.xiaomi.fitness.sleep.trace.policy;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/BreakCondition;", "", "matchBreak", "", "context", "Landroid/content/Context;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "interval", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BreakCondition {
    boolean matchBreak(@NotNull Context context, @Nullable TraceSchedule schedule, long interval);
}
