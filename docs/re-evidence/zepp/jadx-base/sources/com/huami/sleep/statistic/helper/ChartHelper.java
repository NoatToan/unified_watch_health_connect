package com.huami.sleep.statistic.helper;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.statistic.vo.SleepBarChartVo;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b3\u00104J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002JO\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2%\u0010\u0015\u001a!\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000ej\u0002`\u00142\u0010\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00130\u0016j\u0002`\u0017R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001dR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/sleep/statistic/helper/ChartHelper;", "", "", "text", "", "textSize", "b", "Landroid/view/ViewGroup;", "chartParent", "dataWidth", "Lcom/huami/chart/provider/DrawConfig;", "a", "Lcom/huami/sleep/statistic/helper/BarChartBuilder;", "builder", "Lkotlin/Function1;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "", "Lcom/huami/sleep/statistic/helper/OnTouchSelectedValue;", "onTouchSelectedValue", "Lkotlin/Function0;", "Lcom/huami/sleep/statistic/helper/OnTouchBarUpValue;", "onTouchBarUpValue", "refreshBarChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "F", "labelSize11", "c", "labelSize12", GoogleApiAvailabilityLight.a, "xMarginStart", "e", "xMarginEnd", "f", "xLabelMarginTop", "g", "dataMarginStart", "h", "dataMarginEnd", "i", "dataMarginTop", z.j, "dataMarginBottom", "", hl.k, LogUtil.I, "labelColor", "<init>", "(Landroid/content/Context;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class ChartHelper {

    @NotNull
    private static final String l = "ChartHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float labelSize11 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 11.0f);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float labelSize12 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 12.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float xMarginStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float xMarginEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float xLabelMarginTop;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dataMarginStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float dataMarginEnd;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float dataMarginTop;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float dataMarginBottom;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int labelColor;
    private static final float m = ViewUtils.dp2px(KoinExtKt.getAppContext(), 1.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BarChartBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BarChartBuilder barChartBuilder) {
            super(0);
            this.a = barChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshBarChart...builder.points:" + this.a.getDataList() + ",xAxisData:" + this.a.getXAxisData();
        }
    }

    public ChartHelper(@NotNull Context context) {
        this.context = context;
        float fDp2px = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);
        this.xMarginStart = fDp2px;
        this.xLabelMarginTop = ChartUtil.dp2px(KoinExtKt.getAppContext(), 5.0f);
        this.dataMarginStart = fDp2px;
        this.dataMarginTop = ChartUtil.dp2px(KoinExtKt.getAppContext(), 7.0f);
        this.dataMarginBottom = ChartUtil.dp2px(KoinExtKt.getAppContext(), 20.0f);
        this.labelColor = ContextCompat.getColor(context, R.color.s3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig a(ViewGroup chartParent, float dataWidth) {
        int width = chartParent.getWidth();
        int height = chartParent.getHeight();
        if (width == 0) {
            width = this.context.getResources().getDisplayMetrics().widthPixels;
        }
        return new DrawConfig.Builder(this.context).setCanvasWidth(width).setCanvasHeight(height).setDataWidth(dataWidth).setDataMarginTop(this.dataMarginTop).setDataMarginLeft(this.dataMarginStart).setDataMarginRight(this.dataMarginEnd).setDataMarginBottom(this.dataMarginBottom).create();
    }

    private final float b(String text, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final BarChartBuilder builder, @NotNull final Function1<? super Index, Unit> onTouchSelectedValue, @NotNull final Function0<Unit> onTouchBarUpValue) {
        HMLog.debug(l, new a(builder));
        SparseArray sparseArray = new SparseArray();
        for (SleepBarChartVo sleepBarChartVo : builder.getDataList()) {
            sparseArray.put(sleepBarChartVo.getIndex(), new ChartData(sleepBarChartVo.getIndex(), CollectionsKt___CollectionsKt.toFloatArray(sleepBarChartVo.getValue())));
        }
        int iKeyAt = builder.getXAxisData().keyAt(0);
        int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        float value = builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(0).getValue() : 0.0f;
        float value2 = builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue() : 0.0f;
        String title = builder.getYAxisData().size() != 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1).getTitle() : "";
        final ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(iKeyAt);
        chartDataList.setEnd(iKeyAt2);
        chartDataList.setMinValue(value);
        chartDataList.setMaxValue(value2);
        float fB = b(title, this.labelSize11) + ChartUtil.dp2px(this.context, 20.0f);
        this.xMarginEnd = fB;
        this.dataMarginEnd = fB;
        if (builder.getXAxisData().size() != 0) {
            float f = 2;
            this.dataMarginStart += b(builder.getXAxisData().get(iKeyAt).getTitle(), this.labelSize12) / f;
            this.dataMarginEnd += b(builder.getXAxisData().get(iKeyAt2).getTitle(), this.labelSize12) / f;
        }
        boolean z = sparseArray.size() != 0;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 166;
        if (z) {
            intRef.element = 166 | 16384;
        }
        final float f2 = m;
        final ChartProvider chartProvider = new ChartProvider(this.context, true);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.statistic.helper.ChartHelper.refreshBarChart.2
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
                return ChartHelper.this.a(chartParent, builder.getBarWidth());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setAxisStyle(new AxisStyle.Builder(ChartHelper.this.context).setAxisStyle(intRef.element).setXLabelColor(ChartHelper.this.labelColor).setXAxisLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 1.0f)).setXAxisLineColor(ContextCompat.getColor(ChartHelper.this.context, R.color.s4)).setXLabelSize(ChartHelper.this.labelSize12).setXAxisData(builder.getXAxisData()).setZeroX(getA().getWidth() - ChartHelper.this.labelSize11).setZeroY(ChartHelper.this.dataMarginBottom).setYAxisRight(true).setYLabelColor(ChartHelper.this.labelColor).setYAxisLineColor(0).setYLabelSize(ChartHelper.this.labelSize11).setYAxisScaleLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 0.5f)).setXLabelMarginTop(ChartHelper.this.xLabelMarginTop).setXAxisMarginLeft(ChartHelper.this.xMarginStart).setXAxisMarginRight(ChartHelper.this.xMarginEnd).setYAxisData(builder.getYAxisData()).create()).setNoDataStyle(new NoDataStyle.Builder(ChartHelper.this.context).setNoDataStyle(2).setNoDataLabel(ChartHelper.this.context.getString(R.string.no_sleep_data)).setNoDataLabelColor(ContextCompat.getColor(ChartHelper.this.context, R.color.s1)).setNoDataLabelSize(ChartUtil.sp2px(ChartHelper.this.context, 13.0f)).create()).setBarStyle(new BarStyle.Builder(ChartHelper.this.context).setBarStyle(2).setSupportRadian(false).setFingerUpHighlightCancel(true).setBarColors(builder.getBarColors()).setHighlightContrast(128).setInteractiveUpCancel(false).setInteractiveType(2).setInteractiveLineWidth(f2).setInteractiveLineColor(ContextCompat.getColor(ChartHelper.this.context, R.color.s3)).setInteractiveSlide(true).setInteractiveLineWidth(ViewUtils.dp2px(ChartHelper.this.context, 2.0f)).create()).create();
            }
        }, true, false, false, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.statistic.helper.ChartHelper.refreshBarChart.3

            /* JADX INFO: renamed from: com.huami.sleep.statistic.helper.ChartHelper$refreshBarChart$3$a */
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
                HMLog.info(ChartHelper.l, new a(index));
                onTouchSelectedValue.invoke(index);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
                chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                onTouchBarUpValue.getA();
            }
        });
    }
}
