package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.view.BleSleepSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel.BleSleepSettingViewModel;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.ag6;
import defpackage.eui;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u0015J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/sleep/view/BleSleepSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/sleep/viewmodel/BleSleepSettingViewModel;", "Lag6;", "", "checked", "isDetect", "", "setSleepBreathSwitch", "(ZZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "status", "onLoadStatusChanged", "(I)V", "onVisible", "()V", "onInvisible", "", "mBleSleepSettingFragmentVisibleTime", "J", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BleSleepSettingFragment extends Hilt_BleSleepSettingFragment<BleSleepSettingViewModel, ag6> {
    private long mBleSleepSettingFragmentVisibleTime;

    public BleSleepSettingFragment() {
        super(eui.U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$1(final BleSleepSettingFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else if (z) {
            BaseHealthMonitorFragment.showAlertDialog$default(this$0, wzi.h0, wzi.g0, 0, 0, new Function0() { // from class: rt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BleSleepSettingFragment.onViewCreated$lambda$1$lambda$0(this.f32882a, z);
                }
            }, null, 44, null);
        } else {
            ((BleSleepSettingViewModel) this$0.getMViewModel()).setAssistSleepSwitch(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1$lambda$0(BleSleepSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BleSleepSettingViewModel) this$0.getMViewModel()).setAssistSleepSwitch(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(BleSleepSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            setSleepBreathSwitch$default(this$0, z, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(BleSleepSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.setSleepBreathSwitch(z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSleepBreathSwitch(final boolean checked, final boolean isDetect) {
        if (!checked) {
            ((BleSleepSettingViewModel) getMViewModel()).setSleepBreathSwitch(checked, isDetect);
            return;
        }
        int i = wzi.I8;
        int i2 = isDetect ? wzi.g3 : wzi.f3;
        Function0 function0 = new Function0() { // from class: st2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BleSleepSettingFragment.setSleepBreathSwitch$lambda$4(this.f33961a, checked, isDetect);
            }
        };
        Function0 function1 = new Function0() { // from class: tt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showEnsureDialog(i, i2, function0, function1, parentFragmentManager);
    }

    public static /* synthetic */ void setSleepBreathSwitch$default(BleSleepSettingFragment bleSleepSettingFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        bleSleepSettingFragment.setSleepBreathSwitch(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setSleepBreathSwitch$lambda$4(BleSleepSettingFragment this$0, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BleSleepSettingViewModel) this$0.getMViewModel()).setSleepBreathSwitch(z, z2);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mBleSleepSettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "sleep_setting_detail_page", "title", getString(wzi.k7), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mBleSleepSettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment
    public void onLoadStatusChanged(int status) {
        if (status == 4) {
            ToastUtil.showShortToast(wzi.y4);
        } else {
            super.onLoadStatusChanged(status);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.k7);
        ((BleSleepSettingViewModel) getMViewModel()).loadAssistSleepSwitch();
        ((ag6) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ut2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleSleepSettingFragment.onViewCreated$lambda$1(this.f36109a, z, iSwitchButton);
            }
        });
        ((ag6) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: vt2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleSleepSettingFragment.onViewCreated$lambda$2(this.f37200a, z, iSwitchButton);
            }
        });
        ((ag6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: wt2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleSleepSettingFragment.onViewCreated$lambda$3(this.f38329a, z, iSwitchButton);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBleSleepSettingFragmentVisibleTime = System.currentTimeMillis();
    }
}
