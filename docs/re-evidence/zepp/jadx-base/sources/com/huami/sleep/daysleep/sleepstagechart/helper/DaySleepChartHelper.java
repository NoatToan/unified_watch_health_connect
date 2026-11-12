package com.huami.sleep.daysleep.sleepstagechart.helper;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import defpackage.nc4;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper;", "", "Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper$IDaySleepStageTouchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setITouchListener", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/chart/data/ChartDataList;", "data", "refreshChart", "", "type", "refreshOverlayChart", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/chart/chart/ChartProvider;", "b", "Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "c", "mHrChartProvider", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper$IDaySleepStageTouchListener;", "mListener", "<init>", "(Landroid/content/Context;)V", "Companion", "IDaySleepStageTouchListener", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepChartHelper {
    private static final float e = 135.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider chartProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider mHrChartProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private IDaySleepStageTouchListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper$IDaySleepStageTouchListener;", "", "Lcom/huami/chart/util/Index;", "i", "", "dataType", "", "onDown", "onUp", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface IDaySleepStageTouchListener {
        void onDown(@Nullable Index i, @NotNull String dataType);

        void onUp(@Nullable Index i, @NotNull String dataType);
    }

    /* JADX INFO: renamed from: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper$refreshOverlayChart$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/huami/sleep/daysleep/sleepstagechart/helper/DaySleepChartHelper$refreshOverlayChart$1", "Lcom/huami/chart/chart/ChartProvider$StatisChartProvider;", "Landroid/view/ViewGroup;", "getChartContainer", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "Lcom/huami/chart/provider/DrawConfig;", "getDrawConfig", "Lcom/huami/chart/provider/RenderConfig;", "getRenderConfig", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ChartDataList b;
        public final /* synthetic */ DaySleepChartHelper c;
        public final /* synthetic */ int d;

        /* JADX INFO: renamed from: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper$refreshOverlayChart$1$a */
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "refreshOverlayChart chartParent.measuredWidth = " + this.a.getMeasuredWidth() + " - measuredHeight = " + this.a.getMeasuredHeight();
            }
        }

        public AnonymousClass1(ViewGroup viewGroup, ChartDataList chartDataList, DaySleepChartHelper daySleepChartHelper, int i) {
            this.a = viewGroup;
            this.b = chartDataList;
            this.c = daySleepChartHelper;
            this.d = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String b(float f, Index index) {
            return "";
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

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public DrawConfig getDrawConfig() {
            HMLog.info("DaySleepChartHelper", new a(this.a));
            return new DrawConfig.Builder(this.c.context).setCanvasWidth(this.a.getMeasuredWidth()).setCanvasHeight(this.a.getMeasuredHeight()).setDataMarginTop(ChartUtil.dp2px(this.c.context, 17.0f)).setDataMarginLeft(ChartUtil.dp2px(this.c.context, 15.0f)).setDataMarginRight(ChartUtil.dp2px(this.c.context, 15.0f)).setDataWidth(ChartUtil.dp2px(this.c.context, 8.0f)).create();
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public RenderConfig getRenderConfig() {
            float fDp2px = ViewUtils.dp2px(this.c.context, 160.0f);
            return new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(this.c.context).setLineColor(ContextCompat.getColor(this.c.context, this.d)).setLineWidth(ChartUtil.dp2px(this.c.context, 1.3f)).setLineStyle(4).setInteractiveUpCancel(false).setDisconnectLineGap(6).showGapPoint(true).setLineShader(new LinearGradient(0.0f, fDp2px, 0.0f, fDp2px - ChartUtil.dp2px(this.c.context, 1.3f), Arrays.copyOfRange(new int[]{ContextCompat.getColor(this.c.context, R.color.transparent), ContextCompat.getColor(this.c.context, this.d)}, 0, 2), Arrays.copyOfRange(new float[]{0.0f, 1.0f}, 0, 2), Shader.TileMode.CLAMP)).create()).setValueStyle(new ValueStyle.Builder(this.c.context).setValueStyle(4).setValueBottomMargin(this.c.context.getResources().getDimensionPixelOffset(R.dimen.base_subtitle_size)).setValueTransformation(new IValueTransformation() { // from class: f41
                @Override // com.huami.chart.listener.IValueTransformation
                public final String onValueTrans(float f, Index index) {
                    return DaySleepChartHelper.AnonymousClass1.b(f, index);
                }
            }).create()).setInteractiveLineStyle(new InteractiveLineStyle.Builder(this.c.context).setInteractiveLineStyle(2).setVerticalLineColor(ContextCompat.getColor(this.c.context, R.color.s3)).setInteractiveUpCancel(true).setVerticalLineWidth(ChartUtil.dp2px(this.c.context, 2.0f)).setShowVerticalLineOnlyInRange(true).create()).setAxisStyle(new AxisStyle.Builder(this.c.context).setAxisStyle(1).create()).create();
        }
    }

    public DaySleepChartHelper(@NotNull Context context) {
        this.context = context;
        this.chartProvider = new ChartProvider(context, true);
        this.mHrChartProvider = new ChartProvider(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final DaySleepChartHelper daySleepChartHelper) {
        HMChart chart = daySleepChartHelper.chartProvider.getChart();
        if (chart == null) {
            return;
        }
        chart.registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper$refreshChart$3$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
                if (i.getDataIndex() == -1) {
                    this.a.mHrChartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                    return;
                }
                DaySleepChartHelper.IDaySleepStageTouchListener iDaySleepStageTouchListener = this.a.mListener;
                Objects.requireNonNull(iDaySleepStageTouchListener);
                iDaySleepStageTouchListener.onDown(i, "sleep");
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i) {
                DaySleepChartHelper.IDaySleepStageTouchListener iDaySleepStageTouchListener = this.a.mListener;
                Objects.requireNonNull(iDaySleepStageTouchListener);
                iDaySleepStageTouchListener.onUp(i, "sleep");
                this.a.chartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final DaySleepChartHelper daySleepChartHelper, final String str) {
        HMChart chart = daySleepChartHelper.mHrChartProvider.getChart();
        if (chart == null) {
            return;
        }
        chart.registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper$refreshOverlayChart$2$1
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
                if (i.getPosiIndex() == null || i.getPosiIndex().getIndex() < 0) {
                    this.a.mHrChartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
                    return;
                }
                DaySleepChartHelper.IDaySleepStageTouchListener iDaySleepStageTouchListener = this.a.mListener;
                Objects.requireNonNull(iDaySleepStageTouchListener);
                iDaySleepStageTouchListener.onDown(i, str);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i) {
                DaySleepChartHelper.IDaySleepStageTouchListener iDaySleepStageTouchListener = this.a.mListener;
                Objects.requireNonNull(iDaySleepStageTouchListener);
                iDaySleepStageTouchListener.onUp(i, "sleep");
                this.a.mHrChartProvider.getChart().getInteractiveManager().setCurrentIndex(Index.INVALID_INDEX);
            }
        });
    }

    public final void refreshChart(@NotNull final ViewGroup chartParent, @NotNull final ChartDataList data) {
        if (data.getMaxData() != null) {
            data.setMaxValue((Math.max(data.getMaxDataValue(), 135.0f) * chartParent.getHeight()) / (chartParent.getHeight() - ChartUtil.dp2px(this.context, 17.0f)));
        }
        this.chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper.refreshChart.2

            /* JADX INFO: renamed from: com.huami.sleep.daysleep.sleepstagechart.helper.DaySleepChartHelper$refreshChart$2$a */
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
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "refreshChart chartParent.measuredWidth = " + this.a.getMeasuredWidth() + " - measuredHeight = " + this.a.getMeasuredHeight();
                }
            }

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
                return data;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                HMLog.info("DaySleepChartHelper", new a(chartParent));
                return new DrawConfig.Builder(DaySleepChartHelper.this.context).setCanvasWidth(chartParent.getMeasuredWidth()).setCanvasHeight(chartParent.getMeasuredHeight()).setDataWidth(0.0f).setDataMarginLeft(ChartUtil.dp2px(DaySleepChartHelper.this.context, 15.0f)).setDataMarginRight(ChartUtil.dp2px(DaySleepChartHelper.this.context, 15.0f)).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setBarStyle(new BarStyle.Builder(DaySleepChartHelper.this.context).setBarStyle(2).setHighlightContrast(128).setInteractiveLineWidth(ChartUtil.dp2px(DaySleepChartHelper.this.context, 1.0f)).setInteractiveUpCancel(false).setInteractiveType(2).setInteractiveSlide(true).setInteractiveLineColor(ContextCompat.getColor(DaySleepChartHelper.this.context, R.color.s3)).setInteractiveLineWidth(ViewUtils.dp2px(DaySleepChartHelper.this.context, 2.0f)).create()).setNoDataStyle(new NoDataStyle.Builder(DaySleepChartHelper.this.context).setNoDataStyle(2).setNoDataLabel(KoinExtKt.getAppContext().getString(R.string.sleep_no_night_data)).setNoDataLabelColor(ContextCompat.getColor(DaySleepChartHelper.this.context, R.color.s1)).setNoDataLabelSize(ChartUtil.sp2px(DaySleepChartHelper.this.context, 13.0f)).create()).setAxisStyle(new AxisStyle.Builder(DaySleepChartHelper.this.context).setXLabelSize(ChartUtil.sp2px(DaySleepChartHelper.this.context, 12.0f)).setXLabelColor(ViewExKt.addAlpha(ContextCompat.getColor(DaySleepChartHelper.this.context, R.color.s44), 0.13d)).create()).create();
            }
        }, data.getCount() > 0, false, false, false);
        chartParent.post(new Runnable() { // from class: c41
            @Override // java.lang.Runnable
            public final void run() {
                DaySleepChartHelper.c(this.a);
            }
        });
    }

    public final void refreshOverlayChart(@NotNull ViewGroup chartParent, @NotNull ChartDataList data, @NotNull final String type) {
        this.mHrChartProvider.createChart(new AnonymousClass1(chartParent, data, this, Intrinsics.areEqual("heart_rate", type) ? R.color.p3 : R.color.s20), true, false, false, false);
        chartParent.post(new Runnable() { // from class: d41
            @Override // java.lang.Runnable
            public final void run() {
                DaySleepChartHelper.d(this.a, type);
            }
        });
    }

    public final void setITouchListener(@NotNull IDaySleepStageTouchListener listener) {
        this.mListener = listener;
    }
}
