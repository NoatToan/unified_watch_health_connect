package com.huami.sleep.helper;

import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
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
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.vo.BreathQualityWMScoreVo;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import defpackage.nc4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b5\u00106J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002JW\u0010\u001b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2%\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010j\u0002`\u00162\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u0019R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001fR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/huami/sleep/helper/BreathQualityScoreChartHelper;", "", "", "text", "", "textSize", "b", "Landroid/view/ViewGroup;", "chartParent", "barWidth", "Lcom/huami/chart/provider/DrawConfig;", "a", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "data", "Lkotlin/Function1;", "Lcom/huami/chart/util/Index;", "Lkotlin/ParameterName;", "name", "index", "", "Lcom/huami/sleep/helper/OnTouchSelectedValue;", "onTouchSelectedValue", "Lkotlin/Function0;", "Lcom/huami/sleep/helper/OnTouchBarUpValue;", "onTouchBarUpValue", "refreshBarChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "F", "labelSize11", "c", "labelSize12", GoogleApiAvailabilityLight.a, "xMarginStart", "e", "xMarginEnd", "f", "xLabelMarginTop", "g", "dataMarginStart", "h", "dataMarginEnd", "i", "dataMarginTop", z.j, "dataMarginBottom", "", hl.k, LogUtil.I, "labelColor", "<init>", "(Landroid/content/Context;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityScoreChartHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float dataMarginTop;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int labelColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float labelSize11 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 11.0f);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float labelSize12 = ChartUtil.sp2px(KoinExtKt.getAppContext(), 12.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float xMarginStart = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float xMarginEnd = ChartUtil.sp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float xLabelMarginTop = ChartUtil.dp2px(KoinExtKt.getAppContext(), 5.0f);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float dataMarginStart = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float dataMarginEnd = ChartUtil.dp2px(KoinExtKt.getAppContext(), 15.0f);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float dataMarginBottom = ChartUtil.dp2px(KoinExtKt.getAppContext(), 20.0f);

    public BreathQualityScoreChartHelper(@NotNull Context context) {
        this.context = context;
        this.labelColor = ContextCompat.getColor(context, R.color.s1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig a(ViewGroup chartParent, float barWidth) {
        int width = chartParent.getWidth();
        int height = chartParent.getHeight();
        if (width == 0) {
            width = this.context.getResources().getDisplayMetrics().widthPixels;
        }
        return new DrawConfig.Builder(this.context).setCanvasWidth(width).setCanvasHeight(height).setDataWidth(barWidth).setDataMarginTop(this.dataMarginTop).setDataMarginLeft(this.dataMarginStart).setDataMarginRight(this.dataMarginEnd).setDataMarginBottom(this.dataMarginBottom).create();
    }

    private final float b(String text, float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.measureText(text);
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final TimeMode timeMode, @NotNull final BreathQualityWMScoreVo data, @NotNull final Function1<? super Index, Unit> onTouchSelectedValue, @NotNull final Function0<Unit> onTouchBarUpValue) {
        final ChartDataList chartDataList = new ChartDataList(data.getChartData());
        chartDataList.setStart(1);
        chartDataList.setEnd(data.getMaxIndex());
        chartDataList.setMinValue(0.0f);
        chartDataList.setMaxValue(110.0f);
        if (data.getXAxisData().size() != 0) {
            float f = 2;
            this.dataMarginStart += b(data.getXAxisData().get(1).getTitle(), this.labelSize12) / f;
            SparseArray<XAxisData> xAxisData = data.getXAxisData();
            int size = xAxisData.size();
            String title = "";
            for (int i = 0; i < size; i++) {
                xAxisData.keyAt(i);
                title = xAxisData.valueAt(i).getTitle();
            }
            this.dataMarginEnd += b(title, this.labelSize12) / f;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 166;
        intRef.element = 166 | 32768;
        final ChartProvider chartProvider = new ChartProvider(this.context, true);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.helper.BreathQualityScoreChartHelper.refreshBarChart.2

            /* JADX INFO: renamed from: com.huami.sleep.helper.BreathQualityScoreChartHelper$refreshBarChart$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TimeMode.values().length];
                    iArr[TimeMode.WEEK.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                return BreathQualityScoreChartHelper.this.a(chartParent, WhenMappings.$EnumSwitchMapping$0[timeMode.ordinal()] == 1 ? ViewUtils.dp2px(BreathQualityScoreChartHelper.this.context, 16.0f) : ViewUtils.dp2px(BreathQualityScoreChartHelper.this.context, 6.0f));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder builder = new RenderConfig.Builder();
                AxisStyle.Builder xLabelColor = new AxisStyle.Builder(BreathQualityScoreChartHelper.this.context).setAxisStyle(intRef.element).setXLabelColor(BreathQualityScoreChartHelper.this.labelColor);
                Context context = BreathQualityScoreChartHelper.this.context;
                int i2 = R.color.s3;
                return builder.setAxisStyle(xLabelColor.setXAxisLineColor(ContextCompat.getColor(context, i2)).setXLabelSize(BreathQualityScoreChartHelper.this.labelSize12).setXAxisData(data.getXAxisData()).setYAxisData(data.getYAxisData()).setZeroX(getD().getWidth() - BreathQualityScoreChartHelper.this.labelSize11).setZeroY(BreathQualityScoreChartHelper.this.dataMarginBottom).setYAxisRight(true).setYLabelColor(BreathQualityScoreChartHelper.this.labelColor).setYAxisLineColor(0).setYLabelSize(BreathQualityScoreChartHelper.this.labelSize11).setYAxisScaleLineWidth(ChartUtil.dp2px(BreathQualityScoreChartHelper.this.context, 0.5f)).setXLabelMarginTop(BreathQualityScoreChartHelper.this.xLabelMarginTop).setXAxisMarginLeft(BreathQualityScoreChartHelper.this.xMarginStart).setXAxisMarginRight(BreathQualityScoreChartHelper.this.xMarginEnd).create()).setNoDataStyle(new NoDataStyle.Builder(BreathQualityScoreChartHelper.this.context).setNoDataStyle(2).setNoDataLabel(BreathQualityScoreChartHelper.this.context.getString(R.string.health_data_no_data)).setNoDataLabelColor(ContextCompat.getColor(BreathQualityScoreChartHelper.this.context, R.color.s1)).setNoDataLabelSize(ChartUtil.sp2px(BreathQualityScoreChartHelper.this.context, 13.0f)).create()).setBarStyle(new BarStyle.Builder(BreathQualityScoreChartHelper.this.context).setBarStyle(2).setSupportRadian(false).setFingerUpHighlightCancel(true).setInteractiveUpCancel(false).setInteractiveType(2).setInteractiveLineWidth(ViewUtils.dp2px(KoinExtKt.getAppContext(), 1.0f)).setInteractiveLineColor(ContextCompat.getColor(BreathQualityScoreChartHelper.this.context, i2)).setInteractiveSlide(true).setInteractiveLineWidth(ViewUtils.dp2px(BreathQualityScoreChartHelper.this.context, 2.0f)).create()).create();
            }
        }, true, false, false, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.helper.BreathQualityScoreChartHelper.refreshBarChart.3
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index) {
                onTouchSelectedValue.invoke(index);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
                chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                onTouchBarUpValue.invoke();
            }
        });
    }
}
