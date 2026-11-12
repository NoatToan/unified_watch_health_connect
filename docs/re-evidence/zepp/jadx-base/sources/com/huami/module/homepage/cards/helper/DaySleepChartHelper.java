package com.huami.module.homepage.cards.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.ChartConstantsKt;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IValueTransformation;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.ValueStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.helper.DaySleepChartHelper;
import com.huami.module.ktx.NumberExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/huami/module/homepage/cards/helper/DaySleepChartHelper;", "", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "a", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/chart/data/ChartDataList;", "data", "", "refreshChart", "refreshOverlayChart", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/chart/chart/ChartProvider;", "b", "Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "c", "mHrChartProvider", "<init>", "(Landroid/content/Context;)V", GoogleApiAvailabilityLight.a, "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepChartHelper {

    @Deprecated
    public static final float RADIAN_VALUE = 5.0f;

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider chartProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ChartProvider mHrChartProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/helper/DaySleepChartHelper$a", "", "", "RADIAN_VALUE", "F", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.helper.DaySleepChartHelper$refreshOverlayChart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/huami/module/homepage/cards/helper/DaySleepChartHelper$refreshOverlayChart$1", "Lcom/huami/chart/chart/ChartProvider$StatisChartProvider;", "Landroid/view/ViewGroup;", "getChartContainer", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "Lcom/huami/chart/provider/DrawConfig;", "getDrawConfig", "Lcom/huami/chart/provider/RenderConfig;", "getRenderConfig", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class C15311 extends ChartProvider.StatisChartProvider {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ChartDataList b;
        public final /* synthetic */ DaySleepChartHelper c;
        public final /* synthetic */ float d;

        public C15311(ViewGroup viewGroup, ChartDataList chartDataList, DaySleepChartHelper daySleepChartHelper, float f) {
            this.a = viewGroup;
            this.b = chartDataList;
            this.c = daySleepChartHelper;
            this.d = f;
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
            return new DrawConfig.Builder(this.c.context).setCanvasWidth(this.c.a(this.a)).setCanvasHeight(this.d).setDataMarginTop(ChartUtil.dp2px(this.c.context, 17.0f)).setDataMarginLeft(ChartUtil.dp2px(this.c.context, 15.0f)).setDataMarginRight(ChartUtil.dp2px(this.c.context, 15.0f)).setDataWidth(ChartUtil.dp2px(this.c.context, 8.0f)).create();
        }

        @Override // com.huami.chart.chart.IChartProvider
        @NotNull
        public RenderConfig getRenderConfig() {
            int color = Color.parseColor("#DF3B34");
            int[] iArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(new int[]{Color.parseColor("#00ffffff"), color}, 0, 2);
            float[] fArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(new float[]{0.0f, 1.0f}, 0, 2);
            RenderConfig.Builder builder = new RenderConfig.Builder();
            LineStyle.Builder builderShowGapPoint = new LineStyle.Builder(this.c.context).setLineColor(color).setLineWidth(ChartUtil.dp2px(this.c.context, 1.3f)).setLineStyle(4).setInteractiveUpCancel(false).setInteractiveType(32).setInteractiveSlide(true).setHighlightLineColor(color).setHighlightLineWidth(ChartUtil.dp2px(this.c.context, 2.0f)).setDisconnectLineGap(6).showGapPoint(true);
            float f = this.d;
            return builder.setLineStyle(builderShowGapPoint.setLineShader(new LinearGradient(0.0f, f, 0.0f, f - ChartUtil.dp2px(this.c.context, 1.3f), iArrCopyOfRange, fArrCopyOfRange, Shader.TileMode.CLAMP)).create()).setValueStyle(new ValueStyle.Builder(this.c.context).setValueStyle(4).setValueBottomMargin(this.c.context.getResources().getDimensionPixelOffset(R.dimen.base_subtitle_size)).setValueTransformation(new IValueTransformation() { // from class: e41
                @Override // com.huami.chart.listener.IValueTransformation
                public final String onValueTrans(float f2, Index index) {
                    return DaySleepChartHelper.C15311.b(f2, index);
                }
            }).create()).setAxisStyle(new AxisStyle.Builder(this.c.context).setAxisStyle(1).create()).create();
        }
    }

    public DaySleepChartHelper(@NotNull Context context) {
        this.context = context;
        this.chartProvider = new ChartProvider(context, true);
        this.mHrChartProvider = new ChartProvider(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float a(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int width = view.getWidth();
        if (measuredWidth == 0) {
            return width != 0 ? width : Resources.getSystem().getDisplayMetrics().widthPixels - NumberExtKt.getDp(20.0f);
        }
        return measuredWidth;
    }

    public final void refreshChart(@NotNull final ViewGroup chartParent, @NotNull final ChartDataList data) {
        this.chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.module.homepage.cards.helper.DaySleepChartHelper.refreshChart.1
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
                return new DrawConfig.Builder(DaySleepChartHelper.this.context).setCanvasWidth(DaySleepChartHelper.this.a(chartParent)).setCanvasHeight(chartParent.getMeasuredHeight()).setDataWidth(0.0f).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setBarStyle(new BarStyle.Builder(DaySleepChartHelper.this.context).setBarStyle(2).setHighlightContrast(128).setInteractiveLineWidth(ChartUtil.dp2px(DaySleepChartHelper.this.context, 1.0f)).setInteractiveUpCancel(false).setInteractiveType(2).setInteractiveSlide(true).setSupportRadian(true).setRadianValues(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f}).setInteractiveLineWidth(NumberExtKt.getDp(2)).create()).setAxisStyle(new AxisStyle.Builder(DaySleepChartHelper.this.context).setXLabelSize(ChartUtil.sp2px(DaySleepChartHelper.this.context, 12.0f)).setXLabelColor(Color.parseColor(ChartConstantsKt.INTERACTIVE_LINE_COLOR)).create()).create();
            }
        }, false, false, false, false);
    }

    public final void refreshOverlayChart(@NotNull ViewGroup chartParent, @NotNull ChartDataList data) {
        this.mHrChartProvider.createChart(new C15311(chartParent, data, this, chartParent.getMeasuredHeight() == 0 ? NumberExtKt.getDp(56.0f) : chartParent.getMeasuredHeight()), false, false, false, false);
    }
}
