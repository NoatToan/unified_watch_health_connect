package com.huami.bloodpressure_ui.chart;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.chart.HMChart;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.ColorSegmentBar;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.helper.ChartBuildKt;
import com.huami.chart.helper.CommonChartProvider;
import com.huami.chart.helper.DataConfig;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.helper.MultiLineConfig;
import com.huami.chart.listener.ITouchListener;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.BarStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.MultiLineStyle;
import com.huami.chart.style.NoDataStyle;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.HMColor;
import com.huami.chart.util.HMGradientDrawableRectValue;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import defpackage.ec4;
import defpackage.nc4;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b(\b\u0000\u0018\u0000 p2\u00020\u0001:\u0001pB#\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010E\u001a\u00020\b\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u000104¢\u0006\u0004\bn\u0010oJ8\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J<\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0002H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0005H\u0002JB\u00101\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0018\u0010/\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-0+j\u0002`.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010,Jú\u0001\u0010B\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2U\u00109\u001aQ\u0012\u0004\u0012\u00020,\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u000103\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u000103\u0012\u0015\u0012\u0013\u0018\u000104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020-02j\u0002`82\u0010\u0010<\u001a\f\u0012\u0004\u0012\u00020-0:j\u0002`;2\u0018\u0010>\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020-0+j\u0002`=2\n\b\u0002\u00100\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010?\u001a\u00020\u00152C\b\u0002\u0010A\u001a=\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0015\u0012\u0013\u0018\u000104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020-\u0018\u000102j\u0004\u0018\u0001`@R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010CR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010DR\u0018\u0010H\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010JR\u0016\u0010M\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010LR\u0016\u0010N\u001a\u00020I8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010JR\u001d\u0010R\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010T\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bS\u0010QR\u001d\u0010V\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010O\u001a\u0004\bU\u0010QR\u001d\u0010X\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010O\u001a\u0004\bW\u0010QR\u001d\u0010[\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010QR\u001d\u0010]\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010O\u001a\u0004\b\\\u0010QR\u001d\u0010_\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\b^\u0010QR\u001d\u0010b\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010O\u001a\u0004\b`\u0010aR\u001d\u0010d\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\bc\u0010aR\u001d\u0010f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\be\u0010aR\u001d\u0010h\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bg\u0010aR\u001d\u0010j\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bi\u0010aR\u001d\u0010l\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010O\u001a\u0004\bY\u0010kR\u0016\u0010m\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bg\u0010D¨\u0006q"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "chartList", "", "chartStart", "chartEnd", "", "min", "max", "Lcom/huami/chart/data/ChartDataList;", "a", "Lcom/huami/bloodpressure_ui/chart/IBloodPressureChartBuilder;", "", "builder", "h", "Landroid/view/ViewGroup;", "chartParent", "Lcom/huami/chart/provider/DrawConfig$Builder;", "f", "", "hasData", "chartWidth", "showAvg", "Lcom/huami/chart/provider/RenderConfig;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bloodpressure_ui/chart/ChartBarColor;", "e", "axisStyle", "zeroX", "Lcom/huami/chart/data/XAxisData;", "xAxisData", "Lcom/huami/chart/data/YAxisData;", "yAxisData", "Lcom/huami/chart/style/AxisStyle$Builder;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/style/NoDataStyle;", "g", z.j, "i", "Lkotlin/Function1;", "Lcom/huami/chart/util/Index;", "", "Lcom/huami/bloodpressure_ui/chart/OnIndexTouch;", "onIndexTouch", "defaultIndex", "refreshMultiConfig", "Lkotlin/Function4;", "Lkotlin/Pair;", "", "Lkotlin/ParameterName;", "name", "date", "Lcom/huami/bloodpressure_ui/chart/OnTouchBarDownValue;", "onTouchBarDownValue", "Lkotlin/Function0;", "Lcom/huami/bloodpressure_ui/chart/OnTouchBarUpValue;", "onTouchBarUpValue", "Lcom/huami/bloodpressure_ui/chart/OnTouchEmptyArea;", "onTouchEmptyArea", "showMultiLine", "Lcom/huami/bloodpressure_ui/chart/OnAvgTouchBarDownValue;", "onAvgTouchBarDownValue", "refreshAnimationBarChart", "Landroid/content/Context;", "F", "barLineWidth", "c", "Ljava/lang/String;", "tag", "", LogUtil.D, "DEFAULT_ALPHA", LogUtil.I, "DEFAULT_ALPHA_INT", "END_ALPHA", "Lkotlin/Lazy;", "r", "()I", "s4Color", DTransferConstants.SEARCH_KEY, "s3Color", "l", "p3Color", "m", "s16Color", hl.k, GoogleApiAvailabilityLight.b, "s1Color", "o", "s2Color", com.google.android.exoplayer2.text.ttml.b.r, "s38Color", "u", "()F", "size2", "v", "size3", "w", "sizeHalf3", "t", "size12", SOAP.XMLNS, "size11", "()Ljava/lang/String;", "emptyStr", "defaultDataPointRadius", "<init>", "(Landroid/content/Context;FLjava/lang/String;)V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureChartHelper {
    public static final int DEFAULT_GAP = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float barLineWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double DEFAULT_ALPHA;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int DEFAULT_ALPHA_INT;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double END_ALPHA;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy s4Color;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy s3Color;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy p3Color;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy s16Color;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy s1Color;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy s2Color;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy s38Color;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy size2;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy size3;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy sizeHalf3;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy size12;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy size11;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyStr;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final float defaultDataPointRadius;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return BloodPressureChartHelper.this.context.getString(R.string.blood_pressure_no_data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.blood_pressure_sbp);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<RenderConfig.Builder, Boolean, Unit> {
        public final /* synthetic */ MultiLineConfig b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ IBloodPressureChartBuilder<Number> d;
        public final /* synthetic */ ViewGroup e;
        public final /* synthetic */ ChartDataList f;
        public final /* synthetic */ float g;
        public final /* synthetic */ ChartDataList h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/LineStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<LineStyle.Builder, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ ChartDataList b;
            public final /* synthetic */ float c;
            public final /* synthetic */ BloodPressureChartHelper d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, ChartDataList chartDataList, float f, BloodPressureChartHelper bloodPressureChartHelper) {
                super(1);
                this.a = z;
                this.b = chartDataList;
                this.c = f;
                this.d = bloodPressureChartHelper;
            }

            public final void a(@NotNull LineStyle.Builder builder) {
                if (this.a) {
                    builder.setGradientDrawableRectValue(new HMGradientDrawableRectValue(0.0f, this.b.getMaxDataValue(), 0.0f, this.c, 5, null));
                }
                builder.setSinglePointSize(this.d.w());
                builder.setGapPointSize((int) this.d.w());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LineStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/MultiLineStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<MultiLineStyle.Builder, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ ChartDataList b;
            public final /* synthetic */ BloodPressureChartHelper c;
            public final /* synthetic */ ChartDataList d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, ChartDataList chartDataList, BloodPressureChartHelper bloodPressureChartHelper, ChartDataList chartDataList2) {
                super(1);
                this.a = z;
                this.b = chartDataList;
                this.c = bloodPressureChartHelper;
                this.d = chartDataList2;
            }

            public final void a(@NotNull MultiLineStyle.Builder builder) {
                HMGradientDrawableRectValue hMGradientDrawableRectValue;
                if (this.a) {
                    HMGradientDrawableRectValue[] hMGradientDrawableRectValueArr = new HMGradientDrawableRectValue[1];
                    ChartDataList chartDataList = this.b;
                    if (chartDataList == null) {
                        hMGradientDrawableRectValue = null;
                    } else {
                        hMGradientDrawableRectValue = new HMGradientDrawableRectValue(0.0f, chartDataList.getMaxDataValue(), 0.0f, this.d.getMaxDataValue(), 5, null);
                    }
                    hMGradientDrawableRectValueArr[0] = hMGradientDrawableRectValue;
                    builder.setGradientDrawableRectValues(hMGradientDrawableRectValueArr);
                }
                builder.setSinglePointSize(this.c.w());
                builder.setGapPointSize(this.c.w());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MultiLineStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.bloodpressure_ui.chart.BloodPressureChartHelper$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/NoDataStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0306c extends Lambda implements Function1<NoDataStyle.Builder, Unit> {
            public final /* synthetic */ BloodPressureChartHelper a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0306c(BloodPressureChartHelper bloodPressureChartHelper) {
                super(1);
                this.a = bloodPressureChartHelper;
            }

            public final void a(@NotNull NoDataStyle.Builder builder) {
                builder.setNoDataLabelColor(this.a.o());
                builder.setNoDataLabelSize(this.a.t());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NoDataStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/AxisStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<AxisStyle.Builder, Unit> {
            public final /* synthetic */ IBloodPressureChartBuilder<Number> a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ BloodPressureChartHelper c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(IBloodPressureChartBuilder<Number> iBloodPressureChartBuilder, boolean z, BloodPressureChartHelper bloodPressureChartHelper) {
                super(1);
                this.a = iBloodPressureChartBuilder;
                this.b = z;
                this.c = bloodPressureChartHelper;
            }

            public final void a(@NotNull AxisStyle.Builder builder) {
                SparseArray<YAxisData> yAxisData;
                YAxisData yAxisDataValueAt = this.a.getYAxisData().valueAt(0);
                if (this.b) {
                    yAxisData = this.a.getYAxisData();
                } else {
                    SparseArray<YAxisData> sparseArray = new SparseArray<>(1);
                    sparseArray.put(0, yAxisDataValueAt);
                    yAxisData = sparseArray;
                }
                int i = (this.a.getYScaleLongDash() ? 32768 : 16384) | 38;
                boolean z = this.b;
                if (z) {
                    i |= 128;
                }
                BloodPressureChartHelper bloodPressureChartHelper = this.c;
                builder.setLabelCenter(true);
                builder.setAxisStyle(i);
                builder.setXLabelColor(bloodPressureChartHelper.n());
                builder.setXLabelSize(bloodPressureChartHelper.t());
                builder.setYAxisData(yAxisData);
                builder.setXAxisLineColor(z ? 0 : bloodPressureChartHelper.r());
                builder.setYAxisScaleLineColor(bloodPressureChartHelper.r());
                builder.setYAxisLineColor(0);
                builder.setYLabelSize(bloodPressureChartHelper.s());
                builder.setYLabelColor(bloodPressureChartHelper.q());
                builder.setXAxisLineColor(0);
                builder.setXLabelSupportAnimation(true);
                builder.setBottomIndicatorShape(z ? 10 : 9);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AxisStyle.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MultiLineConfig multiLineConfig, boolean z, IBloodPressureChartBuilder<Number> iBloodPressureChartBuilder, ViewGroup viewGroup, ChartDataList chartDataList, float f, ChartDataList chartDataList2) {
            super(2);
            this.b = multiLineConfig;
            this.c = z;
            this.d = iBloodPressureChartBuilder;
            this.e = viewGroup;
            this.f = chartDataList;
            this.g = f;
            this.h = chartDataList2;
        }

        public final void a(@NotNull RenderConfig.Builder builder, boolean z) {
            builder.setNoDataStyle(BloodPressureChartHelper.this.g());
            ChartBuildKt.lineConfig$default(builder, BloodPressureChartHelper.this.context, 0, BloodPressureChartHelper.this.m(), new int[]{ViewExKt.addAlpha(BloodPressureChartHelper.this.m(), BloodPressureChartHelper.this.DEFAULT_ALPHA), ViewExKt.addAlpha(BloodPressureChartHelper.this.m(), BloodPressureChartHelper.this.END_ALPHA)}, 6, 0.0f, BloodPressureChartHelper.this.defaultDataPointRadius, 0.0f, 0, 0, new a(this.c, this.f, this.g, BloodPressureChartHelper.this), 930, null);
            ChartBuildKt.multiLineConfig(builder, this.b, new b(this.c, this.h, BloodPressureChartHelper.this, this.f));
            ChartBuildKt.emptyDataConfig(builder, BloodPressureChartHelper.this.context, BloodPressureChartHelper.this.k(), new C0306c(BloodPressureChartHelper.this));
            ChartBuildKt.axisConfig(builder, BloodPressureChartHelper.this.context, this.c, this.d.getXAxisData(), this.d.getYAxisData(), BloodPressureChartHelper.this.j(this.e) - HMChartHelperKt.getDpToPx(16), new d(this.d, this.c, BloodPressureChartHelper.this));
            ChartBuildKt.interactiveLineConfig$default(builder, BloodPressureChartHelper.this.context, 16, BloodPressureChartHelper.this.v(), Integer.valueOf(BloodPressureChartHelper.this.m()), null, 16, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, Boolean bool) {
            a(builder, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.blood_pressure_dbp);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.s1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Integer> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.s2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Integer> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.s38);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Integer> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.s3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Integer> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return ContextCompat.getColor(BloodPressureChartHelper.this.context, R.color.s4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Float> {
        public j() {
            super(0);
        }

        public final float a() {
            return ChartUtil.dp2px(BloodPressureChartHelper.this.context, 12.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Float> {
        public k() {
            super(0);
        }

        public final float a() {
            return ChartUtil.dp2px(BloodPressureChartHelper.this.context, 12.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<Float> {
        public l() {
            super(0);
        }

        public final float a() {
            return ChartUtil.dp2px(BloodPressureChartHelper.this.context, 2.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<Float> {
        public m() {
            super(0);
        }

        public final float a() {
            return ChartUtil.dp2px(BloodPressureChartHelper.this.context, 3.0f);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Float> {
        public n() {
            super(0);
        }

        public final float a() {
            return ChartUtil.dp2px(BloodPressureChartHelper.this.context, 1.5f);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Float getA() {
            return Float.valueOf(a());
        }
    }

    public BloodPressureChartHelper(@NotNull Context context, float f2, @Nullable String str) {
        this.context = context;
        this.barLineWidth = f2;
        this.tag = str;
        this.DEFAULT_ALPHA = 0.6d;
        this.DEFAULT_ALPHA_INT = (int) (0.6d * ((double) 255));
        this.s4Color = LazyKt__LazyJVMKt.lazy(new i());
        this.s3Color = LazyKt__LazyJVMKt.lazy(new h());
        this.p3Color = LazyKt__LazyJVMKt.lazy(new b());
        this.s16Color = LazyKt__LazyJVMKt.lazy(new d());
        this.s1Color = LazyKt__LazyJVMKt.lazy(new e());
        this.s2Color = LazyKt__LazyJVMKt.lazy(new f());
        this.s38Color = LazyKt__LazyJVMKt.lazy(new g());
        this.size2 = LazyKt__LazyJVMKt.lazy(new l());
        this.size3 = LazyKt__LazyJVMKt.lazy(new m());
        this.sizeHalf3 = LazyKt__LazyJVMKt.lazy(new n());
        this.size12 = LazyKt__LazyJVMKt.lazy(new k());
        this.size11 = LazyKt__LazyJVMKt.lazy(new j());
        this.emptyStr = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final ChartDataList a(SparseArray<ChartData> chartList, int chartStart, int chartEnd, float min, float max) {
        ChartDataList chartDataList = new ChartDataList(chartList);
        chartDataList.setStart(chartStart);
        chartDataList.setEnd(chartEnd);
        chartDataList.setMinValue(min);
        chartDataList.setMaxValue(max);
        return chartDataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig b(boolean hasData, IBloodPressureChartBuilder<Number> builder, int chartWidth, boolean showAvg) {
        SparseArray<YAxisData> yAxisData;
        YAxisData yAxisDataValueAt = builder.getYAxisData().valueAt(0);
        builder.getYAxisData().valueAt(builder.getYAxisData().size() - 1);
        if (hasData) {
            yAxisData = builder.getYAxisData();
        } else {
            SparseArray<YAxisData> sparseArray = new SparseArray<>(1);
            sparseArray.put(0, yAxisDataValueAt);
            yAxisData = sparseArray;
        }
        int i2 = (builder.getYScaleLongDash() ? 32768 : 16384) | 38;
        if (hasData) {
            i2 |= 128;
        }
        int i3 = i2;
        float f2 = chartWidth - 50.0f;
        i();
        ChartBarColor chartBarColorE = e(this.context);
        int color = ContextCompat.getColor(this.context, R.color.blood_pressure_dbp);
        int color2 = ContextCompat.getColor(this.context, R.color.blood_pressure_sbp);
        float fU = u();
        return new RenderConfig.Builder().setAxisStyle(d(i3, hasData, f2, builder.getXAxisData(), yAxisData).setXAxisLineColor(0).setXLabelSupportAnimation(true).setBottomIndicatorShape(hasData ? 10 : 9).setBottomIndicatorCircleRadius(ChartUtil.dp2px(this.context, 10.0f)).setXLabelMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setXMovableLabelMarginTop(ChartUtil.dp2px(this.context, 15.0f)).setBottomIndicatorBackgroundMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setBottomIndicatorShapeMarginTop(ChartUtil.dp2px(this.context, 5.0f)).setBottomIndicatorBackgroundHeight(ChartUtil.dp2px(this.context, 15.0f)).setBottomIndicatorBackgroundColor(ContextCompat.getColor(this.context, R.color.blood_pressure_s10)).setBottomIndicatorTintColor(ContextCompat.getColor(this.context, R.color.blood_pressure_s39)).setInteractiveUpCancel(false).setXLabelColor(ContextCompat.getColor(this.context, R.color.blood_pressure_s1)).create()).setNoDataStyle(g()).setBarStyle(new BarStyle.Builder(this.context).setBarStyle(8).setFingerUpHighlightCancel(false).setInteractiveSlide(true).setInteractiveUpCancel(false).setSupportRadian(true).setRadianValues(new float[]{fU, fU, fU, fU, fU, fU, fU, fU}).setOverlapColor(chartBarColorE.getInterColor()).setHighlightContrast(chartBarColorE.getAlpha()).setInteractiveType(4).setHighlightBorderColor(p()).setHighlightBorderStrokeWidth(u()).setInteractiveLineColor(q()).create()).setMultiLineStyle(new MultiLineStyle.Builder(this.context).setLineColors(new int[]{color, color2}).setLineWidth(w()).setLineStyle(4).setIntersectionPointColor(new int[]{color, color2}).setIntersectionPointBorderWidth(ChartUtil.dp2px(this.context, 1.0f)).setIntersectionPointSize(10.0f).create()).create();
    }

    public static /* synthetic */ RenderConfig c(BloodPressureChartHelper bloodPressureChartHelper, boolean z, IBloodPressureChartBuilder iBloodPressureChartBuilder, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return bloodPressureChartHelper.b(z, iBloodPressureChartBuilder, i2, z2);
    }

    private final AxisStyle.Builder d(int axisStyle, boolean hasData, float zeroX, SparseArray<XAxisData> xAxisData, SparseArray<YAxisData> yAxisData) {
        return new AxisStyle.Builder(this.context).setAxisStyle(axisStyle).setZeroX(zeroX).setZeroY(ChartUtil.dp2px(this.context, 20.0f)).setLabelCenter(true).setXLabelColor(ContextCompat.getColor(this.context, R.color.blood_pressure_s1)).setXAxisLineColor(hasData ? 0 : Color.parseColor("#F2F2F2")).setXLabelSize(ChartUtil.sp2px(this.context, 12.0f)).setXAxisData(xAxisData).setYAxisScaleLineColor(r()).setYAxisLineColor(0).setYLabelSize(ChartUtil.sp2px(this.context, 11.0f)).setXLabelMarginTop(ChartUtil.dp2px(this.context, 4.0f)).setXAxisMarginLeft(ChartUtil.dp2px(this.context, 15.0f)).setXAxisMarginRight(ChartUtil.dp2px(this.context, 45.0f)).setYAxisData(yAxisData).setYLabelColor(q()).setYAxisRight(true);
    }

    private final ChartBarColor e(Context context) {
        int color = ContextCompat.getColor(context, R.color.blood_pressure_dbp);
        int color2 = ContextCompat.getColor(context, R.color.blood_pressure_sbp);
        return new ChartBarColor(new HMColor[]{new HMColor(color, color), new HMColor(color2, color2)}, new HMColor(ContextCompat.getColor(context, R.color.blood_pressure_inter)), this.DEFAULT_ALPHA_INT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig.Builder f(ViewGroup chartParent) {
        return new DrawConfig.Builder(this.context).setCanvasHeight(i()).setCanvasWidth(j(chartParent)).setDataMarginTop(ChartUtil.dp2px(this.context, 15.0f)).setDataMarginLeft(ChartUtil.dp2px(this.context, 30.0f)).setDataMarginRight(ChartUtil.dp2px(this.context, 60.0f)).setDataMarginBottom(ChartUtil.dp2px(this.context, 20.0f)).setDataWidth(this.barLineWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NoDataStyle g() {
        return new NoDataStyle.Builder(this.context).setNoDataStyle(2).setNoDataLabel(this.context.getString(R.string.blood_pressure_no_data)).setNoDataLabelColor(ContextCompat.getColor(this.context, R.color.blood_pressure_s2)).setNoDataLabelSize(ChartUtil.sp2px(this.context, 12.0f)).create();
    }

    private final ChartDataList h(IBloodPressureChartBuilder<Number> builder) {
        SparseArray sparseArray = new SparseArray();
        Iterator<T> it2 = builder.getPoints().iterator();
        while (it2.hasNext()) {
            BarChartVo barChartVo = (BarChartVo) it2.next();
            ColorSegmentBar[] colorSegmentBarArr = new ColorSegmentBar[2];
            Pair lowValue = barChartVo.getLowValue();
            ColorSegmentBar colorSegmentBar = null;
            colorSegmentBarArr[0] = lowValue == null ? null : new ColorSegmentBar(((Number) lowValue.getFirst()).floatValue(), ((Number) lowValue.getSecond()).floatValue(), m());
            Pair highValue = barChartVo.getHighValue();
            if (highValue != null) {
                colorSegmentBar = new ColorSegmentBar(((Number) highValue.getFirst()).floatValue(), ((Number) highValue.getSecond()).floatValue(), l());
            }
            colorSegmentBarArr[1] = colorSegmentBar;
            sparseArray.put(barChartVo.getIndex(), new ChartData(barChartVo.getIndex(), colorSegmentBarArr));
        }
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

    private final int i() {
        return (int) ChartUtil.dp2px(this.context, 180.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j(ViewGroup chartParent) {
        int width = chartParent.getWidth();
        return width == 0 ? this.context.getResources().getDisplayMetrics().widthPixels : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k() {
        return (String) this.emptyStr.getValue();
    }

    private final int l() {
        return ((Number) this.p3Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m() {
        return ((Number) this.s16Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n() {
        return ((Number) this.s1Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o() {
        return ((Number) this.s2Color.getValue()).intValue();
    }

    private final int p() {
        return ((Number) this.s38Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return ((Number) this.s3Color.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return ((Number) this.s4Color.getValue()).intValue();
    }

    public static /* synthetic */ void refreshMultiConfig$default(BloodPressureChartHelper bloodPressureChartHelper, ViewGroup viewGroup, IBloodPressureChartBuilder iBloodPressureChartBuilder, Function1 function1, Index index, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            index = null;
        }
        bloodPressureChartHelper.refreshMultiConfig(viewGroup, iBloodPressureChartBuilder, function1, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float s() {
        return ((Number) this.size11.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float t() {
        return ((Number) this.size12.getValue()).floatValue();
    }

    private final float u() {
        return ((Number) this.size2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float v() {
        return ((Number) this.size3.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float w() {
        return ((Number) this.sizeHalf3.getValue()).floatValue();
    }

    public final void refreshAnimationBarChart(@NotNull final ViewGroup chartParent, @NotNull final IBloodPressureChartBuilder<Number> builder, @NotNull final Function4<? super Index, ? super Pair<Float, Float>, ? super Pair<Float, Float>, ? super String, Unit> onTouchBarDownValue, @NotNull Function0<Unit> onTouchBarUpValue, @NotNull final Function1<? super Index, Unit> onTouchEmptyArea, @Nullable final Index defaultIndex, final boolean showMultiLine, @Nullable final Function4<? super Index, ? super Float, ? super Float, ? super String, Unit> onAvgTouchBarDownValue) {
        Index index;
        BarChartVo barChartVo;
        final boolean z = !builder.getPoints().isEmpty();
        final ChartProvider chartProvider = new ChartProvider(this.context);
        Integer barMaxSize = builder.getBarMaxSize();
        Float fValueOf = barMaxSize == null ? null : Float.valueOf(j(chartParent) / barMaxSize.intValue());
        final float fFloatValue = fValueOf == null ? this.barLineWidth : fValueOf.floatValue();
        final ChartDataList chartDataListH = h(builder);
        chartProvider.createAutoAdjustChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartHelper.refreshAnimationBarChart.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer, reason: from getter */
            public ViewGroup getD() {
                return chartParent;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList, reason: from getter */
            public ChartDataList getG() {
                return chartDataListH;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @Nullable
            public Index getCurrentIndex() {
                if (!z) {
                    return null;
                }
                Index index2 = defaultIndex;
                if (index2 != null) {
                    return index2;
                }
                return new Index(getG().getCount() - 1, getG().getLastData().getBaseIndex());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                DrawConfig.Builder builderF = BloodPressureChartHelper.this.f(chartParent);
                float f2 = fFloatValue;
                BloodPressureChartHelper bloodPressureChartHelper = BloodPressureChartHelper.this;
                builderF.setDataWidth(f2);
                builderF.setDataMarginBottom(ChartUtil.dp2px(bloodPressureChartHelper.context, 25.0f));
                return builderF.create();
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @Nullable
            /* JADX INFO: renamed from: getMultiChartDataList */
            public ChartDataList[] getMultiList() {
                if (!showMultiLine) {
                    return ec4.a(this);
                }
                ChartDataList[] avgPoints = builder.getAvgPoints();
                return avgPoints == null ? ec4.a(this) : avgPoints;
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                BloodPressureChartHelper bloodPressureChartHelper = BloodPressureChartHelper.this;
                return bloodPressureChartHelper.b(z, builder, bloodPressureChartHelper.j(chartParent), showMultiLine);
            }
        }, z, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartHelper.refreshAnimationBarChart.2

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.chart.BloodPressureChartHelper$refreshAnimationBarChart$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "ChartHelper Error " + this.a;
                }
            }

            private final Index a(HMChart hmChart, Index curIndex) {
                return hmChart.getHmDataCacheCenter().getIndexByPosition(hmChart.getHmDataCacheCenter().getPositionByPosIndex(curIndex.getPosiIndex().getIndex()) * hmChart.getInteractiveManager().getScaleFactorX(), 0.0f);
            }

            private final Index b(HMChart hmChart, Index curIndex, ChartDataList chartDataList) {
                return hmChart.getHmDataCacheCenter().getMultiIndexByPosition(hmChart.getHmDataCacheCenter().getPositionByPosIndex(curIndex.getPosiIndex().getIndex()) * hmChart.getInteractiveManager().getScaleFactorX(), 0.0f, chartDataList);
            }

            private final void c(Index index2) {
                BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index2.getDataIndex());
                if (barChartVo2 == null) {
                    return;
                }
                boolean z2 = showMultiLine;
                Function4<Index, Float, Float, String, Unit> function4 = onAvgTouchBarDownValue;
                Function4<Index, Pair<Float, Float>, Pair<Float, Float>, String, Unit> function5 = onTouchBarDownValue;
                BarChartVo<Float> rawBarChartVo = IBloodPressureChartBuilderKt.toRawBarChartVo(barChartVo2);
                if (!z2) {
                    function5.invoke(index2, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
                } else {
                    if (function4 == null) {
                        return;
                    }
                    Pair<Float, Float> avgValue = rawBarChartVo.getAvgValue();
                    Float first = avgValue == null ? null : avgValue.getFirst();
                    Pair<Float, Float> avgValue2 = rawBarChartVo.getAvgValue();
                    function4.invoke(index2, first, avgValue2 != null ? avgValue2.getSecond() : null, rawBarChartVo.getExtra());
                }
            }

            private final void d(Index index2) {
                if (!showMultiLine) {
                    onTouchEmptyArea.invoke(index2);
                    return;
                }
                Function4<Index, Float, Float, String, Unit> function4 = onAvgTouchBarDownValue;
                if (function4 == null) {
                    return;
                }
                function4.invoke(index2, null, null, null);
            }

            private final void e(HMChart hmChart, Index index2) {
                if (!showMultiLine) {
                    BarChartVo barChartVo2 = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), a(hmChart, index2).getDataIndex());
                    if (barChartVo2 == null) {
                        onTouchEmptyArea.invoke(index2);
                        return;
                    } else {
                        BarChartVo<Float> rawBarChartVo = IBloodPressureChartBuilderKt.toRawBarChartVo(barChartVo2);
                        onTouchBarDownValue.invoke(index2, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
                        return;
                    }
                }
                if (builder.getAvgPoints() == null) {
                    Function4<Index, Float, Float, String, Unit> function4 = onAvgTouchBarDownValue;
                    if (function4 == null) {
                        return;
                    }
                    function4.invoke(index2, null, null, null);
                    return;
                }
                ChartDataList[] avgPoints = builder.getAvgPoints();
                if (avgPoints == null) {
                    return;
                }
                IBloodPressureChartBuilder<Number> iBloodPressureChartBuilder = builder;
                Function4<Index, Float, Float, String, Unit> function5 = onAvgTouchBarDownValue;
                Index indexB = b(hmChart, index2, avgPoints[0]);
                BarChartVo barChartVo3 = (BarChartVo) CollectionsKt.getOrNull(iBloodPressureChartBuilder.getPoints(), indexB.getDataIndex());
                if (barChartVo3 == null) {
                    if (function5 == null) {
                        return;
                    }
                    function5.invoke(index2, null, null, null);
                    return;
                }
                BarChartVo<Float> rawBarChartVo2 = IBloodPressureChartBuilderKt.toRawBarChartVo(barChartVo3);
                if (function5 == null) {
                    return;
                }
                Pair<Float, Float> avgValue = rawBarChartVo2.getAvgValue();
                Float first = avgValue == null ? null : avgValue.getFirst();
                Pair<Float, Float> avgValue2 = rawBarChartVo2.getAvgValue();
                function5.invoke(indexB, first, avgValue2 != null ? avgValue2.getSecond() : null, rawBarChartVo2.getExtra());
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index index2) {
                if (z) {
                    if (((BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index2.getDataIndex())) == null) {
                        d(index2);
                    } else {
                        c(index2);
                    }
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onTouchOutOfRange() {
                onTouchEmptyArea.invoke(null);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index index2) {
                Object objM3845constructorimpl;
                boolean z2 = z;
                ChartProvider chartProvider2 = chartProvider;
                try {
                    Result.Companion companion = Result.Companion;
                    if (z2) {
                        e(chartProvider2.getChart(), index2);
                    }
                    objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(BloodPressureConst.INSTANCE.getTAG(), new a(thM3848exceptionOrNullimpl));
                }
            }
        });
        if (!z) {
            index = null;
        } else if (defaultIndex == null) {
            index = new Index(chartDataListH.getCount() - 1, chartDataListH.getLastData().getBaseIndex());
        } else if (((BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), defaultIndex.getDataIndex())) != null) {
            index = defaultIndex;
        } else {
            ChartData lastData = chartDataListH.getLastData();
            index = new Index(lastData.getIndex(), lastData.getBaseIndex());
        }
        if (index == null || (barChartVo = (BarChartVo) CollectionsKt.getOrNull(builder.getPoints(), index.getDataIndex())) == null) {
            return;
        }
        BarChartVo<Float> rawBarChartVo = IBloodPressureChartBuilderKt.toRawBarChartVo(barChartVo);
        if (!showMultiLine) {
            onTouchBarDownValue.invoke(index, rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), rawBarChartVo.getExtra());
        } else {
            if (onAvgTouchBarDownValue == null) {
                return;
            }
            Pair<Float, Float> avgValue = rawBarChartVo.getAvgValue();
            Float first = avgValue == null ? null : avgValue.getFirst();
            Pair<Float, Float> avgValue2 = rawBarChartVo.getAvgValue();
            onAvgTouchBarDownValue.invoke(index, first, avgValue2 == null ? null : avgValue2.getSecond(), rawBarChartVo.getExtra());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.huami.chart.helper.DataConfig$MarginF, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void refreshMultiConfig(@NotNull ViewGroup chartParent, @NotNull IBloodPressureChartBuilder<Number> builder, @NotNull final Function1<? super Index, Unit> onIndexTouch, @Nullable Index defaultIndex) {
        ?? r13;
        ChartDataList chartDataListA;
        boolean z;
        ChartProvider chartProvider = new ChartProvider(this.context, true);
        MultiLineConfig multiLineConfig = new MultiLineConfig(this.context, 0, new int[]{l()}, false, new int[][]{new int[]{ViewExKt.addAlpha(l(), this.DEFAULT_ALPHA), ViewExKt.addAlpha(l(), this.END_ALPHA)}}, null, 0.0f, this.defaultDataPointRadius, 0.0f, 0, 6, 0, 2914, null);
        int iKeyAt = builder.getXAxisData().keyAt(0);
        int iKeyAt2 = builder.getXAxisData().keyAt(builder.getXAxisData().size() - 1);
        float value = builder.getYAxisData().get(0).getValue();
        float value2 = builder.getYAxisData().get(builder.getYAxisData().size() - 1).getValue();
        ChartDataList chartDataListA2 = a(builder.getDbpList(), iKeyAt, iKeyAt2, value, value2);
        SparseArray<ChartData> sbpList = builder.getSbpList();
        if (sbpList == null) {
            r13 = 0;
            chartDataListA = null;
        } else {
            r13 = 0;
            chartDataListA = a(sbpList, iKeyAt, iKeyAt2, value, value2);
        }
        SparseArray<ChartData> sbpList2 = builder.getSbpList();
        if (sbpList2 == null) {
            z = false;
        } else {
            z = sbpList2.size() != 0;
        }
        final boolean z2 = z;
        chartProvider.createAutoAdjustChart(new CommonChartProvider(this.context, chartParent, chartDataListA2, chartDataListA == null ? r13 : new ChartDataList[]{chartDataListA}, new DataConfig(((j(chartParent) - HMChartHelperKt.getDpToPx(14.0f)) - HMChartHelperKt.getDpToPx(43.0f)) / 288, r13, 2, r13), defaultIndex, new c(multiLineConfig, z, builder, chartParent, chartDataListA2, value, chartDataListA)), true, false);
        chartProvider.getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.bloodpressure_ui.chart.BloodPressureChartHelper.refreshMultiConfig.3
            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@Nullable Index i2) {
                if (z2) {
                    onIndexTouch.invoke(i2);
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@Nullable Index i2) {
                if (z2) {
                    onIndexTouch.invoke(i2);
                }
            }
        });
        if (z2) {
            if (defaultIndex != null) {
                onIndexTouch.invoke(defaultIndex);
            } else {
                onIndexTouch.invoke(new Index(chartDataListA2.getCount() - 1, chartDataListA2.getLastData().getBaseIndex()));
            }
        }
    }

    public /* synthetic */ BloodPressureChartHelper(Context context, float f2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f2, (i2 & 4) != 0 ? null : str);
    }
}
