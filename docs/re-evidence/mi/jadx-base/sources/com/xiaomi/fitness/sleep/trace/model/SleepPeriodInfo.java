package com.xiaomi.fitness.sleep.trace.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/model/SleepPeriodInfo;", "", "earliestSleepTime", "", "earliestWakeupTime", "latestWakeupTime", "<init>", "(JJJ)V", "getEarliestSleepTime", "()J", "getEarliestWakeupTime", "getLatestWakeupTime", "toString", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepPeriodInfo {
    private final long earliestSleepTime;
    private final long earliestWakeupTime;
    private final long latestWakeupTime;

    public SleepPeriodInfo(long j, long j2, long j3) {
        this.earliestSleepTime = j;
        this.earliestWakeupTime = j2;
        this.latestWakeupTime = j3;
    }

    public final long getEarliestSleepTime() {
        return this.earliestSleepTime;
    }

    public final long getEarliestWakeupTime() {
        return this.earliestWakeupTime;
    }

    public final long getLatestWakeupTime() {
        return this.latestWakeupTime;
    }

    @NotNull
    public String toString() {
        return "SleepPeriodInfo(earliestSleepTime=" + this.earliestSleepTime + ", earliestWakeupTime=" + this.earliestWakeupTime + ", latestWakeupTime=" + this.latestWakeupTime + ")";
    }
}
