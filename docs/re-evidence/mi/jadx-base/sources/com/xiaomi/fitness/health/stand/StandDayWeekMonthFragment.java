package com.xiaomi.fitness.health.stand;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.StandHighLightMarkValueFormatter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment;
import com.xiaomi.fitness.health.stand.StandViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.StandDataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.av6;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.fr5;
import defpackage.hak;
import defpackage.nuf;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vnq;
import defpackage.vqr;
import defpackage.x8o;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u0000 \u007f*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001\u007fB\u0007¢\u0006\u0004\b~\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010\bR\u0018\u0010'\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010QR$\u0010b\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010h\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010*\u001a\u0004\bi\u0010,\"\u0004\bj\u0010.R\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010n\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010t\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010m\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010qR\u0014\u0010}\u001a\u00020\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/stand/StandDayWeekMonthFragment;", "Lcom/xiaomi/fitness/health/stand/StandViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshViewIfNeed", "initView", "initStandManualView", "Lkotlin/Function0;", "callback", "showManualSetDialogAndAddStandCountIfNeed", "(Lkotlin/jvm/functions/Function0;)V", "addStandManual", "initUnderstandCard", "initDetailCard", "initBarChart", "refreshBarChart", "refreshDetailCard", "refreshManualStandCard", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "barChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getBarChartRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setBarChartRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Ls02;", "mItemDecoration", "Ls02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "displayNumber", "I", "Lr02;", "mBarChartAttrs", "Lr02;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mEntries", "Ljava/util/List;", "Lx8o;", "mBarChartAdapter", "Lx8o;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "standManualSetView", "Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "getStandManualSetView", "()Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "setStandManualSetView", "(Lcom/xiaomi/fitness/health/stand/StandManualSetView;)V", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "mDailyStandReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "oneTrackReportData", "Ljava/lang/String;", "getOneTrackReportData", "()Ljava/lang/String;", "setOneTrackReportData", "(Ljava/lang/String;)V", "currentReport", "getCurrentReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "setCurrentReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;)V", "getEmptyTitleStr", "emptyTitleStr", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class StandDayWeekMonthFragment<VM extends StandViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:stand";

    @Nullable
    private BarChartRecyclerView barChartRecyclerView;

    @Nullable
    private View containerView;

    @Nullable
    private DailyStandReport currentReport;

    @Nullable
    private DataTitleView dataTitleView;
    private int displayNumber;

    @Nullable
    private x8o mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DailyStandReport mDailyStandReport;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private List<RecyclerBarEntry> mEntries;

    @Nullable
    private s02 mItemDecoration;

    @Nullable
    private vqr mXAxis;

    @Nullable
    private rtr mYAxis;

    @NotNull
    private String oneTrackReportData = "0";

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private StandManualSetView standManualSetView;

    @Nullable
    private View understandCard;

    @Nullable
    private onq valueFormatter;

    private final void addStandManual() {
        long currentHourTime = TimeDateUtil.getCurrentHourTime();
        getMViewModel().insertStandRecord(currentHourTime, TimeDateUtil.TIME_HOUR + currentHourTime);
    }

    private final String getEmptyTitleStr() {
        String string = getString(c0j.L6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final void initBarChart() {
        BarChartRecyclerView barChartRecyclerView = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        this.displayNumber = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.valueFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = vnq.o(this.mBarChartAttrs, 30.0f);
        vqr vqrVar = new vqr(this.mBarChartAttrs, this.displayNumber);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(this.valueFormatter);
        this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
        onq fr5Var = getFragmentPosition() == 0 ? new fr5(getMActivity()) : new StandHighLightMarkValueFormatter(getMActivity());
        s02 s02Var = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var);
        s02Var.setHighLightValueFormatter(fr5Var);
        BarChartRecyclerView barChartRecyclerView2 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView2);
        s02 s02Var2 = this.mItemDecoration;
        Intrinsics.checkNotNull(s02Var2);
        barChartRecyclerView2.addItemDecoration(s02Var2);
        this.mBarChartAdapter = new x8o(getMActivity(), this.mEntries, this.barChartRecyclerView, this.mXAxis, this.mBarChartAttrs, fr5Var);
        BarChartRecyclerView barChartRecyclerView3 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView3);
        barChartRecyclerView3.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView4 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView5 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.barChartRecyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ StandDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                if (barEntry == null || !barEntry.isSelected()) {
                    DataTitleView dataTitleView = this.this$0.getDataTitleView();
                    if (dataTitleView != null) {
                        dataTitleView.setVisibility(0);
                        return;
                    }
                    return;
                }
                DataTitleView dataTitleView2 = this.this$0.getDataTitleView();
                if (dataTitleView2 != null) {
                    dataTitleView2.setVisibility(4);
                }
            }
        });
        BarChartRecyclerView barChartRecyclerView6 = this.barChartRecyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.addOnItemTouchListener(hakVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    private final void initBundle() {
        int fragmentPosition;
        LocalDate localDateNow;
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int fragmentPosition2 = getFragmentPosition();
            if (fragmentPosition2 != 0) {
                localDateNow = fragmentPosition2 != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(iIntValue)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(iIntValue));
            } else {
                localDateNow = LocalDate.now().minusDays(iIntValue);
            }
            if (localDateNow == null) {
                fragmentPosition = getFragmentPosition();
                if (fragmentPosition != 0) {
                    localDateNow = LocalDate.now();
                } else if (fragmentPosition != 1) {
                    localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
                } else {
                    localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
                }
            }
        } else {
            fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateNow = LocalDate.now();
            } else if (fragmentPosition != 1) {
                localDateNow = TimeDateUtil.getFirstDayOfMonth(LocalDate.now());
            } else {
                localDateNow = TimeDateUtil.getWeekMonday(LocalDate.now());
            }
        }
        this.mCurrentLocalDate = localDateNow;
        if (localDateNow == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initDetailCard() {
        this.mDataListDetail = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 2);
        gridLayoutManager.D(new GridLayoutManager.b(this) { // from class: com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment.initDetailCard.1
            final /* synthetic */ StandDayWeekMonthFragment<VM, VDB> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                opo opoVar = ((StandDayWeekMonthFragment) this.this$0).mDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                return opoVar.isHeaderView(position) ? 2 : 1;
            }
        });
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.D3);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView4 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView4);
        recyclerView4.setHasFixedSize(true);
    }

    private final void initStandManualView() {
        TextView standManualSetBtn;
        TextView standManualSetBtn2;
        StandManualSetView standManualSetView = this.standManualSetView;
        if (standManualSetView == null || (standManualSetBtn = standManualSetView.getStandManualSetBtn()) == null) {
            return;
        }
        nuf.f(standManualSetBtn);
        StandManualSetView standManualSetView2 = this.standManualSetView;
        if (standManualSetView2 == null || (standManualSetBtn2 = standManualSetView2.getStandManualSetBtn()) == null) {
            return;
        }
        ViewExtKt.clickWithTrigger$default(standManualSetBtn2, 0L, new Function1() { // from class: d9o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandDayWeekMonthFragment.initStandManualView$lambda$2(this.f15275a, (TextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initStandManualView$lambda$2(final StandDayWeekMonthFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showManualSetDialogAndAddStandCountIfNeed(new Function0() { // from class: b9o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandDayWeekMonthFragment.initStandManualView$lambda$2$lambda$1(this.f3958a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initStandManualView$lambda$2$lambda$1(StandDayWeekMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.addStandManual();
        return Unit.INSTANCE;
    }

    private final void initUnderstandCard() {
        View view = this.understandCard;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: c9o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StandDayWeekMonthFragment.initUnderstandCard$lambda$3(this.f5090a, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandCard$lambda$3(StandDayWeekMonthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UnderstandStandFragment.class, null);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        initUnderstandCard();
        initStandManualView();
    }

    private final void refreshBarChart() {
        List<RecyclerBarEntry> listCreateDayEntries;
        DailyStandReport dailyStandReport = this.mDailyStandReport;
        if (dailyStandReport == null) {
            String viewTag = BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition());
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyStandReport = new DailyStandReport(viewTag, TimeDateUtil.changZeroOfTheDay(localDate));
        }
        this.currentReport = dailyStandReport;
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition == 0) {
            StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            listCreateDayEntries = standDataUtil.createDayEntries(r02Var, dailyStandReport);
        } else if (fragmentPosition == 1) {
            listCreateDayEntries = StandDataUtil.INSTANCE.createWeekEntries2(dailyStandReport);
        } else if (fragmentPosition != 2) {
            listCreateDayEntries = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listCreateDayEntries, "emptyList(...)");
        } else {
            listCreateDayEntries = StandDataUtil.INSTANCE.createMonthEntries2(dailyStandReport, this.mBarChartAttrs);
        }
        List<RecyclerBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<RecyclerBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDayEntries);
        x8o x8oVar = this.mBarChartAdapter;
        Intrinsics.checkNotNull(x8oVar);
        x8oVar.notifyDataSetChanged();
        List<RecyclerBarEntry> list3 = this.mEntries;
        this.oneTrackReportData = (list3 == null || list3.isEmpty()) ? "0" : "1";
        if (this.mDailyStandReport == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getEmptyTitleStr());
                return;
            }
            return;
        }
        int fragmentPosition2 = getFragmentPosition();
        DailyStandReport dailyStandReport2 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport2);
        String titleDesc = getTitleDesc(fragmentPosition2, TimeDateUtil.timestampToLocalDate(dailyStandReport2.getTime()));
        Resources resources = requireContext().getResources();
        int i = qxi.a1;
        DailyStandReport dailyStandReport3 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport3);
        int standCount = dailyStandReport3.getStandCount();
        DailyStandReport dailyStandReport4 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport4);
        String quantityString = resources.getQuantityString(i, standCount, Integer.valueOf(dailyStandReport4.getStandCount()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        DailyStandReport dailyStandReport5 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport5);
        String strValueOf = String.valueOf(dailyStandReport5.getStandCount());
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), quantityString, strValueOf, titleDesc);
        }
    }

    private final void refreshDetailCard() {
        if (this.mDailyStandReport == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyStandReport dailyStandReport = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport);
        List<qpo> listCreateSummaryModelList = standDataUtil.createSummaryModelList(contextRequireContext, dailyStandReport, getFragmentPosition());
        if (!(!listCreateSummaryModelList.isEmpty())) {
            RecyclerView recyclerView2 = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView2);
            recyclerView2.setVisibility(8);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(0);
        List<qpo> list = this.mDataListDetail;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<qpo> list2 = this.mDataListDetail;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateSummaryModelList);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        DailyStandReport dailyStandReport2 = this.mDailyStandReport;
        Intrinsics.checkNotNull(dailyStandReport2);
        opoVar.setHeaderViewTitle(qpo.a(dailyStandReport2.getTag()));
        opo opoVar2 = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar2);
        opoVar2.notifyDataChanged();
    }

    private final void refreshManualStandCard() {
        if (getFragmentPosition() == 0 && this.currentReport != null) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            DailyStandReport dailyStandReport = this.currentReport;
            Intrinsics.checkNotNull(dailyStandReport);
            if (TimeDateUtil.isSameLocalDate(localDateNow, TimeDateUtil.timestampToLocalDate(dailyStandReport.getTime()))) {
                StandManualSetView standManualSetView = this.standManualSetView;
                if (standManualSetView != null) {
                    standManualSetView.setVisibility(0);
                }
                StandManualSetView standManualSetView2 = this.standManualSetView;
                if (standManualSetView2 != null) {
                    standManualSetView2.bindData();
                }
                StandDataUtil standDataUtil = StandDataUtil.INSTANCE;
                DailyStandReport dailyStandReport2 = this.currentReport;
                Intrinsics.checkNotNull(dailyStandReport2);
                boolean zFindCurrentHourStand = standDataUtil.findCurrentHourStand(dailyStandReport2);
                StandManualSetView standManualSetView3 = this.standManualSetView;
                if (standManualSetView3 != null) {
                    ViewExtKt.setVisible(standManualSetView3, !zFindCurrentHourStand);
                    return;
                }
                return;
            }
        }
        StandManualSetView standManualSetView4 = this.standManualSetView;
        if (standManualSetView4 != null) {
            standManualSetView4.setVisibility(8);
        }
    }

    private final void refreshViewIfNeed() {
        DailyStandReport dailyStandReport = this.mDailyStandReport;
        Logger.i("MiHealth:stand", "refreshViewIfNeed StandReport .. " + (dailyStandReport != null ? dailyStandReport.toString() : null));
        refreshBarChart();
        refreshDetailCard();
        refreshManualStandCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IStandRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new StandDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a9o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandDayWeekMonthFragment.requestData$lambda$0(this.f805a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(StandDayWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.mDailyStandReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyStandReport) {
                this$0.mDailyStandReport = (DailyStandReport) dailyBasicReport;
            }
        }
        this$0.refreshViewIfNeed();
        return Unit.INSTANCE;
    }

    private final void showManualSetDialogAndAddStandCountIfNeed(final Function0<Unit> callback) {
        new CommonDialog.c("showManualSetDialog").setDialogTitle(c0j.K9).setDialogDescription(c0j.x5).setNegativeText(c0j.c).setPositiveText(c0j.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.stand.StandDayWeekMonthFragment.showManualSetDialogAndAddStandCountIfNeed.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    callback.invoke();
                }
            }
        }).showIfNeed(requireActivity().getSupportFragmentManager());
    }

    @Nullable
    public final BarChartRecyclerView getBarChartRecyclerView() {
        return this.barChartRecyclerView;
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DailyStandReport getCurrentReport() {
        return this.currentReport;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @NotNull
    public final String getOneTrackReportData() {
        return this.oneTrackReportData;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final StandManualSetView getStandManualSetView() {
        return this.standManualSetView;
    }

    @Nullable
    public String getTitleDesc(int position, @Nullable LocalDate localDate) {
        if (position == 0) {
            return TimeDateUtil.getDateYYYYMMddLocalFormat(localDate);
        }
        if (position == 1) {
            Intrinsics.checkNotNull(localDate);
            return HealthUtil.getWeekDateStr(localDate);
        }
        if (position != 2) {
            return "";
        }
        Intrinsics.checkNotNull(localDate);
        return TimeDateUtil.getDateYYYYMMLocalFormat(localDate);
    }

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
    }

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        Logger.i("MiHealth:stand", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initViewBinding();
        initView();
        requestData();
    }

    public final void setBarChartRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.barChartRecyclerView = barChartRecyclerView;
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setCurrentReport(@Nullable DailyStandReport dailyStandReport) {
        this.currentReport = dailyStandReport;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setOneTrackReportData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oneTrackReportData = str;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setStandManualSetView(@Nullable StandManualSetView standManualSetView) {
        this.standManualSetView = standManualSetView;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
