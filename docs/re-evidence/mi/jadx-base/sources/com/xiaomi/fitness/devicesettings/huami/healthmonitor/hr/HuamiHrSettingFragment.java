package com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.kh6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/hr/HuamiHrSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/hr/HuamiHrSettingViewModel;", "Lkh6;", "", "setWarnViews", "()V", "onHeartDetectionViewClicked", "selectHrMode", "onHighWarningViewClicked", "onLowWarningViewClicked", "", "checked", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "switchView", "onAbnormalHeartbeatSwitchChanged", "(ZLcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;)V", "", "index", "syncHeartRateFreq", "(I)V", "syncHighWarning", "syncLowHeartWarning", "success", "onSyncAbnormalHeartbeatFinished", "(Z)V", "showHrViewDisableTips", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "hr", "initViews", "(Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;)V", "setListener", "onVisible", "onInvisible", "", "mHuamiHrSettingFragmentVisibleTime", "J", "", "getTitle", "()Ljava/lang/String;", "title", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuamiHrSettingFragment extends Hilt_HuamiHrSettingFragment<HuamiHrSettingViewModel, kh6> {
    private long mHuamiHrSettingFragmentVisibleTime;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViews$lambda$0(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setWarnViews();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onAbnormalHeartbeatSwitchChanged(final boolean checked, final SwitchButtonTwoLineTextView switchView) {
        if (!((HuamiHrSettingViewModel) getMViewModel()).isDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            switchView.setSwitch(!checked);
            return;
        }
        if (!checked) {
            ((HuamiHrSettingViewModel) getMViewModel()).syncHeartHealthyDetection(checked, new Function1() { // from class: hkc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HuamiHrSettingFragment.onAbnormalHeartbeatSwitchChanged$lambda$9(this.f20162a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        int i = wzi.I8;
        int i2 = wzi.X2;
        Function0 function0 = new Function0() { // from class: fkc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiHrSettingFragment.onAbnormalHeartbeatSwitchChanged$lambda$7(this.f17869a, checked);
            }
        };
        Function0 function1 = new Function0() { // from class: gkc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiHrSettingFragment.onAbnormalHeartbeatSwitchChanged$lambda$8(switchView, checked);
            }
        };
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showEnsureDialog(i, i2, function0, function1, parentFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onAbnormalHeartbeatSwitchChanged$lambda$7(final HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((HuamiHrSettingViewModel) this$0.getMViewModel()).syncHeartHealthyDetection(z, new Function1() { // from class: ekc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiHrSettingFragment.onAbnormalHeartbeatSwitchChanged$lambda$7$lambda$6(this.f16734a, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAbnormalHeartbeatSwitchChanged$lambda$7$lambda$6(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSyncAbnormalHeartbeatFinished(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAbnormalHeartbeatSwitchChanged$lambda$8(SwitchButtonTwoLineTextView switchView, boolean z) {
        Intrinsics.checkNotNullParameter(switchView, "$switchView");
        switchView.setSwitch(!z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAbnormalHeartbeatSwitchChanged$lambda$9(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSyncAbnormalHeartbeatFinished(z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onHeartDetectionViewClicked() {
        if (((HuamiHrSettingViewModel) getMViewModel()).isAbnormalHeartbeatEnable()) {
            showHrViewDisableTips();
        } else {
            selectHrMode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onHighWarningViewClicked() {
        CommonDialog commonDialogCreate = new CommonDialog.c("hr_warning").setDialogTitle(wzi.e3).setCancelable(true).setCanceledOnTouchOutside(true).setItems(((HuamiHrSettingViewModel) getMViewModel()).getWarningIntervalStrs()).setItemsCheckedIndex(((HuamiHrSettingViewModel) getMViewModel()).getCurWarningIntervalPosition()).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment.onHighWarningViewClicked.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                HuamiHrSettingFragment.this.syncHighWarning(which);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onLowWarningViewClicked() {
        CommonDialog commonDialogCreate = new CommonDialog.c("hr_warning").setDialogTitle(wzi.e3).setCancelable(true).setCanceledOnTouchOutside(true).setItems(((HuamiHrSettingViewModel) getMViewModel()).getLowWarningIntervalStrs()).setItemsCheckedIndex(((HuamiHrSettingViewModel) getMViewModel()).getCurLowWarningIntervalPosition()).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment.onLowWarningViewClicked.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                HuamiHrSettingFragment.this.syncLowHeartWarning(which);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSyncAbnormalHeartbeatFinished(boolean success) {
        if (success) {
            ((kh6) getMBinding()).C.setRemindText(((HuamiHrSettingViewModel) getMViewModel()).getCurHeartFreqStr());
            setWarnViews();
        } else {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void selectHrMode() {
        CommonDialog commonDialogCreate = new CommonDialog.c("HrDetection").setDialogTitle(wzi.W2).setCancelable(true).setCanceledOnTouchOutside(true).setItems(((HuamiHrSettingViewModel) getMViewModel()).getHrIntervalStrs()).setItemsCheckedIndex(((HuamiHrSettingViewModel) getMViewModel()).getCurHrIntervalPosition()).create();
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment.selectHrMode.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    HuamiHrSettingFragment.this.syncHeartRateFreq(which);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
        }
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(HuamiHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.onHeartDetectionViewClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(HuamiHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.onHighWarningViewClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(HuamiHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.onLowWarningViewClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(HuamiHrSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        } else {
            SwitchButtonTwoLineTextView activityDetectionView = ((kh6) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(activityDetectionView, "activityDetectionView");
            this$0.onSwitchChanged(z, activityDetectionView, null, ((HuamiHrSettingViewModel) this$0.getMViewModel()).getSyncActiveDetection());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(HuamiHrSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        } else {
            SwitchButtonTwoLineTextView heartHealthyDetectionView = ((kh6) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(heartHealthyDetectionView, "heartHealthyDetectionView");
            this$0.onAbnormalHeartbeatSwitchChanged(z, heartHealthyDetectionView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setWarnViews() {
        ((kh6) getMBinding()).D.setEnable(((HuamiHrSettingViewModel) getMViewModel()).isHighEnable());
        ((kh6) getMBinding()).D.setRemindText(((HuamiHrSettingViewModel) getMViewModel()).getCurWarningIntervalStr());
        ((kh6) getMBinding()).E.setVisibility(((HuamiHrSettingViewModel) getMViewModel()).isSupportLowHrWarning() ? 0 : 8);
        ((kh6) getMBinding()).E.setEnable(((HuamiHrSettingViewModel) getMViewModel()).isLowEnable());
        ((kh6) getMBinding()).E.setRemindText(((HuamiHrSettingViewModel) getMViewModel()).getCurLowWarningIntervalStr());
    }

    private final void showHrViewDisableTips() {
        CommonDialog commonDialogCreate = new CommonDialog.c("HrViewDisable").setCancelable(false).setDialogTitle(wzi.d2).setDialogDescription(wzi.Y2).setPositiveText(wzi.g).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment.showHrViewDisableTips.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncHeartRateFreq(int index) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((HuamiHrSettingViewModel) getMViewModel()).syncHrRateFreq(((HuamiHrSettingViewModel) getMViewModel()).getHrIntervals()[index], new Function1() { // from class: qkc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiHrSettingFragment.syncHeartRateFreq$lambda$10(this.f31599a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit syncHeartRateFreq$lambda$10(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (z) {
            ((kh6) this$0.getMBinding()).C.setRemindText(((HuamiHrSettingViewModel) this$0.getMViewModel()).getCurHeartFreqStr());
            ((kh6) this$0.getMBinding()).B.setSwitch(((HuamiHrSettingViewModel) this$0.getMViewModel()).isAbnormalHeartbeatEnable());
            this$0.setWarnViews();
            return Unit.INSTANCE;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncHighWarning(int index) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        ((HuamiHrSettingViewModel) getMViewModel()).syncWarningInterval(((HuamiHrSettingViewModel) getMViewModel()).getWarningIntervals()[index], new Function1() { // from class: nkc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiHrSettingFragment.syncHighWarning$lambda$11(this.f28009a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit syncHighWarning$lambda$11(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (z) {
            ((kh6) this$0.getMBinding()).D.setRemindText(((HuamiHrSettingViewModel) this$0.getMViewModel()).getCurWarningIntervalStr());
            return Unit.INSTANCE;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void syncLowHeartWarning(int index) {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        ((HuamiHrSettingViewModel) getMViewModel()).syncLowWarningInterval(((HuamiHrSettingViewModel) getMViewModel()).getLowWarningIntervals()[index], new Function1() { // from class: okc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiHrSettingFragment.syncLowHeartWarning$lambda$12(this.f29244a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit syncLowHeartWarning$lambda$12(HuamiHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (z) {
            ((kh6) this$0.getMBinding()).E.setRemindText(((HuamiHrSettingViewModel) this$0.getMViewModel()).getCurLowWarningIntervalStr());
            return Unit.INSTANCE;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.common_set_error);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.m0;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorFragment
    @NotNull
    public String getTitle() {
        String string = getString(wzi.W4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorFragment
    public void initViews(@NotNull HRDetect hr) {
        Intrinsics.checkNotNullParameter(hr, "hr");
        ((HuamiHrSettingViewModel) getMViewModel()).load10SupportHighLow(new Function1() { // from class: pkc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiHrSettingFragment.initViews$lambda$0(this.f30495a, ((Boolean) obj).booleanValue());
            }
        });
        ((kh6) getMBinding()).C.setRemindText(((HuamiHrSettingViewModel) getMViewModel()).getCurHeartFreqStr());
        ((kh6) getMBinding()).A.setVisibility(((HuamiHrSettingViewModel) getMViewModel()).isSupportActiveDetection() ? 0 : 8);
        ((kh6) getMBinding()).A.setSwitch(((HuamiHrSettingViewModel) getMViewModel()).isActiveEnable());
        ((kh6) getMBinding()).B.setSwitch(((HuamiHrSettingViewModel) getMViewModel()).isAbnormalHeartbeatEnable());
        boolean zIsInnerCN = RegionUtil.isInnerCN();
        boolean zIsSupportHrDetection = ((HuamiHrSettingViewModel) getMViewModel()).isSupportHrDetection();
        boolean z = (zIsInnerCN && zIsSupportHrDetection) ? false : true;
        Logger.i("HuamiHrSettingFragment", "isInnerCN:" + zIsInnerCN + " isSupportHrDetection:" + zIsSupportHrDetection + " isGoneHeartHealthyView:" + z);
        if (z) {
            ((kh6) getMBinding()).B.setVisibility(8);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mHuamiHrSettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "heart_rate_setting_detail_page", "title", getString(wzi.W4), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHuamiHrSettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mHuamiHrSettingFragmentVisibleTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((kh6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: ikc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiHrSettingFragment.setListener$lambda$1(this.f21250a, view);
            }
        });
        ((kh6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: jkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiHrSettingFragment.setListener$lambda$2(this.f22890a, view);
            }
        });
        ((kh6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: kkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiHrSettingFragment.setListener$lambda$3(this.f23946a, view);
            }
        });
        ((kh6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: lkc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HuamiHrSettingFragment.setListener$lambda$4(this.f25167a, z, iSwitchButton);
            }
        });
        ((kh6) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: mkc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HuamiHrSettingFragment.setListener$lambda$5(this.f26954a, z, iSwitchButton);
            }
        });
    }
}
