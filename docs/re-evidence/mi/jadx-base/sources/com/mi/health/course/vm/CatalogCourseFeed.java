package com.mi.health.course.vm;

import com.mi.health.course.export.data.CourseListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/mi/health/course/vm/CatalogCourseFeed;", "", "feeds", "", "Lcom/mi/health/course/export/data/CourseListItem;", "resetPage", "", "firstTotalPage", "isFullPage", "<init>", "(Ljava/util/List;ZZZ)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getResetPage", "()Z", "getFirstTotalPage", "toString", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CatalogCourseFeed {

    @Nullable
    private List<CourseListItem> feeds;
    private final boolean firstTotalPage;
    private final boolean isFullPage;
    private final boolean resetPage;

    public CatalogCourseFeed() {
        this(null, false, false, false, 15, null);
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

    /* JADX INFO: renamed from: isFullPage, reason: from getter */
    public final boolean getIsFullPage() {
        return this.isFullPage;
    }

    public final void setFeeds(@Nullable List<CourseListItem> list) {
        this.feeds = list;
    }

    @NotNull
    public String toString() {
        return "CatalogCourseFeed(feeds=" + this.feeds + ",  firstPage=" + this.resetPage + ")";
    }

    public CatalogCourseFeed(@Nullable List<CourseListItem> list, boolean z, boolean z2, boolean z3) {
        this.feeds = list;
        this.resetPage = z;
        this.firstTotalPage = z2;
        this.isFullPage = z3;
    }

    public /* synthetic */ CatalogCourseFeed(List list, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
