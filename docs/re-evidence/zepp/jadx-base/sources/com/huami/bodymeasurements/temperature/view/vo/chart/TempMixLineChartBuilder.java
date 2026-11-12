package com.huami.bodymeasurements.temperature.view.vo.chart;

import android.util.SparseArray;
import com.huami.bodymeasurements.common.chart.ChartBuilderKt;
import com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.TempConstantsKt;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0016\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u0005\u0012\u0016\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b\u0012 \u0010\u0013\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u0002j\u0002`\u0011¢\u0006\u0004\b?\u0010@R&\u0010\b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0002`\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0002j\u0002`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R0\u0010\u0013\u001a\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00100\u0002j\u0002`\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0(j\u0002`)8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020$8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0016\u00100\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001fR\u0016\u00102\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0016\u00104\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001fR0\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0016\u0010>\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u001f¨\u0006A"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "Lcom/huami/bodymeasurements/common/chart/LineAndPointChartBuilder;", "Lkotlin/Function0;", "", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "Lcom/huami/bodymeasurements/common/chart/PointsGetter;", "a", "Lkotlin/jvm/functions/Function0;", "pointsGetter", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Lcom/huami/bodymeasurements/common/chart/XAxisDataGetter;", "b", "xAxisDataGetter", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lcom/huami/bodymeasurements/common/chart/SubPointIndexListGetter;", "c", "subPointIndexListGetter", "value", "getPoints", "()Ljava/util/List;", "setPoints", "(Ljava/util/List;)V", "points", "", "getShadowColor", "()[I", "shadowColor", "getLineColor", "()I", "lineColor", "getSubPointIndexList", "()Ljava/util/ArrayList;", "subPointIndexList", "", "getSubPointRadius", "()F", "subPointRadius", "Lkotlin/Function1;", "Lcom/huami/bodymeasurements/common/chart/SubPointColorGetter;", "getSubPointColorGetter", "()Lkotlin/jvm/functions/Function1;", "subPointColorGetter", "getDividerValue", "dividerValue", "getAboveDividerLineColor", "aboveDividerLineColor", "getBelowDividerLineColor", "belowDividerLineColor", "getDisConnectLineGap", "disConnectLineGap", "getXAxisData", "()Landroid/util/SparseArray;", "setXAxisData", "(Landroid/util/SparseArray;)V", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "getYAxisData", "yAxisData", "getNoDataStringRes", "noDataStringRes", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempMixLineChartBuilder implements LineAndPointChartBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<List<ChartDataVo>> pointsGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<SparseArray<XAxisData>> xAxisDataGetter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<ArrayList<Integer>> subPointIndexListGetter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Float, Integer> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final int a(float f) {
            return TempMixLineChartBuilderKt.a(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Float f) {
            return Integer.valueOf(a(f.floatValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TempMixLineChartBuilder(@NotNull Function0<? extends List<ChartDataVo>> function0, @NotNull Function0<? extends SparseArray<XAxisData>> function1, @NotNull Function0<? extends ArrayList<Integer>> function2) {
        this.pointsGetter = function0;
        this.xAxisDataGetter = function1;
        this.subPointIndexListGetter = function2;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public int getAboveDividerLineColor() {
        return TempConstantsKt.getABNORMAL_COLOR();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public int getBelowDividerLineColor() {
        return TempConstantsKt.getNORMAL_COLOR();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public int getDisConnectLineGap() {
        return 300000;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public float getDividerValue() {
        return 37.2f;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public int getLineColor() {
        return TempConstantsKt.getNORMAL_COLOR();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public int getNoDataStringRes() {
        return R.string.bm_temperature_no_data;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public List<ChartDataVo> getPoints() {
        return this.pointsGetter.invoke();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public int[] getShadowColor() {
        return new int[]{ChartBuilderKt.changeAlpha(TempConstantsKt.getNORMAL_COLOR(), 51), 0};
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public Function1<Float, Integer> getSubPointColorGetter() {
        return a.a;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public ArrayList<Integer> getSubPointIndexList() {
        return this.subPointIndexListGetter.invoke();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public float getSubPointRadius() {
        return 4.0f;
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public SparseArray<XAxisData> getXAxisData() {
        return this.xAxisDataGetter.invoke();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    @NotNull
    public SparseArray<YAxisData> getYAxisData() {
        return TempConstantsKt.getTempYAxisData();
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public void setPoints(@NotNull List<ChartDataVo> list) {
    }

    @Override // com.huami.bodymeasurements.common.chart.LineAndPointChartBuilder
    public void setXAxisData(@NotNull SparseArray<XAxisData> sparseArray) {
    }
}
