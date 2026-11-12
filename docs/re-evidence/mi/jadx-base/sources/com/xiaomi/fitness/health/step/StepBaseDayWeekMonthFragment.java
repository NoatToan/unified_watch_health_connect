package com.xiaomi.fitness.health.step;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.recycer.adapter.DataActiveModelAdapter;
import com.xiaomi.fitness.common.recycer.layoutmanager.FullyLinearLayoutManager;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.model.DataActiveModel;
import com.xiaomi.fitness.data.valueformatter.DayStepHighLightMarkValueFormatter;
import com.xiaomi.fitness.data.valueformatter.StepHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.step.StepBaseDayWeekMonthFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.StepDataUtil;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.a9h;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.hak;
import defpackage.onq;
import defpackage.opo;
import defpackage.pni;
import defpackage.q02;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vqr;
import defpackage.xcm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 l*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001lB\u0007¢\u0006\u0004\bk\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H&¢\u0006\u0004\b&\u0010\bR\u0018\u0010'\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010Q\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010CR$\u0010\\\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010c\u001a\b\u0012\u0004\u0012\u00020b0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010CR\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020b0A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010CR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/xiaomi/fitness/health/step/StepBaseDayWeekMonthFragment;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "initView", "initActiveCard", "initDetailCard", "updateRecyclerDetailLayoutManager", "initBarChart", "refreshView", "refreshDataTitleView", "refreshActiveCard", "refreshDetailCard", "refreshBarChart", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "getRecyclerView", "()Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;", "setRecyclerView", "(Lcom/xiaomi/fitness/chart/view/BarChartRecyclerView;)V", "Lcom/xiaomi/fitness/view/DataTitleView;", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "getDataTitleView", "()Lcom/xiaomi/fitness/view/DataTitleView;", "setDataTitleView", "(Lcom/xiaomi/fitness/view/DataTitleView;)V", "Lq02;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "mBarChartAdapter", "Lq02;", "", "mEntries", "Ljava/util/List;", "Ls02;", "mItemDecoration", "Ls02;", "Lr02;", "mBarChartAttrs", "Lr02;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "Lqpo;", "mDataListDetail", "recyclerActiveModelInfo", "getRecyclerActiveModelInfo", "setRecyclerActiveModelInfo", "Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;", "mDataActiveModelAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "mModeInfoList", "originalDataList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "stepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class StepBaseDayWeekMonthFragment<VM extends BasicDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:step";

    @Nullable
    private View containerView;

    @Nullable
    private DataTitleView dataTitleView;

    @Nullable
    private q02<RecyclerBarEntry> mBarChartAdapter;

    @Nullable
    private r02 mBarChartAttrs;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DataActiveModelAdapter mDataActiveModelAdapter;

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

    @Nullable
    private RecyclerView recyclerActiveModelInfo;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private BarChartRecyclerView recyclerView;

    @Nullable
    private DailyStepReport stepReport;

    @NotNull
    private List<DataActiveModel> mModeInfoList = new ArrayList();

    @NotNull
    private List<DataActiveModel> originalDataList = new ArrayList();

    private final void initActiveCard() {
        this.mModeInfoList = new ArrayList();
        FullyLinearLayoutManager fullyLinearLayoutManager = new FullyLinearLayoutManager(getMActivity());
        RecyclerView recyclerView = this.recyclerActiveModelInfo;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(fullyLinearLayoutManager);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DataActiveModelAdapter dataActiveModelAdapter = new DataActiveModelAdapter(contextRequireContext, this.mModeInfoList, getString(c0j.G6), pni.o);
        this.mDataActiveModelAdapter = dataActiveModelAdapter;
        dataActiveModelAdapter.addOnLoadMoreListener(new a9h() { // from class: odo
            @Override // defpackage.a9h
            public final void onLoadMore() {
                StepBaseDayWeekMonthFragment.initActiveCard$lambda$1(this.f29043a);
            }
        });
        DataActiveModelAdapter dataActiveModelAdapter2 = this.mDataActiveModelAdapter;
        Intrinsics.checkNotNull(dataActiveModelAdapter2);
        dataActiveModelAdapter2.setArrowVisibility(8);
        RecyclerView recyclerView2 = this.recyclerActiveModelInfo;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDataActiveModelAdapter);
        RecyclerView recyclerView3 = this.recyclerActiveModelInfo;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActiveCard$lambda$1(StepBaseDayWeekMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mModeInfoList.clear();
        this$0.mModeInfoList.addAll(this$0.originalDataList);
        DataActiveModelAdapter dataActiveModelAdapter = this$0.mDataActiveModelAdapter;
        Intrinsics.checkNotNull(dataActiveModelAdapter);
        dataActiveModelAdapter.setBottomCount(0);
        DataActiveModelAdapter dataActiveModelAdapter2 = this$0.mDataActiveModelAdapter;
        Intrinsics.checkNotNull(dataActiveModelAdapter2);
        dataActiveModelAdapter2.notifyDataSetChanged();
    }

    private final void initBarChart() {
        onq stepHighLightMarkValueFormatter;
        BarChartRecyclerView barChartRecyclerView = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView);
        r02 r02Var = (r02) barChartRecyclerView.mAttrs;
        this.mBarChartAttrs = r02Var;
        Intrinsics.checkNotNull(r02Var);
        int i = r02Var.c;
        BarChartRecyclerHelper barChartRecyclerHelper = BarChartRecyclerHelper.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        onq onqVarCreateXAxisFormatter = barChartRecyclerHelper.createXAxisFormatter(contextRequireContext, getFragmentPosition());
        this.mEntries = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.mBarChartAttrs);
        this.mYAxis = new rtr(this.mBarChartAttrs);
        vqr vqrVar = new vqr(this.mBarChartAttrs, i);
        this.mXAxis = vqrVar;
        Intrinsics.checkNotNull(vqrVar);
        vqrVar.setValueFormatter(onqVarCreateXAxisFormatter);
        if (getFragmentPosition() == 0) {
            this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
            stepHighLightMarkValueFormatter = new DayStepHighLightMarkValueFormatter(getMActivity());
            s02 s02Var = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setHighLightValueFormatter(stepHighLightMarkValueFormatter);
            BarChartRecyclerView barChartRecyclerView2 = this.recyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView2);
            s02 s02Var2 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var2);
            barChartRecyclerView2.addItemDecoration(s02Var2);
        } else {
            this.mItemDecoration = new s02(this.mYAxis, this.mXAxis, this.mBarChartAttrs);
            stepHighLightMarkValueFormatter = new StepHighLightMarkValueFormatter(getMActivity());
            s02 s02Var3 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var3);
            s02Var3.setHighLightValueFormatter(stepHighLightMarkValueFormatter);
            BarChartRecyclerView barChartRecyclerView3 = this.recyclerView;
            Intrinsics.checkNotNull(barChartRecyclerView3);
            s02 s02Var4 = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var4);
            barChartRecyclerView3.addItemDecoration(s02Var4);
        }
        this.mBarChartAdapter = new q02<>(getActivity(), this.mEntries, this.recyclerView, this.mXAxis, this.mBarChartAttrs, stepHighLightMarkValueFormatter);
        BarChartRecyclerView barChartRecyclerView4 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView4);
        barChartRecyclerView4.setAdapter(this.mBarChartAdapter);
        BarChartRecyclerView barChartRecyclerView5 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView5);
        barChartRecyclerView5.setLayoutManager(speedRatioLayoutManager);
        BarChartRecyclerView barChartRecyclerView6 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView6);
        barChartRecyclerView6.setNestedScrollingEnabled(false);
        hak hakVar = new hak(getActivity(), this.recyclerView, new xcm(this) { // from class: com.xiaomi.fitness.health.step.StepBaseDayWeekMonthFragment$initBarChart$itemGestureListener$1
            final /* synthetic */ StepBaseDayWeekMonthFragment<VM, VDB> this$0;

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
        BarChartRecyclerView barChartRecyclerView7 = this.recyclerView;
        Intrinsics.checkNotNull(barChartRecyclerView7);
        barChartRecyclerView7.addOnItemTouchListener(hakVar);
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
        RecyclerView recyclerView = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.addItemDecoration(new bl5());
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.E3);
        updateRecyclerDetailLayoutManager();
        RecyclerView recyclerView2 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mDetailAdapter);
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setHasFixedSize(true);
    }

    private final void initView() {
        initBarChart();
        initDetailCard();
        initActiveCard();
    }

    private final void refreshActiveCard() {
        DailyStepReport dailyStepReport = this.stepReport;
        if (dailyStepReport != null) {
            Intrinsics.checkNotNull(dailyStepReport);
            if (!ArrayUtils.isEmpty(dailyStepReport.getActiveStageList())) {
                DailyStepReport dailyStepReport2 = this.stepReport;
                Intrinsics.checkNotNull(dailyStepReport2);
                List<DataActiveModel> listCreateDataActiveModelList = StepDataUtil.INSTANCE.createDataActiveModelList(dailyStepReport2.getActiveStageList(), getFragmentPosition());
                if (!this.mModeInfoList.isEmpty()) {
                    this.mModeInfoList.clear();
                }
                if (!this.originalDataList.isEmpty()) {
                    this.originalDataList.clear();
                }
                this.originalDataList.addAll(listCreateDataActiveModelList);
                if (listCreateDataActiveModelList.isEmpty()) {
                    RecyclerView recyclerView = this.recyclerActiveModelInfo;
                    Intrinsics.checkNotNull(recyclerView);
                    recyclerView.setVisibility(8);
                    return;
                }
                RecyclerView recyclerView2 = this.recyclerActiveModelInfo;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                if (listCreateDataActiveModelList.size() > 4) {
                    DataActiveModelAdapter dataActiveModelAdapter = this.mDataActiveModelAdapter;
                    Intrinsics.checkNotNull(dataActiveModelAdapter);
                    dataActiveModelAdapter.setBottomCount(1);
                    listCreateDataActiveModelList = listCreateDataActiveModelList.subList(0, 4);
                } else {
                    DataActiveModelAdapter dataActiveModelAdapter2 = this.mDataActiveModelAdapter;
                    Intrinsics.checkNotNull(dataActiveModelAdapter2);
                    dataActiveModelAdapter2.setBottomCount(0);
                }
                this.mModeInfoList.addAll(listCreateDataActiveModelList);
                DataActiveModelAdapter dataActiveModelAdapter3 = this.mDataActiveModelAdapter;
                Intrinsics.checkNotNull(dataActiveModelAdapter3);
                dataActiveModelAdapter3.notifyDataSetChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerActiveModelInfo;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshBarChart() {
        List<RecyclerBarEntry> listCreateDayEntries;
        DailyStepReport dailyStepReport = this.stepReport;
        if (dailyStepReport == null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            dailyStepReport = new DailyStepReport(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()));
        }
        int fragmentPosition = getFragmentPosition();
        if (fragmentPosition == 0) {
            StepDataUtil stepDataUtil = StepDataUtil.INSTANCE;
            r02 r02Var = this.mBarChartAttrs;
            Intrinsics.checkNotNull(r02Var);
            listCreateDayEntries = stepDataUtil.createDayEntries(r02Var, dailyStepReport);
        } else if (fragmentPosition == 1) {
            listCreateDayEntries = StepDataUtil.INSTANCE.createWeekEntries2(dailyStepReport);
        } else if (fragmentPosition != 2) {
            listCreateDayEntries = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listCreateDayEntries, "emptyList(...)");
        } else {
            listCreateDayEntries = StepDataUtil.INSTANCE.createMonthEntries2(dailyStepReport, this.mBarChartAttrs);
        }
        List<RecyclerBarEntry> list = this.mEntries;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<RecyclerBarEntry> list2 = this.mEntries;
        Intrinsics.checkNotNull(list2);
        list2.addAll(listCreateDayEntries);
        float theMaxNumber = HealthUtil.getTheMaxNumber(listCreateDayEntries);
        rtr rtrVar = this.mYAxis;
        Intrinsics.checkNotNull(rtrVar);
        rtr rtrVarL = rtrVar.l(this.mYAxis, theMaxNumber);
        q02<RecyclerBarEntry> q02Var = this.mBarChartAdapter;
        Intrinsics.checkNotNull(q02Var);
        q02Var.notifyDataSetChanged();
        if (rtrVarL != null) {
            this.mYAxis = rtrVarL;
            s02 s02Var = this.mItemDecoration;
            Intrinsics.checkNotNull(s02Var);
            s02Var.setYAxis(this.mYAxis);
            q02<RecyclerBarEntry> q02Var2 = this.mBarChartAdapter;
            Intrinsics.checkNotNull(q02Var2);
            q02Var2.setYAxis(this.mYAxis);
        }
    }

    private final void refreshDataTitleView() {
        if (this.stepReport == null) {
            DataTitleView dataTitleView = this.dataTitleView;
            if (dataTitleView != null) {
                dataTitleView.c(getString(c0j.L6));
                return;
            }
            return;
        }
        int fragmentPosition = getFragmentPosition();
        DailyStepReport dailyStepReport = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport);
        String titleDesc = getTitleDesc(fragmentPosition, TimeDateUtil.timestampToLocalDate(dailyStepReport.getTime()));
        Resources resources = requireContext().getResources();
        int i = qxi.x;
        DailyStepReport dailyStepReport2 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport2);
        int steps = dailyStepReport2.getSteps();
        DailyStepReport dailyStepReport3 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport3);
        String quantityString = resources.getQuantityString(i, steps, Integer.valueOf(dailyStepReport3.getSteps()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        DailyStepReport dailyStepReport4 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport4);
        String strValueOf = String.valueOf(dailyStepReport4.getSteps());
        DataTitleView dataTitleView2 = this.dataTitleView;
        if (dataTitleView2 != null) {
            dataTitleView2.a(requireContext(), quantityString, strValueOf, titleDesc);
        }
    }

    private final void refreshDetailCard() {
        if (this.stepReport == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        StepDataUtil stepDataUtil = StepDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyStepReport dailyStepReport = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport);
        List<qpo> listCreateSummaryModelList = stepDataUtil.createSummaryModelList(contextRequireContext, dailyStepReport, getFragmentPosition());
        if (listCreateSummaryModelList != null) {
            List<qpo> list = listCreateSummaryModelList;
            if (!list.isEmpty()) {
                RecyclerView recyclerView2 = this.recyclerDetail;
                Intrinsics.checkNotNull(recyclerView2);
                recyclerView2.setVisibility(0);
                List<qpo> list2 = this.mDataListDetail;
                Intrinsics.checkNotNull(list2);
                list2.clear();
                List<qpo> list3 = this.mDataListDetail;
                Intrinsics.checkNotNull(list3);
                list3.addAll(list);
                opo opoVar = this.mDetailAdapter;
                Intrinsics.checkNotNull(opoVar);
                DailyStepReport dailyStepReport2 = this.stepReport;
                Intrinsics.checkNotNull(dailyStepReport2);
                opoVar.setHeaderViewTitle(qpo.a(dailyStepReport2.getTag()));
                opo opoVar2 = this.mDetailAdapter;
                Intrinsics.checkNotNull(opoVar2);
                opoVar2.notifyDataChanged();
                return;
            }
        }
        RecyclerView recyclerView3 = this.recyclerDetail;
        Intrinsics.checkNotNull(recyclerView3);
        recyclerView3.setVisibility(8);
    }

    private final void refreshView() {
        refreshBarChart();
        refreshDataTitleView();
        refreshDetailCard();
        refreshActiveCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IStepRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, "").observe(getViewLifecycleOwner(), new StepBaseDayWeekMonthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ndo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StepBaseDayWeekMonthFragment.requestData$lambda$0(this.f27821a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(StepBaseDayWeekMonthFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ArrayUtils.isEmpty(list)) {
            this$0.stepReport = null;
        } else {
            DailyBasicReport dailyBasicReport = (DailyBasicReport) list.get(0);
            if (dailyBasicReport instanceof DailyStepReport) {
                this$0.stepReport = (DailyStepReport) dailyBasicReport;
            }
        }
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    private final void updateRecyclerDetailLayoutManager() {
        RecyclerView recyclerView;
        if (getMActivity() == null || this.mDetailAdapter == null || (recyclerView = this.recyclerDetail) == null) {
            return;
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        opo opoVar = this.mDetailAdapter;
        Intrinsics.checkNotNull(opoVar);
        recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(mActivity, opoVar));
    }

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final DataTitleView getDataTitleView() {
        return this.dataTitleView;
    }

    public abstract int getFragmentPosition();

    @Nullable
    public final RecyclerView getRecyclerActiveModelInfo() {
        return this.recyclerActiveModelInfo;
    }

    @Nullable
    public final RecyclerView getRecyclerDetail() {
        return this.recyclerDetail;
    }

    @Nullable
    public final BarChartRecyclerView getRecyclerView() {
        return this.recyclerView;
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

    public abstract void initViewBinding();

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateRecyclerDetailLayoutManager();
    }

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
        initViewBinding();
        Logger.i("MiHealth:step", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable DataTitleView dataTitleView) {
        this.dataTitleView = dataTitleView;
    }

    public final void setRecyclerActiveModelInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerActiveModelInfo = recyclerView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRecyclerView(@Nullable BarChartRecyclerView barChartRecyclerView) {
        this.recyclerView = barChartRecyclerView;
    }
}
