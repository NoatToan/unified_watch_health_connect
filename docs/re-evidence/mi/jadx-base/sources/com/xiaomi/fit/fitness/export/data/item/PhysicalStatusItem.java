package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u0005J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010JH\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "trainingStress", "", "physicalFitnessLevel", "fatigueLevel", "physicalFitnessStatus", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getTrainingStress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhysicalFitnessLevel", "setPhysicalFitnessLevel", "(Ljava/lang/Integer;)V", "getFatigueLevel", "setFatigueLevel", "getPhysicalFitnessStatus", "setPhysicalFitnessStatus", "levelStatus", "getLevelStatus", "()I", "clearDataNotSaveToDb", "", "getTimestamp", "setTimestamp", "toString", "", "getPhysicalStatusLevel", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhysicalStatusItem extends DailyRecordItem {

    @SerializedName("fatigue_level")
    @Nullable
    private Integer fatigueLevel;
    private final int levelStatus;

    @SerializedName("physical_fitness_level")
    @Nullable
    private Integer physicalFitnessLevel;

    @SerializedName("physical_fitness_status")
    @Nullable
    private Integer physicalFitnessStatus;

    @SerializedName("date_time")
    private long time;

    @SerializedName("training_stress")
    @Nullable
    private final Integer trainingStress;

    public /* synthetic */ PhysicalStatusItem(long j, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }

    public static /* synthetic */ PhysicalStatusItem copy$default(PhysicalStatusItem physicalStatusItem, long j, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = physicalStatusItem.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            num = physicalStatusItem.trainingStress;
        }
        Integer num5 = num;
        if ((i & 4) != 0) {
            num2 = physicalStatusItem.physicalFitnessLevel;
        }
        Integer num6 = num2;
        if ((i & 8) != 0) {
            num3 = physicalStatusItem.fatigueLevel;
        }
        Integer num7 = num3;
        if ((i & 16) != 0) {
            num4 = physicalStatusItem.physicalFitnessStatus;
        }
        return physicalStatusItem.copy(j2, num5, num6, num7, num4);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem
    public void clearDataNotSaveToDb() {
        super.clearDataNotSaveToDb();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTrainingStress() {
        return this.trainingStress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPhysicalFitnessLevel() {
        return this.physicalFitnessLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFatigueLevel() {
        return this.fatigueLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPhysicalFitnessStatus() {
        return this.physicalFitnessStatus;
    }

    @NotNull
    public final PhysicalStatusItem copy(long time, @Nullable Integer trainingStress, @Nullable Integer physicalFitnessLevel, @Nullable Integer fatigueLevel, @Nullable Integer physicalFitnessStatus) {
        return new PhysicalStatusItem(time, trainingStress, physicalFitnessLevel, fatigueLevel, physicalFitnessStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalStatusItem)) {
            return false;
        }
        PhysicalStatusItem physicalStatusItem = (PhysicalStatusItem) other;
        return this.time == physicalStatusItem.time && Intrinsics.areEqual(this.trainingStress, physicalStatusItem.trainingStress) && Intrinsics.areEqual(this.physicalFitnessLevel, physicalStatusItem.physicalFitnessLevel) && Intrinsics.areEqual(this.fatigueLevel, physicalStatusItem.fatigueLevel) && Intrinsics.areEqual(this.physicalFitnessStatus, physicalStatusItem.physicalFitnessStatus);
    }

    @Nullable
    public final Integer getFatigueLevel() {
        return this.fatigueLevel;
    }

    public final int getLevelStatus() {
        return this.levelStatus;
    }

    @Nullable
    public final Integer getPhysicalFitnessLevel() {
        return this.physicalFitnessLevel;
    }

    @Nullable
    public final Integer getPhysicalFitnessStatus() {
        return this.physicalFitnessStatus;
    }

    public final int getPhysicalStatusLevel() {
        Integer num = this.physicalFitnessStatus;
        if (num == null) {
            return -1;
        }
        Intrinsics.checkNotNull(num);
        if (num.intValue() > 15) {
            return 0;
        }
        Integer num2 = this.physicalFitnessStatus;
        Intrinsics.checkNotNull(num2);
        if (num2.intValue() > -10) {
            return 1;
        }
        Integer num3 = this.physicalFitnessStatus;
        Intrinsics.checkNotNull(num3);
        return num3.intValue() > -30 ? 2 : 3;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    @Nullable
    public final Integer getTrainingStress() {
        return this.trainingStress;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        Integer num = this.trainingStress;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.physicalFitnessLevel;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fatigueLevel;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.physicalFitnessStatus;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final void setFatigueLevel(@Nullable Integer num) {
        this.fatigueLevel = num;
    }

    public final void setPhysicalFitnessLevel(@Nullable Integer num) {
        this.physicalFitnessLevel = num;
    }

    public final void setPhysicalFitnessStatus(@Nullable Integer num) {
        this.physicalFitnessStatus = num;
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
        return "time=" + this.time + " trainingStress = " + this.trainingStress + "  physicalFitnessLevel = " + this.physicalFitnessLevel + "  fatigueLevel = " + this.fatigueLevel + "  physicalFitnessStatus = " + this.physicalFitnessStatus;
    }

    public PhysicalStatusItem(long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super(null);
        this.time = j;
        this.trainingStress = num;
        this.physicalFitnessLevel = num2;
        this.fatigueLevel = num3;
        this.physicalFitnessStatus = num4;
        this.levelStatus = getPhysicalStatusLevel();
    }
}
