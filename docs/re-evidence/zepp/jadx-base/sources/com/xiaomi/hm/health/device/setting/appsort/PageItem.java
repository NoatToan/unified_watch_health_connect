package com.xiaomi.hm.health.device.setting.appsort;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\bR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\b¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "", "", "component1", "component2", "", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "parent", "type", "enable", "nameId", "drawableId", "colorId", "copy", "(IIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getParent", "()I", "b", "getType", "c", "Z", "getEnable", "()Z", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getNameId", "e", "getDrawableId", "f", "getColorId", "<init>", "(IIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PageItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean enable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer nameId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer drawableId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer colorId;

    public PageItem(int i, int i2, boolean z, @StringRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, @ColorRes @Nullable Integer num3) {
        this.parent = i;
        this.type = i2;
        this.enable = z;
        this.nameId = num;
        this.drawableId = num2;
        this.colorId = num3;
    }

    public static /* synthetic */ PageItem copy$default(PageItem pageItem, int i, int i2, boolean z, Integer num, Integer num2, Integer num3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pageItem.parent;
        }
        if ((i3 & 2) != 0) {
            i2 = pageItem.type;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = pageItem.enable;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            num = pageItem.nameId;
        }
        Integer num4 = num;
        if ((i3 & 16) != 0) {
            num2 = pageItem.drawableId;
        }
        Integer num5 = num2;
        if ((i3 & 32) != 0) {
            num3 = pageItem.colorId;
        }
        return pageItem.copy(i, i4, z2, num4, num5, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getNameId() {
        return this.nameId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDrawableId() {
        return this.drawableId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getColorId() {
        return this.colorId;
    }

    @NotNull
    public final PageItem copy(int parent, int type, boolean enable, @StringRes @Nullable Integer nameId, @DrawableRes @Nullable Integer drawableId, @ColorRes @Nullable Integer colorId) {
        return new PageItem(parent, type, enable, nameId, drawableId, colorId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageItem)) {
            return false;
        }
        PageItem pageItem = (PageItem) other;
        return this.parent == pageItem.parent && this.type == pageItem.type && this.enable == pageItem.enable && Intrinsics.areEqual(this.nameId, pageItem.nameId) && Intrinsics.areEqual(this.drawableId, pageItem.drawableId) && Intrinsics.areEqual(this.colorId, pageItem.colorId);
    }

    @Nullable
    public final Integer getColorId() {
        return this.colorId;
    }

    @Nullable
    public final Integer getDrawableId() {
        return this.drawableId;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Integer getNameId() {
        return this.nameId;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        int i = ((this.parent * 31) + this.type) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        Integer num = this.nameId;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.drawableId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.colorId;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PageItem(parent=" + this.parent + ", type=" + this.type + ", enable=" + this.enable + ", nameId=" + this.nameId + ", drawableId=" + this.drawableId + ", colorId=" + this.colorId + ")";
    }

    public /* synthetic */ PageItem(int i, int i2, boolean z, Integer num, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3);
    }
}
