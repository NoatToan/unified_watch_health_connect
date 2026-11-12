package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.alipay.sdk.m.x.d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/ListItemData;", "", "", "component1", "", "component2", "component3", "component4", "component5", "showSelect", "title", "tailText", "showTailText", "showRightImage", "copy", "toString", "", "hashCode", "other", "equals", "a", "Z", "getShowSelect", "()Z", "setShowSelect", "(Z)V", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "c", "getTailText", "setTailText", GoogleApiAvailabilityLight.a, "getShowTailText", "setShowTailText", "e", "getShowRightImage", "setShowRightImage", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ListItemData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean showSelect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String tailText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean showTailText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean showRightImage;

    public ListItemData(boolean z, @NotNull String str, @NotNull String str2, boolean z2, boolean z3) {
        this.showSelect = z;
        this.title = str;
        this.tailText = str2;
        this.showTailText = z2;
        this.showRightImage = z3;
    }

    public static /* synthetic */ ListItemData copy$default(ListItemData listItemData, boolean z, String str, String str2, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = listItemData.showSelect;
        }
        if ((i & 2) != 0) {
            str = listItemData.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = listItemData.tailText;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z2 = listItemData.showTailText;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = listItemData.showRightImage;
        }
        return listItemData.copy(z, str3, str4, z4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowSelect() {
        return this.showSelect;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTailText() {
        return this.tailText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTailText() {
        return this.showTailText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowRightImage() {
        return this.showRightImage;
    }

    @NotNull
    public final ListItemData copy(boolean showSelect, @NotNull String title, @NotNull String tailText, boolean showTailText, boolean showRightImage) {
        return new ListItemData(showSelect, title, tailText, showTailText, showRightImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListItemData)) {
            return false;
        }
        ListItemData listItemData = (ListItemData) other;
        return this.showSelect == listItemData.showSelect && Intrinsics.areEqual(this.title, listItemData.title) && Intrinsics.areEqual(this.tailText, listItemData.tailText) && this.showTailText == listItemData.showTailText && this.showRightImage == listItemData.showRightImage;
    }

    public final boolean getShowRightImage() {
        return this.showRightImage;
    }

    public final boolean getShowSelect() {
        return this.showSelect;
    }

    public final boolean getShowTailText() {
        return this.showTailText;
    }

    @NotNull
    public final String getTailText() {
        return this.tailText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.showSelect;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.title.hashCode()) * 31) + this.tailText.hashCode()) * 31;
        boolean z2 = this.showTailText;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        boolean z3 = this.showRightImage;
        return i + (z3 ? 1 : z3);
    }

    public final void setShowRightImage(boolean z) {
        this.showRightImage = z;
    }

    public final void setShowSelect(boolean z) {
        this.showSelect = z;
    }

    public final void setShowTailText(boolean z) {
        this.showTailText = z;
    }

    public final void setTailText(@NotNull String str) {
        this.tailText = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "ListItemData(showSelect=" + this.showSelect + ", title=" + this.title + ", tailText=" + this.tailText + ", showTailText=" + this.showTailText + ", showRightImage=" + this.showRightImage + ")";
    }

    public /* synthetic */ ListItemData(boolean z, String str, String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
