package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.aggregation.AGPItem;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.BloodGlucoseLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseAGPLand;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.ch0;
import defpackage.jui;
import defpackage.rtr;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.vx2;
import defpackage.xqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseAGPLand;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lch0;", "Landroid/content/Context;", "context", "", "initChartView", "(Landroid/content/Context;)V", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "data", "", "startTime", "refreshBarChart", "(Landroid/content/Context;Ljava/util/Map;J)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "lineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "Lvx2;", "Lsf2;", "mLineChartAdapter", "Lvx2;", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mChartEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/BloodGlucoseLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Landroid/view/View;", "agpChartGuideView", "Landroid/view/View;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseAGPLand extends Hilt_BloodGlucoseAGPLand<BloodGlucoseViewModel, ch0> {

    @Nullable
    private View agpChartGuideView;

    @Nullable
    private vfe lineChartAttrs;
    private LineChartRecyclerView lineChartRecyclerView;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private BloodGlucoseLineChartItemDecoration mItemDecoration;

    @Nullable
    private vx2<sf2> mLineChartAdapter;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    private final void initChartView(Context context) {
        LineChartRecyclerView lineChartRecyclerView;
        LineChartRecyclerView lineChartRecyclerView2 = this.lineChartRecyclerView;
        LineChartRecyclerView lineChartRecyclerView3 = null;
        if (lineChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
            lineChartRecyclerView2 = null;
        }
        this.lineChartAttrs = (vfe) lineChartRecyclerView2.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(context, this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(new xqr());
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration = new BloodGlucoseLineChartItemDecoration(this.mYAxis, this.mXAxis, this.lineChartAttrs, true);
        this.mItemDecoration = bloodGlucoseLineChartItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration);
        bloodGlucoseLineChartItemDecoration.setXAxisDrawBloodGlucoseDetail(true);
        LineChartRecyclerView lineChartRecyclerView4 = this.lineChartRecyclerView;
        if (lineChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
            lineChartRecyclerView4 = null;
        }
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration2 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration2);
        lineChartRecyclerView4.addItemDecoration(bloodGlucoseLineChartItemDecoration2);
        List<MaxMinEntry> list = this.mChartEntries;
        LineChartRecyclerView lineChartRecyclerView5 = this.lineChartRecyclerView;
        if (lineChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
            lineChartRecyclerView = null;
        } else {
            lineChartRecyclerView = lineChartRecyclerView5;
        }
        this.mLineChartAdapter = new vx2<>(context, list, lineChartRecyclerView, this.mXAxis, this.lineChartAttrs, null);
        LineChartRecyclerView lineChartRecyclerView6 = this.lineChartRecyclerView;
        if (lineChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
            lineChartRecyclerView6 = null;
        }
        lineChartRecyclerView6.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView7 = this.lineChartRecyclerView;
        if (lineChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
            lineChartRecyclerView7 = null;
        }
        lineChartRecyclerView7.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView8 = this.lineChartRecyclerView;
        if (lineChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineChartRecyclerView");
        } else {
            lineChartRecyclerView3 = lineChartRecyclerView8;
        }
        lineChartRecyclerView3.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(BloodGlucoseAGPLand this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BloodGlucoseAGPLand this$0, BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bloodSugarGMIAndAGPResult != null) {
            this$0.refreshBarChart(this$0, bloodSugarGMIAndAGPResult.getAgpResult(), bloodSugarGMIAndAGPResult.getStartTime());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshBarChart(Context context, Map<Integer, AGPItem> data, long startTime) {
        int i;
        BloodGlucoseDataUtil bloodGlucoseDataUtil = BloodGlucoseDataUtil.INSTANCE;
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        List<BloodGlucoseEntry> listCreateAGPDetailEntries = bloodGlucoseDataUtil.createAGPDetailEntries(context, vfeVar, data, startTime);
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            list2.addAll(listCreateAGPDetailEntries);
        }
        float f = 15.0f;
        if (HealthUtil.getTheMaxNumber(listCreateAGPDetailEntries) < 15.0f) {
            i = 5;
        } else {
            f = 25.0f;
            i = 7;
        }
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtrVar.setAxisMaximum(f);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.setLabelCount(i);
        rtr rtrVar3 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar3);
        rtrVar3.f = i;
        int size = listCreateAGPDetailEntries.size();
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
        BloodGlucoseLineChartItemDecoration bloodGlucoseLineChartItemDecoration3 = this.mItemDecoration;
        Intrinsics.checkNotNull(bloodGlucoseLineChartItemDecoration3);
        BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) getMViewModel();
        float highSettingValue = bloodGlucoseViewModel != null ? bloodGlucoseViewModel.getHighSettingValue() : 3.9f;
        BloodGlucoseViewModel bloodGlucoseViewModel2 = (BloodGlucoseViewModel) getMViewModel();
        bloodGlucoseLineChartItemDecoration3.setAGPAreaValue(highSettingValue, bloodGlucoseViewModel2 != null ? bloodGlucoseViewModel2.getLowSettingValue() : 3.9f);
        vx2<sf2> vx2Var3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(vx2Var3);
        vx2Var3.notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.f23146a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.bloodglucose.holder.Hilt_BloodGlucoseAGPLand, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.lineChartRecyclerView = ((ch0) getMBinding()).D;
        ((ch0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: yv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseAGPLand.onCreate$lambda$0(this.f40599a, view);
            }
        });
        getWindow().getDecorView().setSystemUiVisibility(4);
        long longExtra = getIntent().getLongExtra("mBloodSugarReport", 0L);
        setTitle("");
        setActionBarDisplayable(false);
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded()) {
            setRequestedOrientation(0);
        }
        initChartView(this);
        ((BloodGlucoseViewModel) getMViewModel()).getTheGMIAndAGP(longExtra);
        ((BloodGlucoseViewModel) getMViewModel()).getBloodSugarGMIAndAGPResult().observe(this, new BloodGlucoseAGPLand$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zv2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucoseAGPLand.onCreate$lambda$1(this.f41708a, (BloodSugarGMIAndAGPResult) obj);
            }
        }));
    }
}
