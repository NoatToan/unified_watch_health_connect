package com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure;

import android.os.Bundle;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/pressure/HuamiPressureSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/pressure/PressureModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "enablePressure", "enable", "", "enableRelax", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiPressureSettingViewModel extends BaseHuamiHealthMonitorViewModel<PressureModel> {
    public HuamiPressureSettingViewModel() {
        getType().postValue(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enablePressure$lambda$1(HuamiPressureSettingViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        boolean zEnablePressure = deviceModel != null ? DeviceModelExtKt.enablePressure(deviceModel, z) : false;
        if (zEnablePressure) {
            this$0.getMConfig().setPressureEnable(z);
        }
        Logger.i(this$0.getTAG(), "syncPressureDetection(" + z + ") result:" + zEnablePressure);
        AnyExtKt.main$default(null, new HuamiPressureSettingViewModel$enablePressure$1$1$1(z, null), 1, null);
        return zEnablePressure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enableRelax$lambda$3(HuamiPressureSettingViewModel this$0, boolean z) {
        HuamiApiCaller huamiDevice;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        boolean zEnableRelax = (deviceModel == null || (huamiDevice = DeviceModelExtKt.getHuamiDevice(deviceModel)) == null) ? false : huamiDevice.enableRelax(z);
        if (zEnableRelax) {
            this$0.getMConfig().setRelaxReminder(z);
        }
        Logger.i(this$0.getTAG(), "setRelaxReminderSwitch(" + z + ") result:" + zEnableRelax);
        return zEnableRelax;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel, com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        PressureModel mModel = getMModel();
        WearableDeviceModel deviceModel = getDeviceModel();
        mModel.setRelaxReminderSupport(deviceModel != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(deviceModel) : false);
    }

    public final void enablePressure(final boolean enable) {
        syncModelConfig(new Function0() { // from class: ilc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiPressureSettingViewModel.enablePressure$lambda$1(this.f21268a, enable));
            }
        });
    }

    public final void enableRelax(final boolean enable) {
        syncModelConfig(new Function0() { // from class: jlc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiPressureSettingViewModel.enableRelax$lambda$3(this.f22904a, enable));
            }
        });
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel
    @NotNull
    public String getTAG() {
        return "HuamiPressureSettingViewModel";
    }
}
