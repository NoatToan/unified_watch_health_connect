package com.huami.chart.helper;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.R;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bN\u0010OJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0098\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010&\u001a\u00020%HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0019\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u001a\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R!\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\fR!\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u000fR\u0019\u0010\u001d\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u001e\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\u001f\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\u0019\u0010 \u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u00101R\u0019\u0010!\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\bK\u00101R\u0019\u0010\"\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101¨\u0006P"}, d2 = {"Lcom/huami/chart/helper/MultiLineConfig;", "", "Landroid/content/Context;", "component1", "", "component2", "", "component3", "", "component4", "", "component5", "()[[I", "Lcom/huami/chart/util/HMGradientDrawableRectValue;", "component6", "()[Lcom/huami/chart/util/HMGradientDrawableRectValue;", "", "component7", "component8", "component9", "component10", "component11", "component12", DbUtils.Const.Table.CONTEXT, "lineStyle", "lineColors", "showInteractiveLine", "shadowColors", "shadowRectValues", "pointRadius", "dataPointRadius", "dataPointBorderRadius", "dataPointBorderColor", "gap", "priority", "copy", "(Landroid/content/Context;I[IZ[[I[Lcom/huami/chart/util/HMGradientDrawableRectValue;FFFIII)Lcom/huami/chart/helper/MultiLineConfig;", "", "toString", "hashCode", "other", "equals", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", LogUtil.I, "getLineStyle", "()I", "c", "[I", "getLineColors", "()[I", GoogleApiAvailabilityLight.a, "Z", "getShowInteractiveLine", "()Z", "e", "[[I", "getShadowColors", "f", "[Lcom/huami/chart/util/HMGradientDrawableRectValue;", "getShadowRectValues", "g", "F", "getPointRadius", "()F", "h", "getDataPointRadius", "i", "getDataPointBorderRadius", z.j, "getDataPointBorderColor", hl.k, "getGap", "l", "getPriority", "<init>", "(Landroid/content/Context;I[IZ[[I[Lcom/huami/chart/util/HMGradientDrawableRectValue;FFFIII)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MultiLineConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int lineStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final int[] lineColors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean showInteractiveLine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final int[][] shadowColors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final HMGradientDrawableRectValue[] shadowRectValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final float pointRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final float dataPointRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final float dataPointBorderRadius;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int dataPointBorderColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int gap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int priority;

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z) {
        this(context, i, iArr, z, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 4080, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2) {
        this(context, i, iArr, z, iArr2, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 4064, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, 0.0f, 0.0f, 0.0f, 0, 0, 0, 4032, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, f, 0.0f, 0.0f, 0, 0, 0, 3968, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, f, f2, 0.0f, 0, 0, 0, 3840, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2, float f3) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, f, f2, f3, 0, 0, 0, 3584, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2, float f3, int i2) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, f, f2, f3, i2, 0, 0, 3072, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2, float f3, int i2, int i3) {
        this(context, i, iArr, z, iArr2, hMGradientDrawableRectValueArr, f, f2, f3, i2, i3, 0, 2048, null);
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, int i, @NotNull int[] iArr, boolean z, @Nullable int[][] iArr2, @Nullable HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2, float f3, int i2, int i3, int i4) {
        this.context = context;
        this.lineStyle = i;
        this.lineColors = iArr;
        this.showInteractiveLine = z;
        this.shadowColors = iArr2;
        this.shadowRectValues = hMGradientDrawableRectValueArr;
        this.pointRadius = f;
        this.dataPointRadius = f2;
        this.dataPointBorderRadius = f3;
        this.dataPointBorderColor = i2;
        this.gap = i3;
        this.priority = i4;
    }

    @JvmOverloads
    public MultiLineConfig(@NotNull Context context, @NotNull int[] iArr, boolean z) {
        this(context, 0, iArr, z, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 4082, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDataPointBorderColor() {
        return this.dataPointBorderColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGap() {
        return this.gap;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLineStyle() {
        return this.lineStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int[] getLineColors() {
        return this.lineColors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowInteractiveLine() {
        return this.showInteractiveLine;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int[][] getShadowColors() {
        return this.shadowColors;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HMGradientDrawableRectValue[] getShadowRectValues() {
        return this.shadowRectValues;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getPointRadius() {
        return this.pointRadius;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getDataPointRadius() {
        return this.dataPointRadius;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getDataPointBorderRadius() {
        return this.dataPointBorderRadius;
    }

    @NotNull
    public final MultiLineConfig copy(@NotNull Context context, int lineStyle, @NotNull int[] lineColors, boolean showInteractiveLine, @Nullable int[][] shadowColors, @Nullable HMGradientDrawableRectValue[] shadowRectValues, float pointRadius, float dataPointRadius, float dataPointBorderRadius, int dataPointBorderColor, int gap, int priority) {
        return new MultiLineConfig(context, lineStyle, lineColors, showInteractiveLine, shadowColors, shadowRectValues, pointRadius, dataPointRadius, dataPointBorderRadius, dataPointBorderColor, gap, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiLineConfig)) {
            return false;
        }
        MultiLineConfig multiLineConfig = (MultiLineConfig) other;
        return Intrinsics.areEqual(this.context, multiLineConfig.context) && this.lineStyle == multiLineConfig.lineStyle && Intrinsics.areEqual(this.lineColors, multiLineConfig.lineColors) && this.showInteractiveLine == multiLineConfig.showInteractiveLine && Intrinsics.areEqual(this.shadowColors, multiLineConfig.shadowColors) && Intrinsics.areEqual(this.shadowRectValues, multiLineConfig.shadowRectValues) && Intrinsics.areEqual((Object) Float.valueOf(this.pointRadius), (Object) Float.valueOf(multiLineConfig.pointRadius)) && Intrinsics.areEqual((Object) Float.valueOf(this.dataPointRadius), (Object) Float.valueOf(multiLineConfig.dataPointRadius)) && Intrinsics.areEqual((Object) Float.valueOf(this.dataPointBorderRadius), (Object) Float.valueOf(multiLineConfig.dataPointBorderRadius)) && this.dataPointBorderColor == multiLineConfig.dataPointBorderColor && this.gap == multiLineConfig.gap && this.priority == multiLineConfig.priority;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getDataPointBorderColor() {
        return this.dataPointBorderColor;
    }

    public final float getDataPointBorderRadius() {
        return this.dataPointBorderRadius;
    }

    public final float getDataPointRadius() {
        return this.dataPointRadius;
    }

    public final int getGap() {
        return this.gap;
    }

    @NotNull
    public final int[] getLineColors() {
        return this.lineColors;
    }

    public final int getLineStyle() {
        return this.lineStyle;
    }

    public final float getPointRadius() {
        return this.pointRadius;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final int[][] getShadowColors() {
        return this.shadowColors;
    }

    @Nullable
    public final HMGradientDrawableRectValue[] getShadowRectValues() {
        return this.shadowRectValues;
    }

    public final boolean getShowInteractiveLine() {
        return this.showInteractiveLine;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.context.hashCode() * 31) + this.lineStyle) * 31) + Arrays.hashCode(this.lineColors)) * 31;
        boolean z = this.showInteractiveLine;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        int[][] iArr = this.shadowColors;
        int iHashCode2 = (i + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr = this.shadowRectValues;
        return ((((((((((((iHashCode2 + (hMGradientDrawableRectValueArr != null ? Arrays.hashCode(hMGradientDrawableRectValueArr) : 0)) * 31) + Float.floatToIntBits(this.pointRadius)) * 31) + Float.floatToIntBits(this.dataPointRadius)) * 31) + Float.floatToIntBits(this.dataPointBorderRadius)) * 31) + this.dataPointBorderColor) * 31) + this.gap) * 31) + this.priority;
    }

    @NotNull
    public String toString() {
        return "MultiLineConfig(context=" + this.context + ", lineStyle=" + this.lineStyle + ", lineColors=" + Arrays.toString(this.lineColors) + ", showInteractiveLine=" + this.showInteractiveLine + ", shadowColors=" + Arrays.toString(this.shadowColors) + ", shadowRectValues=" + Arrays.toString(this.shadowRectValues) + ", pointRadius=" + this.pointRadius + ", dataPointRadius=" + this.dataPointRadius + ", dataPointBorderRadius=" + this.dataPointBorderRadius + ", dataPointBorderColor=" + this.dataPointBorderColor + ", gap=" + this.gap + ", priority=" + this.priority + ")";
    }

    public /* synthetic */ MultiLineConfig(Context context, int i, int[] iArr, boolean z, int[][] iArr2, HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr, float f, float f2, float f3, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? 4 : i, iArr, z, (i5 & 16) != 0 ? null : iArr2, (i5 & 32) != 0 ? null : hMGradientDrawableRectValueArr, (i5 & 64) != 0 ? HMChartHelperKt.getDpToPx(2.0f) : f, (i5 & 128) != 0 ? HMChartHelperKt.getDpToPx(2.0f) : f2, (i5 & 256) != 0 ? HMChartHelperKt.getDpToPx(2.5f) : f3, (i5 & 512) != 0 ? HMChartHelperKt.getResColor$default(context, R.color.s38, 0.0f, 4, null) : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? 100 : i4);
    }
}
