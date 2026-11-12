package com.xiaomi.fitness.devicesettings.huami.alarmnotify;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneFragment;
import com.xiaomi.fitness.devicesettings.common.extensions.ContextExtKt;
import com.xiaomi.fitness.devicesettings.huami.alarmnotify.HuaMiAlarmNotifyFragment;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManager;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmNotifyEnabled;
import com.xiaomi.fitness.widget.button.BaseSwitchButton;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.ih6;
import defpackage.wzi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b0\u0010\u0014J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\nJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/alarmnotify/HuaMiAlarmNotifyFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/alarmnotify/HuaMiAlarmNotifyViewModel;", "Lih6;", "", "isDeviceConnected", "()Z", "enable", "", "setAlarmAlertEnable", "(Z)V", "isUnlockScreenSet", "bindDataToView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "visible", "()V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device$delegate", "Lkotlin/Lazy;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "miBleDeviceManager", "Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "getMiBleDeviceManager", "()Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;", "setMiBleDeviceManager", "(Lcom/xiaomi/fitness/mijia/sdk/MiBleDeviceManager;)V", "immediateAlertAlarmEnabled", "Ljava/lang/Boolean;", "getImmediateAlertAlarmEnabled", "()Ljava/lang/Boolean;", "setImmediateAlertAlarmEnabled", "(Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onCheckedChangeCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiAlarmNotifyFragment extends BaseBindingFragment<HuaMiAlarmNotifyViewModel, ih6> {

    @Nullable
    private MiBleDeviceManager miBleDeviceManager;

    /* JADX INFO: renamed from: device$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy device = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: khc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiAlarmNotifyFragment.device_delegate$lambda$0();
        }
    });

    @Nullable
    private Boolean immediateAlertAlarmEnabled = Boolean.FALSE;

    @NotNull
    private final ISwitchButton.a onCheckedChangeCallback = new ISwitchButton.a() { // from class: lhc
        @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
        public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
            HuaMiAlarmNotifyFragment.onCheckedChangeCallback$lambda$3(this.f25074a, z, iSwitchButton);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindDataToView(boolean enable) {
        BaseSwitchButton.j(getMBinding().A.getSwitch(), enable, this.onCheckedChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel device_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) this.device.getValue();
    }

    private final boolean isDeviceConnected() {
        WearableDeviceModel device = getDevice();
        Intrinsics.checkNotNull(device);
        if (device.getIsDeviceConnected()) {
            return true;
        }
        Context context = getContext();
        if (context == null) {
            return false;
        }
        ToastExtKt.toastShort(context, wzi.u);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isUnlockScreenSet() {
        if (!((HuaMiAlarmNotifyViewModel) getMViewModel()).hasScreenLockPwd(getActivity())) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (Settings.Secure.getInt(activity != null ? activity.getContentResolver() : null, "bluetooth_unlock_status", 0) == 0) {
            return false;
        }
        FragmentActivity activity2 = getActivity();
        String string = Settings.Secure.getString(activity2 != null ? activity2.getContentResolver() : null, "bluetooth_address_to_unlock");
        WearableDeviceModel device = getDevice();
        return Intrinsics.areEqual(string, device != null ? DeviceModelExtKt.getMac(device) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCheckedChangeCallback$lambda$3(final HuaMiAlarmNotifyFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isDeviceConnected()) {
            this$0.bindDataToView(!z);
            return;
        }
        if (!z) {
            this$0.setAlarmAlertEnable(false);
        } else if (this$0.isUnlockScreenSet()) {
            this$0.setAlarmAlertEnable(true);
        } else {
            new CommonDialog.c("turn on unlock phone").setDialogTitle(wzi.d2).setDialogDescription(wzi.c6).setCancelable(false).setPositiveText(wzi.b6).setNegativeText(wzi.U5).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.alarmnotify.HuaMiAlarmNotifyFragment$onCheckedChangeCallback$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        this.this$0.bindDataToView(false);
                    } else {
                        if (which != -1) {
                            return;
                        }
                        Context context = this.this$0.getContext();
                        if (context != null) {
                            ContextExtKt.gotoPage(context, UnlockPhoneFragment.class, null);
                        }
                        this.this$0.bindDataToView(false);
                    }
                }

                @Override // defpackage.av6
                public void onDialogEvent(String dialogName, DialogInterface dialog, int what) {
                    super.onDialogEvent(dialogName, dialog, what);
                    if (what == 3) {
                        HuaMiAlarmNotifyFragment huaMiAlarmNotifyFragment = this.this$0;
                        Boolean immediateAlertAlarmEnabled = huaMiAlarmNotifyFragment.getImmediateAlertAlarmEnabled();
                        huaMiAlarmNotifyFragment.bindDataToView(immediateAlertAlarmEnabled != null ? immediateAlertAlarmEnabled.booleanValue() : false);
                    }
                }
            }).showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAlarmAlertEnable(boolean enable) {
        MiBleDeviceManager miBleDeviceManager;
        if (getDevice() == null || (miBleDeviceManager = this.miBleDeviceManager) == null) {
            return;
        }
        WearableDeviceModel device = getDevice();
        Intrinsics.checkNotNull(device);
        boolean settings = miBleDeviceManager.setSettings(DeviceModelExtKt.getMac(device), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED, enable);
        Logger.d("MiBleDeviceManager setAlertAlarmResult " + enable + ": " + settings, new Object[0]);
        if (settings) {
            this.immediateAlertAlarmEnabled = Boolean.valueOf(enable);
            AlarmNotifyEnabled alarmNotifyEnabled = new AlarmNotifyEnabled();
            alarmNotifyEnabled.setEnable(enable);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel device2 = getDevice();
            Intrinsics.checkNotNull(device2);
            companion.sendSettingItem(device2.getDid(), DeviceSettingConfigKey.KEY_ALARM_NOTIFY_ENABLED, alarmNotifyEnabled);
        }
    }

    @Nullable
    public final Boolean getImmediateAlertAlarmEnabled() {
        return this.immediateAlertAlarmEnabled;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.l0;
    }

    @Nullable
    public final MiBleDeviceManager getMiBleDeviceManager() {
        return this.miBleDeviceManager;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MiBleDeviceManager miBleDeviceManager = this.miBleDeviceManager;
        if (miBleDeviceManager != null) {
            miBleDeviceManager.close();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.L);
        if (getDevice() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        this.miBleDeviceManager = activity != null ? MiBleDeviceManager.INSTANCE.createManager(activity, new MiBleDeviceManagerListener() { // from class: com.xiaomi.fitness.devicesettings.huami.alarmnotify.HuaMiAlarmNotifyFragment$onViewCreated$1$1
            @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
            public void onDestroy() {
                Logger.d("MiBleDeviceManager onDestroy ", new Object[0]);
                this.this$0.setMiBleDeviceManager(null);
            }

            @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
            public void onInit(MiBleDeviceManager manager) {
                Intrinsics.checkNotNullParameter(manager, "manager");
                try {
                    HuaMiAlarmNotifyFragment huaMiAlarmNotifyFragment = this.this$0;
                    WearableDeviceModel device = huaMiAlarmNotifyFragment.getDevice();
                    Intrinsics.checkNotNull(device);
                    huaMiAlarmNotifyFragment.setImmediateAlertAlarmEnabled(Boolean.valueOf(manager.getSettingsBoolean(DeviceModelExtKt.getMac(device), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED)));
                    Logger.d("MiBleDeviceManager alarmEnabled : " + this.this$0.getImmediateAlertAlarmEnabled(), new Object[0]);
                    if (!this.this$0.isUnlockScreenSet()) {
                        this.this$0.bindDataToView(false);
                        this.this$0.setAlarmAlertEnable(false);
                    } else {
                        HuaMiAlarmNotifyFragment huaMiAlarmNotifyFragment2 = this.this$0;
                        Boolean immediateAlertAlarmEnabled = huaMiAlarmNotifyFragment2.getImmediateAlertAlarmEnabled();
                        huaMiAlarmNotifyFragment2.bindDataToView(immediateAlertAlarmEnabled != null ? immediateAlertAlarmEnabled.booleanValue() : false);
                    }
                } catch (Exception unused) {
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, wzi.common_not_support);
                    }
                    FragmentActivity activity2 = this.this$0.getActivity();
                    if (activity2 != null) {
                        activity2.lambda$onCreate$0();
                    }
                }
            }
        }) : null;
    }

    public final void setImmediateAlertAlarmEnabled(@Nullable Boolean bool) {
        this.immediateAlertAlarmEnabled = bool;
    }

    public final void setMiBleDeviceManager(@Nullable MiBleDeviceManager miBleDeviceManager) {
        this.miBleDeviceManager = miBleDeviceManager;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void visible() {
        Boolean bool;
        super.visible();
        if (isUnlockScreenSet() || (bool = this.immediateAlertAlarmEnabled) == null || !bool.booleanValue()) {
            return;
        }
        bindDataToView(false);
        setAlarmAlertEnable(false);
    }
}
