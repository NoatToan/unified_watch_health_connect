package com.huami.chart.util;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/chart/util/HMGradientDrawableRectValue;", "", "", "component1", "component2", "component3", "component4", "left", "top", "right", "bottom", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getLeft", "()F", "b", "getTop", "c", "getRight", GoogleApiAvailabilityLight.a, "getBottom", "<init>", "(FFFF)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMGradientDrawableRectValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float right;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final float bottom;

    @JvmOverloads
    public HMGradientDrawableRectValue(float f, float f2) {
        this(0.0f, f, 0.0f, f2, 5, null);
    }

    @JvmOverloads
    public HMGradientDrawableRectValue(float f, float f2, float f3) {
        this(f, f2, 0.0f, f3, 4, null);
    }

    @JvmOverloads
    public HMGradientDrawableRectValue(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static /* synthetic */ HMGradientDrawableRectValue copy$default(HMGradientDrawableRectValue hMGradientDrawableRectValue, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = hMGradientDrawableRectValue.left;
        }
        if ((i & 2) != 0) {
            f2 = hMGradientDrawableRectValue.top;
        }
        if ((i & 4) != 0) {
            f3 = hMGradientDrawableRectValue.right;
        }
        if ((i & 8) != 0) {
            f4 = hMGradientDrawableRectValue.bottom;
        }
        return hMGradientDrawableRectValue.copy(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @NotNull
    public final HMGradientDrawableRectValue copy(float left, float top, float right, float bottom) {
        return new HMGradientDrawableRectValue(left, top, right, bottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMGradientDrawableRectValue)) {
            return false;
        }
        HMGradientDrawableRectValue hMGradientDrawableRectValue = (HMGradientDrawableRectValue) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(hMGradientDrawableRectValue.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(hMGradientDrawableRectValue.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(hMGradientDrawableRectValue.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(hMGradientDrawableRectValue.bottom));
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom);
    }

    @NotNull
    public String toString() {
        return "HMGradientDrawableRectValue(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
    }

    public /* synthetic */ HMGradientDrawableRectValue(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, f2, (i & 4) != 0 ? 0.0f : f3, f4);
    }
}
