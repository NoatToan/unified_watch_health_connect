package com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/pressure/PressureModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "<init>", "()V", "pressureDetectionSwitch", "Landroidx/lifecycle/MutableLiveData;", "", "getPressureDetectionSwitch", "()Landroidx/lifecycle/MutableLiveData;", "relaxReminderSupport", "getRelaxReminderSupport", "relaxReminderSwitch", "getRelaxReminderSwitch", "setRelaxReminderSupport", "", "support", "onConfigChanged", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureModel extends BaseHuamiHealthMonitorModel {

    @NotNull
    private final MutableLiveData<Boolean> pressureDetectionSwitch;

    @NotNull
    private final MutableLiveData<Boolean> relaxReminderSupport;

    @NotNull
    private final MutableLiveData<Boolean> relaxReminderSwitch;

    public PressureModel() {
        Boolean bool = Boolean.FALSE;
        this.pressureDetectionSwitch = new MutableLiveData<>(bool);
        this.relaxReminderSupport = new MutableLiveData<>(bool);
        this.relaxReminderSwitch = new MutableLiveData<>(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> getPressureDetectionSwitch() {
        return this.pressureDetectionSwitch;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRelaxReminderSupport() {
        return this.relaxReminderSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRelaxReminderSwitch() {
        return this.relaxReminderSwitch;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel
    public void onConfigChanged(@NotNull HRDetect config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.pressureDetectionSwitch.postValue(Boolean.valueOf(config.isPressureEnable()));
        this.relaxReminderSwitch.postValue(Boolean.valueOf(config.isRelaxReminder()));
    }

    public final void setRelaxReminderSupport(boolean support) {
        this.relaxReminderSupport.postValue(Boolean.valueOf(support));
    }
}
