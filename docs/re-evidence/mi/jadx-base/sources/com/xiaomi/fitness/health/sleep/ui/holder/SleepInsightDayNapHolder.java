package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepDayNapYAxisFormatter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import defpackage.arr;
import defpackage.c0j;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.vx5;
import defpackage.wyb;
import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b5\u00106J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n \u0018*\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightDayNapHolder;", "", "", "initRecyclerView", "()V", "", "", "", "dataMap", "", "sampleDateList", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "buildEntryList", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "napMap", "refreshSleepDayNap", "(Ljava/util/List;Ljava/util/Map;)V", "showExampleReportView", "Lwyb;", "binding", "Lwyb;", "getBinding", "()Lwyb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvTimeTag", "Landroid/widget/TextView;", "tvSubtitle", "tvDesc", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/LinearLayout;", "", "barEntries", "Ljava/util/List;", "Lr02;", "barChartAttrs", "Lr02;", "Ls02;", "barChartItemDecoration", "Ls02;", "Lrtr;", "yAxis", "Lrtr;", "Lq02;", "barChartAdapter", "Lq02;", "<init>", "(Lwyb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInsightDayNapHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInsightDayNapHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightDayNapHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n216#2,2:147\n216#2,2:151\n1863#3,2:149\n*S KotlinDebug\n*F\n+ 1 SleepInsightDayNapHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightDayNapHolder\n*L\n66#1:147,2\n123#1:151,2\n115#1:149,2\n*E\n"})
public final class SleepInsightDayNapHolder {

    @NotNull
    public static final String TAG = "SleepDayNap";

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
    private final wyb binding;
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

    public SleepInsightDayNapHolder(@NotNull wyb binding) {
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
            recyclerBarEntry.chartItemType = num.intValue() > 30 ? 1 : 0;
            arrayList.add(recyclerBarEntry);
            i++;
        }
        return arrayList;
    }

    private final void initRecyclerView() {
        r02 r02Var = this.barChartAttrs;
        r02Var.r0 = 30.0f;
        vqr vqrVar = new vqr(r02Var, r02Var.c, new arr(this.context));
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.mAxisMaximum = 90.0f;
        rtr rtrVar2 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(3);
        rtr rtrVar3 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar3);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        rtrVar3.setValueFormatter(new SleepDayNapYAxisFormatter(context));
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
    public final wyb getBinding() {
        return this.binding;
    }

    public final void refreshSleepDayNap(@NotNull List<Long> sampleDateList, @Nullable Map<Long, Integer> napMap) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(sampleDateList, "sampleDateList");
        if (napMap != null) {
            i = 0;
            i2 = 0;
            for (Map.Entry<Long, Integer> entry : napMap.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    i++;
                }
                if (entry.getValue().intValue() > 30) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        this.tvDesc.setText(this.context.getString(c0j.af));
        if (i <= 0) {
            ViewExtKt.setVisible(this.emptyView, true);
            ViewExtKt.setVisible(this.barRecyclerView, false);
            ViewExtKt.setVisible(this.tvTimeTag, false);
            ViewExtKt.setVisible(this.tvSubtitle, false);
            return;
        }
        ViewExtKt.setVisible(this.emptyView, false);
        ViewExtKt.setVisible(this.barRecyclerView, true);
        ViewExtKt.setVisible(this.tvSubtitle, true);
        boolean z = i2 > 0;
        ViewExtKt.setVisible(this.tvTimeTag, z);
        this.tvSubtitle.setText(z ? this.context.getResources().getQuantityString(qxi.u0, i2, Integer.valueOf(i2)) : this.context.getResources().getString(c0j.bf));
        Intrinsics.checkNotNull(napMap);
        List<RecyclerBarEntry> listBuildEntryList = buildEntryList(napMap, sampleDateList);
        this.barEntries.clear();
        this.barEntries.addAll(listBuildEntryList);
        float theMaxNumber = ChartUtil.getTheMaxNumber(listBuildEntryList);
        int i3 = theMaxNumber > 90.0f ? ((((int) theMaxNumber) / 30) * 30) + 30 : 90;
        rtr rtrVar = this.yAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = i3;
        }
        if (i3 == 90) {
            this.barChartAttrs.x0 = true;
            if (rtrVar != null) {
                rtrVar.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(60.0f), Float.valueOf(90.0f)}));
            }
        } else {
            this.barChartAttrs.x0 = false;
            if (rtrVar != null) {
                rtrVar.setLabelCount(3);
            }
            rtr rtrVar2 = this.yAxis;
            if (rtrVar2 != null) {
                rtrVar2.f = 3;
            }
        }
        this.barChartAttrs.r0 = 30.0f;
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        if (q02Var != null) {
            q02Var.notifyDataSetChanged();
        }
    }

    public final void showExampleReportView() {
        SleepAnimalHelper sleepAnimalHelper = SleepAnimalHelper.INSTANCE;
        refreshSleepDayNap(sleepAnimalHelper.buildSleepSampleDateExample(), sleepAnimalHelper.buildSleepDayNapExample());
    }
}
