package com.xiaomi.hm.health.healthdata.utils;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.ChartConstantsKt;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.InteractiveLineStyle;
import com.huami.chart.style.LineJoinStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.Index;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.SubLineAndPointsChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\b=\u0010>J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J&\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J<\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002JF\u0010*\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020 2\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!j\u0002`%2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`(JF\u0010,\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020+2\u001c\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!j\u0002`%2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`(J\u0097\u0001\u00107\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022U\u00104\u001aQ\u0012\u0004\u0012\u00020\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010.\u0012\u0015\u0012\u0013\u0018\u00010/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020$0-j\u0002`32\u0010\u00106\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`52\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`(J\u0097\u0001\u00108\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022U\u00104\u001aQ\u0012\u0004\u0012\u00020\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010.\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010.\u0012\u0015\u0012\u0013\u0018\u00010/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020$0-j\u0002`32\u0010\u00106\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`52\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020$0'j\u0002`(R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "builder", "Lcom/huami/chart/data/ChartDataList;", "h", "", "hasData", "", "chartWidth", "Lcom/huami/chart/provider/RenderConfig;", "c", "g", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/chart/provider/DrawConfig$Builder;", "e", "axisStyle", "", "zeroX", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "yAxisData", "Lcom/huami/chart/style/AxisStyle$Builder;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/style/NoDataStyle;", "f", hl.k, z.j, "Lcom/xiaomi/hm/health/healthdata/ui/view/LineChartBuilder;", "Lkotlin/Function2;", "Lcom/huami/chart/util/Index;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "", "Lcom/xiaomi/hm/health/healthdata/utils/OnTouchPointDownValue;", "onTouchPointDownValue", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/healthdata/utils/OnTouchEmptyArea;", "onTouchEmptyArea", "refreshChart", "Lcom/xiaomi/hm/health/healthdata/ui/view/SubLineAndPointsChartBuilder;", "refreshMixLineChart", "Lkotlin/Function4;", "Lkotlin/Pair;", "", "Lkotlin/ParameterName;", "name", "date", "Lcom/xiaomi/hm/health/healthdata/utils/OnTouchBarDownValue;", "onTouchBarDownValue", "Lcom/xiaomi/hm/health/healthdata/utils/OnTouchBarUpValue;", "onTouchBarUpValue", "refreshBarChart", "refreshAnimationBarChart", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ChartHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "HealthData-ChartHelper";
    private static final float c;
    private static final float d;
    private static final float e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper$Companion;", "", "", "BAR_LINE_WIDTH", "F", "getBAR_LINE_WIDTH", "()F", "BAR_DATA_OFFSET", "getBAR_DATA_OFFSET", "BAR_INTERACTIVE_LINE_WIDTH", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBAR_DATA_OFFSET() {
            return ChartHelper.d;
        }

        public final float getBAR_LINE_WIDTH() {
            return ChartHelper.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ BarChartBuilder<Number> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BarChartBuilder<Number> barChartBuilder) {
            super(0);
            this.a = barChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshAnimationBarChart...builder.points:" + this.a.getPoints() + ",xAxisData:" + this.a.getXAxisData() + ",yAxisData:" + this.a.getYAxisData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BarChartBuilder<Number> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BarChartBuilder<Number> barChartBuilder) {
            super(0);
            this.a = barChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshBarChart...builder.points:" + this.a.getPoints() + ",xAxisData:" + this.a.getXAxisData() + ",yAxisData:" + this.a.getYAxisData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ LineChartBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LineChartBuilder lineChartBuilder) {
            super(0);
            this.a = lineChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshChart...points:" + this.a.getPoints() + ",xAxisData:" + this.a.getXAxisData() + ",yAxisData:" + this.a.getYAxisData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ SubLineAndPointsChartBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SubLineAndPointsChartBuilder subLineAndPointsChartBuilder) {
            super(0);
            this.a = subLineAndPointsChartBuilder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "refreshMixLineChart...points:" + this.a.getPoints() + ",xAxisData:" + this.a.getXAxisData() + ",yAxisData:" + this.a.getYAxisData();
        }
    }

    static {
        float fDp2px = ViewUtils.dp2px(BraceletApp.getContext(), 6.0f);
        c = fDp2px;
        d = fDp2px / 2.0f;
        e = ViewUtils.dp2px(BraceletApp.getContext(), 1.0f);
    }

    public ChartHelper(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig c(boolean hasData, BarChartBuilder<Number> builder, int chartWidth) {
        SparseArray<YAxisData> yAxisData;
        YAxisData yAxisDataValueAt = builder.getYAxisData().valueAt(0);
        if (hasData) {
            yAxisData = builder.getYAxisData();
        } else {
            SparseArray<YAxisData> sparseArray = new SparseArray<>(1);
            sparseArray.put(0, yAxisDataValueAt);
            yAxisData = sparseArray;
        }
        int i = (builder.getYScaleLongDash() ? 32768 : 16384) | 38;
        if (hasData) {
            i |= 128;
        }
        float f = chartWidth - 50.0f;
        j();
        RenderConfig.Builder axisStyle = new RenderConfig.Builder().setAxisStyle(d(i, hasData, f, builder.getXAxisData(), yAxisData).setXAxisLineColor(0).setXLabelSupportAnimation(true).setBottomIndicatorShape(hasData ? 10 : 9).setBottomIndicatorCircleRadius(ChartUtil.dp2px(this.context, 10.0f)).setXLabelMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setXMovableLabelMarginTop(ChartUtil.dp2px(this.context, 15.0f)).setBottomIndicatorBackgroundMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setBottomIndicatorShapeMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setBottomIndicatorBackgroundHeight(ChartUtil.dp2px(this.context, 15.0f)).setBottomIndicatorBackgroundColor(ContextCompat.getColor(this.context, R.color.s10)).setBottomIndicatorTintColor(ContextCompat.getColor(this.context, R.color.s39)).setInteractiveUpCancel(false).setXLabelColor(ContextCompat.getColor(this.context, R.color.s1)).create());
        InteractiveLineStyle.Builder verticalLineWidth = new InteractiveLineStyle.Builder(this.context).setInteractiveLineStyle(16).setInteractiveUpCancel(false).setVerticalLineColor(ContextCompat.getColor(this.context, R.color.s3)).setVerticalLineWidth(ChartUtil.dp2px(this.context, 1.0f));
        if (builder.getShowIntersectionPoint()) {
            verticalLineWidth.setIntersectionPointSize(ChartUtil.dp2px(this.context, 5.0f));
            verticalLineWidth.setIntersectionPointBorder(ChartUtil.dp2px(this.context, 2.0f));
            verticalLineWidth.setIntersectionPointColor(ContextCompat.getColor(this.context, R.color.s51));
            verticalLineWidth.setPointShadowLayer(1.0f, 0.0f, 2.0f, Color.parseColor(ChartConstantsKt.INTERACTIVE_LINE_COLOR));
        }
        Unit unit = Unit.INSTANCE;
        return axisStyle.setInteractiveLineStyle(verticalLineWidth.create()).setNoDataStyle(f()).setBarStyle(new BarStyle.Builder(this.context).setBarStyle(4).setSupportRadian(false).setBarColors(builder.getBarColors()).create()).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AxisStyle.Builder d(int axisStyle, boolean hasData, float zeroX, SparseArray<XAxisData> xAxisData, SparseArray<YAxisData> yAxisData) {
        return new AxisStyle.Builder(this.context).setAxisStyle(axisStyle).setZeroX(zeroX).setZeroY(ChartUtil.dp2px(this.context, 20.0f)).setLabelCenter(true).setXLabelColor(ContextCompat.getColor(this.context, R.color.s3)).setXAxisLineColor(hasData ? 0 : ContextCompat.getColor(this.context, R.color.s4)).setXLabelSize(ChartUtil.sp2px(this.context, 12.0f)).setXAxisData(xAxisData).setYLabelColor(ContextCompat.getColor(this.context, R.color.s3)).setYAxisScaleLineColor(ContextCompat.getColor(this.context, R.color.s4)).setYAxisLineColor(0).setYLabelSize(ChartUtil.sp2px(this.context, 11.0f)).setXLabelMarginTop(ChartUtil.dp2px(this.context, 4.0f)).setXAxisMarginLeft(ChartUtil.dp2px(this.context, 15.0f)).setXAxisMarginRight(ChartUtil.dp2px(this.context, 45.0f)).setYAxisData(yAxisData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig.Builder e(ViewGroup chartParent) {
        return new DrawConfig.Builder(this.context).setCanvasHeight(j()).setCanvasWidth(k(chartParent)).setDataMarginTop(ChartUtil.dp2px(this.context, 15.0f)).setDataMarginLeft(ChartUtil.dp2px(this.context, 30.0f)).setDataMarginRight(ChartUtil.dp2px(this.context, 60.0f)).setDataMarginBottom(ChartUtil.dp2px(this.context, 20.0f)).setDataWidth(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoDataStyle f() {
        return new NoDataStyle.Builder(this.context).setNoDataStyle(2).setNoDataLabel(this.context.getString(R.string.health_data_no_data)).setNoDataLabelColor(Color.parseColor("#B2B2B2")).setNoDataLabelSize(ChartUtil.sp2px(this.context, 12.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig g(boolean hasData, BarChartBuilder<Number> builder, int chartWidth) {
        int i;
        if (hasData) {
            i = 38 | (builder.getYScaleLongDash() ? 32896 : 16512);
        } else {
            i = 38;
        }
        Integer barMaxSize = builder.getBarMaxSize();
        Float fValueOf = barMaxSize == null ? null : Float.valueOf(chartWidth / barMaxSize.intValue());
        return new RenderConfig.Builder().setAxisStyle(d(i, hasData, chartWidth - 50.0f, builder.getXAxisData(), builder.getYAxisData()).create()).setNoDataStyle(f()).setBarStyle(new BarStyle.Builder(this.context).setBarStyle(4).setSupportRadian(false).setBarColors(builder.getBarColors()).setInteractiveUpCancel(true).setInteractiveType(2).setInteractiveLineWidth(Math.min((fValueOf == null ? c : fValueOf.floatValue()) / 2, e)).setDownSameCancel(true).setInteractiveSlide(true).setFingerUpHighlightCancel(true).create()).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public final ChartDataList h(BarChartBuilder<Number> builder) {
        Integer numInvoke;
        final int iIntValue;
        SparseArray sparseArray = new SparseArray();
        Iterator<T> it2 = builder.getPoints().iterator();
        while (true) {
            final int iIntValue2 = 0;
            if (!it2.hasNext()) {
                int iKeyAt = builder.getXAxisData().keyAt(0);
                int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
                float value = builder.getYAxisData().get(0).getValue();
                float value2 = builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue();
                ChartDataList chartDataList = new ChartDataList(sparseArray);
                chartDataList.setStart(iKeyAt);
                chartDataList.setEnd(iKeyAt2);
                chartDataList.setMinValue(value);
                chartDataList.setMaxValue(value2);
                return chartDataList;
            }
            BarChartVo barChartVo = (BarChartVo) it2.next();
            ArrayList arrayList = new ArrayList();
            Pair highValue = barChartVo.getHighValue();
            Integer numInvoke2 = null;
            if (highValue == null) {
                numInvoke = null;
            } else {
                float fFloatValue = ((Number) highValue.getFirst()).floatValue();
                float fFloatValue2 = ((Number) highValue.getSecond()).floatValue();
                arrayList.add(Float.valueOf(fFloatValue));
                arrayList.add(Float.valueOf(fFloatValue2));
                Pair highOffset = barChartVo.getHighOffset();
                Function1<Float, Integer> barDataColorGetter = builder.getBarDataColorGetter();
                if (barDataColorGetter == null) {
                    numInvoke = null;
                } else {
                    numInvoke = barDataColorGetter.invoke(Float.valueOf(Math.max(fFloatValue + ((Number) highOffset.getFirst()).floatValue(), fFloatValue2 - ((Number) highOffset.getSecond()).floatValue())));
                }
            }
            Pair lowValue = barChartVo.getLowValue();
            if (lowValue != null) {
                float fFloatValue3 = ((Number) lowValue.getFirst()).floatValue();
                float fFloatValue4 = ((Number) lowValue.getSecond()).floatValue();
                arrayList.add(Float.valueOf(fFloatValue3));
                arrayList.add(Float.valueOf(fFloatValue4));
                Pair lowOffset = barChartVo.getLowOffset();
                Function1<Float, Integer> barDataColorGetter2 = builder.getBarDataColorGetter();
                if (barDataColorGetter2 != null) {
                    numInvoke2 = barDataColorGetter2.invoke(Float.valueOf(Math.min(fFloatValue3 + ((Number) lowOffset.getFirst()).floatValue(), fFloatValue4 - ((Number) lowOffset.getSecond()).floatValue())));
                }
            }
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
                chartData.addExtends(new IDataExtendListener() { // from class: nn0
                    @Override // com.huami.chart.listener.IDataExtendListener
                    public final Object get(BaseIndex baseIndex) {
                        return ChartHelper.i(iIntValue, iIntValue2, baseIndex);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            sparseArray.put(index, chartData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(int i, int i2, BaseIndex baseIndex) {
        return new HMColor(i, i2);
    }

    private final int j() {
        return (int) ChartUtil.dp2px(this.context, 180.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k(ViewGroup chartParent) {
        int width = chartParent.getWidth();
        return width == 0 ? this.context.getResources().getDisplayMetrics().widthPixels : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(SubLineAndPointsChartBuilder subLineAndPointsChartBuilder, float f, BaseIndex baseIndex) {
        return new HMColor(subLineAndPointsChartBuilder.getSubPointDataColorGetter().invoke(Float.valueOf(f)).intValue());
    }

    public final void refreshAnimationBarChart(@NotNull final ViewGroup chartParent, @NotNull final BarChartBuilder<Number> builder, @NotNull final Function4<? super Index, ? super Pair<Float, Float>, ? super Pair<Float, Float>, ? super String, Unit> onTouchBarDownValue, @NotNull Function0<Unit> onTouchBarUpValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        Float fValueOf;
        HMLog.info(b, new a(builder));
        final boolean z = !builder.getPoints().isEmpty();
        ChartProvider chartProvider = new ChartProvider(this.context);
        Integer barMaxSize = builder.getBarMaxSize();
        if (barMaxSize == null) {
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf(k(chartParent) / barMaxSize.intValue());
        }
        final float fFloatValue = fValueOf == null ? c : fValueOf.floatValue();
        chartProvider.createAutoAdjustChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshAnimationBarChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getB() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
                return ChartHelper.this.h(builder);
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @Nullable
            public Index getCurrentIndex() {
                if (!z) {
                    return null;
                }
                return new Index(getG().getCount() - 1, getG().getLastData().getBaseIndex());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                DrawConfig.Builder builderE = ChartHelper.this.e(chartParent);
                float f = fFloatValue;
                ChartHelper chartHelper = ChartHelper.this;
                builderE.setDataWidth(f);
                builderE.setDataMarginBottom(ChartUtil.dp2px(chartHelper.context, 25.0f));
                return builderE.create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                ChartHelper chartHelper = ChartHelper.this;
                return chartHelper.c(z, builder, chartHelper.k(chartParent));
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshAnimationBarChart.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshAnimationBarChart$3$a */
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
                HMLog.info(ChartHelper.b, new a(index));
                BarChartVo barChartVo = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index.getDataIndex());
                if (barChartVo != null) {
                    Function4<Index, Pair<Float, Float>, Pair<Float, Float>, String, Unit> function4 = onTouchBarDownValue;
                    BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(barChartVo);
                    function4.invoke(index, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
                }
                if (barChartVo == null) {
                    onTouchEmptyArea.getA();
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onTouchOutOfRange() {
                onTouchEmptyArea.getA();
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
                BarChartVo barChartVo = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index.getDataIndex());
                if (barChartVo == null) {
                    return;
                }
                Function4<Index, Pair<Float, Float>, Pair<Float, Float>, String, Unit> function4 = onTouchBarDownValue;
                BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(barChartVo);
                function4.invoke(index, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
            }
        });
    }

    public final void refreshBarChart(@NotNull final ViewGroup chartParent, @NotNull final BarChartBuilder<Number> builder, @NotNull final Function4<? super Index, ? super Pair<Float, Float>, ? super Pair<Float, Float>, ? super String, Unit> onTouchBarDownValue, @NotNull final Function0<Unit> onTouchBarUpValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        HMLog.info(b, new b(builder));
        final boolean z = !builder.getPoints().isEmpty();
        ChartProvider chartProvider = new ChartProvider(this.context);
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshBarChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getB() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
                return ChartHelper.this.h(builder);
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                return ChartHelper.this.e(chartParent).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                ChartHelper chartHelper = ChartHelper.this;
                return chartHelper.g(z, builder, chartHelper.k(chartParent));
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshBarChart.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshBarChart$3$a */
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
                HMLog.info(ChartHelper.b, new a(index));
                BarChartVo barChartVo = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index.getDataIndex());
                if (barChartVo != null) {
                    Function4<Index, Pair<Float, Float>, Pair<Float, Float>, String, Unit> function4 = onTouchBarDownValue;
                    BarChartVo<Float> rawBarChartVo = DataConverterKt.toRawBarChartVo(barChartVo);
                    function4.invoke(index, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
                }
                if (barChartVo == null) {
                    onTouchEmptyArea.getA();
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index) {
                onTouchBarUpValue.getA();
            }
        });
    }

    public final void refreshChart(@NotNull final ViewGroup chartParent, @NotNull final LineChartBuilder builder, @NotNull final Function2<? super Index, ? super HealthChartDataVo, Unit> onTouchPointDownValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        HMLog.info(b, new c(builder));
        SparseArray sparseArray = new SparseArray();
        for (HealthChartDataVo healthChartDataVo : builder.getPoints()) {
            Float floatOrNull = k.toFloatOrNull(healthChartDataVo.getValue());
            if (floatOrNull != null) {
                sparseArray.put(healthChartDataVo.getIndex(), new ChartData(healthChartDataVo.getIndex(), floatOrNull.floatValue()));
            }
        }
        final ChartDataList chartDataList = new ChartDataList(sparseArray);
        final int iKeyAt = builder.getXAxisData().keyAt(0);
        final int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        final float value = builder.getYAxisData().get(0).getValue();
        final float value2 = (builder.getYMaxValue() > 0.0f ? 1 : (builder.getYMaxValue() == 0.0f ? 0 : -1)) == 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue() : builder.getYMaxValue();
        final boolean z = sparseArray.size() != 0;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 38;
        if (z) {
            intRef.element = 38 | 16384 | 128;
        }
        ChartProvider chartProvider = new ChartProvider(this.context);
        final float fK = k(chartParent) - 50.0f;
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getB() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
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
                return ChartHelper.this.e(chartParent).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(ChartHelper.this.context).setLineColor(builder.getThemeColor()).setLineStyle(4).setShadowColors(new int[]{builder.getGradientStartColor(), builder.getGradientEndColor()}).setInteractiveSlide(true).create()).setNoDataStyle(ChartHelper.this.f()).setAxisStyle(ChartHelper.this.d(intRef.element, z, fK, builder.getXAxisData(), builder.getYAxisData()).create()).setLineJoinStyle(new LineJoinStyle.Builder(ChartHelper.this.context).setLineJointStyle(32).setLineJointColor(builder.getThemeColor()).setLineJointSize(ChartUtil.dp2px(ChartHelper.this.context, 4.0f)).setInteractiveType(64).setInteractiveLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 1.0f)).setEdgeColor(-1).setEdgeWidth(ChartUtil.dp2px(ChartHelper.this.context, 1.0f)).setInteractiveUpCancel(true).setDownSameCancel(true).create()).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshChart.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshChart$3$a */
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
                HMLog.info(ChartHelper.b, new a(index));
                HealthChartDataVo healthChartDataVo2 = (HealthChartDataVo) CollectionsKt.getOrNull(CollectionsKt___CollectionsKt.sortedWith(builder.getPoints(), new Comparator() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshChart$3$onDown$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((HealthChartDataVo) t).getIndex()), Integer.valueOf(((HealthChartDataVo) t2).getIndex()));
                    }
                }), index.getDataIndex());
                if (healthChartDataVo2 == null) {
                    return;
                }
                onTouchPointDownValue.invoke(index, healthChartDataVo2);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index index) {
                onTouchEmptyArea.getA();
            }
        });
    }

    public final void refreshMixLineChart(@NotNull final ViewGroup chartParent, @NotNull final SubLineAndPointsChartBuilder builder, @NotNull final Function2<? super Index, ? super HealthChartDataVo, Unit> onTouchPointDownValue, @NotNull final Function0<Unit> onTouchEmptyArea) {
        HMLog.info(b, new d(builder));
        SparseArray sparseArray = new SparseArray();
        for (HealthChartDataVo healthChartDataVo : builder.getPoints()) {
            Float floatOrNull = k.toFloatOrNull(healthChartDataVo.getValue());
            if (floatOrNull != null) {
                final float fFloatValue = floatOrNull.floatValue();
                int index = healthChartDataVo.getIndex();
                ChartData chartData = new ChartData(healthChartDataVo.getIndex(), fFloatValue);
                chartData.addExtends(new IDataExtendListener() { // from class: on0
                    @Override // com.huami.chart.listener.IDataExtendListener
                    public final Object get(BaseIndex baseIndex) {
                        return ChartHelper.l(builder, fFloatValue, baseIndex);
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
        final float value2 = (builder.getYMaxValue() > 0.0f ? 1 : (builder.getYMaxValue() == 0.0f ? 0 : -1)) == 0 ? builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue() : builder.getYMaxValue();
        final boolean z = sparseArray.size() != 0;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 38;
        if (z) {
            intRef.element = 38 | 16384 | 128;
        }
        ChartProvider chartProvider = new ChartProvider(this.context);
        final float fK = k(chartParent) - 50.0f;
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshMixLineChart.2
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getB() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getG() {
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
                return ChartHelper.this.e(chartParent).create();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return new RenderConfig.Builder().setLineStyle(new LineStyle.Builder(ChartHelper.this.context).setLineColor(builder.getLineColor()).setLineStyle(4).setShadowColors(builder.getShadowColor()).setSubLinecolor(builder.getSubLineColor()).setSubPoints(builder.getSubPointIndex()).setSubPointRadius(ChartUtil.dp2px(ChartHelper.this.context, builder.getSubPointRadius())).setSubPointColor(builder.getSubPointNormalColor()).setInteractiveUpCancel(true).setDisconnectLineGap(builder.getDisConnectLineGap()).setInteractiveType(32).setHighlightLineWidth(ChartUtil.dp2px(ChartHelper.this.context, 1.0f)).setHighlightLineColor(Color.parseColor(ChartConstantsKt.INTERACTIVE_LINE_COLOR)).setDividerValue(builder.getDividerValue()).setAboveDividerLineColor(builder.getAboveColor()).setBelowDividerLineColor(builder.getNormalColor()).setInteractiveSlide(true).create()).setNoDataStyle(ChartHelper.this.f()).setAxisStyle(ChartHelper.this.d(intRef.element, z, fK, builder.getXAxisData(), builder.getYAxisData()).create()).create();
            }
        }, true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper.refreshMixLineChart.3

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshMixLineChart$3$a */
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
            public void onDown(@NotNull Index index2) {
                HMLog.info(ChartHelper.b, new a(index2));
                HealthChartDataVo healthChartDataVo2 = (HealthChartDataVo) CollectionsKt.getOrNull(CollectionsKt___CollectionsKt.sortedWith(builder.getPoints(), new Comparator() { // from class: com.xiaomi.hm.health.healthdata.utils.ChartHelper$refreshMixLineChart$3$onDown$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((HealthChartDataVo) t).getIndex()), Integer.valueOf(((HealthChartDataVo) t2).getIndex()));
                    }
                }), index2.getDataIndex());
                if (healthChartDataVo2 == null) {
                    return;
                }
                onTouchPointDownValue.invoke(index2, healthChartDataVo2);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index index2) {
                onTouchEmptyArea.getA();
            }
        });
    }
}
