package com.xiaomi.fitness.health.sleep.rhythm.calendar;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarItemFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.jui;
import defpackage.rv1;
import defpackage.x1c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarItemFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonthItemViewModel;", "Lx1c;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "Lorg/joda/time/LocalDate;", DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "Ljava/util/LinkedHashMap;", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "dataRecords", "Ljava/util/LinkedHashMap;", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView;", "calendarView", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarView;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "monitorSharedViewModel", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "", "firstDataFinish", "Z", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmCalendarItemFragment extends Hilt_SleepRhythmCalendarItemFragment<SleepRhythmMonthItemViewModel, x1c> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_DATE = "date_local";

    @NotNull
    private static final String TAG = "CurseMonthPage";
    private SleepRhythmCalendarView calendarView;

    @NotNull
    private final LinkedHashMap<Long, SleepRhythmCalendarDayData> dataRecords;
    private LocalDate date;
    private boolean firstDataFinish;
    private SleepRhythmMonitorViewModel monitorSharedViewModel;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarItemFragment$Companion;", "", "<init>", "()V", "KEY_DATE", "", "TAG", "instance", "Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarItemFragment;", DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepRhythmCalendarItemFragment instance(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            SleepRhythmCalendarItemFragment sleepRhythmCalendarItemFragment = new SleepRhythmCalendarItemFragment();
            Bundle bundle = new Bundle(1);
            bundle.putSerializable(SleepRhythmCalendarItemFragment.KEY_DATE, date);
            sleepRhythmCalendarItemFragment.setArguments(bundle);
            return sleepRhythmCalendarItemFragment;
        }
    }

    public SleepRhythmCalendarItemFragment() {
        super(jui.x5, rv1.f32936a);
        this.dataRecords = new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SleepRhythmCalendarItemFragment this$0, LocalDate selectDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        SleepTrackHelper.INSTANCE.trackSleepRhythmCalendarClick();
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = this$0.monitorSharedViewModel;
        if (sleepRhythmMonitorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monitorSharedViewModel");
            sleepRhythmMonitorViewModel = null;
        }
        sleepRhythmMonitorViewModel.getOnDayClickLiveData().postValue(selectDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(Ref.BooleanRef showGuidePop, SleepRhythmCalendarItemFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(showGuidePop, "$showGuidePop");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepRhythmCalendarView sleepRhythmCalendarView = null;
        if (showGuidePop.element) {
            SleepRhythmPreference.INSTANCE.setHasShowRecordDiaryGuidePopup(true);
            SleepRhythmCalendarView sleepRhythmCalendarView2 = this$0.calendarView;
            if (sleepRhythmCalendarView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarView");
                sleepRhythmCalendarView2 = null;
            }
            sleepRhythmCalendarView2.setShowPopViewEnable(false);
            showGuidePop.element = false;
        }
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        Intrinsics.checkNotNull(localDate);
        int daysOfMonth = timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(localDate));
        SleepRhythmCalendarView sleepRhythmCalendarView3 = this$0.calendarView;
        if (sleepRhythmCalendarView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
        } else {
            sleepRhythmCalendarView = sleepRhythmCalendarView3;
        }
        if (localDate.getDayOfMonth() <= daysOfMonth) {
            daysOfMonth = localDate.getDayOfMonth();
        }
        sleepRhythmCalendarView.setDayOfMonth(daysOfMonth);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(SleepRhythmCalendarItemFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate localDate = this$0.date;
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = null;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        Logger.i(TAG, "monthCalendarRecord callback: " + localDate);
        this$0.firstDataFinish = true;
        this$0.dataRecords.clear();
        this$0.dataRecords.putAll(map);
        SleepRhythmCalendarView sleepRhythmCalendarView = this$0.calendarView;
        if (sleepRhythmCalendarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
            sleepRhythmCalendarView = null;
        }
        sleepRhythmCalendarView.invalidate();
        if (this$0.isResumed()) {
            SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel2 = this$0.monitorSharedViewModel;
            if (sleepRhythmMonitorViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorSharedViewModel");
            } else {
                sleepRhythmMonitorViewModel = sleepRhythmMonitorViewModel2;
            }
            sleepRhythmMonitorViewModel.getResumeMonthItemLiveData().postValue(this$0.dataRecords);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(SleepRhythmCalendarItemFragment this$0, SleepRhythmReport sleepRhythmReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.firstDataFinish) {
            SleepRhythmMonthItemViewModel sleepRhythmMonthItemViewModel = (SleepRhythmMonthItemViewModel) this$0.getMViewModel();
            LocalDate localDate = this$0.date;
            if (localDate == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
                localDate = null;
            }
            sleepRhythmMonthItemViewModel.requestMonthCalendarRecordStatus(localDate);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = this.monitorSharedViewModel;
        SleepRhythmCalendarView sleepRhythmCalendarView = null;
        if (sleepRhythmMonitorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monitorSharedViewModel");
            sleepRhythmMonitorViewModel = null;
        }
        sleepRhythmMonitorViewModel.getResumeMonthItemLiveData().postValue(this.dataRecords);
        SleepRhythmCalendarView sleepRhythmCalendarView2 = this.calendarView;
        if (sleepRhythmCalendarView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
        } else {
            sleepRhythmCalendarView = sleepRhythmCalendarView2;
        }
        sleepRhythmCalendarView.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.monitorSharedViewModel = (SleepRhythmMonitorViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(SleepRhythmMonitorViewModel.class);
        Bundle arguments = getArguments();
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = null;
        Serializable serializable = arguments != null ? arguments.getSerializable(KEY_DATE) : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type org.joda.time.LocalDate");
        this.date = (LocalDate) serializable;
        setActionBarDisplayable(false);
        this.calendarView = ((x1c) getMBinding()).A;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = !SleepRhythmPreference.INSTANCE.getHasShowRecordDiaryGuidePopup();
        SleepRhythmCalendarView sleepRhythmCalendarView = this.calendarView;
        if (sleepRhythmCalendarView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
            sleepRhythmCalendarView = null;
        }
        sleepRhythmCalendarView.setShowPopViewEnable(booleanRef.element);
        SleepRhythmCalendarView sleepRhythmCalendarView2 = this.calendarView;
        if (sleepRhythmCalendarView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
            sleepRhythmCalendarView2 = null;
        }
        LocalDate localDate = this.date;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        sleepRhythmCalendarView2.initDate(localDate, this.dataRecords);
        SleepRhythmCalendarView sleepRhythmCalendarView3 = this.calendarView;
        if (sleepRhythmCalendarView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarView");
            sleepRhythmCalendarView3 = null;
        }
        sleepRhythmCalendarView3.setOnDayClicked(new Function1() { // from class: ksm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarItemFragment.onViewCreated$lambda$0(this.f24266a, (LocalDate) obj);
            }
        });
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel2 = this.monitorSharedViewModel;
        if (sleepRhythmMonitorViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monitorSharedViewModel");
            sleepRhythmMonitorViewModel2 = null;
        }
        sleepRhythmMonitorViewModel2.getOnDayClickLiveData().observe(getViewLifecycleOwner(), new SleepRhythmCalendarItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lsm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarItemFragment.onViewCreated$lambda$1(booleanRef, this, (LocalDate) obj);
            }
        }));
        ((SleepRhythmMonthItemViewModel) getMViewModel()).getMonthCalendarRecordStatusLiveData().observe(getViewLifecycleOwner(), new SleepRhythmCalendarItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: msm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarItemFragment.onViewCreated$lambda$2(this.f27165a, (Map) obj);
            }
        }));
        SleepRhythmMonthItemViewModel sleepRhythmMonthItemViewModel = (SleepRhythmMonthItemViewModel) getMViewModel();
        LocalDate localDate2 = this.date;
        if (localDate2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate2 = null;
        }
        sleepRhythmMonthItemViewModel.requestMonthCalendarRecordStatus(localDate2);
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel3 = this.monitorSharedViewModel;
        if (sleepRhythmMonitorViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monitorSharedViewModel");
        } else {
            sleepRhythmMonitorViewModel = sleepRhythmMonitorViewModel3;
        }
        sleepRhythmMonitorViewModel.queryLatestSleepRhythmLiveData().observe(getViewLifecycleOwner(), new SleepRhythmCalendarItemFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: nsm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmCalendarItemFragment.onViewCreated$lambda$3(this.f28332a, (SleepRhythmReport) obj);
            }
        }));
    }
}
