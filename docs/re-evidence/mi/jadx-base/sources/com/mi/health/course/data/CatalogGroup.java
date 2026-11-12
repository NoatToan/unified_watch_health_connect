package com.mi.health.course.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/mi/health/course/data/CatalogGroup;", "", "type", "", "name", "", "tags", "", "Lcom/mi/health/course/data/CourseCatalogResp$Catalog;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getType", "()I", "setType", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "selected", "", "getSelected", "()Z", "setSelected", "(Z)V", "toString", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CatalogGroup {

    @Nullable
    private String name;
    private boolean selected;

    @Nullable
    private List<? extends CourseCatalogResp.Catalog> tags;
    private int type;

    public CatalogGroup() {
        this(0, null, null, 7, null);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<CourseCatalogResp.Catalog> getTags() {
        return this.tags;
    }

    public final int getType() {
        return this.type;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setTags(@Nullable List<? extends CourseCatalogResp.Catalog> list) {
        this.tags = list;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "CatalogGroup(type=" + this.type + ", name=" + this.name + ", tags=" + this.tags + ")";
    }

    public CatalogGroup(int i, @Nullable String str, @Nullable List<? extends CourseCatalogResp.Catalog> list) {
        this.type = i;
        this.name = str;
        this.tags = list;
    }

    public /* synthetic */ CatalogGroup(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }
}
