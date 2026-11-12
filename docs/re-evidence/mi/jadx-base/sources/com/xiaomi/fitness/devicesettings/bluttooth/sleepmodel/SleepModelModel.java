package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010-\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "value", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "sleepModelData", "getSleepModelData", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "setSleepModelData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "loadComplete", "Landroidx/databinding/ObservableBoolean;", "getLoadComplete", "()Landroidx/databinding/ObservableBoolean;", "supportSyncMiuiSleepModel", "getSupportSyncMiuiSleepModel", "supportSetWakeAlarm", "getSupportSetWakeAlarm", CardUIInfo.KEY_SUBTITILE, "Landroidx/lifecycle/MutableLiveData;", "", "getSubTitle", "()Landroidx/lifecycle/MutableLiveData;", "refreshSubTitle", "", "switchOn", "", "getSwitchOn", "refreshSwitch", "getSwitch", "sleepTimeSelectorText", "getSleepTimeSelectorText", "wakeUpTimeSelectorText", "getWakeUpTimeSelectorText", "refreshTimeSelectorText", "refreshSleepTimeSelectorText", "refreshWakeUpTimeSelectorText", "refreshSubTitleAndSwitch", "setAlarmSwitch", "getSetAlarmSwitch", "refreshSetAlarmSwitch", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepModelModel extends BaseModel {
    private int status;

    @NotNull
    private SleepModelData sleepModelData = SleepModelManager.INSTANCE.initWhileFirst();

    @NotNull
    private final ObservableBoolean loadComplete = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean supportSyncMiuiSleepModel = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean supportSetWakeAlarm = new ObservableBoolean(false);

    @NotNull
    private final MutableLiveData<String> subTitle = new MutableLiveData<>(getSubTitle());

    @NotNull
    private final MutableLiveData<Boolean> switchOn = new MutableLiveData<>(Boolean.valueOf(getSwitch()));

    @NotNull
    private final MutableLiveData<String> sleepTimeSelectorText = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<String> wakeUpTimeSelectorText = new MutableLiveData<>();

    @NotNull
    private final ObservableBoolean setAlarmSwitch = new ObservableBoolean(false);

    private final boolean getSwitch() {
        return DeviceSettingsExportPreference.INSTANCE.getKEY_IS_SYNC_SLEEP_MODEL();
    }

    private final void refreshSetAlarmSwitch() {
        this.setAlarmSwitch.set(this.sleepModelData.getGetupClock() == 1);
    }

    private final void refreshSleepTimeSelectorText() {
        this.sleepTimeSelectorText.postValue(getSleepTimeSelectorText());
    }

    private final void refreshSubTitle() {
        this.subTitle.postValue(getSubTitle());
    }

    private final void refreshSubTitleAndSwitch() {
        refreshSubTitle();
        refreshSwitch();
    }

    private final void refreshSwitch() {
        this.switchOn.postValue(Boolean.valueOf(getSwitch()));
    }

    private final void refreshTimeSelectorText() {
        refreshSleepTimeSelectorText();
        refreshWakeUpTimeSelectorText();
    }

    private final void refreshWakeUpTimeSelectorText() {
        this.wakeUpTimeSelectorText.postValue(getWakeUpTimeSelectorText());
    }

    @NotNull
    public final ObservableBoolean getLoadComplete() {
        return this.loadComplete;
    }

    @NotNull
    public final ObservableBoolean getSetAlarmSwitch() {
        return this.setAlarmSwitch;
    }

    @NotNull
    public final SleepModelData getSleepModelData() {
        return this.sleepModelData;
    }

    @NotNull
    /* JADX INFO: renamed from: getSleepTimeSelectorText, reason: collision with other method in class */
    public final MutableLiveData<String> m272getSleepTimeSelectorText() {
        return this.sleepTimeSelectorText;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: getSubTitle, reason: collision with other method in class */
    public final MutableLiveData<String> m273getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final ObservableBoolean getSupportSetWakeAlarm() {
        return this.supportSetWakeAlarm;
    }

    @NotNull
    public final ObservableBoolean getSupportSyncMiuiSleepModel() {
        return this.supportSyncMiuiSleepModel;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSwitchOn() {
        return this.switchOn;
    }

    @NotNull
    /* JADX INFO: renamed from: getWakeUpTimeSelectorText, reason: collision with other method in class */
    public final MutableLiveData<String> m274getWakeUpTimeSelectorText() {
        return this.wakeUpTimeSelectorText;
    }

    public final void setSleepModelData(@NotNull SleepModelData value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.sleepModelData = value;
        this.supportSyncMiuiSleepModel.set(this.status != 3);
        this.supportSetWakeAlarm.set(value.getGetupClock() != 0);
        refreshSubTitleAndSwitch();
        refreshTimeSelectorText();
        refreshSetAlarmSwitch();
        this.loadComplete.set(true);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    private final String getSleepTimeSelectorText() {
        return TimeDateUtil.INSTANCE.getTimeByHourMinute(this.sleepModelData.getSleep_hour(), this.sleepModelData.getSleep_minute());
    }

    private final String getSubTitle() {
        if (!this.supportSyncMiuiSleepModel.get()) {
            return null;
        }
        if (this.status == 2) {
            return ResourceExtKt.getString(wzi.n2);
        }
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        return ResourceExtKt.getString(wzi.X6, timeDateUtil.getTimeByHourMinute(this.sleepModelData.getSleep_hour(), this.sleepModelData.getSleep_minute()), timeDateUtil.getTimeByHourMinute(this.sleepModelData.getWake_hour(), this.sleepModelData.getWake_minute()));
    }

    private final String getWakeUpTimeSelectorText() {
        return TimeDateUtil.INSTANCE.getTimeByHourMinute(this.sleepModelData.getWake_hour(), this.sleepModelData.getWake_minute());
    }
}
