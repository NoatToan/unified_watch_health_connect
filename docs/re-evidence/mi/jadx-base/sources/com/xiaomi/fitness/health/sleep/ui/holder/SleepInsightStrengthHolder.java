package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepDayNapYAxisFormatter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import com.xiaomi.fitness.health.sleep.utils.SleepInsightReportUiHelper;
import defpackage.arr;
import defpackage.azb;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.vx5;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\n \u0019*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStrengthHolder;", "", "", "initLevelRecyclerView", "()V", "initBarRecyclerView", "", "", "", "dataMap", "", "sampleDateList", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "buildEntryList", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "strengthMap", "refreshSleepStrength", "(Ljava/util/List;Ljava/util/Map;)V", "showExampleReportView", "Lazb;", "binding", "Lazb;", "getBinding", "()Lazb;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvTimeTag", "Landroid/widget/TextView;", "tvSubtitle", "tvDesc", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/LinearLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "levelRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "barEntries", "Ljava/util/List;", "Lr02;", "barChartAttrs", "Lr02;", "Ls02;", "barChartItemDecoration", "Ls02;", "Lrtr;", "yAxis", "Lrtr;", "Lq02;", "barChartAdapter", "Lq02;", "<init>", "(Lazb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInsightStrengthHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInsightStrengthHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStrengthHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n216#2,2:154\n216#2,2:158\n1863#3,2:156\n*S KotlinDebug\n*F\n+ 1 SleepInsightStrengthHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStrengthHolder\n*L\n79#1:154,2\n132#1:158,2\n124#1:156,2\n*E\n"})
public final class SleepInsightStrengthHolder {

    @NotNull
    public static final String TAG = "SleepStrength";

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
    private final azb binding;
    private final Context context;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final RecyclerView levelRecyclerView;

    @NotNull
    private final TextView tvDesc;

    @NotNull
    private final TextView tvSubtitle;

    @NotNull
    private final TextView tvTimeTag;

    @Nullable
    private rtr yAxis;

    public SleepInsightStrengthHolder(@NotNull azb binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.context = binding.getRoot().getContext();
        TextView tvTimeTag = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvTimeTag, "tvTimeTag");
        this.tvTimeTag = tvTimeTag;
        TextView tvTimeSubtitle = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvTimeSubtitle, "tvTimeSubtitle");
        this.tvSubtitle = tvTimeSubtitle;
        TextView tvScheduleTimeDesc = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvScheduleTimeDesc, "tvScheduleTimeDesc");
        this.tvDesc = tvScheduleTimeDesc;
        BarChartRecyclerView barRecyclerView = binding.A;
        Intrinsics.checkNotNullExpressionValue(barRecyclerView, "barRecyclerView");
        this.barRecyclerView = barRecyclerView;
        LinearLayout llEmpty = binding.C;
        Intrinsics.checkNotNullExpressionValue(llEmpty, "llEmpty");
        this.emptyView = llEmpty;
        RecyclerView levelDescRecyclerview = binding.B;
        Intrinsics.checkNotNullExpressionValue(levelDescRecyclerview, "levelDescRecyclerview");
        this.levelRecyclerView = levelDescRecyclerview;
        this.barEntries = new ArrayList();
        this.barChartAttrs = (r02) barRecyclerView.mAttrs;
        initLevelRecyclerView();
        initBarRecyclerView();
    }

    private final List<RecyclerBarEntry> buildEntryList(Map<Long, Integer> dataMap, List<Long> sampleDateList) {
        int i;
        Map mutableMap = MapsKt__MapsKt.toMutableMap(dataMap);
        Iterator<T> it = sampleDateList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            long jLongValue = ((Number) it.next()).longValue();
            if (!mutableMap.containsKey(Long.valueOf(jLongValue))) {
                mutableMap.put(Long.valueOf(jLongValue), 0);
            }
        }
        SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(mutableMap, ComparisonsKt__ComparisonsKt.reverseOrder());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sortedMap.entrySet()) {
            Long l = (Long) entry.getKey();
            float fIntValue = ((Integer) entry.getValue()).intValue();
            Intrinsics.checkNotNull(l);
            arrayList.add(new RecyclerBarEntry(i, fIntValue, l.longValue(), 4));
            i++;
        }
        return arrayList;
    }

    private final void initBarRecyclerView() {
        r02 r02Var = this.barChartAttrs;
        vqr vqrVar = new vqr(r02Var, r02Var.c, new arr(this.context));
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        rtrVar.mAxisMaximum = 120.0f;
        this.barChartAttrs.x0 = true;
        rtrVar.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(30.0f), Float.valueOf(60.0f), Float.valueOf(90.0f), Float.valueOf(120.0f)}));
        rtr rtrVar2 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar2);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        rtrVar2.setValueFormatter(new SleepDayNapYAxisFormatter(context));
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

    private final void initLevelRecyclerView() {
        gfe gfeVar = new gfe(this.context, SleepInsightReportUiHelper.INSTANCE.buildSleepStrengthList(), 3);
        this.levelRecyclerView.setLayoutManager(new GridLayoutManager(this.context, 3));
        this.levelRecyclerView.setHasFixedSize(true);
        this.levelRecyclerView.setNestedScrollingEnabled(false);
        this.levelRecyclerView.setAdapter(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    @NotNull
    public final azb getBinding() {
        return this.binding;
    }

    public final void refreshSleepStrength(@NotNull List<Long> sampleDateList, @Nullable Map<Long, Integer> strengthMap) {
        int i;
        Intrinsics.checkNotNullParameter(sampleDateList, "sampleDateList");
        if (strengthMap != null) {
            Iterator<Map.Entry<Long, Integer>> it = strengthMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().getValue().intValue() > 0) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        this.tvDesc.setText(this.context.getString(c0j.fg));
        if (i <= 0) {
            ViewExtKt.setVisible(this.emptyView, true);
            ViewExtKt.setVisible(this.barRecyclerView, false);
            ViewExtKt.setVisible(this.tvSubtitle, false);
            ViewExtKt.setVisible(this.tvTimeTag, false);
            ViewExtKt.setVisible(this.levelRecyclerView, false);
            return;
        }
        ViewExtKt.setVisible(this.levelRecyclerView, true);
        ViewExtKt.setVisible(this.emptyView, false);
        ViewExtKt.setVisible(this.barRecyclerView, true);
        ViewExtKt.setVisible(this.tvSubtitle, true);
        this.tvSubtitle.setText(this.context.getResources().getQuantityString(qxi.y0, i, Integer.valueOf(i)));
        ViewExtKt.setVisible(this.tvTimeTag, true);
        Intrinsics.checkNotNull(strengthMap);
        List<RecyclerBarEntry> listBuildEntryList = buildEntryList(strengthMap, sampleDateList);
        this.barEntries.clear();
        this.barEntries.addAll(listBuildEntryList);
        float theMaxNumber = ChartUtil.getTheMaxNumber(listBuildEntryList);
        int i2 = theMaxNumber > ((float) 120) ? ((((int) theMaxNumber) / 40) * 40) + 40 : 120;
        rtr rtrVar = this.yAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = i2;
        }
        this.barChartAttrs.x0 = true;
        ArrayList arrayList = new ArrayList();
        int i3 = i2 / 4;
        for (int i4 = 0; i4 < 4; i4++) {
            arrayList.add(Float.valueOf(i2 - (i4 * i3)));
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
        refreshSleepStrength(sleepAnimalHelper.buildSleepSampleDateExample(), sleepAnimalHelper.buildSleepStrengthExample());
    }
}
