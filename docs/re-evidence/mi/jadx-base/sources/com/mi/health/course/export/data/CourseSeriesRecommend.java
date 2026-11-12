package com.mi.health.course.export.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ,\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R'\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "", "album", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseSeriesData;", "Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getAlbum", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "copy", "(Ljava/util/ArrayList;)Lcom/mi/health/course/export/data/CourseSeriesRecommend;", "equals", "", "other", "hashCode", "", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseSeriesRecommend {

    @Nullable
    private final ArrayList<CourseSeriesData> album;

    public CourseSeriesRecommend(@Nullable ArrayList<CourseSeriesData> arrayList) {
        this.album = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSeriesRecommend copy$default(CourseSeriesRecommend courseSeriesRecommend, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = courseSeriesRecommend.album;
        }
        return courseSeriesRecommend.copy(arrayList);
    }

    @Nullable
    public final ArrayList<CourseSeriesData> component1() {
        return this.album;
    }

    @NotNull
    public final CourseSeriesRecommend copy(@Nullable ArrayList<CourseSeriesData> album) {
        return new CourseSeriesRecommend(album);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CourseSeriesRecommend) && Intrinsics.areEqual(this.album, ((CourseSeriesRecommend) other).album);
    }

    @Nullable
    public final ArrayList<CourseSeriesData> getAlbum() {
        return this.album;
    }

    public int hashCode() {
        ArrayList<CourseSeriesData> arrayList = this.album;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseSeriesRecommend(album=" + this.album + ")";
    }
}
