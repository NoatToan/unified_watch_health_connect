package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepWakeCountYAxisFormatter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import defpackage.arr;
import defpackage.c0j;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.uyb;
import defpackage.vqr;
import defpackage.vx5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b6\u00107J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n \u0019*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightContinuityHolder;", "", "", "initRecyclerView", "()V", "", "", "", "dataMap", "", "sampleDateList", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "buildEntryList", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "animalType", "awakeCountMap", "refreshSleepContinuity", "(ILjava/util/List;Ljava/util/Map;)V", "showExampleReportView", "Luyb;", "binding", "Luyb;", "getBinding", "()Luyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvTimeTag", "Landroid/widget/TextView;", "tvSubtitle", "tvDesc", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/LinearLayout;", "", "barEntries", "Ljava/util/List;", "Lr02;", "barChartAttrs", "Lr02;", "Ls02;", "barChartItemDecoration", "Ls02;", "Lrtr;", "yAxis", "Lrtr;", "Lq02;", "barChartAdapter", "Lq02;", "<init>", "(Luyb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInsightContinuityHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInsightContinuityHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightContinuityHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n216#2,2:166\n216#2,2:170\n1863#3,2:168\n*S KotlinDebug\n*F\n+ 1 SleepInsightContinuityHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightContinuityHolder\n*L\n74#1:166,2\n146#1:170,2\n138#1:168,2\n*E\n"})
public final class SleepInsightContinuityHolder {

    @NotNull
    public static final String TAG = "SleepContinuity";
    public static final float TARGET_COUNT = 2.0f;

    @Nullable
    private q02<RecyclerBarEntry> barChartAdapter;
    private final r02 barChartAttrs;

    @Nullable
    private s02 barChartItemDecoration;

    @NotNull
    private final List<RecyclerBarEntry> barEntries;

    @NotNull
    private final BarChartRecyclerView barRecyclerView;

    @NotNull
    private final uyb binding;
    private final Context context;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final TextView tvDesc;

    @NotNull
    private final TextView tvSubtitle;

    @NotNull
    private final TextView tvTimeTag;

    @Nullable
    private rtr yAxis;

    public SleepInsightContinuityHolder(@NotNull uyb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.context = binding.getRoot().getContext();
        TextView tvTimeTag = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvTimeTag, "tvTimeTag");
        this.tvTimeTag = tvTimeTag;
        TextView tvTimeSubtitle = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvTimeSubtitle, "tvTimeSubtitle");
        this.tvSubtitle = tvTimeSubtitle;
        TextView tvScheduleTimeDesc = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvScheduleTimeDesc, "tvScheduleTimeDesc");
        this.tvDesc = tvScheduleTimeDesc;
        BarChartRecyclerView barRecyclerView = binding.A;
        Intrinsics.checkNotNullExpressionValue(barRecyclerView, "barRecyclerView");
        this.barRecyclerView = barRecyclerView;
        LinearLayout llEmpty = binding.B;
        Intrinsics.checkNotNullExpressionValue(llEmpty, "llEmpty");
        this.emptyView = llEmpty;
        this.barEntries = new ArrayList();
        this.barChartAttrs = (r02) barRecyclerView.mAttrs;
        initRecyclerView();
    }

    private final List<RecyclerBarEntry> buildEntryList(Map<Long, Integer> dataMap, List<Long> sampleDateList) {
        Map mutableMap = MapsKt__MapsKt.toMutableMap(dataMap);
        Iterator<T> it = sampleDateList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (!mutableMap.containsKey(Long.valueOf(jLongValue))) {
                mutableMap.put(Long.valueOf(jLongValue), 0);
            }
        }
        SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(mutableMap, ComparisonsKt__ComparisonsKt.reverseOrder());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map.Entry entry : sortedMap.entrySet()) {
            Long l = (Long) entry.getKey();
            Integer num = (Integer) entry.getValue();
            float fIntValue = num.intValue();
            Intrinsics.checkNotNull(l);
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(i, fIntValue, l.longValue(), 4);
            recyclerBarEntry.chartItemType = num.intValue() > 2 ? 1 : 0;
            arrayList.add(recyclerBarEntry);
            i++;
        }
        return arrayList;
    }

    private final void initRecyclerView() {
        r02 r02Var = this.barChartAttrs;
        r02Var.r0 = 2.0f;
        vqr vqrVar = new vqr(r02Var, r02Var.c, new arr(this.context));
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        this.barChartAttrs.x0 = true;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.mAxisMaximum = 6.0f;
        rtr rtrVar2 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.e(CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(4.0f), Float.valueOf(6.0f)));
        rtr rtrVar3 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar3);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        rtrVar3.setValueFormatter(new SleepWakeCountYAxisFormatter(context));
        s02 s02Var = new s02(this.yAxis, vqrVar, this.barChartAttrs);
        this.barChartItemDecoration = s02Var;
        BarChartRecyclerView barChartRecyclerView = this.barRecyclerView;
        Intrinsics.checkNotNull(s02Var);
        barChartRecyclerView.addItemDecoration(s02Var);
        this.barRecyclerView.setLayoutManager(new SpeedRatioLayoutManager(this.context, this.barChartAttrs));
        q02<RecyclerBarEntry> q02Var = new q02<>(this.context, this.barEntries, this.barRecyclerView, vqrVar, this.barChartAttrs, new vx5());
        this.barChartAdapter = q02Var;
        this.barRecyclerView.setAdapter(q02Var);
    }

    @NotNull
    public final uyb getBinding() {
        return this.binding;
    }

    public final void refreshSleepContinuity(@SleepAnimalType int animalType, @NotNull List<Long> sampleDateList, @Nullable Map<Long, Integer> awakeCountMap) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(sampleDateList, "sampleDateList");
        if (awakeCountMap != null) {
            i = 0;
            i2 = 0;
            for (Map.Entry<Long, Integer> entry : awakeCountMap.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    i++;
                }
                if (entry.getValue().intValue() > 2) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        String string = this.context.getString(SleepAnimalExtKt.getSleepAnimalContinuityStringRes(animalType));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (animalType == 1 || animalType == 4) {
            TextView textView = this.tvDesc;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s %s", Arrays.copyOf(new Object[]{string, this.context.getString(c0j.ye)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            ViewExtKt.setVisible(this.tvTimeTag, true);
        } else {
            TextView textView2 = this.tvDesc;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s %s", Arrays.copyOf(new Object[]{string, this.context.getString(c0j.ze)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
            ViewExtKt.setVisible(this.tvTimeTag, false);
        }
        if (i <= 0) {
            ViewExtKt.setVisible(this.emptyView, true);
            ViewExtKt.setVisible(this.tvSubtitle, false);
            ViewExtKt.setVisible(this.barRecyclerView, false);
            ViewExtKt.setVisible(this.tvTimeTag, false);
            return;
        }
        ViewExtKt.setVisible(this.emptyView, false);
        ViewExtKt.setVisible(this.barRecyclerView, true);
        ViewExtKt.setVisible(this.tvSubtitle, true);
        this.tvSubtitle.setText(this.context.getResources().getQuantityString(qxi.p0, i2, Integer.valueOf(i2)));
        Intrinsics.checkNotNull(awakeCountMap);
        List<RecyclerBarEntry> listBuildEntryList = buildEntryList(awakeCountMap, sampleDateList);
        this.barEntries.clear();
        this.barEntries.addAll(listBuildEntryList);
        float theMaxNumber = ChartUtil.getTheMaxNumber(listBuildEntryList);
        int i3 = theMaxNumber > 6.0f ? ((((int) theMaxNumber) / 3) * 3) + 3 : 6;
        rtr rtrVar = this.yAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = i3;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = i3 / 3;
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = i3 - (i5 * i4);
            if (i6 != 2) {
                arrayList.add(Float.valueOf(i6));
            }
        }
        rtr rtrVar2 = this.yAxis;
        if (rtrVar2 != null) {
            rtrVar2.e(arrayList);
        }
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        if (q02Var != null) {
            q02Var.notifyDataSetChanged();
        }
    }

    public final void showExampleReportView() {
        SleepAnimalHelper sleepAnimalHelper = SleepAnimalHelper.INSTANCE;
        refreshSleepContinuity(2, sleepAnimalHelper.buildSleepSampleDateExample(), sleepAnimalHelper.buildContinuityExampleData());
    }
}
