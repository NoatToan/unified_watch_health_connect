package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0004H\u0016J\r\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", EcgSchemaHandler.PARAM_MEASURE_TIME, "", "highPressure", "", "lowPressure", DailyReportKey.measurementStatus, "<init>", "(JIII)V", "getMeasureTime", "()J", "setMeasureTime", "(J)V", "getHighPressure", "()I", "getLowPressure", "getMeasurementStatus", "getTimestamp", "getPrimaryValue", "()Ljava/lang/Integer;", "getSecondaryValue", "setTimestamp", "", "time", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AmbulatoryBloodPressureItem extends DailyRecordItem implements IPointTimeData {

    @SerializedName("systolic_pressure")
    private final int highPressure;

    @SerializedName("diastolic_pressure")
    private final int lowPressure;

    /* JADX INFO: renamed from: measureTime, reason: from kotlin metadata and from toString */
    @SerializedName("start_measure_time")
    private long time;

    /* JADX INFO: renamed from: measurementStatus, reason: from kotlin metadata and from toString */
    @SerializedName("blood_pressure_status")
    private final int status;

    public AmbulatoryBloodPressureItem(long j, int i, int i2, @MeasurementStatus int i3) {
        super(null);
        this.time = j;
        this.highPressure = i;
        this.lowPressure = i2;
        this.status = i3;
    }

    public static /* synthetic */ AmbulatoryBloodPressureItem copy$default(AmbulatoryBloodPressureItem ambulatoryBloodPressureItem, long j, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = ambulatoryBloodPressureItem.time;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = ambulatoryBloodPressureItem.highPressure;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = ambulatoryBloodPressureItem.lowPressure;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = ambulatoryBloodPressureItem.status;
        }
        return ambulatoryBloodPressureItem.copy(j2, i5, i6, i3);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AmbulatoryBloodPressureItem copy(long measureTime, int highPressure, int lowPressure, @MeasurementStatus int measurementStatus) {
        return new AmbulatoryBloodPressureItem(measureTime, highPressure, lowPressure, measurementStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmbulatoryBloodPressureItem)) {
            return false;
        }
        AmbulatoryBloodPressureItem ambulatoryBloodPressureItem = (AmbulatoryBloodPressureItem) other;
        return this.time == ambulatoryBloodPressureItem.time && this.highPressure == ambulatoryBloodPressureItem.highPressure && this.lowPressure == ambulatoryBloodPressureItem.lowPressure && this.status == ambulatoryBloodPressureItem.status;
    }

    public final int getHighPressure() {
        return this.highPressure;
    }

    public final int getLowPressure() {
        return this.lowPressure;
    }

    public final long getMeasureTime() {
        return this.time;
    }

    public final int getMeasurementStatus() {
        return this.status;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.highPressure)) * 31) + Integer.hashCode(this.lowPressure)) * 31) + Integer.hashCode(this.status);
    }

    public final void setMeasureTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "AmbulatoryBloodPressureItem(time=" + this.time + ", sid=" + getSid() + ", highPressure=" + this.highPressure + ", lowPressure=" + this.lowPressure + ", status=" + this.status + ")";
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
