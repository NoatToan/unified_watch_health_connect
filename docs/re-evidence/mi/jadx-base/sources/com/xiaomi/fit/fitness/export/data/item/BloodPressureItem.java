package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.data.annotation.BPMeasurementStatus;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001a\u001a\u00020\u0004H\u0016J\r\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0013J\r\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "time", "", "highPressure", "", "lowPressure", "<init>", "(JII)V", "getTime", "()J", "setTime", "(J)V", "getHighPressure", "()I", "getLowPressure", DailyReportKey.pulse, "getPulse", "()Ljava/lang/Integer;", "setPulse", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DailyReportKey.measurementStatus, "getMeasurementStatus", "setMeasurementStatus", "getTimestamp", "getPrimaryValue", "getSecondaryValue", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodPressureItem extends DailyRecordItem implements IPointTimeData {

    @SerializedName("systolic_pressure")
    private final int highPressure;

    @SerializedName("diastolic_pressure")
    private final int lowPressure;

    /* JADX INFO: renamed from: measurementStatus, reason: from kotlin metadata and from toString */
    @SerializedName("measurement_status")
    @BPMeasurementStatus
    @Nullable
    private Integer status;

    @SerializedName(DailyReportKey.pulse)
    @Nullable
    private Integer pulse;

    @SerializedName("time")
    private long time;

    public BloodPressureItem(long j, int i, int i2) {
        super(null);
        this.time = j;
        this.highPressure = i;
        this.lowPressure = i2;
    }

    public static /* synthetic */ BloodPressureItem copy$default(BloodPressureItem bloodPressureItem, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = bloodPressureItem.time;
        }
        if ((i3 & 2) != 0) {
            i = bloodPressureItem.highPressure;
        }
        if ((i3 & 4) != 0) {
            i2 = bloodPressureItem.lowPressure;
        }
        return bloodPressureItem.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHighPressure() {
        return this.highPressure;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowPressure() {
        return this.lowPressure;
    }

    @NotNull
    public final BloodPressureItem copy(long time, int highPressure, int lowPressure) {
        return new BloodPressureItem(time, highPressure, lowPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureItem)) {
            return false;
        }
        BloodPressureItem bloodPressureItem = (BloodPressureItem) other;
        return this.time == bloodPressureItem.time && this.highPressure == bloodPressureItem.highPressure && this.lowPressure == bloodPressureItem.lowPressure;
    }

    public final int getHighPressure() {
        return this.highPressure;
    }

    public final int getLowPressure() {
        return this.lowPressure;
    }

    @Nullable
    /* JADX INFO: renamed from: getMeasurementStatus, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getPulse() {
        return this.pulse;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Integer.hashCode(this.highPressure)) * 31) + Integer.hashCode(this.lowPressure);
    }

    public final void setMeasurementStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setPulse(@Nullable Integer num) {
        this.pulse = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "BloodPressureItem(time=" + this.time + ", sid=" + getSid() + ", highPressure=" + this.highPressure + ", lowPressure=" + this.lowPressure + ", pulse=" + this.pulse + ", status=" + this.status + ")";
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Integer getPrimaryValue() {
        return Integer.valueOf(this.highPressure);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Integer getSecondaryValue() {
        return Integer.valueOf(this.lowPressure);
    }
}
