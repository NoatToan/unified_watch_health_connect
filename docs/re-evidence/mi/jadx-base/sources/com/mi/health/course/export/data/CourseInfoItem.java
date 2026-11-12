package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/mi/health/course/export/data/CourseInfoItem;", "", "courseInfoItem", "Lcom/mi/health/course/export/data/CourseInfo;", "trainSummary", "Lcom/mi/health/course/export/data/CourseModel$PracticedSummary;", "<init>", "(Lcom/mi/health/course/export/data/CourseInfo;Lcom/mi/health/course/export/data/CourseModel$PracticedSummary;)V", "getCourseInfoItem", "()Lcom/mi/health/course/export/data/CourseInfo;", "getTrainSummary", "()Lcom/mi/health/course/export/data/CourseModel$PracticedSummary;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseInfoItem {

    @SerializedName("course_info")
    @NotNull
    private final CourseInfo courseInfoItem;

    @SerializedName("train_summary")
    @NotNull
    private final CourseModel.PracticedSummary trainSummary;

    public CourseInfoItem(@NotNull CourseInfo courseInfoItem, @NotNull CourseModel.PracticedSummary trainSummary) {
        Intrinsics.checkNotNullParameter(courseInfoItem, "courseInfoItem");
        Intrinsics.checkNotNullParameter(trainSummary, "trainSummary");
        this.courseInfoItem = courseInfoItem;
        this.trainSummary = trainSummary;
    }

    public static /* synthetic */ CourseInfoItem copy$default(CourseInfoItem courseInfoItem, CourseInfo courseInfo, CourseModel.PracticedSummary practicedSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            courseInfo = courseInfoItem.courseInfoItem;
        }
        if ((i & 2) != 0) {
            practicedSummary = courseInfoItem.trainSummary;
        }
        return courseInfoItem.copy(courseInfo, practicedSummary);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CourseInfo getCourseInfoItem() {
        return this.courseInfoItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CourseModel.PracticedSummary getTrainSummary() {
        return this.trainSummary;
    }

    @NotNull
    public final CourseInfoItem copy(@NotNull CourseInfo courseInfoItem, @NotNull CourseModel.PracticedSummary trainSummary) {
        Intrinsics.checkNotNullParameter(courseInfoItem, "courseInfoItem");
        Intrinsics.checkNotNullParameter(trainSummary, "trainSummary");
        return new CourseInfoItem(courseInfoItem, trainSummary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseInfoItem)) {
            return false;
        }
        CourseInfoItem courseInfoItem = (CourseInfoItem) other;
        return Intrinsics.areEqual(this.courseInfoItem, courseInfoItem.courseInfoItem) && Intrinsics.areEqual(this.trainSummary, courseInfoItem.trainSummary);
    }

    @NotNull
    public final CourseInfo getCourseInfoItem() {
        return this.courseInfoItem;
    }

    @NotNull
    public final CourseModel.PracticedSummary getTrainSummary() {
        return this.trainSummary;
    }

    public int hashCode() {
        return (this.courseInfoItem.hashCode() * 31) + this.trainSummary.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseInfoItem(courseInfoItem=" + this.courseInfoItem + ", trainSummary=" + this.trainSummary + ")";
    }
}
