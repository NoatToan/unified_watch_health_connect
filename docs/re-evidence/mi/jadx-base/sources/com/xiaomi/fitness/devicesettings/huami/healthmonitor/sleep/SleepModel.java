package com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HRDetectExtKt;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/sleep/SleepModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "<init>", "()V", "sleepDetectionSwitch", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getSleepDetectionSwitch", "()Landroidx/lifecycle/MutableLiveData;", "sleepBreathDetectionSupport", "getSleepBreathDetectionSupport", "sleepBreathDetectionSwitch", "getSleepBreathDetectionSwitch", "onConfigChanged", "", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepModel extends BaseHuamiHealthMonitorModel {

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathDetectionSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathDetectionSwitch;

    @NotNull
    private final MutableLiveData<Boolean> sleepDetectionSwitch;

    public SleepModel() {
        Boolean bool = Boolean.FALSE;
        this.sleepDetectionSwitch = new MutableLiveData<>(bool);
        this.sleepBreathDetectionSupport = new MutableLiveData<>(bool);
        this.sleepBreathDetectionSwitch = new MutableLiveData<>(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathDetectionSupport() {
        return this.sleepBreathDetectionSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathDetectionSwitch() {
        return this.sleepBreathDetectionSwitch;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepDetectionSwitch() {
        return this.sleepDetectionSwitch;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel
    public void onConfigChanged(@NotNull HRDetect config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.sleepDetectionSwitch.postValue(Boolean.valueOf(HRDetectExtKt.isSleepAIDSDetectionEnable(config)));
        this.sleepBreathDetectionSwitch.postValue(Boolean.valueOf(config.isSleepBreathQualityEnable()));
    }
}
