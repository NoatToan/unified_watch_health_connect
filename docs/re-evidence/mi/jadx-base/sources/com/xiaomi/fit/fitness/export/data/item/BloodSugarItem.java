package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarLevel;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarTrend;
import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÂ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "bloodSugar", "", "measurePeriod", "", "<init>", "(JFLjava/lang/Integer;)V", "getTime", "()J", "setTime", "(J)V", "getMeasurePeriod", "()Ljava/lang/Integer;", "setMeasurePeriod", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "targetLevel", "trend", "getTrend", "setTrend", "", "getTargetLevel", "targetRange", "Lcom/xiaomi/fit/fitness/export/utils/BloodSugarTargetRange;", "clearDataNotSaveToDb", "getTimestamp", "setTimestamp", "toString", "", "component1", "component2", "component3", "copy", "(JFLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodSugarItem extends DailyRecordItem {

    @SerializedName("blood_sugar")
    private final float bloodSugar;

    @SerializedName("measurement_period")
    @Nullable
    private Integer measurePeriod;

    @BloodSugarLevel
    @Nullable
    private Integer targetLevel;

    @SerializedName("time")
    private long time;

    @BloodSugarTrend
    @Nullable
    private Integer trend;

    public /* synthetic */ BloodSugarItem(long j, float f, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, (i & 4) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final float getBloodSugar() {
        return this.bloodSugar;
    }

    public static /* synthetic */ BloodSugarItem copy$default(BloodSugarItem bloodSugarItem, long j, float f, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bloodSugarItem.time;
        }
        if ((i & 2) != 0) {
            f = bloodSugarItem.bloodSugar;
        }
        if ((i & 4) != 0) {
            num = bloodSugarItem.measurePeriod;
        }
        return bloodSugarItem.copy(j, f, num);
    }

    public static /* synthetic */ int getTargetLevel$default(BloodSugarItem bloodSugarItem, BloodSugarTargetRange bloodSugarTargetRange, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodSugarTargetRange = null;
        }
        return bloodSugarItem.getTargetLevel(bloodSugarTargetRange);
    }

    public final float bloodSugar() {
        float f = this.bloodSugar;
        if (f < 2.0f) {
            return 2.0f;
        }
        if (f > 25.0f) {
            return 25.0f;
        }
        return xr5.e(1, f);
    }

    @Override // com.xiaomi.fit.fitness.export.data.item.DailyRecordItem
    public void clearDataNotSaveToDb() {
        super.clearDataNotSaveToDb();
        this.targetLevel = null;
        this.trend = null;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMeasurePeriod() {
        return this.measurePeriod;
    }

    @NotNull
    public final BloodSugarItem copy(long time, float bloodSugar, @Nullable Integer measurePeriod) {
        return new BloodSugarItem(time, bloodSugar, measurePeriod);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarItem)) {
            return false;
        }
        BloodSugarItem bloodSugarItem = (BloodSugarItem) other;
        return this.time == bloodSugarItem.time && Float.compare(this.bloodSugar, bloodSugarItem.bloodSugar) == 0 && Intrinsics.areEqual(this.measurePeriod, bloodSugarItem.measurePeriod);
    }

    @Nullable
    public final Integer getMeasurePeriod() {
        return this.measurePeriod;
    }

    @BloodSugarLevel
    public final int getTargetLevel(@Nullable BloodSugarTargetRange targetRange) {
        Integer num = this.targetLevel;
        if (num == null || num.intValue() == 0) {
            this.targetLevel = Integer.valueOf(BloodSugarItemExtKt.computeTargetLevel(this, targetRange));
        }
        Integer num2 = this.targetLevel;
        if (num2 != null) {
            return num2.intValue();
        }
        return 1;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    @BloodSugarTrend
    public final int getTrend() {
        Integer num = this.trend;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + Float.hashCode(this.bloodSugar)) * 31;
        Integer num = this.measurePeriod;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setMeasurePeriod(@Nullable Integer num) {
        this.measurePeriod = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTrend(@BloodSugarTrend int trend) {
        this.trend = Integer.valueOf(trend);
    }

    @NotNull
    public String toString() {
        return "time=" + this.time + ", bloodSugar=" + this.bloodSugar;
    }

    public BloodSugarItem(long j, float f, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.bloodSugar = f;
        this.measurePeriod = num;
    }
}
