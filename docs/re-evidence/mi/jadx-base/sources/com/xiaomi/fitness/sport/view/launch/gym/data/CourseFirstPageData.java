package com.xiaomi.fitness.sport.view.launch.gym.data;

import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/data/CourseFirstPageData;", "", "video", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "recent", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;)V", "getVideo", "()Ljava/util/List;", "getRecent", "getStatus", "()Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseFirstPageData {

    @Nullable
    private final List<CourseModel.PracticedCourse> recent;

    @NotNull
    private final Status status;

    @Nullable
    private final List<CourseModel.CourseData> video;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseFirstPageData(@Nullable List<? extends CourseModel.CourseData> list, @Nullable List<? extends CourseModel.PracticedCourse> list2, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.video = list;
        this.recent = list2;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseFirstPageData copy$default(CourseFirstPageData courseFirstPageData, List list, List list2, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            list = courseFirstPageData.video;
        }
        if ((i & 2) != 0) {
            list2 = courseFirstPageData.recent;
        }
        if ((i & 4) != 0) {
            status = courseFirstPageData.status;
        }
        return courseFirstPageData.copy(list, list2, status);
    }

    @Nullable
    public final List<CourseModel.CourseData> component1() {
        return this.video;
    }

    @Nullable
    public final List<CourseModel.PracticedCourse> component2() {
        return this.recent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final CourseFirstPageData copy(@Nullable List<? extends CourseModel.CourseData> video, @Nullable List<? extends CourseModel.PracticedCourse> recent, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CourseFirstPageData(video, recent, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseFirstPageData)) {
            return false;
        }
        CourseFirstPageData courseFirstPageData = (CourseFirstPageData) other;
        return Intrinsics.areEqual(this.video, courseFirstPageData.video) && Intrinsics.areEqual(this.recent, courseFirstPageData.recent) && this.status == courseFirstPageData.status;
    }

    @Nullable
    public final List<CourseModel.PracticedCourse> getRecent() {
        return this.recent;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final List<CourseModel.CourseData> getVideo() {
        return this.video;
    }

    public int hashCode() {
        List<CourseModel.CourseData> list = this.video;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CourseModel.PracticedCourse> list2 = this.recent;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseFirstPageData(video=" + this.video + ", recent=" + this.recent + ", status=" + this.status + ")";
    }
}
