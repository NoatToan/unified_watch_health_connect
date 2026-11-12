package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "timeZone", "", "pace", "heartRate", "<init>", "(JILjava/lang/Integer;Ljava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getTimeZone", "()I", "setTimeZone", "(I)V", "getPace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeartRate", "setHeartRate", "(Ljava/lang/Integer;)V", "clearDataNotSaveToDb", "", "getTimestamp", "setTimestamp", "toString", "", "component1", "component2", "component3", "component4", "copy", "(JILjava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LactateThresholdItem extends DailyRecordItem {

    @SerializedName("heart_rate")
    @Nullable
    private Integer heartRate;

    @SerializedName("pace")
    @Nullable
    private final Integer pace;

    @SerializedName("time")
    private long time;

    @SerializedName("timeZone")
    private int timeZone;

    public /* synthetic */ LactateThresholdItem(long j, int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }

    public static /* synthetic */ LactateThresholdItem copy$default(LactateThresholdItem lactateThresholdItem, long j, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = lactateThresholdItem.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = lactateThresholdItem.timeZone;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            num = lactateThresholdItem.pace;
        }
        Integer num3 = num;
        if ((i2 & 8) != 0) {
            num2 = lactateThresholdItem.heartRate;
        }
        return lactateThresholdItem.copy(j2, i3, num3, num2);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem
    public void clearDataNotSaveToDb() {
        super.clearDataNotSaveToDb();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPace() {
        return this.pace;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @NotNull
    public final LactateThresholdItem copy(long time, int timeZone, @Nullable Integer pace, @Nullable Integer heartRate) {
        return new LactateThresholdItem(time, timeZone, pace, heartRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LactateThresholdItem)) {
            return false;
        }
        LactateThresholdItem lactateThresholdItem = (LactateThresholdItem) other;
        return this.time == lactateThresholdItem.time && this.timeZone == lactateThresholdItem.timeZone && Intrinsics.areEqual(this.pace, lactateThresholdItem.pace) && Intrinsics.areEqual(this.heartRate, lactateThresholdItem.heartRate);
    }

    @Nullable
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    @Nullable
    public final Integer getPace() {
        return this.pace;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Integer.hashCode(this.timeZone)) * 31;
        Integer num = this.pace;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.heartRate;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHeartRate(@Nullable Integer num) {
        this.heartRate = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTimeZone(int i) {
        this.timeZone = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "time=" + this.time;
    }

    public LactateThresholdItem(long j, int i, @Nullable Integer num, @Nullable Integer num2) {
        super(null);
        this.time = j;
        this.timeZone = i;
        this.pace = num;
        this.heartRate = num2;
    }
}
