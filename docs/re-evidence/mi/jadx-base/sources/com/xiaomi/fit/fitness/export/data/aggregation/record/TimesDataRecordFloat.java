package com.xiaomi.fit.fitness.export.data.aggregation.record;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordFloat;", "", "time", "", "valueArray", "", "<init>", "(J[F)V", "getTime", "()J", "setTime", "(J)V", "getValueArray", "()[F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimesDataRecordFloat {
    private long time;

    @Nullable
    private final float[] valueArray;

    public TimesDataRecordFloat(long j, @Nullable float[] fArr) {
        this.time = j;
        this.valueArray = fArr;
    }

    public static /* synthetic */ TimesDataRecordFloat copy$default(TimesDataRecordFloat timesDataRecordFloat, long j, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timesDataRecordFloat.time;
        }
        if ((i & 2) != 0) {
            fArr = timesDataRecordFloat.valueArray;
        }
        return timesDataRecordFloat.copy(j, fArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float[] getValueArray() {
        return this.valueArray;
    }

    @NotNull
    public final TimesDataRecordFloat copy(long time, @Nullable float[] valueArray) {
        return new TimesDataRecordFloat(time, valueArray);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimesDataRecordFloat)) {
            return false;
        }
        TimesDataRecordFloat timesDataRecordFloat = (TimesDataRecordFloat) other;
        return this.time == timesDataRecordFloat.time && Intrinsics.areEqual(this.valueArray, timesDataRecordFloat.valueArray);
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final float[] getValueArray() {
        return this.valueArray;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        float[] fArr = this.valueArray;
        return iHashCode + (fArr == null ? 0 : Arrays.hashCode(fArr));
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "TimesDataRecordFloat(time=" + this.time + ", valueArray=" + Arrays.toString(this.valueArray) + ")";
    }
}
