package com.mi.health.course.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/mi/health/course/export/data/CourseCatalogFilterItem;", "", "id", "", "name", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseCatalogFilterItem {

    @Nullable
    private final String id;

    @Nullable
    private final String name;
    private boolean selected;

    public CourseCatalogFilterItem(@Nullable String str, @Nullable String str2, boolean z) {
        this.id = str;
        this.name = str2;
        this.selected = z;
    }

    public static /* synthetic */ CourseCatalogFilterItem copy$default(CourseCatalogFilterItem courseCatalogFilterItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courseCatalogFilterItem.id;
        }
        if ((i & 2) != 0) {
            str2 = courseCatalogFilterItem.name;
        }
        if ((i & 4) != 0) {
            z = courseCatalogFilterItem.selected;
        }
        return courseCatalogFilterItem.copy(str, str2, z);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final CourseCatalogFilterItem copy(@Nullable String id, @Nullable String name, boolean selected) {
        return new CourseCatalogFilterItem(id, name, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseCatalogFilterItem)) {
            return false;
        }
        CourseCatalogFilterItem courseCatalogFilterItem = (CourseCatalogFilterItem) other;
        return Intrinsics.areEqual(this.id, courseCatalogFilterItem.id) && Intrinsics.areEqual(this.name, courseCatalogFilterItem.name) && this.selected == courseCatalogFilterItem.selected;
    }

    @Nullable
    public final String getId() {
        return this.id;
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
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "CourseCatalogFilterItem(id=" + this.id + ", name=" + this.name + ", selected=" + this.selected + ")";
    }
}
