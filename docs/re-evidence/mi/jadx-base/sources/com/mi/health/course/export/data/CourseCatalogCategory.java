package com.mi.health.course.export.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\"\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR'\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/mi/health/course/export/data/CourseCatalogCategory;", "", "id", "", "name", "item", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseCatalogCategoryItem;", "Ljava/util/ArrayList;", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getName", "getItem", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)Lcom/mi/health/course/export/data/CourseCatalogCategory;", "equals", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseCatalogCategory {

    @Nullable
    private final String id;

    @Nullable
    private final ArrayList<CourseCatalogCategoryItem> item;

    @Nullable
    private final String name;

    @Nullable
    private Boolean selected;

    public CourseCatalogCategory(@Nullable String str, @Nullable String str2, @Nullable ArrayList<CourseCatalogCategoryItem> arrayList, @Nullable Boolean bool) {
        this.id = str;
        this.name = str2;
        this.item = arrayList;
        this.selected = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseCatalogCategory copy$default(CourseCatalogCategory courseCatalogCategory, String str, String str2, ArrayList arrayList, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = courseCatalogCategory.id;
        }
        if ((i & 2) != 0) {
            str2 = courseCatalogCategory.name;
        }
        if ((i & 4) != 0) {
            arrayList = courseCatalogCategory.item;
        }
        if ((i & 8) != 0) {
            bool = courseCatalogCategory.selected;
        }
        return courseCatalogCategory.copy(str, str2, arrayList, bool);
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

    @Nullable
    public final ArrayList<CourseCatalogCategoryItem> component3() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final CourseCatalogCategory copy(@Nullable String id, @Nullable String name, @Nullable ArrayList<CourseCatalogCategoryItem> item, @Nullable Boolean selected) {
        return new CourseCatalogCategory(id, name, item, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseCatalogCategory)) {
            return false;
        }
        CourseCatalogCategory courseCatalogCategory = (CourseCatalogCategory) other;
        return Intrinsics.areEqual(this.id, courseCatalogCategory.id) && Intrinsics.areEqual(this.name, courseCatalogCategory.name) && Intrinsics.areEqual(this.item, courseCatalogCategory.item) && Intrinsics.areEqual(this.selected, courseCatalogCategory.selected);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final ArrayList<CourseCatalogCategoryItem> getItem() {
        return this.item;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<CourseCatalogCategoryItem> arrayList = this.item;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Boolean bool = this.selected;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.selected = bool;
    }

    @NotNull
    public String toString() {
        return "CourseCatalogCategory(id=" + this.id + ", name=" + this.name + ", item=" + this.item + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ CourseCatalogCategory(String str, String str2, ArrayList arrayList, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : arrayList, bool);
    }
}
