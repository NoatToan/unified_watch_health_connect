package com.xiaomi.fit.fitness.export.data.aggregation.record;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValue;", "T", "", "Ljava/io/Serializable;", "time", "", "value", "<init>", "(JLjava/lang/Object;)V", "getTime", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "compareTo", "", "other", "component1", "component2", "copy", "(JLjava/lang/Object;)Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimedValue;", "equals", "", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimedValue<T> implements Comparable<TimedValue<T>>, Serializable {
    private final long time;
    private final T value;

    public TimedValue(long j, T t) {
        this.time = j;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimedValue copy$default(TimedValue timedValue, long j, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = timedValue.time;
        }
        if ((i & 2) != 0) {
            obj = timedValue.value;
        }
        return timedValue.copy(j, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final TimedValue<T> copy(long time, T value) {
        return new TimedValue<>(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return this.time == timedValue.time && Intrinsics.areEqual(this.value, timedValue.value);
    }

    public final long getTime() {
        return this.time;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        T t = this.value;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "TimedValue(time=" + this.time + ", value=" + this.value + ")";
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull TimedValue<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return (int) (this.time - other.time);
    }
}
