package com.mi.health.course.export.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR#\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/mi/health/course/export/data/CourseCatalogFilter;", "", "id", "", "name", "item", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseCatalogFilterItem;", "Ljava/util/ArrayList;", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V", "getId", "()Ljava/lang/String;", "getName", "getItem", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)Lcom/mi/health/course/export/data/CourseCatalogFilter;", "equals", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseCatalogFilter {

    @Nullable
    private final String id;

    @NotNull
    private final ArrayList<CourseCatalogFilterItem> item;

    @Nullable
    private final String name;
    private boolean selected;

    public CourseCatalogFilter(@Nullable String str, @Nullable String str2, @NotNull ArrayList<CourseCatalogFilterItem> item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.id = str;
        this.name = str2;
        this.item = item;
        this.selected = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseCatalogFilter copy$default(CourseCatalogFilter courseCatalogFilter, String str, String str2, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courseCatalogFilter.id;
        }
        if ((i & 2) != 0) {
            str2 = courseCatalogFilter.name;
        }
        if ((i & 4) != 0) {
            arrayList = courseCatalogFilter.item;
        }
        if ((i & 8) != 0) {
            z = courseCatalogFilter.selected;
        }
        return courseCatalogFilter.copy(str, str2, arrayList, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ArrayList<CourseCatalogFilterItem> component3() {
        return this.item;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final CourseCatalogFilter copy(@Nullable String id, @Nullable String name, @NotNull ArrayList<CourseCatalogFilterItem> item, boolean selected) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new CourseCatalogFilter(id, name, item, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseCatalogFilter)) {
            return false;
        }
        CourseCatalogFilter courseCatalogFilter = (CourseCatalogFilter) other;
        return Intrinsics.areEqual(this.id, courseCatalogFilter.id) && Intrinsics.areEqual(this.name, courseCatalogFilter.name) && Intrinsics.areEqual(this.item, courseCatalogFilter.item) && this.selected == courseCatalogFilter.selected;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ArrayList<CourseCatalogFilterItem> getItem() {
        return this.item;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.item.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "CourseCatalogFilter(id=" + this.id + ", name=" + this.name + ", item=" + this.item + ", selected=" + this.selected + ")";
    }
}
