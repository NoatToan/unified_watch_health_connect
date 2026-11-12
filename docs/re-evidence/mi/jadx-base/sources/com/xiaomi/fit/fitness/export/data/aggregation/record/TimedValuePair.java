package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValuePair;", "T", "", "time", "", MedicalIdSPContract.PREF_FIRST, "second", "<init>", "(JLjava/lang/Object;Ljava/lang/Object;)V", "getTime", "()J", "setTime", "(J)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "component3", "copy", "(JLjava/lang/Object;Ljava/lang/Object;)Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValuePair;", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimedValuePair<T> {
    private final T first;
    private final T second;
    private long time;

    public TimedValuePair(long j, T t, T t2) {
        this.time = j;
        this.first = t;
        this.second = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimedValuePair copy$default(TimedValuePair timedValuePair, long j, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            j = timedValuePair.time;
        }
        if ((i & 2) != 0) {
            obj = timedValuePair.first;
        }
        if ((i & 4) != 0) {
            obj2 = timedValuePair.second;
        }
        return timedValuePair.copy(j, obj, obj2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final T component2() {
        return this.first;
    }

    public final T component3() {
        return this.second;
    }

    @NotNull
    public final TimedValuePair<T> copy(long time, T first, T second) {
        return new TimedValuePair<>(time, first, second);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValuePair)) {
            return false;
        }
        TimedValuePair timedValuePair = (TimedValuePair) other;
        return this.time == timedValuePair.time && Intrinsics.areEqual(this.first, timedValuePair.first) && Intrinsics.areEqual(this.second, timedValuePair.second);
    }

    public final T getFirst() {
        return this.first;
    }

    public final T getSecond() {
        return this.second;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        T t = this.first;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        T t2 = this.second;
        return iHashCode2 + (t2 != null ? t2.hashCode() : 0);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "TimedValuePair(time=" + this.time + ", first=" + this.first + ", second=" + this.second + ")";
    }
}
