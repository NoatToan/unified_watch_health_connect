package com.huami.chart.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.HMColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b#\u0010&B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b#\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/huami/chart/data/ColorSegmentBar;", "", "", "component1", "component2", "Lcom/huami/chart/util/HMColor;", "component3", "Lcom/huami/chart/util/ChartGradientColor;", "component4", "start", "end", "hmColor", "chartGradientColor", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getStart", "()F", "b", "getEnd", "c", "Lcom/huami/chart/util/HMColor;", "getHmColor", "()Lcom/huami/chart/util/HMColor;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/util/ChartGradientColor;", "getChartGradientColor", "()Lcom/huami/chart/util/ChartGradientColor;", "<init>", "(FFLcom/huami/chart/util/HMColor;Lcom/huami/chart/util/ChartGradientColor;)V", "color", "(FFI)V", "(FFILcom/huami/chart/util/ChartGradientColor;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ColorSegmentBar {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final HMColor hmColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final ChartGradientColor chartGradientColor;

    public ColorSegmentBar(float f, float f2, @Nullable HMColor hMColor, @Nullable ChartGradientColor chartGradientColor) {
        this.start = f;
        this.end = f2;
        this.hmColor = hMColor;
        this.chartGradientColor = chartGradientColor;
    }

    public static /* synthetic */ ColorSegmentBar copy$default(ColorSegmentBar colorSegmentBar, float f, float f2, HMColor hMColor, ChartGradientColor chartGradientColor, int i, Object obj) {
        if ((i & 1) != 0) {
            f = colorSegmentBar.start;
        }
        if ((i & 2) != 0) {
            f2 = colorSegmentBar.end;
        }
        if ((i & 4) != 0) {
            hMColor = colorSegmentBar.hmColor;
        }
        if ((i & 8) != 0) {
            chartGradientColor = colorSegmentBar.chartGradientColor;
        }
        return colorSegmentBar.copy(f, f2, hMColor, chartGradientColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMColor getHmColor() {
        return this.hmColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChartGradientColor getChartGradientColor() {
        return this.chartGradientColor;
    }

    @NotNull
    public final ColorSegmentBar copy(float start, float end, @Nullable HMColor hmColor, @Nullable ChartGradientColor chartGradientColor) {
        return new ColorSegmentBar(start, end, hmColor, chartGradientColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorSegmentBar)) {
            return false;
        }
        ColorSegmentBar colorSegmentBar = (ColorSegmentBar) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.start), (Object) Float.valueOf(colorSegmentBar.start)) && Intrinsics.areEqual((Object) Float.valueOf(this.end), (Object) Float.valueOf(colorSegmentBar.end)) && Intrinsics.areEqual(this.hmColor, colorSegmentBar.hmColor) && Intrinsics.areEqual(this.chartGradientColor, colorSegmentBar.chartGradientColor);
    }

    @Nullable
    public final ChartGradientColor getChartGradientColor() {
        return this.chartGradientColor;
    }

    public final float getEnd() {
        return this.end;
    }

    @Nullable
    public final HMColor getHmColor() {
        return this.hmColor;
    }

    public final float getStart() {
        return this.start;
    }

    public int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.start) * 31) + Float.floatToIntBits(this.end)) * 31;
        HMColor hMColor = this.hmColor;
        int iHashCode = (iFloatToIntBits + (hMColor == null ? 0 : hMColor.hashCode())) * 31;
        ChartGradientColor chartGradientColor = this.chartGradientColor;
        return iHashCode + (chartGradientColor != null ? chartGradientColor.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ColorSegmentBar(start=" + this.start + ", end=" + this.end + ", hmColor=" + this.hmColor + ", chartGradientColor=" + this.chartGradientColor + ")";
    }

    public ColorSegmentBar(float f, float f2, int i) {
        this(f, f2, new HMColor(i, i), (ChartGradientColor) null);
    }

    public ColorSegmentBar(float f, float f2, int i, @NotNull ChartGradientColor chartGradientColor) {
        this(f, f2, new HMColor(i, i), chartGradientColor);
    }
}
