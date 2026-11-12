package com.huami.chart;

import android.content.Context;
import android.view.ViewGroup;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.Data;
import com.huami.chart.data.StaticChartConfig;
import com.huami.chart.data.XYAxisData;
import com.huami.chart.helper.DataConfig;
import com.huami.chart.helper.UnifiedChart;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÈ\u0001\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000428\b\u0006\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u000628\b\u0006\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00062.\b\b\u0010\u0013\u001a(\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\u0012H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "chartContainerViewGroup", "Lcom/huami/chart/data/StaticChartConfig;", "chartConfig", "Lkotlin/Function2;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "Lcom/huami/chart/chart/ChartProvider;", "provider", "", "onDown", "onUp", "Lcom/huami/chart/provider/RenderConfig$Builder;", "Lcom/huami/chart/helper/UnifiedChart;", "Lkotlin/ExtensionFunctionType;", "renderConfig", "initStaticHMChart", "chart_release"}, k = 2, mv = {1, 5, 1})
public final class ChartKt {
    @JvmOverloads
    @NotNull
    public static final ChartProvider initStaticHMChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull StaticChartConfig staticChartConfig, @NotNull Function2<? super Index, ? super ChartProvider, Unit> function2, @NotNull Function2<? super Index, ? super ChartProvider, Unit> function3, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function4) {
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context, viewGroup, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, function4);
        ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ChartKt$initStaticHMChart$3$1(function2, chartProvider, function3));
        return chartProvider;
    }

    public static /* synthetic */ ChartProvider initStaticHMChart$default(Context context, ViewGroup viewGroup, StaticChartConfig staticChartConfig, Function2 function2, Function2 function3, Function2 function4, int i, Object obj) {
        Function2 function5 = (i & 8) != 0 ? new Function2<Index, ChartProvider, Unit>() { // from class: com.huami.chart.ChartKt.initStaticHMChart.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Index index, ChartProvider chartProvider) {
                invoke2(index, chartProvider);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Index index, @NotNull ChartProvider chartProvider) {
            }
        } : function2;
        Function2 function6 = (i & 16) != 0 ? new Function2<Index, ChartProvider, Unit>() { // from class: com.huami.chart.ChartKt.initStaticHMChart.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Index index, ChartProvider chartProvider) {
                invoke2(index, chartProvider);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Index index, @NotNull ChartProvider chartProvider) {
            }
        } : function3;
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context, viewGroup, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, function4);
        ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ChartKt$initStaticHMChart$3$1(function5, chartProvider, function6));
        return chartProvider;
    }

    @JvmOverloads
    @NotNull
    public static final ChartProvider initStaticHMChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull StaticChartConfig staticChartConfig, @NotNull final Function2<? super Index, ? super ChartProvider, Unit> function2, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function3) {
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context, viewGroup, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, function3);
        final ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.chart.ChartKt$initStaticHMChart$$inlined$initStaticHMChart$default$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
                function2.invoke(i, chartProvider);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i) {
            }
        });
        return chartProvider;
    }

    @JvmOverloads
    @NotNull
    public static final ChartProvider initStaticHMChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull StaticChartConfig staticChartConfig, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function2) {
        Data chartData = staticChartConfig.getChartData();
        XYAxisData xyAxisData = staticChartConfig.getXyAxisData();
        DataConfig dataConfig = staticChartConfig.getDataConfig();
        Index defaultIndex = staticChartConfig.getDefaultIndex();
        boolean z = chartData.getMainDataList().getCount() > 0;
        UnifiedChart unifiedChart = new UnifiedChart(context, viewGroup, xyAxisData.getXAxisDatas(), xyAxisData.getYAxisDatas(), chartData.getMainDataList(), chartData.getMultiList(), dataConfig, defaultIndex, function2);
        final ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createAutoAdjustChart(unifiedChart, z, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.chart.ChartKt$initStaticHMChart$$inlined$initStaticHMChart$default$2
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i) {
            }
        });
        return chartProvider;
    }
}
