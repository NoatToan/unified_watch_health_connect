package com.xiaomi.fitness.sport.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/data/TimerInfo;", "", "timerType", "", "timerWhen", "", "timerSystemCurrent", "<init>", "(IJJ)V", "getTimerType", "()I", "getTimerWhen", "()J", "getTimerSystemCurrent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimerInfo {
    private final long timerSystemCurrent;
    private final int timerType;
    private final long timerWhen;

    public TimerInfo(int i, long j, long j2) {
        this.timerType = i;
        this.timerWhen = j;
        this.timerSystemCurrent = j2;
    }

    public static /* synthetic */ TimerInfo copy$default(TimerInfo timerInfo, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = timerInfo.timerType;
        }
        if ((i2 & 2) != 0) {
            j = timerInfo.timerWhen;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = timerInfo.timerSystemCurrent;
        }
        return timerInfo.copy(i, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimerType() {
        return this.timerType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimerWhen() {
        return this.timerWhen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimerSystemCurrent() {
        return this.timerSystemCurrent;
    }

    @NotNull
    public final TimerInfo copy(int timerType, long timerWhen, long timerSystemCurrent) {
        return new TimerInfo(timerType, timerWhen, timerSystemCurrent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerInfo)) {
            return false;
        }
        TimerInfo timerInfo = (TimerInfo) other;
        return this.timerType == timerInfo.timerType && this.timerWhen == timerInfo.timerWhen && this.timerSystemCurrent == timerInfo.timerSystemCurrent;
    }

    public final long getTimerSystemCurrent() {
        return this.timerSystemCurrent;
    }

    public final int getTimerType() {
        return this.timerType;
    }

    public final long getTimerWhen() {
        return this.timerWhen;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.timerType) * 31) + Long.hashCode(this.timerWhen)) * 31) + Long.hashCode(this.timerSystemCurrent);
    }

    @NotNull
    public String toString() {
        return "TimerInfo(timerType=" + this.timerType + ", timerWhen=" + this.timerWhen + ", timerSystemCurrent=" + this.timerSystemCurrent + ")";
    }
}
