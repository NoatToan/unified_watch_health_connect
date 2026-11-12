package com.xiaomi.fitness.health.threetarget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.threetarget.ThreeTargetWeekFragment;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;
import com.xiaomi.fitness.health.threetarget.viewmodel.DataRegularTargetViewModel;
import com.xiaomi.fitness.sport.RecordViewModel;
import defpackage.ogj;
import defpackage.qha;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b1\u00102J-\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0011\u00100\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ThreeTargetWeekFragment;", "Lcom/xiaomi/fitness/health/threetarget/BaseTargetChartFragment;", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView$OnWeekBarItemSelectedListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "index", "onWeekItemSelected", "(I)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Lqha;", "_binding", "Lqha;", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "targetWeekBarView", "Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "getTargetWeekBarView", "()Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;", "setTargetWeekBarView", "(Lcom/xiaomi/fitness/health/threetarget/view/TargetWeekBarView;)V", "currentPosition", "I", "", "Lorg/joda/time/LocalDate;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "weekReportMap", "Ljava/util/Map;", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "recordViewModel", "Lcom/xiaomi/fitness/sport/RecordViewModel;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "mSaveData", "getBinding", "()Lqha;", "binding", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nThreeTargetWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreeTargetWeekFragment.kt\ncom/xiaomi/fitness/health/threetarget/ThreeTargetWeekFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class ThreeTargetWeekFragment extends Hilt_ThreeTargetWeekFragment implements TargetWeekBarView.OnWeekBarItemSelectedListener {

    @Nullable
    private qha _binding;

    @NotNull
    private LocalDate currentLocalDate;
    private int currentPosition;

    @Nullable
    private LocalDate mSaveData;

    @Nullable
    private RecordViewModel recordViewModel;
    public TargetWeekBarView targetWeekBarView;

    @NotNull
    private final Map<LocalDate, DailyGoalReport> weekReportMap = new LinkedHashMap();

    public ThreeTargetWeekFragment() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.currentLocalDate = localDateNow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ThreeTargetWeekFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(localDate);
        this$0.getMRegularTargetViewModel().setMCurrentWeekPosition(Days.daysBetween(TimeDateUtil.getWeekMonday(localDate), localDate).getDays());
        if (!Intrinsics.areEqual(this$0.currentLocalDate, localDate) && this$0.weekReportMap.containsKey(localDate)) {
            this$0.currentLocalDate = localDate;
            this$0.getTargetWeekBarView().bindData(this$0.weekReportMap, weekMonday, this$0.currentLocalDate);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(ThreeTargetWeekFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.weekReportMap.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DailyGoalReport dailyGoalReport = (DailyGoalReport) it.next();
                LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyGoalReport.getTime());
                DailyGoalReport dailyGoalReport2 = this$0.weekReportMap.get(localDateTimestampToLocalDate);
                if (dailyGoalReport2 == null || !Intrinsics.areEqual(dailyGoalReport2, dailyGoalReport)) {
                    this$0.weekReportMap.put(localDateTimestampToLocalDate, dailyGoalReport);
                }
            }
            this$0.getTargetWeekBarView().bindData(this$0.weekReportMap, TimeDateUtil.getWeekMonday(this$0.currentLocalDate), this$0.currentLocalDate);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final qha getBinding() {
        qha qhaVar = this._binding;
        Intrinsics.checkNotNull(qhaVar);
        return qhaVar;
    }

    @NotNull
    public final TargetWeekBarView getTargetWeekBarView() {
        TargetWeekBarView targetWeekBarView = this.targetWeekBarView;
        if (targetWeekBarView != null) {
            return targetWeekBarView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetWeekBarView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = qha.A0(inflater, container, false);
        setTargetWeekBarView(getBinding().A);
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("saved_date", this.currentLocalDate);
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getTargetWeekBarView().setOnItemSelectedListener(this);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        setMRegularTargetViewModel((DataRegularTargetViewModel) new ViewModelProvider(mActivity).get(DataRegularTargetViewModel.class));
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("offset", 0) : 0;
        this.currentPosition = i;
        LocalDate localDateMinusWeeks = LocalDate.now().minusWeeks(i);
        if (localDateMinusWeeks == null) {
            localDateMinusWeeks = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateMinusWeeks, "run(...)");
        }
        this.currentLocalDate = localDateMinusWeeks;
        if (getArguments() == null) {
            LocalDate mTodayLocalDate = (LocalDate) (savedInstanceState != null ? savedInstanceState.getSerializable("saved_date") : null);
            if (mTodayLocalDate == null) {
                mTodayLocalDate = getMTodayLocalDate();
            }
            this.mSaveData = mTodayLocalDate;
            if (mTodayLocalDate != null) {
                Intrinsics.checkNotNull(mTodayLocalDate);
                this.currentLocalDate = mTodayLocalDate;
            }
        }
        LocalDate localDatePlusDays = TimeDateUtil.getWeekMonday(this.currentLocalDate).plusDays(getMRegularTargetViewModel().getMCurrentWeekPosition());
        this.currentLocalDate = localDatePlusDays;
        if (localDatePlusDays.compareTo((ogj) LocalDate.now()) > 0) {
            LocalDate localDateNow = LocalDate.now();
            this.currentLocalDate = localDateNow;
            getMRegularTargetViewModel().setMCurrentWeekPosition(Days.daysBetween(TimeDateUtil.getWeekMonday(localDateNow), this.currentLocalDate).getDays());
        }
        getWeekBarDataOnSelectDate(this.currentLocalDate);
        getMRegularTargetViewModel().getCurrentSelectedDate().observe(getViewLifecycleOwner(), new ThreeTargetWeekFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pdp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreeTargetWeekFragment.onViewCreated$lambda$2(this.f30302a, (LocalDate) obj);
            }
        }));
        LiveData<List<DailyGoalReport>> liveDataGoalReportList = getLiveDataGoalReportList();
        if (liveDataGoalReportList != null) {
            liveDataGoalReportList.observe(getViewLifecycleOwner(), new ThreeTargetWeekFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qdp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ThreeTargetWeekFragment.onViewCreated$lambda$3(this.f31419a, (List) obj);
                }
            }));
        }
    }

    @Override // com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView.OnWeekBarItemSelectedListener
    public void onWeekItemSelected(int index) {
        LocalDate value = getMRegularTargetViewModel().getCurrentSelectedDate().getValue();
        this.mSelectDate = value;
        if (value == null) {
            return;
        }
        LocalDate weekMonday = TimeDateUtil.getWeekMonday(value);
        LocalDate localDatePlusDays = weekMonday.plusDays(index);
        if (localDatePlusDays.compareTo((ogj) LocalDate.now()) > 0) {
            return;
        }
        getMRegularTargetViewModel().setMCurrentWeekPosition(index);
        this.mSelectDate = localDatePlusDays;
        Logger.d("TargetChartFragment", "onWeekItemSelected:" + localDatePlusDays);
        getTargetWeekBarView().bindData(this.weekReportMap, weekMonday, this.mSelectDate);
        if (Intrinsics.areEqual(getMRegularTargetViewModel().getCurrentSelectedDate().getValue(), this.mSelectDate)) {
            return;
        }
        getMRegularTargetViewModel().getCurrentSelectedDate().postValue(localDatePlusDays);
    }

    public final void setTargetWeekBarView(@NotNull TargetWeekBarView targetWeekBarView) {
        Intrinsics.checkNotNullParameter(targetWeekBarView, "<set-?>");
        this.targetWeekBarView = targetWeekBarView;
    }
}
