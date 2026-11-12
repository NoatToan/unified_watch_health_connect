package com.xiaomi.fitness.sleep.trace;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/ScheduleStatus;", "", "<init>", "()V", "nextScheduleTime", "", "getNextScheduleTime", "()J", "setNextScheduleTime", "(J)V", "isInterrupt", "", "()Z", "setInterrupt", "(Z)V", "hasNextSchedule", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScheduleStatus {
    public static final long INVALIDATE_TIME = -1;
    private boolean isInterrupt;
    private long nextScheduleTime = -1;

    public final long getNextScheduleTime() {
        return this.nextScheduleTime;
    }

    public final boolean hasNextSchedule() {
        return this.nextScheduleTime != -1;
    }

    /* JADX INFO: renamed from: isInterrupt, reason: from getter */
    public final boolean getIsInterrupt() {
        return this.isInterrupt;
    }

    public final void setInterrupt(boolean z) {
        this.isInterrupt = z;
    }

    public final void setNextScheduleTime(long j) {
        this.nextScheduleTime = j;
    }
}
