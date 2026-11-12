package com.xiaomi.fitness.relative.mhintensity;

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
import com.xiaomi.fit.fitness.export.api.repository.IStrengthRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.mhintensity.MHStrengthBaseRelativeFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.util.MHIntensityDataUtil;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000 Q*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001QB\u0007¢\u0006\u0004\bP\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010@\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00178$X¤\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/relative/mhintensity/MHStrengthBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", Constants.KEY_REQUEST_DATA, "()V", "refreshView", "refreshDataTitleView", "refreshDetailCard", "initView", "initDetailCard", "updateRecyclerDetailLayoutManager", "initBundle", LifecycleConstantKt.ON_RESUME, "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "Lorg/joda/time/LocalDate;", "localDate", "", "getTitleDesc", "(ILorg/joda/time/LocalDate;)Ljava/lang/String;", "initViewBinding", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerDetail", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerDetail", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerDetail", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lopo;", "mDetailAdapter", "Lopo;", "", "Lqpo;", "mDataListDetail", "Ljava/util/List;", "understandCard", "getUnderstandCard", "setUnderstandCard", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "strengthReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "getFragmentPosition", "()I", "fragmentPosition", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class MHStrengthBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @NotNull
    public static final String TAG = "MiHealth:strength";

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private LocalDate mCurrentLocalDate;

    @Nullable
    private List<qpo> mDataListDetail;

    @Nullable
    private opo mDetailAdapter;

    @Nullable
    private RecyclerView recyclerDetail;
    private long relativeUid = -1;

    @Nullable
    private DailyMHStrengthReport strengthReport;

    @Nullable
    private View understandCard;

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
        this.mDetailAdapter = new opo(getMActivity(), this.mDataListDetail, c0j.I6, pni.A3);
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
    }

    private final void refreshDataTitleView() {
        if (this.strengthReport == null) {
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        int fragmentPosition = getFragmentPosition();
        DailyMHStrengthReport dailyMHStrengthReport = this.strengthReport;
        Intrinsics.checkNotNull(dailyMHStrengthReport);
        getTitleDesc(fragmentPosition, TimeDateUtil.timestampToLocalDate(dailyMHStrengthReport.getTime()));
        Resources resources = requireContext().getResources();
        int i = qxi.S1;
        DailyMHStrengthReport dailyMHStrengthReport2 = this.strengthReport;
        Intrinsics.checkNotNull(dailyMHStrengthReport2);
        int duration = dailyMHStrengthReport2.getDuration();
        DailyMHStrengthReport dailyMHStrengthReport3 = this.strengthReport;
        Intrinsics.checkNotNull(dailyMHStrengthReport3);
        Intrinsics.checkNotNullExpressionValue(resources.getQuantityString(i, duration, Integer.valueOf(dailyMHStrengthReport3.getDuration())), "getQuantityString(...)");
        DailyMHStrengthReport dailyMHStrengthReport4 = this.strengthReport;
        Intrinsics.checkNotNull(dailyMHStrengthReport4);
        String.valueOf(dailyMHStrengthReport4.getDuration());
        TextView textView2 = this.dataTitleView;
        if (textView2 != null) {
            ViewExtKt.setVisible(textView2, false);
        }
    }

    private final void refreshDetailCard() {
        if (this.strengthReport == null) {
            RecyclerView recyclerView = this.recyclerDetail;
            Intrinsics.checkNotNull(recyclerView);
            recyclerView.setVisibility(8);
            return;
        }
        MHIntensityDataUtil mHIntensityDataUtil = MHIntensityDataUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DailyMHStrengthReport dailyMHStrengthReport = this.strengthReport;
        Intrinsics.checkNotNull(dailyMHStrengthReport);
        List<qpo> listCreateRSummaryModelList = mHIntensityDataUtil.createRSummaryModelList(contextRequireContext, dailyMHStrengthReport, getFragmentPosition());
        if (listCreateRSummaryModelList != null) {
            List<qpo> list = listCreateRSummaryModelList;
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
                DailyMHStrengthReport dailyMHStrengthReport2 = this.strengthReport;
                Intrinsics.checkNotNull(dailyMHStrengthReport2);
                opoVar.setHeaderViewTitle(qpo.a(dailyMHStrengthReport2.getTag()));
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
        refreshDetailCard();
        refreshDataTitleView();
    }

    private final void requestData() {
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        getMViewModel().triggerFetchFitnessReport(IStrengthRepository.class, BarChartRecyclerHelper.INSTANCE.getViewTag(getFragmentPosition()), TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new MHStrengthBaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mwe
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MHStrengthBaseRelativeFragment.requestData$lambda$0(this.f27285a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(MHStrengthBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) {
            this$0.strengthReport = null;
            if (cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
                textView.setText(this$0.getString(c0j.I4));
            }
        } else {
            Object data = cloudDataResult.getData();
            Intrinsics.checkNotNull(data);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) ((List) data).get(0);
            if (dailyBasicReport instanceof DailyMHStrengthReport) {
                this$0.strengthReport = (DailyMHStrengthReport) dailyBasicReport;
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

    @Nullable
    public final View getUnderstandCard() {
        return this.understandCard;
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
        Logger.i("MiHealth:strength", "onViewCreated..mCurrentPosition-mCurrentDate:" + this.mCurrentLocalDate);
        initView();
        requestData();
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setRecyclerDetail(@Nullable RecyclerView recyclerView) {
        this.recyclerDetail = recyclerView;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setUnderstandCard(@Nullable View view) {
        this.understandCard = view;
    }
}
