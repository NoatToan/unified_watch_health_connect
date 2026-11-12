package com.xiaomi.fitness.sleep.trace.policy;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/FixedIntervalSchedulePolicy;", "Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;", "mInterval", "", "mBreakCondition", "Lcom/xiaomi/fitness/sleep/trace/policy/BreakCondition;", "<init>", "(JLcom/xiaomi/fitness/sleep/trace/policy/BreakCondition;)V", "requireNextSchedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "context", "Landroid/content/Context;", "prevSchedule", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedIntervalSchedulePolicy implements ISchedulePolicy {

    @Nullable
    private final BreakCondition mBreakCondition;
    private final long mInterval;

    public FixedIntervalSchedulePolicy(long j, @Nullable BreakCondition breakCondition) {
        this.mInterval = j;
        this.mBreakCondition = breakCondition;
    }

    @Override // com.xiaomi.fitness.sleep.trace.policy.ISchedulePolicy
    @Nullable
    public TraceSchedule requireNextSchedule(@NotNull Context context, @Nullable TraceSchedule prevSchedule) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (prevSchedule == null) {
            TraceSchedule traceSchedule = new TraceSchedule();
            traceSchedule.setScheduleInterval(this.mInterval);
            return traceSchedule;
        }
        BreakCondition breakCondition = this.mBreakCondition;
        if (breakCondition != null && breakCondition.matchBreak(context, prevSchedule, this.mInterval)) {
            return null;
        }
        prevSchedule.setScheduleInterval(this.mInterval);
        return prevSchedule;
    }
}
