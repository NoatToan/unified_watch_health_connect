package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.health.hrm.StepHrmDetailFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJº\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0006HÖ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001e¨\u0006K"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudSleepSegment;", "", "bedTime", "", "wakeTime", "timeZone", "", "duration", "avgHr", "maxHr", "minHr", FitnessReportKey.avgSpo2, FitnessReportKey.maxSpo2, FitnessReportKey.minSpo2, "deepDuration", "lightDuration", "remDuration", "wakeDuration", "wakeCount", "<init>", "(JJIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBedTime", "()J", "getWakeTime", "getTimeZone", "()I", "getDuration", "getAvgHr", "()Ljava/lang/Integer;", "setAvgHr", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMaxHr", "setMaxHr", "getMinHr", "setMinHr", "getAvgSpo2", "setAvgSpo2", "getMaxSpo2", "setMaxSpo2", "getMinSpo2", "setMinSpo2", "getDeepDuration", "setDeepDuration", "getLightDuration", "setLightDuration", "getRemDuration", "setRemDuration", "getWakeDuration", "setWakeDuration", "getWakeCount", "setWakeCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(JJIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudSleepSegment;", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudSleepSegment {

    @SerializedName(StepHrmDetailFragment.KEY_AVG_HR)
    @Nullable
    private Integer avgHr;

    @SerializedName("avg_spo2")
    @Nullable
    private Integer avgSpo2;

    @SerializedName("bedtime")
    private final long bedTime;

    @SerializedName("sleep_deep_duration")
    @Nullable
    private Integer deepDuration;

    @SerializedName("duration")
    private final int duration;

    @SerializedName("sleep_light_duration")
    @Nullable
    private Integer lightDuration;

    @SerializedName("max_hr")
    @Nullable
    private Integer maxHr;

    @SerializedName(FitnessPersistKey.ReportMaxSpo2)
    @Nullable
    private Integer maxSpo2;

    @SerializedName("min_hr")
    @Nullable
    private Integer minHr;

    @SerializedName(FitnessPersistKey.ReportMinSpo2)
    @Nullable
    private Integer minSpo2;

    @SerializedName("sleep_rem_duration")
    @Nullable
    private Integer remDuration;

    @SerializedName("timezone")
    private final int timeZone;

    @SerializedName("awake_count")
    @Nullable
    private Integer wakeCount;

    @SerializedName("sleep_awake_duration")
    @Nullable
    private Integer wakeDuration;

    @SerializedName("wake_up_time")
    private final long wakeTime;

    public CloudSleepSegment(long j, long j2, int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11) {
        this.bedTime = j;
        this.wakeTime = j2;
        this.timeZone = i;
        this.duration = i2;
        this.avgHr = num;
        this.maxHr = num2;
        this.minHr = num3;
        this.avgSpo2 = num4;
        this.maxSpo2 = num5;
        this.minSpo2 = num6;
        this.deepDuration = num7;
        this.lightDuration = num8;
        this.remDuration = num9;
        this.wakeDuration = num10;
        this.wakeCount = num11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBedTime() {
        return this.bedTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getDeepDuration() {
        return this.deepDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getLightDuration() {
        return this.lightDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getWakeDuration() {
        return this.wakeDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getWakeCount() {
        return this.wakeCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWakeTime() {
        return this.wakeTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @NotNull
    public final CloudSleepSegment copy(long bedTime, long wakeTime, int timeZone, int duration, @Nullable Integer avgHr, @Nullable Integer maxHr, @Nullable Integer minHr, @Nullable Integer avgSpo2, @Nullable Integer maxSpo2, @Nullable Integer minSpo2, @Nullable Integer deepDuration, @Nullable Integer lightDuration, @Nullable Integer remDuration, @Nullable Integer wakeDuration, @Nullable Integer wakeCount) {
        return new CloudSleepSegment(bedTime, wakeTime, timeZone, duration, avgHr, maxHr, minHr, avgSpo2, maxSpo2, minSpo2, deepDuration, lightDuration, remDuration, wakeDuration, wakeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSleepSegment)) {
            return false;
        }
        CloudSleepSegment cloudSleepSegment = (CloudSleepSegment) other;
        return this.bedTime == cloudSleepSegment.bedTime && this.wakeTime == cloudSleepSegment.wakeTime && this.timeZone == cloudSleepSegment.timeZone && this.duration == cloudSleepSegment.duration && Intrinsics.areEqual(this.avgHr, cloudSleepSegment.avgHr) && Intrinsics.areEqual(this.maxHr, cloudSleepSegment.maxHr) && Intrinsics.areEqual(this.minHr, cloudSleepSegment.minHr) && Intrinsics.areEqual(this.avgSpo2, cloudSleepSegment.avgSpo2) && Intrinsics.areEqual(this.maxSpo2, cloudSleepSegment.maxSpo2) && Intrinsics.areEqual(this.minSpo2, cloudSleepSegment.minSpo2) && Intrinsics.areEqual(this.deepDuration, cloudSleepSegment.deepDuration) && Intrinsics.areEqual(this.lightDuration, cloudSleepSegment.lightDuration) && Intrinsics.areEqual(this.remDuration, cloudSleepSegment.remDuration) && Intrinsics.areEqual(this.wakeDuration, cloudSleepSegment.wakeDuration) && Intrinsics.areEqual(this.wakeCount, cloudSleepSegment.wakeCount);
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    public final long getBedTime() {
        return this.bedTime;
    }

    @Nullable
    public final Integer getDeepDuration() {
        return this.deepDuration;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getLightDuration() {
        return this.lightDuration;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @Nullable
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    @Nullable
    public final Integer getRemDuration() {
        return this.remDuration;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final Integer getWakeCount() {
        return this.wakeCount;
    }

    @Nullable
    public final Integer getWakeDuration() {
        return this.wakeDuration;
    }

    public final long getWakeTime() {
        return this.wakeTime;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.bedTime) * 31) + Long.hashCode(this.wakeTime)) * 31) + Integer.hashCode(this.timeZone)) * 31) + Integer.hashCode(this.duration)) * 31;
        Integer num = this.avgHr;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxHr;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minHr;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.avgSpo2;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxSpo2;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.minSpo2;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.deepDuration;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.lightDuration;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.remDuration;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.wakeDuration;
        int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.wakeCount;
        return iHashCode11 + (num11 != null ? num11.hashCode() : 0);
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpo2(@Nullable Integer num) {
        this.avgSpo2 = num;
    }

    public final void setDeepDuration(@Nullable Integer num) {
        this.deepDuration = num;
    }

    public final void setLightDuration(@Nullable Integer num) {
        this.lightDuration = num;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxSpo2(@Nullable Integer num) {
        this.maxSpo2 = num;
    }

    public final void setMinHr(@Nullable Integer num) {
        this.minHr = num;
    }

    public final void setMinSpo2(@Nullable Integer num) {
        this.minSpo2 = num;
    }

    public final void setRemDuration(@Nullable Integer num) {
        this.remDuration = num;
    }

    public final void setWakeCount(@Nullable Integer num) {
        this.wakeCount = num;
    }

    public final void setWakeDuration(@Nullable Integer num) {
        this.wakeDuration = num;
    }

    @NotNull
    public String toString() {
        return "CloudSleepSegment(bedTime=" + this.bedTime + ", wakeTime=" + this.wakeTime + ", timeZone=" + this.timeZone + ", duration=" + this.duration + ", avgHr=" + this.avgHr + ", maxHr=" + this.maxHr + ", minHr=" + this.minHr + ", avgSpo2=" + this.avgSpo2 + ", maxSpo2=" + this.maxSpo2 + ", minSpo2=" + this.minSpo2 + ", deepDuration=" + this.deepDuration + ", lightDuration=" + this.lightDuration + ", remDuration=" + this.remDuration + ", wakeDuration=" + this.wakeDuration + ", wakeCount=" + this.wakeCount + ")";
    }

    public /* synthetic */ CloudSleepSegment(long j, long j2, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : num4, (i3 & 256) != 0 ? null : num5, (i3 & 512) != 0 ? null : num6, (i3 & 1024) != 0 ? null : num7, (i3 & 2048) != 0 ? null : num8, (i3 & 4096) != 0 ? null : num9, (i3 & 8192) != 0 ? null : num10, (i3 & 16384) != 0 ? null : num11);
    }
}
