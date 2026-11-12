package com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure;

import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingFragment;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.eui;
import defpackage.mh6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/pressure/HuamiPressureSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/pressure/HuamiPressureSettingViewModel;", "Lmh6;", "", "checked", "", "enablePressure", "(Z)V", "setListener", "()V", "onVisible", "onInvisible", "", "mHuamiPressureSettingFragmentVisibleTime", "J", "", "getTitle", "()Ljava/lang/String;", "title", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuamiPressureSettingFragment extends Hilt_HuamiPressureSettingFragment<HuamiPressureSettingViewModel, mh6> {
    private long mHuamiPressureSettingFragmentVisibleTime;

    /* JADX WARN: Multi-variable type inference failed */
    private final void enablePressure(final boolean checked) {
        if (!checked) {
            ((HuamiPressureSettingViewModel) getMViewModel()).enablePressure(checked);
            return;
        }
        int i = wzi.I8;
        int i2 = wzi.c3;
        Function0 function0 = new Function0() { // from class: dlc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiPressureSettingFragment.enablePressure$lambda$2(this.f15654a, checked);
            }
        };
        Function0 function1 = new Function0() { // from class: elc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showEnsureDialog(i, i2, function0, function1, parentFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit enablePressure$lambda$2(HuamiPressureSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((HuamiPressureSettingViewModel) this$0.getMViewModel()).enablePressure(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(HuamiPressureSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.enablePressure(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$1(HuamiPressureSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!UtilsKt.isDeviceNotConnection()) {
            ((HuamiPressureSettingViewModel) this$0.getMViewModel()).enableRelax(z);
        } else {
            iSwitchButton.setChecked(!z);
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.n0;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorFragment
    @NotNull
    public String getTitle() {
        String string = ApplicationExtKt.getApplication().getString(wzi.m6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mHuamiPressureSettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "pressure_setting_detail_page", "title", getString(wzi.m6), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHuamiPressureSettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mHuamiPressureSettingFragmentVisibleTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((mh6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: flc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HuamiPressureSettingFragment.setListener$lambda$0(this.f17894a, z, iSwitchButton);
            }
        });
        ((mh6) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: glc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HuamiPressureSettingFragment.setListener$lambda$1(this.f19102a, z, iSwitchButton);
            }
        });
    }
}
