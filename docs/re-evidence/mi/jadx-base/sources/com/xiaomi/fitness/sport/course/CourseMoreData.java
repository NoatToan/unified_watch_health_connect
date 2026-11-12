package com.xiaomi.fitness.sport.course;

import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/course/CourseMoreData;", "", "list", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;)V", "getList", "()Ljava/util/List;", "getStatus", "()Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseMoreData {

    @Nullable
    private final List<CourseModel.CourseData> list;

    @NotNull
    private final Status status;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseMoreData(@Nullable List<? extends CourseModel.CourseData> list, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.list = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseMoreData copy$default(CourseMoreData courseMoreData, List list, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            list = courseMoreData.list;
        }
        if ((i & 2) != 0) {
            status = courseMoreData.status;
        }
        return courseMoreData.copy(list, status);
    }

    @Nullable
    public final List<CourseModel.CourseData> component1() {
        return this.list;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final CourseMoreData copy(@Nullable List<? extends CourseModel.CourseData> list, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CourseMoreData(list, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseMoreData)) {
            return false;
        }
        CourseMoreData courseMoreData = (CourseMoreData) other;
        return Intrinsics.areEqual(this.list, courseMoreData.list) && this.status == courseMoreData.status;
    }

    @Nullable
    public final List<CourseModel.CourseData> getList() {
        return this.list;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        List<CourseModel.CourseData> list = this.list;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseMoreData(list=" + this.list + ", status=" + this.status + ")";
    }

    public /* synthetic */ CourseMoreData(List list, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? Status.DONE : status);
    }
}
