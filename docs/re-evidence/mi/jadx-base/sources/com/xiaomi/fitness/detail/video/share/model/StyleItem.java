package com.xiaomi.fitness.detail.video.share.model;

import com.mi.health.search.SearchContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "", "name", "", "styleId", SearchContract.COLUMN_ICON_RESID, "", "typeId", "nameStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getStyleId", "getIconResId", "()I", "getTypeId", "getNameStr", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyleItem {
    private final int iconResId;

    @NotNull
    private final String name;

    @NotNull
    private final String nameStr;

    @NotNull
    private final String styleId;
    private final int typeId;

    public StyleItem(@NotNull String name, @NotNull String styleId, int i, int i2, @NotNull String nameStr) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        this.name = name;
        this.styleId = styleId;
        this.iconResId = i;
        this.typeId = i2;
        this.nameStr = nameStr;
    }

    public static /* synthetic */ StyleItem copy$default(StyleItem styleItem, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = styleItem.name;
        }
        if ((i3 & 2) != 0) {
            str2 = styleItem.styleId;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = styleItem.iconResId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = styleItem.typeId;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = styleItem.nameStr;
        }
        return styleItem.copy(str, str4, i4, i5, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNameStr() {
        return this.nameStr;
    }

    @NotNull
    public final StyleItem copy(@NotNull String name, @NotNull String styleId, int iconResId, int typeId, @NotNull String nameStr) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        return new StyleItem(name, styleId, iconResId, typeId, nameStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleItem)) {
            return false;
        }
        StyleItem styleItem = (StyleItem) other;
        return Intrinsics.areEqual(this.name, styleItem.name) && Intrinsics.areEqual(this.styleId, styleItem.styleId) && this.iconResId == styleItem.iconResId && this.typeId == styleItem.typeId && Intrinsics.areEqual(this.nameStr, styleItem.nameStr);
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNameStr() {
        return this.nameStr;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.styleId.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + Integer.hashCode(this.typeId)) * 31) + this.nameStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "StyleItem(name=" + this.name + ", styleId=" + this.styleId + ", iconResId=" + this.iconResId + ", typeId=" + this.typeId + ", nameStr=" + this.nameStr + ")";
    }
}
