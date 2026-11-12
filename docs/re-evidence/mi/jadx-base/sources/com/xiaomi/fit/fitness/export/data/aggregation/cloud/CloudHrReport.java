package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u008a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017¨\u00063"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudHrReport;", "", "avgHr", "", "maxHr", "minHr", "abnormalHrCount", "avgRestHr", "latestHr", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "extremeHrDuration", "anaerobicHrDuration", "aerobicHrDuration", "fatBurningHrDuration", "warmUpHrDuration", "<init>", "(IIIILjava/lang/Integer;Lcom/xiaomi/fit/fitness/export/data/item/HrItem;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAvgHr", "()I", "getMaxHr", "getMinHr", "getAbnormalHrCount", "getAvgRestHr", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLatestHr", "()Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "getExtremeHrDuration", "getAnaerobicHrDuration", "getAerobicHrDuration", "getFatBurningHrDuration", "getWarmUpHrDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(IIIILjava/lang/Integer;Lcom/xiaomi/fit/fitness/export/data/item/HrItem;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudHrReport;", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudHrReport {

    @SerializedName("abnormal_hr_count")
    private final int abnormalHrCount;

    @SerializedName("aerobic_hr_zone_duration")
    @Nullable
    private final Integer aerobicHrDuration;

    @SerializedName("anaerobic_hr_zone_duration")
    @Nullable
    private final Integer anaerobicHrDuration;

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    private final int avgHr;

    @SerializedName("avg_rhr")
    @Nullable
    private final Integer avgRestHr;

    @SerializedName("extreme_hr_zone_duration")
    @Nullable
    private final Integer extremeHrDuration;

    @SerializedName("fat_burning_hr_zone_duration")
    @Nullable
    private final Integer fatBurningHrDuration;

    @SerializedName("latest_hr")
    @Nullable
    private final HrItem latestHr;

    @SerializedName("max_hr")
    private final int maxHr;

    @SerializedName("min_hr")
    private final int minHr;

    @SerializedName("warm_up_hr_zone_duration")
    @Nullable
    private final Integer warmUpHrDuration;

    public CloudHrReport(int i, int i2, int i3, int i4, @Nullable Integer num, @Nullable HrItem hrItem, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this.avgHr = i;
        this.maxHr = i2;
        this.minHr = i3;
        this.abnormalHrCount = i4;
        this.avgRestHr = num;
        this.latestHr = hrItem;
        this.extremeHrDuration = num2;
        this.anaerobicHrDuration = num3;
        this.aerobicHrDuration = num4;
        this.fatBurningHrDuration = num5;
        this.warmUpHrDuration = num6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getFatBurningHrDuration() {
        return this.fatBurningHrDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getWarmUpHrDuration() {
        return this.warmUpHrDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinHr() {
        return this.minHr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAbnormalHrCount() {
        return this.abnormalHrCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAvgRestHr() {
        return this.avgRestHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HrItem getLatestHr() {
        return this.latestHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getExtremeHrDuration() {
        return this.extremeHrDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAnaerobicHrDuration() {
        return this.anaerobicHrDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAerobicHrDuration() {
        return this.aerobicHrDuration;
    }

    @NotNull
    public final CloudHrReport copy(int avgHr, int maxHr, int minHr, int abnormalHrCount, @Nullable Integer avgRestHr, @Nullable HrItem latestHr, @Nullable Integer extremeHrDuration, @Nullable Integer anaerobicHrDuration, @Nullable Integer aerobicHrDuration, @Nullable Integer fatBurningHrDuration, @Nullable Integer warmUpHrDuration) {
        return new CloudHrReport(avgHr, maxHr, minHr, abnormalHrCount, avgRestHr, latestHr, extremeHrDuration, anaerobicHrDuration, aerobicHrDuration, fatBurningHrDuration, warmUpHrDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudHrReport)) {
            return false;
        }
        CloudHrReport cloudHrReport = (CloudHrReport) other;
        return this.avgHr == cloudHrReport.avgHr && this.maxHr == cloudHrReport.maxHr && this.minHr == cloudHrReport.minHr && this.abnormalHrCount == cloudHrReport.abnormalHrCount && Intrinsics.areEqual(this.avgRestHr, cloudHrReport.avgRestHr) && Intrinsics.areEqual(this.latestHr, cloudHrReport.latestHr) && Intrinsics.areEqual(this.extremeHrDuration, cloudHrReport.extremeHrDuration) && Intrinsics.areEqual(this.anaerobicHrDuration, cloudHrReport.anaerobicHrDuration) && Intrinsics.areEqual(this.aerobicHrDuration, cloudHrReport.aerobicHrDuration) && Intrinsics.areEqual(this.fatBurningHrDuration, cloudHrReport.fatBurningHrDuration) && Intrinsics.areEqual(this.warmUpHrDuration, cloudHrReport.warmUpHrDuration);
    }

    public final int getAbnormalHrCount() {
        return this.abnormalHrCount;
    }

    @Nullable
    public final Integer getAerobicHrDuration() {
        return this.aerobicHrDuration;
    }

    @Nullable
    public final Integer getAnaerobicHrDuration() {
        return this.anaerobicHrDuration;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgRestHr() {
        return this.avgRestHr;
    }

    @Nullable
    public final Integer getExtremeHrDuration() {
        return this.extremeHrDuration;
    }

    @Nullable
    public final Integer getFatBurningHrDuration() {
        return this.fatBurningHrDuration;
    }

    @Nullable
    public final HrItem getLatestHr() {
        return this.latestHr;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Integer getWarmUpHrDuration() {
        return this.warmUpHrDuration;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.avgHr) * 31) + Integer.hashCode(this.maxHr)) * 31) + Integer.hashCode(this.minHr)) * 31) + Integer.hashCode(this.abnormalHrCount)) * 31;
        Integer num = this.avgRestHr;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        HrItem hrItem = this.latestHr;
        int iHashCode3 = (iHashCode2 + (hrItem == null ? 0 : hrItem.hashCode())) * 31;
        Integer num2 = this.extremeHrDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.anaerobicHrDuration;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.aerobicHrDuration;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.fatBurningHrDuration;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.warmUpHrDuration;
        return iHashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CloudHrReport(avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", abnormalHrCount=" + this.abnormalHrCount + ", avgRestHr=" + this.avgRestHr + ", latestHr=" + this.latestHr + ", extremeHrDuration=" + this.extremeHrDuration + ", anaerobicHrDuration=" + this.anaerobicHrDuration + ", aerobicHrDuration=" + this.aerobicHrDuration + ", fatBurningHrDuration=" + this.fatBurningHrDuration + ", warmUpHrDuration=" + this.warmUpHrDuration + ")";
    }

    public /* synthetic */ CloudHrReport(int i, int i2, int i3, int i4, Integer num, HrItem hrItem, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : hrItem, (i5 & 64) != 0 ? null : num2, (i5 & 128) != 0 ? null : num3, (i5 & 256) != 0 ? null : num4, (i5 & 512) != 0 ? null : num5, (i5 & 1024) != 0 ? null : num6);
    }
}
