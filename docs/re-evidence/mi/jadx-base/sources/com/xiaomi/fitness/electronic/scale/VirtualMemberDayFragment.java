package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDayFragment;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberDayViewModel;
import com.xiaomi.fitness.electronic.scale.widget.DataTitleView;
import defpackage.av1;
import defpackage.bu7;
import defpackage.gfr;
import defpackage.gr5;
import defpackage.gui;
import defpackage.hak;
import defpackage.n5a;
import defpackage.oxi;
import defpackage.qal;
import defpackage.rtr;
import defpackage.ufe;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.wqr;
import defpackage.xcm;
import defpackage.yfe;
import defpackage.zzi;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\t\b\u0007¢\u0006\u0004\b7\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/VirtualMemberDayFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/electronic/scale/model/VirtualMemberDayViewModel;", "Ln5a;", "", "initLineChartRecyclerView", "()V", "", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "weightResults", "", "millis", "refreshLineChart", "(Ljava/util/List;J)V", "updateDataTitleView", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Ln5a;)V", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "virtualAccount", "refreshWeightData", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;J)V", LifecycleConstantKt.ON_RESUME, "onVisible", "Lufe;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "mLineChartAdapter", "Lufe;", "Lcom/xiaomi/fitness/electronic/scale/widget/DataTitleView;", "mDataTitleView", "Lcom/xiaomi/fitness/electronic/scale/widget/DataTitleView;", "", "mChartEntries", "Ljava/util/List;", "Lyfe;", "mItemDecoration", "Lyfe;", "Lvqr;", "mXAxis", "Lvqr;", "Lrtr;", "mYAxis", "Lrtr;", "Lvfe;", "lineChartAttrs", "Lvfe;", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "mLineChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/LineChartRecyclerView;", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class VirtualMemberDayFragment extends Hilt_VirtualMemberDayFragment<VirtualMemberDayViewModel, n5a> {

    @NotNull
    public static final String TAG = "VirtualMemberDayFragment";

    @Nullable
    private vfe lineChartAttrs;

    @Nullable
    private List<MaxMinEntry> mChartEntries;

    @Nullable
    private DataTitleView mDataTitleView;

    @Nullable
    private yfe mItemDecoration;

    @Nullable
    private ufe<MaxMinEntry> mLineChartAdapter;

    @Nullable
    private LineChartRecyclerView mLineChartRecyclerView;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    public VirtualMemberDayFragment() {
        super(gui.e0, av1.d);
    }

    private final void initLineChartRecyclerView() {
        LineChartRecyclerView lineChartRecyclerView = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView);
        this.lineChartAttrs = (vfe) lineChartRecyclerView.mAttrs;
        this.mChartEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getContext(), this.lineChartAttrs);
        this.mYAxis = new rtr(this.lineChartAttrs);
        vfe vfeVar = this.lineChartAttrs;
        Intrinsics.checkNotNull(vfeVar);
        vqr vqrVar = new vqr(vfeVar, vfeVar.c, new wqr());
        this.mXAxis = vqrVar;
        yfe yfeVar = new yfe(this.mYAxis, vqrVar, this.lineChartAttrs);
        this.mItemDecoration = yfeVar;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setHighLightValueFormatter(new gr5(getContext()));
        LineChartRecyclerView lineChartRecyclerView2 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView2);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        lineChartRecyclerView2.addItemDecoration(yfeVar2);
        this.mLineChartAdapter = new ufe<>(getContext(), this.mChartEntries, this.mLineChartRecyclerView, this.mXAxis, this.lineChartAttrs, new gr5(getContext()));
        LineChartRecyclerView lineChartRecyclerView3 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView3);
        lineChartRecyclerView3.setAdapter(this.mLineChartAdapter);
        LineChartRecyclerView lineChartRecyclerView4 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView4);
        lineChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        LineChartRecyclerView lineChartRecyclerView5 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView5);
        lineChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getContext(), this.mLineChartRecyclerView, new xcm() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberDayFragment$initLineChartRecyclerView$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.mDataTitleView;
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.mDataTitleView;
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        LineChartRecyclerView lineChartRecyclerView6 = this.mLineChartRecyclerView;
        Intrinsics.checkNotNull(lineChartRecyclerView6);
        lineChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshLineChart(List<WeightResult> weightResults, long millis) {
        List<MaxMinEntry> listC = gfr.c(this.lineChartAttrs, weightResults, Long.valueOf(millis));
        List<MaxMinEntry> list = this.mChartEntries;
        if (list != null) {
            list.clear();
        }
        List<MaxMinEntry> list2 = this.mChartEntries;
        if (list2 != null) {
            Intrinsics.checkNotNull(listC);
            list2.addAll(listC);
        }
        int weightYMaxValue = ((VirtualMemberDayViewModel) getMViewModel()).formatWeightYMaxValue(((VirtualMemberDayViewModel) getMViewModel()).getTheMaxNumber(listC));
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarL = rtrVar.l(this.mYAxis, weightYMaxValue);
        this.mYAxis = rtrVarL;
        Intrinsics.checkNotNull(rtrVarL);
        rtrVarL.setLabelCount(3);
        rtr rtrVar2 = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar2);
        rtrVar2.f = 3;
        int size = listC.size();
        vqr vqrVar = this.mXAxis;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.f37144a = size;
        yfe yfeVar = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar);
        yfeVar.setYAxis(this.mYAxis);
        yfe yfeVar2 = this.mItemDecoration;
        Intrinsics.checkNotNull(yfeVar2);
        yfeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar);
        ufeVar.setYAxis(this.mYAxis);
        ufe<MaxMinEntry> ufeVar2 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar2);
        ufeVar2.setXAxis(this.mXAxis);
        ufe<MaxMinEntry> ufeVar3 = this.mLineChartAdapter;
        Intrinsics.checkNotNull(ufeVar3);
        ufeVar3.notifyDataSetChanged();
        updateDataTitleView(weightResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshWeightData$lambda$0(VirtualMemberDayFragment this$0, long j, List virtualAccounts) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(virtualAccounts, "virtualAccounts");
        ArrayList arrayList = new ArrayList();
        Iterator it = virtualAccounts.iterator();
        while (it.hasNext()) {
            VirtualAccount virtualAccount = (VirtualAccount) it.next();
            qal.c("refreshWeightData() " + virtualAccount + ".bodyComposition");
            ListExtKt.add(arrayList, (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class));
        }
        this$0.refreshLineChart(arrayList, j);
        return Unit.INSTANCE;
    }

    private final void updateDataTitleView(List<WeightResult> weightResults) {
        String str;
        DataTitleView dataTitleView = this.mDataTitleView;
        if (dataTitleView != null) {
            dataTitleView.setVisibility(0);
        }
        if (!(!weightResults.isEmpty())) {
            DataTitleView dataTitleView2 = this.mDataTitleView;
            if (dataTitleView2 != null) {
                dataTitleView2.b(getString(zzi.d6));
                return;
            }
            return;
        }
        WeightResult weightResult = weightResults.get(weightResults.size() - 1);
        WeightResult weightResult2 = weightResults.size() > 1 ? weightResults.get(weightResults.size() - 2) : null;
        WeightResult weightResult3 = weightResult;
        if (weightResult3 != null) {
            if (TimeDateUtil.isToday(TimeDateUtil.timestampToLocalDateInner(weightResult3.getTime()))) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s %s", Arrays.copyOf(new Object[]{getString(zzi.z0), TimeDateUtil.getDateStr(weightResult3.getTime(), TimeUtils.FORMAT_H_M)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = TimeDateUtil.getDateYYYYMMddLocalFormat(weightResult3.getTime()) + " " + TimeDateUtil.getDateStr(weightResult3.getTime(), TimeUtils.FORMAT_H_M);
            }
            if (weightResult2 == null) {
                DataTitleView dataTitleView3 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView3);
                dataTitleView3.a(getContext(), getString(zzi.p0, String.valueOf(weightResult3.getWeight())), String.valueOf(weightResult3.getWeight()), str);
                return;
            }
            float weight = weightResult2.getWeight();
            float weight2 = weightResult3.getWeight();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(weight2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            int iCompare = Float.compare(weight2, weight);
            if (iCompare == -1) {
                BigDecimal bigDecimalSubtract = new BigDecimal(weight).subtract(new BigDecimal(weight2));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal scale = bigDecimalSubtract.setScale(2, RoundingMode.HALF_UP);
                DataTitleView dataTitleView4 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView4);
                dataTitleView4.a(getContext(), getResources().getQuantityString(oxi.d, 1, str2, 1, scale.toString()), str2, str);
                return;
            }
            if (iCompare != 1) {
                DataTitleView dataTitleView5 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView5);
                dataTitleView5.a(getContext(), getString(zzi.p0, str2), str2, str);
            } else {
                BigDecimal bigDecimalSubtract2 = new BigDecimal(weight2).subtract(new BigDecimal(weight));
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                BigDecimal scale2 = bigDecimalSubtract2.setScale(2, RoundingMode.HALF_UP);
                DataTitleView dataTitleView6 = this.mDataTitleView;
                Intrinsics.checkNotNull(dataTitleView6);
                dataTitleView6.a(getContext(), getResources().getQuantityString(oxi.c, 1, str2, 1, scale2.toString()), str2, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull n5a n5aVar) {
        Intrinsics.checkNotNullParameter(n5aVar, "<this>");
        this.mLineChartRecyclerView = ((n5a) getMBinding()).C;
        this.mDataTitleView = ((n5a) getMBinding()).A;
        initLineChartRecyclerView();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshWeightData(@NotNull VirtualAccount virtualAccount, final long millis) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        ((VirtualMemberDayViewModel) getMViewModel()).queryByVirtualid(virtualAccount, millis, millis + TimeUnit.DAYS.toMillis(1L), new Function1() { // from class: uzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDayFragment.refreshWeightData$lambda$0(this.f36330a, millis, (List) obj);
            }
        });
    }
}
