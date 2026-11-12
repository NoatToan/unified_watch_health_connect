package com.fitness.banner.export.v2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/fitness/banner/export/v2/DisplayExtra;", "", "showCloseIcon", "", "showViewIcon", "showTimeSegment", "destroyEnable", "destroyTypeList", "", "", "<init>", "(ZZZZLjava/util/List;)V", "getShowCloseIcon", "()Z", "getShowViewIcon", "getShowTimeSegment", "getDestroyEnable", "getDestroyTypeList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DisplayExtra {

    @SerializedName("is_destructible")
    private final boolean destroyEnable;

    @SerializedName("destruction_type")
    @Nullable
    private final List<Integer> destroyTypeList;

    @SerializedName("is_display_close")
    private final boolean showCloseIcon;

    @SerializedName("is_display_period")
    private final boolean showTimeSegment;

    @SerializedName("is_display_view")
    private final boolean showViewIcon;

    public DisplayExtra() {
        this(false, false, false, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayExtra copy$default(DisplayExtra displayExtra, boolean z, boolean z2, boolean z3, boolean z4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = displayExtra.showCloseIcon;
        }
        if ((i & 2) != 0) {
            z2 = displayExtra.showViewIcon;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = displayExtra.showTimeSegment;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = displayExtra.destroyEnable;
        }
        boolean z7 = z4;
        if ((i & 16) != 0) {
            list = displayExtra.destroyTypeList;
        }
        return displayExtra.copy(z, z5, z6, z7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowViewIcon() {
        return this.showViewIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowTimeSegment() {
        return this.showTimeSegment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDestroyEnable() {
        return this.destroyEnable;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.destroyTypeList;
    }

    @NotNull
    public final DisplayExtra copy(boolean showCloseIcon, boolean showViewIcon, boolean showTimeSegment, boolean destroyEnable, @Nullable List<Integer> destroyTypeList) {
        return new DisplayExtra(showCloseIcon, showViewIcon, showTimeSegment, destroyEnable, destroyTypeList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayExtra)) {
            return false;
        }
        DisplayExtra displayExtra = (DisplayExtra) other;
        return this.showCloseIcon == displayExtra.showCloseIcon && this.showViewIcon == displayExtra.showViewIcon && this.showTimeSegment == displayExtra.showTimeSegment && this.destroyEnable == displayExtra.destroyEnable && Intrinsics.areEqual(this.destroyTypeList, displayExtra.destroyTypeList);
    }

    public final boolean getDestroyEnable() {
        return this.destroyEnable;
    }

    @Nullable
    public final List<Integer> getDestroyTypeList() {
        return this.destroyTypeList;
    }

    public final boolean getShowCloseIcon() {
        return this.showCloseIcon;
    }

    public final boolean getShowTimeSegment() {
        return this.showTimeSegment;
    }

    public final boolean getShowViewIcon() {
        return this.showViewIcon;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.showCloseIcon) * 31) + Boolean.hashCode(this.showViewIcon)) * 31) + Boolean.hashCode(this.showTimeSegment)) * 31) + Boolean.hashCode(this.destroyEnable)) * 31;
        List<Integer> list = this.destroyTypeList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DisplayExtra(showCloseIcon=" + this.showCloseIcon + ", showViewIcon=" + this.showViewIcon + ", showTimeSegment=" + this.showTimeSegment + ", destroyEnable=" + this.destroyEnable + ", destroyTypeList=" + this.destroyTypeList + ")";
    }

    public DisplayExtra(boolean z, boolean z2, boolean z3, boolean z4, @Nullable List<Integer> list) {
        this.showCloseIcon = z;
        this.showViewIcon = z2;
        this.showTimeSegment = z3;
        this.destroyEnable = z4;
        this.destroyTypeList = list;
    }

    public /* synthetic */ DisplayExtra(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? null : list);
    }
}
