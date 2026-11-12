package com.xiaomi.fitness.relative.sleep;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepDistributeWmHolder;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.sleep.SleepBaseRelativeFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.grm;
import defpackage.k0n;
import defpackage.nzm;
import defpackage.umm;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\bc\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u001bH$¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\fR$\u0010/\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010\fR$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010V\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010]\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lcom/xiaomi/fitness/relative/sleep/SleepBaseRelativeFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "", "initCurrentLocalDate", "()V", "Landroid/view/View;", "view", "initViewAndHolder", "(Landroid/view/View;)V", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "onReportResult", "(Ljava/util/List;)V", "", "isMonth", "()Z", "isWeek", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "fragmentPosition", "()I", "Lorg/joda/time/LocalDate;", "mCurrentLocalDate", "Lorg/joda/time/LocalDate;", "getMCurrentLocalDate", "()Lorg/joda/time/LocalDate;", "setMCurrentLocalDate", "(Lorg/joda/time/LocalDate;)V", "Ljava/lang/Integer;", "getFragmentPosition", "()Ljava/lang/Integer;", "setFragmentPosition", "(Ljava/lang/Integer;)V", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "detailParentView", "getDetailParentView", "setDetailParentView", "Lk0n;", "sleepTotalDurationEvaluationHolder", "Lk0n;", "getSleepTotalDurationEvaluationHolder", "()Lk0n;", "setSleepTotalDurationEvaluationHolder", "(Lk0n;)V", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDistributeWmHolder;", "distributeWmHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDistributeWmHolder;", "getDistributeWmHolder", "()Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDistributeWmHolder;", "setDistributeWmHolder", "(Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDistributeWmHolder;)V", "Lgrm;", "sleepRegularViewHolder", "Lgrm;", "getSleepRegularViewHolder", "()Lgrm;", "setSleepRegularViewHolder", "(Lgrm;)V", "Lumm;", "sleepHeartRateWmHolder", "Lumm;", "getSleepHeartRateWmHolder", "()Lumm;", "setSleepHeartRateWmHolder", "(Lumm;)V", "Lnzm;", "sleepSpo2WmHolder", "Lnzm;", "getSleepSpo2WmHolder", "()Lnzm;", "setSleepSpo2WmHolder", "(Lnzm;)V", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "Landroid/widget/TextView;", "dataTitleView", "Landroid/widget/TextView;", "getDataTitleView", "()Landroid/widget/TextView;", "setDataTitleView", "(Landroid/widget/TextView;)V", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class SleepBaseRelativeFragment<VM extends BasicRelativeDataViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {

    @Nullable
    private View containerView;

    @Nullable
    private TextView dataTitleView;

    @Nullable
    private View detailParentView;

    @Nullable
    private SleepDistributeWmHolder distributeWmHolder;

    @Nullable
    private Integer fragmentPosition;

    @Nullable
    private LocalDate mCurrentLocalDate;
    private long relativeUid = -1;

    @Nullable
    private umm sleepHeartRateWmHolder;

    @Nullable
    private grm sleepRegularViewHolder;

    @Nullable
    private nzm sleepSpo2WmHolder;

    @Nullable
    private k0n sleepTotalDurationEvaluationHolder;

    private final void initCurrentLocalDate() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            int i = arguments.getInt("offset", 0);
            Integer num = this.fragmentPosition;
            this.mCurrentLocalDate = (num != null && num.intValue() == 1) ? TimeDateUtil.getWeekMonday(LocalDate.now().minusWeeks(i)) : TimeDateUtil.getFirstDayOfMonth(LocalDate.now().minusMonths(i));
        }
        if (this.mCurrentLocalDate == null) {
            this.mCurrentLocalDate = LocalDate.now();
        }
    }

    private final void initViewAndHolder(View view) {
        setActionBarDisplayable(false);
        this.containerView = view.findViewById(eri.V1);
        this.detailParentView = view.findViewById(eri.cb);
        View viewFindViewById = view.findViewById(eri.q1);
        Integer num = this.fragmentPosition;
        Intrinsics.checkNotNull(num);
        this.sleepTotalDurationEvaluationHolder = new k0n(viewFindViewById, num.intValue());
        View viewFindViewById2 = view.findViewById(eri.aa);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Integer num2 = this.fragmentPosition;
        Intrinsics.checkNotNull(num2);
        this.distributeWmHolder = new SleepDistributeWmHolder(viewFindViewById2, num2.intValue());
        View viewFindViewById3 = view.findViewById(eri.da);
        Integer num3 = this.fragmentPosition;
        Intrinsics.checkNotNull(num3);
        this.sleepRegularViewHolder = new grm(viewFindViewById3, num3.intValue());
        View viewFindViewById4 = view.findViewById(eri.ba);
        Integer num4 = this.fragmentPosition;
        Intrinsics.checkNotNull(num4);
        this.sleepHeartRateWmHolder = new umm(viewFindViewById4, num4.intValue());
        View viewFindViewById5 = view.findViewById(eri.ia);
        Integer num5 = this.fragmentPosition;
        Intrinsics.checkNotNull(num5);
        this.sleepSpo2WmHolder = new nzm(viewFindViewById5, num5.intValue());
        this.dataTitleView = (TextView) view.findViewById(eri.H2);
    }

    private final boolean isMonth() {
        Integer num = this.fragmentPosition;
        return num != null && num.intValue() == 2;
    }

    private final boolean isWeek() {
        Integer num = this.fragmentPosition;
        return num != null && num.intValue() == 1;
    }

    private final void onReportResult(List<? extends DailyBasicReport> result) {
        AllDaySleepReport allDaySleepReport;
        Logger.i("MiHealth", "Sleep wm onReportResult mCurrentLocalDate:" + this.mCurrentLocalDate);
        if (this.mCurrentLocalDate == null) {
            return;
        }
        if (ArrayUtils.isEmpty(result)) {
            allDaySleepReport = null;
        } else {
            Intrinsics.checkNotNull(result);
            allDaySleepReport = null;
            for (DailyBasicReport dailyBasicReport : result) {
                if (dailyBasicReport instanceof AllDaySleepReport) {
                    allDaySleepReport = (AllDaySleepReport) dailyBasicReport;
                }
            }
        }
        Logger.i("MiHealth", "Sleep wm onReportResult allDaySleepReport" + (allDaySleepReport != null ? allDaySleepReport.toString() : null));
        k0n k0nVar = this.sleepTotalDurationEvaluationHolder;
        if (k0nVar != null) {
            k0nVar.j(allDaySleepReport);
        }
        if (allDaySleepReport == null || ArrayUtils.isEmpty(allDaySleepReport.getDayReportList())) {
            View view = this.detailParentView;
            if (view != null) {
                ViewExtKt.setVisible(view, false);
            }
            View view2 = this.containerView;
            if (view2 != null) {
                ViewExtKt.setVisible(view2, false);
            }
            TextView textView = this.dataTitleView;
            if (textView != null) {
                ViewExtKt.setVisible(textView, true);
                return;
            }
            return;
        }
        View view3 = this.detailParentView;
        if (view3 != null) {
            ViewExtKt.setVisible(view3, true);
        }
        SleepDistributeWmHolder sleepDistributeWmHolder = this.distributeWmHolder;
        if (sleepDistributeWmHolder != null) {
            LocalDate localDate = this.mCurrentLocalDate;
            Intrinsics.checkNotNull(localDate);
            sleepDistributeWmHolder.updateReport(localDate, allDaySleepReport);
        }
        grm grmVar = this.sleepRegularViewHolder;
        if (grmVar != null) {
            grmVar.c(this.mCurrentLocalDate, allDaySleepReport);
        }
        umm ummVar = this.sleepHeartRateWmHolder;
        if (ummVar != null) {
            ummVar.e(this.mCurrentLocalDate, allDaySleepReport);
        }
        nzm nzmVar = this.sleepSpo2WmHolder;
        if (nzmVar != null) {
            nzmVar.e(this.mCurrentLocalDate, allDaySleepReport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepBaseRelativeFragment this$0, CloudDataResult cloudDataResult) {
        TextView textView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((cloudDataResult.getData() == null || ArrayUtils.isEmpty((Collection<?>) cloudDataResult.getData())) && cloudDataResult.isOutSharedData() && (textView = this$0.dataTitleView) != null) {
            textView.setText(this$0.getString(c0j.I4));
        }
        this$0.onReportResult((List) cloudDataResult.getData());
        return Unit.INSTANCE;
    }

    public abstract int fragmentPosition();

    @Nullable
    public final View getContainerView() {
        return this.containerView;
    }

    @Nullable
    public final TextView getDataTitleView() {
        return this.dataTitleView;
    }

    @Nullable
    public final View getDetailParentView() {
        return this.detailParentView;
    }

    @Nullable
    public final SleepDistributeWmHolder getDistributeWmHolder() {
        return this.distributeWmHolder;
    }

    @Nullable
    public final Integer getFragmentPosition() {
        return this.fragmentPosition;
    }

    @Nullable
    public final LocalDate getMCurrentLocalDate() {
        return this.mCurrentLocalDate;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Nullable
    public final umm getSleepHeartRateWmHolder() {
        return this.sleepHeartRateWmHolder;
    }

    @Nullable
    public final grm getSleepRegularViewHolder() {
        return this.sleepRegularViewHolder;
    }

    @Nullable
    public final nzm getSleepSpo2WmHolder() {
        return this.sleepSpo2WmHolder;
    }

    @Nullable
    public final k0n getSleepTotalDurationEvaluationHolder() {
        return this.sleepTotalDurationEvaluationHolder;
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
        this.fragmentPosition = Integer.valueOf(fragmentPosition());
        initViewAndHolder(view);
        initCurrentLocalDate();
        VM mViewModel = getMViewModel();
        String str = isWeek() ? "weeks" : "months";
        LocalDate localDate = this.mCurrentLocalDate;
        Intrinsics.checkNotNull(localDate);
        mViewModel.triggerFetchFitnessReport(ISleepRepository.class, str, TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new SleepBaseRelativeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cim
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepBaseRelativeFragment.onViewCreated$lambda$0(this.f5381a, (CloudDataResult) obj);
            }
        }));
    }

    public final void setContainerView(@Nullable View view) {
        this.containerView = view;
    }

    public final void setDataTitleView(@Nullable TextView textView) {
        this.dataTitleView = textView;
    }

    public final void setDetailParentView(@Nullable View view) {
        this.detailParentView = view;
    }

    public final void setDistributeWmHolder(@Nullable SleepDistributeWmHolder sleepDistributeWmHolder) {
        this.distributeWmHolder = sleepDistributeWmHolder;
    }

    public final void setFragmentPosition(@Nullable Integer num) {
        this.fragmentPosition = num;
    }

    public final void setMCurrentLocalDate(@Nullable LocalDate localDate) {
        this.mCurrentLocalDate = localDate;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setSleepHeartRateWmHolder(@Nullable umm ummVar) {
        this.sleepHeartRateWmHolder = ummVar;
    }

    public final void setSleepRegularViewHolder(@Nullable grm grmVar) {
        this.sleepRegularViewHolder = grmVar;
    }

    public final void setSleepSpo2WmHolder(@Nullable nzm nzmVar) {
        this.sleepSpo2WmHolder = nzmVar;
    }

    public final void setSleepTotalDurationEvaluationHolder(@Nullable k0n k0nVar) {
        this.sleepTotalDurationEvaluationHolder = k0nVar;
    }
}
