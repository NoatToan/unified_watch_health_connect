package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.mibi.sdk.component.Constants;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "Ljava/io/Serializable;", "time", "", "avgValue", "", Constants.KEY_RECHARGE_MAXVALUE, Constants.KEY_RECHARGE_MINVALUE, "valueArray", "", "<init>", "(JIII[I)V", "(J[I)V", "getTime", "()J", "setTime", "(J)V", "getAvgValue", "()I", "getMaxValue", "getMinValue", "getValueArray", "()[I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimesDataRecordInt implements Serializable {
    private final int avgValue;
    private final int maxValue;
    private final int minValue;
    private long time;

    @Nullable
    private final int[] valueArray;

    public TimesDataRecordInt(long j, int i, int i2, int i3, @Nullable int[] iArr) {
        this.time = j;
        this.avgValue = i;
        this.maxValue = i2;
        this.minValue = i3;
        this.valueArray = iArr;
    }

    public static /* synthetic */ TimesDataRecordInt copy$default(TimesDataRecordInt timesDataRecordInt, long j, int i, int i2, int i3, int[] iArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = timesDataRecordInt.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = timesDataRecordInt.avgValue;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = timesDataRecordInt.maxValue;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = timesDataRecordInt.minValue;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            iArr = timesDataRecordInt.valueArray;
        }
        return timesDataRecordInt.copy(j2, i5, i6, i7, iArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int[] getValueArray() {
        return this.valueArray;
    }

    @NotNull
    public final TimesDataRecordInt copy(long time, int avgValue, int maxValue, int minValue, @Nullable int[] valueArray) {
        return new TimesDataRecordInt(time, avgValue, maxValue, minValue, valueArray);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimesDataRecordInt)) {
            return false;
        }
        TimesDataRecordInt timesDataRecordInt = (TimesDataRecordInt) other;
        return this.time == timesDataRecordInt.time && this.avgValue == timesDataRecordInt.avgValue && this.maxValue == timesDataRecordInt.maxValue && this.minValue == timesDataRecordInt.minValue && Intrinsics.areEqual(this.valueArray, timesDataRecordInt.valueArray);
    }

    public final int getAvgValue() {
        return this.avgValue;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final int[] getValueArray() {
        return this.valueArray;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.avgValue)) * 31) + Integer.hashCode(this.maxValue)) * 31) + Integer.hashCode(this.minValue)) * 31;
        int[] iArr = this.valueArray;
        return iHashCode + (iArr == null ? 0 : Arrays.hashCode(iArr));
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "TimesDataRecordInt(time=" + this.time + ", avgValue=" + this.avgValue + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", valueArray=" + Arrays.toString(this.valueArray) + ")";
    }

    public TimesDataRecordInt(long j, @Nullable int[] iArr) {
        this(j, 0, 0, 0, iArr);
    }
}
