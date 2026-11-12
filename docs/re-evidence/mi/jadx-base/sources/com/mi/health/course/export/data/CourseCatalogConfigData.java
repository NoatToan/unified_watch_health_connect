package com.mi.health.course.export.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R#\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR#\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "", "category", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseCatalogCategory;", "Ljava/util/ArrayList;", "filter", "Lcom/mi/health/course/export/data/CourseCatalogFilter;", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getCategory", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getFilter", "component1", "component2", "copy", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lcom/mi/health/course/export/data/CourseCatalogConfigData;", "equals", "", "other", "hashCode", "", "toString", "", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseCatalogConfigData {

    @NotNull
    private final ArrayList<CourseCatalogCategory> category;

    @NotNull
    private final ArrayList<CourseCatalogFilter> filter;

    public CourseCatalogConfigData(@NotNull ArrayList<CourseCatalogCategory> category, @NotNull ArrayList<CourseCatalogFilter> filter) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.category = category;
        this.filter = filter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseCatalogConfigData copy$default(CourseCatalogConfigData courseCatalogConfigData, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = courseCatalogConfigData.category;
        }
        if ((i & 2) != 0) {
            arrayList2 = courseCatalogConfigData.filter;
        }
        return courseCatalogConfigData.copy(arrayList, arrayList2);
    }

    @NotNull
    public final ArrayList<CourseCatalogCategory> component1() {
        return this.category;
    }

    @NotNull
    public final ArrayList<CourseCatalogFilter> component2() {
        return this.filter;
    }

    @NotNull
    public final CourseCatalogConfigData copy(@NotNull ArrayList<CourseCatalogCategory> category, @NotNull ArrayList<CourseCatalogFilter> filter) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new CourseCatalogConfigData(category, filter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseCatalogConfigData)) {
            return false;
        }
        CourseCatalogConfigData courseCatalogConfigData = (CourseCatalogConfigData) other;
        return Intrinsics.areEqual(this.category, courseCatalogConfigData.category) && Intrinsics.areEqual(this.filter, courseCatalogConfigData.filter);
    }

    @NotNull
    public final ArrayList<CourseCatalogCategory> getCategory() {
        return this.category;
    }

    @NotNull
    public final ArrayList<CourseCatalogFilter> getFilter() {
        return this.filter;
    }

    public int hashCode() {
        return (this.category.hashCode() * 31) + this.filter.hashCode();
    }

    @NotNull
    public String toString() {
        return "CourseCatalogConfigData(category=" + this.category + ", filter=" + this.filter + ")";
    }
}
