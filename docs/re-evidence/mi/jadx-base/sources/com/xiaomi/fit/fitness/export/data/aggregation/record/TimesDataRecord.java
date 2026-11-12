package com.xiaomi.fit.fitness.export.data.aggregation.record;

import com.mibi.sdk.component.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecord;", "", "time", "", "avgValue", "", Constants.KEY_RECHARGE_MAXVALUE, Constants.KEY_RECHARGE_MINVALUE, "valueArray", "", "<init>", "(JBBB[B)V", "getTime", "()J", "getAvgValue", "()B", "getMaxValue", "getMinValue", "getValueArray", "()[B", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimesDataRecord {
    private final byte avgValue;
    private final byte maxValue;
    private final byte minValue;
    private final long time;

    @Nullable
    private final byte[] valueArray;

    public TimesDataRecord(long j, byte b2, byte b3, byte b4, @Nullable byte[] bArr) {
        this.time = j;
        this.avgValue = b2;
        this.maxValue = b3;
        this.minValue = b4;
        this.valueArray = bArr;
    }

    public static /* synthetic */ TimesDataRecord copy$default(TimesDataRecord timesDataRecord, long j, byte b2, byte b3, byte b4, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timesDataRecord.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            b2 = timesDataRecord.avgValue;
        }
        byte b5 = b2;
        if ((i & 4) != 0) {
            b3 = timesDataRecord.maxValue;
        }
        byte b6 = b3;
        if ((i & 8) != 0) {
            b4 = timesDataRecord.minValue;
        }
        byte b7 = b4;
        if ((i & 16) != 0) {
            bArr = timesDataRecord.valueArray;
        }
        return timesDataRecord.copy(j2, b5, b6, b7, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte getMinValue() {
        return this.minValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte[] getValueArray() {
        return this.valueArray;
    }

    @NotNull
    public final TimesDataRecord copy(long time, byte avgValue, byte maxValue, byte minValue, @Nullable byte[] valueArray) {
        return new TimesDataRecord(time, avgValue, maxValue, minValue, valueArray);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimesDataRecord)) {
            return false;
        }
        TimesDataRecord timesDataRecord = (TimesDataRecord) other;
        return this.time == timesDataRecord.time && this.avgValue == timesDataRecord.avgValue && this.maxValue == timesDataRecord.maxValue && this.minValue == timesDataRecord.minValue && Intrinsics.areEqual(this.valueArray, timesDataRecord.valueArray);
    }

    public final byte getAvgValue() {
        return this.avgValue;
    }

    public final byte getMaxValue() {
        return this.maxValue;
    }

    public final byte getMinValue() {
        return this.minValue;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final byte[] getValueArray() {
        return this.valueArray;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.time) * 31) + Byte.hashCode(this.avgValue)) * 31) + Byte.hashCode(this.maxValue)) * 31) + Byte.hashCode(this.minValue)) * 31;
        byte[] bArr = this.valueArray;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        long j = this.time;
        byte b2 = this.avgValue;
        byte b3 = this.maxValue;
        byte b4 = this.minValue;
        return "TimesDataRecord(time=" + j + ", avgValue=" + ((int) b2) + ", maxValue=" + ((int) b3) + ", minValue=" + ((int) b4) + ", valueArray=" + Arrays.toString(this.valueArray) + ")";
    }
}
