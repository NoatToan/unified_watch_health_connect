package com.huami.chart.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.IChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import defpackage.ec4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001c\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\b\u0002\u0010.\u001a\u00020)\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0011\u0012,\u0010;\u001a(\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020702¢\u0006\u0002\b8¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0019\u0010.\u001a\u00020)8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R<\u0010;\u001a(\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020702¢\u0006\u0002\b88\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u0019\u0010?R\u001d\u0010C\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b\u0016\u0010B¨\u0006F"}, d2 = {"Lcom/huami/chart/helper/UnifiedChart;", "Lcom/huami/chart/chart/IChartProvider;", "", "c", "", "hasData", "Landroid/view/ViewGroup;", "getChartContainer", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "", "getMultiChartDataList", "()[Lcom/huami/chart/data/ChartDataList;", "Lcom/huami/chart/provider/DrawConfig;", "getDrawConfig", "Lcom/huami/chart/provider/RenderConfig;", "getRenderConfig", "Lcom/huami/chart/util/Index;", "getCurrentIndex", "refreshingAnim", "preAnim", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Landroid/view/ViewGroup;", "chartContainerViewGroup", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "Landroid/util/SparseArray;", "xAxisDatas", "Lcom/huami/chart/data/YAxisData;", GoogleApiAvailabilityLight.a, "yAxisDatas", "e", "Lcom/huami/chart/data/ChartDataList;", "dataList", "f", "[Lcom/huami/chart/data/ChartDataList;", "multiList", "Lcom/huami/chart/helper/DataConfig;", "g", "Lcom/huami/chart/helper/DataConfig;", "getDataConfig", "()Lcom/huami/chart/helper/DataConfig;", "dataConfig", "h", "Lcom/huami/chart/util/Index;", "defaultIndex", "Lkotlin/Function2;", "Lcom/huami/chart/provider/RenderConfig$Builder;", "Lkotlin/ParameterName;", "name", "provider", "", "Lkotlin/ExtensionFunctionType;", "i", "Lkotlin/jvm/functions/Function2;", "renderConfig", "Landroid/graphics/Paint;", z.j, "Lkotlin/Lazy;", "()Landroid/graphics/Paint;", "measurePaint", hl.k, "()F", "maxYLabelWidth", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/util/SparseArray;Landroid/util/SparseArray;Lcom/huami/chart/data/ChartDataList;[Lcom/huami/chart/data/ChartDataList;Lcom/huami/chart/helper/DataConfig;Lcom/huami/chart/util/Index;Lkotlin/jvm/functions/Function2;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class UnifiedChart implements IChartProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ViewGroup chartContainerViewGroup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<XAxisData> xAxisDatas;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SparseArray<YAxisData> yAxisDatas;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ChartDataList dataList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final ChartDataList[] multiList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DataConfig dataConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final Index defaultIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Function2<RenderConfig.Builder, UnifiedChart, Unit> renderConfig;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy measurePaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxYLabelWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/style/AxisStyle$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<AxisStyle.Builder, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull AxisStyle.Builder builder) {
            builder.setXAxisMarginRight(UnifiedChart.this.a());
            builder.setAbsoluteZeroX(UnifiedChart.this.getChartContainerViewGroup().getWidth() - UnifiedChart.this.a());
            builder.setYLabelMarginYAxis(HMChartHelperKt.getDpToPx(4.0f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AxisStyle.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public b() {
            super(0);
        }

        public final float a() {
            float dpToPx = HMChartHelperKt.getDpToPx(44.0f);
            SparseArray sparseArray = UnifiedChart.this.yAxisDatas;
            UnifiedChart unifiedChart = UnifiedChart.this;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray.keyAt(i);
                dpToPx = Math.max(unifiedChart.b().measureText(((YAxisData) sparseArray.valueAt(i)).getTitle()) + HMChartHelperKt.getDpToPx(8.0f), dpToPx);
            }
            return dpToPx;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Paint;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Paint> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setTextSize(HMChartHelperKt.getSpToPx(12));
            return paint;
        }
    }

    @JvmOverloads
    public UnifiedChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function2) {
        this(context, viewGroup, sparseArray, sparseArray2, chartDataList, null, null, null, function2, 224, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public UnifiedChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList, @Nullable ChartDataList[] chartDataListArr, @NotNull DataConfig dataConfig, @Nullable Index index, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function2) {
        this.context = context;
        this.chartContainerViewGroup = viewGroup;
        this.xAxisDatas = sparseArray;
        this.yAxisDatas = sparseArray2;
        this.dataList = chartDataList;
        this.multiList = chartDataListArr;
        this.dataConfig = dataConfig;
        this.defaultIndex = index;
        this.renderConfig = function2;
        this.measurePaint = LazyKt__LazyJVMKt.lazy(c.a);
        this.maxYLabelWidth = LazyKt__LazyJVMKt.lazy(new b());
    }

    @JvmOverloads
    public UnifiedChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList, @Nullable ChartDataList[] chartDataListArr, @NotNull DataConfig dataConfig, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function2) {
        this(context, viewGroup, sparseArray, sparseArray2, chartDataList, chartDataListArr, dataConfig, null, function2, 128, null);
    }

    @JvmOverloads
    public UnifiedChart(@NotNull Context context, @NotNull ViewGroup viewGroup, @NotNull SparseArray<XAxisData> sparseArray, @NotNull SparseArray<YAxisData> sparseArray2, @NotNull ChartDataList chartDataList, @Nullable ChartDataList[] chartDataListArr, @NotNull Function2<? super RenderConfig.Builder, ? super UnifiedChart, Unit> function2) {
        this(context, viewGroup, sparseArray, sparseArray2, chartDataList, chartDataListArr, null, null, function2, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float a() {
        return ((Number) this.maxYLabelWidth.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint b() {
        return (Paint) this.measurePaint.getValue();
    }

    private final float c() {
        int measuredWidth = this.chartContainerViewGroup.getMeasuredWidth();
        int width = this.chartContainerViewGroup.getWidth();
        if (measuredWidth == 0) {
            return width != 0 ? width : Resources.getSystem().getDisplayMetrics().widthPixels - HMChartHelperKt.getDpToPx(20.0f);
        }
        return measuredWidth;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    /* JADX INFO: renamed from: getChartContainer, reason: from getter */
    public ViewGroup getChartContainerViewGroup() {
        return this.chartContainerViewGroup;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    /* JADX INFO: renamed from: getChartDataList, reason: from getter */
    public ChartDataList getDataList() {
        return this.dataList;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public Index getCurrentIndex() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Index index = this.defaultIndex;
            if (index == null) {
                index = getDataList().getCount() > 0 ? new Index(getDataList().getCount() - 1, getDataList().getLastData().getBaseIndex()) : Index.INVALID_INDEX;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(index);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        Index index2 = Index.INVALID_INDEX;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = index2;
        }
        return (Index) objM3845constructorimpl;
    }

    @NotNull
    public final DataConfig getDataConfig() {
        return this.dataConfig;
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public DrawConfig getDrawConfig() {
        DrawConfig.Builder builder = new DrawConfig.Builder(this.context);
        ChartBuildKt.setCanvasWidthAndHeight(builder, c(), getChartContainerViewGroup().getMeasuredHeight());
        DataConfig dataConfig = getDataConfig();
        float f = dataConfig.getCom.facebook.appevents.internal.ViewHierarchyConstants.DIMENSION_WIDTH_KEY java.lang.String();
        DataConfig.MarginF rectF = dataConfig.getRectF();
        ChartBuildKt.setDataBounds(builder, rectF.getLeft(), rectF.getTop(), rectF.getRight(), rectF.getBottom(), f);
        return builder.create();
    }

    @Override // com.huami.chart.chart.IChartProvider
    @Nullable
    /* JADX INFO: renamed from: getMultiChartDataList, reason: from getter */
    public ChartDataList[] getMultiList() {
        return this.multiList;
    }

    @Override // com.huami.chart.chart.IChartProvider
    public /* synthetic */ ChartDataList[] getPointChartDataList() {
        return ec4.b(this);
    }

    @Override // com.huami.chart.chart.IChartProvider
    @NotNull
    public RenderConfig getRenderConfig() {
        RenderConfig.Builder builder = new RenderConfig.Builder();
        ChartBuildKt.axisConfig(builder, this.context, hasData(), this.xAxisDatas, this.yAxisDatas, getChartContainerViewGroup().getWidth() - a(), new a());
        getDataConfig().getRectF().setRight(a());
        this.renderConfig.invoke(builder, this);
        return builder.create();
    }

    public final boolean hasData() {
        return getDataList().getCount() > 0;
    }

    @Override // com.huami.chart.chart.IChartProvider
    public boolean preAnim() {
        return false;
    }

    @Override // com.huami.chart.chart.IChartProvider
    public boolean refreshingAnim() {
        return false;
    }

    public /* synthetic */ UnifiedChart(Context context, ViewGroup viewGroup, SparseArray sparseArray, SparseArray sparseArray2, ChartDataList chartDataList, ChartDataList[] chartDataListArr, DataConfig dataConfig, Index index, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, sparseArray, sparseArray2, chartDataList, (i & 32) != 0 ? null : chartDataListArr, (i & 64) != 0 ? new DataConfig(HMChartHelperKt.getDpToPx(8.0f), null, 2, null) : dataConfig, (i & 128) != 0 ? null : index, function2);
    }
}
