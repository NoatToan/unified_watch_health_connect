package com.huami.chart.helper;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huami.chart.R;
import com.huami.chart.chart.HMChart;
import com.huami.chart.chart.HMShimmerLineChart;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import com.huami.chart.helper.DynamicChartProvider;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.style.AxisStyle;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!JS\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/chart/helper/DynamicChartProvider;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/ViewGroup;", "chartContainerViewGroup", "Lcom/huami/chart/data/ChartDataList;", "dataList", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/XAxisData;", "xAxisDatas", "Lcom/huami/chart/data/YAxisData;", "yAxisDatas", "Lkotlin/Function1;", "Lcom/huami/chart/chart/HMShimmerLineChart;", "", "Lkotlin/ExtensionFunctionType;", "config", "createDynamicChart", "a", "Lcom/huami/chart/chart/HMShimmerLineChart;", "getHmShimmerLineChart", "()Lcom/huami/chart/chart/HMShimmerLineChart;", "setHmShimmerLineChart", "(Lcom/huami/chart/chart/HMShimmerLineChart;)V", "hmShimmerLineChart", "Lcom/huami/chart/chart/HMChart;", "b", "Lkotlin/Lazy;", "getHmChart", "()Lcom/huami/chart/chart/HMChart;", "hmChart", "<init>", "(Landroid/content/Context;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class DynamicChartProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HMShimmerLineChart hmShimmerLineChart;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmChart;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lcom/huami/chart/provider/RenderConfig$Builder;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<RenderConfig.Builder, Boolean, Unit> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ SparseArray<XAxisData> b;
        public final /* synthetic */ SparseArray<YAxisData> c;
        public final /* synthetic */ ViewGroup d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, SparseArray<XAxisData> sparseArray, SparseArray<YAxisData> sparseArray2, ViewGroup viewGroup) {
            super(2);
            this.a = context;
            this.b = sparseArray;
            this.c = sparseArray2;
            this.d = viewGroup;
        }

        public final void a(@NotNull RenderConfig.Builder builder, boolean z) {
            AxisStyle.Builder builder2 = new AxisStyle.Builder(this.a);
            SparseArray<XAxisData> sparseArray = this.b;
            SparseArray<YAxisData> sparseArray2 = this.c;
            Context context = this.a;
            ViewGroup viewGroup = this.d;
            int i = R.color.s46;
            ChartBuildKt.baseStyle$default(builder2, 0.0f, 0.0f, sparseArray, sparseArray2, HMChartHelperKt.getResColor(context, i, 0.6f), HMChartHelperKt.getSpToPx(12), HMChartHelperKt.getResColor(context, i, 0.6f), HMChartHelperKt.getSpToPx(12), viewGroup.getWidth() - HMChartHelperKt.getDpToPx(14), false, 515, null);
            ChartBuildKt.yLongScaleStyle$default(builder2, ContextCompat.getColor(context, R.color.s45), false, true, 2, null);
            Unit unit = Unit.INSTANCE;
            builder.setAxisStyle(builder2.create());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(RenderConfig.Builder builder, Boolean bool) {
            a(builder, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/HMChart;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMChart> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMChart invoke() {
            HMChart hMChart = new HMChart(this.a);
            hMChart.setIgnoreRTL(true);
            return hMChart;
        }
    }

    public DynamicChartProvider(@NotNull Context context) {
        this.hmChart = LazyKt__LazyJVMKt.lazy(new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CommonChartProvider commonChartProvider, DynamicChartProvider dynamicChartProvider, Context context, Function1 function1) {
        if (commonChartProvider.getChartContainerViewGroup().getVisibility() != 0) {
            return;
        }
        commonChartProvider.getChartContainerViewGroup().removeAllViews();
        commonChartProvider.getChartContainerViewGroup().addView(dynamicChartProvider.getHmChart());
        dynamicChartProvider.getHmChart().setInteractive(false, false);
        dynamicChartProvider.getHmChart().setAnchorCenter(false);
        dynamicChartProvider.getHmChart().refreshData(commonChartProvider);
        dynamicChartProvider.getHmChart().setEnableScale(false);
        if (commonChartProvider.preAnim()) {
            dynamicChartProvider.getHmChart().startPreAnim();
        }
        HMShimmerLineChart hMShimmerLineChart = new HMShimmerLineChart(dynamicChartProvider.getHmChart(), context, false, 4, null);
        function1.invoke(hMShimmerLineChart);
        Unit unit = Unit.INSTANCE;
        dynamicChartProvider.setHmShimmerLineChart(hMShimmerLineChart);
        commonChartProvider.getChartContainerViewGroup().addView(dynamicChartProvider.getHmShimmerLineChart());
    }

    public final void createDynamicChart(@NotNull final Context context, @NotNull ViewGroup chartContainerViewGroup, @NotNull ChartDataList dataList, @NotNull SparseArray<XAxisData> xAxisDatas, @NotNull SparseArray<YAxisData> yAxisDatas, @NotNull final Function1<? super HMShimmerLineChart, Unit> config) {
        final CommonChartProvider commonChartProvider = new CommonChartProvider(context, chartContainerViewGroup, dataList, null, new DataConfig(HMChartHelperKt.getDpToPx(5.0f), new DataConfig.MarginF(HMChartHelperKt.getDpToPx(21.0f), HMChartHelperKt.getDpToPx(30.0f), HMChartHelperKt.getDpToPx(44.0f), HMChartHelperKt.getDpToPx(30.0f))), null, new a(context, xAxisDatas, yAxisDatas, chartContainerViewGroup), 32, null);
        commonChartProvider.getChartContainerViewGroup().post(new Runnable() { // from class: md1
            @Override // java.lang.Runnable
            public final void run() {
                DynamicChartProvider.b(commonChartProvider, this, context, config);
            }
        });
    }

    @NotNull
    public final HMChart getHmChart() {
        return (HMChart) this.hmChart.getValue();
    }

    @Nullable
    public final HMShimmerLineChart getHmShimmerLineChart() {
        return this.hmShimmerLineChart;
    }

    public final void setHmShimmerLineChart(@Nullable HMShimmerLineChart hMShimmerLineChart) {
        this.hmShimmerLineChart = hMShimmerLineChart;
    }
}
