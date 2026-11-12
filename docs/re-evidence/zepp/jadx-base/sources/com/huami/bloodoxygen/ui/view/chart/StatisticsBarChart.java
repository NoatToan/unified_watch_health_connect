package com.huami.bloodoxygen.ui.view.chart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huami.bloodoxygen.ui.utils.ChartStyleProvider;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.bloodoxygen.ui.vo.ChartParams;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.BarStyle;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import defpackage.nc4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJc\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022S\u0010\u000e\u001aO\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004j\u0002`\rJk\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022S\u0010\u000e\u001aO\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004j\u0002`\rR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodoxygen/ui/view/chart/StatisticsBarChart;", "Landroid/widget/FrameLayout;", "Lcom/huami/bloodoxygen/ui/vo/ChartParams;", "params", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "index", "", "min", "max", "", "Lcom/huami/bloodoxygen/ui/view/chart/OnTouchBarDownValue;", "onTouchBarDownValue", "refresh", "Lcom/huami/chart/util/Index;", "onTouchDownIndex", "Lcom/huami/chart/chart/ChartProvider;", "a", "Lkotlin/Lazy;", "getChartProvider", "()Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class StatisticsBarChart extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/ChartProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartProvider> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartProvider invoke() {
            return new ChartProvider(this.a);
        }
    }

    @JvmOverloads
    public StatisticsBarChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public StatisticsBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StatisticsBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final ChartProvider getChartProvider() {
        return (ChartProvider) this.chartProvider.getValue();
    }

    public final void onTouchDownIndex(@NotNull Index index, @NotNull ChartParams params, @NotNull Function3<? super Integer, ? super Float, ? super Float, Unit> onTouchBarDownValue) {
        int index2 = index.getPosiIndex().getIndex();
        ChartData dataByPositionIndex = params.getChartDataList().getDataByPositionIndex(index2);
        if (dataByPositionIndex == null) {
            onTouchBarDownValue.invoke(Integer.valueOf(index2), null, null);
        } else {
            onTouchBarDownValue.invoke(Integer.valueOf(index2), Float.valueOf(((ColorSegmentBar) ArraysKt.first(dataByPositionIndex.getColorSegmentBars())).getStart()), Float.valueOf(((ColorSegmentBar) ArraysKt.last(dataByPositionIndex.getColorSegmentBars())).getEnd()));
        }
    }

    public final void refresh(@NotNull final ChartParams params, @NotNull final Function3<? super Integer, ? super Float, ? super Float, Unit> onTouchBarDownValue) {
        final boolean z = params.getChartDataList().getCount() > 0;
        final float chartWidth = ChartStyleProvider.INSTANCE.getChartWidth(getContext()) - 50.0f;
        final int iKeyAt = params.getXAxisData().keyAt(0);
        final int iKeyAt2 = params.getXAxisData().keyAt(params.getXAxisData().size() - 1);
        final float value = params.getYAxisData().get(0).getValue();
        final float value2 = params.getYAxisData().get(params.getYAxisData().size() - 1).getValue();
        final boolean z2 = z;
        getChartProvider().createAutoAdjustChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.bloodoxygen.ui.view.chart.StatisticsBarChart.refresh.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getChartContainerViewGroup() {
                return StatisticsBarChart.this;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getDataList() {
                ChartDataList chartDataList = params.getChartDataList();
                int i = iKeyAt;
                int i2 = iKeyAt2;
                float f = value;
                float f2 = value2;
                chartDataList.setStart(i);
                chartDataList.setEnd(i2);
                chartDataList.setMinValue(f);
                chartDataList.setMaxValue(f2);
                return chartDataList;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                if (getDataList().getCount() <= 0) {
                    return super.getCurrentIndex();
                }
                Index index = new Index(getDataList().getCount() - 1, getDataList().getLastData().getBaseIndex());
                StatisticsBarChart.this.onTouchDownIndex(index, params, onTouchBarDownValue);
                return index;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return ChartStyleProvider.INSTANCE.createDrawConfig(StatisticsBarChart.this.getContext());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                float fDp2Px = ExtensionsKt.dp2Px(2);
                RenderConfig.Builder builder = new RenderConfig.Builder();
                ChartStyleProvider chartStyleProvider = ChartStyleProvider.INSTANCE;
                return builder.setInteractiveLineStyle(chartStyleProvider.createInteractiveLineStyle(StatisticsBarChart.this.getContext())).setAxisStyle(chartStyleProvider.createAxisStyle(StatisticsBarChart.this.getContext(), z2, chartWidth, params.getXAxisData(), params.getYAxisData())).setNoDataStyle(chartStyleProvider.createNoDataStyle(StatisticsBarChart.this.getContext())).setBarStyle(new BarStyle.Builder(StatisticsBarChart.this.getContext()).setBarStyle(8).setSupportRadian(true).setRadianValues(new float[]{fDp2Px, fDp2Px, fDp2Px, fDp2Px, fDp2Px, fDp2Px, fDp2Px, fDp2Px}).setMinDiff(0.0f).create()).create();
            }
        }, true, false);
        getChartProvider().getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.bloodoxygen.ui.view.chart.StatisticsBarChart.refresh.2
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                if (z) {
                    this.onTouchDownIndex(index, params, onTouchBarDownValue);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index i) {
            }
        });
    }

    @JvmOverloads
    public StatisticsBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.chartProvider = LazyKt__LazyJVMKt.lazy(new a(context));
    }
}
