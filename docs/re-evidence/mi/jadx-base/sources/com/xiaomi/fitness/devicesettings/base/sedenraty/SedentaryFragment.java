package com.xiaomi.fitness.devicesettings.base.sedenraty;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.gi6;
import defpackage.st9;
import defpackage.t64;
import defpackage.vzi;
import defpackage.wzi;
import defpackage.xc6;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004:\u00011B\u0007¢\u0006\u0004\b0\u0010\u001dJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\fJ!\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0014¢\u0006\u0004\b&\u0010\u001dJ\u0019\u0010'\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010\u001bJ\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010\u001dJ\u000f\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010\u001dR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/sedenraty/Sedentary2ViewModel;", "Lgi6;", "Landroidx/lifecycle/Observer;", "Lst9;", "", "checkDeviceConnected", "()Z", "isStart", "", "selectTime", "(Z)V", "selectBreakTime", "", "hour", "minute", "updateTimeView", "(ZII)V", "updateBreakTimeView", "open", "isSedentaryOpen", "updateBreakModeView", "(ZLjava/lang/Boolean;)V", "updateModeView", "info", "setInfo", "(Lst9;)V", "reqInfo", "()V", Constants.KEY_PAY_RESULT_RET, "opSyncRet", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "onChanged", "onVisible", "onInvisible", "", "mSedentaryFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SedentaryFragment extends Hilt_SedentaryFragment<Sedentary2ViewModel, gi6> implements Observer<st9> {

    @NotNull
    public static final String TAG = "SedentaryFragment";
    private long mSedentaryFragmentVisibleTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, SedentaryFragment.class, "opSyncRet", "opSyncRet(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((SedentaryFragment) this.receiver).opSyncRet(z);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment$selectBreakTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryFragment$selectBreakTime$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C20131 extends av6 {
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ TimePickerDialog $timePickerDialog;

        public C20131(boolean z, TimePickerDialog timePickerDialog) {
            this.$isStart = z;
            this.$timePickerDialog = timePickerDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(SedentaryFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismissDialogForce();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                SedentaryFragment sedentaryFragment = SedentaryFragment.this;
                String string = sedentaryFragment.getString(wzi.Qa);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sedentaryFragment.showLoading(string, 0, true);
                Sedentary2ViewModel sedentary2ViewModelAccess$getMViewModel = SedentaryFragment.access$getMViewModel(SedentaryFragment.this);
                boolean z = this.$isStart;
                int currentHour = this.$timePickerDialog.getCurrentHour();
                int currentMinute = this.$timePickerDialog.getCurrentMinute();
                final SedentaryFragment sedentaryFragment2 = SedentaryFragment.this;
                sedentary2ViewModelAccess$getMViewModel.updateBreakTimeValue(z, currentHour, currentMinute, new Function0() { // from class: wql
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SedentaryFragment.C20131.onDialogClick$lambda$0(sedentaryFragment2);
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment$selectTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/base/sedenraty/SedentaryFragment$selectTime$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C20141 extends av6 {
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ TimePickerDialog $timePickerDialog;

        public C20141(boolean z, TimePickerDialog timePickerDialog) {
            this.$isStart = z;
            this.$timePickerDialog = timePickerDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(SedentaryFragment this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismissDialogForce();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                SedentaryFragment sedentaryFragment = SedentaryFragment.this;
                String string = sedentaryFragment.getString(wzi.Qa);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sedentaryFragment.showLoading(string, 0, true);
                Sedentary2ViewModel sedentary2ViewModelAccess$getMViewModel = SedentaryFragment.access$getMViewModel(SedentaryFragment.this);
                boolean z = this.$isStart;
                int currentHour = this.$timePickerDialog.getCurrentHour();
                int currentMinute = this.$timePickerDialog.getCurrentMinute();
                final SedentaryFragment sedentaryFragment2 = SedentaryFragment.this;
                sedentary2ViewModelAccess$getMViewModel.updateTimeValue(z, currentHour, currentMinute, new Function0() { // from class: xql
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SedentaryFragment.C20141.onDialogClick$lambda$0(sedentaryFragment2);
                    }
                });
            }
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ Sedentary2ViewModel access$getMViewModel(SedentaryFragment sedentaryFragment) {
        return (Sedentary2ViewModel) sedentaryFragment.getMViewModel();
    }

    private final boolean checkDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        boolean zIsDeviceConnected = wearableDeviceModel != null ? wearableDeviceModel.isDeviceConnected() : false;
        if (!zIsDeviceConnected) {
            ToastExtKt.toastShort(AppUtil.getApp(), vzi.f37396b);
        }
        return zIsDeviceConnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void opSyncRet(boolean ret) {
        if (!ret) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
                return;
            }
            return;
        }
        ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().onSyncSuccess();
        updateModeView(((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMMode());
        updateBreakModeView(((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMSiesta(), Boolean.valueOf(((gi6) getMBinding()).F.getSwitch()));
        updateTimeView(true, ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMStartHour(), ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMStartMin());
        updateTimeView(false, ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMEndHour(), ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMEndMin());
        if (!((Sedentary2ViewModel) getMViewModel()).getIsSupportBreakTime()) {
            RightArrowTwoLineTextView breakStartView = ((gi6) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(breakStartView, "breakStartView");
            ViewExtKt.gone(breakStartView);
            RightArrowTwoLineTextView breakEndView = ((gi6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(breakEndView, "breakEndView");
            ViewExtKt.gone(breakEndView);
            ((gi6) getMBinding()).D.setSubtitle(getString(wzi.a7));
            return;
        }
        RightArrowTwoLineTextView breakStartView2 = ((gi6) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(breakStartView2, "breakStartView");
        ViewExtKt.visible(breakStartView2);
        RightArrowTwoLineTextView breakEndView2 = ((gi6) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(breakEndView2, "breakEndView");
        ViewExtKt.visible(breakEndView2);
        updateBreakTimeView(true, ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMBreakStartHour(), ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMBreakStartMin());
        updateBreakTimeView(false, ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMBreakEndHour(), ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel().getMBreakEndMin());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void reqInfo() {
        if (checkDeviceConnected()) {
            ((Sedentary2ViewModel) getMViewModel()).getSedentaryInfo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectBreakTime(boolean isStart) {
        TimePickerDialog is24HourView = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.L5 : wzi.K5).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true);
        SedentaryModel sedentaryModel = ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel();
        TimePickerDialog currentHour = is24HourView.setCurrentHour(isStart ? sedentaryModel.getMBreakStartHour() : sedentaryModel.getMBreakEndHour());
        SedentaryModel sedentaryModel2 = ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel();
        TimePickerDialog currentMinute = currentHour.setCurrentMinute(isStart ? sedentaryModel2.getMBreakStartMin() : sedentaryModel2.getMBreakEndMin());
        currentMinute.addDialogCallback(new C20131(isStart, currentMinute));
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectTime(boolean isStart) {
        TimePickerDialog is24HourView = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.Ia : wzi.Ha).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true);
        SedentaryModel sedentaryModel = ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel();
        TimePickerDialog currentHour = is24HourView.setCurrentHour(isStart ? sedentaryModel.getMStartHour() : sedentaryModel.getMEndHour());
        SedentaryModel sedentaryModel2 = ((Sedentary2ViewModel) getMViewModel()).getSedentaryModel();
        TimePickerDialog currentMinute = currentHour.setCurrentMinute(isStart ? sedentaryModel2.getMStartMin() : sedentaryModel2.getMEndMin());
        currentMinute.addDialogCallback(new C20141(isStart, currentMinute));
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setInfo(st9 info) {
        Logger.i(TAG, "Ble sedentary = " + info);
        ((Sedentary2ViewModel) getMViewModel()).setInfo(info);
        t64 t64Var = info.d;
        if (t64Var != null) {
            updateTimeView(true, t64Var.c, t64Var.d);
        }
        t64 t64Var2 = info.e;
        if (t64Var2 != null) {
            updateTimeView(false, t64Var2.c, t64Var2.d);
        }
        if (info.g == null || info.h == null) {
            ((Sedentary2ViewModel) getMViewModel()).setSupportBreakTime(false);
        }
        if (((Sedentary2ViewModel) getMViewModel()).getIsSupportBreakTime()) {
            RightArrowTwoLineTextView breakStartView = ((gi6) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(breakStartView, "breakStartView");
            ViewExtKt.visible(breakStartView);
            RightArrowTwoLineTextView breakEndView = ((gi6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(breakEndView, "breakEndView");
            ViewExtKt.visible(breakEndView);
            t64 t64Var3 = info.g;
            if (t64Var3 != null) {
                updateBreakTimeView(true, t64Var3.c, t64Var3.d);
            }
            t64 t64Var4 = info.h;
            if (t64Var4 != null) {
                updateBreakTimeView(false, t64Var4.c, t64Var4.d);
            }
        } else {
            RightArrowTwoLineTextView breakStartView2 = ((gi6) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(breakStartView2, "breakStartView");
            ViewExtKt.gone(breakStartView2);
            RightArrowTwoLineTextView breakEndView2 = ((gi6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(breakEndView2, "breakEndView");
            ViewExtKt.gone(breakEndView2);
            ((gi6) getMBinding()).D.setSubtitle(getString(wzi.a7));
        }
        if (info.i != 0) {
            ((gi6) getMBinding()).G.setVisibility(0);
            ((gi6) getMBinding()).G.setSwitch(info.i == 1);
        }
        updateModeView(info.c);
        updateBreakModeView(info.f, Boolean.valueOf(info.c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$0(SedentaryFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("SedentaryFragment stateView isChecked:" + z);
        if (!this$0.checkDeviceConnected()) {
            xc6.d("SedentaryFragment stateView not connection");
            iSwitchButton.setChecked(!z);
        } else {
            ((Sedentary2ViewModel) this$0.getMViewModel()).getSedentaryModel().setMModeCal(z);
            ((Sedentary2ViewModel) this$0.getMViewModel()).getSedentaryModel().setMSiestaCal(z);
            ((Sedentary2ViewModel) this$0.getMViewModel()).syncInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$1(SedentaryFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.checkDeviceConnected()) {
            iSwitchButton.setChecked(!z);
        } else {
            ((Sedentary2ViewModel) this$0.getMViewModel()).getSedentaryModel().setMSiestaCal(z);
            ((Sedentary2ViewModel) this$0.getMViewModel()).syncInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$2(SedentaryFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.checkDeviceConnected()) {
            iSwitchButton.setChecked(!z);
        } else {
            ((Sedentary2ViewModel) this$0.getMViewModel()).getSedentaryModel().setMStretch(z ? 1 : 2);
            ((Sedentary2ViewModel) this$0.getMViewModel()).syncInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(SedentaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.selectTime(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(SedentaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.selectTime(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(SedentaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.selectBreakTime(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(SedentaryFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.selectBreakTime(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBreakModeView(boolean open, Boolean isSedentaryOpen) {
        boolean z = false;
        if (Intrinsics.areEqual(isSedentaryOpen, Boolean.FALSE)) {
            ((gi6) getMBinding()).D.setSwitch(false);
        } else {
            ((gi6) getMBinding()).D.setSwitch(open);
        }
        ((gi6) getMBinding()).B.setEnable(open && Intrinsics.areEqual(isSedentaryOpen, Boolean.TRUE));
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((gi6) getMBinding()).A;
        if (open && Intrinsics.areEqual(isSedentaryOpen, Boolean.TRUE)) {
            z = true;
        }
        rightArrowTwoLineTextView.setEnable(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateBreakTimeView(boolean isStart, int hour, int minute) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hour), Integer.valueOf(minute)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (isStart) {
            ((gi6) getMBinding()).B.setRemindText(str);
        } else {
            ((gi6) getMBinding()).A.setRemindText(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateModeView(boolean open) {
        ((gi6) getMBinding()).F.setSwitch(open);
        ((gi6) getMBinding()).E.setEnable(open);
        ((gi6) getMBinding()).C.setEnable(open);
        ((gi6) getMBinding()).D.setEnable(open);
        ((gi6) getMBinding()).G.setEnable(open);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"DefaultLocale"})
    private final void updateTimeView(boolean isStart, int hour, int minute) {
        String hHmmLocalFormat = TimeDateUtil.getHHmmLocalFormat(TimeDateUtil.INSTANCE.getCurrentInitTime() + ((long) ((hour * 3600) + (minute * 60))));
        if (isStart) {
            ((gi6) getMBinding()).E.setRemindText(hHmmLocalFormat);
        } else {
            ((gi6) getMBinding()).C.setRemindText(hHmmLocalFormat);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.w0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mSedentaryFragmentVisibleTime = 0L;
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mSedentaryFragmentVisibleTime) / ((long) 1000);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "stand_reminder_detail_page";
        objArr[2] = "title";
        objArr[3] = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER) ? getString(wzi.a8) : getString(wzi.Z6);
        objArr[4] = "duration_sec";
        objArr[5] = Long.valueOf(jCurrentTimeMillis);
        objArr[6] = "device_model";
        objArr[7] = DeviceModelExtKt.getModel(wearableDeviceModel);
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
                return;
            }
            return;
        }
        if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.STAND_REMINDER)) {
            setTitle(wzi.a8);
            ((gi6) getMBinding()).F.setTitle(wzi.Z7);
        } else {
            setTitle(wzi.Z6);
            ((gi6) getMBinding()).F.setTitle(wzi.b7);
        }
        ((Sedentary2ViewModel) getMViewModel()).getMInfoData().observe(getViewLifecycleOwner(), this);
        ((Sedentary2ViewModel) getMViewModel()).getMResultData().observe(getViewLifecycleOwner(), new SedentaryFragment$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this)));
        reqInfo();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mSedentaryFragmentVisibleTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((gi6) getMBinding()).F.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: pql
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SedentaryFragment.setListener$lambda$0(this.f30651a, z, iSwitchButton);
            }
        });
        ((gi6) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: qql
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SedentaryFragment.setListener$lambda$1(this.f31752a, z, iSwitchButton);
            }
        });
        ((gi6) getMBinding()).G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rql
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SedentaryFragment.setListener$lambda$2(this.f32804a, z, iSwitchButton);
            }
        });
        ((gi6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: sql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SedentaryFragment.setListener$lambda$3(this.f33892a, view);
            }
        });
        ((gi6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: tql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SedentaryFragment.setListener$lambda$4(this.f34947a, view);
            }
        });
        ((gi6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: uql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SedentaryFragment.setListener$lambda$5(this.f36037a, view);
            }
        });
        ((gi6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: vql
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SedentaryFragment.setListener$lambda$6(this.f37140a, view);
            }
        });
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(@Nullable st9 info) {
        hideLoading();
        if (info != null) {
            setInfo(info);
            return;
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_hint_unkonwn_error);
        }
    }
}
