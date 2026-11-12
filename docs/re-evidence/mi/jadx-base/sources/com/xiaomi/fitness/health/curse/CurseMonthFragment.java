package com.xiaomi.fitness.health.curse;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseMonthFragment;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.view.CurseCalendarView;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.CurseMonthVM;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.atb;
import defpackage.jui;
import defpackage.wc0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001-B\u0007¢\u0006\u0004\b,\u0010\u0016J3\u0010\u000b\u001a\u00020\n2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0016R\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseMonthFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/curse/vm/CurseMonthVM;", "Latb;", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "Ljava/util/HashMap;", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "Lkotlin/collections/HashMap;", "data", "", "onDataFinish", "(Ljava/util/HashMap;)V", "Lorg/joda/time/LocalDate;", PluginDeviceInfo.FICONOFF, "onDayChanged", "(Lorg/joda/time/LocalDate;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "refreshCalendarViewDateOnPageSelected", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "curDate", "setDate", "onDataChange", LifecycleConstantKt.ON_DESTROY, DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "Ljava/util/LinkedHashMap;", "dataRecords", "Ljava/util/LinkedHashMap;", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM$delegate", "Lkotlin/Lazy;", "getMainVM", "()Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM", "dayChangedDate", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseMonthFragment.kt\ncom/xiaomi/fitness/health/curse/CurseMonthFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class CurseMonthFragment extends Hilt_CurseMonthFragment<CurseMonthVM, atb> implements CurseManager.OnConfigChange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LinkedHashMap<Long, DayData> dataRecords;
    private LocalDate date;

    @Nullable
    private LocalDate dayChangedDate;

    /* JADX INFO: renamed from: mainVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainVM;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseMonthFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/health/curse/CurseMonthFragment;", DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CurseMonthFragment instance(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            CurseMonthFragment curseMonthFragment = new CurseMonthFragment();
            Bundle bundle = new Bundle(1);
            bundle.putSerializable("date_mills", date);
            curseMonthFragment.setArguments(bundle);
            return curseMonthFragment;
        }
    }

    public CurseMonthFragment() {
        super(jui.d3);
        this.dataRecords = new LinkedHashMap<>();
        this.mainVM = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseMonthFragment.mainVM_delegate$lambda$0(this.f32311a);
            }
        });
    }

    private final CurseMainVM getMainVM() {
        return (CurseMainVM) this.mainVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseMainVM mainVM_delegate$lambda$0(CurseMonthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return (CurseMainVM) new ViewModelProvider(fragmentActivityRequireActivity).get(CurseMainVM.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CurseMonthFragment this$0, HashMap map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.onDataFinish(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CurseMonthFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(localDate);
        this$0.onDayChanged(localDate);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataFinish(HashMap<Long, DayData> data) {
        this.dataRecords.clear();
        this.dataRecords.putAll(data);
        ((atb) getMBinding()).A.invalidate();
        if (isResumed()) {
            getMainVM().getResumeMonthOb().setValue(this.dataRecords);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDayChanged(LocalDate d) {
        this.dayChangedDate = d;
        LocalDate localDate = this.date;
        LocalDate localDate2 = null;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        Logger.d("CurseMonthPage", "onDayChanged: " + d + " currentPage: " + localDate);
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        LocalDate localDate3 = this.date;
        if (localDate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
        } else {
            localDate2 = localDate3;
        }
        int daysOfMonth = timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(localDate2));
        CurseCalendarView curseCalendarView = ((atb) getMBinding()).A;
        if (d.getDayOfMonth() <= daysOfMonth) {
            daysOfMonth = d.getDayOfMonth();
        }
        curseCalendarView.setDayOfMonth(daysOfMonth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(CurseMonthFragment this$0, LocalDate it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getMainVM().getOnDayClick().setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("CurseMonthPage", "onCreate:");
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("date_mills") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type org.joda.time.LocalDate");
        this.date = (LocalDate) serializable;
        ((CurseMonthVM) getMViewModel()).getRecordsObs().observe(this, new CurseMonthFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p85
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMonthFragment.onCreate$lambda$1(this.f30112a, (HashMap) obj);
            }
        }));
        getMainVM().getOnDayClick().observe(this, new CurseMonthFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q85
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMonthFragment.onCreate$lambda$2(this.f31216a, (LocalDate) obj);
            }
        }));
        CurseManager.INSTANCE.getInstance().addDataObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.CurseManager.OnConfigChange
    public void onDataChange() {
        LocalDate localDate = this.date;
        LocalDate localDate2 = null;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        Logger.d("CurseMonthPage", "onDataEvent: " + localDate);
        CurseMonthVM curseMonthVM = (CurseMonthVM) getMViewModel();
        LocalDate localDate3 = this.date;
        if (localDate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
        } else {
            localDate2 = localDate3;
        }
        curseMonthVM.reqMonthPeriod(localDate2);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CurseManager.INSTANCE.getInstance().removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CurseMonthVM curseMonthVM = (CurseMonthVM) getMViewModel();
        LocalDate localDate = this.date;
        LocalDate localDate2 = null;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        curseMonthVM.reqMonthPeriod(localDate);
        LocalDate localDate3 = this.date;
        if (localDate3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
        } else {
            localDate2 = localDate3;
        }
        Logger.d("CurseMonthPage", "onResume: " + localDate2 + " ");
        getMainVM().getResumeMonthOb().setValue(this.dataRecords);
        CurseCalendarView curseCalendarView = ((atb) getMBinding()).A;
        ViewParent parent = curseCalendarView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = curseCalendarView.getViewHeight();
        viewGroup.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Logger.d("CurseMonthPage", "onViewCreated: ");
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        CurseCalendarView curseCalendarView = ((atb) getMBinding()).A;
        LocalDate localDate = this.date;
        if (localDate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
            localDate = null;
        }
        curseCalendarView.initDate(localDate, this.dataRecords);
        curseCalendarView.setOnDayClicked(new Function1() { // from class: s85
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMonthFragment.onViewCreated$lambda$6$lambda$5(this.f33397a, (LocalDate) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshCalendarViewDateOnPageSelected() {
        if (this.dayChangedDate != null) {
            CurseCalendarView curseCalendarView = ((atb) getMBinding()).A;
            LocalDate localDate = this.date;
            if (localDate == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
                localDate = null;
            }
            TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
            LocalDate localDate2 = this.date;
            if (localDate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DialWidgetType.DATE);
                localDate2 = null;
            }
            int daysOfMonth = timeDateUtil.getDaysOfMonth(ExtUtilKt.getMills(localDate2));
            LocalDate localDate3 = this.dayChangedDate;
            Intrinsics.checkNotNull(localDate3);
            LocalDate localDateWithDayOfMonth = localDate.withDayOfMonth(Math.min(daysOfMonth, localDate3.getDayOfMonth()));
            Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
            curseCalendarView.setDate(localDateWithDayOfMonth);
            this.dayChangedDate = null;
        }
    }

    public final void setDate(@NotNull LocalDate curDate) {
        Intrinsics.checkNotNullParameter(curDate, "curDate");
    }
}
