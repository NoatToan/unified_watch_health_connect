package com.mi.health.sleep.widget.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import defpackage.bge;
import defpackage.cu3;
import defpackage.hwq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00110\u0010R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mi/health/sleep/widget/chart/SleepChartView;", "Lcom/github/mikephil/charting/charts/LineChart;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stage2H", "", "Lcom/mi/health/sleep/widget/chart/SleepChartStage;", "", "stageCount", "setSleepPoints", "", "raw", "", "Lkotlin/Pair;", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepChartView.kt\ncom/mi/health/sleep/widget/chart/SleepChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1557#2:73\n1628#2,3:74\n774#2:77\n865#2,2:78\n774#2:80\n865#2,2:81\n1567#2:83\n1598#2,4:84\n1567#2:88\n1598#2,3:89\n1601#2:93\n1#3:92\n*S KotlinDebug\n*F\n+ 1 SleepChartView.kt\ncom/mi/health/sleep/widget/chart/SleepChartView\n*L\n37#1:73\n37#1:74,3\n38#1:77\n38#1:78,2\n40#1:80\n40#1:81,2\n42#1:83\n42#1:84,4\n46#1:88\n46#1:89,3\n46#1:93\n*E\n"})
public final class SleepChartView extends LineChart {
    private Map<SleepChartStage, Integer> stage2H;
    private int stageCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SleepChartView(@NotNull Context ctx) {
        this(ctx, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    public final void setSleepPoints(@NotNull List<? extends Pair<Long, ? extends SleepChartStage>> raw) {
        Map<SleepChartStage, Integer> map;
        Intrinsics.checkNotNullParameter(raw, "raw");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SleepChartStage[]{SleepChartStage.DEEP_SLEEP, SleepChartStage.LIGHT_SLEEP, SleepChartStage.RAPID_EYE_MOVEMENT, SleepChartStage.AWAKE});
        List<? extends Pair<Long, ? extends SleepChartStage>> list = raw;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((SleepChartStage) ((Pair) it.next()).getSecond());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((SleepChartStage) obj) != SleepChartStage.NOT_SLEEP) {
                arrayList2.add(obj);
            }
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listListOf) {
            if (set.contains((SleepChartStage) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        int i = 0;
        for (Object obj3 : arrayList3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList4.add(TuplesKt.to((SleepChartStage) obj3, Integer.valueOf(i)));
            i = i2;
        }
        this.stage2H = MapsKt__MapsKt.toMap(arrayList4);
        this.stageCount = RangesKt___RangesKt.coerceAtLeast(arrayList3.size(), 1);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        int i3 = 0;
        while (true) {
            Map<SleepChartStage, Integer> map2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) next;
            long jLongValue = ((Number) pair.component1()).longValue();
            SleepChartStage sleepChartStage = (SleepChartStage) pair.component2();
            Map<SleepChartStage, Integer> map3 = this.stage2H;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stage2H");
            } else {
                map2 = map3;
            }
            Integer num = map2.get(sleepChartStage);
            Entry entry = new Entry(i3, num != null ? num.intValue() : -1);
            entry.setData(Long.valueOf(jLongValue));
            arrayList5.add(entry);
            i3 = i4;
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList5, "");
        lineDataSet.b1(false);
        setData(new bge(lineDataSet));
        cu3 animator = getAnimator();
        Intrinsics.checkNotNullExpressionValue(animator, "getAnimator(...)");
        hwq viewPortHandler = getViewPortHandler();
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "getViewPortHandler(...)");
        Map<SleepChartStage, Integer> map4 = this.stage2H;
        if (map4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stage2H");
            map = null;
        } else {
            map = map4;
        }
        setRenderer(new PointBlockRenderer(this, animator, viewPortHandler, map, this.stageCount));
        YAxis axisLeft = getAxisLeft();
        axisLeft.setAxisMinimum(-0.5f);
        axisLeft.setAxisMaximum(this.stageCount - 0.5f);
        axisLeft.setGranularity(1.0f);
        axisLeft.setDrawLabels(false);
        axisLeft.enableGridDashedLine(8.0f, 6.0f, 0.0f);
        getAxisRight().setEnabled(false);
        getXAxis().setEnabled(false);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        invalidate();
    }

    public /* synthetic */ SleepChartView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepChartView(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        setExtraTopOffset(0.0f);
        setExtraBottomOffset(0.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setMinOffset(0.0f);
        setClipDataToContent(false);
    }
}
