package com.huami.dragview.draglist;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dragview.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003JP\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001e\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010)\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u001bR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/huami/dragview/draglist/DragEntry;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "()Ljava/lang/Integer;", "component6", "show", "canDrag", "title", "icon", "iconTint", "key", "copy", "(ZZLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Object;)Lcom/huami/dragview/draglist/DragEntry;", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getType$dragview_release", "()I", "setType$dragview_release", "(I)V", "type", "b", "getBackground$dragview_release", "setBackground$dragview_release", "background", "c", "Z", "getShowItemLine$dragview_release", "()Z", "setShowItemLine$dragview_release", "(Z)V", "showItemLine", GoogleApiAvailabilityLight.a, "getShow", "setShow", "e", "getCanDrag", "setCanDrag", "f", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "g", "getIcon", "h", "Ljava/lang/Integer;", "getIconTint", "i", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "setKey", "(Ljava/lang/Object;)V", "<init>", "(ZZLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Object;)V", "dragview_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DragEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @LayoutRes
    private int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @DrawableRes
    private int background;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean showItemLine;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean show;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean canDrag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer iconTint;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Object key;

    public DragEntry(boolean z, boolean z2, @NotNull String str, @DrawableRes int i, @ColorRes @Nullable Integer num, @Nullable Object obj) {
        this.show = z;
        this.canDrag = z2;
        this.title = str;
        this.icon = i;
        this.iconTint = num;
        this.key = obj;
        this.type = R.layout.dragview_activity_drag_item_data;
        this.background = R.drawable.dragview_drag_item_normal;
        this.showItemLine = true;
    }

    public static /* synthetic */ DragEntry copy$default(DragEntry dragEntry, boolean z, boolean z2, String str, int i, Integer num, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = dragEntry.show;
        }
        if ((i2 & 2) != 0) {
            z2 = dragEntry.canDrag;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            str = dragEntry.title;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = dragEntry.icon;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            num = dragEntry.iconTint;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            obj = dragEntry.key;
        }
        return dragEntry.copy(z, z3, str2, i3, num2, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCanDrag() {
        return this.canDrag;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getIconTint() {
        return this.iconTint;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    @NotNull
    public final DragEntry copy(boolean show, boolean canDrag, @NotNull String title, @DrawableRes int icon, @ColorRes @Nullable Integer iconTint, @Nullable Object key) {
        return new DragEntry(show, canDrag, title, icon, iconTint, key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DragEntry)) {
            return false;
        }
        DragEntry dragEntry = (DragEntry) other;
        return this.show == dragEntry.show && this.canDrag == dragEntry.canDrag && Intrinsics.areEqual(this.title, dragEntry.title) && this.icon == dragEntry.icon && Intrinsics.areEqual(this.iconTint, dragEntry.iconTint) && Intrinsics.areEqual(this.key, dragEntry.key);
    }

    /* JADX INFO: renamed from: getBackground$dragview_release, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    public final boolean getCanDrag() {
        return this.canDrag;
    }

    public final int getIcon() {
        return this.icon;
    }

    @Nullable
    public final Integer getIconTint() {
        return this.iconTint;
    }

    @Nullable
    public final Object getKey() {
        return this.key;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX INFO: renamed from: getShowItemLine$dragview_release, reason: from getter */
    public final boolean getShowItemLine() {
        return this.showItemLine;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: getType$dragview_release, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.canDrag;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        String str = this.title;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.icon) * 31;
        Integer num = this.iconTint;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        Object obj = this.key;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final void setBackground$dragview_release(int i) {
        this.background = i;
    }

    public final void setCanDrag(boolean z) {
        this.canDrag = z;
    }

    public final void setKey(@Nullable Object obj) {
        this.key = obj;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setShowItemLine$dragview_release(boolean z) {
        this.showItemLine = z;
    }

    public final void setType$dragview_release(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "DragEntry(show=" + this.show + ", canDrag=" + this.canDrag + ", title=" + this.title + ", icon=" + this.icon + ", iconTint=" + this.iconTint + ", key=" + this.key + ")";
    }

    public /* synthetic */ DragEntry(boolean z, boolean z2, String str, int i, Integer num, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? true : z2, str, i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : obj);
    }
}
