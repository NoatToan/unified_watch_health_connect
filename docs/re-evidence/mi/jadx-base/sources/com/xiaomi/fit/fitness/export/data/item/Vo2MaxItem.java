package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.utils.SportLevelComputeUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u001d\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0015\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "vo2Max", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getVo2Max", "()I", "vo2MaxLevel", "getVo2MaxLevel$annotations", "()V", "getVo2MaxLevel", "()Ljava/lang/Integer;", "setVo2MaxLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPrimaryValue", "getTimestamp", "setTimestamp", "", "isFemale", "", "age", "toString", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Vo2MaxItem extends DailyRecordItem {

    @SerializedName("time")
    private long time;

    @SerializedName(FitnessPersistKey.Vo2Max)
    private final int vo2Max;

    /* JADX INFO: renamed from: vo2MaxLevel, reason: from kotlin metadata and from toString */
    @SerializedName("vo2_max_level")
    @Nullable
    private Integer level;

    public Vo2MaxItem(long j, int i) {
        super(null);
        this.time = j;
        this.vo2Max = i;
    }

    public static /* synthetic */ Vo2MaxItem copy$default(Vo2MaxItem vo2MaxItem, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = vo2MaxItem.time;
        }
        if ((i2 & 2) != 0) {
            i = vo2MaxItem.vo2Max;
        }
        return vo2MaxItem.copy(j, i);
    }

    public static /* synthetic */ void getVo2MaxLevel$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVo2Max() {
        return this.vo2Max;
    }

    @NotNull
    public final Vo2MaxItem copy(long time, int vo2Max) {
        return new Vo2MaxItem(time, vo2Max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vo2MaxItem)) {
            return false;
        }
        Vo2MaxItem vo2MaxItem = (Vo2MaxItem) other;
        return this.time == vo2MaxItem.time && this.vo2Max == vo2MaxItem.vo2Max;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final int getVo2Max() {
        return this.vo2Max;
    }

    @Nullable
    /* JADX INFO: renamed from: getVo2MaxLevel, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.vo2Max);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setVo2MaxLevel(@Nullable Integer num) {
        this.level = num;
    }

    @NotNull
    public String toString() {
        return "Vo2MaxItem(sid=" + getSid() + ", time=" + this.time + ", vo2Max=" + this.vo2Max + ", level=" + this.level + ")";
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem, com.xiaomi.fit.fitness.export.data.item.IPointTimeData
    @NotNull
    public Integer getPrimaryValue() {
        return Integer.valueOf(this.vo2Max);
    }

    public final int getVo2MaxLevel(boolean isFemale, int age) {
        Integer num = this.level;
        return num != null ? num.intValue() : SportLevelComputeUtils.INSTANCE.computeVo2MaxLevel(isFemale, age, this.vo2Max);
    }
}
