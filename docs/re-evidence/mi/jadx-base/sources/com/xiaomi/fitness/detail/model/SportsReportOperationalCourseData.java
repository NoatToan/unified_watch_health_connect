package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseData;", "", "courseInfo", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseInfo;", "trainSummary", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseTrainSummary;", "<init>", "(Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseInfo;Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseTrainSummary;)V", "getCourseInfo", "()Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseInfo;", "getTrainSummary", "()Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseTrainSummary;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalCourseData {

    @SerializedName("course_info")
    @NotNull
    private final SportsReportOperationalCourseInfo courseInfo;

    @SerializedName("train_summary")
    @Nullable
    private final SportsReportOperationalCourseTrainSummary trainSummary;

    public SportsReportOperationalCourseData(@NotNull SportsReportOperationalCourseInfo courseInfo, @Nullable SportsReportOperationalCourseTrainSummary sportsReportOperationalCourseTrainSummary) {
        Intrinsics.checkNotNullParameter(courseInfo, "courseInfo");
        this.courseInfo = courseInfo;
        this.trainSummary = sportsReportOperationalCourseTrainSummary;
    }

    public static /* synthetic */ SportsReportOperationalCourseData copy$default(SportsReportOperationalCourseData sportsReportOperationalCourseData, SportsReportOperationalCourseInfo sportsReportOperationalCourseInfo, SportsReportOperationalCourseTrainSummary sportsReportOperationalCourseTrainSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            sportsReportOperationalCourseInfo = sportsReportOperationalCourseData.courseInfo;
        }
        if ((i & 2) != 0) {
            sportsReportOperationalCourseTrainSummary = sportsReportOperationalCourseData.trainSummary;
        }
        return sportsReportOperationalCourseData.copy(sportsReportOperationalCourseInfo, sportsReportOperationalCourseTrainSummary);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportsReportOperationalCourseInfo getCourseInfo() {
        return this.courseInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SportsReportOperationalCourseTrainSummary getTrainSummary() {
        return this.trainSummary;
    }

    @NotNull
    public final SportsReportOperationalCourseData copy(@NotNull SportsReportOperationalCourseInfo courseInfo, @Nullable SportsReportOperationalCourseTrainSummary trainSummary) {
        Intrinsics.checkNotNullParameter(courseInfo, "courseInfo");
        return new SportsReportOperationalCourseData(courseInfo, trainSummary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalCourseData)) {
            return false;
        }
        SportsReportOperationalCourseData sportsReportOperationalCourseData = (SportsReportOperationalCourseData) other;
        return Intrinsics.areEqual(this.courseInfo, sportsReportOperationalCourseData.courseInfo) && Intrinsics.areEqual(this.trainSummary, sportsReportOperationalCourseData.trainSummary);
    }

    @NotNull
    public final SportsReportOperationalCourseInfo getCourseInfo() {
        return this.courseInfo;
    }

    @Nullable
    public final SportsReportOperationalCourseTrainSummary getTrainSummary() {
        return this.trainSummary;
    }

    public int hashCode() {
        int iHashCode = this.courseInfo.hashCode() * 31;
        SportsReportOperationalCourseTrainSummary sportsReportOperationalCourseTrainSummary = this.trainSummary;
        return iHashCode + (sportsReportOperationalCourseTrainSummary == null ? 0 : sportsReportOperationalCourseTrainSummary.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalCourseData(courseInfo=" + this.courseInfo + ", trainSummary=" + this.trainSummary + ")";
    }
}
