package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0003HÆ\u0003¢\u0006\u0002\u0010\rJN\u0010\u0015\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R#\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/mi/health/course/export/data/CourseListData;", "", "course", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseListItem;", "Ljava/util/ArrayList;", "nextKey", "", "album", "Lcom/mi/health/course/export/data/CourseSeriesData;", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCourse", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getNextKey", "()Ljava/lang/String;", "getAlbum", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/mi/health/course/export/data/CourseListData;", "equals", "", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseListData {

    @NotNull
    private final ArrayList<CourseSeriesData> album;

    @NotNull
    private final ArrayList<CourseListItem> course;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final String nextKey;

    public CourseListData(@NotNull ArrayList<CourseListItem> course, @Nullable String str, @NotNull ArrayList<CourseSeriesData> album) {
        Intrinsics.checkNotNullParameter(course, "course");
        Intrinsics.checkNotNullParameter(album, "album");
        this.course = course;
        this.nextKey = str;
        this.album = album;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseListData copy$default(CourseListData courseListData, ArrayList arrayList, String str, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = courseListData.course;
        }
        if ((i & 2) != 0) {
            str = courseListData.nextKey;
        }
        if ((i & 4) != 0) {
            arrayList2 = courseListData.album;
        }
        return courseListData.copy(arrayList, str, arrayList2);
    }

    @NotNull
    public final ArrayList<CourseListItem> component1() {
        return this.course;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final ArrayList<CourseSeriesData> component3() {
        return this.album;
    }

    @NotNull
    public final CourseListData copy(@NotNull ArrayList<CourseListItem> course, @Nullable String nextKey, @NotNull ArrayList<CourseSeriesData> album) {
        Intrinsics.checkNotNullParameter(course, "course");
        Intrinsics.checkNotNullParameter(album, "album");
        return new CourseListData(course, nextKey, album);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseListData)) {
            return false;
        }
        CourseListData courseListData = (CourseListData) other;
        return Intrinsics.areEqual(this.course, courseListData.course) && Intrinsics.areEqual(this.nextKey, courseListData.nextKey) && Intrinsics.areEqual(this.album, courseListData.album);
    }

    @NotNull
    public final ArrayList<CourseSeriesData> getAlbum() {
        return this.album;
    }

    @NotNull
    public final ArrayList<CourseListItem> getCourse() {
        return this.course;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public int hashCode() {
        int iHashCode = this.course.hashCode() * 31;
        String str = this.nextKey;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.album.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseListData(course=" + this.course + ", nextKey=" + this.nextKey + ", album=" + this.album + ")";
    }
}
