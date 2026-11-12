package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseTrainSummary;", "", "trainTimes", "", "lastTrainTime", "", "<init>", "(IJ)V", "getTrainTimes", "()I", "getLastTrainTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalCourseTrainSummary {

    @SerializedName("last_train_time")
    private final long lastTrainTime;

    @SerializedName("train_times")
    private final int trainTimes;

    public SportsReportOperationalCourseTrainSummary(int i, long j) {
        this.trainTimes = i;
        this.lastTrainTime = j;
    }

    public static /* synthetic */ SportsReportOperationalCourseTrainSummary copy$default(SportsReportOperationalCourseTrainSummary sportsReportOperationalCourseTrainSummary, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportsReportOperationalCourseTrainSummary.trainTimes;
        }
        if ((i2 & 2) != 0) {
            j = sportsReportOperationalCourseTrainSummary.lastTrainTime;
        }
        return sportsReportOperationalCourseTrainSummary.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTrainTimes() {
        return this.trainTimes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastTrainTime() {
        return this.lastTrainTime;
    }

    @NotNull
    public final SportsReportOperationalCourseTrainSummary copy(int trainTimes, long lastTrainTime) {
        return new SportsReportOperationalCourseTrainSummary(trainTimes, lastTrainTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalCourseTrainSummary)) {
            return false;
        }
        SportsReportOperationalCourseTrainSummary sportsReportOperationalCourseTrainSummary = (SportsReportOperationalCourseTrainSummary) other;
        return this.trainTimes == sportsReportOperationalCourseTrainSummary.trainTimes && this.lastTrainTime == sportsReportOperationalCourseTrainSummary.lastTrainTime;
    }

    public final long getLastTrainTime() {
        return this.lastTrainTime;
    }

    public final int getTrainTimes() {
        return this.trainTimes;
    }

    public int hashCode() {
        return (Integer.hashCode(this.trainTimes) * 31) + Long.hashCode(this.lastTrainTime);
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalCourseTrainSummary(trainTimes=" + this.trainTimes + ", lastTrainTime=" + this.lastTrainTime + ")";
    }
}
