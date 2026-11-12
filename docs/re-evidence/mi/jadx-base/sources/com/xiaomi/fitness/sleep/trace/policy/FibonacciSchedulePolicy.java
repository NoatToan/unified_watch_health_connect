package com.xiaomi.fitness.sleep.trace.policy;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/FibonacciSchedulePolicy;", "Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;", "intervalUnit", "", "consequentCount", "", "<init>", "(JI)V", "mIntervalUnit", "mMaxInterval", "requireNextSchedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "context", "Landroid/content/Context;", "prevSchedule", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFibonacciSchedulePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FibonacciSchedulePolicy.kt\ncom/xiaomi/fitness/sleep/trace/policy/FibonacciSchedulePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class FibonacciSchedulePolicy implements ISchedulePolicy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long mIntervalUnit;
    private final long mMaxInterval;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/FibonacciSchedulePolicy$Companion;", "", "<init>", "()V", "getFib", "", "n", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getFib(int n) {
            if (n <= 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            return getFib(n - 2) + getFib(n - 1);
        }
    }

    public FibonacciSchedulePolicy(long j, int i) {
        if (j <= 0 || i <= 0) {
            throw new IllegalArgumentException("args <= 0".toString());
        }
        this.mIntervalUnit = j;
        this.mMaxInterval = j * ((long) INSTANCE.getFib(i));
    }

    @Override // com.xiaomi.fitness.sleep.trace.policy.ISchedulePolicy
    @Nullable
    public TraceSchedule requireNextSchedule(@NotNull Context context, @Nullable TraceSchedule prevSchedule) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (prevSchedule == null) {
            TraceSchedule traceSchedule = new TraceSchedule();
            traceSchedule.setScheduleInterval(this.mIntervalUnit);
            return traceSchedule;
        }
        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(prevSchedule.getRealTimeOffset(), prevSchedule.getScheduleInterval() + prevSchedule.getScheduleInterval(1));
        if (jCoerceAtLeast > this.mMaxInterval) {
            return null;
        }
        prevSchedule.setScheduleInterval(jCoerceAtLeast);
        return prevSchedule;
    }
}
