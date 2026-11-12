package com.huami.sleep.daysleep.tonality;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003J,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/TonalityChartHelper;", "", "", "zeroX", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "yDataSparse", "Lcom/huami/chart/provider/RenderConfig;", "a", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/chart/data/ChartDataList;", "data", "", "signIndex", "", "drawSleepTonalityChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/chart/chart/ChartProvider;", "b", "Lcom/huami/chart/chart/ChartProvider;", "sleepTonalityChartProvider", "<init>", "(Landroid/content/Context;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class TonalityChartHelper {
    private static final float c = 10.0f;
    private static final float d = 10.0f;
    private static final float e = 15.0f;
    private static final float f = 44.0f;
    private static final double g = 0.2d;
    private static final float h = -14.0f;
    private static final float i = 0.5f;
    private static final float j = 14.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider sleepTonalityChartProvider;

    /* JADX INFO: renamed from: com.huami.sleep.daysleep.tonality.TonalityChartHelper$drawSleepTonalityChart$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"com/huami/sleep/daysleep/tonality/TonalityChartHelper$drawSleepTonalityChart$1", "Lcom/huami/chart/chart/ChartProvider$StatisChartProvider;", "Landroid/view/ViewGroup;", "getChartContainer", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "Lcom/huami/chart/util/Index;", "getCurrentIndex", "Lcom/huami/chart/provider/DrawConfig;", "getDrawConfig", "Lcom/huami/chart/provider/RenderConfig;", "getRenderConfig", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ChartDataList b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TonalityChartHelper d;
        public final /* synthetic */ SparseArray<YAxisData> e;

        /* JADX INFO: renamed from: com.huami.sleep.daysleep.tonality.TonalityChartHelper$drawSleepTonalityChart$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ViewGroup a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup) {
                super(0);
                this.a = viewGroup;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "drawSleepTonalityChart chartParent.measuredWidth = " + this.a.getMeasuredWidth() + " - measuredHeight = " + this.a.getMeasuredHeight();
            }
        }

        /* JADX INFO: renamed from: com.huami.sleep.daysleep.tonality.TonalityChartHelper$drawSleepTonalityChart$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ TonalityChartHelper b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TonalityChartHelper tonalityChartHelper) {
                super(0);
                this.b = tonalityChartHelper;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "chart width = " + AnonymousClass1.this.getA().getWidth() + " - offset = 14.0 - dp2px = " + ChartUtil.dp2px(this.b.context, 14.0f);
            }
        }

        public AnonymousClass1(ViewGroup viewGroup, ChartDataList chartDataList, int i, TonalityChartHelper tonalityChartHelper, SparseArray<YAxisData> sparseArray) {
            this.a = viewGroup;
            this.b = chartDataList;
            this.c = i;
            this.d = tonalityChartHelper;
            this.e = sparseArray;
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        /* JADX INFO: renamed from: getChartContainer, reason: from getter */
        public ViewGroup getA() {
            return this.a;
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        /* JADX INFO: renamed from: getChartDataList, reason: from getter */
        public ChartDataList getB() {
            return this.b;
        }

        @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
        @NotNull
        public Index getCurrentIndex() {
            return new Index(this.c, new BaseIndex(this.c));
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public DrawConfig getDrawConfig() {
            HMLog.info("TonalityChartHelper", new a(this.a));
            return new DrawConfig.Builder(this.d.context).setCanvasWidth(this.a.getMeasuredWidth()).setCanvasHeight(this.a.getMeasuredHeight()).setDataWidth(this.a.getMeasuredWidth() / this.b.getCount()).setDataMarginLeft(ChartUtil.dp2px(this.d.context, 15.0f)).setDataMarginTop(ChartUtil.dp2px(this.d.context, 10.0f)).setDataMarginBottom(ChartUtil.dp2px(this.d.context, 10.0f)).setDataMarginRight(ChartUtil.dp2px(this.d.context, TonalityChartHelper.f)).create();
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public RenderConfig getRenderConfig() {
            HMLog.info("TonalityChartHelper", new b(this.d));
            return this.d.a(getA().getWidth() - ChartUtil.dp2px(this.d.context, 14.0f), this.e);
        }
    }

    public TonalityChartHelper(@NotNull Context context) {
        this.context = context;
        this.sleepTonalityChartProvider = new ChartProvider(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    public final RenderConfig a(float zeroX, SparseArray<YAxisData> yDataSparse) {
        Context context = this.context;
        int i2 = R.color.s34;
        return new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this.context).setLineStyle(4).setLineColor(ContextCompat.getColor(this.context, i2)).setShadowColors(new int[]{ViewExKt.addAlpha(ContextCompat.getColor(context, i2), 0.2d), ContextCompat.getColor(this.context, R.color.s38)}).create()).setValueStyle(new ValueStyle.Builder(this.context).setValueStyle(4).setValueBitmap(ChartTransmitUtil.INSTANCE.vectorDrawableToBitmap(this.context, R.drawable.sleep_tonality_sign)).setValueBottomMargin(ChartUtil.dp2px(this.context, h)).setDrawEmptyValue(true).create()).setAxisStyle(new AxisStyle.Builder(this.context).setAxisStyle(16516).setXAxisMarginLeft(ChartUtil.dp2px(this.context, 15.0f)).setXAxisMarginRight(ChartUtil.dp2px(this.context, f)).setYAxisData(yDataSparse).setYLabelColor(ContextCompat.getColor(this.context, R.color.s3)).setYAxisLineColor(0).setZeroX(zeroX).setYAxisRight(true).setYAxisScaleLineColor(ContextCompat.getColor(this.context, R.color.s4)).setYAxisScaleLineWidth(ChartUtil.dp2px(this.context, 0.5f)).create()).create();
    }

    public final void drawSleepTonalityChart(@NotNull ViewGroup chartParent, @NotNull ChartDataList data, @NotNull SparseArray<YAxisData> yDataSparse, int signIndex) {
        this.sleepTonalityChartProvider.createChart(new AnonymousClass1(chartParent, data, signIndex, this, yDataSparse), false, false, false, false);
    }
}
