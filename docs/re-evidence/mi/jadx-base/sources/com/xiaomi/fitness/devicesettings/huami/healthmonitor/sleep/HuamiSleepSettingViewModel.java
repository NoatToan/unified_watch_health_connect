package com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HRDetectExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/sleep/HuamiSleepSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/sleep/SleepModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "setSleepDetectionSwitch", "switch", "", "setSleepBreathDetectionSwitch", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiSleepSettingViewModel extends BaseHuamiHealthMonitorViewModel<SleepModel> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSleepBreathDetectionSwitch$lambda$3(HuamiSleepSettingViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        boolean zEnableOsa = deviceModel != null ? DeviceModelExtKt.enableOsa(deviceModel, z) : false;
        this$0.getMConfig().setSleepBreathQualityEnable(z);
        Logger.i(this$0.getTAG(), "setSleepBreathDetectionSwitch(" + z + ") result:" + zEnableOsa);
        return zEnableOsa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSleepDetectionSwitch$lambda$1(HuamiSleepSettingViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HRDetectExtKt.setSleepDetectionSwitch(this$0.getMConfig(), z);
        boolean zSyncMode = this$0.syncMode();
        Logger.i(this$0.getTAG(), "setSleepDetectionSwitch(" + z + ") result:" + zSyncMode);
        return zSyncMode;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel, com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        MutableLiveData<Boolean> sleepBreathDetectionSupport = getMModel().getSleepBreathDetectionSupport();
        WearableDeviceModel deviceModel = getDeviceModel();
        boolean z = false;
        if (deviceModel != null && !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(deviceModel)) {
            z = true;
        }
        sleepBreathDetectionSupport.postValue(Boolean.valueOf(z));
    }

    public final void setSleepBreathDetectionSwitch(final boolean z) {
        syncModelConfig(new Function0() { // from class: vlc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiSleepSettingViewModel.setSleepBreathDetectionSwitch$lambda$3(this.f37002a, z));
            }
        });
    }

    public final void setSleepDetectionSwitch(final boolean z) {
        syncModelConfig(new Function0() { // from class: ulc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiSleepSettingViewModel.setSleepDetectionSwitch$lambda$1(this.f35905a, z));
            }
        });
    }
}
