package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarAnalyzeData;
import com.xiaomi.fit.fitness.export.data.aggregation.SleepBloodSugarData;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.rtr;
import defpackage.sf2;
import defpackage.uw2;
import defpackage.v3b;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.vx2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001fR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSleepHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/content/Context;", "context", "", "initChartView", "(Landroid/content/Context;)V", "refreshBarChart", "()V", "initContentRecycle", "refreshContentRecycle", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;", "data", "bindData", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;)V", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvx2;", "Lsf2;", "mLineChartAdapter", "Lvx2;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;", "Lqpo;", "contentList", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;", "contentAdapter", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseContentAdapter;", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifeCycle", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "mViewModel", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseSleepHolder extends RecyclerView.d0 {

    @Nullable
    private BloodGlucoseContentAdapter contentAdapter;

    @NotNull
    private final List<qpo> contentList;

    @NotNull
    private final ViewModelStoreOwner lifeCycle;

    @Nullable
    private vfe lineChartAttrs;

    @NotNull
    private final LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;
    private final Context mContext;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private vx2<sf2> mLineChartAdapter;

    @NotNull
    private final View mRootView;

    @Nullable
    private BloodGlucoseViewModel mViewModel;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @Nullable
    private SleepBloodSugarData report;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BloodGlucoseSleepHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(eri.C0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        Context context = viewFindViewById.getContext();
        this.mContext = context;
        View viewFindViewById2 = itemView.findViewById(eri.cg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.lineChartRecyclerView = (LineChartRecyclerView) viewFindViewById2;
        this.contentList = new ArrayList();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) context;
        this.lifeCycle = viewModelStoreOwner;
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) new ViewModelProvider(viewModelStoreOwner).get(BloodGlucoseViewModel.class);
        this.mViewModel = bloodGlucoseViewModel;
        if (bloodGlucoseViewModel != null) {
            bloodGlucoseViewModel.getBloodSugarRemindSettingFromLocal();
        }
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        initChartView(context2);
        initContentRecycle();
    }

    private final void initChartView(Context context) {
        this.lineChartAttrs = (vfe) this.lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new uw2());
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, false, 8, null);
        this.mItemDecoration = bloodGlucoseLineChartItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setXAxisDrawBloodGlucoseDetail(true);
        LineChartRecyclerView lineChartRecyclerView = this.lineChartRecyclerView;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        vx2<sf2> vx2Var = new vx2<>(context, this.mChartEntries, this.lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, null);
        this.mLineChartAdapter = vx2Var;
        this.lineChartRecyclerView.setAdapter(vx2Var);
        this.lineChartRecyclerView.setLayoutManager(speedRatioLayoutManager);
        this.lineChartRecyclerView.setNestedScrollingEnabled(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    private final void initContentRecycle() {
        int i;
        View viewFindViewById = this.mRootView.findViewById(eri.z0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
            i = 3;
        } else {
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            if (uIUtils.isTabletAndLandscape(mContext)) {
                i = 3;
            } else {
                i = 2;
            }
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, i));
        recyclerView.addItemDecoration(new v3b(false));
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        BloodGlucoseContentAdapter bloodGlucoseContentAdapter = new BloodGlucoseContentAdapter(mContext2, this.contentList);
        this.contentAdapter = bloodGlucoseContentAdapter;
        recyclerView.setAdapter(bloodGlucoseContentAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private final void refreshBarChart() {
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        SleepBloodSugarData sleepBloodSugarData = this.report;
        Intrinsics.checkNotNull(sleepBloodSugarData);
        List<BloodGlucoseEntry> listCreateDaySleepEntries = bloodGlucoseDataUtil.createDaySleepEntries(mContext, vfeVar, sleepBloodSugarData);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateDaySleepEntries);
        }
        float theMaxValuesNumber = HealthUtil.getTheMaxValuesNumber(listCreateDaySleepEntries);
        float f = 15.0f;
        if (theMaxValuesNumber >= 15.0f) {
            f = 20.0f;
            if (theMaxValuesNumber >= 20.0f) {
                f = 25.0f;
            }
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(5);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = 5;
        int size = listCreateDaySleepEntries.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setYAxis(this.mYAxis);
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        bloodGlucoseLineChartItemDecoration2.setXAxis(this.mXAxis);
        vx2<sf2> vx2Var = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var);
        vx2Var.setYAxis(this.mYAxis);
        vx2<sf2> vx2Var2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var2);
        vx2Var2.setXAxis(this.mXAxis);
        BloodGlucoseViewModel bloodGlucoseViewModel = this.mViewModel;
        float lowSettingValue = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.getLowSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel2 = this.mViewModel;
        float highSettingValue = bloodGlucoseViewModel2 != null ? bloodGlucoseViewModel2.getHighSettingValue() : 10.0f;
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        bloodGlucoseDataUtil.initLineColor(lowSettingValue, highSettingValue, bloodGlucoseLineChartItemDecoration3);
        vx2<sf2> vx2Var3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var3);
        vx2Var3.notifyDataSetChanged();
    }

    private final void refreshContentRecycle() {
        BloodSugarAnalyzeData analyzeData;
        BloodSugarAnalyzeData analyzeData2;
        BloodSugarAnalyzeData analyzeData3;
        this.contentList.clear();
        SleepBloodSugarData sleepBloodSugarData = this.report;
        Integer numValueOf = null;
        Integer numValueOf2 = (sleepBloodSugarData == null || (analyzeData3 = sleepBloodSugarData.getAnalyzeData()) == null) ? null : Integer.valueOf(analyzeData3.getNormalPercent());
        if (numValueOf2 != null) {
            this.contentList.add(new qpo(this.mContext.getString(c0j.O0), String.valueOf(numValueOf2), "%"));
        }
        SleepBloodSugarData sleepBloodSugarData2 = this.report;
        Integer numValueOf3 = (sleepBloodSugarData2 == null || (analyzeData2 = sleepBloodSugarData2.getAnalyzeData()) == null) ? null : Integer.valueOf(analyzeData2.getLowBSCount());
        if (numValueOf3 != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            this.contentList.add(new qpo(this.mContext.getString(c0j.E0), String.valueOf(numValueOf3), ResourceExtKt.getQuantityString(mContext, qxi.common_unit_rowing_machine_count, 1, 1)));
        }
        SleepBloodSugarData sleepBloodSugarData3 = this.report;
        if (sleepBloodSugarData3 != null && (analyzeData = sleepBloodSugarData3.getAnalyzeData()) != null) {
            numValueOf = Integer.valueOf(analyzeData.getLowBSDurationInMin());
        }
        if (numValueOf != null) {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            this.contentList.add(new qpo(this.mContext.getString(c0j.H0), String.valueOf(numValueOf), ResourceExtKt.getQuantityString(mContext2, qxi.P1, 1, 1)));
        }
        BloodGlucoseContentAdapter bloodGlucoseContentAdapter = this.contentAdapter;
        Intrinsics.checkNotNull(bloodGlucoseContentAdapter);
        bloodGlucoseContentAdapter.notifyDataSetChanged();
    }

    public final void bindData(@NotNull Context context, @NotNull SleepBloodSugarData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.lineChartRecyclerView.setVisibility(0);
        this.lineChartRecyclerView.requestLayout();
        this.report = data;
        refreshBarChart();
        refreshContentRecycle();
    }
}
