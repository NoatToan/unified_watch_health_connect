package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0004H\u0016J\r\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "measureID", "", "time", "highPressure", "", "lowPressure", "plus", "<init>", "(JJIII)V", "getMeasureID", "()J", "setMeasureID", "(J)V", "getTime", "setTime", "getHighPressure", "()I", "getLowPressure", "getPlus", "getTimestamp", "getPrimaryValue", "()Ljava/lang/Integer;", "getSecondaryValue", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DynamicBloodPressureItem extends DailyRecordItem implements IPointTimeData {

    @SerializedName("systolic_pressure")
    private final int highPressure;

    @SerializedName("diastolic_pressure")
    private final int lowPressure;

    @SerializedName("measurement_plan_id")
    private long measureID;

    @SerializedName("plus")
    private final int plus;

    @SerializedName("measure_time")
    private long time;

    public DynamicBloodPressureItem(long j, long j2, int i, int i2, int i3) {
        super(null);
        this.measureID = j;
        this.time = j2;
        this.highPressure = i;
        this.lowPressure = i2;
        this.plus = i3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureID() {
        return this.measureID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHighPressure() {
        return this.highPressure;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLowPressure() {
        return this.lowPressure;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlus() {
        return this.plus;
    }

    @NotNull
    public final DynamicBloodPressureItem copy(long measureID, long time, int highPressure, int lowPressure, int plus) {
        return new DynamicBloodPressureItem(measureID, time, highPressure, lowPressure, plus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicBloodPressureItem)) {
            return false;
        }
        DynamicBloodPressureItem dynamicBloodPressureItem = (DynamicBloodPressureItem) other;
        return this.measureID == dynamicBloodPressureItem.measureID && this.time == dynamicBloodPressureItem.time && this.highPressure == dynamicBloodPressureItem.highPressure && this.lowPressure == dynamicBloodPressureItem.lowPressure && this.plus == dynamicBloodPressureItem.plus;
    }

    public final int getHighPressure() {
        return this.highPressure;
    }

    public final int getLowPressure() {
        return this.lowPressure;
    }

    public final long getMeasureID() {
        return this.measureID;
    }

    public final int getPlus() {
        return this.plus;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.measureID) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.highPressure)) * 31) + Integer.hashCode(this.lowPressure)) * 31) + Integer.hashCode(this.plus);
    }

    public final void setMeasureID(long j) {
        this.measureID = j;
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
        return "DynamicBloodPressureItem(time=" + this.time + ", sid=" + getSid() + ", highPressure=" + this.highPressure + ", lowPressure=" + this.lowPressure + ", plus=" + this.plus + ")";
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
