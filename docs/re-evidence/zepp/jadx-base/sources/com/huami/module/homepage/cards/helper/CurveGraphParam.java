package com.huami.module.homepage.cards.helper;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.RangeIndex;
import com.loc.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bZ\u0010[J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002HÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jà\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020\u000b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\b\b\u0002\u0010'\u001a\u00020\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\t\u0010.\u001a\u00020-HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u001c\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001d\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0019\u0010\u001e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0019\u0010\u001f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R!\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00105R\u0019\u0010!\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bG\u00105R\u001b\u0010#\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0010R!\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bL\u00105R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006@\u0006¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u00105R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006@\u0006¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\bP\u00105R\u0019\u0010'\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u00109R\u001b\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010\u0010R\u001b\u0010)\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010\u0019R\u001b\u0010*\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bY\u0010\u0019¨\u0006\\"}, d2 = {"Lcom/huami/module/homepage/cards/helper/CurveGraphParam;", "", "", "Lcom/huami/module/homepage/cards/helper/CurveChartPoint;", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "Lcom/huami/chart/data/RangeIndex;", "component8", "component9", "()Ljava/lang/Integer;", "component10", "", "component11", "Lcom/huami/module/homepage/cards/helper/XLabel;", "component12", "component13", "component14", "component15", "()Ljava/lang/Float;", "component16", "points", "lineColor", "gradientStartColor", "gradientEndColor", "lineStyle", "lineVerticalGradientStartColor", "keepMinimumHeight", "subIndex", "subLineColor", "subLineShaderColors", "goalLines", "xLabels", "verticalLineCount", "verticalLineHeight", "maxValue", "minValue", "copy", "(Ljava/util/List;IIIILjava/util/List;ZLjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)Lcom/huami/module/homepage/cards/helper/CurveGraphParam;", "", "toString", "hashCode", "other", "equals", "a", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "b", LogUtil.I, "getLineColor", "()I", "c", "getGradientStartColor", GoogleApiAvailabilityLight.a, "getGradientEndColor", "e", "getLineStyle", "f", "getLineVerticalGradientStartColor", "g", "Z", "getKeepMinimumHeight", "()Z", "h", "getSubIndex", "i", "Ljava/lang/Integer;", "getSubLineColor", z.j, "getSubLineShaderColors", hl.k, "getGoalLines", "l", "getXLabels", "m", "getVerticalLineCount", GoogleApiAvailabilityLight.b, "getVerticalLineHeight", "o", "Ljava/lang/Float;", "getMaxValue", b.r, "getMinValue", "<init>", "(Ljava/util/List;IIIILjava/util/List;ZLjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CurveGraphParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<CurveChartPoint> points;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int lineColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int gradientStartColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int gradientEndColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int lineStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Integer> lineVerticalGradientStartColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean keepMinimumHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<RangeIndex> subIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer subLineColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Integer> subLineShaderColors;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Float> goalLines;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<XLabel> xLabels;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final int verticalLineCount;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer verticalLineHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float maxValue;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    private final Float minValue;

    /* JADX WARN: Multi-variable type inference failed */
    public CurveGraphParam(@NotNull List<CurveChartPoint> list, int i, int i2, int i3, int i4, @Nullable List<Integer> list2, boolean z, @NotNull List<? extends RangeIndex> list3, @Nullable Integer num, @Nullable List<Integer> list4, @NotNull List<Float> list5, @NotNull List<XLabel> list6, int i5, @Nullable Integer num2, @Nullable Float f, @Nullable Float f2) {
        this.points = list;
        this.lineColor = i;
        this.gradientStartColor = i2;
        this.gradientEndColor = i3;
        this.lineStyle = i4;
        this.lineVerticalGradientStartColor = list2;
        this.keepMinimumHeight = z;
        this.subIndex = list3;
        this.subLineColor = num;
        this.subLineShaderColors = list4;
        this.goalLines = list5;
        this.xLabels = list6;
        this.verticalLineCount = i5;
        this.verticalLineHeight = num2;
        this.maxValue = f;
        this.minValue = f2;
    }

    @NotNull
    public final List<CurveChartPoint> component1() {
        return this.points;
    }

    @Nullable
    public final List<Integer> component10() {
        return this.subLineShaderColors;
    }

    @NotNull
    public final List<Float> component11() {
        return this.goalLines;
    }

    @NotNull
    public final List<XLabel> component12() {
        return this.xLabels;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getVerticalLineCount() {
        return this.verticalLineCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getVerticalLineHeight() {
        return this.verticalLineHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Float getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Float getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLineColor() {
        return this.lineColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGradientStartColor() {
        return this.gradientStartColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGradientEndColor() {
        return this.gradientEndColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLineStyle() {
        return this.lineStyle;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.lineVerticalGradientStartColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getKeepMinimumHeight() {
        return this.keepMinimumHeight;
    }

    @NotNull
    public final List<RangeIndex> component8() {
        return this.subIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getSubLineColor() {
        return this.subLineColor;
    }

    @NotNull
    public final CurveGraphParam copy(@NotNull List<CurveChartPoint> points, int lineColor, int gradientStartColor, int gradientEndColor, int lineStyle, @Nullable List<Integer> lineVerticalGradientStartColor, boolean keepMinimumHeight, @NotNull List<? extends RangeIndex> subIndex, @Nullable Integer subLineColor, @Nullable List<Integer> subLineShaderColors, @NotNull List<Float> goalLines, @NotNull List<XLabel> xLabels, int verticalLineCount, @Nullable Integer verticalLineHeight, @Nullable Float maxValue, @Nullable Float minValue) {
        return new CurveGraphParam(points, lineColor, gradientStartColor, gradientEndColor, lineStyle, lineVerticalGradientStartColor, keepMinimumHeight, subIndex, subLineColor, subLineShaderColors, goalLines, xLabels, verticalLineCount, verticalLineHeight, maxValue, minValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurveGraphParam)) {
            return false;
        }
        CurveGraphParam curveGraphParam = (CurveGraphParam) other;
        return Intrinsics.areEqual(this.points, curveGraphParam.points) && this.lineColor == curveGraphParam.lineColor && this.gradientStartColor == curveGraphParam.gradientStartColor && this.gradientEndColor == curveGraphParam.gradientEndColor && this.lineStyle == curveGraphParam.lineStyle && Intrinsics.areEqual(this.lineVerticalGradientStartColor, curveGraphParam.lineVerticalGradientStartColor) && this.keepMinimumHeight == curveGraphParam.keepMinimumHeight && Intrinsics.areEqual(this.subIndex, curveGraphParam.subIndex) && Intrinsics.areEqual(this.subLineColor, curveGraphParam.subLineColor) && Intrinsics.areEqual(this.subLineShaderColors, curveGraphParam.subLineShaderColors) && Intrinsics.areEqual(this.goalLines, curveGraphParam.goalLines) && Intrinsics.areEqual(this.xLabels, curveGraphParam.xLabels) && this.verticalLineCount == curveGraphParam.verticalLineCount && Intrinsics.areEqual(this.verticalLineHeight, curveGraphParam.verticalLineHeight) && Intrinsics.areEqual((Object) this.maxValue, (Object) curveGraphParam.maxValue) && Intrinsics.areEqual((Object) this.minValue, (Object) curveGraphParam.minValue);
    }

    @NotNull
    public final List<Float> getGoalLines() {
        return this.goalLines;
    }

    public final int getGradientEndColor() {
        return this.gradientEndColor;
    }

    public final int getGradientStartColor() {
        return this.gradientStartColor;
    }

    public final boolean getKeepMinimumHeight() {
        return this.keepMinimumHeight;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final int getLineStyle() {
        return this.lineStyle;
    }

    @Nullable
    public final List<Integer> getLineVerticalGradientStartColor() {
        return this.lineVerticalGradientStartColor;
    }

    @Nullable
    public final Float getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final Float getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final List<CurveChartPoint> getPoints() {
        return this.points;
    }

    @NotNull
    public final List<RangeIndex> getSubIndex() {
        return this.subIndex;
    }

    @Nullable
    public final Integer getSubLineColor() {
        return this.subLineColor;
    }

    @Nullable
    public final List<Integer> getSubLineShaderColors() {
        return this.subLineShaderColors;
    }

    public final int getVerticalLineCount() {
        return this.verticalLineCount;
    }

    @Nullable
    public final Integer getVerticalLineHeight() {
        return this.verticalLineHeight;
    }

    @NotNull
    public final List<XLabel> getXLabels() {
        return this.xLabels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.points.hashCode() * 31) + this.lineColor) * 31) + this.gradientStartColor) * 31) + this.gradientEndColor) * 31) + this.lineStyle) * 31;
        List<Integer> list = this.lineVerticalGradientStartColor;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.keepMinimumHeight;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r1) * 31) + this.subIndex.hashCode()) * 31;
        Integer num = this.subLineColor;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.subLineShaderColors;
        int iHashCode5 = (((((((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.goalLines.hashCode()) * 31) + this.xLabels.hashCode()) * 31) + this.verticalLineCount) * 31;
        Integer num2 = this.verticalLineHeight;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.maxValue;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.minValue;
        return iHashCode7 + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurveGraphParam(points=" + this.points + ", lineColor=" + this.lineColor + ", gradientStartColor=" + this.gradientStartColor + ", gradientEndColor=" + this.gradientEndColor + ", lineStyle=" + this.lineStyle + ", lineVerticalGradientStartColor=" + this.lineVerticalGradientStartColor + ", keepMinimumHeight=" + this.keepMinimumHeight + ", subIndex=" + this.subIndex + ", subLineColor=" + this.subLineColor + ", subLineShaderColors=" + this.subLineShaderColors + ", goalLines=" + this.goalLines + ", xLabels=" + this.xLabels + ", verticalLineCount=" + this.verticalLineCount + ", verticalLineHeight=" + this.verticalLineHeight + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ")";
    }

    public /* synthetic */ CurveGraphParam(List list, int i, int i2, int i3, int i4, List list2, boolean z, List list3, Integer num, List list4, List list5, List list6, int i5, Integer num2, Float f, Float f2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, i3, (i6 & 16) != 0 ? 4 : i4, (i6 & 32) != 0 ? null : list2, (i6 & 64) != 0 ? true : z, (i6 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? null : list4, (i6 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i6 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i6 & 4096) != 0 ? 0 : i5, (i6 & 8192) != 0 ? null : num2, (i6 & 16384) != 0 ? null : f, (i6 & 32768) != 0 ? null : f2);
    }
}
