package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepScheduleYAxisFormatter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import com.xiaomi.fitness.health.sleep.utils.SleepInsightReportUiHelper;
import defpackage.arr;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.hrl;
import defpackage.iji;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.vx5;
import defpackage.x44;
import defpackage.yyb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b<\u0010=J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u000f0\u0007\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u000f0\u0007\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00101\u001a\n \u001e*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightScheduleHolder;", "", "", "initRecyclerView", "()V", "initSleepLevelRecyclerView", "initSleepScheduleRecyclerView", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "entries", "", "getTheMinNumberFilterZero", "(Ljava/util/List;)I", "", "", "Lkotlin/Pair;", "scheduleMap", "sampleDateList", "buildSleepScheduleEntryList", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "animalType", "refreshSleepSchedule", "(ILjava/util/List;Ljava/util/Map;)V", "showExampleReportView", "Lyyb;", "binding", "Lyyb;", "getBinding", "()Lyyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroidx/recyclerview/widget/RecyclerView;", "sleepLevelDescRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "tvScheduleTimeTag", "Landroid/widget/TextView;", "tvScheduleSubtitle", "tvScheduleDesc", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "scheduleBarRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "scheduleChartData", "Ljava/util/List;", "Lr02;", "scheduleAttrs", "Lr02;", "Ls02;", "scheduleItemDecoration", "Ls02;", "Lrtr;", "scheduleYAxis", "Lrtr;", "Lq02;", "scheduleAdapter", "Lq02;", "<init>", "(Lyyb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInsightScheduleHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInsightScheduleHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightScheduleHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n216#2,2:221\n216#2:225\n217#2:228\n1863#3,2:223\n1863#3,2:226\n*S KotlinDebug\n*F\n+ 1 SleepInsightScheduleHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightScheduleHolder\n*L\n95#1:221,2\n187#1:225\n187#1:228\n176#1:223,2\n192#1:226,2\n*E\n"})
public final class SleepInsightScheduleHolder {

    @NotNull
    public static final String TAG = "SleepInsightSchedule";

    @NotNull
    private final yyb binding;
    private final Context context;

    @Nullable
    private q02<RecyclerBarEntry> scheduleAdapter;
    private final r02 scheduleAttrs;

    @NotNull
    private final BarChartRecyclerView scheduleBarRecyclerView;

    @NotNull
    private final List<RecyclerBarEntry> scheduleChartData;

    @Nullable
    private s02 scheduleItemDecoration;

    @Nullable
    private rtr scheduleYAxis;

    @NotNull
    private final RecyclerView sleepLevelDescRecyclerView;

    @NotNull
    private final TextView tvScheduleDesc;

    @NotNull
    private final TextView tvScheduleSubtitle;

    @NotNull
    private final TextView tvScheduleTimeTag;

    public SleepInsightScheduleHolder(@NotNull yyb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.context = binding.getRoot().getContext();
        RecyclerView sleepLevelDescRecyclerview = binding.B;
        Intrinsics.checkNotNullExpressionValue(sleepLevelDescRecyclerview, "sleepLevelDescRecyclerview");
        this.sleepLevelDescRecyclerView = sleepLevelDescRecyclerview;
        TextView tvTimeTag = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvTimeTag, "tvTimeTag");
        this.tvScheduleTimeTag = tvTimeTag;
        TextView tvTimeSubtitle = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvTimeSubtitle, "tvTimeSubtitle");
        this.tvScheduleSubtitle = tvTimeSubtitle;
        TextView tvScheduleTimeDesc = binding.C;
        Intrinsics.checkNotNullExpressionValue(tvScheduleTimeDesc, "tvScheduleTimeDesc");
        this.tvScheduleDesc = tvScheduleTimeDesc;
        BarChartRecyclerView barRecyclerView = binding.A;
        Intrinsics.checkNotNullExpressionValue(barRecyclerView, "barRecyclerView");
        this.scheduleBarRecyclerView = barRecyclerView;
        this.scheduleChartData = new ArrayList();
        this.scheduleAttrs = (r02) barRecyclerView.mAttrs;
        initRecyclerView();
    }

    private final List<SegmentBarEntry> buildSleepScheduleEntryList(Map<Long, ? extends List<Pair<Long, Long>>> scheduleMap, List<Long> sampleDateList) {
        if (scheduleMap == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map mutableMap = MapsKt__MapsKt.toMutableMap(scheduleMap);
        Iterator<T> it = sampleDateList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (!mutableMap.containsKey(Long.valueOf(jLongValue))) {
                mutableMap.put(Long.valueOf(jLongValue), CollectionsKt__CollectionsKt.emptyList());
            }
        }
        SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(mutableMap, ComparisonsKt__ComparisonsKt.reverseOrder());
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(iji.Y1);
        int iA2 = x44.a(iji.c2);
        int i = 0;
        for (Map.Entry entry : sortedMap.entrySet()) {
            Long l = (Long) entry.getKey();
            List<Pair> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Intrinsics.checkNotNull(list);
            for (Pair pair : list) {
                long j = 1440;
                long jLongValue2 = ((Number) pair.getFirst()).longValue();
                Intrinsics.checkNotNull(l);
                long j2 = 60;
                hrl hrlVar = new hrl(j - ((jLongValue2 - l.longValue()) / j2), j - ((((Number) pair.getSecond()).longValue() - l.longValue()) / j2));
                hrlVar.c = hrlVar.f20377a <= 1440.0f ? iA2 : iA;
                arrayList2.add(hrlVar);
            }
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(arrayList2, 10);
            segmentBarEntry.type = 4;
            segmentBarEntry.timestamp = l.longValue();
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            segmentBarEntry.setX(i);
            arrayList.add(segmentBarEntry);
            i++;
        }
        return arrayList;
    }

    private final int getTheMinNumberFilterZero(List<? extends SegmentBarEntry> entries) {
        if (entries.isEmpty()) {
            return 0;
        }
        int size = entries.size();
        Integer numValueOf = null;
        for (int i = 0; i < size; i++) {
            SegmentBarEntry segmentBarEntry = entries.get(i);
            if (numValueOf == null && segmentBarEntry.getMinValue() != 0) {
                numValueOf = Integer.valueOf(segmentBarEntry.getMinValue());
            }
            if (numValueOf != null && segmentBarEntry.getMinValue() != 0) {
                numValueOf = Integer.valueOf(Math.min(numValueOf.intValue(), segmentBarEntry.getMinValue()));
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final void initRecyclerView() {
        initSleepLevelRecyclerView();
        initSleepScheduleRecyclerView();
    }

    private final void initSleepLevelRecyclerView() {
        gfe gfeVar = new gfe(this.context, SleepInsightReportUiHelper.INSTANCE.buildSleepLevelList(), 3);
        this.sleepLevelDescRecyclerView.setLayoutManager(new GridLayoutManager(this.context, 3));
        this.sleepLevelDescRecyclerView.setHasFixedSize(true);
        this.sleepLevelDescRecyclerView.setNestedScrollingEnabled(false);
        this.sleepLevelDescRecyclerView.setAdapter(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    private final void initSleepScheduleRecyclerView() {
        r02 r02Var = this.scheduleAttrs;
        r02Var.r0 = 1440.0f;
        r02Var.t0 = 1020.0f;
        vqr vqrVar = new vqr(r02Var, r02Var.c, new arr(this.context));
        rtr rtrVar = new rtr(this.scheduleAttrs);
        this.scheduleYAxis = rtrVar;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.mAxisMinimum = 840.0f;
        rtr rtrVar2 = this.scheduleYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.mAxisMaximum = 1560.0f;
        rtr rtrVar3 = this.scheduleYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.setValueFormatter(new SleepScheduleYAxisFormatter());
        s02 s02Var = new s02(this.scheduleYAxis, vqrVar, this.scheduleAttrs);
        this.scheduleItemDecoration = s02Var;
        BarChartRecyclerView barChartRecyclerView = this.scheduleBarRecyclerView;
        Intrinsics.checkNotNull(s02Var);
        barChartRecyclerView.addItemDecoration(s02Var);
        this.scheduleBarRecyclerView.setLayoutManager(new SpeedRatioLayoutManager(this.context, this.scheduleAttrs));
        q02<RecyclerBarEntry> q02Var = new q02<>(this.context, this.scheduleChartData, this.scheduleBarRecyclerView, vqrVar, this.scheduleAttrs, new vx5());
        this.scheduleAdapter = q02Var;
        this.scheduleBarRecyclerView.setAdapter(q02Var);
    }

    @NotNull
    public final yyb getBinding() {
        return this.binding;
    }

    public final void refreshSleepSchedule(@SleepAnimalType int animalType, @NotNull List<Long> sampleDateList, @Nullable Map<Long, ? extends List<Pair<Long, Long>>> scheduleMap) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(sampleDateList, "sampleDateList");
        if (scheduleMap != null) {
            i = 0;
            i2 = 0;
            for (Map.Entry<Long, ? extends List<Pair<Long, Long>>> entry : scheduleMap.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                Pair pair = (Pair) CollectionsKt___CollectionsKt.firstOrNull((List) entry.getValue());
                Long l = pair != null ? (Long) pair.getFirst() : null;
                if (l == null) {
                    i2++;
                } else if (l.longValue() - jLongValue < 0) {
                    i++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        String string = this.context.getString(SleepAnimalExtKt.getSleepAnimalScheduleStringRes(animalType));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (animalType == 1 || animalType == 2 || animalType == 3) {
            this.tvScheduleSubtitle.setText(this.context.getResources().getQuantityString(qxi.P0, i, Integer.valueOf(i)));
            TextView textView = this.tvScheduleDesc;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{string, this.context.getString(c0j.Tj)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            ViewExtKt.setVisible(this.tvScheduleTimeTag, false);
        } else {
            int i3 = (7 - i) - i2;
            this.tvScheduleSubtitle.setText(this.context.getResources().getQuantityString(qxi.Q0, i3, Integer.valueOf(i3)));
            TextView textView2 = this.tvScheduleDesc;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{string, this.context.getString(c0j.Sj)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
            ViewExtKt.setVisible(this.tvScheduleTimeTag, true);
        }
        List<SegmentBarEntry> listBuildSleepScheduleEntryList = buildSleepScheduleEntryList(scheduleMap, sampleDateList);
        this.scheduleChartData.clear();
        this.scheduleChartData.addAll(listBuildSleepScheduleEntryList);
        float segmentListMaxValue = SegmentBarEntry.INSTANCE.getSegmentListMaxValue(listBuildSleepScheduleEntryList);
        rtr rtrVar = this.scheduleYAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = Math.max(segmentListMaxValue, 1440.0f);
        }
        int theMinNumberFilterZero = getTheMinNumberFilterZero(listBuildSleepScheduleEntryList);
        rtr rtrVar2 = this.scheduleYAxis;
        if (rtrVar2 != null) {
            rtrVar2.mAxisMinimum = theMinNumberFilterZero;
        }
        Logger.i(TAG, "sleepSchedule maxValue " + segmentListMaxValue + " minValue " + theMinNumberFilterZero);
        q02<RecyclerBarEntry> q02Var = this.scheduleAdapter;
        if (q02Var != null) {
            q02Var.notifyDataSetChanged();
        }
    }

    public final void showExampleReportView() {
        SleepAnimalHelper sleepAnimalHelper = SleepAnimalHelper.INSTANCE;
        refreshSleepSchedule(2, sleepAnimalHelper.buildSleepSampleDateExample(), sleepAnimalHelper.buildSleepScheduleExampleMap());
    }
}
