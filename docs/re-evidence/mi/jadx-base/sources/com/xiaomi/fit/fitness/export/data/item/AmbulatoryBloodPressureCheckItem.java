package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureCheckItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "time", "", "<init>", "(J)V", "getTime", "()J", "setTime", "getTimestamp", "setTimestamp", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AmbulatoryBloodPressureCheckItem extends DailyRecordItem implements IPointTimeData {

    @SerializedName("check_time")
    private long time;

    public AmbulatoryBloodPressureCheckItem(long j) {
        super(null);
        this.time = j;
    }

    public static /* synthetic */ AmbulatoryBloodPressureCheckItem copy$default(AmbulatoryBloodPressureCheckItem ambulatoryBloodPressureCheckItem, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ambulatoryBloodPressureCheckItem.time;
        }
        return ambulatoryBloodPressureCheckItem.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final AmbulatoryBloodPressureCheckItem copy(long time) {
        return new AmbulatoryBloodPressureCheckItem(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AmbulatoryBloodPressureCheckItem) && this.time == ((AmbulatoryBloodPressureCheckItem) other).time;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
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
        return "AmbulatoryBloodPressureCheckItem(time=" + this.time + ")";
    }
}
