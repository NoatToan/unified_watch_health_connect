package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalInfo;", "", "routeInfo", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;", "courseData", "Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseData;", "<init>", "(Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseData;)V", "getRouteInfo", "()Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;", "getCourseData", "()Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalInfo {

    @SerializedName("course_data")
    @NotNull
    private final SportsReportOperationalCourseData courseData;

    @SerializedName("route_info")
    @NotNull
    private final SportsReportOperationalRouteInfo routeInfo;

    public SportsReportOperationalInfo(@NotNull SportsReportOperationalRouteInfo routeInfo, @NotNull SportsReportOperationalCourseData courseData) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Intrinsics.checkNotNullParameter(courseData, "courseData");
        this.routeInfo = routeInfo;
        this.courseData = courseData;
    }

    public static /* synthetic */ SportsReportOperationalInfo copy$default(SportsReportOperationalInfo sportsReportOperationalInfo, SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo, SportsReportOperationalCourseData sportsReportOperationalCourseData, int i, Object obj) {
        if ((i & 1) != 0) {
            sportsReportOperationalRouteInfo = sportsReportOperationalInfo.routeInfo;
        }
        if ((i & 2) != 0) {
            sportsReportOperationalCourseData = sportsReportOperationalInfo.courseData;
        }
        return sportsReportOperationalInfo.copy(sportsReportOperationalRouteInfo, sportsReportOperationalCourseData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportsReportOperationalRouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SportsReportOperationalCourseData getCourseData() {
        return this.courseData;
    }

    @NotNull
    public final SportsReportOperationalInfo copy(@NotNull SportsReportOperationalRouteInfo routeInfo, @NotNull SportsReportOperationalCourseData courseData) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Intrinsics.checkNotNullParameter(courseData, "courseData");
        return new SportsReportOperationalInfo(routeInfo, courseData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalInfo)) {
            return false;
        }
        SportsReportOperationalInfo sportsReportOperationalInfo = (SportsReportOperationalInfo) other;
        return Intrinsics.areEqual(this.routeInfo, sportsReportOperationalInfo.routeInfo) && Intrinsics.areEqual(this.courseData, sportsReportOperationalInfo.courseData);
    }

    @NotNull
    public final SportsReportOperationalCourseData getCourseData() {
        return this.courseData;
    }

    @NotNull
    public final SportsReportOperationalRouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public int hashCode() {
        return (this.routeInfo.hashCode() * 31) + this.courseData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalInfo(routeInfo=" + this.routeInfo + ", courseData=" + this.courseData + ")";
    }
}
