package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.ActiveStageType;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000fJ\b\u0010'\u001a\u00020\u0003H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#JX\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006;"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "startTime", "", "endTime", "type", "", "steps", "distance", "calories", "riseHeight", "", "<init>", "(JJILjava/lang/Integer;IILjava/lang/Float;)V", "(JJILjava/lang/Integer;II)V", "(JJIII)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getType", "()I", "getSteps", "()Ljava/lang/Integer;", "setSteps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDistance", "setDistance", "(I)V", "getCalories", "setCalories", "getRiseHeight", "()Ljava/lang/Float;", "setRiseHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getTimestamp", "setTimestamp", "", "time", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJILjava/lang/Integer;IILjava/lang/Float;)Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActiveStageItem extends DailyRecordItem {

    @SerializedName("calories")
    private int calories;

    @SerializedName("distance")
    private int distance;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long endTime;

    @SerializedName("rise_height")
    @Nullable
    private Float riseHeight;

    @SerializedName(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME)
    private long startTime;

    @SerializedName("steps")
    @Nullable
    private Integer steps;

    @SerializedName(alternate = {"dynamic_type"}, value = "type")
    private final int type;

    public ActiveStageItem(long j, long j2, @ActiveStageType int i, @Nullable Integer num, int i2, int i3, @Nullable Float f) {
        super(null);
        this.startTime = j;
        this.endTime = j2;
        this.type = i;
        this.steps = num;
        this.distance = i2;
        this.calories = i3;
        this.riseHeight = f;
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
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getRiseHeight() {
        return this.riseHeight;
    }

    @NotNull
    public final ActiveStageItem copy(long startTime, long endTime, @ActiveStageType int type, @Nullable Integer steps, int distance, int calories, @Nullable Float riseHeight) {
        return new ActiveStageItem(startTime, endTime, type, steps, distance, calories, riseHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveStageItem)) {
            return false;
        }
        ActiveStageItem activeStageItem = (ActiveStageItem) other;
        return this.startTime == activeStageItem.startTime && this.endTime == activeStageItem.endTime && this.type == activeStageItem.type && Intrinsics.areEqual(this.steps, activeStageItem.steps) && this.distance == activeStageItem.distance && this.calories == activeStageItem.calories && Intrinsics.areEqual((Object) this.riseHeight, (Object) activeStageItem.riseHeight);
    }

    public final int getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Float getRiseHeight() {
        return this.riseHeight;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Integer getSteps() {
        return this.steps;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.startTime;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.type)) * 31;
        Integer num = this.steps;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.calories)) * 31;
        Float f = this.riseHeight;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final void setCalories(int i) {
        this.calories = i;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setRiseHeight(@Nullable Float f) {
        this.riseHeight = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSteps(@Nullable Integer num) {
        this.steps = num;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        long j = time - this.startTime;
        this.startTime = time;
        this.endTime += j;
    }

    @NotNull
    public String toString() {
        return "ActiveStageItem(sid=" + getSid() + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", riseHeight=" + this.riseHeight + ")";
    }

    public ActiveStageItem(long j, long j2, @ActiveStageType int i, @Nullable Integer num, int i2, int i3) {
        this(j, j2, i, num, i2, i3, null);
    }

    public ActiveStageItem(long j, long j2, int i, int i2, int i3) {
        this(j, j2, i, null, i2, i3);
    }
}
