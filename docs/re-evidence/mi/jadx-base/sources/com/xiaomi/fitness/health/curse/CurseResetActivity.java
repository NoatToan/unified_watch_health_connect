package com.xiaomi.fitness.health.curse;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseResetActivity;
import com.xiaomi.fitness.health.curse.adapter.CurseDaysAdapter;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;
import com.xiaomi.fitness.health.curse.vm.CurseResetVM;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.gsb;
import defpackage.iji;
import defpackage.ili;
import defpackage.jui;
import defpackage.qxi;
import defpackage.zp5;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import miuix.pickerwidget.widget.DatePicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0007¢\u0006\u0004\b.\u0010\fJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseResetActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/curse/vm/CurseResetVM;", "Lgsb;", "", "type", "", "curValue", "", "selectOption", "(IJ)V", "generateDatePicker", "()V", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "generateDayPicker", "(I)Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "value", "setValue", "(JI)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "isFromReset", "Z", "()Z", "setFromReset", "(Z)V", "intervalPicker", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "inDaysPicker", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "setting", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "isLover", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseResetActivity extends Hilt_CurseResetActivity<CurseResetVM, gsb> {

    @NotNull
    public static final String EXTRA_FROM_RESET = "from_reset";
    private PickerDialog inDaysPicker;
    private PickerDialog intervalPicker;
    private boolean isFromReset;
    private boolean isLover = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isMale();
    private CurseSetting setting;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseResetActivity$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseResetActivity$onDestroy$1", f = "CurseResetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24191(Continuation<? super C24191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24191(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager.INSTANCE.getInstance().tryUpdateUserSettingInfo();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void generateDatePicker() {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        LocalDate localDate = new LocalDate(curseSetting.getLastMenstrualTime());
        zp5 zp5Var = new zp5(this, new zp5.d() { // from class: ua5
            @Override // zp5.d
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                CurseResetActivity.generateDatePicker$lambda$7(this.f35560a, datePicker, i, i2, i3);
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        zp5Var.K(false);
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        DatePicker datePickerH = zp5Var.H();
        zp5Var.setTitle(c0j.q6);
        datePickerH.setMinDate(todayZeroMills - 5184000000L);
        datePickerH.setMaxDate(todayZeroMills);
        zp5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void generateDatePicker$lambda$7(CurseResetActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setValue(ExtUtilKt.getZeroMills(new LocalDate(i, i2 + 1, i3)), 4);
    }

    private final PickerDialog generateDayPicker(final int type) {
        int i;
        int i2;
        boolean z = type == 1;
        if (z) {
            i = 15;
            i2 = 2;
        } else {
            i = 60;
            i2 = 17;
        }
        final PickerDialog pickerDialogCreate = new PickerDialog.b(String.valueOf(type)).setCustomLayoutId(jui.m7).setPositiveText(c0j.e).setNegativeText(c0j.c).setDialogTitle(z ? c0j.M5 : c0j.Z5).setCancelable(true).setCanceledOnTouchOutside(true).create();
        pickerDialogCreate.buildUpon().c(new CurseDaysAdapter(i2, i)).create();
        pickerDialogCreate.setPickerHintTextPluralsRes(qxi.B);
        Intrinsics.checkNotNull(pickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.curse.CurseResetActivity.generateDayPicker.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialogInterface, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialogInterface, "dialogInterface");
                super.onDialogClick(dialogName, dialogInterface, which);
                int value = pickerDialogCreate.getValue();
                if (which == -1) {
                    this.setValue(value, type);
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        Intrinsics.checkNotNull(pickerDialogCreate);
        return pickerDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CurseResetActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            CurseMainActivityKt.startCurseActivity(this$0);
            this$0.finish();
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$1(CurseResetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CurseResetVM) this$0.getMViewModel()).syncFirstConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CurseResetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectOption(1, curseSetting.getEstimatedMenstrualDays());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CurseResetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectOption(2, curseSetting.getMenstrualCycle());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CurseResetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectOption(4, curseSetting.getLastMenstrualTime());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$5(CurseResetActivity this$0, Boolean bool) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = null;
        if (bool.booleanValue()) {
            ((gsb) this$0.getMBinding()).D.setTitle(this$0.getString(c0j.Rp));
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView = ((gsb) this$0.getMBinding()).D;
            CurseSetting curseSetting2 = this$0.setting;
            if (curseSetting2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting2 = null;
            }
            if (curseSetting2.isPredictEnable()) {
                CurseSetting curseSetting3 = this$0.setting;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting3;
                }
                if (curseSetting.isAlgoPredictEnable()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            switchButtonSingleLineTextView.setSwitch(z);
        } else {
            ((gsb) this$0.getMBinding()).D.setTitle(this$0.getString(c0j.Jp));
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = ((gsb) this$0.getMBinding()).D;
            CurseSetting curseSetting4 = this$0.setting;
            if (curseSetting4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
            } else {
                curseSetting = curseSetting4;
            }
            switchButtonSingleLineTextView2.setSwitch(curseSetting.isPredictEnable());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$6(CurseResetActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        curseSetting.enablePredict(z);
        if (CurseManager.INSTANCE.getInstance().supportMenstrualPredict()) {
            CurseSetting curseSetting3 = this$0.setting;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting3 = null;
            }
            curseSetting3.enableAlgoPredict(z);
        }
        CurseSetting curseSetting4 = this$0.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting2 = curseSetting4;
        }
        if (curseSetting2.isFirst()) {
            return;
        }
        ((CurseResetVM) this$0.getMViewModel()).synPredict();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b A[PHI: r3
      0x002b: PHI (r3v7 com.xiaomi.fitness.baseui.dialog.PickerDialog) = (r3v4 com.xiaomi.fitness.baseui.dialog.PickerDialog), (r3v12 com.xiaomi.fitness.baseui.dialog.PickerDialog) binds: [B:24:0x0047, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    private final void selectOption(int type, long curValue) {
        PickerDialog pickerDialog;
        PickerDialog pickerDialog2 = null;
        if (type == 1) {
            if (this.inDaysPicker == null) {
                this.inDaysPicker = generateDayPicker(1);
            }
            PickerDialog pickerDialog3 = this.inDaysPicker;
            if (pickerDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inDaysPicker");
                pickerDialog3 = null;
            }
            pickerDialog3.setValue((int) curValue);
            pickerDialog = this.inDaysPicker;
            if (pickerDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inDaysPicker");
            } else {
                pickerDialog2 = pickerDialog;
            }
        } else if (type != 2) {
            generateDatePicker();
        } else {
            if (this.intervalPicker == null) {
                this.intervalPicker = generateDayPicker(2);
            }
            PickerDialog pickerDialog4 = this.intervalPicker;
            if (pickerDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("intervalPicker");
                pickerDialog4 = null;
            }
            pickerDialog4.setValue((int) curValue);
            pickerDialog = this.intervalPicker;
            if (pickerDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("intervalPicker");
            } else {
                pickerDialog2 = pickerDialog;
            }
        }
        if (pickerDialog2 != null) {
            pickerDialog2.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setValue(long value, int type) {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        if (type == 1) {
            CurseSetItemView curseSetItemView = ((gsb) getMBinding()).A;
            int i = (int) value;
            String quantityString = getResources().getQuantityString(qxi.common_unit_day_desc, i, Long.valueOf(value));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            curseSetItemView.setValue(quantityString);
            curseSetting.setEstimatedMenstrualDays(i);
        } else if (type != 4) {
            CurseSetItemView curseSetItemView2 = ((gsb) getMBinding()).B;
            int i2 = (int) value;
            String quantityString2 = getResources().getQuantityString(qxi.common_unit_day_desc, i2, Long.valueOf(value));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            curseSetItemView2.setValue(quantityString2);
            curseSetting.setMenstrualCycle(i2);
        } else {
            curseSetting.setLastMenstrualTime(value);
            ((gsb) getMBinding()).C.setValue(TimeDateUtil.getDateYYYYMMddLocalFormat(curseSetting.getLastMenstrualTime()));
        }
        if (curseSetting.isFirst()) {
            return;
        }
        ((CurseResetVM) getMViewModel()).syncDeviceConfig();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.S2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    /* JADX INFO: renamed from: isFromReset, reason: from getter */
    public final boolean getIsFromReset() {
        return this.isFromReset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ResourceExtKt.getDimen(this, ili.j);
        ConstraintLayout stateView = ((gsb) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(stateView, "stateView");
        ViewExtKt.setNewPadding$default(stateView, dimen, 0, dimen, 0, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseResetActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(iji.E0);
        this.isFromReset = getIntent().getBooleanExtra(EXTRA_FROM_RESET, false);
        CurseSetting setting = ((CurseResetVM) getMViewModel()).getSetting();
        this.setting = setting;
        CurseSetting curseSetting = null;
        if (!this.isFromReset) {
            if (setting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                setting = null;
            }
            CurseExtKt.correct(setting);
            ((CurseResetVM) getMViewModel()).getFirstConfigObserver().observe(this, new CurseResetActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: na5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CurseResetActivity.onCreate$lambda$0(this.f27704a, (Boolean) obj);
                }
            }));
            Button startView = ((gsb) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(startView, "startView");
            ViewExtKt.visible(startView);
            ((gsb) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: oa5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CurseResetActivity.onCreate$lambda$1(this.f28914a, view);
                }
            });
        }
        if (this.isFromReset) {
            SwitchButtonSingleLineTextView predictView = ((gsb) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(predictView, "predictView");
            ViewExtKt.setVisible(predictView, false);
            setTitle(getString(c0j.Kp));
        } else {
            SwitchButtonSingleLineTextView predictView2 = ((gsb) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(predictView2, "predictView");
            ViewExtKt.setVisible(predictView2, true);
        }
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting2 = null;
        }
        int estimatedMenstrualDays = curseSetting2.getEstimatedMenstrualDays();
        CurseSetItemView curseSetItemView = ((gsb) getMBinding()).A;
        String string = getString(this.isLover ? c0j.m6 : c0j.l6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(c0j.M5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String quantityString = getResources().getQuantityString(qxi.common_unit_day_desc, estimatedMenstrualDays, Integer.valueOf(estimatedMenstrualDays));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        CurseSetItemView.setData$default(curseSetItemView, string, string2, quantityString, false, 8, null);
        ((gsb) getMBinding()).A.addClick(new Function0() { // from class: pa5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseResetActivity.onCreate$lambda$2(this.f30161a);
            }
        });
        CurseSetting curseSetting3 = this.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        int menstrualCycle = curseSetting3.getMenstrualCycle();
        CurseSetItemView curseSetItemView2 = ((gsb) getMBinding()).B;
        String string3 = getString(this.isLover ? c0j.k6 : c0j.j6);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = getString(c0j.Z5);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String quantityString2 = getResources().getQuantityString(qxi.common_unit_day_desc, menstrualCycle, Integer.valueOf(menstrualCycle));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        CurseSetItemView.setData$default(curseSetItemView2, string3, string4, quantityString2, false, 8, null);
        ((gsb) getMBinding()).B.addClick(new Function0() { // from class: qa5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseResetActivity.onCreate$lambda$3(this.f31271a);
            }
        });
        CurseSetting curseSetting4 = this.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting = curseSetting4;
        }
        long lastMenstrualTime = curseSetting.getLastMenstrualTime();
        CurseSetItemView curseSetItemView3 = ((gsb) getMBinding()).C;
        String string5 = getString(this.isLover ? c0j.o6 : c0j.n6);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = getString(c0j.q6);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        CurseSetItemView.setData$default(curseSetItemView3, string5, string6, TimeDateUtil.getDateYYYYMMddLocalFormat(lastMenstrualTime), false, 8, null);
        ((gsb) getMBinding()).C.addClick(new Function0() { // from class: ra5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseResetActivity.onCreate$lambda$4(this.f32351a);
            }
        });
        ((CurseResetVM) getMViewModel()).hasIntelligentCapa().observe(this, new CurseResetActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sa5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseResetActivity.onCreate$lambda$5(this.f33449a, (Boolean) obj);
            }
        }));
        ((gsb) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ta5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                CurseResetActivity.onCreate$lambda$6(this.f34493a, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseResetActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnyExtKt.io$default(null, new C24191(null), 1, null);
    }

    public final void setFromReset(boolean z) {
        this.isFromReset = z;
    }
}
