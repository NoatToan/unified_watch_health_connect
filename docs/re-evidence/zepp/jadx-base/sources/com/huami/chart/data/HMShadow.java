package com.huami.chart.data;

import androidx.annotation.ColorInt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/chart/data/HMShadow;", "", "", "component1", "component2", "component3", "", "component4", "shadowRadius", "shadowDx", "shadowDy", "shadowColor", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "F", "getShadowRadius", "()F", "b", "getShadowDx", "c", "getShadowDy", GoogleApiAvailabilityLight.a, LogUtil.I, "getShadowColor", "()I", "<init>", "(FFFI)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMShadow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float shadowRadius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float shadowDx;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float shadowDy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int shadowColor;

    public HMShadow() {
        this(0.0f, 0.0f, 0.0f, 0, 15, null);
    }

    public HMShadow(float f, float f2, float f3, @ColorInt int i) {
        this.shadowRadius = f;
        this.shadowDx = f2;
        this.shadowDy = f3;
        this.shadowColor = i;
    }

    public static /* synthetic */ HMShadow copy$default(HMShadow hMShadow, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = hMShadow.shadowRadius;
        }
        if ((i2 & 2) != 0) {
            f2 = hMShadow.shadowDx;
        }
        if ((i2 & 4) != 0) {
            f3 = hMShadow.shadowDy;
        }
        if ((i2 & 8) != 0) {
            i = hMShadow.shadowColor;
        }
        return hMShadow.copy(f, f2, f3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getShadowRadius() {
        return this.shadowRadius;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getShadowDx() {
        return this.shadowDx;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getShadowDy() {
        return this.shadowDy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getShadowColor() {
        return this.shadowColor;
    }

    @NotNull
    public final HMShadow copy(float shadowRadius, float shadowDx, float shadowDy, @ColorInt int shadowColor) {
        return new HMShadow(shadowRadius, shadowDx, shadowDy, shadowColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMShadow)) {
            return false;
        }
        HMShadow hMShadow = (HMShadow) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.shadowRadius), (Object) Float.valueOf(hMShadow.shadowRadius)) && Intrinsics.areEqual((Object) Float.valueOf(this.shadowDx), (Object) Float.valueOf(hMShadow.shadowDx)) && Intrinsics.areEqual((Object) Float.valueOf(this.shadowDy), (Object) Float.valueOf(hMShadow.shadowDy)) && this.shadowColor == hMShadow.shadowColor;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final float getShadowDx() {
        return this.shadowDx;
    }

    public final float getShadowDy() {
        return this.shadowDy;
    }

    public final float getShadowRadius() {
        return this.shadowRadius;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.shadowRadius) * 31) + Float.floatToIntBits(this.shadowDx)) * 31) + Float.floatToIntBits(this.shadowDy)) * 31) + this.shadowColor;
    }

    @NotNull
    public String toString() {
        return "HMShadow(shadowRadius=" + this.shadowRadius + ", shadowDx=" + this.shadowDx + ", shadowDy=" + this.shadowDy + ", shadowColor=" + this.shadowColor + ")";
    }

    public /* synthetic */ HMShadow(float f, float f2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? -7829368 : i);
    }
}
