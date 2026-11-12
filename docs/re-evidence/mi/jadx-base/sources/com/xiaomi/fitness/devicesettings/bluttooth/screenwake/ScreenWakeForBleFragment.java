package com.xiaomi.fitness.devicesettings.bluttooth.screenwake;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.screenwake.WristScreenResult;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.av6;
import defpackage.eui;
import defpackage.ffp;
import defpackage.lhi;
import defpackage.oe6;
import defpackage.wzi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B\u0007¢\u0006\u0004\b<\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u000eJ!\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010\u000eR\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010*R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*R\u001c\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/screenwake/ScreenWakeForBleFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/screenwake/ScreenWakeForBleViewModel;", "Loe6;", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "info", "", "setInfo", "(Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;)V", "", "state", "updateModeView", "(I)V", "updateSensitiveView", "()V", "hour", "minute", "setEndTime", "(II)V", "setStartTime", "reqInfo", "", "isStart", "updateTimeView", "(ZII)V", "startAndStopIsSameToday", "()Z", "alertWristSensitive", "selectTime", "(Z)V", "updateTimeValue", DeviceSettingConfigKey.KEY_SELECT_MODE, "syncInfo", "initActionBar", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "mStartHour", "I", "mStartMin", "mEndHour", "mEndMin", "mMode", "mSensitivity", "mStartHourCal", "mStartMinCal", "mEndHourCal", "mEndMinCal", "mModeCal", "", "", "MODES_STR", "[Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ScreenWakeForBleFragment extends BaseLoadableBindingFragment<ScreenWakeForBleViewModel, oe6> {

    @NotNull
    private static final String TAG = "ScreenWakeForBleFragment";
    private String[] MODES_STR;
    private int mSensitivity;
    private int mStartHour = 8;
    private int mEndHour = 22;
    private int mMode = 1;
    private int mStartHourCal = 8;
    private int mStartMin;
    private int mStartMinCal = this.mStartMin;
    private int mEndHourCal = 22;
    private int mEndMin;
    private int mEndMinCal = this.mEndMin;
    private int mModeCal = 1;

    private final void alertWristSensitive() {
        String string = getString(wzi.Ca);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.Ea);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.Ba).setItems(new String[]{string, string2}).setItemsCheckedIndex(this.mSensitivity == 1 ? 0 : 1).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleFragment.alertWristSensitive.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                ScreenWakeForBleFragment.this.mSensitivity = which == 0 ? 1 : 2;
                ScreenWakeForBleFragment.this.syncInfo();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void initActionBar() {
        setTitle(wzi.Aa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ScreenWakeForBleFragment this$0, WristScreenResult wristScreenResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (wristScreenResult.getLiftWristBrightView() != null) {
            LiftWristBrightView liftWristBrightView = wristScreenResult.getLiftWristBrightView();
            Intrinsics.checkNotNull(liftWristBrightView);
            this$0.setInfo(liftWristBrightView);
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.Ra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ScreenWakeForBleFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null || num.intValue() != 0) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, (num != null && num.intValue() == 1) ? wzi.Ra : wzi.common_set_error);
                return;
            }
            return;
        }
        this$0.mStartMin = this$0.mStartMinCal;
        this$0.mStartHour = this$0.mStartHourCal;
        this$0.mEndMin = this$0.mEndMinCal;
        this$0.mEndHour = this$0.mEndHourCal;
        int i = this$0.mModeCal;
        this$0.mMode = i;
        this$0.updateModeView(i);
        this$0.updateTimeView(true, this$0.mStartHour, this$0.mStartMin);
        this$0.updateTimeView(false, this$0.mEndHour, this$0.mEndMin);
        this$0.updateSensitiveView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void reqInfo() {
        ((ScreenWakeForBleViewModel) getMViewModel()).getWristScreenInfo();
    }

    private final void selectMode() {
        CommonDialog.c dialogTitle = new CommonDialog.c("commonDialog").setDialogTitle(wzi.Aa);
        String[] strArr = this.MODES_STR;
        if (strArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MODES_STR");
            strArr = null;
        }
        dialogTitle.setItems(strArr).setItemsCheckedIndex(this.mMode).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleFragment.selectMode.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                ScreenWakeForBleFragment.this.mModeCal = which;
                if (which == 0) {
                    ScreenWakeForBleFragment.this.mStartHourCal = 8;
                    ScreenWakeForBleFragment.this.mStartMinCal = 0;
                    ScreenWakeForBleFragment.this.mEndHourCal = 22;
                    ScreenWakeForBleFragment.this.mEndMinCal = 0;
                }
                ScreenWakeForBleFragment.this.syncInfo();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void selectTime(final boolean isStart) {
        final TimePickerDialog currentMinute = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.Ia : wzi.Ha).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true).setCurrentHour(isStart ? this.mStartHour : this.mEndHour).setCurrentMinute(isStart ? this.mStartMin : this.mEndMin);
        currentMinute.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleFragment.selectTime.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    this.updateTimeValue(isStart, currentMinute.getCurrentHour(), currentMinute.getCurrentMinute());
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    private final void setEndTime(int hour, int minute) {
        this.mEndHour = hour;
        this.mEndHourCal = hour;
        this.mEndMin = minute;
        this.mEndMinCal = minute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setInfo(LiftWristBrightView info) {
        Logger.i("screen_wake", " get info = " + info);
        if (info.isEnable()) {
            if (info.isAllday()) {
                this.mMode = 0;
                this.mModeCal = 0;
            } else {
                this.mMode = 1;
                this.mModeCal = 1;
            }
            if (info.getSensitivity() == 0) {
                ((oe6) getMBinding()).E.setVisibility(8);
            } else {
                ((oe6) getMBinding()).E.setVisibility(0);
                this.mSensitivity = info.getSensitivity();
                updateSensitiveView();
            }
        } else {
            if (info.getSensitivity() == 0) {
                ((oe6) getMBinding()).E.setVisibility(8);
            } else {
                ((oe6) getMBinding()).E.setVisibility(0);
                this.mSensitivity = info.getSensitivity();
                updateSensitiveView();
            }
            this.mMode = 2;
            this.mModeCal = 2;
        }
        int start = info.getStart() / 60;
        int start2 = info.getStart() - (start * 60);
        this.mStartHourCal = start;
        this.mStartMinCal = start2;
        updateTimeView(true, start, start2);
        setStartTime(start, start2);
        int stop = info.getStop() / 60;
        int stop2 = info.getStop() - (stop * 60);
        this.mEndHourCal = stop;
        this.mEndMinCal = stop2;
        updateTimeView(false, stop, stop2);
        setEndTime(stop, stop2);
        updateModeView(this.mMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(ScreenWakeForBleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(ScreenWakeForBleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectTime(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(ScreenWakeForBleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectTime(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(ScreenWakeForBleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertWristSensitive();
    }

    private final void setStartTime(int hour, int minute) {
        this.mStartHour = hour;
        this.mStartHourCal = hour;
        this.mStartMin = minute;
        this.mStartMinCal = minute;
    }

    private final boolean startAndStopIsSameToday() {
        int i = this.mEndHourCal;
        int i2 = this.mStartHourCal;
        if (i > i2) {
            return true;
        }
        return i == i2 && this.mEndMinCal > this.mStartMinCal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncInfo() {
        ((ScreenWakeForBleViewModel) getMViewModel()).setWristScreenInfo(this.mModeCal, this.mStartHourCal, this.mStartMinCal, this.mEndHourCal, this.mEndMinCal, this.mSensitivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateModeView(int state) {
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((oe6) getMBinding()).D;
        String[] strArr = this.MODES_STR;
        if (strArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("MODES_STR");
            strArr = null;
        }
        rightArrowTwoLineTextView.setRemindText(strArr[state]);
        ((oe6) getMBinding()).E.setEnabled(state != 2);
        if (state == 1) {
            ((oe6) getMBinding()).C.setEnabled(true);
            ((oe6) getMBinding()).A.setEnabled(true);
        } else {
            ((oe6) getMBinding()).C.setEnabled(false);
            ((oe6) getMBinding()).A.setEnabled(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSensitiveView() {
        String string = getString(this.mSensitivity == 1 ? wzi.Ca : wzi.Da);
        Intrinsics.checkNotNull(string);
        ((oe6) getMBinding()).E.setRemindText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimeValue(boolean isStart, int hour, int minute) {
        this.mStartMinCal = this.mStartMin;
        this.mStartHourCal = this.mStartHour;
        this.mEndMinCal = this.mEndMin;
        this.mEndHourCal = this.mEndHour;
        if (isStart) {
            this.mStartHourCal = hour;
            this.mStartMinCal = minute;
        } else {
            this.mEndHourCal = hour;
            this.mEndMinCal = minute;
        }
        if (ffp.a(this.mStartHourCal, this.mStartMinCal, this.mEndHourCal, this.mEndMinCal) < 3600000) {
            if (isStart) {
                this.mEndHourCal = (this.mStartHourCal + 1) % 24;
                this.mEndMinCal = this.mStartMinCal;
            } else {
                this.mStartHourCal = (this.mEndHourCal + 23) % 24;
                this.mStartMinCal = this.mEndMinCal;
            }
        }
        syncInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateTimeView(boolean isStart, int hour, int minute) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hour), Integer.valueOf(minute)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (isStart) {
            ((oe6) getMBinding()).C.setRemindText(str);
            return;
        }
        if (!startAndStopIsSameToday()) {
            str = getString(wzi.S5) + " " + str;
        }
        ((oe6) getMBinding()).A.setRemindText(str);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.MODES_STR = getResources().getStringArray(lhi.n);
        initActionBar();
        ((ScreenWakeForBleViewModel) getMViewModel()).getMInfoData().observe(getViewLifecycleOwner(), new Observer() { // from class: ihl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ScreenWakeForBleFragment.onViewCreated$lambda$0(this.f21153a, (WristScreenResult) obj);
            }
        });
        ((ScreenWakeForBleViewModel) getMViewModel()).getMResultData().observe(getViewLifecycleOwner(), new Observer() { // from class: jhl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ScreenWakeForBleFragment.onViewCreated$lambda$1(this.f22813a, (Integer) obj);
            }
        });
        reqInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((oe6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: khl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForBleFragment.setListener$lambda$2(this.f23854a, view);
            }
        });
        ((oe6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: lhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForBleFragment.setListener$lambda$3(this.f25083a, view);
            }
        });
        ((oe6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: mhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForBleFragment.setListener$lambda$4(this.f26193a, view);
            }
        });
        ((oe6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: nhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForBleFragment.setListener$lambda$5(this.f27942a, view);
            }
        });
    }
}
