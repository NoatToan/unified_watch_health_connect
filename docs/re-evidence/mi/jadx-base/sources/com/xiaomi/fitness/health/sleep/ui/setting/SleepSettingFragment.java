package com.xiaomi.fitness.health.sleep.ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.NotificationPermission;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.dialog.HourMinutePickerDialog;
import com.xiaomi.fitness.common.extensions.AlarmManagerExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.util.RemindTextConverter;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.util.UtilsKt;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.ewb;
import defpackage.jui;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0006R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseSpringBackBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel;", "Lewb;", "", "checkPermission", "()V", "requestAlarmPermission", "enableSleepTrace", "goToSleepSnoreDetectionSettingPage", "goToDeepShallowSleepDetectionSettingPage", "", "status", "onLoadStatusChanged", "(I)V", "getToastMsgRes", "(I)Ljava/lang/Integer;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer$delegate", "Lkotlin/Lazy;", "getMSleepTracer", "()Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer", "", SleepSettingFragment.KEY_ORIGIN_ASSIST_GUIDE, "Z", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepSettingFragment extends Hilt_SleepSettingFragment<SleepSettingViewModel, ewb> {

    @NotNull
    public static final String KEY_ORIGIN_ASSIST_GUIDE = "originAssistGuide";

    /* JADX INFO: renamed from: mSleepTracer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTracer;
    private boolean originAssistGuide;

    public SleepSettingFragment() {
        super(jui.T3, cv1.f14764b);
        this.mSleepTracer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hxm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepSettingFragment.mSleepTracer_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepSettingViewModel access$getMViewModel(SleepSettingFragment sleepSettingFragment) {
        return (SleepSettingViewModel) sleepSettingFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkPermission() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && AlarmManagerExtKt.canScheduleExactAlarms(mActivity)) {
            enableSleepTrace();
            ((ewb) getMBinding()).G.setSwitch(true);
            return;
        }
        ((ewb) getMBinding()).G.setSwitch(false);
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity activity = getActivity();
        String string = getString(c0j.ef);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog notifyAlarmGuideDialogForSingleFunction$default = NotificationPermission.getNotifyAlarmGuideDialogForSingleFunction$default(notificationPermission, activity, string, 3, false, new Function1() { // from class: jxm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSettingFragment.checkPermission$lambda$13(this.f23225a, ((Boolean) obj).booleanValue());
            }
        }, 8, null);
        if (notifyAlarmGuideDialogForSingleFunction$default != null) {
            notifyAlarmGuideDialogForSingleFunction$default.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$13(SleepSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.requestAlarmPermission();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void enableSleepTrace() {
        ((SleepSettingViewModel) getMViewModel()).getMModel().getSleepTraceEnabled().set(true);
        getMSleepTracer().setEnable(true);
        ((SleepSettingViewModel) getMViewModel()).setDeepLightSleepDetectEnable(true);
        ((SleepSettingViewModel) getMViewModel()).setSleepSnoreDetectionEnable(false);
        RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView = ((ewb) getMBinding()).B;
        RemindTextConverter remindTextConverter = RemindTextConverter.INSTANCE;
        rightArrowBindingTwoLineTextView.setRemindText(remindTextConverter.getRemindTextWithAudioRecordPermCheckIfNeed(true, false));
        ((ewb) getMBinding()).D.setRemindText(remindTextConverter.getRemindTextWithAudioRecordPermCheckIfNeed(false, true));
    }

    private final SleepTracer getMSleepTracer() {
        return (SleepTracer) this.mSleepTracer.getValue();
    }

    private final Integer getToastMsgRes(int status) {
        if (status == 2) {
            return null;
        }
        if (status == 3) {
            return Integer.valueOf(c0j.common_hint_unkonwn_error);
        }
        if (status == 4) {
            return Integer.valueOf(c0j.f4801r);
        }
        if (status != 5) {
            return status != 6 ? Integer.valueOf(c0j.common_hint_unkonwn_error) : Integer.valueOf(c0j.th);
        }
        return Integer.valueOf(c0j.common_set_error);
    }

    private final void goToDeepShallowSleepDetectionSettingPage() {
        startActivity(new Intent(getContext(), (Class<?>) DeepShallowSleepDetectionSettingActivity.class));
    }

    private final void goToSleepSnoreDetectionSettingPage() {
        startActivity(new Intent(getContext(), (Class<?>) SleepSnoreDetectionSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracer mSleepTracer_delegate$lambda$0() {
        return TraceExtKt.getInstance(SleepTracer.INSTANCE);
    }

    private final void onLoadStatusChanged(int status) {
        if (status == 1) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
            return;
        }
        hideLoading();
        Integer toastMsgRes = getToastMsgRes(status);
        if (toastMsgRes != null) {
            ToastUtil.showShortToast(toastMsgRes.intValue());
        }
    }

    private final void requestAlarmPermission() {
        NotificationPermission notificationPermission = NotificationPermission.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        NotificationPermission.requestAlarmPermissionIfNeed$default(notificationPermission, fragmentActivityRequireActivity, c0j.ef, false, new Function1() { // from class: mxm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSettingFragment.requestAlarmPermission$lambda$14(this.f27320a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestAlarmPermission$lambda$14(SleepSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.enableSleepTrace();
            ((ewb) this$0.getMBinding()).G.setSwitch(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$10(SleepSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.checkPermission();
            return;
        }
        ((SleepSettingViewModel) this$0.getMViewModel()).getMModel().getSleepTraceEnabled().set(false);
        this$0.getMSleepTracer().setEnable(false);
        ((SleepSettingViewModel) this$0.getMViewModel()).setDeepLightSleepDetectEnable(false);
        ((SleepSettingViewModel) this$0.getMViewModel()).setSleepSnoreDetectionEnable(false);
        ((ewb) this$0.getMBinding()).B.setRemindText("");
        ((ewb) this$0.getMBinding()).D.setRemindText("");
        ToastUtil.showShortToast(c0j.c5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$11(SleepSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToDeepShallowSleepDetectionSettingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$12(SleepSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToSleepSnoreDetectionSettingPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(SleepSettingFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onLoadStatusChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$3(SleepSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ewb) this$0.getMBinding()).B.setRemindText(RemindTextConverter.INSTANCE.getRemindTextWithAudioRecordPermCheckIfNeed(((SleepSettingViewModel) this$0.getMViewModel()).getDeepLightDetectEnable(), false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(final SleepSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepSettingItemClick(3);
        final HourMinutePickerDialog hourMinutePickerDialogCreate = new HourMinutePickerDialog.a("hm").setCustomLayoutId(jui.f7).setDialogTitle(c0j.E6).setDialogDescription(c0j.xk).setPositiveText(c0j.e).setNegativeText(c0j.c).create();
        Pair<Integer, Integer> curSleepGoal = ((SleepSettingViewModel) this$0.getMViewModel()).getCurSleepGoal();
        SleepSettingModel.Companion companion = SleepSettingModel.INSTANCE;
        hourMinutePickerDialogCreate.setHourRange(companion.getSLEEP_GOAL_HOUR_INTERVAL());
        hourMinutePickerDialogCreate.setMinuteData(companion.getSLEEP_GOAL_MINUTE_INTERVAL());
        hourMinutePickerDialogCreate.setValue(curSleepGoal.getFirst().intValue(), curSleepGoal.getSecond().intValue());
        hourMinutePickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment$setListener$3$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    SleepSettingFragment.access$getMViewModel(this.this$0).setSleepGoal(hourMinutePickerDialogCreate.getHourValue(), hourMinutePickerDialogCreate.getMinuteValue());
                }
            }
        });
        hourMinutePickerDialogCreate.showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(final SleepSettingFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper sleepTrackHelper = SleepTrackHelper.INSTANCE;
        sleepTrackHelper.trackSleepSettingItemClick(1);
        iSwitchButton.setChecked(!z);
        if (!UtilsKt.isDeviceConnection()) {
            ToastUtil.showShortToast(c0j.f4801r);
            return;
        }
        if (!z) {
            ((SleepSettingViewModel) this$0.getMViewModel()).setAssistSleepSwitch(z);
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("alert").setDialogTitle(c0j.Lc).setDialogDescription(c0j.Kc).setPositiveText(c0j.e).setNegativeText(c0j.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment$setListener$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    SleepSettingFragment.access$getMViewModel(this.this$0).setAssistSleepSwitch(z);
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
        if (this$0.originAssistGuide) {
            sleepTrackHelper.trackOpenAssistSuccessByGuide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(final SleepSettingFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        SleepTrackHelper.INSTANCE.trackSleepSettingItemClick(2);
        if (!UtilsKt.isDeviceConnection()) {
            ToastUtil.showShortToast(c0j.f4801r);
        } else {
            if (!z) {
                SleepSettingViewModel.setSleepBreathSwitch$default((SleepSettingViewModel) this$0.getMViewModel(), z, false, 2, null);
                return;
            }
            CommonDialog commonDialogCreate = new CommonDialog.c("ensure").setCancelable(false).setDialogTitle(c0j.Oc).setDialogDescription(c0j.Nc).setPositiveText(c0j.e).setNegativeText(c0j.c).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment$setListener$5$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which != -2) {
                        if (which == -1) {
                            SleepSettingViewModel.setSleepBreathSwitch$default(SleepSettingFragment.access$getMViewModel(this.this$0), z, false, 2, null);
                        }
                    } else if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$9(final SleepSettingFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        SleepTrackHelper.INSTANCE.trackSleepSettingItemClick(4);
        if (!UtilsKt.isDeviceConnection()) {
            ToastUtil.showShortToast(c0j.f4801r);
            return;
        }
        if (!z) {
            ((SleepSettingViewModel) this$0.getMViewModel()).setSleepBreathSwitch(z, false);
            return;
        }
        int i = c0j.Oc;
        int i2 = c0j.Mc;
        int i3 = c0j.e;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, parentFragmentManager, c0j.c, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: kxm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSettingFragment.setListener$lambda$9$lambda$7(this.f24400a, z, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: lxm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSettingFragment.setListener$lambda$9$lambda$8((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$9$lambda$7(SleepSettingFragment this$0, boolean z, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((SleepSettingViewModel) this$0.getMViewModel()).setSleepBreathSwitch(z, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$9$lambda$8(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.ak);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.originAssistGuide = arguments.getBoolean(KEY_ORIGIN_ASSIST_GUIDE, false);
        }
        ((SleepSettingViewModel) getMViewModel()).loadSleepSettingConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        SleepSettingViewModel sleepSettingViewModel = (SleepSettingViewModel) getMViewModel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        sleepSettingViewModel.observerLoadStatus(viewLifecycleOwner, new Observer() { // from class: nxm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepSettingFragment.setListener$lambda$2(this.f28549a, ((Integer) obj).intValue());
            }
        });
        ((SleepSettingViewModel) getMViewModel()).getDeepLightDetectEnableLiveData().observe(getViewLifecycleOwner(), new SleepSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: oxm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSettingFragment.setListener$lambda$3(this.f29793a, (Boolean) obj);
            }
        }));
        ((ewb) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: pxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSettingFragment.setListener$lambda$4(this.f30883a, view);
            }
        });
        ((ewb) getMBinding()).E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: qxm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepSettingFragment.setListener$lambda$5(this.f31942a, z, iSwitchButton);
            }
        });
        if (((ewb) getMBinding()).C.getVisibility() == 0) {
            ((ewb) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rxm
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    SleepSettingFragment.setListener$lambda$6(this.f33041a, z, iSwitchButton);
                }
            });
        }
        ((ewb) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: sxm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepSettingFragment.setListener$lambda$9(this.f34089a, z, iSwitchButton);
            }
        });
        boolean zIsEnable = getMSleepTracer().isEnable();
        StringBuilder sb = new StringBuilder();
        sb.append("setListener: ");
        sb.append(zIsEnable);
        ((ewb) getMBinding()).G.setSwitch(getMSleepTracer().isEnable());
        if (!getMSleepTracer().isEnable()) {
            ((SleepSettingViewModel) getMViewModel()).setDeepLightSleepDetectEnable(false);
            ((SleepSettingViewModel) getMViewModel()).setSleepSnoreDetectionEnable(false);
            ((ewb) getMBinding()).B.setRemindText("");
            ((ewb) getMBinding()).D.setRemindText("");
        }
        Logger.d("SleepSettingFragment " + getMSleepTracer().isEnable(), new Object[0]);
        ((ewb) getMBinding()).G.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: txm
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepSettingFragment.setListener$lambda$10(this.f35165a, z, iSwitchButton);
            }
        });
        ((ewb) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: uxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSettingFragment.setListener$lambda$11(this.f36258a, view);
            }
        });
        ((ewb) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: ixm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSettingFragment.setListener$lambda$12(this.f22203a, view);
            }
        });
    }
}
