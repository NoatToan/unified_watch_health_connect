package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.sesdk.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/mi/health/course/export/data/CourseInfo;", "", "courseId", "", "courseName", SDKConstants.SOURCE_TYPE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCourseId", "()Ljava/lang/String;", "getCourseName", "getSourceType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseInfo {

    @SerializedName("course_id")
    @NotNull
    private final String courseId;

    @SerializedName("course_name")
    @NotNull
    private final String courseName;

    @SerializedName("source_type")
    private final int sourceType;

    public CourseInfo(@NotNull String courseId, @NotNull String courseName, int i) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(courseName, "courseName");
        this.courseId = courseId;
        this.courseName = courseName;
        this.sourceType = i;
    }

    public static /* synthetic */ CourseInfo copy$default(CourseInfo courseInfo, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = courseInfo.courseId;
        }
        if ((i2 & 2) != 0) {
            str2 = courseInfo.courseName;
        }
        if ((i2 & 4) != 0) {
            i = courseInfo.sourceType;
        }
        return courseInfo.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final CourseInfo copy(@NotNull String courseId, @NotNull String courseName, int sourceType) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(courseName, "courseName");
        return new CourseInfo(courseId, courseName, sourceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseInfo)) {
            return false;
        }
        CourseInfo courseInfo = (CourseInfo) other;
        return Intrinsics.areEqual(this.courseId, courseInfo.courseId) && Intrinsics.areEqual(this.courseName, courseInfo.courseName) && this.sourceType == courseInfo.sourceType;
    }

    @NotNull
    public final String getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final String getCourseName() {
        return this.courseName;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return (((this.courseId.hashCode() * 31) + this.courseName.hashCode()) * 31) + Integer.hashCode(this.sourceType);
    }

    @NotNull
    public String toString() {
        return "CourseInfo(courseId=" + this.courseId + ", courseName=" + this.courseName + ", sourceType=" + this.sourceType + ")";
    }
}
