package com.mi.health.course.vm;

import com.mi.health.course.data.CatalogGroup;
import com.mi.health.course.export.data.CourseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B?\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/mi/health/course/vm/CatalogFeed;", "", "feeds", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "catalogGroup", "Lcom/mi/health/course/data/CatalogGroup;", "resetPage", "", "firstTotalPage", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "getFeeds", "()Ljava/util/List;", "setFeeds", "(Ljava/util/List;)V", "getCatalogGroup", "setCatalogGroup", "getResetPage", "()Z", "getFirstTotalPage", "toString", "", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CatalogFeed {

    /* JADX INFO: renamed from: catalogGroup, reason: from kotlin metadata and from toString */
    @Nullable
    private List<CatalogGroup> catalog;

    @Nullable
    private List<? extends CourseModel.CourseData> feeds;
    private final boolean firstTotalPage;

    /* JADX INFO: renamed from: resetPage, reason: from kotlin metadata and from toString */
    private final boolean firstPage;

    public CatalogFeed() {
        this(null, null, false, false, 15, null);
    }

    @Nullable
    public final List<CatalogGroup> getCatalogGroup() {
        return this.catalog;
    }

    @Nullable
    public final List<CourseModel.CourseData> getFeeds() {
        return this.feeds;
    }

    public final boolean getFirstTotalPage() {
        return this.firstTotalPage;
    }

    /* JADX INFO: renamed from: getResetPage, reason: from getter */
    public final boolean getFirstPage() {
        return this.firstPage;
    }

    public final void setCatalogGroup(@Nullable List<CatalogGroup> list) {
        this.catalog = list;
    }

    public final void setFeeds(@Nullable List<? extends CourseModel.CourseData> list) {
        this.feeds = list;
    }

    @NotNull
    public String toString() {
        return "CatalogFeed(feeds=" + this.feeds + ", catalog=" + this.catalog + ", firstPage=" + this.firstPage + ")";
    }

    public CatalogFeed(@Nullable List<? extends CourseModel.CourseData> list, @Nullable List<CatalogGroup> list2, boolean z, boolean z2) {
        this.feeds = list;
        this.catalog = list2;
        this.firstPage = z;
        this.firstTotalPage = z2;
    }

    public /* synthetic */ CatalogFeed(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
