package com.xiaomi.fitness.health.curse;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseSetActivity;
import com.xiaomi.fitness.health.curse.adapter.CurseDaysAdapter;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.CurseNotifyType;
import com.xiaomi.fitness.health.curse.vm.CurseSetVM;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.iji;
import defpackage.ili;
import defpackage.isb;
import defpackage.jui;
import defpackage.qxi;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010%J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010%J\u0019\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0006J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseSetActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM;", "Lisb;", "", "initNotifyViews", "()V", "", "type", "", "curValue", "selectOption", "(IJ)V", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "generateDayPicker", "(I)Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "value", "setValue", "(JI)V", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "setting", "setViews", "(Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;)V", "requestAlarmPermission", "", "enable", "setCurseNotifyEnable", "(Z)V", "supportNoRemind", "selectDays", "(IIZ)V", "setDeviceView", "setAppView", "days", "", "getRemindText", "(I)Ljava/lang/String;", "(II)V", "onPickerDialogResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "intervalPicker", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "inDaysPicker", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "isLover", "Z", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseSetActivity extends Hilt_CurseSetActivity<CurseSetVM, isb> {
    private PickerDialog inDaysPicker;
    private PickerDialog intervalPicker;
    private boolean isLover = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isMale();
    private CurseSetting setting;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurseNotifyType.values().length];
            try {
                iArr[CurseNotifyType.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurseNotifyType.OVUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseSetActivity$onDestroy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseSetActivity$onDestroy$1", f = "CurseSetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24201(Continuation<? super C24201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24201(continuation);
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
            return ((C24201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
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
        Intrinsics.checkNotNull(pickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.curse.CurseSetActivity.generateDayPicker.1
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

    private final String getRemindText(int days) {
        if (days == 0) {
            String string = getResources().getString(c0j.d6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        return getResources().getString(c0j.f6) + getResources().getQuantityString(qxi.common_unit_day_desc, days, Integer.valueOf(days));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initNotifyViews() {
        TextView curseSettingAppNotifyLabel = ((isb) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLabel, "curseSettingAppNotifyLabel");
        CurseSetting curseSetting = this.setting;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLabel, curseSetting.isPredictEnable());
        LinearLayout curseSettingAppNotifyLayout = ((isb) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLayout, "curseSettingAppNotifyLayout");
        CurseSetting curseSetting3 = this.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLayout, curseSetting3.isPredictEnable());
        TextView curseSettingDeviceNotifyLabel = ((isb) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLabel, "curseSettingDeviceNotifyLabel");
        CurseSetting curseSetting4 = this.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting4 = null;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLabel, curseSetting4.isPredictEnable());
        LinearLayout curseSettingDeviceNotifyLayout = ((isb) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLayout, "curseSettingDeviceNotifyLayout");
        CurseSetting curseSetting5 = this.setting;
        if (curseSetting5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting2 = curseSetting5;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLayout, curseSetting2.isPredictEnable());
        ((CurseSetVM) getMViewModel()).getConfig(new Function2() { // from class: db5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CurseSetActivity.initNotifyViews$lambda$4(this.f15335a, ((Boolean) obj).booleanValue(), (CurseSetting) obj2);
            }
        });
        ((CurseSetVM) getMViewModel()).getDeviceObserver().observe(this, new CurseSetActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: eb5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSetActivity.initNotifyViews$lambda$5(this.f16456a, (CurseSetVM.DeviceRet) obj);
            }
        }));
        ((CurseSetVM) getMViewModel()).getDeviceItemObserver().observe(this, new CurseSetActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fb5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSetActivity.initNotifyViews$lambda$6(this.f17622a, (CurseSetVM.DeviceDaysRet) obj);
            }
        }));
        final boolean deviceSupportNotifySingleNoRemind = ((CurseSetVM) getMViewModel()).getDeviceSupportNotifySingleNoRemind();
        ((isb) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: gb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$7(this.f18795a, view);
            }
        });
        ((isb) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: hb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$8(this.f19898a, view);
            }
        });
        ((isb) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ib5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$9(this.f20963a, view);
            }
        });
        ((isb) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: jb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$10(this.f22608a, deviceSupportNotifySingleNoRemind, view);
            }
        });
        ((isb) getMBinding()).R.setOnClickListener(new View.OnClickListener() { // from class: kb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$11(this.f23674a, deviceSupportNotifySingleNoRemind, view);
            }
        });
        ((isb) getMBinding()).P.setOnClickListener(new View.OnClickListener() { // from class: lb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.initNotifyViews$lambda$12(this.f24850a, deviceSupportNotifySingleNoRemind, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$10(CurseSetActivity this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(4, curseSetting.getHardwareBeforeMenstruationPush(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$11(CurseSetActivity this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(5, curseSetting.getHardwareBeforeOvulationPush(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$12(CurseSetActivity this$0, boolean z, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(6, curseSetting.getHardwareBeforePregnancyPush(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initNotifyViews$lambda$4(CurseSetActivity this$0, boolean z, CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (z) {
            Intrinsics.checkNotNull(curseSetting);
            this$0.setViews(curseSetting);
        } else {
            ToastExtKt.toastShort(this$0, c0j.common_hint_unkonwn_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initNotifyViews$lambda$5(CurseSetActivity this$0, CurseSetVM.DeviceRet deviceRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (deviceRet.getSuccess()) {
            this$0.setDeviceView(deviceRet.getEnable());
            CurseSetting curseSetting = this$0.setting;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException("setting");
                curseSetting = null;
            }
            curseSetting.setHardwarePush(deviceRet.getEnable());
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_set_error);
            this$0.setDeviceView(!deviceRet.getEnable());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initNotifyViews$lambda$6(CurseSetActivity this$0, CurseSetVM.DeviceDaysRet deviceDaysRet) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (deviceDaysRet.getSuccess()) {
            int days = deviceDaysRet.getDays();
            int i2 = WhenMappings.$EnumSwitchMapping$0[deviceDaysRet.getType().ordinal()];
            if (i2 != 1) {
                i = i2 != 2 ? 6 : 5;
            } else {
                i = 4;
            }
            this$0.setValue(days, i);
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$7(CurseSetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(1, curseSetting.getAppBeforeMenstruationPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$8(CurseSetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(2, curseSetting.getAppBeforeOvulationPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNotifyViews$lambda$9(CurseSetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectDays(3, curseSetting.getAppBeforePregnancyPush(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(CurseSetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectOption(1, curseSetting.getEstimatedMenstrualDays());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(CurseSetActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        this$0.selectOption(2, curseSetting.getMenstrualCycle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$2(CurseSetActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        curseSetting.enablePredict(z);
        CurseSetting curseSetting3 = this$0.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        curseSetting3.enableAlgoPredict(false);
        ((isb) this$0.getMBinding()).A.setSwitch(false);
        CurseSetting curseSetting4 = this$0.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting4 = null;
        }
        if (!curseSetting4.isFirst()) {
            ((CurseSetVM) this$0.getMViewModel()).synPredict();
        }
        TextView curseSettingAppNotifyLabel = ((isb) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLabel, "curseSettingAppNotifyLabel");
        CurseSetting curseSetting5 = this$0.setting;
        if (curseSetting5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting5 = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLabel, curseSetting5.isPredictEnable());
        LinearLayout curseSettingAppNotifyLayout = ((isb) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLayout, "curseSettingAppNotifyLayout");
        CurseSetting curseSetting6 = this$0.setting;
        if (curseSetting6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting6 = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLayout, curseSetting6.isPredictEnable());
        TextView curseSettingDeviceNotifyLabel = ((isb) this$0.getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLabel, "curseSettingDeviceNotifyLabel");
        CurseSetting curseSetting7 = this$0.setting;
        if (curseSetting7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting7 = null;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLabel, curseSetting7.isPredictEnable());
        LinearLayout curseSettingDeviceNotifyLayout = ((isb) this$0.getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLayout, "curseSettingDeviceNotifyLayout");
        CurseSetting curseSetting8 = this$0.setting;
        if (curseSetting8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting2 = curseSetting8;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLayout, curseSetting2.isPredictEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$3(CurseSetActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CurseSetting curseSetting = this$0.setting;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        curseSetting.enableAlgoPredict(z);
        CurseSetting curseSetting3 = this$0.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        curseSetting3.enablePredict(z || ((isb) this$0.getMBinding()).T.getSwitch());
        ((isb) this$0.getMBinding()).T.setSwitch(false);
        CurseSetting curseSetting4 = this$0.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting4 = null;
        }
        if (!curseSetting4.isFirst()) {
            ((CurseSetVM) this$0.getMViewModel()).synPredict();
        }
        TextView curseSettingAppNotifyLabel = ((isb) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLabel, "curseSettingAppNotifyLabel");
        CurseSetting curseSetting5 = this$0.setting;
        if (curseSetting5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting5 = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLabel, curseSetting5.isPredictEnable());
        LinearLayout curseSettingAppNotifyLayout = ((isb) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(curseSettingAppNotifyLayout, "curseSettingAppNotifyLayout");
        CurseSetting curseSetting6 = this$0.setting;
        if (curseSetting6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting6 = null;
        }
        ViewExtKt.setVisible(curseSettingAppNotifyLayout, curseSetting6.isPredictEnable());
        TextView curseSettingDeviceNotifyLabel = ((isb) this$0.getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLabel, "curseSettingDeviceNotifyLabel");
        CurseSetting curseSetting7 = this$0.setting;
        if (curseSetting7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting7 = null;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLabel, curseSetting7.isPredictEnable());
        LinearLayout curseSettingDeviceNotifyLayout = ((isb) this$0.getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(curseSettingDeviceNotifyLayout, "curseSettingDeviceNotifyLayout");
        CurseSetting curseSetting8 = this$0.setting;
        if (curseSetting8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting2 = curseSetting8;
        }
        ViewExtKt.setVisible(curseSettingDeviceNotifyLayout, curseSetting2.isPredictEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onPickerDialogResult(int value, int type) {
        Logger.i("CurseSetActivity", "onPickerDialogResult type:" + type + ";value " + value);
        switch (type) {
            case 1:
            case 2:
            case 3:
                setValue(value, type);
                ((CurseSetVM) getMViewModel()).setAppConfig();
                break;
            case 4:
                ((CurseSetVM) getMViewModel()).setDeviceItemNotify(CurseNotifyType.IN, value);
                break;
            case 5:
                ((CurseSetVM) getMViewModel()).setDeviceItemNotify(CurseNotifyType.OVUM, value);
                break;
            case 6:
                ((CurseSetVM) getMViewModel()).setDeviceItemNotify(CurseNotifyType.EASY_PREGNANCY, value);
                break;
        }
    }

    private final void requestAlarmPermission() {
        NotificationPermission.requestAlarmPermissionIfNeed$default(NotificationPermission.INSTANCE, this, c0j.s6, false, new Function1() { // from class: ob5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSetActivity.requestAlarmPermission$lambda$20(this.f28952a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestAlarmPermission$lambda$20(CurseSetActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("CurseSetActivity", "requestAlarmPermission result " + z);
        if (z) {
            ((isb) this$0.getMBinding()).E.setSwitch(true);
        }
        this$0.setCurseNotifyEnable(z);
        return Unit.INSTANCE;
    }

    private final void selectDays(final int type, final int curValue, final boolean supportNoRemind) {
        final CustomDisplayPickerDialog customDisplayPickerDialogCreate = new CustomDisplayPickerDialog.Builder("select_day").setCanceledOnTouchOutside(true).setCancelable(true).setDialogTitle(c0j.E5).setPositiveText(c0j.e).setNegativeText(c0j.c).create();
        Logger.d("CurseSetActivity", "selectDays " + type + " " + curValue);
        customDisplayPickerDialogCreate.setValue(curValue);
        customDisplayPickerDialogCreate.setCustomAdapter(new CustomDisplayPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.health.curse.CurseSetActivity.selectDays.1
            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return supportNoRemind ? 6 : 5;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                if (!supportNoRemind || index != 0) {
                    return String.valueOf(getValue(index));
                }
                String string = this.getString(c0j.d6);
                return string == null ? "" : string;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter
            public String getHintTest(int index) {
                if (supportNoRemind && index == 0) {
                    return "";
                }
                String quantityString = this.getResources().getQuantityString(qxi.B, 1, 1);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return quantityString;
            }

            @Override // com.xiaomi.fitness.baseui.dialog.CustomDisplayPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return supportNoRemind ? index : index + 1;
            }
        });
        customDisplayPickerDialogCreate.setPickerHintText(getResources().getQuantityString(qxi.B, 1, 1));
        customDisplayPickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.curse.CurseSetActivity.selectDays.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface _dialog, int which) {
                super.onDialogClick(dialogName, _dialog, which);
                if (_dialog != null) {
                    _dialog.dismiss();
                }
                if (which != -1 || curValue == customDisplayPickerDialogCreate.getValue()) {
                    return;
                }
                this.onPickerDialogResult(customDisplayPickerDialogCreate.getValue(), type);
            }
        });
        customDisplayPickerDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028 A[PHI: r3
      0x0028: PHI (r3v8 com.xiaomi.fitness.baseui.dialog.PickerDialog) = (r3v4 com.xiaomi.fitness.baseui.dialog.PickerDialog), (r3v12 com.xiaomi.fitness.baseui.dialog.PickerDialog) binds: [B:24:0x0044, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
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
        } else if (type == 2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAppView(boolean enable) {
        ((isb) getMBinding()).C.setEnable(enable);
        ((isb) getMBinding()).D.setEnable(enable);
        ((isb) getMBinding()).B.setEnable(enable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCurseNotifyEnable(boolean enable) {
        CurseSetting curseSetting = this.setting;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting = null;
        }
        curseSetting.setAppPush(enable);
        ((CurseSetVM) getMViewModel()).setAppConfig();
        setAppView(enable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDeviceView(boolean enable) {
        ((isb) getMBinding()).S.setSwitch(enable);
        ((isb) getMBinding()).Q.setEnable(enable);
        ((isb) getMBinding()).R.setEnable(enable);
        ((isb) getMBinding()).P.setEnable(enable);
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
            int i = (int) value;
            ((isb) getMBinding()).M.setRemindText(getResources().getQuantityString(qxi.common_unit_day_desc, i, Long.valueOf(value)));
            curseSetting.setEstimatedMenstrualDays(i);
        } else {
            int i2 = (int) value;
            ((isb) getMBinding()).H.setRemindText(getResources().getQuantityString(qxi.common_unit_day_desc, i2, Long.valueOf(value)));
            curseSetting.setMenstrualCycle(i2);
        }
        if (curseSetting.isFirst()) {
            return;
        }
        ((CurseSetVM) getMViewModel()).syncDeviceConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViews(final CurseSetting setting) {
        ((CurseSetVM) getMViewModel()).setConfigRef(setting);
        this.setting = setting;
        boolean z = false;
        if (!setting.isPredictEnable()) {
            ((isb) getMBinding()).C.setEnable(false);
            ((isb) getMBinding()).D.setEnable(false);
            ((isb) getMBinding()).B.setEnable(false);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i("CurseSetActivity", "predictEnable " + setting.isPredictEnable() + ";currentDeviceModel " + wearableDeviceModel + " supportCurse " + (wearableDeviceModel != null ? Boolean.valueOf(CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) : null));
        if (!setting.isPredictEnable() || wearableDeviceModel == null || !CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
            ((isb) getMBinding()).Q.setEnable(false);
            ((isb) getMBinding()).R.setEnable(false);
            ((isb) getMBinding()).P.setEnable(false);
        }
        boolean deviceSupportEasyPregnancy = ((CurseSetVM) getMViewModel()).getDeviceSupportEasyPregnancy();
        if (!setting.isPredictEnable() || !deviceSupportEasyPregnancy) {
            RightArrowSingleLineTextView deviceEasyPregnancyView = ((isb) getMBinding()).P;
            Intrinsics.checkNotNullExpressionValue(deviceEasyPregnancyView, "deviceEasyPregnancyView");
            ViewExtKt.setVisible(deviceEasyPregnancyView, false);
        }
        if (setting.isAppPush() && AlarmManagerExtKt.canScheduleExactAlarms(this)) {
            z = true;
        }
        ((isb) getMBinding()).E.setSwitch(z);
        ((isb) getMBinding()).C.setRemindText(getRemindText(setting.getAppBeforeMenstruationPush()));
        ((isb) getMBinding()).D.setRemindText(getRemindText(setting.getAppBeforeOvulationPush()));
        ((isb) getMBinding()).B.setRemindText(getRemindText(setting.getAppBeforePregnancyPush()));
        ((isb) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ub5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z2, ISwitchButton iSwitchButton) {
                CurseSetActivity.setViews$lambda$18(this.f35588a, z2, iSwitchButton);
            }
        });
        RightArrowSingleLineTextView appInView = ((isb) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(appInView, "appInView");
        ViewExtKt.setVisible(appInView, ((isb) getMBinding()).E.getSwitch());
        RightArrowSingleLineTextView appOvumView = ((isb) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(appOvumView, "appOvumView");
        ViewExtKt.setVisible(appOvumView, ((isb) getMBinding()).E.getSwitch());
        RightArrowSingleLineTextView appEasyPregnancyView = ((isb) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(appEasyPregnancyView, "appEasyPregnancyView");
        ViewExtKt.setVisible(appEasyPregnancyView, ((isb) getMBinding()).E.getSwitch());
        setAppView(z);
        ((isb) getMBinding()).Q.setRemindText(getRemindText(setting.getHardwareBeforeMenstruationPush()));
        ((isb) getMBinding()).R.setRemindText(getRemindText(setting.getHardwareBeforeOvulationPush()));
        ((isb) getMBinding()).P.setRemindText(getRemindText(setting.getHardwareBeforePregnancyPush()));
        ((isb) getMBinding()).S.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: vb5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z2, ISwitchButton iSwitchButton) {
                CurseSetActivity.setViews$lambda$19(this.f36705a, setting, z2, iSwitchButton);
            }
        });
        setDeviceView(setting.isHardwarePush());
        RightArrowSingleLineTextView deviceInView = ((isb) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(deviceInView, "deviceInView");
        ViewExtKt.setVisible(deviceInView, ((isb) getMBinding()).S.getSwitch());
        RightArrowSingleLineTextView deviceOvumView = ((isb) getMBinding()).R;
        Intrinsics.checkNotNullExpressionValue(deviceOvumView, "deviceOvumView");
        ViewExtKt.setVisible(deviceOvumView, ((isb) getMBinding()).S.getSwitch());
        RightArrowSingleLineTextView deviceEasyPregnancyView2 = ((isb) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(deviceEasyPregnancyView2, "deviceEasyPregnancyView");
        ViewExtKt.setVisible(deviceEasyPregnancyView2, ((isb) getMBinding()).S.getSwitch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$18(final CurseSetActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RightArrowSingleLineTextView appInView = ((isb) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(appInView, "appInView");
        ViewExtKt.setVisible(appInView, z);
        RightArrowSingleLineTextView appOvumView = ((isb) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(appOvumView, "appOvumView");
        ViewExtKt.setVisible(appOvumView, z);
        RightArrowSingleLineTextView appEasyPregnancyView = ((isb) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(appEasyPregnancyView, "appEasyPregnancyView");
        ViewExtKt.setVisible(appEasyPregnancyView, z);
        if (!z) {
            this$0.setCurseNotifyEnable(false);
            return;
        }
        this$0.setAppView(false);
        ((isb) this$0.getMBinding()).E.setSwitch(false);
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        boolean zPostNotificationPermissionGranted = notificationPermission.postNotificationPermissionGranted(this$0);
        boolean zCanScheduleExactAlarms = AlarmManagerExtKt.canScheduleExactAlarms(this$0);
        if (zPostNotificationPermissionGranted && zCanScheduleExactAlarms) {
            ((isb) this$0.getMBinding()).E.setSwitch(true);
            this$0.setCurseNotifyEnable(true);
            return;
        }
        final Function0 function0 = new Function0() { // from class: cb5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseSetActivity.setViews$lambda$18$lambda$16(this.f5153a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        String string = this$0.getString(c0j.D6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, this$0, string, 1, false, new Function1() { // from class: nb5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSetActivity.setViews$lambda$18$lambda$17(function0, this$0, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(this$0.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$18$lambda$16(final CurseSetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        String string = this$0.getString(c0j.D6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationPermission.requestPostNotificationPermissionIfNeed$default(notificationPermission, this$0, string, false, new Function1() { // from class: pb5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSetActivity.setViews$lambda$18$lambda$16$lambda$15(this.f30189a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$18$lambda$16$lambda$15(CurseSetActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            this$0.setCurseNotifyEnable(false);
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), "android.permission.POST_NOTIFICATIONS", this$0, null, null, null, new Function0() { // from class: mb5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurseSetActivity.setViews$lambda$18$lambda$16$lambda$15$lambda$14();
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$18$lambda$16$lambda$15$lambda$14() {
        NotificationPermission.INSTANCE.goNotifySettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$18$lambda$17(Function0 requestPermission, CurseSetActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            requestPermission.invoke();
        } else {
            this$0.setCurseNotifyEnable(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$19(CurseSetActivity this$0, CurseSetting setting, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(setting, "$setting");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.INSTANCE.showToast(c0j.f4801r);
            ((isb) this$0.getMBinding()).S.setSwitch(!z);
            return;
        }
        ((CurseSetVM) this$0.getMViewModel()).setDeviceNotifyEnable(z, setting.getHardwareBeforeMenstruationPush(), setting.getHardwareBeforeOvulationPush(), setting.getHardwareBeforePregnancyPush());
        RightArrowSingleLineTextView deviceInView = ((isb) this$0.getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(deviceInView, "deviceInView");
        ViewExtKt.setVisible(deviceInView, z);
        RightArrowSingleLineTextView deviceOvumView = ((isb) this$0.getMBinding()).R;
        Intrinsics.checkNotNullExpressionValue(deviceOvumView, "deviceOvumView");
        ViewExtKt.setVisible(deviceOvumView, z);
        RightArrowSingleLineTextView deviceEasyPregnancyView = ((isb) this$0.getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(deviceEasyPregnancyView, "deviceEasyPregnancyView");
        ViewExtKt.setVisible(deviceEasyPregnancyView, z);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.T2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ResourceExtKt.getDimen(this, ili.j);
        ConstraintLayout stateView = ((isb) getMBinding()).V;
        Intrinsics.checkNotNullExpressionValue(stateView, "stateView");
        ViewExtKt.setNewPadding$default(stateView, dimen, 0, dimen, 0, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseSetActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(iji.E0);
        CurseSetting setting = ((CurseSetVM) getMViewModel()).getSetting();
        this.setting = setting;
        CurseSetting curseSetting = null;
        if (setting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            setting = null;
        }
        int estimatedMenstrualDays = setting.getEstimatedMenstrualDays();
        ((isb) getMBinding()).M.setSubtitle(getString(this.isLover ? c0j.m6 : c0j.l6));
        ((isb) getMBinding()).M.setTitle(getString(c0j.M5));
        ((isb) getMBinding()).M.setRemindText(getResources().getQuantityString(qxi.common_unit_day_desc, estimatedMenstrualDays, Integer.valueOf(estimatedMenstrualDays)));
        ((isb) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: qb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.onCreate$lambda$0(this.f31307a, view);
            }
        });
        CurseSetting curseSetting2 = this.setting;
        if (curseSetting2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting2 = null;
        }
        int menstrualCycle = curseSetting2.getMenstrualCycle();
        ((isb) getMBinding()).H.setSubtitle(getString(this.isLover ? c0j.k6 : c0j.j6));
        ((isb) getMBinding()).H.setTitle(getString(c0j.a6));
        ((isb) getMBinding()).H.setRemindText(getResources().getQuantityString(qxi.common_unit_day_desc, menstrualCycle, Integer.valueOf(menstrualCycle)));
        ((isb) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: rb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseSetActivity.onCreate$lambda$1(this.f32370a, view);
            }
        });
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView = ((isb) getMBinding()).T;
        CurseSetting curseSetting3 = this.setting;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
            curseSetting3 = null;
        }
        switchButtonSingleLineTextView.setSwitch(CurseExtKt.isCalendarPrediction(curseSetting3));
        ((isb) getMBinding()).T.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: sb5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                CurseSetActivity.onCreate$lambda$2(this.f33475a, z, iSwitchButton);
            }
        });
        SwitchButtonSingleLineTextView algoPredictView = ((isb) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(algoPredictView, "algoPredictView");
        ViewExtKt.setVisible(algoPredictView, CurseManager.INSTANCE.getInstance().supportMenstrualPredict());
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = ((isb) getMBinding()).A;
        CurseSetting curseSetting4 = this.setting;
        if (curseSetting4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setting");
        } else {
            curseSetting = curseSetting4;
        }
        switchButtonSingleLineTextView2.setSwitch(curseSetting.isAlgoPredictEnable());
        ((isb) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: tb5
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                CurseSetActivity.onCreate$lambda$3(this.f34532a, z, iSwitchButton);
            }
        });
        initNotifyViews();
    }

    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseSetActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnyExtKt.io$default(null, new C24201(null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setValue(int value, int type) {
        Logger.i("CurseSetActivity", "set type " + type + ";value " + value);
        String remindText = getRemindText(value);
        CurseSetting curseSetting = null;
        switch (type) {
            case 1:
                CurseSetting curseSetting2 = this.setting;
                if (curseSetting2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting2;
                }
                curseSetting.setAppBeforeMenstruationPush(value);
                ((isb) getMBinding()).C.setRemindText(remindText);
                break;
            case 2:
                CurseSetting curseSetting3 = this.setting;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting3;
                }
                curseSetting.setAppBeforeOvulationPush(value);
                ((isb) getMBinding()).D.setRemindText(remindText);
                break;
            case 3:
                CurseSetting curseSetting4 = this.setting;
                if (curseSetting4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting4;
                }
                curseSetting.setAppBeforePregnancyPush(value);
                ((isb) getMBinding()).B.setRemindText(remindText);
                break;
            case 4:
                CurseSetting curseSetting5 = this.setting;
                if (curseSetting5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting5;
                }
                curseSetting.setHardwareBeforeMenstruationPush(value);
                ((isb) getMBinding()).Q.setRemindText(remindText);
                break;
            case 5:
                CurseSetting curseSetting6 = this.setting;
                if (curseSetting6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting6;
                }
                curseSetting.setHardwareBeforeOvulationPush(value);
                ((isb) getMBinding()).R.setRemindText(remindText);
                break;
            case 6:
                CurseSetting curseSetting7 = this.setting;
                if (curseSetting7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("setting");
                } else {
                    curseSetting = curseSetting7;
                }
                curseSetting.setHardwareBeforePregnancyPush(value);
                ((isb) getMBinding()).P.setRemindText(remindText);
                break;
        }
    }
}
