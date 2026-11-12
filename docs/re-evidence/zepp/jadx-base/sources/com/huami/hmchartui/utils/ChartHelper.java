package com.huami.hmchartui.utils;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.hmchartui.R;
import com.huami.hmchartui.model.BarChartData;
import com.huami.hmchartui.model.ChartConfig;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002Ji\u0010 \u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013j\u0002`\u00192\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001c2\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001eJi\u0010 \u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112%\u0010\u001a\u001a!\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0013j\u0002`\u00192\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001c2\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00180\u001bj\u0002`\u001eR\u0019\u0010%\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010'\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010)\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b(\u0010$R\"\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010-R\u0019\u00101\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\"\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$\"\u0004\b4\u0010-R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$\"\u0004\b8\u0010-R\u0019\u0010<\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010$R\u0019\u0010?\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010$R\u0019\u0010B\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$R\u0019\u0010E\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u0019\u0010H\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010$R\u0019\u0010K\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010\"\u001a\u0004\bJ\u0010$¨\u0006P"}, d2 = {"Lcom/huami/hmchartui/utils/ChartHelper;", "", "", "text", "", "textSize", "c", "Landroid/view/ViewGroup;", "chartParent", "", "size", "Lcom/huami/chart/provider/DrawConfig;", "b", "a", "chartContainer", "Lcom/huami/hmchartui/model/BarChartData;", "data", "Lcom/huami/hmchartui/model/ChartConfig;", "config", "Lkotlin/Function1;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "", "Lcom/huami/hmchartui/utils/OnTouchBarDownValue;", "onTouchBarDownValue", "Lkotlin/Function0;", "Lcom/huami/hmchartui/utils/OnTouchBarUpValue;", "onTouchBarUpValue", "Lcom/huami/hmchartui/utils/OnTouchEmptyArea;", "onTouchEmptyArea", "refreshBarChart", "Lcom/huami/chart/data/ChartDataList;", "F", "getLabelSize11", "()F", "labelSize11", "getLabelSize12", "labelSize12", "getXMarginStart", "xMarginStart", GoogleApiAvailabilityLight.a, "getXMarginEnd", "setXMarginEnd", "(F)V", "xMarginEnd", "e", "getXLabelMarginTop", "xLabelMarginTop", "f", "getDataMarginStart", "setDataMarginStart", "dataMarginStart", "g", "getDataMarginEnd", "setDataMarginEnd", "dataMarginEnd", "h", "getDataMarginTop", "dataMarginTop", "i", "getDataMarginBottom", "dataMarginBottom", z.j, "getBarWidthDay", "barWidthDay", hl.k, "getBarWidthYear", "barWidthYear", "l", "getBarWidthWeek", "barWidthWeek", "m", "getRadianValue", "radianValue", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float labelSize11;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float labelSize12;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float xMarginStart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float xMarginEnd;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float xLabelMarginTop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float dataMarginStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dataMarginEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float dataMarginTop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float dataMarginBottom;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float barWidthDay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float barWidthYear;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float barWidthWeek;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float radianValue;

    public ChartHelper(@NotNull Context context) {
        this.labelSize11 = ChartUtil.sp2px(context, 11.0f);
        this.labelSize12 = ChartUtil.sp2px(context, 12.0f);
        float fSp2px = ChartUtil.sp2px(context, 15.0f);
        this.xMarginStart = fSp2px;
        this.xLabelMarginTop = ChartUtil.sp2px(context, 5.0f);
        this.dataMarginStart = fSp2px;
        this.dataMarginTop = ChartUtil.dp2px(context, 15.0f);
        this.dataMarginBottom = ChartUtil.dp2px(context, 20.0f);
        this.barWidthDay = ChartUtil.dp2px(context, 6.0f);
        this.barWidthYear = ChartUtil.dp2px(context, 15.0f);
        this.barWidthWeek = ChartUtil.dp2px(context, 25.0f);
        this.radianValue = ChartUtil.dp2px(context, 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig a(ViewGroup chartParent) {
        Context context = chartParent.getContext();
        int width = chartParent.getWidth();
        int height = chartParent.getHeight();
        if (width == 0) {
            width = context.getResources().getDisplayMetrics().widthPixels;
        }
        return new DrawConfig.Builder(context).setCanvasHeight(height).setCanvasWidth(width).setDataMarginTop(this.dataMarginTop).setDataMarginLeft(this.dataMarginStart).setDataMarginRight(this.dataMarginStart).setDataWidth(0.0f).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig b(ViewGroup chartParent, int size) {
        float f;
        Context context = chartParent.getContext();
        int width = chartParent.getWidth();
        int height = chartParent.getHeight();
        if (width == 0) {
            width = context.getResources().getDisplayMetrics().widthPixels;
        }
        if (size == 7) {
            f = this.barWidthWeek;
        } else if (size != 12) {
            f = size != 24 ? this.barWidthDay : this.barWidthDay;
        } else {
            f = this.barWidthYear;
        }
        return new DrawConfig.Builder(context).setCanvasHeight(height).setCanvasWidth(width).setDataMarginTop(this.dataMarginTop).setDataMarginLeft(this.dataMarginStart).setDataMarginRight(this.dataMarginEnd).setDataMarginBottom(this.dataMarginBottom).setDataWidth(f).create();
    }

    private final float c(String text, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    public final float getBarWidthDay() {
        return this.barWidthDay;
    }

    public final float getBarWidthWeek() {
        return this.barWidthWeek;
    }

    public final float getBarWidthYear() {
        return this.barWidthYear;
    }

    public final float getDataMarginBottom() {
        return this.dataMarginBottom;
    }

    public final float getDataMarginEnd() {
        return this.dataMarginEnd;
    }

    public final float getDataMarginStart() {
        return this.dataMarginStart;
    }

    public final float getDataMarginTop() {
        return this.dataMarginTop;
    }

    public final float getLabelSize11() {
        return this.labelSize11;
    }

    public final float getLabelSize12() {
        return this.labelSize12;
    }

    public final float getRadianValue() {
        return this.radianValue;
    }

    public final float getXLabelMarginTop() {
        return this.xLabelMarginTop;
    }

    public final float getXMarginEnd() {
        return this.xMarginEnd;
    }

    public final float getXMarginStart() {
        return this.xMarginStart;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:4:0x0013  */
    public final void refreshBarChart(@NotNull final ViewGroup chartContainer, @NotNull final BarChartData data, @NotNull final ChartConfig config, @NotNull final Function1<? super Index, Unit> onTouchBarDownValue, @NotNull final Function0<Unit> onTouchBarUpValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        float value;
        boolean z;
        final Context context = chartContainer.getContext();
        int barMaxSize = data.getBarMaxSize() - 1;
        SparseArray<YAxisData> yData = data.getYData();
        float value2 = 0.0f;
        if (yData != null) {
            if (yData.size() != 0) {
                value2 = yData.get(yData.keyAt(0)).getValue();
                value = yData.get(yData.keyAt(yData.size() - 1)).getValue();
            } else {
                value = 0.0f;
            }
        } else {
            value = 0.0f;
        }
        final ChartDataList chartDataList = new ChartDataList(data.getChartData());
        chartDataList.setStart(0);
        chartDataList.setEnd(barMaxSize);
        chartDataList.setMinValue(value2);
        chartDataList.setMaxValue(value);
        float fC = c(String.valueOf(value), this.labelSize11) + ChartUtil.dp2px(context, 10.0f);
        this.xMarginEnd = fC;
        this.dataMarginEnd = fC;
        SparseArray<XAxisData> xData = data.getXData();
        if (xData != null) {
            if (!(xData.size() == 0)) {
                XAxisData xAxisData = xData.get(xData.keyAt(0));
                XAxisData xAxisData2 = xData.get(xData.keyAt(xData.size() - 1));
                float f = 2;
                setDataMarginStart(getDataMarginStart() + (c(xAxisData.getTitle(), getLabelSize12()) / f));
                setDataMarginEnd(getDataMarginEnd() + (c(xAxisData2.getTitle(), getLabelSize12()) / f));
            }
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 166;
        SparseArray<ChartData> chartData = data.getChartData();
        if (chartData != null) {
            if (chartData.size() != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            intRef.element |= 16384;
        }
        final float fDp2px = ChartUtil.dp2px(context, 1.0f);
        ChartProvider chartProvider = new ChartProvider(context, true);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.hmchartui.utils.ChartHelper.refreshBarChart.3
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getA() {
                return chartContainer;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getE() {
                return chartDataList;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return this.b(chartContainer, data.getBarMaxSize());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder noDataStyle = new RenderConfig.Builder().setAxisStyle(new AxisStyle.Builder(context).setAxisStyle(intRef.element).setXLabelColor(config.getLabelColor()).setXAxisLineColor(0).setXLabelSize(this.getLabelSize12()).setXAxisData(data.getXData()).setZeroX(chartContainer.getWidth() - this.getLabelSize11()).setZeroY(this.getDataMarginBottom()).setYAxisRight(true).setYLabelColor(config.getLabelColor()).setYAxisLineColor(0).setYLabelSize(this.getLabelSize11()).setYAxisScaleLineColor(ContextCompat.getColor(context, R.color.s4)).setYAxisScaleLineWidth(ChartUtil.dp2px(context, 0.5f)).setXLabelMarginTop(this.getXLabelMarginTop()).setXAxisMarginLeft(this.getXMarginStart()).setXAxisMarginRight(this.getXMarginEnd()).setYAxisData(data.getYData()).create()).setNoDataStyle(new NoDataStyle.Builder(context).setNoDataStyle(2).setNoDataLabel(config.getEmptyText()).setNoDataLabelColor(config.getEmptyTextColor()).setNoDataLabelSize(this.getLabelSize12()).create());
                BarStyle.Builder radianValues = new BarStyle.Builder(context).setBarStyle(2).setHighlightContrast(128).setSupportRadian(config.getIsSupportRadian()).setInteractiveUpCancel(true).setInteractiveType(2).setInteractiveLineWidth(fDp2px).setInteractiveLineColor(ContextCompat.getColor(context, R.color.s3)).setInteractiveSlide(true).setFingerUpHighlightCancel(true).setRadianValues(new float[]{this.getRadianValue(), this.getRadianValue(), this.getRadianValue(), this.getRadianValue(), 0.0f, 0.0f, 0.0f, 0.0f});
                ChartConfig chartConfig = config;
                if (chartConfig.getBarGradientColors() != null) {
                    radianValues.setBarGradientColors(chartConfig.getBarGradientColors());
                } else {
                    radianValues.setBarColors(new HMColor[]{new HMColor(chartConfig.getBarColor())});
                }
                Unit unit = Unit.INSTANCE;
                return noDataStyle.setBarStyle(radianValues.create()).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.hmchartui.utils.ChartHelper.refreshBarChart.4
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                if (index.getDataIndex() == -1) {
                    onTouchEmptyArea.invoke();
                } else {
                    onTouchBarDownValue.invoke(index);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index index) {
                onTouchBarUpValue.invoke();
            }
        });
    }

    public final void setDataMarginEnd(float f) {
        this.dataMarginEnd = f;
    }

    public final void setDataMarginStart(float f) {
        this.dataMarginStart = f;
    }

    public final void setXMarginEnd(float f) {
        this.xMarginEnd = f;
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartContainer, @NotNull final ChartDataList data, @NotNull final ChartConfig config, @NotNull final Function1<? super Index, Unit> onTouchBarDownValue, @NotNull final Function0<Unit> onTouchBarUpValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        final float fDp2px = ChartUtil.dp2px(chartContainer.getContext(), 1.0f);
        final ChartProvider chartProvider = new ChartProvider(chartContainer.getContext());
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.hmchartui.utils.ChartHelper.refreshBarChart.5
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getA() {
                return chartContainer;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getE() {
                return data;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return this.a(chartContainer);
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setNoDataStyle(new NoDataStyle.Builder(chartContainer.getContext()).setNoDataStyle(2).setNoDataLabel(config.getEmptyText()).setNoDataLabelColor(config.getEmptyTextColor()).setNoDataLabelSize(this.getLabelSize12()).create()).setBarStyle(new BarStyle.Builder(chartContainer.getContext()).setBarStyle(2).setHighlightContrast(128).setInteractiveUpCancel(false).setInteractiveType(2).setInteractiveSlide(true).setInteractiveLineWidth(fDp2px).create()).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.hmchartui.utils.ChartHelper.refreshBarChart.6
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                if (index.getDataIndex() == -1) {
                    onTouchEmptyArea.invoke();
                } else {
                    onTouchBarDownValue.invoke(index);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index index) {
                chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                onTouchBarUpValue.invoke();
            }
        });
    }
}
