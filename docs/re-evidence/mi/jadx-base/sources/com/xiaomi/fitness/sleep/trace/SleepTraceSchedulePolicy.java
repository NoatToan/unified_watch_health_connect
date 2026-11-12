package com.xiaomi.fitness.sleep.trace;

import android.content.Context;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import com.xiaomi.fitness.sleep.trace.policy.BreakCondition;
import com.xiaomi.fitness.sleep.trace.policy.FibonacciSchedulePolicy;
import com.xiaomi.fitness.sleep.trace.policy.FixedIntervalSchedulePolicy;
import com.xiaomi.fitness.sleep.trace.policy.ISchedulePolicy;
import com.xiaomi.fitness.sleep.trace.policy.SequenceSchedulePolicy;
import com.xiaomi.fitness.sleep.trace.policy.TraceSchedule;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceSchedulePolicy;", "Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;", "<init>", "()V", "mSchedulePolicy", "Lcom/xiaomi/fitness/sleep/trace/policy/SequenceSchedulePolicy;", "requireNextSchedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "context", "Landroid/content/Context;", "prevSchedule", "StateBreakCondition", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceSchedulePolicy implements ISchedulePolicy {

    @NotNull
    private final SequenceSchedulePolicy mSchedulePolicy;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTraceSchedulePolicy$StateBreakCondition;", "Lcom/xiaomi/fitness/sleep/trace/policy/BreakCondition;", "sleepState", "", "", "<init>", "([I)V", "mStateArray", "matchBreak", "", "context", "Landroid/content/Context;", "schedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "interval", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSleepTraceSchedulePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTraceSchedulePolicy.kt\ncom/xiaomi/fitness/sleep/trace/SleepTraceSchedulePolicy$StateBreakCondition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
    public static final class StateBreakCondition implements BreakCondition {

        @NotNull
        private final int[] mStateArray;

        public StateBreakCondition(@NotNull int... sleepState) {
            Intrinsics.checkNotNullParameter(sleepState, "sleepState");
            Objects.requireNonNull(sleepState, "sleep state can't be null");
            Arrays.sort(sleepState);
            this.mStateArray = sleepState;
        }

        @Override // com.xiaomi.fitness.sleep.trace.policy.BreakCondition
        public boolean matchBreak(@NotNull Context context, @Nullable TraceSchedule schedule, long interval) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (interval >= 0) {
                return Arrays.binarySearch(this.mStateArray, UserSleepModel.INSTANCE.getInstance().requireSleepState(context, System.currentTimeMillis() + ((interval * ((long) 9)) / ((long) 10)))) < 0;
            }
            throw new IllegalStateException("please check your interval, is < 0".toString());
        }
    }

    public SleepTraceSchedulePolicy() {
        SequenceSchedulePolicy sequenceSchedulePolicy = new SequenceSchedulePolicy(new ISchedulePolicy[0]);
        this.mSchedulePolicy = sequenceSchedulePolicy;
        SleepTraceConfiguration.Companion companion = SleepTraceConfiguration.INSTANCE;
        int samplingRateWhenSleepPredict = companion.getSamplingRateWhenSleepPredict();
        int sleepPredictCycles = companion.getSleepPredictCycles();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        sequenceSchedulePolicy.appendPolicy(new FibonacciSchedulePolicy(timeUnit.toMillis(samplingRateWhenSleepPredict), sleepPredictCycles));
        sequenceSchedulePolicy.appendPolicy(new FixedIntervalSchedulePolicy(timeUnit.toMillis(companion.getSamplingRateWhenSleeping()), new StateBreakCondition(2)));
        sequenceSchedulePolicy.appendPolicy(new FixedIntervalSchedulePolicy(timeUnit.toMillis(companion.getSamplingRateWhenWakeupPredict()), new StateBreakCondition(2, 3)));
    }

    @Override // com.xiaomi.fitness.sleep.trace.policy.ISchedulePolicy
    @Nullable
    public TraceSchedule requireNextSchedule(@NotNull Context context, @Nullable TraceSchedule prevSchedule) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.mSchedulePolicy.requireNextSchedule(context, prevSchedule);
    }
}
