package com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.onetrack.c.q;
import defpackage.qyi;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\f\u0010\u0010\u001a\u00020\n*\u00020\u000fH\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/Spo2Model;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "<init>", "()V", "spo2DetectionEnable", "Landroidx/lifecycle/MutableLiveData;", "", "getSpo2DetectionEnable", "()Landroidx/lifecycle/MutableLiveData;", "hypoxemiaReminderValue", "", "getHypoxemiaReminderValue", "onConfigChanged", "", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "getHypoxemiaNoticeValueStr", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Spo2Model extends BaseHuamiHealthMonitorModel {

    @NotNull
    private final MutableLiveData<Boolean> spo2DetectionEnable = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    private final MutableLiveData<String> hypoxemiaReminderValue = new MutableLiveData<>("");

    private final String getHypoxemiaNoticeValueStr(HRDetect hRDetect) {
        if (hRDetect.isLowSpo2WarningEnable()) {
            return ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.m, hRDetect.getLowSpo2WarningValue(), Integer.valueOf(hRDetect.getLowSpo2WarningValue()));
        }
        String string = ApplicationExtKt.getApplication().getString(wzi.q3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final MutableLiveData<String> getHypoxemiaReminderValue() {
        return this.hypoxemiaReminderValue;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSpo2DetectionEnable() {
        return this.spo2DetectionEnable;
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel
    public void onConfigChanged(@NotNull HRDetect config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.spo2DetectionEnable.postValue(Boolean.valueOf(config.isSpo2Enable()));
        this.hypoxemiaReminderValue.postValue(getHypoxemiaNoticeValueStr(config));
    }
}
