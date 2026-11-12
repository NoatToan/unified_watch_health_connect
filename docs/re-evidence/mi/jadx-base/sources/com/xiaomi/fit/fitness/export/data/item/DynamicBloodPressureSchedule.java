package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\b\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\u0013\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0006R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u00060"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/DynamicBloodPressureSchedule;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/IPointTimeData;", "time", "", "<init>", "(J)V", "startTime", "endTime", "status", "", "(JJJI)V", "getTime", "()J", "setTime", "getStartTime", "setStartTime", "getEndTime", "setEndTime", "getStatus", "()I", "setStatus", "(I)V", "resultItem", "Lcom/xiaomi/fit/fitness/export/data/item/DynamicScheduleItem;", "getResultItem", "()Lcom/xiaomi/fit/fitness/export/data/item/DynamicScheduleItem;", "setResultItem", "(Lcom/xiaomi/fit/fitness/export/data/item/DynamicScheduleItem;)V", "awakeItem", "getAwakeItem", "setAwakeItem", "sleepItem", "getSleepItem", "setSleepItem", "getTimestamp", "setTimestamp", "", "isValidSchedule", "", "toString", "", "component1", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DynamicBloodPressureSchedule extends DailyRecordItem implements IPointTimeData {

    @SerializedName("wake_blood_pressure")
    @Nullable
    private DynamicScheduleItem awakeItem;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @SerializedName("statistic_result")
    @Nullable
    private DynamicScheduleItem resultItem;

    @SerializedName("sleep_blood_pressure")
    @Nullable
    private DynamicScheduleItem sleepItem;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private long startTime;

    @SerializedName("status")
    @DynamicScheduleStatus
    private int status;

    @SerializedName("time")
    private long time;

    public DynamicBloodPressureSchedule(long j) {
        super(null);
        this.time = j;
        this.status = -1;
    }

    public static /* synthetic */ DynamicBloodPressureSchedule copy$default(DynamicBloodPressureSchedule dynamicBloodPressureSchedule, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dynamicBloodPressureSchedule.time;
        }
        return dynamicBloodPressureSchedule.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final DynamicBloodPressureSchedule copy(long time) {
        return new DynamicBloodPressureSchedule(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DynamicBloodPressureSchedule) && this.time == ((DynamicBloodPressureSchedule) other).time;
    }

    @Nullable
    public final DynamicScheduleItem getAwakeItem() {
        return this.awakeItem;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final DynamicScheduleItem getResultItem() {
        return this.resultItem;
    }

    @Nullable
    public final DynamicScheduleItem getSleepItem() {
        return this.sleepItem;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
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

    public final boolean isValidSchedule() {
        long j = this.endTime;
        long j2 = this.startTime;
        return j > j2 && j2 != 0 && this.status > -1;
    }

    public final void setAwakeItem(@Nullable DynamicScheduleItem dynamicScheduleItem) {
        this.awakeItem = dynamicScheduleItem;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setResultItem(@Nullable DynamicScheduleItem dynamicScheduleItem) {
        this.resultItem = dynamicScheduleItem;
    }

    public final void setSleepItem(@Nullable DynamicScheduleItem dynamicScheduleItem) {
        this.sleepItem = dynamicScheduleItem;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
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
        return "DynamicBloodPressureSchedule(time=" + this.time + ", sid = " + getSid() + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", status=" + this.status + ", resultItem=" + this.resultItem + ", awakeItem=" + this.awakeItem + ", sleepItem=" + this.sleepItem + ")";
    }

    public DynamicBloodPressureSchedule(long j, long j2, long j3, int i) {
        this(j);
        this.startTime = j2;
        this.endTime = j3;
        this.status = i;
    }
}
