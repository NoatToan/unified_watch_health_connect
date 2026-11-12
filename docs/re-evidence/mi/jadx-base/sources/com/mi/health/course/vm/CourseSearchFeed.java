package com.mi.health.course.vm;

import com.mi.health.course.export.data.CourseListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/mi/health/course/vm/CourseSearchFeed;", "", "feeds", "", "Lcom/mi/health/course/export/data/CourseListItem;", "resetPage", "", "firstTotalPage", "<init>", "(Ljava/util/List;ZZ)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getResetPage", "()Z", "getFirstTotalPage", "toString", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseSearchFeed {

    @Nullable
    private List<CourseListItem> feeds;
    private final boolean firstTotalPage;
    private final boolean resetPage;

    public CourseSearchFeed() {
        this(null, false, false, 7, null);
    }

    @Nullable
    public final List<CourseListItem> getFeeds() {
        return this.feeds;
    }

    public final boolean getFirstTotalPage() {
        return this.firstTotalPage;
    }

    public final boolean getResetPage() {
        return this.resetPage;
    }

    public final void setFeeds(@Nullable List<CourseListItem> list) {
        this.feeds = list;
    }

    @NotNull
    public String toString() {
        return "CourseSearchFeed(feeds=" + this.feeds + ",  firstPage=" + this.resetPage + ")";
    }

    public CourseSearchFeed(@Nullable List<CourseListItem> list, boolean z, boolean z2) {
        this.feeds = list;
        this.resetPage = z;
        this.firstTotalPage = z2;
    }

    public /* synthetic */ CourseSearchFeed(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
