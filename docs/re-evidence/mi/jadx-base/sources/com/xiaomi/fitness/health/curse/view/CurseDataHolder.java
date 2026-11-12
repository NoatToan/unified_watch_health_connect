package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.CurseMonthFragment;
import com.xiaomi.fitness.health.curse.adapter.CurseCalendarAdapter;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.view.CurseDataHolder;
import com.xiaomi.fitness.health.curse.vm.CurseEditVM;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.CurseMonthVMKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.c0j;
import defpackage.jui;
import defpackage.ksb;
import defpackage.sk5;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*R6\u00100\u001a\"\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,j\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u0001`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00102\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseDataHolder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "updateFlexBoxWidth", "()V", "setSymptom", "()Lkotlin/Unit;", "setActionView", "dealMarkAction", "setDayView", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "getCurData", "()Lorg/joda/time/LocalDate;", "onDataChange", DialWidgetType.DATE, "switchMonth", "(Lorg/joda/time/LocalDate;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/health/curse/adapter/CurseCalendarAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/health/curse/adapter/CurseCalendarAdapter;", "adapter", "Lcom/xiaomi/fitness/health/curse/CurseMainActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/health/curse/CurseMainActivity;", "Lksb;", "bind", "Lksb;", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM$delegate", "getMainVM", "()Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM", "Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "editModel$delegate", "getEditModel", "()Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "editModel", "Ljava/util/HashMap;", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "Lkotlin/collections/HashMap;", "records", "Ljava/util/HashMap;", "curDate", "Lorg/joda/time/LocalDate;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseDataHolder extends ConstraintLayout {

    @NotNull
    private final CurseMainActivity activity;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @NotNull
    private final ksb bind;
    private LocalDate curDate;

    /* JADX INFO: renamed from: editModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy editModel;

    /* JADX INFO: renamed from: mainVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainVM;

    @Nullable
    private HashMap<Long, DayData> records;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseDataHolder(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(CurseDataHolder this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.curDate = localDate;
        this$0.setDayView();
        this$0.setActionView();
        this$0.setSymptom();
        CurseCalendarAdapter adapter = this$0.getAdapter();
        Intrinsics.checkNotNull(localDate);
        adapter.setSelectDay(localDate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(CurseDataHolder this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dealMarkAction();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(CurseDataHolder this$0, HashMap map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.records = map;
        this$0.setDayView();
        this$0.setActionView();
        this$0.setSymptom();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseCalendarAdapter adapter_delegate$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return new CurseCalendarAdapter(context);
    }

    private final void dealMarkAction() {
        Logger.d("CurseDataHolder", "dealMarkAction " + this.curDate);
        HashMap<Long, DayData> map = this.records;
        if (map != null) {
            CurseEditVM editModel = getEditModel();
            LocalDate curDate = this.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
            editModel.dealMarkAction(ExtUtilKt.getMills(curDate), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseEditVM editModel_delegate$lambda$2(CurseDataHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseEditVM) new ViewModelProvider(this$0.activity).get(CurseEditVM.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurseCalendarAdapter getAdapter() {
        return (CurseCalendarAdapter) this.adapter.getValue();
    }

    private final CurseEditVM getEditModel() {
        return (CurseEditVM) this.editModel.getValue();
    }

    private final CurseMainVM getMainVM() {
        return (CurseMainVM) this.mainVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseMainVM mainVM_delegate$lambda$1(CurseDataHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseMainVM) new ViewModelProvider(this$0.activity).get(CurseMainVM.class);
    }

    private final void setActionView() {
        Integer numValueOf;
        HashMap<Long, DayData> map = this.records;
        if (map == null || map.isEmpty()) {
            TextView actionView = this.bind.A;
            Intrinsics.checkNotNullExpressionValue(actionView, "actionView");
            ExtUtilKt.invisible(actionView);
            return;
        }
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        int iFetchOperationMode = CurseMonthVMKt.fetchOperationMode(ExtUtilKt.getMills(curDate), this.records);
        if (iFetchOperationMode == 1) {
            numValueOf = Integer.valueOf(c0j.A5);
        } else if (iFetchOperationMode != 2) {
            numValueOf = iFetchOperationMode != 3 ? null : Integer.valueOf(c0j.B5);
        } else {
            numValueOf = Integer.valueOf(c0j.C5);
        }
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            TextView actionView2 = this.bind.A;
            Intrinsics.checkNotNullExpressionValue(actionView2, "actionView");
            ExtUtilKt.invisible(actionView2);
        } else {
            this.bind.A.setText(numValueOf.intValue());
            TextView actionView3 = this.bind.A;
            Intrinsics.checkNotNullExpressionValue(actionView3, "actionView");
            ExtUtilKt.visible(actionView3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDayView() {
        String dateMMddFormat;
        DayData dayData;
        TextView textView = this.bind.F;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        if (TimeDateUtil.isSameLocalDate(localDateNow, curDate)) {
            dateMMddFormat = getResources().getString(c0j.A6);
        } else {
            LocalDate curDate2 = this.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate2, "curDate");
            dateMMddFormat = TimeDateUtil.getDateMMddFormat(curDate2);
        }
        textView.setText(dateMMddFormat);
        HashMap<Long, DayData> map = this.records;
        if (map != null) {
            LocalDate curDate3 = this.curDate;
            Intrinsics.checkNotNullExpressionValue(curDate3, "curDate");
            dayData = map.get(Long.valueOf(ExtUtilKt.getZeroMills(curDate3)));
        } else {
            dayData = null;
        }
        Logger.d("CurseDataHolder", "setDayView: " + dayData + ", " + this.curDate);
        if (dayData != null) {
            this.bind.G.setText(CurseManager.INSTANCE.getInstance().getDesc(dayData.getTime(), dayData.getInIndex(), dayData.getInDays()));
            return;
        }
        TextView textView2 = this.bind.G;
        CurseManager companion = CurseManager.INSTANCE.getInstance();
        LocalDate curDate4 = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate4, "curDate");
        textView2.setText(CurseManager.getDesc$default(companion, ExtUtilKt.getMills(curDate4), 0, 0, 6, null));
    }

    private final Unit setSymptom() {
        HashMap<Long, DayData> map = this.records;
        if (map == null) {
            return null;
        }
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        DayData dayData = map.get(Long.valueOf(ExtUtilKt.getMills(curDate)));
        if (dayData != null) {
            this.activity.setSymptom(dayData);
        }
        return Unit.INSTANCE;
    }

    private final void updateFlexBoxWidth() {
        FlexboxLayout curseTableHeaderContainer = this.bind.C;
        Intrinsics.checkNotNullExpressionValue(curseTableHeaderContainer, "curseTableHeaderContainer");
        ViewGroup.LayoutParams layoutParams = curseTableHeaderContainer.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        UIUtils uIUtils = UIUtils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.width = uIUtils.isTabletAndLandscape(context) ? ExtUtilsKt.getDp(400) : -1;
        curseTableHeaderContainer.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: getCurData, reason: from getter */
    public final LocalDate getCurDate() {
        return this.curDate;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        updateFlexBoxWidth();
    }

    public final void onDataChange() {
    }

    public final void switchMonth(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDatePlusDays = date.minusDays(date.getDayOfMonth()).plusDays(Math.min(this.curDate.getDayOfMonth(), TimeDateUtil.INSTANCE.getDaysOfMonth(ExtUtilKt.getMills(date))));
        CurseCalendarAdapter adapter = getAdapter();
        Intrinsics.checkNotNull(localDatePlusDays);
        int pos = adapter.getPos(localDatePlusDays);
        Logger.d("CurseDataHolder", "switchMonth: pos = " + pos + "; finalDate = " + localDatePlusDays + "; " + date);
        this.bind.E.k(pos, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseDataHolder(@NotNull final Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        this.adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseDataHolder.adapter_delegate$lambda$0(context);
            }
        });
        CurseMainActivity curseMainActivity = (CurseMainActivity) context;
        this.activity = curseMainActivity;
        ViewDataBinding viewDataBindingJ = sk5.j(LayoutInflater.from(context), jui.U2, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingJ, "inflate(...)");
        ksb ksbVar = (ksb) viewDataBindingJ;
        this.bind = ksbVar;
        this.mainVM = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseDataHolder.mainVM_delegate$lambda$1(this.f34323a);
            }
        });
        this.editModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseDataHolder.editModel_delegate$lambda$2(this.f35392a);
            }
        });
        this.curDate = LocalDate.now();
        ViewPager2 datePager = ksbVar.E;
        Intrinsics.checkNotNullExpressionValue(datePager, "datePager");
        datePager.setAdapter(getAdapter());
        setDayView();
        CurseCalendarAdapter adapter = getAdapter();
        LocalDate curDate = this.curDate;
        Intrinsics.checkNotNullExpressionValue(curDate, "curDate");
        datePager.k(adapter.getPos(curDate), false);
        getMainVM().getOnDayClick().observe(curseMainActivity, new CurseDataHolderKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseDataHolder._init_$lambda$3(this.f36491a, (LocalDate) obj);
            }
        }));
        datePager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.curse.view.CurseDataHolder.2
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                LocalDate dateFromPos = CurseDataHolder.this.getAdapter().getDateFromPos(position);
                CurseDataHolder.this.curDate = dateFromPos;
                CurseDataHolder.this.activity.setTitleDate(dateFromPos);
                Logger.d("CurseDataHolder", "onPageSelected: " + dateFromPos);
                CurseDataHolder.this.setDayView();
                Fragment fragmentL0 = CurseDataHolder.this.activity.getSupportFragmentManager().l0(PluginDeviceInfo.FBLUETOOTHPAIR + position);
                if (fragmentL0 == null || !(fragmentL0 instanceof CurseMonthFragment)) {
                    return;
                }
                ((CurseMonthFragment) fragmentL0).refreshCalendarViewDateOnPageSelected();
            }
        });
        ViewExtKt.clickWithTrigger$default(ksbVar.A, 0L, new Function1() { // from class: w55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseDataHolder._init_$lambda$4(this.f37626a, (TextView) obj);
            }
        }, 1, null);
        getMainVM().getResumeMonthOb().observe(curseMainActivity, new CurseDataHolderKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: x55
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseDataHolder._init_$lambda$5(this.f38713a, (HashMap) obj);
            }
        }));
        updateFlexBoxWidth();
    }

    public /* synthetic */ CurseDataHolder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
