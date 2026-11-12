package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SetScheduleFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SetScheduleViewModel;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.kba;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b2\u0010\"J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u00101\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SetScheduleFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SetScheduleViewModel;", "Lkba;", "", "isChecked", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "switchButton", "", "onCheckChanged", "(ZLcom/xiaomi/fitness/widget/button/ISwitchButton;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "sleepModelData", "", "status", "refreshScheduleStatus", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;I)V", "handleViewByStatus", "isSleep", "setTimeZone", "(Z)V", TSMAuthContants.PARAM_RESOURCE, "updateSleepModel", "code", "showToast", "(I)V", "setSyncSleepModel", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "goSetPhoneSchedule", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "syncPhoneSchedule", "Lcom/xiaomi/fitness/widget/SwitchButtonSingleLineTextView;", "sleepTimeSelector", "wakeupTimeSelector", "customizeSchedule", "hasGotoSetting", "Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SetScheduleFragment extends BaseBindingFragment<SetScheduleViewModel, kba> {
    private SwitchButtonSingleLineTextView customizeSchedule;
    private RightArrowSingleLineTextView goSetPhoneSchedule;
    private boolean hasGotoSetting;

    @Nullable
    private SleepModelData sleepModelData;
    private RightArrowSingleLineTextView sleepTimeSelector;
    private SwitchButtonSingleLineTextView syncPhoneSchedule;
    private RightArrowSingleLineTextView wakeupTimeSelector;

    private final void handleViewByStatus(SleepModelData sleepModelData, int status) {
        if (sleepModelData == null) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.j8);
                return;
            }
            return;
        }
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        String timeByHourMinute = timeDateUtil.getTimeByHourMinute(sleepModelData.getSleep_hour(), sleepModelData.getSleep_minute());
        String timeByHourMinute2 = timeDateUtil.getTimeByHourMinute(sleepModelData.getWake_hour(), sleepModelData.getWake_minute());
        boolean key_is_sync_sleep_model = DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL();
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView = null;
        RightArrowSingleLineTextView rightArrowSingleLineTextView = null;
        RightArrowSingleLineTextView rightArrowSingleLineTextView2 = null;
        if (status == 1) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView3 = this.goSetPhoneSchedule;
            if (rightArrowSingleLineTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goSetPhoneSchedule");
                rightArrowSingleLineTextView3 = null;
            }
            rightArrowSingleLineTextView3.setVisibility(8);
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = this.customizeSchedule;
            if (switchButtonSingleLineTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
                switchButtonSingleLineTextView2 = null;
            }
            switchButtonSingleLineTextView2.setVisibility(8);
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView3 = this.syncPhoneSchedule;
            if (switchButtonSingleLineTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
                switchButtonSingleLineTextView3 = null;
            }
            switchButtonSingleLineTextView3.setVisibility(0);
            RightArrowSingleLineTextView rightArrowSingleLineTextView4 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView4 = null;
            }
            rightArrowSingleLineTextView4.setVisibility(8);
            RightArrowSingleLineTextView rightArrowSingleLineTextView5 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                rightArrowSingleLineTextView5 = null;
            }
            rightArrowSingleLineTextView5.setVisibility(8);
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView4 = this.syncPhoneSchedule;
            if (switchButtonSingleLineTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
            } else {
                switchButtonSingleLineTextView = switchButtonSingleLineTextView4;
            }
            switchButtonSingleLineTextView.setSwitch(key_is_sync_sleep_model);
            return;
        }
        if (status == 2) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView6 = this.goSetPhoneSchedule;
            if (rightArrowSingleLineTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goSetPhoneSchedule");
                rightArrowSingleLineTextView6 = null;
            }
            rightArrowSingleLineTextView6.setVisibility(0);
            RightArrowSingleLineTextView rightArrowSingleLineTextView7 = this.goSetPhoneSchedule;
            if (rightArrowSingleLineTextView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goSetPhoneSchedule");
                rightArrowSingleLineTextView7 = null;
            }
            rightArrowSingleLineTextView7.setRemindText(getString(wzi.a2));
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView5 = this.customizeSchedule;
            if (switchButtonSingleLineTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
                switchButtonSingleLineTextView5 = null;
            }
            switchButtonSingleLineTextView5.setVisibility(8);
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView6 = this.syncPhoneSchedule;
            if (switchButtonSingleLineTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
                switchButtonSingleLineTextView6 = null;
            }
            switchButtonSingleLineTextView6.setVisibility(8);
            RightArrowSingleLineTextView rightArrowSingleLineTextView8 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView8 = null;
            }
            rightArrowSingleLineTextView8.setVisibility(8);
            RightArrowSingleLineTextView rightArrowSingleLineTextView9 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
            } else {
                rightArrowSingleLineTextView2 = rightArrowSingleLineTextView9;
            }
            rightArrowSingleLineTextView2.setVisibility(8);
            return;
        }
        if (status != 3) {
            return;
        }
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView7 = this.customizeSchedule;
        if (switchButtonSingleLineTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
            switchButtonSingleLineTextView7 = null;
        }
        switchButtonSingleLineTextView7.setVisibility(0);
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView8 = this.customizeSchedule;
        if (switchButtonSingleLineTextView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
            switchButtonSingleLineTextView8 = null;
        }
        switchButtonSingleLineTextView8.setSwitch(key_is_sync_sleep_model);
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView9 = this.customizeSchedule;
        if (switchButtonSingleLineTextView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
            switchButtonSingleLineTextView9 = null;
        }
        if (switchButtonSingleLineTextView9.getSwitch()) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView10 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView10 = null;
            }
            rightArrowSingleLineTextView10.setVisibility(0);
            RightArrowSingleLineTextView rightArrowSingleLineTextView11 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                rightArrowSingleLineTextView11 = null;
            }
            rightArrowSingleLineTextView11.setVisibility(0);
            RightArrowSingleLineTextView rightArrowSingleLineTextView12 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView12 = null;
            }
            rightArrowSingleLineTextView12.setRemindText(timeByHourMinute);
            RightArrowSingleLineTextView rightArrowSingleLineTextView13 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                rightArrowSingleLineTextView13 = null;
            }
            rightArrowSingleLineTextView13.setRemindText(timeByHourMinute2);
        } else {
            RightArrowSingleLineTextView rightArrowSingleLineTextView14 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView14 = null;
            }
            rightArrowSingleLineTextView14.setVisibility(8);
            RightArrowSingleLineTextView rightArrowSingleLineTextView15 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                rightArrowSingleLineTextView15 = null;
            }
            rightArrowSingleLineTextView15.setVisibility(8);
        }
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView10 = this.syncPhoneSchedule;
        if (switchButtonSingleLineTextView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
            switchButtonSingleLineTextView10 = null;
        }
        switchButtonSingleLineTextView10.setVisibility(8);
        RightArrowSingleLineTextView rightArrowSingleLineTextView16 = this.goSetPhoneSchedule;
        if (rightArrowSingleLineTextView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goSetPhoneSchedule");
        } else {
            rightArrowSingleLineTextView = rightArrowSingleLineTextView16;
        }
        rightArrowSingleLineTextView.setVisibility(8);
    }

    private final void onCheckChanged(boolean isChecked, ISwitchButton switchButton) {
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView = this.customizeSchedule;
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = null;
        RightArrowSingleLineTextView rightArrowSingleLineTextView = null;
        RightArrowSingleLineTextView rightArrowSingleLineTextView2 = null;
        if (switchButtonSingleLineTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
            switchButtonSingleLineTextView = null;
        }
        if (switchButton != switchButtonSingleLineTextView.getSwitchButton()) {
            SwitchButtonSingleLineTextView switchButtonSingleLineTextView3 = this.syncPhoneSchedule;
            if (switchButtonSingleLineTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
            } else {
                switchButtonSingleLineTextView2 = switchButtonSingleLineTextView3;
            }
            if (switchButton == switchButtonSingleLineTextView2.getSwitchButton()) {
                if (isChecked) {
                    updateSleepModel(this.sleepModelData, 1);
                } else {
                    updateSleepModel(this.sleepModelData, 0);
                }
            }
        } else if (isChecked) {
            RightArrowSingleLineTextView rightArrowSingleLineTextView3 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView3 = null;
            }
            rightArrowSingleLineTextView3.setVisibility(0);
            RightArrowSingleLineTextView rightArrowSingleLineTextView4 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                rightArrowSingleLineTextView4 = null;
            }
            rightArrowSingleLineTextView4.setVisibility(0);
            TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
            SleepModelData sleepModelData = this.sleepModelData;
            Intrinsics.checkNotNull(sleepModelData);
            int sleep_hour = sleepModelData.getSleep_hour();
            SleepModelData sleepModelData2 = this.sleepModelData;
            Intrinsics.checkNotNull(sleepModelData2);
            String timeByHourMinute = timeDateUtil.getTimeByHourMinute(sleep_hour, sleepModelData2.getSleep_minute());
            SleepModelData sleepModelData3 = this.sleepModelData;
            Intrinsics.checkNotNull(sleepModelData3);
            int wake_hour = sleepModelData3.getWake_hour();
            SleepModelData sleepModelData4 = this.sleepModelData;
            Intrinsics.checkNotNull(sleepModelData4);
            String timeByHourMinute2 = timeDateUtil.getTimeByHourMinute(wake_hour, sleepModelData4.getWake_minute());
            RightArrowSingleLineTextView rightArrowSingleLineTextView5 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView5 = null;
            }
            rightArrowSingleLineTextView5.setRemindText(timeByHourMinute);
            RightArrowSingleLineTextView rightArrowSingleLineTextView6 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
            } else {
                rightArrowSingleLineTextView = rightArrowSingleLineTextView6;
            }
            rightArrowSingleLineTextView.setRemindText(timeByHourMinute2);
            updateSleepModel(this.sleepModelData, 2);
        } else {
            RightArrowSingleLineTextView rightArrowSingleLineTextView7 = this.sleepTimeSelector;
            if (rightArrowSingleLineTextView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                rightArrowSingleLineTextView7 = null;
            }
            rightArrowSingleLineTextView7.setVisibility(8);
            RightArrowSingleLineTextView rightArrowSingleLineTextView8 = this.wakeupTimeSelector;
            if (rightArrowSingleLineTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
            } else {
                rightArrowSingleLineTextView2 = rightArrowSingleLineTextView8;
            }
            rightArrowSingleLineTextView2.setVisibility(8);
            updateSleepModel(this.sleepModelData, 0);
        }
        setSyncSleepModel(isChecked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(SetScheduleFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateSleepModel(this$0.sleepModelData, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SetScheduleFragment this$0, SetScheduleViewModel.LoadSleepModelData loadSleepModelData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new SetScheduleFragment$onViewCreated$1$1(this$0, loadSleepModelData, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(SetScheduleFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.showToast(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SetScheduleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.setAction("com.android.deskclock.BEDTIME_MANAGE");
        this$0.startActivity(intent);
        this$0.hasGotoSetting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(SetScheduleFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(iSwitchButton);
        this$0.onCheckChanged(z, iSwitchButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(SetScheduleFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(iSwitchButton);
        this$0.onCheckChanged(z, iSwitchButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(SetScheduleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTimeZone(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(SetScheduleFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTimeZone(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshScheduleStatus(SleepModelData sleepModelData, int status) {
        this.sleepModelData = sleepModelData;
        handleViewByStatus(sleepModelData, status);
    }

    private final void setSyncSleepModel(boolean isChecked) {
        DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(isChecked);
    }

    private final void setTimeZone(final boolean isSleep) {
        final TimePickerDialog timePickerDialogCreate = TimePickerDialog.INSTANCE.defaultBuilder("sleep model time picker").setDialogTitle(isSleep ? wzi.l7 : wzi.i9).setCancelable(false).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        SleepModelData sleepModelData = this.sleepModelData;
        Intrinsics.checkNotNull(sleepModelData);
        timePickerDialogCreate.setCurrentHour(isSleep ? sleepModelData.getSleep_hour() : sleepModelData.getWake_hour());
        SleepModelData sleepModelData2 = this.sleepModelData;
        Intrinsics.checkNotNull(sleepModelData2);
        timePickerDialogCreate.setCurrentMinute(isSleep ? sleepModelData2.getSleep_minute() : sleepModelData2.getWake_minute());
        timePickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SetScheduleFragment.setTimeZone.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                RightArrowSingleLineTextView rightArrowSingleLineTextView = null;
                if (isSleep) {
                    SleepModelData sleepModelData3 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData3);
                    sleepModelData3.setSleep_hour(timePickerDialogCreate.getCurrentHour());
                    SleepModelData sleepModelData4 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData4);
                    sleepModelData4.setSleep_minute(timePickerDialogCreate.getCurrentMinute());
                    RightArrowSingleLineTextView rightArrowSingleLineTextView2 = this.sleepTimeSelector;
                    if (rightArrowSingleLineTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
                    } else {
                        rightArrowSingleLineTextView = rightArrowSingleLineTextView2;
                    }
                    TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
                    SleepModelData sleepModelData5 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData5);
                    int sleep_hour = sleepModelData5.getSleep_hour();
                    SleepModelData sleepModelData6 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData6);
                    rightArrowSingleLineTextView.setRemindText(timeDateUtil.getTimeByHourMinute(sleep_hour, sleepModelData6.getSleep_minute()));
                } else {
                    SleepModelData sleepModelData7 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData7);
                    sleepModelData7.setWake_hour(timePickerDialogCreate.getCurrentHour());
                    SleepModelData sleepModelData8 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData8);
                    sleepModelData8.setWake_minute(timePickerDialogCreate.getCurrentMinute());
                    RightArrowSingleLineTextView rightArrowSingleLineTextView3 = this.wakeupTimeSelector;
                    if (rightArrowSingleLineTextView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
                    } else {
                        rightArrowSingleLineTextView = rightArrowSingleLineTextView3;
                    }
                    TimeDateUtil timeDateUtil2 = TimeDateUtil.INSTANCE;
                    SleepModelData sleepModelData9 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData9);
                    int wake_hour = sleepModelData9.getWake_hour();
                    SleepModelData sleepModelData10 = this.sleepModelData;
                    Intrinsics.checkNotNull(sleepModelData10);
                    rightArrowSingleLineTextView.setRemindText(timeDateUtil2.getTimeByHourMinute(wake_hour, sleepModelData10.getWake_minute()));
                }
                SetScheduleFragment setScheduleFragment = this;
                setScheduleFragment.updateSleepModel(setScheduleFragment.sleepModelData, 2);
            }
        });
        timePickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showToast(int code) {
        if (code == 0) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
                return;
            }
            return;
        }
        if (code != 1) {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.i2);
                return;
            }
            return;
        }
        Context context3 = getContext();
        if (context3 != null) {
            ToastExtKt.toastShort(context3, wzi.y4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSleepModel(SleepModelData sleepModelData, int resource) {
        if (sleepModelData == null) {
            return;
        }
        ((SetScheduleViewModel) getMViewModel()).updateSleepModelData(sleepModelData, resource);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.y2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() throws Throwable {
        super.onResume();
        showLoading();
        if (!this.hasGotoSetting) {
            ((SetScheduleViewModel) getMViewModel()).loadSleepModelData();
        } else {
            this.hasGotoSetting = false;
            ((SetScheduleViewModel) getMViewModel()).loadFromMiui(new Function0() { // from class: fzl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SetScheduleFragment.onResume$lambda$7(this.f18399a);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.goSetPhoneSchedule = getMBinding().B;
        this.syncPhoneSchedule = getMBinding().D;
        this.sleepTimeSelector = getMBinding().C;
        this.wakeupTimeSelector = getMBinding().E;
        this.customizeSchedule = getMBinding().A;
        ((SetScheduleViewModel) getMViewModel()).getLoadSleepModelData().observe(getViewLifecycleOwner(), new SetScheduleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gzl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetScheduleFragment.onViewCreated$lambda$0(this.f19501a, (SetScheduleViewModel.LoadSleepModelData) obj);
            }
        }));
        ((SetScheduleViewModel) getMViewModel()).getErrorCode().observe(getViewLifecycleOwner(), new SetScheduleFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hzl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetScheduleFragment.onViewCreated$lambda$1(this.f20627a, (Integer) obj);
            }
        }));
        RightArrowSingleLineTextView rightArrowSingleLineTextView = this.goSetPhoneSchedule;
        RightArrowSingleLineTextView rightArrowSingleLineTextView2 = null;
        if (rightArrowSingleLineTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goSetPhoneSchedule");
            rightArrowSingleLineTextView = null;
        }
        rightArrowSingleLineTextView.setOnClickListener(new View.OnClickListener() { // from class: izl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetScheduleFragment.onViewCreated$lambda$2(this.f22257a, view2);
            }
        });
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView = this.syncPhoneSchedule;
        if (switchButtonSingleLineTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncPhoneSchedule");
            switchButtonSingleLineTextView = null;
        }
        switchButtonSingleLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: jzl
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SetScheduleFragment.onViewCreated$lambda$3(this.f23268a, z, iSwitchButton);
            }
        });
        SwitchButtonSingleLineTextView switchButtonSingleLineTextView2 = this.customizeSchedule;
        if (switchButtonSingleLineTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customizeSchedule");
            switchButtonSingleLineTextView2 = null;
        }
        switchButtonSingleLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: kzl
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SetScheduleFragment.onViewCreated$lambda$4(this.f24453a, z, iSwitchButton);
            }
        });
        RightArrowSingleLineTextView rightArrowSingleLineTextView3 = this.sleepTimeSelector;
        if (rightArrowSingleLineTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepTimeSelector");
            rightArrowSingleLineTextView3 = null;
        }
        rightArrowSingleLineTextView3.setOnClickListener(new View.OnClickListener() { // from class: lzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetScheduleFragment.onViewCreated$lambda$5(this.f25588a, view2);
            }
        });
        RightArrowSingleLineTextView rightArrowSingleLineTextView4 = this.wakeupTimeSelector;
        if (rightArrowSingleLineTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wakeupTimeSelector");
        } else {
            rightArrowSingleLineTextView2 = rightArrowSingleLineTextView4;
        }
        rightArrowSingleLineTextView2.setOnClickListener(new View.OnClickListener() { // from class: mzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SetScheduleFragment.onViewCreated$lambda$6(this.f27383a, view2);
            }
        });
    }
}
