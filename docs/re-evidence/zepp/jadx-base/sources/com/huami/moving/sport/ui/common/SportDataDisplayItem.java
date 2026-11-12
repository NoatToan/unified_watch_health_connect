package com.huami.moving.sport.ui.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "", "", "component1", "component2", "component3", "title", "value", "unit", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "getValue", "c", "getUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportDataDisplayItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String unit;

    public SportDataDisplayItem(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.title = str;
        this.value = str2;
        this.unit = str3;
    }

    public static /* synthetic */ SportDataDisplayItem copy$default(SportDataDisplayItem sportDataDisplayItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportDataDisplayItem.title;
        }
        if ((i & 2) != 0) {
            str2 = sportDataDisplayItem.value;
        }
        if ((i & 4) != 0) {
            str3 = sportDataDisplayItem.unit;
        }
        return sportDataDisplayItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final SportDataDisplayItem copy(@NotNull String title, @NotNull String value, @Nullable String unit) {
        return new SportDataDisplayItem(title, value, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDataDisplayItem)) {
            return false;
        }
        SportDataDisplayItem sportDataDisplayItem = (SportDataDisplayItem) other;
        return Intrinsics.areEqual(this.title, sportDataDisplayItem.title) && Intrinsics.areEqual(this.value, sportDataDisplayItem.value) && Intrinsics.areEqual(this.unit, sportDataDisplayItem.unit);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.value.hashCode()) * 31;
        String str = this.unit;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportDataDisplayItem(title=" + this.title + ", value=" + this.value + ", unit=" + this.unit + ")";
    }
}
