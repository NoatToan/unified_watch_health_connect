package com.huami.wallet.ui.fragment;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/wallet/ui/fragment/ShiftUIData;", "", "", "component1", "component2", "component3", "icon", "tip0", "tip1", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIcon", "()I", "b", "getTip0", "c", "getTip1", "<init>", "(III)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShiftUIData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int tip0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int tip1;

    public ShiftUIData(int i, int i2, int i3) {
        this.icon = i;
        this.tip0 = i2;
        this.tip1 = i3;
    }

    public static /* synthetic */ ShiftUIData copy$default(ShiftUIData shiftUIData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = shiftUIData.icon;
        }
        if ((i4 & 2) != 0) {
            i2 = shiftUIData.tip0;
        }
        if ((i4 & 4) != 0) {
            i3 = shiftUIData.tip1;
        }
        return shiftUIData.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTip0() {
        return this.tip0;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTip1() {
        return this.tip1;
    }

    @NotNull
    public final ShiftUIData copy(int icon, int tip0, int tip1) {
        return new ShiftUIData(icon, tip0, tip1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShiftUIData)) {
            return false;
        }
        ShiftUIData shiftUIData = (ShiftUIData) other;
        return this.icon == shiftUIData.icon && this.tip0 == shiftUIData.tip0 && this.tip1 == shiftUIData.tip1;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getTip0() {
        return this.tip0;
    }

    public final int getTip1() {
        return this.tip1;
    }

    public int hashCode() {
        return (((this.icon * 31) + this.tip0) * 31) + this.tip1;
    }

    @NotNull
    public String toString() {
        return "ShiftUIData(icon=" + this.icon + ", tip0=" + this.tip0 + ", tip1=" + this.tip1 + ')';
    }
}
