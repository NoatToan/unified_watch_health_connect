package com.xiaomi.fitness.devicesettings.base.stand;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.devicesettings.base.stand.StandDetectSettingFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.ii6;
import defpackage.wzi;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006R\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/stand/StandDetectSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/stand/StandDetectViewModel;", "Lii6;", "", "loadSettings", "()V", "requestAlarmPermission", "", "isStart", "isNap", "selectTime", "(ZZ)V", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "infoView", "", "hour", "minute", "updateTimeText", "(Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;II)V", "open", "updateViewState", "(Z)V", "updateNapTimeState", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", LifecycleConstantKt.ON_RESUME, "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StandDetectSettingFragment extends Hilt_StandDetectSettingFragment<StandDetectViewModel, ii6> {

    @NotNull
    public static final String TAG = "StandDetectFragment";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ StandDetectViewModel access$getMViewModel(StandDetectSettingFragment standDetectSettingFragment) {
        return (StandDetectViewModel) standDetectSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadSettings() {
        FragmentActivity mActivity = getMActivity();
        boolean standReminderEnable = (mActivity == null || !AlarmManagerExtKt.canScheduleExactAlarms(mActivity)) ? false : ((StandDetectViewModel) getMViewModel()).getStandReminderEnable();
        FragmentActivity mActivity2 = getMActivity();
        boolean standDetectNapEnable = (mActivity2 == null || !AlarmManagerExtKt.canScheduleExactAlarms(mActivity2)) ? false : ((StandDetectViewModel) getMViewModel()).getStandDetectNapEnable();
        if (!standReminderEnable) {
            ((StandDetectViewModel) getMViewModel()).setStandReminderEnable(false);
        }
        if (!standDetectNapEnable) {
            StandDetectViewModel.setStandDetectNapEnable$default((StandDetectViewModel) getMViewModel(), false, false, 2, null);
        }
        ((ii6) getMBinding()).E.setSwitch(standReminderEnable);
        ((ii6) getMBinding()).C.setSwitch(standDetectNapEnable);
        updateNapTimeState(standDetectNapEnable);
        updateViewState(standReminderEnable);
        int[] remindTime = ((StandDetectViewModel) getMViewModel()).getRemindTime();
        int i = remindTime[0];
        int i2 = remindTime[1];
        RightArrowTwoLineTextView standDetectStart = ((ii6) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(standDetectStart, "standDetectStart");
        updateTimeText(standDetectStart, i / 100, i % 100);
        RightArrowTwoLineTextView standDetectEnd = ((ii6) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(standDetectEnd, "standDetectEnd");
        updateTimeText(standDetectEnd, i2 / 100, i2 % 100);
        int[] standDetectNapTime = ((StandDetectViewModel) getMViewModel()).getStandDetectNapTime();
        int i3 = standDetectNapTime[0];
        int i4 = standDetectNapTime[1];
        RightArrowTwoLineTextView napStart = ((ii6) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(napStart, "napStart");
        updateTimeText(napStart, i3 / 100, i3 % 100);
        RightArrowTwoLineTextView napEnd = ((ii6) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(napEnd, "napEnd");
        updateTimeText(napEnd, i4 / 100, i4 % 100);
    }

    private final void requestAlarmPermission() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NotificationPermission.requestAlarmPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, wzi.a8, false, new Function1() { // from class: y9o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandDetectSettingFragment.requestAlarmPermission$lambda$10(this.f39966a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestAlarmPermission$lambda$10(StandDetectSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(true);
            this$0.updateViewState(true);
        } else {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandDetectNapEnable(false, false);
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(false);
            this$0.updateViewState(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectTime(final boolean isStart, final boolean isNap) {
        int[] standDetectNapTime = isNap ? ((StandDetectViewModel) getMViewModel()).getStandDetectNapTime() : ((StandDetectViewModel) getMViewModel()).getRemindTime();
        int i = isStart ? standDetectNapTime[0] : standDetectNapTime[1];
        final TimePickerDialog currentMinute = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.Ia : wzi.Ha).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true).setCurrentHour(i / 100).setCurrentMinute(i % 100);
        if (!isNap) {
            currentMinute.setMinSpinnerVisible(8);
        }
        currentMinute.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.stand.StandDetectSettingFragment.selectTime.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    StandDetectSettingFragment.access$getMViewModel(StandDetectSettingFragment.this).updateSettingTime(isStart, isNap, currentMinute.getCurrentHour(), currentMinute.getCurrentMinute());
                    StandDetectSettingFragment.this.loadSettings();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(final StandDetectSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandDetectNapEnable(false, false);
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(false);
            this$0.updateViewState(false);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        boolean zCanScheduleExactAlarms = mActivity != null ? AlarmManagerExtKt.canScheduleExactAlarms(mActivity) : false;
        FragmentActivity mActivity2 = this$0.getMActivity();
        boolean zPostNotificationPermissionGranted = mActivity2 != null ? NotificationPermission.INSTANCE.postNotificationPermissionGranted(mActivity2) : false;
        if (zCanScheduleExactAlarms && zPostNotificationPermissionGranted) {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(true);
            this$0.updateViewState(true);
            return;
        }
        final Function0 function0 = new Function0() { // from class: w9o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StandDetectSettingFragment.setListener$lambda$4$lambda$2(this.f37746a);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity activity = this$0.getActivity();
        String string = this$0.getString(wzi.a8);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, activity, string, 1, false, new Function1() { // from class: x9o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandDetectSettingFragment.setListener$lambda$4$lambda$3(function0, this$0, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(this$0.getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$2(final StandDetectSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String string = this$0.getString(wzi.a8);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        NotificationPermission.requestPostNotificationPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, string, false, new Function1() { // from class: p9o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StandDetectSettingFragment.setListener$lambda$4$lambda$2$lambda$1(this.f30153a, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$4$lambda$2$lambda$1(StandDetectSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        } else {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandDetectNapEnable(false, false);
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(false);
            this$0.updateViewState(false);
            IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, "android.permission.POST_NOTIFICATIONS", fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: v9o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StandDetectSettingFragment.setListener$lambda$4$lambda$2$lambda$1$lambda$0();
                }
            }, 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$4$lambda$2$lambda$1$lambda$0() {
        NotificationPermission.INSTANCE.goNotifySettingPage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$4$lambda$3(Function0 requestPermission, StandDetectSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            requestPermission.invoke();
        } else {
            ((StandDetectViewModel) this$0.getMViewModel()).setStandDetectNapEnable(false, false);
            ((StandDetectViewModel) this$0.getMViewModel()).setStandReminderEnable(false);
            this$0.updateViewState(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(StandDetectSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StandDetectViewModel.setStandDetectNapEnable$default((StandDetectViewModel) this$0.getMViewModel(), z, false, 2, null);
        this$0.updateNapTimeState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(StandDetectSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((StandDetectViewModel) this$0.getMViewModel()).getStandReminderEnable()) {
            this$0.selectTime(true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$7(StandDetectSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((StandDetectViewModel) this$0.getMViewModel()).getStandReminderEnable()) {
            this$0.selectTime(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$8(StandDetectSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((StandDetectViewModel) this$0.getMViewModel()).getStandDetectNapEnable()) {
            this$0.selectTime(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$9(StandDetectSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((StandDetectViewModel) this$0.getMViewModel()).getStandDetectNapEnable()) {
            this$0.selectTime(false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateNapTimeState(boolean open) {
        if (open) {
            ((ii6) getMBinding()).B.setEnabled(true);
            ((ii6) getMBinding()).A.setEnabled(true);
        } else {
            ((ii6) getMBinding()).B.setEnabled(false);
            ((ii6) getMBinding()).A.setEnabled(false);
        }
    }

    private final void updateTimeText(RightArrowTwoLineTextView infoView, int hour, int minute) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hour), Integer.valueOf(minute)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        infoView.setRemindText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateViewState(boolean open) {
        ((ii6) getMBinding()).E.setSwitch(open);
        if (open) {
            ((ii6) getMBinding()).F.setEnabled(true);
            ((ii6) getMBinding()).D.setEnabled(true);
            ((ii6) getMBinding()).C.setEnable(true);
        } else {
            ((ii6) getMBinding()).F.setEnabled(false);
            ((ii6) getMBinding()).D.setEnabled(false);
            ((ii6) getMBinding()).C.setSwitch(false);
            ((ii6) getMBinding()).C.setEnable(false);
        }
        updateNapTimeState(open);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return eui.x0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        loadSettings();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.a8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((ii6) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: o9o
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                StandDetectSettingFragment.setListener$lambda$4(this.f28903a, z, iSwitchButton);
            }
        });
        ((ii6) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: q9o
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                StandDetectSettingFragment.setListener$lambda$5(this.f31264a, z, iSwitchButton);
            }
        });
        ((ii6) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: r9o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StandDetectSettingFragment.setListener$lambda$6(this.f32336a, view);
            }
        });
        ((ii6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: s9o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StandDetectSettingFragment.setListener$lambda$7(this.f33435a, view);
            }
        });
        ((ii6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: t9o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StandDetectSettingFragment.setListener$lambda$8(this.f34479a, view);
            }
        });
        ((ii6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: u9o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StandDetectSettingFragment.setListener$lambda$9(this.f35551a, view);
            }
        });
    }
}
