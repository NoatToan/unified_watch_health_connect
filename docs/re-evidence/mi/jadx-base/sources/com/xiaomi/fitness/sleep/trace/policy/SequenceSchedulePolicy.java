package com.xiaomi.fitness.sleep.trace.policy;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u001c\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/SequenceSchedulePolicy;", "Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;", "policies", "", "<init>", "([Lcom/xiaomi/fitness/sleep/trace/policy/ISchedulePolicy;)V", "mPolicyList", "", "appendPolicy", "", "policy", "removePolicy", "requireNextSchedule", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "context", "Landroid/content/Context;", "prevSchedule", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SequenceSchedulePolicy implements ISchedulePolicy {

    @NotNull
    private final List<ISchedulePolicy> mPolicyList;

    public SequenceSchedulePolicy(@NotNull ISchedulePolicy... policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.mPolicyList = new LinkedList();
        for (ISchedulePolicy iSchedulePolicy : policies) {
            appendPolicy(iSchedulePolicy);
        }
    }

    public final void appendPolicy(@NotNull ISchedulePolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        List<ISchedulePolicy> list = this.mPolicyList;
        Objects.requireNonNull(policy);
        Intrinsics.checkNotNullExpressionValue(policy, "requireNonNull(...)");
        list.add(policy);
    }

    public final void removePolicy(@NotNull ISchedulePolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        List<ISchedulePolicy> list = this.mPolicyList;
        Objects.requireNonNull(policy);
        list.remove(policy);
    }

    @Override // com.xiaomi.fitness.sleep.trace.policy.ISchedulePolicy
    @Nullable
    public TraceSchedule requireNextSchedule(@NotNull Context context, @Nullable TraceSchedule prevSchedule) {
        Intrinsics.checkNotNullParameter(context, "context");
        int size = this.mPolicyList.size();
        for (int sequenceId = prevSchedule != null ? prevSchedule.getSequenceId() : 0; sequenceId < size; sequenceId++) {
            TraceSchedule traceScheduleRequireNextSchedule = this.mPolicyList.get(sequenceId).requireNextSchedule(context, prevSchedule);
            if (traceScheduleRequireNextSchedule != null) {
                traceScheduleRequireNextSchedule.setSequenceId(sequenceId);
                return traceScheduleRequireNextSchedule;
            }
        }
        return null;
    }
}
