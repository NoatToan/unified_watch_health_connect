package com.mi.health.course.vm;

import com.mi.health.course.export.data.CourseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/mi/health/course/vm/CourseMeData;", "", "feeds", "", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "firstPage", "", "<init>", "(Ljava/util/List;Z)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getFirstPage", "()Z", "toString", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseMeData {

    @Nullable
    private List<? extends CourseModel.PracticedCourse> feeds;
    private final boolean firstPage;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseMeData() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final List<CourseModel.PracticedCourse> getFeeds() {
        return this.feeds;
    }

    public final boolean getFirstPage() {
        return this.firstPage;
    }

    public final void setFeeds(@Nullable List<? extends CourseModel.PracticedCourse> list) {
        this.feeds = list;
    }

    @NotNull
    public String toString() {
        return "CourseMeData(feeds=" + this.feeds + ",firstPage=" + this.firstPage + ")";
    }

    public CourseMeData(@Nullable List<? extends CourseModel.PracticedCourse> list, boolean z) {
        this.feeds = list;
        this.firstPage = z;
    }

    public /* synthetic */ CourseMeData(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z);
    }
}
