package com.huami.sleep.napsleep.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huami.chart.chart.ChartProvider;
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
import com.huami.sleep.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import defpackage.nc4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J>\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\nj\u0002`\r2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0010R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/napsleep/view/SleepDayChartView;", "Landroid/widget/FrameLayout;", "Lcom/huami/chart/provider/RenderConfig;", "b", "", "maxValue", "Lcom/huami/chart/provider/DrawConfig;", "a", "Lcom/huami/chart/data/ChartDataList;", "chartDataList", "Lkotlin/Function2;", "", "", "Lcom/huami/sleep/napsleep/view/OnTouchSectionDown;", "onTouchSectionDown", "Lkotlin/Function0;", "Lcom/huami/sleep/napsleep/view/OnTouchSectionUp;", "onTouchSectionUp", "refreshChart", "Lcom/huami/chart/chart/ChartProvider;", "Lkotlin/Lazy;", "getChartProvider", "()Lcom/huami/chart/chart/ChartProvider;", "chartProvider", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDayChartView extends FrameLayout {

    @NotNull
    private static final String b = "SleepDayChartView";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/ChartProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartProvider> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartProvider invoke() {
            return new ChartProvider(this.a, true);
        }
    }

    public SleepDayChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.chartProvider = LazyKt__LazyJVMKt.lazy(new a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrawConfig a(float maxValue) {
        int width = getWidth();
        int height = getHeight();
        if (width == 0) {
            width = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        return new DrawConfig.Builder(getContext()).setCanvasWidth(width).setCanvasHeight(height).setDataWidth(0.0f).setDataMarginTop(ChartUtil.dp2px(getContext(), 17.0f)).setDataMarginLeft(ChartUtil.dp2px(getContext(), 15.0f)).setDataMarginRight(ChartUtil.dp2px(getContext(), 15.0f)).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenderConfig b() {
        return new RenderConfig.Builder().setBarStyle(new BarStyle.Builder(getContext()).setBarStyle(2).setInteractiveLineWidth(ChartUtil.dp2px(getContext(), 1.0f)).setInteractiveType(2).setInteractiveUpCancel(false).setInteractiveLineColor(ContextCompat.getColor(getContext(), R.color.s3)).setInteractiveSlide(true).create()).setNoDataStyle(new NoDataStyle.Builder(getContext()).setNoDataStyle(2).setNoDataLabel(getContext().getString(R.string.no_sleep_data)).setNoDataLabelColor(ContextCompat.getColor(KoinExtKt.getAppContext(), R.color.s1)).setNoDataLabelSize(ChartUtil.sp2px(getContext(), 13.0f)).create()).setAxisStyle(new AxisStyle.Builder(getContext()).setXLabelSize(ChartUtil.sp2px(getContext(), 12.0f)).setXLabelColor(ViewExKt.addAlpha(ContextCompat.getColor(getContext(), R.color.s44), 0.13d)).create()).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartProvider getChartProvider() {
        return (ChartProvider) this.chartProvider.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void refreshChart(@NotNull final ChartDataList chartDataList, @NotNull final Function2<? super Integer, ? super Float, Unit> onTouchSectionDown, @NotNull final Function0<Unit> onTouchSectionUp) {
        getChartProvider().createChart(new ChartProvider.StatisChartProvider() { // from class: com.huami.sleep.napsleep.view.SleepDayChartView.refreshChart.1
            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            /* JADX INFO: renamed from: getChartContainer */
            public ViewGroup getF() {
                return SleepDayChartView.this;
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
                return SleepDayChartView.this.a(chartDataList.getMaxValue());
            }

            @Override // com.huami.chart.chart.IChartProvider
            @NotNull
            public RenderConfig getRenderConfig() {
                return SleepDayChartView.this.b();
            }
        }, chartDataList.getCount() > 0, false, false, false);
        getChartProvider().getChart().registerTouchListener(new ITouchListener() { // from class: com.huami.sleep.napsleep.view.SleepDayChartView.refreshChart.2

            /* JADX INFO: renamed from: com.huami.sleep.napsleep.view.SleepDayChartView$refreshChart$2$a */
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
                public final String invoke() {
                    return "onDown INVALID_INDEX:" + this.a;
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.napsleep.view.SleepDayChartView$refreshChart$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Index a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Index index) {
                    super(0);
                    this.a = index;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onUp INVALID_INDEX:" + this.a;
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onDown(@NotNull Index i) {
                if (Intrinsics.areEqual(i, Index.INVALID_INDEX)) {
                    HMLog.warn$default(SleepDayChartView.b, null, new a(i), 2, null);
                } else {
                    onTouchSectionDown.invoke(Integer.valueOf(i.getDataIndex()), Float.valueOf(i.getCenterX()));
                }
            }

            @Override // com.huami.chart.listener.ITouchListener
            public /* synthetic */ void onTouchOutOfRange() {
                nc4.a(this);
            }

            @Override // com.huami.chart.listener.ITouchListener
            public void onUp(@NotNull Index i) {
                Index index = Index.INVALID_INDEX;
                if (Intrinsics.areEqual(i, index)) {
                    HMLog.warn$default(SleepDayChartView.b, null, new b(i), 2, null);
                } else {
                    onTouchSectionUp.invoke();
                }
                this.getChartProvider().getChart().getInteractiveManager().setCurrentIndex(index);
            }
        });
    }

    public /* synthetic */ SleepDayChartView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
