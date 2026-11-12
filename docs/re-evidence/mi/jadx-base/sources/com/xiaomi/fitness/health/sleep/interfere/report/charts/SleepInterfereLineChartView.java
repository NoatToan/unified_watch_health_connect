package com.xiaomi.fitness.health.sleep.interfere.report.charts;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.xiaomi.fitness.chart.mpchart.AdjustedYAxisRenderer;
import com.xiaomi.fitness.chart.mpchart.MdLimitTimeAxisValueFormatter;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView;
import defpackage.bge;
import defpackage.hwq;
import defpackage.iji;
import defpackage.ktc;
import defpackage.ryp;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f*\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\f*\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView;", "Lcom/github/mikephil/charting/charts/LineChart;", "", "setupBaseConfig", "()V", "setupAxes", "adjustYAxis", "adjustAwakeCountYAxis", "Lbge;", "data", "setData", "(Lbge;)V", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyRecords;", "dailyRecords", "setBedtimeData", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$CountDaily;", "setCountData", "Lcom/github/mikephil/charting/data/Entry;", "toNoneNaNListEntry", "(Ljava/util/List;)Ljava/util/List;", "toNaNListEntry", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereLineChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereLineChartView.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,346:1\n1368#2:347\n1454#2,2:348\n1557#2:350\n1628#2,3:351\n774#2:354\n865#2,2:355\n1456#2,3:357\n1557#2:360\n1628#2,3:361\n1053#2:364\n1557#2:369\n1628#2,3:370\n1053#2:373\n1557#2:377\n1628#2,3:378\n774#2:381\n865#2,2:382\n1557#2:384\n1628#2,3:385\n774#2:388\n865#2,2:389\n774#2:391\n865#2,2:392\n470#3:365\n470#3:366\n470#3:367\n470#3:368\n470#3:374\n470#3:375\n470#3:376\n*S KotlinDebug\n*F\n+ 1 SleepInterfereLineChartView.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepInterfereLineChartView\n*L\n125#1:347\n125#1:348,2\n127#1:350\n127#1:351,3\n128#1:354\n128#1:355,2\n125#1:357,3\n183#1:360\n183#1:361,3\n190#1:364\n258#1:369\n258#1:370,3\n262#1:373\n315#1:377\n315#1:378,3\n316#1:381\n316#1:382,2\n317#1:384\n317#1:385,3\n337#1:388\n337#1:389,2\n342#1:391\n342#1:392,2\n199#1:365\n206#1:366\n221#1:367\n228#1:368\n270#1:374\n284#1:375\n300#1:376\n*E\n"})
public final class SleepInterfereLineChartView extends LineChart {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereLineChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.github.mikephil.charting.data.Entry, j72] */
    private final void adjustAwakeCountYAxis() {
        List<T> listL;
        ktc ktcVar;
        bge bgeVar = (bge) getData();
        if (bgeVar == null || (listL = bgeVar.l()) == 0 || (ktcVar = (ktc) CollectionsKt___CollectionsKt.firstOrNull((List) listL)) == null) {
            return;
        }
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, ktcVar.O0());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(ktcVar.i(((IntIterator) it).nextInt()).getY()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (true ^ Float.isNaN(((Number) obj).floatValue())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf((int) ((Number) it2.next()).floatValue()));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iMax = Math.max(2, num != null ? num.intValue() : 0);
        if (iMax <= 0) {
            getAxisRight().setAxisMaximum(6.0f);
            return;
        }
        int iCeil = iMax <= 6 ? 6 : ((int) Math.ceil(((double) iMax) / 3.0d)) * 3;
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(0.0f);
        axisRight.setAxisMaximum(iCeil);
        axisRight.setGranularity(iCeil <= 6 ? 2.0f : 3.0f);
        axisRight.setLabelCount((iCeil / ((int) axisRight.getGranularity())) + 1, true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        axisRight.setValueFormatter(new AwakeCountAxisValueFormatter(context));
        axisRight.setGridColor(getContext().getColor(iji.t3));
        axisRight.setGridLineWidth(0.5f);
        axisRight.enableGridDashedLine(ExtUtilsKt.getDpFloat(2), ExtUtilsKt.getDpFloat(2), 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.github.mikephil.charting.data.Entry, j72] */
    private final void adjustYAxis() {
        Iterable<ktc> iterableL;
        bge bgeVar = (bge) getData();
        if (bgeVar == null || (iterableL = bgeVar.l()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ktc ktcVar : iterableL) {
            IntRange intRangeUntil = RangesKt___RangesKt.until(0, ktcVar.O0());
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf(ktcVar.i(((IntIterator) it).nextInt()).getY()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!Float.isNaN(((Number) obj).floatValue())) {
                    arrayList3.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        }
        Float fM1332minOrNull = CollectionsKt___CollectionsKt.m1332minOrNull((Iterable<Float>) arrayList);
        float fFloatValue = fM1332minOrNull != null ? fM1332minOrNull.floatValue() : 0.0f;
        Float fM1324maxOrNull = CollectionsKt___CollectionsKt.m1324maxOrNull((Iterable<Float>) arrayList);
        float fFloatValue2 = fM1324maxOrNull != null ? fM1324maxOrNull.floatValue() : 0.0f;
        final float f = 1.0f;
        if (fFloatValue2 == fFloatValue) {
            fFloatValue2 += 1.0f;
        }
        float f2 = fFloatValue2 - fFloatValue;
        if (f2 < 3.0f) {
            f = 0.5f;
        } else if (f2 >= 14.0f) {
            f = f2 < 21.0f ? 2.0f : 3.0f;
        }
        float fFloor = ((float) Math.floor(fFloatValue / f)) * f;
        final float fCeil = ((float) Math.ceil(fFloatValue2 / f)) * f;
        List list = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(Float.valueOf(fFloor), (Function1<? super Float, ? extends Float>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: wnm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return SleepInterfereLineChartView.adjustYAxis$lambda$6(f, ((Float) obj2).floatValue());
            }
        })), new Function1() { // from class: xnm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return Boolean.valueOf(SleepInterfereLineChartView.adjustYAxis$lambda$7(fCeil, ((Float) obj2).floatValue()));
            }
        }));
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(fFloor);
        axisRight.setAxisMaximum(fCeil);
        axisRight.setGranularity(f);
        axisRight.setLabelCount(list.size(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float adjustYAxis$lambda$6(float f, float f2) {
        return Float.valueOf(f2 + f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean adjustYAxis$lambda$7(float f, float f2) {
        return ((double) f2) <= ((double) f) + 1.0E-4d;
    }

    private final void setupAxes() {
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setTextSize(10.89f);
        xAxis.setTextColor(getContext().getColor(iji.w3));
        xAxis.setGranularity(1.0f);
        xAxis.setSpaceMin(0.7f);
        xAxis.setSpaceMax(0.7f);
        xAxis.setValueFormatter(new MdLimitTimeAxisValueFormatter(6));
        YAxis axisRight = getAxisRight();
        axisRight.setEnabled(true);
        axisRight.setAxisMinimum(0.0f);
        axisRight.setAxisMaximum(100.0f);
        axisRight.setTextSize(10.89f);
        axisRight.setTextColor(getContext().getColor(iji.w3));
        axisRight.setGridColor(getContext().getColor(iji.t3));
        axisRight.setGridLineWidth(1.0f);
        axisRight.enableGridDashedLine(ExtUtilsKt.getDpFloat(2), ExtUtilsKt.getDpFloat(2), 0.0f);
        axisRight.setGranularity(25.0f);
        axisRight.setValueFormatter(new TimeOfDayAxisValueFormatter());
        axisRight.setAxisLineColor(getContext().getColor(iji.s3));
        axisRight.setAxisLineWidth(1.0f);
        axisRight.u(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        hwq viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
        YAxis axisRight2 = getAxisRight();
        Intrinsics.checkNotNullExpressionValue(axisRight2, "getAxisRight(...)");
        ryp transformer = getTransformer(YAxis.AxisDependency.RIGHT);
        Intrinsics.checkNotNullExpressionValue(transformer, "getTransformer(...)");
        this.mAxisRendererRight = new AdjustedYAxisRenderer(viewPortHandler, axisRight2, transformer, null, 0.0f, 0.0f, 0.0f, false, 0.0f, 504, null);
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(true);
        axisLeft.setDrawAxisLine(true);
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setAxisLineColor(getContext().getColor(iji.s3));
        axisLeft.setAxisLineWidth(1.0f);
        axisLeft.setAxisMinimum(getAxisRight().getAxisMinimum());
        axisLeft.setAxisMaximum(getAxisRight().getAxisMaximum());
    }

    private final void setupBaseConfig() {
        getDescription().setEnabled(false);
        setNoDataText("");
        setScaleEnabled(false);
        setDragEnabled(false);
        setPinchZoom(false);
        setDoubleTapToZoomEnabled(false);
        getLegend().setEnabled(false);
        setExtraTopOffset(3.0f);
        setExtraBottomOffset(22.0f);
        setExtraLeftOffset(20.0f);
        setExtraRightOffset(8.0f);
        setMinOffset(0.0f);
        setClipDataToContent(false);
        setupAxes();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final void setBedtimeData(@Nullable List<SleepData.DailyRecords> dailyRecords) {
        List<? extends Entry> listEmptyList;
        if (dailyRecords == null) {
            CollectionsKt__CollectionsKt.emptyList();
        }
        if (dailyRecords != null) {
            List<SleepData.DailyRecords> list = dailyRecords;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SleepData.DailyRecords dailyRecords2 : list) {
                ChartUtil chartUtil = ChartUtil.INSTANCE;
                long j = 1000;
                long dateTimestamp = dailyRecords2.getDateTimestamp() * j;
                ZoneId zoneIdOf = ZoneId.of("UTC");
                Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
                long jTimestampToLocalDay = chartUtil.timestampToLocalDay(dateTimestamp, zoneIdOf);
                Long timestamp = dailyRecords2.getTimestamp();
                arrayList.add(new Entry(jTimestampToLocalDay, timestamp != null ? chartUtil.timestampToHourFloatWithBase(timestamp.longValue() * j, dailyRecords2.getDateTimestamp() * j) : Float.NaN));
            }
            listEmptyList = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView$setBedtimeData$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((Entry) t).getX()), Float.valueOf(((Entry) t2).getX()));
                }
            });
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        XAxis xAxis = getXAxis();
        MdLimitTimeAxisValueFormatter.Companion companion = MdLimitTimeAxisValueFormatter.INSTANCE;
        XAxis xAxis2 = getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis2, "getXAxis(...)");
        xAxis.setLabelCount(companion.calculateLabelCount(listEmptyList, xAxis2));
        LineDataSet lineDataSet = new LineDataSet(toNoneNaNListEntry(listEmptyList), "");
        lineDataSet.V0(Color.parseColor("#8673FA"));
        lineDataSet.s1(2.2f);
        LineDataSet.Mode mode = LineDataSet.Mode.LINEAR;
        lineDataSet.D1(mode);
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.RIGHT;
        lineDataSet.U0(axisDependency);
        lineDataSet.B1(true);
        lineDataSet.y1(3.0f);
        lineDataSet.v1(Color.parseColor("#8673FA"));
        lineDataSet.A1(true);
        lineDataSet.x1(1.0f);
        lineDataSet.w1(-1);
        lineDataSet.Y0(false);
        lineDataSet.l1(false);
        LineDataSet lineDataSet2 = new LineDataSet(toNaNListEntry(listEmptyList), "");
        lineDataSet2.V0(Color.parseColor("#8673FA"));
        lineDataSet2.s1(2.2f);
        lineDataSet2.D1(mode);
        lineDataSet2.U0(axisDependency);
        lineDataSet2.B1(true);
        lineDataSet2.y1(3.0f);
        lineDataSet2.v1(Color.parseColor("#8673FA"));
        lineDataSet2.A1(true);
        lineDataSet2.x1(1.0f);
        lineDataSet2.w1(-1);
        lineDataSet2.Y0(false);
        lineDataSet2.l1(false);
        super.setData(new bge((List<ktc>) CollectionsKt__CollectionsKt.listOf((Object[]) new LineDataSet[]{lineDataSet, lineDataSet2})));
        adjustYAxis();
        notifyDataSetChanged();
        invalidate();
    }

    public final void setCountData(@Nullable List<SleepData.CountDaily> dailyRecords) {
        List<SleepData.CountDaily> list = dailyRecords;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<SleepData.CountDaily> list2 = dailyRecords;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (SleepData.CountDaily countDaily : list2) {
            ChartUtil chartUtil = ChartUtil.INSTANCE;
            long dateTimestamp = countDaily.getDateTimestamp() * ((long) 1000);
            ZoneId zoneIdOf = ZoneId.of("UTC");
            Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(...)");
            long jTimestampToLocalDay = chartUtil.timestampToLocalDay(dateTimestamp, zoneIdOf);
            Integer count = countDaily.getCount();
            arrayList.add(new Entry(jTimestampToLocalDay, count != null ? count.intValue() : Float.NaN));
        }
        List<? extends Entry> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepInterfereLineChartView$setCountData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((Entry) t).getX()), Float.valueOf(((Entry) t2).getX()));
            }
        });
        XAxis xAxis = getXAxis();
        MdLimitTimeAxisValueFormatter.Companion companion = MdLimitTimeAxisValueFormatter.INSTANCE;
        XAxis xAxis2 = getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis2, "getXAxis(...)");
        xAxis.setLabelCount(companion.calculateLabelCount(listSortedWith, xAxis2));
        LineDataSet lineDataSet = new LineDataSet(toNoneNaNListEntry(listSortedWith), "");
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.RIGHT;
        lineDataSet.U0(axisDependency);
        lineDataSet.V0(Color.parseColor("#8673FA"));
        lineDataSet.s1(2.2f);
        LineDataSet.Mode mode = LineDataSet.Mode.LINEAR;
        lineDataSet.D1(mode);
        lineDataSet.B1(true);
        lineDataSet.y1(3.0f);
        lineDataSet.v1(lineDataSet.n0());
        lineDataSet.A1(true);
        lineDataSet.x1(1.0f);
        lineDataSet.w1(-1);
        lineDataSet.Y0(false);
        lineDataSet.l1(false);
        LineDataSet lineDataSet2 = new LineDataSet(toNaNListEntry(listSortedWith), "");
        lineDataSet2.U0(axisDependency);
        lineDataSet2.V0(Color.parseColor("#8673FA"));
        lineDataSet2.s1(2.2f);
        lineDataSet2.D1(mode);
        lineDataSet2.B1(true);
        lineDataSet2.y1(3.0f);
        lineDataSet2.v1(lineDataSet2.n0());
        lineDataSet2.A1(true);
        lineDataSet2.x1(1.0f);
        lineDataSet2.w1(-1);
        lineDataSet2.Y0(false);
        lineDataSet2.l1(false);
        setData(new bge((List<ktc>) CollectionsKt__CollectionsKt.listOf((Object[]) new ktc[]{lineDataSet, lineDataSet2})));
        LimitLine limitLine = new LimitLine(2.0f);
        limitLine.k(Color.parseColor("#8673FA"));
        limitLine.l(1.0f);
        limitLine.a(ExtUtilsKt.getDpFloat(Double.valueOf(1.5d)), ExtUtilsKt.getDpFloat(Double.valueOf(1.5d)), 0.0f);
        limitLine.i("");
        getAxisRight().removeAllLimitLines();
        getAxisRight().addLimitLine(limitLine);
        adjustAwakeCountYAxis();
        invalidate();
    }

    @NotNull
    public final List<Entry> toNaNListEntry(@NotNull List<? extends Entry> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Float.isNaN(((Entry) obj).getY())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Entry> toNoneNaNListEntry(@NotNull List<? extends Entry> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Float.isNaN(((Entry) obj).getY())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereLineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(@Nullable bge data) {
        super.setData(data);
        adjustYAxis();
        notifyDataSetChanged();
        invalidate();
    }

    public /* synthetic */ SleepInterfereLineChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepInterfereLineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setupBaseConfig();
    }
}
