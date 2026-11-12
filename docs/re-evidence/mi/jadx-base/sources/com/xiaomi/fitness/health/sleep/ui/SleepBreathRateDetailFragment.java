package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.SleepRateHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.sleep.ui.SleepBreathRateDetailFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.hak;
import defpackage.iji;
import defpackage.jui;
import defpackage.mba;
import defpackage.pni;
import defpackage.q02;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.sbo;
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
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001<B\u0007¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0013R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepBreathRateDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lmba;", "", "initView", "()V", "initChartBarRecyclerView", "refreshView", "refreshChartView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "sleepBreathRateList", "Ljava/util/List;", "", "sleepTime", "J", "wakeTime", "", "avgBreathRate", "I", "Landroid/widget/TextView;", "tvAvgValue", "Landroid/widget/TextView;", "tvTimeRange", "tvTip", "chartTitleLayout", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivChartIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "tvChartTitle", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "Lr02;", "barChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entryList", "Lrtr;", "yAxis", "Lrtr;", "Lvqr;", "xAxis", "Lvqr;", "Lq02;", "chartAdapter", "Lq02;", "Lsbo;", "chartItemDecoration", "Lsbo;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepBreathRateDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBreathRateDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepBreathRateDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1863#2,2:209\n*S KotlinDebug\n*F\n+ 1 SleepBreathRateDetailFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepBreathRateDetailFragment\n*L\n168#1:209,2\n*E\n"})
public final class SleepBreathRateDetailFragment extends BaseBindingFragment<SleepViewModel, mba> {

    @NotNull
    public static final String KEY_AVG_BREATH_RATE = "avg_breath_rate";

    @NotNull
    public static final String KEY_BED_TIME = "bed_time";

    @NotNull
    public static final String KEY_RATE_RECORD_LIST = "rate_record_list";

    @NotNull
    public static final String KEY_WAKE_TIME = "wake_time";

    @NotNull
    public static final String TAG = "SleepBreathRate";
    private int avgBreathRate;

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
    private List<TimesDataRecordInt> sleepBreathRateList;
    private long sleepTime;

    @Nullable
    private TextView tvAvgValue;

    @Nullable
    private TextView tvChartTitle;

    @Nullable
    private TextView tvTimeRange;

    @Nullable
    private TextView tvTip;
    private long wakeTime;

    @Nullable
    private vqr xAxis;

    @Nullable
    private rtr yAxis;

    public SleepBreathRateDetailFragment() {
        super(jui.J0);
    }

    private final void initChartBarRecyclerView() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        this.barChartAttrs = (r02) barChartRecyclerView.mAttrs;
        xqr xqrVar = new xqr();
        this.entryList = new ArrayList();
        rtr rtrVar = new rtr(this.barChartAttrs);
        this.yAxis = rtrVar;
        rtrVar.mAxisMaximum = 25.0f;
        rtrVar.setLabelCount(5);
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
        barChartRecyclerView6.addOnItemTouchListener(new hak(contextRequireContext, this.barChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepBreathRateDetailFragment.initChartBarRecyclerView.1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                super.onItemSelected(barEntry, position);
                if (barEntry == null || !barEntry.isSelected()) {
                    View view = SleepBreathRateDetailFragment.this.chartTitleLayout;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                View view2 = SleepBreathRateDetailFragment.this.chartTitleLayout;
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
        long j = this.sleepTime;
        long j2 = this.wakeTime;
        sbo sboVar = this.chartItemDecoration;
        Intrinsics.checkNotNull(sboVar);
        sboVar.d(j, j2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j3 = j;
        int i = 0;
        while (j3 < j2) {
            linkedHashMap.put(Long.valueOf(((long) (i * 1800)) + j), new ArrayList());
            i++;
            j3 = ((long) (i * 1800)) + j;
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
        List<TimesDataRecordInt> list = this.sleepBreathRateList;
        Intrinsics.checkNotNull(list);
        for (TimesDataRecordInt timesDataRecordInt : list) {
            List list2 = (List) linkedHashMap.get(Long.valueOf(timesDataRecordInt.getTime()));
            if (list2 != null) {
                list2.addAll(ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            long j4 = ((long) (i2 * 1800)) + j;
            List<Integer> arrayList2 = (List) linkedHashMap.get(Long.valueOf(j4));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            r02 r02Var = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            int i3 = r02Var.g0;
            r02 r02Var2 = this.barChartAttrs;
            Intrinsics.checkNotNull(r02Var2);
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(1, arrayList2, i3, r02Var2.g0), 1);
            segmentBarEntry.timestamp = j4;
            segmentBarEntry.localDate = TimeDateUtil.timestampToLocalDate(j4);
            segmentBarEntry.type = 3;
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
        }
        final Function2 function2 = new Function2() { // from class: lim
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SleepBreathRateDetailFragment.refreshChartView$lambda$2((SegmentBarEntry) obj, (SegmentBarEntry) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: mim
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SleepBreathRateDetailFragment.refreshChartView$lambda$3(function2, obj, obj2);
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
        int i4 = theMaxNumber > ((float) 25) ? ((((int) theMaxNumber) / 5) * 5) + 5 : 25;
        rtr rtrVar = this.yAxis;
        if (rtrVar != null) {
            rtrVar.mAxisMaximum = i4;
        }
        if (rtrVar != null) {
            rtrVar.setLabelCount(5);
        }
        rtr rtrVar2 = this.yAxis;
        if (rtrVar2 != null) {
            rtrVar2.f = 5;
        }
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
            int i = qxi.k0;
            int i2 = this.avgBreathRate;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        }
        TextView textView2 = this.tvTimeRange;
        if (textView2 != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            textView2.setText(SleepExtKt.getSleepTimeRangeStr(contextRequireContext, this.sleepTime, this.wakeTime));
        }
        TextView textView3 = this.tvTip;
        if (textView3 != null) {
            textView3.setText(getString(c0j.Bd));
        }
        AppCompatImageView appCompatImageView = this.ivChartIcon;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(pni.a2);
        }
        TextView textView4 = this.tvChartTitle;
        if (textView4 != null) {
            textView4.setText(getString(c0j.Fd));
        }
        refreshChartView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        List<TimesDataRecordInt> list;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(getString(c0j.fe));
        setActionBarExpandState(0);
        setTitleBackground(iji.T2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.sleepBreathRateList = (List) arguments.getSerializable(KEY_RATE_RECORD_LIST);
            this.sleepTime = arguments.getLong(KEY_BED_TIME);
            this.wakeTime = arguments.getLong(KEY_WAKE_TIME);
            this.avgBreathRate = arguments.getInt(KEY_AVG_BREATH_RATE);
        }
        Logger.i(TAG, "avgBreathRate " + this.avgBreathRate + ";sleepTime " + this.sleepTime + "; wake " + this.wakeTime + ";rate records " + this.sleepBreathRateList);
        if (this.avgBreathRate <= 0 || (list = this.sleepBreathRateList) == null || list.isEmpty() || this.sleepTime <= 0 || this.wakeTime <= 0) {
            Logger.e(TAG, "param invalid !!");
            finish();
        } else {
            initView();
            refreshView();
        }
    }
}
