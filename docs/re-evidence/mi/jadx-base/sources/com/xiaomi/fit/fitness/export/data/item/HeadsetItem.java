package com.xiaomi.fit.fitness.export.data.item;

import androidx.health.connect.client.records.OvulationTestRecord;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "startTime", "", "endTime", OvulationTestRecord.Result.HIGH, "", "<init>", "(JJZ)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getHigh", "()Z", "getTimestamp", "setTimestamp", "", "time", "getDuration", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeadsetItem extends DailyRecordItem {

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @SerializedName(OvulationTestRecord.Result.HIGH)
    private final boolean high;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private long startTime;

    public HeadsetItem(long j, long j2, boolean z) {
        super(null);
        this.startTime = j;
        this.endTime = j2;
        this.high = z;
    }

    public static /* synthetic */ HeadsetItem copy$default(HeadsetItem headsetItem, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = headsetItem.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = headsetItem.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = headsetItem.high;
        }
        return headsetItem.copy(j3, j4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHigh() {
        return this.high;
    }

    @NotNull
    public final HeadsetItem copy(long startTime, long endTime, boolean high) {
        return new HeadsetItem(startTime, endTime, high);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetItem)) {
            return false;
        }
        HeadsetItem headsetItem = (HeadsetItem) other;
        return this.startTime == headsetItem.startTime && this.endTime == headsetItem.endTime && this.high == headsetItem.high;
    }

    public final long getDuration() {
        return this.endTime - this.startTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getHigh() {
        return this.high;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.startTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Boolean.hashCode(this.high);
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        long j = time - this.startTime;
        this.startTime = time;
        this.endTime += j;
    }

    @NotNull
    public String toString() {
        return "HeadsetItem(startTime=" + this.startTime + ", endTime=" + this.endTime + ", high=" + this.high + ")";
    }
}
