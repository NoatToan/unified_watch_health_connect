package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.electronic.scale.VirtualMemberStatisticsFragment;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.data.valueformatter.WeightHighLightMarkValueFormatter;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberStatisticsViewModel;
import com.xiaomi.fitness.electronic.scale.util.ScaleUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av1;
import defpackage.eu3;
import defpackage.gfr;
import defpackage.gui;
import defpackage.hak;
import defpackage.mpo;
import defpackage.ofr;
import defpackage.p5a;
import defpackage.ppo;
import defpackage.rtr;
import defpackage.str;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.zqr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/VirtualMemberStatisticsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberStatisticsViewModel;", "Lp5a;", "", "initMaxMinTitleRecyclerView", "()V", "initChartRecyclerView", "Ljava/util/TreeMap;", "", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResults", "refreshView", "(Ljava/util/TreeMap;)V", "refreshVisibleEntries", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lp5a;)V", LifecycleConstantKt.ON_RESUME, "onVisible", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "chartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroidx/recyclerview/widget/RecyclerView;", "maxMinRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lmpo;", "mMaxMinTitleAdapter", "Lmpo;", "Lppo;", "mMaxMinTitleList", "", "typeIndex", "I", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VirtualMemberStatisticsFragment extends Hilt_VirtualMemberStatisticsFragment<VirtualMemberStatisticsViewModel, p5a> {

    @NotNull
    public static final String TAG = "VirtualMemberStatisticsFragment";

    @Nullable
    private LineChartRecyclerView chartRecyclerView;

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private mpo mMaxMinTitleAdapter;

    @Nullable
    private List<ppo> mMaxMinTitleList;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private RecyclerView maxMinRecyclerView;
    private int typeIndex;

    public VirtualMemberStatisticsFragment() {
        super(gui.g0, av1.d);
    }

    private final void initChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        vfe vfeVar = (vfe) lineChartRecyclerView.mAttrs;
        this.lineChartAttrs = vfeVar;
        Intrinsics.checkNotNull(vfeVar);
        vfeVar.a0 = true;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.lineChartAttrs);
        vfe vfeVar2 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar2);
        this.mYAxis = rtr.f(vfeVar2, 60.0f, 3);
        vfe vfeVar3 = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar3);
        vqr vqrVar = new vqr(vfeVar3, vfeVar3.c, new zqr(getContext()));
        this.mXAxis = vqrVar;
        yfe yfeVar = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        this.mItemDecoration = yfeVar;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(new WeightHighLightMarkValueFormatter(getMActivity()));
        LineChartRecyclerView lineChartRecyclerView2 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getActivity(), this.mChartEntries, this.chartRecyclerView, this.mXAxis, this.lineChartAttrs, new WeightHighLightMarkValueFormatter(getMActivity()));
        LineChartRecyclerView lineChartRecyclerView3 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.chartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberStatisticsFragment$initChartRecyclerView$itemGestureListener$1
            private boolean isRightScrollInner;

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    RecyclerView recyclerView = this.this$0.maxMinRecyclerView;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        return;
                    }
                    return;
                }
                RecyclerView recyclerView2 = this.this$0.maxMinRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.chartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    private final void initMaxMinTitleRecyclerView() {
        ArrayList arrayList = new ArrayList();
        this.mMaxMinTitleList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        List<ppo> listD = gfr.d(requireContext(), this.typeIndex, "-", "-");
        Intrinsics.checkNotNullExpressionValue(listD, "createMaxMinTitleSummaryModel(...)");
        arrayList.addAll(listD);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        RecyclerView recyclerView = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        ofr ofrVar = new ofr();
        RecyclerView recyclerView2 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(ofrVar);
        this.mMaxMinTitleAdapter = new mpo(getMActivity(), this.mMaxMinTitleList);
        RecyclerView recyclerView3 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mMaxMinTitleAdapter);
        RecyclerView recyclerView4 = this.maxMinRecyclerView;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshView(TreeMap<String, WeightResult> weightResults) {
        List<MaxMinEntry> list = this.mChartEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<MaxMinEntry> listG = gfr.g(weightResults);
        List<MaxMinEntry> list2 = this.mChartEntries;
        Intrinsics.checkNotNull(list2);
        Intrinsics.checkNotNull(listG);
        list2.addAll(listG);
        int weightYMaxValue = ((VirtualMemberStatisticsViewModel) getMViewModel()).formatWeightYMaxValue(ScaleUtil.getTheMaxNumber(this.mChartEntries));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        this.mYAxis = rtrVar.m(this.mYAxis, weightYMaxValue, 3);
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setHighLightValueFormatter(new WeightHighLightMarkValueFormatter(getMActivity()));
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: e0r
                @Override // java.lang.Runnable
                public final void run() {
                    VirtualMemberStatisticsFragment.refreshView$lambda$0(this.f16135a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshView$lambda$0(VirtualMemberStatisticsFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshVisibleEntries();
    }

    private final void refreshVisibleEntries() {
        long j;
        Float f;
        Float f2;
        long jChangZeroOfTheDay;
        String str;
        str strVarJ = eu3.j(this.chartRecyclerView, 7);
        List<T> list = strVarJ.c;
        Logger.i(TAG, "refreshVisibleEntries visibleEntries size " + list.size());
        Float fValueOf = Float.valueOf(strVarJ.f33986b);
        Float fValueOf2 = Float.valueOf(strVarJ.f33985a);
        if (ArrayUtils.isEmpty(list)) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.localDateToTimestamp(localDateNow));
            f2 = null;
            j = jChangZeroOfTheDay;
            f = null;
        } else {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            j = ((RecyclerBarEntry) obj).timestamp;
            Object obj2 = list.get(list.size() - 1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
            f = fValueOf;
            f2 = fValueOf2;
            jChangZeroOfTheDay = ((RecyclerBarEntry) obj2).timestamp;
        }
        Logger.i(TAG, "refreshVisibleEntries leftTime:" + TimeDateUtil.timestampToLocalDate(jChangZeroOfTheDay) + "/rightTime:" + TimeDateUtil.timestampToLocalDate(j) + "/minValue:" + f + "/maxValue:" + f2 + "/type" + this.typeIndex);
        String str2 = "-";
        if (f == null) {
            str = "-";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (f2 != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f2}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        List<ppo> list2 = this.mMaxMinTitleList;
        if (list2 != null) {
            list2.clear();
        }
        List<ppo> list3 = this.mMaxMinTitleList;
        if (list3 != null) {
            List<ppo> listD = gfr.d(requireContext(), this.typeIndex, str2, str);
            Intrinsics.checkNotNullExpressionValue(listD, "createMaxMinTitleSummaryModel(...)");
            list3.addAll(listD);
        }
        mpo mpoVar = this.mMaxMinTitleAdapter;
        if (mpoVar != null) {
            mpoVar.notifyDataChanged();
        }
        RecyclerView recyclerView = this.maxMinRecyclerView;
        if (recyclerView != null) {
            ViewExtKt.setVisible(recyclerView, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull p5a p5aVar) {
        Intrinsics.checkNotNullParameter(p5aVar, "<this>");
        this.chartRecyclerView = ((p5a) getMBinding()).A;
        this.maxMinRecyclerView = ((p5a) getMBinding()).C;
        initChartRecyclerView();
        initMaxMinTitleRecyclerView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Logger.i(TAG, "onResume()");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        Logger.i(TAG, "onVisible()");
    }
}
