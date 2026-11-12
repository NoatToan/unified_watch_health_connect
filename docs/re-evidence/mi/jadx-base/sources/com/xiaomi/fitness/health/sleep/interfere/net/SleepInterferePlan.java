package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jy\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0007HÖ\u0001J\t\u00104\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "", "id", "", "startDate", "endDate", "targetBedtime", "", "targetWakeUpTime", "status", "isDisplay", "", "report", "Lcom/xiaomi/fitness/health/sleep/interfere/net/Report;", "zoneName", "", CloudContract.COL_ZONE_OFFSET, "currentTaskSummary", "Lcom/xiaomi/fitness/health/sleep/interfere/net/CurrentTaskSummary;", "<init>", "(JJJIIIZLcom/xiaomi/fitness/health/sleep/interfere/net/Report;Ljava/lang/String;ILcom/xiaomi/fitness/health/sleep/interfere/net/CurrentTaskSummary;)V", "getId", "()J", "getStartDate", "getEndDate", "getTargetBedtime", "()I", "getTargetWakeUpTime", "getStatus", "()Z", "getReport", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/Report;", "getZoneName", "()Ljava/lang/String;", "getZoneOffset", "getCurrentTaskSummary", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/CurrentTaskSummary;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepInterferePlan {

    @SerializedName("currentTaskSummary")
    @Nullable
    private final CurrentTaskSummary currentTaskSummary;

    @SerializedName("endDate")
    private final long endDate;

    @SerializedName("id")
    private final long id;

    @SerializedName("isDisplayed")
    private final boolean isDisplay;

    @SerializedName("report")
    @NotNull
    private final Report report;

    @SerializedName("startDate")
    private final long startDate;

    @SerializedName("status")
    private final int status;

    @SerializedName("targetBedtime")
    private final int targetBedtime;

    @SerializedName("targetWakeUpTime")
    private final int targetWakeUpTime;

    @SerializedName("zoneName")
    @NotNull
    private final String zoneName;

    @SerializedName(CloudContract.COL_ZONE_OFFSET)
    private final int zoneOffset;

    public SleepInterferePlan(long j, long j2, long j3, int i, int i2, int i3, boolean z, @NotNull Report report, @NotNull String zoneName, int i4, @Nullable CurrentTaskSummary currentTaskSummary) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        this.id = j;
        this.startDate = j2;
        this.endDate = j3;
        this.targetBedtime = i;
        this.targetWakeUpTime = i2;
        this.status = i3;
        this.isDisplay = z;
        this.report = report;
        this.zoneName = zoneName;
        this.zoneOffset = i4;
        this.currentTaskSummary = currentTaskSummary;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CurrentTaskSummary getCurrentTaskSummary() {
        return this.currentTaskSummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTargetBedtime() {
        return this.targetBedtime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTargetWakeUpTime() {
        return this.targetWakeUpTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDisplay() {
        return this.isDisplay;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Report getReport() {
        return this.report;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getZoneName() {
        return this.zoneName;
    }

    @NotNull
    public final SleepInterferePlan copy(long id, long startDate, long endDate, int targetBedtime, int targetWakeUpTime, int status, boolean isDisplay, @NotNull Report report, @NotNull String zoneName, int zoneOffset, @Nullable CurrentTaskSummary currentTaskSummary) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(zoneName, "zoneName");
        return new SleepInterferePlan(id, startDate, endDate, targetBedtime, targetWakeUpTime, status, isDisplay, report, zoneName, zoneOffset, currentTaskSummary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepInterferePlan)) {
            return false;
        }
        SleepInterferePlan sleepInterferePlan = (SleepInterferePlan) other;
        return this.id == sleepInterferePlan.id && this.startDate == sleepInterferePlan.startDate && this.endDate == sleepInterferePlan.endDate && this.targetBedtime == sleepInterferePlan.targetBedtime && this.targetWakeUpTime == sleepInterferePlan.targetWakeUpTime && this.status == sleepInterferePlan.status && this.isDisplay == sleepInterferePlan.isDisplay && Intrinsics.areEqual(this.report, sleepInterferePlan.report) && Intrinsics.areEqual(this.zoneName, sleepInterferePlan.zoneName) && this.zoneOffset == sleepInterferePlan.zoneOffset && Intrinsics.areEqual(this.currentTaskSummary, sleepInterferePlan.currentTaskSummary);
    }

    @Nullable
    public final CurrentTaskSummary getCurrentTaskSummary() {
        return this.currentTaskSummary;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final Report getReport() {
        return this.report;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTargetBedtime() {
        return this.targetBedtime;
    }

    public final int getTargetWakeUpTime() {
        return this.targetWakeUpTime;
    }

    @NotNull
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.startDate)) * 31) + Long.hashCode(this.endDate)) * 31) + Integer.hashCode(this.targetBedtime)) * 31) + Integer.hashCode(this.targetWakeUpTime)) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.isDisplay)) * 31) + this.report.hashCode()) * 31) + this.zoneName.hashCode()) * 31) + Integer.hashCode(this.zoneOffset)) * 31;
        CurrentTaskSummary currentTaskSummary = this.currentTaskSummary;
        return iHashCode + (currentTaskSummary == null ? 0 : currentTaskSummary.hashCode());
    }

    public final boolean isDisplay() {
        return this.isDisplay;
    }

    @NotNull
    public String toString() {
        return "SleepInterferePlan(id=" + this.id + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", targetBedtime=" + this.targetBedtime + ", targetWakeUpTime=" + this.targetWakeUpTime + ", status=" + this.status + ", isDisplay=" + this.isDisplay + ", report=" + this.report + ", zoneName=" + this.zoneName + ", zoneOffset=" + this.zoneOffset + ", currentTaskSummary=" + this.currentTaskSummary + ")";
    }
}
