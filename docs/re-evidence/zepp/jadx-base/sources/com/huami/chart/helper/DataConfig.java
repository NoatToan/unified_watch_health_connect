package com.huami.chart.helper;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/chart/helper/DataConfig;", "", "", "component1", "Lcom/huami/chart/helper/DataConfig$MarginF;", "component2", "a", "F", "getWidth", "()F", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "b", "Lcom/huami/chart/helper/DataConfig$MarginF;", "getRectF", "()Lcom/huami/chart/helper/DataConfig$MarginF;", "rectF", "<init>", "(FLcom/huami/chart/helper/DataConfig$MarginF;)V", "MarginF", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class DataConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MarginF rectF;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018¨\u0006$"}, d2 = {"Lcom/huami/chart/helper/DataConfig$MarginF;", "", "", "component1", "component2", "component3", "component4", "left", "top", "right", "bottom", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getLeft", "()F", "setLeft", "(F)V", "b", "getTop", "setTop", "c", "getRight", "setRight", GoogleApiAvailabilityLight.a, "getBottom", "setBottom", "<init>", "(FFFF)V", "chart_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class MarginF {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private float left;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private float top;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private float right;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private float bottom;

        public MarginF(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        public static /* synthetic */ MarginF copy$default(MarginF marginF, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = marginF.left;
            }
            if ((i & 2) != 0) {
                f2 = marginF.top;
            }
            if ((i & 4) != 0) {
                f3 = marginF.right;
            }
            if ((i & 8) != 0) {
                f4 = marginF.bottom;
            }
            return marginF.copy(f, f2, f3, f4);
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
        public final MarginF copy(float left, float top, float right, float bottom) {
            return new MarginF(left, top, right, bottom);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginF)) {
                return false;
            }
            MarginF marginF = (MarginF) other;
            return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(marginF.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(marginF.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(marginF.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(marginF.bottom));
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

        public final void setBottom(float f) {
            this.bottom = f;
        }

        public final void setLeft(float f) {
            this.left = f;
        }

        public final void setRight(float f) {
            this.right = f;
        }

        public final void setTop(float f) {
            this.top = f;
        }

        @NotNull
        public String toString() {
            return "MarginF(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
        }
    }

    public DataConfig(float f, @NotNull MarginF marginF) {
        this.width = f;
        this.rectF = marginF;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarginF getRectF() {
        return this.rectF;
    }

    @NotNull
    public final MarginF getRectF() {
        return this.rectF;
    }

    public final float getWidth() {
        return this.width;
    }

    public /* synthetic */ DataConfig(float f, MarginF marginF, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? new MarginF(HMChartHelperKt.getDpToPx(14.0f), HMChartHelperKt.getDpToPx(10.0f), HMChartHelperKt.getDpToPx(44.0f), HMChartHelperKt.getDpToPx(52.0f)) : marginF);
    }
}
