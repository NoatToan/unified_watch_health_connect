package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.chart.mpchart.AdjustedYAxisRenderer;
import com.xiaomi.fitness.chart.mpchart.MdLimitTimeAxisValueFormatter;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import defpackage.c0j;
import defpackage.cu3;
import defpackage.fmq;
import defpackage.ft1;
import defpackage.hwq;
import defpackage.iji;
import defpackage.onq;
import defpackage.ryp;
import defpackage.w02;
import defpackage.y02;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepDurationStackedBarChart;", "Lcom/github/mikephil/charting/charts/BarChart;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "COLOR_DEEP", "COLOR_LIGHT", "COLOR_REM", "COLOR_OTHER", "setupAxes", "", "setSleepDurationData", "dailyList", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration$Daily;", "sleepTargetMinutes", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepDurationStackedBarChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDurationStackedBarChart.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepDurationStackedBarChart\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n470#2:202\n470#2:203\n470#2:204\n470#2:205\n1053#3:206\n1863#3,2:207\n1#4:209\n*S KotlinDebug\n*F\n+ 1 SleepDurationStackedBarChart.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepDurationStackedBarChart\n*L\n40#1:202\n41#1:203\n42#1:204\n43#1:205\n133#1:206\n133#1:207,2\n*E\n"})
public final class SleepDurationStackedBarChart extends BarChart {

    @NotNull
    private static final String TAG = "SleepDurationStackedBarChart";
    private final int COLOR_DEEP;
    private final int COLOR_LIGHT;
    private final int COLOR_OTHER;
    private final int COLOR_REM;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepDurationStackedBarChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupAxes() {
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setTextColor(getContext().getColor(iji.w3));
        xAxis.setTextSize(11.0f);
        xAxis.setGranularity(1.0f);
        xAxis.setSpaceMin(0.6f);
        xAxis.setSpaceMax(0.6f);
        xAxis.setValueFormatter(new MdLimitTimeAxisValueFormatter(6));
        YAxis axisRight = getAxisRight();
        axisRight.u(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisRight.setDrawAxisLine(true);
        axisRight.setAxisLineColor(getContext().getColor(iji.s3));
        axisRight.setAxisLineWidth(1.0f);
        axisRight.setGridColor(getContext().getColor(iji.t3));
        axisRight.setGridLineWidth(0.5f);
        axisRight.enableGridDashedLine(fmq.e(2.0f), fmq.e(2.0f), 0.0f);
        axisRight.setTextColor(getContext().getColor(iji.w3));
        axisRight.setTextSize(11.0f);
        axisRight.setAxisMinimum(0.0f);
        axisRight.v(0.0f);
        hwq viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
        YAxis axisRight2 = getAxisRight();
        Intrinsics.checkNotNullExpressionValue(axisRight2, "getAxisRight(...)");
        ryp transformer = getTransformer(YAxis.AxisDependency.RIGHT);
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        this.mAxisRendererRight = new AdjustedYAxisRenderer(viewPortHandler, axisRight2, transformer, null, 0.0f, 0.0f, 0.0f, false, 0.0f, 504, null);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(true);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setAxisLineColor(getContext().getColor(iji.s3));
        axisLeft.setAxisLineWidth(1.0f);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.v(0.0f);
        axisLeft.setAxisMaximum(getAxisRight().getAxisMaximum());
        axisLeft.setAxisMinimum(getAxisRight().getAxisMinimum());
    }

    public final void setSleepDurationData(@NotNull List<SleepData.NightSleepDuration.Daily> dailyList, int sleepTargetMinutes) {
        Intrinsics.checkNotNullParameter(dailyList, "dailyList");
        if (dailyList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(dailyList.size());
        List<SleepData.NightSleepDuration.Daily> list = dailyList;
        Iterator it = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepDurationStackedBarChart$setSleepDurationData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepData.NightSleepDuration.Daily) t).getDateTimestamp()), Long.valueOf(((SleepData.NightSleepDuration.Daily) t2).getDateTimestamp()));
            }
        }).iterator();
        while (true) {
            float f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            SleepData.NightSleepDuration.Daily daily = (SleepData.NightSleepDuration.Daily) it.next();
            float fTimestampToLocalDay$default = ChartUtil.timestampToLocalDay$default(ChartUtil.INSTANCE, daily.getDateTimestamp() * ((long) 1000), null, 2, null);
            float deepSleepMinutes = daily.getDeepSleepMinutes() / 60.0f;
            float lightSleepMinutes = daily.getLightSleepMinutes() / 60.0f;
            float remSleepMinutes = daily.getRemSleepMinutes() / 60.0f;
            float totalMinutes = (((daily.getTotalMinutes() - daily.getDeepSleepMinutes()) - daily.getLightSleepMinutes()) - daily.getRemSleepMinutes()) / 60.0f;
            if (totalMinutes > 0.0f) {
                f = totalMinutes;
            } else {
                Logger.i(TAG, "Other sleep time is negative or zero, setting to 0f");
            }
            arrayList.add(new BarEntry(fTimestampToLocalDay$default, new float[]{deepSleepMinutes, lightSleepMinutes, remSleepMinutes, f}));
        }
        float f2 = sleepTargetMinutes / 60.0f;
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float totalMinutes2 = ((SleepData.NightSleepDuration.Daily) it2.next()).getTotalMinutes() / 60.0f;
        while (it2.hasNext()) {
            totalMinutes2 = Math.max(totalMinutes2, ((SleepData.NightSleepDuration.Daily) it2.next()).getTotalMinutes() / 60.0f);
        }
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((int) Math.ceil(Math.max(f2, totalMinutes2) / 5.0f), 1);
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(0.0f);
        axisRight.setAxisMaximum(5.0f * fCoerceAtLeast);
        axisRight.setGranularity(fCoerceAtLeast);
        axisRight.setLabelCount(6, true);
        axisRight.setValueFormatter(new onq() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepDurationStackedBarChart$setSleepDurationData$3$1
            @Override // defpackage.onq
            public String getAxisLabel(float value, ft1 axis) {
                return String.valueOf((int) value);
            }
        });
        axisRight.removeAllLimitLines();
        LimitLine limitLine = new LimitLine(f2);
        limitLine.k(getContext().getColor(iji.f3));
        limitLine.l(0.5f);
        limitLine.a(ExtUtilsKt.getDpFloat(Float.valueOf(2.0f)), ExtUtilsKt.getDpFloat(Float.valueOf(2.0f)), 0.0f);
        limitLine.i("");
        axisRight.addLimitLine(limitLine);
        XAxis xAxis = getXAxis();
        MdLimitTimeAxisValueFormatter.Companion companion = MdLimitTimeAxisValueFormatter.INSTANCE;
        Intrinsics.checkNotNull(xAxis);
        xAxis.setLabelCount(companion.calculateLabelCount(arrayList, xAxis));
        y02 y02Var = new y02(arrayList, "");
        y02Var.U0(YAxis.AxisDependency.RIGHT);
        y02Var.W0(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.COLOR_DEEP), Integer.valueOf(this.COLOR_LIGHT), Integer.valueOf(this.COLOR_REM), Integer.valueOf(this.COLOR_OTHER)}));
        y02Var.o1(new String[]{getContext().getString(c0j.cf), getContext().getString(c0j.lk), getContext().getString(c0j.Nf), getContext().getString(c0j.Wc)});
        y02Var.Y0(false);
        y02Var.n1(0);
        w02 w02Var = new w02(y02Var);
        w02Var.B(0.5f);
        setData(w02Var);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepDurationStackedBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepDurationStackedBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepDurationStackedBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.COLOR_DEEP = Color.parseColor("#2126CC");
        this.COLOR_LIGHT = Color.parseColor("#2E6CFF");
        this.COLOR_REM = Color.parseColor("#55B3FF");
        this.COLOR_OTHER = Color.parseColor("#A9D9FF");
        setNoDataText("");
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setScaleEnabled(false);
        setDoubleTapToZoomEnabled(false);
        setPinchZoom(false);
        setExtraTopOffset(1.0f);
        setExtraBottomOffset(20.0f);
        setExtraLeftOffset(20.0f);
        setExtraRightOffset(12.0f);
        setMinOffset(0.0f);
        setupAxes();
        cu3 animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "getAnimator(...)");
        hwq viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
        setRenderer(new RoundedStackedBarChartRenderer(this, animator, viewPortHandler, fmq.e(3.0f)));
    }
}
