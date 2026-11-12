package com.huami.sleep.statistic.dto;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/statistic/dto/TimeParam;", "", "Lcom/huami/sleep/statistic/dto/TimeMode;", "component1", "", "component2", "mode", "time", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/sleep/statistic/dto/TimeMode;", "getMode", "()Lcom/huami/sleep/statistic/dto/TimeMode;", "setMode", "(Lcom/huami/sleep/statistic/dto/TimeMode;)V", "b", "J", "getTime", "()J", "setTime", "(J)V", "<init>", "(Lcom/huami/sleep/statistic/dto/TimeMode;J)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TimeParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private TimeMode mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private long time;

    public TimeParam(@NotNull TimeMode timeMode, long j) {
        this.mode = timeMode;
        this.time = j;
    }

    public static /* synthetic */ TimeParam copy$default(TimeParam timeParam, TimeMode timeMode, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            timeMode = timeParam.mode;
        }
        if ((i & 2) != 0) {
            j = timeParam.time;
        }
        return timeParam.copy(timeMode, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TimeMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final TimeParam copy(@NotNull TimeMode mode, long time) {
        return new TimeParam(mode, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeParam)) {
            return false;
        }
        TimeParam timeParam = (TimeParam) other;
        return this.mode == timeParam.mode && this.time == timeParam.time;
    }

    @NotNull
    public final TimeMode getMode() {
        return this.mode;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.mode.hashCode() * 31) + b.a(this.time);
    }

    public final void setMode(@NotNull TimeMode timeMode) {
        this.mode = timeMode;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "TimeParam(mode=" + this.mode + ", time=" + this.time + ")";
    }

    public /* synthetic */ TimeParam(TimeMode timeMode, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMode, (i & 2) != 0 ? 0L : j);
    }
}
