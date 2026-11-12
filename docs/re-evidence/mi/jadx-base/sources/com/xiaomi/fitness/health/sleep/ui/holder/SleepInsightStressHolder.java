package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.decoration.SleepStressYAxisFormatter;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepInsightStressHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalHelper;
import com.xiaomi.fitness.health.sleep.utils.SleepInsightReportUiHelper;
import defpackage.arr;
import defpackage.c0j;
import defpackage.czb;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bD\u0010EJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\n !*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStressHolder;", "", "", "initLevelRecyclerView", "()V", "initBarRecyclerView", "", "", "", "dataMap", "", "sampleDateList", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "buildEntryList", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "stressMap", "refreshSleepStress", "(Ljava/util/List;Ljava/util/Map;)V", "", "open", "onPressureOpenStatusUpdate", "(Ljava/lang/Boolean;)V", LifecycleConstantKt.ON_RESUME, "showExampleReportView", "Lczb;", "binding", "Lczb;", "getBinding", "()Lczb;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;", "iSleepInsight", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvTimeTag", "Landroid/widget/TextView;", "tvSubtitle", "tvDesc", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Landroid/widget/LinearLayout;", "emptyView", "Landroid/widget/LinearLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "levelRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "tvOpenStress", "", "barEntries", "Ljava/util/List;", "Lr02;", "barChartAttrs", "Lr02;", "Ls02;", "barChartItemDecoration", "Ls02;", "Lrtr;", "yAxis", "Lrtr;", "Lq02;", "barChartAdapter", "Lq02;", "needRequestPressureSwitch", "Z", "<init>", "(Lczb;Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInsightStressHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInsightStressHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStressHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n216#2,2:181\n216#2,2:185\n1863#3,2:183\n*S KotlinDebug\n*F\n+ 1 SleepInsightStressHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStressHolder\n*L\n91#1:181,2\n157#1:185,2\n149#1:183,2\n*E\n"})
public final class SleepInsightStressHolder {

    @NotNull
    public static final String TAG = "SleepStress";

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
    private final czb binding;
    private final Context context;

    @NotNull
    private final LinearLayout emptyView;

    @NotNull
    private final ISleepInsight iSleepInsight;

    @NotNull
    private final RecyclerView levelRecyclerView;
    private boolean needRequestPressureSwitch;

    @NotNull
    private final TextView tvDesc;

    @NotNull
    private final TextView tvOpenStress;

    @NotNull
    private final TextView tvSubtitle;

    @NotNull
    private final TextView tvTimeTag;

    @Nullable
    private rtr yAxis;

    public SleepInsightStressHolder(@NotNull czb binding, @NotNull ISleepInsight iSleepInsight) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(iSleepInsight, "iSleepInsight");
        this.binding = binding;
        this.iSleepInsight = iSleepInsight;
        this.context = binding.getRoot().getContext();
        TextView tvTimeTag = binding.H;
        Intrinsics.checkNotNullExpressionValue(tvTimeTag, "tvTimeTag");
        this.tvTimeTag = tvTimeTag;
        TextView tvTimeSubtitle = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvTimeSubtitle, "tvTimeSubtitle");
        this.tvSubtitle = tvTimeSubtitle;
        TextView tvScheduleTimeDesc = binding.F;
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
        TextView tvOpen = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvOpen, "tvOpen");
        this.tvOpenStress = tvOpen;
        this.barEntries = new ArrayList();
        this.barChartAttrs = (r02) barRecyclerView.mAttrs;
        initLevelRecyclerView();
        initBarRecyclerView();
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
            recyclerBarEntry.chartItemType = num.intValue() > 80 ? 1 : 0;
            arrayList.add(recyclerBarEntry);
            i++;
        }
        return arrayList;
    }

    private final void initBarRecyclerView() {
        r02 r02Var = this.barChartAttrs;
        r02Var.r0 = 80.0f;
        vqr vqrVar = new vqr(r02Var, r02Var.c, new arr(this.context));
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        rtrVar.mAxisMaximum = 100.0f;
        this.barChartAttrs.x0 = true;
        rtrVar.e(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(25.0f), Float.valueOf(50.0f), Float.valueOf(100.0f)}));
        rtr rtrVar2 = this.yAxis;
        Intrinsics.checkNotNull(rtrVar2);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        rtrVar2.setValueFormatter(new SleepStressYAxisFormatter(context));
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
        gfe gfeVar = new gfe(this.context, SleepInsightReportUiHelper.INSTANCE.buildSleepStressList(), 3);
        this.levelRecyclerView.setLayoutManager(new GridLayoutManager(this.context, 3));
        this.levelRecyclerView.setHasFixedSize(true);
        this.levelRecyclerView.setNestedScrollingEnabled(false);
        this.levelRecyclerView.setAdapter(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPressureOpenStatusUpdate$lambda$1(SleepInsightStressHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        Context context = this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        settingsPageUtil.gotoPressurePage(context);
    }

    @NotNull
    public final czb getBinding() {
        return this.binding;
    }

    public final void onPressureOpenStatusUpdate(@Nullable Boolean open) {
        Logger.i(TAG, "onPressureOpenStatusUpdate " + open);
        if (open == null || !this.needRequestPressureSwitch || open.booleanValue()) {
            ViewExtKt.setVisible(this.tvOpenStress, false);
        } else {
            ViewExtKt.setVisible(this.tvOpenStress, true);
            this.tvOpenStress.setOnClickListener(new View.OnClickListener() { // from class: zmm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInsightStressHolder.onPressureOpenStatusUpdate$lambda$1(this.f41466a, view);
                }
            });
        }
    }

    public final void onResume() {
        if (this.needRequestPressureSwitch) {
            this.iSleepInsight.requestSleepPressureSwitch();
        }
    }

    public final void refreshSleepStress(@NotNull List<Long> sampleDateList, @Nullable Map<Long, Integer> stressMap) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(sampleDateList, "sampleDateList");
        if (stressMap != null) {
            i = 0;
            i2 = 0;
            for (Map.Entry<Long, Integer> entry : stressMap.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    i++;
                }
                if (entry.getValue().intValue() > 80) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        this.tvDesc.setText(this.context.getString(c0j.Xc));
        if (i <= 0) {
            this.needRequestPressureSwitch = true;
            ViewExtKt.setVisible(this.emptyView, true);
            ViewExtKt.setVisible(this.barRecyclerView, false);
            ViewExtKt.setVisible(this.tvSubtitle, false);
            ViewExtKt.setVisible(this.tvTimeTag, false);
            ViewExtKt.setVisible(this.levelRecyclerView, false);
            this.iSleepInsight.requestSleepPressureSwitch();
            return;
        }
        this.needRequestPressureSwitch = false;
        ViewExtKt.setVisible(this.emptyView, false);
        ViewExtKt.setVisible(this.barRecyclerView, true);
        ViewExtKt.setVisible(this.tvSubtitle, true);
        ViewExtKt.setVisible(this.levelRecyclerView, true);
        ViewExtKt.setVisible(this.tvOpenStress, false);
        boolean z = i2 > 0;
        this.tvSubtitle.setText(z ? this.context.getResources().getQuantityString(qxi.h0, i2, Integer.valueOf(i2)) : this.context.getResources().getString(c0j.Yc));
        ViewExtKt.setVisible(this.tvTimeTag, z);
        Intrinsics.checkNotNull(stressMap);
        List<RecyclerBarEntry> listBuildEntryList = buildEntryList(stressMap, sampleDateList);
        this.barEntries.clear();
        this.barEntries.addAll(listBuildEntryList);
        q02<RecyclerBarEntry> q02Var = this.barChartAdapter;
        if (q02Var != null) {
            q02Var.notifyDataSetChanged();
        }
    }

    public final void showExampleReportView() {
        SleepAnimalHelper sleepAnimalHelper = SleepAnimalHelper.INSTANCE;
        refreshSleepStress(sleepAnimalHelper.buildSleepSampleDateExample(), sleepAnimalHelper.buildSleepStressExample());
    }
}
