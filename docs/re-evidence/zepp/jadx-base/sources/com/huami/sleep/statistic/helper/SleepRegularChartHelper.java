package com.huami.sleep.statistic.helper;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002JF\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e2\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001c¨\u0006+"}, d2 = {"Lcom/huami/sleep/statistic/helper/SleepRegularChartHelper;", "", "", "text", "", "textSize", "a", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/sleep/statistic/helper/RegularChartBuilder;", "builder", "Lkotlin/Function2;", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "", "Lcom/huami/sleep/statistic/helper/OnRegularTouchSelectedValue;", "onTouchSelectedValue", "Lkotlin/Function0;", "Lcom/huami/sleep/statistic/helper/OnTouchBarUpValue;", "onTouchBarUpValue", "refreshBarChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Z", "mPointerShow", "c", "F", "labelSize12", GoogleApiAvailabilityLight.a, "labelSize11", "e", "xMarginStart", "f", "dataMarginStart", "g", "dataMarginRight", "h", "dataMarginBottom", "<init>", "(Landroid/content/Context;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepRegularChartHelper {

    @NotNull
    private static final String i = "SleepRegularChartHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean mPointerShow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float xMarginStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float dataMarginStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dataMarginRight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float labelSize12 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 12.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float labelSize11 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 11.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float dataMarginBottom = ChartUtil.sp2px(KoinExtKt.getAppContext(), 19.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ RegularChartBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RegularChartBuilder regularChartBuilder) {
            super(0);
            this.a = regularChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshBarChart...builder.points:" + this.a.getDataList() + ",xAxisData:" + this.a.getXAxisData();
        }
    }

    public SleepRegularChartHelper(@NotNull Context context) {
        this.context = context;
    }

    private final float a(String text, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final RegularChartBuilder builder, @NotNull final Function2<? super SleepRegularChartVo, ? super Float, Unit> onTouchSelectedValue, @NotNull final Function0<Unit> onTouchBarUpValue) {
        String title;
        HMLog.debug(i, new a(builder));
        int iKeyAt = builder.getXAxisData().keyAt(0);
        int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        float f = 60;
        float value = (builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(0).getValue() : 0.0f) - f;
        float value2 = (builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue() : 0.0f) + f;
        YAxisData yAxisData = builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1) : null;
        final SparseArray<YAxisData> sparseArrayClone = builder.getYAxisData().clone();
        if (value2 > 1500.0f && value <= 1380.0f) {
            float f2 = value2 - f;
            float f3 = value2 - value;
            float f4 = this.labelSize11;
            String str = "";
            if (yAxisData != null && (title = yAxisData.getTitle()) != null) {
                str = title;
            }
            sparseArrayClone.put(sparseArrayClone.size(), new YAxisData(f2 - ((f3 * ViewUtils.calcuTextHeight(f4, str)) / ViewUtils.dp2px(this.context, 99.0f)), "(+1)"));
        }
        SparseArray sparseArray = new SparseArray();
        for (SleepRegularChartVo sleepRegularChartVo : builder.getDataList()) {
            sparseArray.put(sleepRegularChartVo.getIndex(), new ChartData(sleepRegularChartVo.getIndex(), sleepRegularChartVo.getStartIndex() > 0 ? sleepRegularChartVo.getStartIndex() : value));
        }
        SparseArray sparseArray2 = new SparseArray();
        for (SleepRegularChartVo sleepRegularChartVo2 : builder.getDataList()) {
            sparseArray2.put(sleepRegularChartVo2.getIndex(), new ChartData(sleepRegularChartVo2.getIndex(), sleepRegularChartVo2.getEndIndex() > 0 ? sleepRegularChartVo2.getEndIndex() : value));
        }
        final ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iKeyAt);
        chartDataList.setEnd(iKeyAt2);
        chartDataList.setMinValue(value);
        chartDataList.setMaxValue(value2);
        final ChartDataList chartDataList2 = new ChartDataList(sparseArray2);
        chartDataList2.setStart(iKeyAt);
        chartDataList2.setEnd(iKeyAt2);
        chartDataList2.setMinValue(value);
        chartDataList2.setMaxValue(value2);
        if (builder.getYAxisData().size() != 0) {
            float fA = this.dataMarginStart + a(builder.getYAxisData().get(0).getTitle(), this.labelSize12);
            this.dataMarginStart = fA;
            this.xMarginStart = fA;
            if (builder.getXAxisData().size() != 0) {
                float f5 = 2;
                this.dataMarginStart += a(builder.getXAxisData().get(iKeyAt).getTitle(), this.labelSize12) / f5;
                this.dataMarginRight = a(builder.getXAxisData().get(iKeyAt2).getTitle(), this.labelSize12) / f5;
            }
        }
        final int i2 = 166;
        final ChartProvider chartProvider = new ChartProvider(this.context, true);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.statistic.helper.SleepRegularChartHelper.refreshBarChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getA() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getB() {
                return chartDataList;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                int width = chartParent.getWidth();
                int height = chartParent.getHeight();
                if (width == 0) {
                    width = SleepRegularChartHelper.this.context.getResources().getDisplayMetrics().widthPixels;
                }
                return new DrawConfig.Builder(SleepRegularChartHelper.this.context).setCanvasHeight(height).setCanvasWidth(width).setDataMarginTop(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 30.0f)).setDataMarginLeft(SleepRegularChartHelper.this.dataMarginStart).setDataMarginRight(SleepRegularChartHelper.this.dataMarginRight).setDataMarginBottom(SleepRegularChartHelper.this.dataMarginBottom).setDataWidth(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 8.0f)).create();
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getMultiChartDataList */
            public ChartDataList[] getMultiList() {
                return new ChartDataList[]{chartDataList2};
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder multiLineStyle = new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(SleepRegularChartHelper.this.context).setLineColor(builder.getLinColors()[1].intValue()).setLineStyle(4).setIntersectionPointColor(builder.getLinColors()[1].intValue()).setIntersectionPointBorderWidth(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 1.0f)).setIntersectionPointSize(10.0f).setInteractiveSlide(true).setHighlightLineColor(ContextCompat.getColor(SleepRegularChartHelper.this.context, R.color.s3)).setHighlightLineWidth(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 1.0f)).setInteractiveType(32).setShadowColors(new int[]{949510140, 9986044}).create()).setMultiLineStyle(new MultiLineStyle.Builder(SleepRegularChartHelper.this.context).setLineColors(new int[]{builder.getLinColors()[0].intValue()}).setLineStyle(4).setIntersectionPointColor(new int[]{builder.getLinColors()[0].intValue()}).setIntersectionPointBorderWidth(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 1.0f)).setIntersectionPointSize(10.0f).setShadowColors(new int[]{956283392, 16759296}).create());
                AxisStyle.Builder labelCenter = new AxisStyle.Builder(SleepRegularChartHelper.this.context).setAxisStyle(i2).setLabelCenter(true);
                Context context = SleepRegularChartHelper.this.context;
                int i3 = R.color.s2;
                return multiLineStyle.setAxisStyle(labelCenter.setXLabelColor(ContextCompat.getColor(context, i3)).setXAxisLineWidth(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 1.0f)).setXAxisLineColor(ContextCompat.getColor(SleepRegularChartHelper.this.context, R.color.s4)).setXLabelSize(ChartUtil.sp2px(SleepRegularChartHelper.this.context, 12.0f)).setXAxisData(builder.getXAxisData()).setZeroX(SleepRegularChartHelper.this.xMarginStart).setZeroY(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 20.0f)).setYLabelColor(ContextCompat.getColor(SleepRegularChartHelper.this.context, i3)).setYAxisLineColor(0).setYLabelSize(SleepRegularChartHelper.this.labelSize11).setXLabelMarginTop(ChartUtil.dp2px(SleepRegularChartHelper.this.context, 5.0f)).setXAxisMarginLeft(SleepRegularChartHelper.this.xMarginStart).setYAxisData(sparseArrayClone).create()).create();
            }
        }, true, false, false, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.statistic.helper.SleepRegularChartHelper.refreshBarChart.3

            /* JADX INFO: renamed from: com.huami.sleep.statistic.helper.SleepRegularChartHelper$refreshBarChart$3$a */
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
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "downIndex:" + this.a.getDataIndex();
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                HMLog.info(SleepRegularChartHelper.i, new a(index));
                if (index.getDataIndex() == -1) {
                    chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                    return;
                }
                SleepRegularChartVo sleepRegularChartVo3 = builder.getDataList().get(index.getDataIndex());
                ChartProvider chartProvider2 = chartProvider;
                if (sleepRegularChartVo3.getStartIndex() == 0) {
                    chartProvider2.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                } else {
                    this.mPointerShow = true;
                    onTouchSelectedValue.invoke(sleepRegularChartVo3, Float.valueOf(index.getCenterX()));
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
                chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                onTouchBarUpValue.getA();
                if (this.mPointerShow) {
                    this.mPointerShow = false;
                    SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.DETAIL_POINTER_DRAG_REGULARITY);
                }
            }
        });
    }
}
