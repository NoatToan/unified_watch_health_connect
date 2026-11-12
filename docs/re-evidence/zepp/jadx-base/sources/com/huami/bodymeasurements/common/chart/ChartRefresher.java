package com.huami.bodymeasurements.common.chart;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.huami.bodymeasurements.common.chart.ChartRefresher;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import defpackage.nc4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 JF\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\rJ}\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00102S\u0010\u0019\u001aO\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0011j\u0002`\u00182\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\rR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/bodymeasurements/common/chart/ChartRefresher;", "", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/bodymeasurements/common/chart/LineAndPointChartBuilder;", "builder", "Lkotlin/Function2;", "Lcom/huami/chart/util/Index;", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "", "Lcom/huami/bodymeasurements/common/chart/OnTouchPointDownValue;", "onTouchPointDownValue", "Lkotlin/Function0;", "Lcom/huami/bodymeasurements/common/chart/OnTouchEmptyArea;", "onTouchEmptyArea", "refreshMixLineChart", "Lcom/huami/bodymeasurements/common/chart/BarChartBuilder;", "Lkotlin/Function4;", "Lkotlin/Pair;", "", "", "Lkotlin/ParameterName;", "name", "timeStamp", "Lcom/huami/bodymeasurements/common/chart/OnTouchBarDownValue;", "onTouchBarDownValue", "refreshBarChart", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class ChartRefresher {

    @NotNull
    public static final ChartRefresher INSTANCE = new ChartRefresher();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ChartHelper";

    private ChartRefresher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(LineAndPointChartBuilder lineAndPointChartBuilder, float f, BaseIndex baseIndex) {
        return new HMColor(lineAndPointChartBuilder.getSubPointColorGetter().invoke(Float.valueOf(f)).intValue());
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final BarChartBuilder builder, @NotNull final Function4<? super Index, ? super Pair<Float, Float>, ? super Pair<Float, Float>, ? super Long, Unit> onTouchBarDownValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        final int iIntValue;
        final Context context = chartParent.getContext();
        SparseArray sparseArray = new SparseArray();
        Iterator<T> it2 = builder.getPoints().iterator();
        while (true) {
            final int iIntValue2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            BarChartVo barChartVo = (BarChartVo) it2.next();
            ArrayList arrayList = new ArrayList();
            Pair<Float, Float> highValue = barChartVo.getHighValue();
            if (highValue == null) {
                highValue = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            float fFloatValue = highValue.getFirst().floatValue();
            float fFloatValue2 = highValue.getSecond().floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
            arrayList.add(Float.valueOf(fFloatValue2));
            Pair<Float, Float> highOffset = barChartVo.getHighOffset();
            Function1<Float, Integer> barDataColorGetter = builder.getBarDataColorGetter();
            Integer numInvoke = barDataColorGetter == null ? null : barDataColorGetter.invoke(Float.valueOf(Math.max(fFloatValue + highOffset.getFirst().floatValue(), fFloatValue2 - highOffset.getSecond().floatValue())));
            Pair<Float, Float> lowValue = barChartVo.getLowValue();
            if (lowValue == null) {
                lowValue = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            float fFloatValue3 = lowValue.getFirst().floatValue();
            float fFloatValue4 = lowValue.getSecond().floatValue();
            arrayList.add(Float.valueOf(fFloatValue3));
            arrayList.add(Float.valueOf(fFloatValue4));
            Pair<Float, Float> lowOffset = barChartVo.getLowOffset();
            Function1<Float, Integer> barDataColorGetter2 = builder.getBarDataColorGetter();
            Integer numInvoke2 = barDataColorGetter2 != null ? barDataColorGetter2.invoke(Float.valueOf(Math.min(fFloatValue3 + lowOffset.getFirst().floatValue(), fFloatValue4 - lowOffset.getSecond().floatValue()))) : null;
            float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(arrayList);
            int index = barChartVo.getIndex();
            ChartData chartData = new ChartData(barChartVo.getIndex(), floatArray);
            if (builder.getBarDataColorGetter() != null) {
                if (numInvoke2 == null) {
                    iIntValue = numInvoke == null ? 0 : numInvoke.intValue();
                } else {
                    iIntValue = numInvoke2.intValue();
                }
                if (numInvoke != null) {
                    iIntValue2 = numInvoke.intValue();
                } else if (numInvoke2 != null) {
                    iIntValue2 = numInvoke2.intValue();
                }
                chartData.addExtends(new IDataExtendListener() { // from class: xn0
                    @Override // com.huami.chart.listener.IDataExtendListener
                    public final Object get(BaseIndex baseIndex) {
                        return ChartRefresher.c(iIntValue, iIntValue2, baseIndex);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            sparseArray.put(index, chartData);
        }
        int iKeyAt = builder.getXAxisData().keyAt(0);
        int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        float value = builder.getYAxisData().get(0).getValue();
        float value2 = builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue();
        final ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iKeyAt);
        chartDataList.setEnd(iKeyAt2);
        chartDataList.setMinValue(value);
        chartDataList.setMaxValue(value2);
        final boolean z = sparseArray.size() != 0;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 38;
        if (z) {
            intRef.element = 38 | (builder.getYScaleLongDash() ? 32896 : 16512);
        }
        Integer barMaxSize = builder.getBarMaxSize();
        Float fValueOf = barMaxSize != null ? Float.valueOf(chartParent.getWidth() / barMaxSize.intValue()) : null;
        final float fMin = Math.min((fValueOf == null ? ViewExKt.dpToPx(chartParent, 6.0f) : fValueOf.floatValue()) / 2.0f, ViewExKt.dpToPx(chartParent, 1.0f));
        ChartProvider chartProvider = new ChartProvider(context);
        final float chartWidth = ChartConfigHelper.INSTANCE.getChartWidth(chartParent) - 50.0f;
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.bodymeasurements.common.chart.ChartRefresher.refreshBarChart.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getD() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getF() {
                return chartDataList;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return ChartConfigHelper.INSTANCE.createDrawConfig(chartParent);
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder builder2 = new RenderConfig.Builder();
                ChartConfigHelper chartConfigHelper = ChartConfigHelper.INSTANCE;
                RenderConfig.Builder noDataStyle = builder2.setAxisStyle(chartConfigHelper.createAxisStyle(context, intRef.element, z, chartWidth, builder.getXAxisData(), builder.getYAxisData())).setNoDataStyle(chartConfigHelper.createNoDataStyle(context, builder.getNoDataStringRes()));
                BarStyle.Builder fingerUpHighlightCancel = new BarStyle.Builder(context).setBarStyle(4).setSupportRadian(builder.getRadian()).setInteractiveUpCancel(true).setInteractiveType(2).setInteractiveLineWidth(fMin).setDownSameCancel(true).setInteractiveSlide(true).setHighlightContrast(128).setFingerUpHighlightCancel(true);
                BarChartBuilder barChartBuilder = builder;
                if (barChartBuilder.getGradient()) {
                    fingerUpHighlightCancel.setBarGradientColors(barChartBuilder.getChartGradientColors());
                } else {
                    fingerUpHighlightCancel.setBarColors(barChartBuilder.getBarColors());
                }
                Unit unit2 = Unit.INSTANCE;
                return noDataStyle.setBarStyle(fingerUpHighlightCancel.create()).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.bodymeasurements.common.chart.ChartRefresher.refreshBarChart.2

            /* JADX INFO: renamed from: com.huami.bodymeasurements.common.chart.ChartRefresher$refreshBarChart$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Index a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Index index) {
                    super(0);
                    this.a = index;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("downIndex:", Integer.valueOf(this.a.getDataIndex()));
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index2) {
                HMLog.info(ChartRefresher.TAG, new a(index2));
                BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index2.getDataIndex());
                if (barChartVo2 != null) {
                    Function4<Index, Pair<Float, Float>, Pair<Float, Float>, Long, Unit> function4 = onTouchBarDownValue;
                    BarChartVo rawBarChartVo = ChartDataConverterKt.toRawBarChartVo(barChartVo2);
                    function4.invoke(index2, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), Long.valueOf(rawBarChartVo.getTimeStamp()));
                }
                if (barChartVo2 == null) {
                    onTouchEmptyArea.invoke();
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index2) {
                onTouchEmptyArea.invoke();
            }
        });
    }

    public final void refreshMixLineChart(@NotNull final ViewGroup chartParent, @NotNull final LineAndPointChartBuilder builder, @NotNull final Function2<? super Index, ? super ChartDataVo, Unit> onTouchPointDownValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        final Context context = chartParent.getContext();
        SparseArray sparseArray = new SparseArray();
        for (ChartDataVo chartDataVo : builder.getPoints()) {
            Float floatOrNull = k.toFloatOrNull(chartDataVo.getValue());
            if (floatOrNull != null) {
                final float fFloatValue = floatOrNull.floatValue();
                int index = chartDataVo.getIndex();
                ChartData chartData = new ChartData(chartDataVo.getIndex(), fFloatValue);
                chartData.addExtends(new IDataExtendListener() { // from class: yn0
                    @Override // com.huami.chart.listener.IDataExtendListener
                    public final Object get(BaseIndex baseIndex) {
                        return ChartRefresher.d(builder, fFloatValue, baseIndex);
                    }
                });
                Unit unit = Unit.INSTANCE;
                sparseArray.put(index, chartData);
            }
        }
        final ChartDataList chartDataList = new ChartDataList(sparseArray);
        final int iKeyAt = builder.getXAxisData().keyAt(0);
        final int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        final float value = builder.getYAxisData().get(0).getValue();
        final float value2 = builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue();
        final boolean z = sparseArray.size() != 0;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 38;
        if (z) {
            intRef.element = 38 | 16384 | 128;
        }
        ChartProvider chartProvider = new ChartProvider(context);
        final float chartWidth = ChartConfigHelper.INSTANCE.getChartWidth(chartParent) - 50.0f;
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.bodymeasurements.common.chart.ChartRefresher.refreshMixLineChart.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getD() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getF() {
                ChartDataList chartDataList2 = chartDataList;
                int i = iKeyAt;
                int i2 = iKeyAt2;
                float f = value;
                float f2 = value2;
                chartDataList2.setStart(i);
                chartDataList2.setEnd(i2);
                chartDataList2.setMinValue(f);
                chartDataList2.setMaxValue(f2);
                return chartDataList2;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return ChartConfigHelper.INSTANCE.createDrawConfig(chartParent);
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder lineStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(context).setLineColor(builder.getLineColor()).setLineStyle(4).setShadowColors(builder.getShadowColor()).setSubPoints(builder.getSubPointIndexList()).setSubPointRadius(ChartUtil.dp2px(context, builder.getSubPointRadius())).setInteractiveUpCancel(true).setDisconnectLineGap(builder.getDisConnectLineGap()).setInteractiveType(32).setDividerValue(builder.getDividerValue()).setAboveDividerLineColor(builder.getAboveDividerLineColor()).setBelowDividerLineColor(builder.getBelowDividerLineColor()).setInteractiveSlide(true).setHighlightLineWidth(ChartUtil.dp2px(context, 1.0f)).setHighlightLineColor(Color.parseColor(ChartConstantsKt.INTERACTIVE_LINE_COLOR)).create());
                ChartConfigHelper chartConfigHelper = ChartConfigHelper.INSTANCE;
                return lineStyle.setNoDataStyle(chartConfigHelper.createNoDataStyle(context, builder.getNoDataStringRes())).setAxisStyle(chartConfigHelper.createAxisStyle(context, intRef.element, z, chartWidth, builder.getXAxisData(), builder.getYAxisData())).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.bodymeasurements.common.chart.ChartRefresher.refreshMixLineChart.2
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index2) {
                ChartDataVo chartDataVo2 = (ChartDataVo) CollectionsKt.getOrNull(CollectionsKt___CollectionsKt.sortedWith(builder.getPoints(), new Comparator<T>() { // from class: com.huami.bodymeasurements.common.chart.ChartRefresher$refreshMixLineChart$2$onDown$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ChartDataVo) t).getIndex()), Integer.valueOf(((ChartDataVo) t2).getIndex()));
                    }
                }), index2.getDataIndex());
                if (chartDataVo2 == null) {
                    return;
                }
                onTouchPointDownValue.invoke(index2, chartDataVo2);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index2) {
                onTouchEmptyArea.invoke();
            }
        });
    }
}
