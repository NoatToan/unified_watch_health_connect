package com.xiaomi.fitness.relative.step;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.recycer.adapter.DataActiveModelAdapter;
import com.xiaomi.fitness.common.recycer.layoutmanager.FullyLinearLayoutManager;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.data.model.DataActiveModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.step.StepBaseRelativeFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.StepDataUtil;
import defpackage.a9h;
import defpackage.bl5;
import defpackage.c0j;
import defpackage.opo;
import defpackage.pni;
import defpackage.qpo;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000 Y*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001YB\u0007¢\u0006\u0004\bX\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H&¢\u0006\u0004\b$\u0010\bR\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00106\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020H0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010AR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020H0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010AR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u001d8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/xiaomi/fitness/relative/step/StepBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "initView", "initActiveCard", "initDetailCard", "updateRecyclerDetailLayoutManager", "refreshView", "refreshDataTitleView", "refreshActiveCard", "refreshDetailCard", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "", "Lqpo;", "mDataListDetail", "Ljava/util/List;", "recyclerActiveModelInfo", "getRecyclerActiveModelInfo", "setRecyclerActiveModelInfo", "Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;", "mDataActiveModelAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "mModeInfoList", "originalDataList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "stepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class StepBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:step";

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private DataActiveModelAdapter mDataActiveModelAdapter;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private RecyclerView recyclerActiveModelInfo;

    @Nullable
    private RecyclerView recyclerDetail;

    @Nullable
    private DailyStepReport stepReport;

    @NotNull
    private List<DataActiveModel> mModeInfoList = new ArrayList();

    @NotNull
    private List<DataActiveModel> originalDataList = new ArrayList();
    private long relativeUid = -1;

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
        dataActiveModelAdapter.addOnLoadMoreListener(new a9h() { // from class: pdo
            @Override // defpackage.a9h
            public final void onLoadMore() {
                StepBaseRelativeFragment.initActiveCard$lambda$1(this.f30301a);
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
    public static final void initActiveCard$lambda$1(StepBaseRelativeFragment this$0) {
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

    private final void initBundle() {
        LocalDate localDateMinusDays;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            int i = arguments.getInt("offset", 0);
            int fragmentPosition = getFragmentPosition();
            if (fragmentPosition != 0) {
                localDateMinusDays = fragmentPosition != 1 ? TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(i)) : TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(i));
            } else {
                localDateMinusDays = LocalDate.now().minusDays(i);
            }
            this.mCurrentLocalDate = localDateMinusDays;
        }
        if (this.mCurrentLocalDate == null) {
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

    private final void refreshDataTitleView() {
        if (this.stepReport == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        int fragmentPosition = getFragmentPosition();
        DailyStepReport dailyStepReport = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport);
        getTitleDesc(fragmentPosition, TimeDateUtil.timestampToLocalDate(dailyStepReport.getTime()));
        Resources resources = requireContext().getResources();
        int i = qxi.x;
        DailyStepReport dailyStepReport2 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport2);
        int steps = dailyStepReport2.getSteps();
        DailyStepReport dailyStepReport3 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport3);
        Intrinsics.checkNotNullExpressionValue(resources.getQuantityString(i, steps, Integer.valueOf(dailyStepReport3.getSteps())), "getQuantityString(...)");
        DailyStepReport dailyStepReport4 = this.stepReport;
        Intrinsics.checkNotNull(dailyStepReport4);
        String.valueOf(dailyStepReport4.getSteps());
        TextView textView2 = this.dataTitleView;
        if (textView2 != null) {
            ViewExtKt.setVisible(textView2, false);
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
        refreshDataTitleView();
        refreshDetailCard();
        refreshActiveCard();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IStepRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new StepBaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qdo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StepBaseRelativeFragment.requestData$lambda$0(this.f31418a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(StepBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.stepReport = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
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
    public final TextView getDataTitleView() {
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

    public final long getRelativeUid() {
        return this.relativeUid;
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

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setRecyclerActiveModelInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerActiveModelInfo = recyclerView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }
}
