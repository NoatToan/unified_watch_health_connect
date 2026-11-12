package com.huami.heartrate.chart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.RangeIndex;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.style.LineStyle;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.chart.util.ChartUtil;
import com.huami.chart.util.Index;
import com.huami.heartrate.R;
import com.huami.heartrate.chart.model.HRDayChartData;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001d\u0010\u001e\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001d\u0010$\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001d\u0010'\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d¨\u0006."}, d2 = {"Lcom/huami/heartrate/chart/HRCardChartHelper;", "Lcom/huami/heartrate/chart/BaseHRChartHelper;", "Lcom/huami/heartrate/chart/model/HRDayChartData;", "data", "", "colorArray", "Landroid/graphics/LinearGradient;", "i", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "l", "f", "", GoalLineStyleConstant.GOALS, "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "Lkotlin/collections/ArrayList;", "abnormalRange", "", "refreshLineChart", "m", "Ljava/lang/Float;", "containerWidth", GoogleApiAvailabilityLight.b, "containerHeight", "o", "Lkotlin/Lazy;", "g", "()[I", "hrLineColor", com.google.android.exoplayer2.text.ttml.b.r, z.j, "subLineColors", DTransferConstants.SEARCH_KEY, "h", "hrShadowColors", "r", hl.k, "subLineShadowColors", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/Float;Ljava/lang/Float;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HRCardChartHelper extends BaseHRChartHelper {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Float containerWidth;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final Float containerHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrLineColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy subLineColors;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrShadowColors;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy subLineShadowColors;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<int[]> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] invoke() {
            return new int[]{ContextCompat.getColor(this.a, R.color.p3), ContextCompat.getColor(this.a, R.color.p2)};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<int[]> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] invoke() {
            Context context = this.a;
            int i = R.color.p3;
            return new int[]{ColorUtils.setAlphaComponent(ContextCompat.getColor(context, i), 128), ColorUtils.setAlphaComponent(ContextCompat.getColor(this.a, i), 0)};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<int[]> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] invoke() {
            return new int[]{ContextCompat.getColor(this.a, R.color.s15), ContextCompat.getColor(this.a, R.color.s17)};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0015\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<int[]> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int[] invoke() {
            Context context = this.a;
            int i = R.color.s15;
            return new int[]{ColorUtils.setAlphaComponent(ContextCompat.getColor(context, i), 128), ColorUtils.setAlphaComponent(ContextCompat.getColor(this.a, i), 0)};
        }
    }

    public /* synthetic */ HRCardChartHelper(Context context, ViewGroup viewGroup, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float f(View view) {
        int measuredHeight = view.getMeasuredHeight();
        int height = view.getHeight();
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        if (height != 0) {
            return height;
        }
        Float f = this.containerHeight;
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] g() {
        return (int[]) this.hrLineColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] h() {
        return (int[]) this.hrShadowColors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearGradient i(HRDayChartData data, int[] colorArray) {
        float f = f(getContainer());
        if (data.getChartDataList() != null && data.getChartDataList().getCount() != 0) {
            float maxDataValue = data.getChartDataList().getMaxDataValue();
            float minDataValue = data.getChartDataList().getMinDataValue();
            float yMax = data.getYMax() - data.getYMin();
            if (!(yMax == 0.0f)) {
                if (!(f == 0.0f)) {
                    float f2 = yMax / f;
                    return new LinearGradient(0.0f, f - ((maxDataValue - data.getYMin()) / f2), 0.0f, f - ((minDataValue - data.getYMin()) / f2), colorArray, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] j() {
        return (int[]) this.subLineColors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] k() {
        return (int[]) this.subLineShadowColors.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float l(View view) {
        int measuredWidth = view.getMeasuredWidth();
        int width = view.getWidth();
        if (measuredWidth != 0) {
            return measuredWidth;
        }
        if (width == 0) {
            Float f = this.containerWidth;
            if (f != null) {
                return f.floatValue();
            }
            width = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        return width;
    }

    public final void refreshLineChart(@NotNull final HRDayChartData data, @Nullable final float[] goals, @NotNull final ArrayList<RangeIndex> abnormalRange) {
        ChartProvider chartProvider = new ChartProvider(getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), true);
        final boolean z = data.getChartDataList().getCount() > 0;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abnormalRange, 10));
        for (RangeIndex rangeIndex : abnormalRange) {
            arrayList2.add(Boolean.valueOf(arrayList.add(k())));
        }
        chartProvider.createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.heartrate.chart.HRCardChartHelper.refreshLineChart.2

            /* JADX INFO: renamed from: com.huami.heartrate.chart.HRCardChartHelper$refreshLineChart$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/provider/DrawConfig$Builder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<DrawConfig.Builder, DrawConfig.Builder> {
                public final /* synthetic */ HRCardChartHelper a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HRCardChartHelper hRCardChartHelper) {
                    super(1);
                    this.a = hRCardChartHelper;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DrawConfig.Builder invoke(@NotNull DrawConfig.Builder builder) {
                    builder.setDataMarginLeft(this.a.getMarginLeft());
                    builder.setDataMarginRight(this.a.getMarginLeft());
                    HRCardChartHelper hRCardChartHelper = this.a;
                    builder.setCanvasHeight(hRCardChartHelper.f(hRCardChartHelper.getContainer()));
                    HRCardChartHelper hRCardChartHelper2 = this.a;
                    return builder.setCanvasWidth(hRCardChartHelper2.l(hRCardChartHelper2.getContainer()));
                }
            }

            /* JADX INFO: renamed from: com.huami.heartrate.chart.HRCardChartHelper$refreshLineChart$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/AxisStyle$Builder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<AxisStyle.Builder, AxisStyle.Builder> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ HRCardChartHelper b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z, HRCardChartHelper hRCardChartHelper) {
                    super(1);
                    this.a = z;
                    this.b = hRCardChartHelper;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AxisStyle.Builder invoke(@NotNull AxisStyle.Builder builder) {
                    builder.setAxisStyle(this.a ? 38 : 4);
                    builder.setIndentHeadAndTail(true);
                    builder.setXLabelColor(HMChartHelperKt.getResColor$default(this.b.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), R.color.s2, 0.0f, 4, null));
                    return builder.setXLabelSize(ChartUtil.sp2px(this.b.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), 12.0f));
                }
            }

            /* JADX INFO: renamed from: com.huami.heartrate.chart.HRCardChartHelper$refreshLineChart$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/LineStyle$Builder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function1<LineStyle.Builder, LineStyle.Builder> {
                public final /* synthetic */ HRCardChartHelper a;
                public final /* synthetic */ HRDayChartData b;
                public final /* synthetic */ ArrayList<RangeIndex> c;
                public final /* synthetic */ ArrayList<int[]> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HRCardChartHelper hRCardChartHelper, HRDayChartData hRDayChartData, ArrayList<RangeIndex> arrayList, ArrayList<int[]> arrayList2) {
                    super(1);
                    this.a = hRCardChartHelper;
                    this.b = hRDayChartData;
                    this.c = arrayList;
                    this.d = arrayList2;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LineStyle.Builder invoke(@NotNull LineStyle.Builder builder) {
                    builder.setLineColor(this.a.g()[0]);
                    HRCardChartHelper hRCardChartHelper = this.a;
                    builder.setLineShader(hRCardChartHelper.i(this.b, hRCardChartHelper.g()));
                    builder.setDisconnectLineGap(6);
                    builder.setShadowColors(this.a.h());
                    builder.setSubIndex(this.c);
                    builder.setSubLinecolor(this.a.j()[0]);
                    HRCardChartHelper hRCardChartHelper2 = this.a;
                    builder.setSubLineShader(hRCardChartHelper2.i(this.b, hRCardChartHelper2.j()));
                    builder.setSubShadowColors(this.a.k());
                    builder.setSubBezierLineColor(ContextCompat.getColor(this.a.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), R.color.s15));
                    return builder.setSubIndexShadowColors(this.d);
                }
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getA() {
                return HRCardChartHelper.this.getContainer();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartDataList */
            public ChartDataList getB() {
                ChartDataList chartDataList = data.getChartDataList();
                HRDayChartData hRDayChartData = data;
                chartDataList.setMinValue(hRDayChartData.getYMin());
                chartDataList.setMaxValue(hRDayChartData.getYMax());
                return chartDataList;
            }

            @Override // com.huami.chart.chart.ChartProvider.StatisChartProvider, com.huami.chart.chart.IChartProvider
            @NotNull
            public Index getCurrentIndex() {
                return super.getCurrentIndex();
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public DrawConfig getDrawConfig() {
                HRCardChartHelper hRCardChartHelper = HRCardChartHelper.this;
                return hRCardChartHelper.appendDrawConfig(new a(hRCardChartHelper));
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                RenderConfig.Builder backgroundStyle = new RenderConfig.Builder().setBackgroundStyle(HRCardChartHelper.this.createBackgroundStyle(data, z));
                HRCardChartHelper hRCardChartHelper = HRCardChartHelper.this;
                RenderConfig.Builder axisStyle = backgroundStyle.setAxisStyle(hRCardChartHelper.appendAxisStyle(data, new b(z, hRCardChartHelper)));
                HRCardChartHelper hRCardChartHelper2 = HRCardChartHelper.this;
                return axisStyle.setLineStyle(hRCardChartHelper2.appendLineStyle(new c(hRCardChartHelper2, data, abnormalRange, arrayList))).setGoalLineStyle(HRCardChartHelper.this.createGoalLineStyle(z, goals)).setNoDataStyle(HRCardChartHelper.this.createNoDataStyle()).create();
            }
        }, false, false, false, false);
    }

    public HRCardChartHelper(@NotNull Context context, @NotNull ViewGroup viewGroup, @Nullable Float f, @Nullable Float f2) {
        super(context, viewGroup);
        this.containerWidth = f;
        this.containerHeight = f2;
        this.hrLineColor = LazyKt__LazyJVMKt.lazy(new a(context));
        this.subLineColors = LazyKt__LazyJVMKt.lazy(new c(context));
        this.hrShadowColors = LazyKt__LazyJVMKt.lazy(new b(context));
        this.subLineShadowColors = LazyKt__LazyJVMKt.lazy(new d(context));
    }
}
