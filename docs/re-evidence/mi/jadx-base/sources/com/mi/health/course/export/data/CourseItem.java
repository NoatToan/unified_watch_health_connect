package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.sesdk.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/mi/health/course/export/data/CourseItem;", "", SDKConstants.SOURCE_TYPE, "", "courseId", "", "<init>", "(ILjava/lang/String;)V", "getSourceType", "()I", "getCourseId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseItem {

    @SerializedName("course_id")
    @NotNull
    private final String courseId;

    @SerializedName("source_type")
    private final int sourceType;

    public CourseItem(int i, @NotNull String courseId) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        this.sourceType = i;
        this.courseId = courseId;
    }

    public static /* synthetic */ CourseItem copy$default(CourseItem courseItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = courseItem.sourceType;
        }
        if ((i2 & 2) != 0) {
            str = courseItem.courseId;
        }
        return courseItem.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final CourseItem copy(int sourceType, @NotNull String courseId) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        return new CourseItem(sourceType, courseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseItem)) {
            return false;
        }
        CourseItem courseItem = (CourseItem) other;
        return this.sourceType == courseItem.sourceType && Intrinsics.areEqual(this.courseId, courseItem.courseId);
    }

    @NotNull
    public final String getCourseId() {
        return this.courseId;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sourceType) * 31) + this.courseId.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseItem(sourceType=" + this.sourceType + ", courseId=" + this.courseId + ")";
    }
}
