package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.sleep.ui.SleepHrmDetailFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.pni;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.sbo;
import defpackage.uba;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020)\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepHrmDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Luba;", "", "initView", "()V", "initChartBarRecyclerView", "refreshView", "refreshChartView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "sleepHrmReportList", "Ljava/util/List;", "Landroid/widget/TextView;", "tvAvgValue", "Landroid/widget/TextView;", "tvTimeRange", "tvTip", "chartTitleLayout", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivChartIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "tvChartTitle", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepHrmDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHrmDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepHrmDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1863#2,2:212\n*S KotlinDebug\n*F\n+ 1 SleepHrmDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepHrmDetailFragment\n*L\n175#1:212,2\n*E\n"})
public final class SleepHrmDetailFragment extends BaseBindingFragment<SleepViewModel, uba> {

    @NotNull
    public static final String KEY_HRM_RECORD_LIST = "record_list";

    @NotNull
    public static final String KEY_REPORT = "report";

    @NotNull
    public static final String TAG = "SleepHrmDetail";

    @Nullable
    private r02 barChartAttrs;

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private q02<RecyclerBarEntry> chartAdapter;

    @Nullable
    private sbo chartItemDecoration;

    @Nullable
    private View chartTitleLayout;

    @Nullable
    private List<RecyclerBarEntry> entryList;

    @Nullable
    private AppCompatImageView ivChartIcon;

    @Nullable
    private List<TimesDataRecordInt> sleepHrmReportList;

    @Nullable
    private SleepSegmentReport sleepSegmentReport;

    @Nullable
    private TextView tvAvgValue;

    @Nullable
    private TextView tvChartTitle;

    @Nullable
    private TextView tvTimeRange;

    @Nullable
    private TextView tvTip;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public SleepHrmDetailFragment() {
        super(jui.N0);
    }

    private final void initChartBarRecyclerView() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        this.yAxis = new rtr(this.barChartAttrs);
        r02 r02Var = this.barChartAttrs;
        Intrinsics.checkNotNull(r02Var);
        vqr vqrVar = new vqr(r02Var, r02Var.c, xqrVar);
        this.xAxis = vqrVar;
        this.chartItemDecoration = new sbo(this.yAxis, vqrVar, this.barChartAttrs);
        SleepRateHighLightMarkValueFormatter sleepRateHighLightMarkValueFormatter = new SleepRateHighLightMarkValueFormatter(0);
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.setHighLightValueFormatter(sleepRateHighLightMarkValueFormatter);
        this.chartAdapter = new q02<>(contextRequireContext, this.entryList, this.barChartRecyclerView, this.xAxis, this.barChartAttrs, sleepRateHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        barChartRecyclerView2.setAdapter(this.chartAdapter);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        sbo sboVar2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar2);
        barChartRecyclerView3.addItemDecoration(sboVar2);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(new SpeedRatioLayoutManager(contextRequireContext, this.barChartAttrs));
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(new hak(contextRequireContext, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepHrmDetailFragment.initChartBarRecyclerView.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    View view = SleepHrmDetailFragment.this.chartTitleLayout;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view2 = SleepHrmDetailFragment.this.chartTitleLayout;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
            }
        }));
    }

    private final void initView() {
        this.tvAvgValue = getMBinding().J;
        this.tvTimeRange = getMBinding().G;
        this.tvTip = getMBinding().H;
        this.chartTitleLayout = getMBinding().B;
        this.ivChartIcon = getMBinding().C;
        this.tvChartTitle = getMBinding().F;
        this.barChartRecyclerView = getMBinding().A;
        initChartBarRecyclerView();
    }

    private final void refreshChartView() {
        SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
        Intrinsics.checkNotNull(sleepSegmentReport);
        long bedTime = sleepSegmentReport.getBedTime();
        SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
        Intrinsics.checkNotNull(sleepSegmentReport2);
        long wakeupTime = sleepSegmentReport2.getWakeupTime();
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.d(bedTime, wakeupTime);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = bedTime;
        int i = 0;
        while (j < wakeupTime) {
            linkedHashMap.put(Long.valueOf(((long) (i * 1800)) + bedTime), new ArrayList());
            i++;
            j = ((long) (i * 1800)) + bedTime;
        }
        int size = linkedHashMap.size();
        if (size == 0) {
            BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
            if (barChartRecyclerView != null) {
                barChartRecyclerView.setVisibility(8);
                return;
            }
            return;
        }
        List<TimesDataRecordInt> list = this.sleepHrmReportList;
        Intrinsics.checkNotNull(list);
        for (TimesDataRecordInt timesDataRecordInt : list) {
            List list2 = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (list2 != null) {
                list2.addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            long j2 = ((long) (i2 * 1800)) + bedTime;
            List<Integer> arrayList2 = (List) linkedHashMap.get(Long.valueOf(j2));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            r02 r02Var = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            int i3 = r02Var.g0;
            r02 r02Var2 = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, arrayList2, i3, r02Var2.g0), 10);
            segmentBarEntry.timestamp = j2;
            segmentBarEntry.localDate = TimeDateUtil.timestampToLocalDate(j2);
            segmentBarEntry.type = 3;
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
        }
        final Function2 function2 = new Function2() { // from class: xmm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepHrmDetailFragment.refreshChartView$lambda$2((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: ymm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepHrmDetailFragment.refreshChartView$lambda$3(function2, obj, obj2);
            }
        });
        List<RecyclerBarEntry> list3 = this.entryList;
        Intrinsics.checkNotNull(list3);
        list3.clear();
        List<RecyclerBarEntry> list4 = this.entryList;
        Intrinsics.checkNotNull(list4);
        list4.addAll(arrayList);
        vqr vqrVar = this.xAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        float theMaxNumber = HealthUtil.getTheMaxNumber(this.entryList);
        rtr rtrVar = this.yAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.yAxis = rtrVar.l(this.yAxis, theMaxNumber);
        sbo sboVar2 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar2);
        sboVar2.setYAxis(this.yAxis);
        sbo sboVar3 = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar3);
        sboVar3.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.setXAxis(this.xAxis);
        q02<RecyclerBarEntry> q02Var2 = this.chartAdapter;
        Intrinsics.checkNotNull(q02Var2);
        q02Var2.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int refreshChartView$lambda$2(SegmentBarEntry o1, SegmentBarEntry o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return Intrinsics.compare(o2.timestamp, o1.timestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int refreshChartView$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void refreshView() {
        TextView textView = this.tvAvgValue;
        if (textView != null) {
            Resources resources = getResources();
            int i = qxi.common_unit_heart_rate_desc;
            SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport);
            Integer avgHr = sleepSegmentReport.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            int iIntValue = avgHr.intValue();
            SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport2);
            textView.setText(resources.getQuantityString(i, iIntValue, sleepSegmentReport2.getAvgHr()));
        }
        TextView textView2 = this.tvTimeRange;
        if (textView2 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            SleepSegmentReport sleepSegmentReport3 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport3);
            long bedTime = sleepSegmentReport3.getBedTime();
            SleepSegmentReport sleepSegmentReport4 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport4);
            textView2.setText(SleepExtKt.getSleepTimeRangeStr(contextRequireContext, bedTime, sleepSegmentReport4.getWakeupTime()));
        }
        TextView textView3 = this.tvTip;
        if (textView3 != null) {
            textView3.setText(getString(c0j.Bd));
        }
        AppCompatImageView appCompatImageView = this.ivChartIcon;
        if (appCompatImageView != null) {
            appCompatImageView.setBackgroundResource(pni.S1);
        }
        TextView textView4 = this.tvChartTitle;
        if (textView4 != null) {
            textView4.setText(getString(c0j.Vf));
        }
        refreshChartView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        List<TimesDataRecordInt> list;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(c0j.Vf));
        setActionBarExpandState(0);
        setTitleBackground(iji.T2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sleepSegmentReport = (SleepSegmentReport) arguments.getSerializable("report");
            this.sleepHrmReportList = (List) arguments.getSerializable("record_list");
        }
        Logger.i(TAG, "report " + this.sleepSegmentReport + ";hrm records " + this.sleepHrmReportList);
        SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
        if (sleepSegmentReport != null) {
            Intrinsics.checkNotNull(sleepSegmentReport);
            if (sleepSegmentReport.getAvgHr() != null) {
                SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
                Intrinsics.checkNotNull(sleepSegmentReport2);
                Integer avgHr = sleepSegmentReport2.getAvgHr();
                Intrinsics.checkNotNull(avgHr);
                if (avgHr.intValue() > 0 && (list = this.sleepHrmReportList) != null && !list.isEmpty()) {
                    initView();
                    refreshView();
                    return;
                }
            }
        }
        Logger.e(TAG, "param invalid !!");
        finish();
    }
}
