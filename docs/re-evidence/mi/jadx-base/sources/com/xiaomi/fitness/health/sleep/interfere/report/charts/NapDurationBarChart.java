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
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import defpackage.cu3;
import defpackage.fmq;
import defpackage.fpc;
import defpackage.ft1;
import defpackage.hwq;
import defpackage.iji;
import defpackage.qxi;
import defpackage.ryp;
import defpackage.w02;
import defpackage.y02;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/NapDurationBarChart;", "Lcom/github/mikephil/charting/charts/BarChart;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "PURPLE", "axisRendererRight", "Lcom/xiaomi/fitness/chart/mpchart/AdjustedYAxisRenderer;", "setupAxes", "", "setNapData", "dailyList", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyNapRecord;", "goalMinutes", "MinutesPluralFormatter", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNapDurationBarChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NapDurationBarChart.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/NapDurationBarChart\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n470#2:189\n1053#3:190\n1557#3:191\n1628#3,3:192\n1#4:195\n*S KotlinDebug\n*F\n+ 1 NapDurationBarChart.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/NapDurationBarChart\n*L\n35#1:189\n120#1:190\n121#1:191\n121#1:192,3\n*E\n"})
public final class NapDurationBarChart extends BarChart {
    private final int PURPLE;

    @NotNull
    private final AdjustedYAxisRenderer axisRendererRight;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/NapDurationBarChart$MinutesPluralFormatter;", "Lfpc;", "", "value", "Lft1;", "axis", "", "getAxisLabel", "(FLft1;)Ljava/lang/String;", "getFormattedValue", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class MinutesPluralFormatter implements fpc {

        @NotNull
        private final Context ctx;

        public MinutesPluralFormatter(@NotNull Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            this.ctx = ctx;
        }

        @NotNull
        public final String getAxisLabel(float value, @Nullable ft1 axis) {
            if (value <= 0.0f) {
                return "";
            }
            int i = (int) value;
            String quantityString = this.ctx.getResources().getQuantityString(qxi.R1, i, Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        @Override // defpackage.fpc
        @Nullable
        public String getFormattedValue(float value, @Nullable ft1 axis) {
            return getAxisLabel(value, axis);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NapDurationBarChart(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setNapData$default(NapDurationBarChart napDurationBarChart, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        napDurationBarChart.setNapData(list, i);
    }

    private final void setupAxes() {
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1.0f);
        xAxis.setTextSize(10.89f);
        xAxis.setTextColor(getContext().getColor(iji.w3));
        xAxis.setValueFormatter(new MdLimitTimeAxisValueFormatter(6));
        xAxis.setSpaceMin(0.6f);
        xAxis.setSpaceMax(0.6f);
        YAxis axisRight = getAxisRight();
        axisRight.u(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        axisRight.setDrawAxisLine(true);
        axisRight.setAxisLineWidth(1.0f);
        axisRight.setAxisLineColor(getContext().getColor(iji.s3));
        axisRight.setGridColor(getContext().getColor(iji.t3));
        axisRight.setGridLineWidth(0.5f);
        axisRight.enableGridDashedLine(ExtUtilsKt.getDpFloat(2), ExtUtilsKt.getDpFloat(2), 0.0f);
        axisRight.setTextSize(10.89f);
        axisRight.setTextColor(getContext().getColor(iji.w3));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        axisRight.setValueFormatter(new MinutesPluralFormatter(context));
        axisRight.setAxisMinimum(0.0f);
        axisRight.v(0.0f);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(true);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setAxisLineWidth(1.0f);
        axisLeft.setAxisLineColor(getContext().getColor(iji.s3));
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(100.0f);
        axisLeft.setAxisMaximum(getAxisRight().getAxisMaximum());
        axisLeft.setAxisMinimum(getAxisRight().getAxisMinimum());
    }

    public final void setNapData(@NotNull List<SleepData.DailyNapRecord> dailyList, int goalMinutes) {
        Intrinsics.checkNotNullParameter(dailyList, "dailyList");
        if (dailyList.isEmpty()) {
            return;
        }
        List<SleepData.DailyNapRecord> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(dailyList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.NapDurationBarChart$setNapData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((SleepData.DailyNapRecord) t).getLocalDay()), Integer.valueOf(((SleepData.DailyNapRecord) t2).getLocalDay()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        for (SleepData.DailyNapRecord dailyNapRecord : listSortedWith) {
            arrayList.add(new BarEntry(dailyNapRecord.getLocalDay(), dailyNapRecord.getNapMinutes()));
        }
        Iterator it = listSortedWith.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int napMinutes = ((SleepData.DailyNapRecord) it.next()).getNapMinutes();
        while (it.hasNext()) {
            int napMinutes2 = ((SleepData.DailyNapRecord) it.next()).getNapMinutes();
            if (napMinutes < napMinutes2) {
                napMinutes = napMinutes2;
            }
        }
        float fMax = Math.max(90.0f, ((float) Math.ceil(Math.max(goalMinutes, napMinutes) / 30.0f)) * 30.0f);
        YAxis axisRight = getAxisRight();
        axisRight.setGranularity(30.0f);
        axisRight.setAxisMaximum(fMax);
        axisRight.setLabelCount(((int) (fMax / 30.0f)) + 1, true);
        axisRight.removeAllLimitLines();
        float f = goalMinutes;
        LimitLine limitLine = new LimitLine(f, "");
        limitLine.k(this.PURPLE);
        limitLine.l(0.5f);
        limitLine.a(ExtUtilsKt.getDpFloat(2), ExtUtilsKt.getDpFloat(2), 0.0f);
        axisRight.addLimitLine(limitLine);
        XAxis xAxis = getXAxis();
        MdLimitTimeAxisValueFormatter.Companion companion = MdLimitTimeAxisValueFormatter.INSTANCE;
        Intrinsics.checkNotNull(xAxis);
        xAxis.setLabelCount(companion.calculateLabelCount(arrayList, xAxis));
        y02 y02Var = new y02(arrayList, "");
        y02Var.V0(this.PURPLE);
        y02Var.Y0(false);
        y02Var.n1(0);
        y02Var.U0(YAxis.AxisDependency.RIGHT);
        w02 w02Var = new w02(y02Var);
        w02Var.B(0.5f);
        setData(w02Var);
        this.axisRendererRight.setHighlightColors(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(Float.valueOf(f), Integer.valueOf(this.PURPLE))));
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NapDurationBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NapDurationBarChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NapDurationBarChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.PURPLE = Color.parseColor("#8673FA");
        hwq viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
        YAxis axisRight = getAxisRight();
        Intrinsics.checkNotNullExpressionValue(axisRight, "getAxisRight(...)");
        ryp transformer = getTransformer(YAxis.AxisDependency.RIGHT);
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        AdjustedYAxisRenderer adjustedYAxisRenderer = new AdjustedYAxisRenderer(viewPortHandler, axisRight, transformer, null, 0.0f, 0.0f, 0.0f, false, 0.0f, 504, null);
        this.axisRendererRight = adjustedYAxisRenderer;
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        setScaleEnabled(false);
        setDoubleTapToZoomEnabled(false);
        setPinchZoom(false);
        setExtraTopOffset(1.0f);
        setExtraBottomOffset(22.0f);
        setExtraLeftOffset(20.0f);
        setExtraRightOffset(12.0f);
        setMinOffset(0.0f);
        setupAxes();
        cu3 animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "getAnimator(...)");
        hwq viewPortHandler2 = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler2, "getViewPortHandler(...)");
        setRenderer(new RoundedStackedBarChartRenderer(this, animator, viewPortHandler2, fmq.e(3.0f)));
        this.mAxisRendererRight = adjustedYAxisRenderer;
    }
}
